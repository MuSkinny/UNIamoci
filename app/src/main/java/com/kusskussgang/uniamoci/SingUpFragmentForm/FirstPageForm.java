package com.kusskussgang.uniamoci.SingUpFragmentForm;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kusskussgang.uniamoci.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstPageForm extends Fragment {

    public static final String TAG = "FIRSTPAGEFORM";


    public FirstPageForm() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.first_page_form, container, false);
    }

}