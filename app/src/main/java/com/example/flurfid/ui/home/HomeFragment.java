package com.example.flurfid.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;

import com.example.flurfid.MainActivity;
import com.example.flurfid.R;
import com.example.flurfid.util.CustomToast;

public class HomeFragment extends Fragment {

    View root;
    //Meum
    private Button buttonOut;
    private Button buttonPutaway;
    private Button buttonMove;
    private Button buttonSetting;
    private Button buttonFind;
    private Button buttonExit;

    //User
    String userName = "";
    public MainActivity activity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activity = (MainActivity) getActivity();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
         root = inflater.inflate(R.layout.fragment_home, container, false);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        homeinit(root);
        if (activity.getss().equals("")) Navigation.findNavController(root).navigate(R.id.action_nav_home_to_loginFragment);
    }

    private void homeinit(View view){
        buttonOut = view.findViewById(R.id.buttonOut);
        buttonPutaway = view.findViewById(R.id.buttonPutaway);
        buttonMove = view.findViewById(R.id.buttonMove);
        buttonExit = view.findViewById(R.id.buttonExit);
        buttonFind = view.findViewById(R.id.buttonFind);
        buttonSetting = view.findViewById(R.id.buttonSetting);
        buttonOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomToast.showToast(getContext(),"待开放！",1000);
            }
        });
    }
}