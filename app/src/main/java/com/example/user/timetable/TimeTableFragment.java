package com.example.user.timetable;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.user.timetable.databinding.ItemInRecyclerViewForShadulerBinding;
import com.example.user.timetable.databinding.TimetableFragmentBinding;

/**
 * Created by User on 08.07.2018.
 */

public class TimeTableFragment extends Fragment {
    TimetableFragmentBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = TimetableFragmentBinding.inflate(inflater, container, false);
        binding.tabs.addTab(binding.tabs.newTab().setText("Сегодня"));
        binding.tabs.addTab(binding.tabs.newTab().setText("Вторник"));
        binding.tabs.addTab(binding.tabs.newTab().setText("Среда"));
        binding.tabs.addTab(binding.tabs.newTab().setText("Четверг"));
        binding.tabs.addTab(binding.tabs.newTab().setText("Пятница"));
        binding.tabs.addTab(binding.tabs.newTab().setText("Суббота"));
        binding.viewpager.setAdapter(new PagerAdapter(getFragmentManager(), binding.tabs.getTabCount()));
        binding.viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tabs));
        binding.tabs.setupWithViewPager(binding.viewpager);
        binding.tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Toast toast = Toast.makeText(getActivity(), String.valueOf(tab.getPosition()), Toast.LENGTH_LONG);
                toast.show();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
