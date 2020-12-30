package com.example.madcamp2020;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Fragment1 extends Fragment {
    private RecyclerView recyclerView;
    private FragmentAdapter adapter;
    private ArrayList<WordItemData> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_1, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler1);

        list = WordItemData.createContactsList(5);
        recyclerView.setHasFixedSize(true);
        adapter = new FragmentAdapter(getActivity(), list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        Log.e("Frag", "MainFragment");
        return rootView;
    }
}