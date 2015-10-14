package com.pmdm.layout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AlfaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfa);

        final EditText txtNombre = (EditText) findViewById(R.id.TxtNombre);
        final Button btnOk = (Button) findViewById(R.id.BtnOk);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlfaActivity.this,BetaActivity.class);
                intent.putExtra("NOMBRE", txtNombre.getText().toString());
                startActivity(intent);
                AlfaActivity.this.finish();
            }
        });
    }

}
