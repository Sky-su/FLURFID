package com.example.flurfid.ui.supplier;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavAction;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.example.flurfid.MainActivity;
import com.example.flurfid.R;
import com.example.flurfid.ui.supplier.entiey.SupplicerData;
import com.example.flurfid.ui.supplier.item.List_suppliceroutorder;

import java.util.ArrayList;
import java.util.List;


public class SupplicerOutFragment extends Fragment {

    private View viewsuplierout;
    private MainActivity activity;
    private Button supplierExit;
    private Button supplieroutsure;
    private Button supplierLoading;
    private ListView listViewSupplicerOutorder;
    private List_suppliceroutorder supplierorder;
    private List<SupplicerData> listitem;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       activity = (MainActivity) getActivity();
       listitem = new ArrayList<>();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        viewsuplierout = inflater.inflate(R.layout.fragment_supplicer_out, container, false);
        return viewsuplierout;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initSupplicerout();;
    }
    private void initSupplicerout(){

        listViewSupplicerOutorder = viewsuplierout.findViewById(R.id.list_supplicer_out);
        supplierLoading = viewsuplierout.findViewById(R.id.buttonLoad);
        supplierExit = viewsuplierout.findViewById(R.id.buttonCancel);
        supplieroutsure = viewsuplierout.findViewById(R.id.buttonOk);
        supplierLoading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SupplicerData s1 = new SupplicerData();
                s1.setOrdernumber("TK000001");
                SupplicerData s2 = new SupplicerData();
                s2.setOrdernumber("TK005615");
                listitem.add(s1);
                listitem.add(s2);
                supplierorder = new List_suppliceroutorder(listitem,getContext());
                listViewSupplicerOutorder.setAdapter(supplierorder);
                supplieroutsure.setEnabled(true);
            }
        });
        supplierExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigateUp();
            }
        });
        supplieroutsure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}