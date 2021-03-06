package com.example.nino.sheyvarebulebi;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText gogosSaxeli, bichisSaxeli;
    private TextView shedegi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gogosSaxeli = (EditText) findViewById(R.id.gSaxeli);
        bichisSaxeli = (EditText) findViewById(R.id.bSaxeli);
        shedegi = (TextView) findViewById(R.id.siyvarulis_balada);

        Button plus = (Button) findViewById(R.id.plus_button);
    }

    @Override
    public void onClick(View v) {
        String name1 = String.valueOf(gogosSaxeli.getText());
        String name2 = String.valueOf(bichisSaxeli.getText());
        switch (v.getId()){
            case R.id.plus_button:
                if (gogosSaxeli.length()==0 || bichisSaxeli.length()==0  ) {
                    shedegi.setText("!!! გთხოვთ , შეიყვანოთ სახელი" );
                }
                else {
                    shedegi.setText(name1 + " + " + name2 + " = შეყვარებულებს" );
                }

                break;
            case R.id.bSaxeli_label:
                shedegi.setText(" ");
                break;
        }
    }
}
