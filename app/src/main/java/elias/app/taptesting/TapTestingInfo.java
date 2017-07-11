package elias.app.taptesting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by elias on 07/07/16.
 */
public class TapTestingInfo extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_tap_testing_info);

        Button btIniciarTap = (Button)findViewById(R.id.btIniciarTap);
        btIniciarTap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent i = new Intent(getApplicationContext(), TapTestingActivity.class);
                startActivity(i);
            }
        });
    }
}
