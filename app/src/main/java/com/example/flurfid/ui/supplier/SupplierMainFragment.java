package com.example.flurfid.ui.supplier;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.flurfid.R;


public class SupplierMainFragment extends Fragment {


    private View viewSupplicer;
    private Button supplierout;
    private Button supplierBind;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        viewSupplicer = inflater.inflate(R.layout.fragment_supplier_main, container, false);
        return viewSupplicer;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initSupplicer();
    }

    private void initSupplicer() {
        supplierBind = viewSupplicer.findViewById(R.id.buttonbinding);
        supplierout = viewSupplicer.findViewById(R.id.buttonSuppliersout);
        supplierBind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(viewSupplicer).navigate(R.id.action_supplierMainFragment_to_bindDataFragment);
            }
        });
        supplierout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(viewSupplicer).navigate(R.id.action_supplierMainFragment_to_supplicerOutFragment);

            }
        });
    }
}