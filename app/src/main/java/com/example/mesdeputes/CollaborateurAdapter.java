package com.example.mesdeputes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CollaborateurAdapter extends BaseAdapter {
    private ArrayList<String> collaborateurs;
    private Context context;

    public CollaborateurAdapter(ArrayList<String> collaborateurs, Context context) {
        this.collaborateurs = collaborateurs;
        this.context = context;
    }

    public void setDeputies(ArrayList<Deputy> deputies) {
        this.collaborateurs = collaborateurs;
    }


    @Override
    public int getCount() {
        return collaborateurs.size();
    }

    @Override
    public Object getItem(int position) {
        return collaborateurs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_collab, parent, false);
        }
        TextView textViewCollab= convertView.findViewById(R.id.textViewCollab);

        textViewCollab.setText((position+1)+" : "+ collaborateurs.get(position));

        return convertView;
    }
}
