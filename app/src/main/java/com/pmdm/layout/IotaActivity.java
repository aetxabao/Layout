package com.pmdm.layout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class IotaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iota);

        Bundle bundle = this.getIntent().getExtras();
        TextView lblInfo = (TextView) findViewById(R.id.LblResultado);
        StringBuilder sb = new StringBuilder();
        sb.append(bundle.getString("NOMBRE") + "\n");
        String[] clave = bundle.getStringArray("CLAVE");
        sb.append(clave[0] + clave[1] + clave[2] + clave[3] + "\n");
        sb.append("Checkbox: " + bundle.getBoolean("CHK") + "\n");
        sb.append("Radio op: " + bundle.getInt("OPT") + "\n");
        lblInfo.setText(sb.toString());
    }

}
