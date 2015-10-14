package com.pmdm.layout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class GammaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamma);
    }

    public void onClick(View view) {
        CheckBox chk = (CheckBox) findViewById(R.id.ChkOpcion);
        int i = 0;
        RadioButton rb1 = (RadioButton) findViewById(R.id.Radio1);
        RadioButton rb2 = (RadioButton) findViewById(R.id.Radio2);
        Intent intent = new Intent(this, IotaActivity.class);
        intent.putExtra("NOMBRE", this.getIntent().getExtras().getString("NOMBRE"));
        intent.putExtra("CLAVE", this.getIntent().getExtras().getStringArray("CLAVE"));
        intent.putExtra("CHK", chk.isChecked());
        if (rb1.isChecked()) i = 1;
        if (rb2.isChecked()) i = 2;
        intent.putExtra("OPT", i);
        startActivity(intent);
        GammaActivity.this.finish();
    }
}
