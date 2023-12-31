package org.dedira.calculadora;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    Button btnMais,btnMenos,btnMult,btnDiv,btnAbre,btnFecha;
    TextView txtResultado;



    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
    Função que faz o papel do metodo construtor executado altomaticamente quando uma atividade for criada.
        */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.txtResultado = this.findViewById(R.id.txtFormula); //comando que encontra uma viw dado um ID.
        //A classe R é gerada altomaticamente quando alteramos o leouyt ficando a referencia para todos os controles definidos nos laouyt.

        this.btn1 = this.findViewById(R.id.btn1);
        this.btn2 = this.findViewById(R.id.btn2);
        this.btn3 = this.findViewById(R.id.btn3);
        this.btn4 = this.findViewById(R.id.btn4);
        this.btn5 = this.findViewById(R.id.btn5);
        this.btn6 = this.findViewById(R.id.btn6);
        this.btn7 = this.findViewById(R.id.btn7);
        this.btn8 = this.findViewById(R.id.btn8);
        this.btn9 = this.findViewById(R.id.btn9);
        this.btn0 = this.findViewById(R.id.btn0);

        this.btnMais = this.findViewById(R.id.btnSoma);
        this.btnMenos = this.findViewById(R.id.btnSubtracao);
        this.btnMult = this.findViewById(R.id.btnMultiplicacao);
        this.btnDiv = this.findViewById(R.id.btnDivisao);
        this.btnAbre = this.findViewById(R.id.btnAbreParenteses);
        this.btnFecha = this.findViewById(R.id.btnFecharParenteses);


        this.btn1.setOnClickListener( v ->{                    //significado (this) é uma referencia ao proprio objeto no codigo como se tivesse falando com ele mesmo.
            this.txtResultado.setText( this.txtResultado.getText().toString() + "1");
        });

        this.btn2.setOnClickListener( v ->{                    //significado (this) é uma referencia ao proprio objeto no codigo como se tivesse falando com ele mesmo.
            this.txtResultado.setText( this.txtResultado.getText().toString() + "2");
        });

        this.btn3.setOnClickListener( v ->{                    //significado (this) é uma referencia ao proprio objeto no codigo como se tivesse falando com ele mesmo.
            this.txtResultado.setText( this.txtResultado.getText().toString() + "3");
        });

        this.btn4.setOnClickListener( v ->{                    //significado (this) é uma referencia ao proprio objeto no codigo como se tivesse falando com ele mesmo.
            this.txtResultado.setText( this.txtResultado.getText().toString() + "4");
        });

        this.btn5.setOnClickListener( v ->{                    //significado (this) é uma referencia ao proprio objeto no codigo como se tivesse falando com ele mesmo.
            this.txtResultado.setText( this.txtResultado.getText().toString() + "5");
        });

        this.btn6.setOnClickListener( v ->{                    //significado (this) é uma referencia ao proprio objeto no codigo como se tivesse falando com ele mesmo.
            this.txtResultado.setText( this.txtResultado.getText().toString() + "6");
        });

        this.btn7.setOnClickListener( v ->{                    //significado (this) é uma referencia ao proprio objeto no codigo como se tivesse falando com ele mesmo.
            this.txtResultado.setText( this.txtResultado.getText().toString() + "7");
        });

        this.btn8.setOnClickListener( v ->{                    //significado (this) é uma referencia ao proprio objeto no codigo como se tivesse falando com ele mesmo.
            this.txtResultado.setText( this.txtResultado.getText().toString() + "8");
        });

        this.btn9.setOnClickListener( v ->{                    //significado (this) é uma referencia ao proprio objeto no codigo como se tivesse falando com ele mesmo.
            this.txtResultado.setText( this.txtResultado.getText().toString() + "9");
        });

        this.btn0.setOnClickListener( v ->{                    //significado (this) é uma referencia ao proprio objeto no codigo como se tivesse falando com ele mesmo.
            this.txtResultado.setText( this.txtResultado.getText().toString() + "0");
        });
    }
}