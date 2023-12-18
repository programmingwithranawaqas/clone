package com.example.clone;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class NamesFrag extends ListFragment {

    public interface OnNameClicked
    {
        public void click(int index);
    }

    OnNameClicked parentActivity;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        parentActivity = (OnNameClicked) context;

    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        // call click method which is defined in MainActivity
        parentActivity.click(position);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Kazmi");
        names.add("Afaq");
        names.add("Arslan");
        names.add("Imran");
        names.add("Imran arshad");
        names.add("Imran khan");

        setListAdapter(new ArrayAdapter<String>(getContext(), android.R.layout.simple_dropdown_item_1line, names));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_names, container, false);
    }
}