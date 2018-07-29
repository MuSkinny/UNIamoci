package com.kusskussgang.uniamoci.SingUpForm;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kusskussgang.uniamoci.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondPageForm extends Fragment {


    public SecondPageForm() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.second_page_form, container, false);
    }

}
