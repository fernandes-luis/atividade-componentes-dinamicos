package com.student.componentesdinamicos;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout layBotao;
    Button btnCriar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layBotao = findViewById(R.id.layBtn);
        btnCriar = findViewById(R.id.btnCriarComponente);

        btnCriar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Criação de um TextView
                TextView novoComponente = new TextView(MainActivity.this);
                novoComponente.setText("Novo componente criado");
                //Criação de um EditText
                EditText et = new EditText(MainActivity.this);
                et.setHint("Produto");
                et.setTextSize(16);
                et.setTextColor(Color.parseColor("#000000"));
                //Criação de um Botão
                Button btn = new Button(MainActivity.this);
                btn.setText("Excluir");

                layBotao.addView(novoComponente);
                layBotao.addView(et);
                layBotao.addView(btn);
            }
        });
    }
}