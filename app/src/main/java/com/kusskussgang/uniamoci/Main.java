package com.kusskussgang.uniamoci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.kusskussgang.uniamoci.SingUpFragmentForm.SingUp;

public class Main extends AppCompatActivity implements View.OnClickListener
{
    private TextView to_singUP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        to_singUP = findViewById(R.id.button_tosingUP);
        to_singUP.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if (v == to_singUP)
        {
            Intent TOSIGNUP = new Intent(this, SingUp.class);
            startActivity(TOSIGNUP);
        }

    }
}
