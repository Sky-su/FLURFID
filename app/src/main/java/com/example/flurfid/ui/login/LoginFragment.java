package com.example.flurfid.ui.login;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.flurfid.MainActivity;
import com.example.flurfid.R;


public class LoginFragment extends Fragment {

    private Button loginButton;
    private Button buttonExit;
    private Button btn_change;
    private Spinner spinner_url;

    //View
    private View viewlogin;
    private ArrayAdapter arrayAdapter;
    private String[] m;
    private MainActivity activity;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = (MainActivity) getActivity();
        m = activity.getResources().getStringArray(R.array.Applicationprofiles );

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        viewlogin = inflater.inflate(R.layout.fragment_login, container, false);
        return viewlogin;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initlogin();
    }
    String name;
    private void initlogin() {
       // btn_change = viewlogin.findViewById(R.id.btn_change);
        buttonExit = viewlogin.findViewById(R.id.buttonExit);
        loginButton = viewlogin.findViewById(R.id.buttonLogin);
        spinner_url = viewlogin.findViewById(R.id.spinner_url);
        arrayAdapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item,m);
        //设置下拉列表的风格
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //将adapter 添加到spinner中
        spinner_url.setAdapter(arrayAdapter);
        spinner_url.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                name = m[position];

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

                name = "供应商登录";
            }
        });
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if (name.equals("供应商登录")) Navigation.findNavController(viewlogin).navigate(R.id.action_loginFragment_to_supplierMainFragment);
              if (name.equals("福陆登录")) {
                  activity.setContentView();
                  Navigation.findNavController(viewlogin).navigate(R.id.action_loginFragment_to_nav_home);
              }

            }
        });
        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                activity.finish();
            }
        });
    }
}