package com.example.vinicius.market.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vinicius.market.R;

/**
 * Created by Vinicius on 27/09/2015.
 */
public class Market extends Fragment {

    public Market()
    {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.market_fragment, container, false);
    }
}
