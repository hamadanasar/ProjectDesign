package com.example.ddd.Orders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.ddd.Base.BaseFragment;
import com.example.ddd.R;

public class OrderOnclickFragment extends BaseFragment {

    public OrderOnclickFragment() {
        // Required empty public constructor
    }

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_order_onclick, container, false);

        return view;
    }
}