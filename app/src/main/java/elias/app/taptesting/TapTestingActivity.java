package elias.app.taptesting;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.app.*;
import android.widget.*;
import android.os.CountDownTimer;
import java.util.concurrent.TimeUnit;
/////////////////Acc//////////////////////
import android.hardware.*;
import android.content.*;
import org.w3c.dom.Text;
import java.lang.Math.*;
import java.util.ArrayList;
////////////////////////////////////////

//public class TapTestingActivity extends AppCompatActivity implements SensorEventListener{
public class TapTestingActivity extends AppCompatActivity{

    float G_x, G_y;

    Button bttotal;
    TextView total, accTextVal;
    int conttotal=1;
    Chronometer meu_cronometro;
    boolean isClickPause = true, naoacabou=true;
    long tempoQuandoParado = 0;
    int contTempo=0;
    ////////////////////////////Accelerometer//////////////////////////
    private SensorManager mSensorManager;
    private Sensor mSensor;
    private double accValue;
    ///////////////////////////controle do toque/////////////////////////////////////
    long _endTime;
   // SimpleDataBase dbH = SimpleDataBase.getInstance(getApplicationContext());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tap_testing);

        bttotal = (Button) findViewById(R.id.bttotal);
        total = (TextView) findViewById(R.id.total);
        meu_cronometro = (Chronometer) findViewById(R.id.chronometer);
        ///////////////////////////////////Acceleration////////////////////////////
        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION);
        //mSensorManager.registerListener(this, mSensor, SensorManager.SENSOR_DELAY_UI);
        //accTextVal = (TextView) findViewById(R.id.accVal);
        //////////////////////////////BD///////////////////////////////////////////
        //SQLiteDatabase db = openOrCreateDatabase("TestManager.db",SQLiteDatabase.CREATE_IF_NECESSARY,null);

        final ArrayList<Long> frequency_List = new ArrayList<Long>();

        //////////////////////////////////////////////////////////////////////////////
        meu_cronometro.setText("Restando: ");

        new CountDownTimer(21000, 1000) {
            public void onTick(long millisUntilFinished) {
                meu_cronometro.setText("Restando: " + millisUntilFinished / 1000);
                contTempo++;
            }

            public void onFinish() {
                meu_cronometro.stop();
                conttotal--;
                meu_cronometro.setText("Tempo esgotado!");
                AlertDialog.Builder dialogo = new AlertDialog.Builder(TapTestingActivity.this);
                /*dialogo.setTitle("Resultado: ");
                dialogo.setMessage("Você realizou " + conttotal + " toques em " + contTempo + " segundos");
                dialogo.setNeutralButton("OK", null);
                dialogo.show();*/
                String aux = convert(frequency_List);
                //dbH.insertTaptestisting(aux,conttotal);
                conttotal = 0;

                dialogo.setMessage("Obrigado por realizar o teste TapTesting!");
                dialogo.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                        finish();
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }
                });
                dialogo.show();
            }
        }.start();

        bttotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total.setText("Total: " + conttotal++);
                _endTime = meu_cronometro.getBase();
                frequency_List.add(_endTime);
            }
        });
    }
    //////////////////////////////Accelerometer/////////////////////
    /*@Override
    public void onSensorChanged(SensorEvent event){
        double xSq;
        double ySq;
        double zSq;
        xSq = event.values[0] * event.values[0];
        ySq = event.values[1] * event.values[1];
        zSq = event.values[2] * event.values[2];
        accValue = xSq + ySq + zSq;
        accValue = Math.sqrt(accValue);
        accTextVal.setText("Acelerômetro: " + (int) accValue);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }*/
    //convert arrayList to string
    private String convert(ArrayList<Long> list){
        if(list != null)
        {
            String listString = "";

            for (long l : list)
            {
                listString += String.valueOf(l) + "\n";
            }
            return  listString;
        }
        return null;
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        G_x = event.getX();
        G_y = event.getY();

        return super.onTouchEvent(event);
    }
}