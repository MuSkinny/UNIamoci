package com.kusskussgang.uniamoci.SingUpFragmentForm;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.kusskussgang.uniamoci.R;

public class SingUp extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sing_up);

        FirstPageForm fragment = new FirstPageForm();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout_form, fragment);
        transaction.addToBackStack(FirstPageForm.TAG);
        transaction.commit();


    }

    @Override
    public void onClick(View v) {

    }
}
