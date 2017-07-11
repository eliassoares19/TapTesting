package elias.app.taptesting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;

/**
 * Created by elias on 25/06/16.
 */
public class TapTestingActivityMain extends AppCompatActivity{
    Button btcomeçar, btinfo;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_tap_testing_main);

        btinfo = (Button)findViewById(R.id.btinfo);
        btcomeçar = (Button)findViewById(R.id.btcomeçar);

        btinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO implementar
            }
        });

        btcomeçar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TapTestingActivity.class);
                startActivity(i);
            }
        });
    }
}
