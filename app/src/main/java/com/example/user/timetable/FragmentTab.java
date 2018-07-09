package com.example.user.timetable;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.user.timetable.databinding.FragmentTabBinding;

@SuppressLint("ValidFragment")
public class FragmentTab extends Fragment {
    private int numberOfTab;
    FragmentTabBinding binding;

    @SuppressLint("ValidFragment")
    public FragmentTab(int numberOfTab) {
        this.numberOfTab = numberOfTab;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentTabBinding.inflate(inflater, container, false);
        String[] values = new String[]{"Android List View",
                "Android Example",
                "List View Source Code",
                "List View Array Adapter",
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        binding.listView.setAdapter(adapter);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
