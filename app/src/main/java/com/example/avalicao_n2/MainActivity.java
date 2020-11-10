package com.example.avalicao_n2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText user = findViewById(R.id.user);
        final EditText password = findViewById(R.id.password);
        final Button siginButton = findViewById(R.id.sigin);
        final TextView alert = findViewById(R.id.alert);

        siginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getText().toString().equals("lucasedferreira") && password.getText().toString().equals("12345")) {
                    alert.clearComposingText();
                    alert.setText("Login efetuado com sucesso!");
                } else if (user.getText().toString().equals("") || password.getText().toString().equals("")) {
                    alert.setText("Informar usuário e senha");
                } else {
                    alert.setText("Usuário ou senha inválido.");
                }
            }
        });
    }
}