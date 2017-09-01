package br.ufjf.dcc196.dcc196exemplo02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity {

    private EditText numero1;
    private EditText numero2;
    private TextView resultado;
    private Button botaoSoma;
    private Button botaoSub;
    private Button botaoProd;
    private Button botaoDiv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        // 1- Encontre os componentes de entrada
        numero1 = (EditText) findViewById(R.id.numero1);
        numero2 = (EditText) findViewById(R.id.numero2);

        // 2- Procure os componentes de saida
        resultado = (TextView) findViewById(R.id.resultado);

        // 3- Procure os componentes de controle
        botaoSoma = (Button) findViewById(R.id.bSom);
        botaoSub = (Button) findViewById(R.id.bSub);
        botaoProd = (Button) findViewById(R.id.bProd);
        botaoDiv = (Button) findViewById(R.id.bDiv);

        // 4- Configurar os ouvintes para eventos
        OuvinteOperacao ouvinteInstancia = new OuvinteOperacao();
        botaoSoma.setOnClickListener(ouvinteInstancia);
        botaoSub.setOnClickListener(ouvinteInstancia);
        botaoProd.setOnClickListener(ouvinteInstancia);
        botaoDiv.setOnClickListener(ouvinteInstancia);



    }

    private class OuvinteOperacao implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Integer n1 = Integer.parseInt(numero1.getText().toString());
            Integer n2 = Integer.parseInt(numero2.getText().toString());
            if(v == botaoSoma) {
                Integer soma = n1 + n2;
                resultado.setText("A soma de " + n1 + " e " + n2 + " é:" + soma);
            }else if(v == botaoSub){
                Integer sub = n1 - n2;
                resultado.setText("A subtração de " + n1 + " e " + n2 + " é:" + sub);
            }else if(v == botaoProd){
                Integer prod = n1 * n2;
                resultado.setText("O produto de " + n1 + " e " + n2 + " é:" + prod);
            }else if(v == botaoDiv){
                Integer div = n1 / n2;
                resultado.setText("A divisao de " + n1 + " e " + n2 + " é:" + div);
            }
        }
    }
}