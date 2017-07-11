package elias.app.taptesting;

import android.app.*;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.*;
import android.widget.*;

/**
 * Created by elias on 14/06/16.
 */
public class MEEMActivity extends AppCompatActivity {

    int cont = 0;
    Button btEnviar;
//    SimpleDataBase dbH = SimpleDataBase.getInstance(getApplicationContext());
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_meem);

        // setting image resource from drawable
        ImageView imageView = (ImageView) findViewById(R.id.pentagono11);
        imageView.setImageResource(R.drawable.pentagono11);

        imageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "Clicked Second Image",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btEnviar = (Button)findViewById(R.id.btEnviar);
        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // dbH.insertMEEM(cont);
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MEEMActivity.this);
                /*dialogo.setTitle("Resultado: ");
                if(cont > 27){
                    dialogo.setMessage("Pontuação: " + cont + "\nNormal");
                }
                if(cont <= 24){
                    dialogo.setMessage("Pontuação: " + cont + "\nPrejuízo cognitivo por depressão");
                    if(cont < 19){
                        dialogo.setMessage("Pontuação: " + cont + "\nPrejuízo cognitivo por depressão");
                    }
                }
                if((cont <= 27) && (cont >24)){
                    dialogo.setMessage("Pontuação: " + cont + "\nDepressão não-complicada");
                }
                */
                dialogo.setMessage("Obrigado por realizar o teste MEEM!");
                dialogo.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                        finish();
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }
                });
                dialogo.show();
            }
        });
    }

    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()){
            case R.id.checkAno:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkSemestre:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkMes:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkDia:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkDiaSemana:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkEstado:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkCidade:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkBairro:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkRua:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkLocal:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkNunca1:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkRaramente1:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkAlgumasVezes1:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.check93:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.check86:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.check79:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.check72:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.check65:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkO:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkD:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkN:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkU:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkM:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkCaneca2:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkTijolo2:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkTapete2:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkRelogio:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkCaneta:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkQuest7:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkQuest8a:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkQuest8b:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkQuest8c:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkQuest9:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkQuest10:{
                if(checked){
                    cont++;
                }
                break;
            }
            case R.id.checkQuest11:{
                if(checked){
                    cont++;
                }
                break;
            }
        }
    }
}
