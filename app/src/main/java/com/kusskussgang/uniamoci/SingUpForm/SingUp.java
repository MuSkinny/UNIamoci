package com.kusskussgang.uniamoci.SingUpForm;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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
        //transaction.addToBackStack(FirstPageForm.TAG); //it allows back navigation between fragments
        transaction.commit();


    }

    @Override
    public void onClick(View v) {

    }

   @Override
    public void onBackPressed()
    {
        if (getFragmentManager().getBackStackEntryCount() > 0){
            getFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }

    }
}
