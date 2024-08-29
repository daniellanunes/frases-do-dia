package com.daniellanunes.frasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] frases = {

            "Cada novo amanhecer é uma chance de recomeçar.",
            "A persistência é o caminho do êxito.",
            "O sucesso é a soma de pequenos esforços repetidos dia após dia.",
            "Faça hoje o que você vai agradecer amanhã.",
            "Acredite em si mesmo e em tudo o que você é.",
            "A determinação de hoje constrói o sucesso de amanhã.",
            "Tudo o que você pode imaginar é real.",
            "A vida é 10% o que acontece com você e 90% como você reage a isso.",
            "Não espere por oportunidades, crie-as.",
            "O fracasso é apenas uma oportunidade para recomeçar com mais inteligência.",


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void gerarFrase(View view){

        TextView texto = findViewById(R.id.textResultado);
        int numeroAleatorio = new Random().nextInt(10);
        String frase = "\n" + "\n" +"\n" +"\n" +"\n" + frases[ numeroAleatorio ];

        texto.setText(frase);

    }

    public void exibirTodas(View view){

        TextView texto = findViewById(R.id.textResultado);

        String textoResultado ="";

        for (String frase : frases){

            textoResultado = textoResultado + frase + "\n" + "\n";
        }

        texto.setText(textoResultado);

    }

}