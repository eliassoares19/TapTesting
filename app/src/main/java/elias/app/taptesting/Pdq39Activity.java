package elias.app.taptesting;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

/**
 * Created by elias on 18/06/16.
 */
public class Pdq39Activity extends AppCompatActivity {
    Button btEnviarPdq;
    int cont=0;
  //  SimpleDataBase dbH = SimpleDataBase.getInstance(getApplicationContext());
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_pdq);

        btEnviarPdq = (Button)findViewById(R.id.btEnviarPdq);
        btEnviarPdq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogo = new AlertDialog.Builder(Pdq39Activity.this);
                //dbH.insertPdq39(cont);
                //dialogo.setTitle("Resultado: ");
                //dialogo.setMessage("Pontuação: " + (cont*100)/156);
                dialogo.setMessage("Obrigado por realizar o teste Pdq-39!");
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
            case R.id.checkNunca1:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca2:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca3:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca4:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca5:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca6:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca7:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca8:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca9:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca10:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca11:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca12:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca13:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca14:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca15:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca16:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca17:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca18:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca19:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca20:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca21:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca22:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca23:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca24:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca25:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca26:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca27:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca28:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca29:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca30:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca31:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca32:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca33:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca34:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca35:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca36:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca37:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca38:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }
            case R.id.checkNunca39:{
                if(checked){
                    //cont = cont + 0;
                }
                break;
            }

            case R.id.checkRaramente1:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente2:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente3:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente4:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente5:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente6:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente7:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente8:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente9:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente10:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente11:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente12:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente13:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente14:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente15:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente16:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente17:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente18:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente19:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente20:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente21:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente22:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente23:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente24:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente25:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente26:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente27:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente28:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente29:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente30:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente31:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente32:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente33:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente34:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente35:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente36:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente37:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente38:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }
            case R.id.checkRaramente39:{
                if(checked){
                    cont = cont + 1;
                }
                break;
            }

            case R.id.checkAlgumasVezes1:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes2:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes3:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes4:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes5:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes6:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes7:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes8:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes9:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes10:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes11:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes12:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes13:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes14:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes15:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes16:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes17:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes18:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes19:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes20:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes21:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes22:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes23:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes24:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes25:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes26:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes27:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes28:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes29:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes30:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes31:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes32:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes33:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes34:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes35:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes36:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes37:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes38:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }
            case R.id.checkAlgumasVezes39:{
                if(checked){
                    cont = cont + 2;
                }
                break;
            }


            case R.id.checkFrequentemente1:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente2:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente3:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente4:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente5:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente6:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente7:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente8:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente9:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente10:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente11:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente12:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente13:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente14:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente15:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente16:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente17:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente18:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente19:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente20:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente21:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente22:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente23:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente24:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente25:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente26:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente27:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente28:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente29:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente30:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente31:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente32:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente33:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente34:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente35:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente36:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente37:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente38:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }
            case R.id.checkFrequentemente39:{
                if(checked){
                    cont = cont + 3;
                }
                break;
            }

            case R.id.checkSempre1:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre2:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre3:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre4:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre5:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre6:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre7:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre8:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre9:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre10:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre11:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre12:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre13:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre14:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre15:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre16:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre17:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre18:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre19:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre20:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre21:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre22:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre23:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre24:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre25:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre26:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre27:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre28:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre29:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre30:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre31:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre32:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre33:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre34:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre35:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre36:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre37:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre38:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
            case R.id.checkSempre39:{
                if(checked){
                    cont = cont + 4;
                }
                break;
            }
        }
    }
}
