package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


private Button b1,b2,b3,b4,b5,b6,b7;
private TextView scoreval,over,singles,doubles,fours,sixes,extras;
private int score=0,ones=0;
private int six=0,four=0,twos=0,extra=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView marque = (TextView) this.findViewById(R.id.marque_scrolling_text);
        marque.setSelected(true);

        b1=findViewById(R.id.one);
        b2=findViewById(R.id.two);
        b3=findViewById(R.id.four);
        b4=findViewById(R.id.six);
        b5=findViewById(R.id.wide);
        scoreval=findViewById(R.id.total);
        singles=findViewById(R.id.singles);
        doubles=findViewById(R.id.doubles);
        fours=findViewById(R.id.fours);
        sixes=findViewById(R.id.sixs);
        extras=findViewById(R.id.extras);




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=score+1;
                ones++;
                scoreval.setText(""+score+"");
                singles.setText("1's:"+ones+"");

            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=score+2;
                twos++;
                scoreval.setText(""+score+"");
                doubles.setText("2's:"+twos+"");

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=score+4;
                four++;
                scoreval.setText(""+score+"");
                fours.setText("4's:"+four+"");

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=score+6;
                six++;
                scoreval.setText(""+score+"");
                sixes.setText("6's:"+six+"");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=score+1;
                extra++;
                scoreval.setText(""+score+"");
                extras.setText("Extra's's:"+extra+"");
            }
        });




    }
}
