package com.kusskussgang.uniamoci.SingUpForm;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.kusskussgang.uniamoci.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstPageForm extends Fragment implements View.OnClickListener {

    public static final String TAG = "FIRSTPAGEFORM";
    private Button toSecondPage;


    public FirstPageForm() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.first_page_form, container, false);

        toSecondPage = v.findViewById(R.id.next_to_second);
        toSecondPage.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v)
    {
        if (v == toSecondPage)
        {
            moveToSecondPage();
        }

    }

    public void moveToSecondPage()
    {
        SecondPageForm fragment = new SecondPageForm();
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout_form, fragment);
        transaction.addToBackStack(FirstPageForm.TAG); //it allows back navigation between fragments
        transaction.commit();
    }
}
