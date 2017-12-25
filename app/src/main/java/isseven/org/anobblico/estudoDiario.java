package isseven.org.anobblico;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by roger on 24/12/17.
 */

public class estudoDiario extends Activity{
    EditText dataSelecioinada;
    TextView livroParaEstudar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estudodiario);
        Intent intent = getIntent();

        String diaSelecionado = intent.getExtras().getString("diaSelecionado");
        String mesSelecionado = intent.getExtras().getString("mesSelecionado");
        String anoSelecionado = intent.getExtras().getString("anoSelecionado");

        dataSelecioinada = (EditText) findViewById(R.id.dataSelecionada);
        livroParaEstudar = (TextView) findViewById(R.id.livroParaEstudar);

        dataSelecioinada.setText("DATA: "+diaSelecionado+"/"+mesSelecionado+"/"+anoSelecionado);
        dataSelecioinada.setEnabled(false);

        ArrayList<String> Janeiro = new ArrayList<String>();
        ArrayList<String> Dezembro = new ArrayList<String>();
        Dezembro.add("Habacuque 01");
        Janeiro.add("Habacuque 02");
        Janeiro.add("Habacuque 03");
        Janeiro.add("Sofônias 01");
        Janeiro.add("Sofônias 02");
        Janeiro.add("Sofônias 03");
        Janeiro.add("Ageu 01");
        Janeiro.add("Ageu 02");
        Janeiro.add("Zacarias 01");
        Janeiro.add("Zacarias 02");
        Janeiro.add("Zacarias 03");
        Janeiro.add("Zacarias 04");
        Janeiro.add("Zacarias 05");
        Janeiro.add("Zacarias 06");
        Janeiro.add("Zacarias 07");
        Janeiro.add("Zacarias 08");
        Janeiro.add("Zacarias 09");
        Janeiro.add("Zacarias 10");
        Janeiro.add("Zacarias 11");
        Janeiro.add("Zacarias 12");
        Janeiro.add("Zacarias 13");
        Janeiro.add("Zacarias 14");
        Janeiro.add("Malaquias 01");
        Janeiro.add("Malaquias 02");
        Janeiro.add("Malaquias 03");
        Janeiro.add("Malaquias 04");
        Janeiro.add("Mateus 01");
        Janeiro.add("Mateus 02");
        Janeiro.add("Mateus 03");
        Janeiro.add("Mateus 04");
        Janeiro.add("Mateus 05");
        Janeiro.add("Mateus 06");
        if (Integer.valueOf(mesSelecionado).equals(12) && Integer.valueOf(anoSelecionado).equals(2017)){
            livroParaEstudar.setText(Dezembro.get(0));
        }else if (Integer.valueOf(mesSelecionado).equals(1) && Integer.valueOf(anoSelecionado).equals(2018)){
            livroParaEstudar.setText(Janeiro.get(Integer.valueOf(diaSelecionado)-1));
        }else{
            livroParaEstudar.setText("Agaurde novas atualizações :D ");
        }

    }
}
