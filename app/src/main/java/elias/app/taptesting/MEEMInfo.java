package elias.app.taptesting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by elias on 07/07/16.
 */
public class MEEMInfo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_meem_info);

        Button btIniciarMeem = (Button)findViewById(R.id.btIniciarMeem);
        btIniciarMeem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent i = new Intent(getApplicationContext(), MEEMActivity.class);
                startActivity(i);
            }
        });
    }
}