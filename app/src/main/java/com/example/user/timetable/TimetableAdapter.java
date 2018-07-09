package com.example.user.timetable;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;

import com.example.user.timetable.databinding.ItemInRecyclerViewForShadulerBinding;

/**
 * Created by User on 09.07.2018.
 */

public class TimetableAdapter extends BaseAdapter {
    Context context;

    public TimetableAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ItemInRecyclerViewForShadulerBinding binding;
        if (convertView == null) {
            LayoutInflater from = LayoutInflater.from(context);
            binding = ItemInRecyclerViewForShadulerBinding.inflate(from, viewGroup, false);
            convertView = binding.getRoot();
            convertView.setTag(binding);
        } else {
            binding = (ItemInRecyclerViewForShadulerBinding) convertView.getTag();
        }
        binding.endTimeTextView.setText("8:00");
        binding.startTimeTextView.setText("9:00");
        binding.roomTextView.setText("108-4");
        binding.teachersName.setText("Бахтизин Н.О");
        binding.nameOfLessonTextView.setText("математика");
        binding.typeTextView.setText("УР");
        return convertView;
    }
}
