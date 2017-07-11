package elias.app.taptesting;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.io.IOException;


/**
 * Created by elias on 03/06/16.
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SimpleDataBase dbH = SimpleDataBase.getInstance(getApplicationContext());
        try {
            dbH.createTest_Table(null,0,0,0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        setContentView(R.layout.tela_principal);

        Button b = (Button)findViewById(R.id.bttaptesting);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TapTestingInfo.class);
                startActivity(i);
            }
        });

        Button bm = (Button)findViewById(R.id.btmeem);
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MEEMInfo.class);
                startActivity(i);
            }
        });
        Button btpdq = (Button)findViewById(R.id.btpdq);
        btpdq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Pdq39Info.class);
                startActivity(i);
            }
        });
    }
    public void onBackPressed() {
        AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
        dialogo.setMessage("Tem certeza que quer sair?");
        dialogo.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                finish();
            }
        });

        dialogo.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                //Não faz nada
            }
        });
        dialogo.show();
    }
}
