package com.example.kislaya.hellouser;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view)
    {
        EditText txtInput = (EditText) findViewById(R.id.txtInput);
        String message = txtInput.getText().toString();
        TextView txtResult = (TextView) findViewById(R.id.txtResult);
        txtResult.append(message);
    }
}
