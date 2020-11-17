package com.example.flurfid.ui.supplier;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.flurfid.MainActivity;
import com.example.flurfid.R;


public class BindDataFragment extends Fragment {

    private Button buttonsave;
    private Button buttonsure;
    private Button buttonReset;

    //
    private EditText textid;
    private EditText textRfid;
    private ListView listshowBind;

    //
    private MainActivity activity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activity = (MainActivity) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bind_data, container, false);
    }
    private void intoBind(){

    }
}