package com.example.mesdeputes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ResponsabilityAdapter extends BaseAdapter {

    private ArrayList<Responsability> responsabilities;
    private Context context;

    public ResponsabilityAdapter(ArrayList<Responsability> responsabilities, Context context) {
        this.responsabilities = responsabilities;
        this.context = context;
    }

    public void setDeputies(ArrayList<Deputy> deputies) {
        this.responsabilities = responsabilities;
    }


    @Override
    public int getCount() {
        return responsabilities.size();
    }

    @Override
    public Object getItem(int position) {
        return responsabilities.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_responsability, parent, false);
        }
        TextView textViewOrganisme= convertView.findViewById(R.id.textViewOrganisme);
        TextView textViewFonction= convertView.findViewById(R.id.textViewFonction);
        TextView textViewDebut= convertView.findViewById(R.id.textViewDebut);

        textViewOrganisme.setText((position+1)+" - Organisme: "+responsabilities.get(position).getOrganisme());
        textViewFonction.setText("Fonction: "+responsabilities.get(position).getFonction());
        textViewDebut.setText("Date Debut: "+responsabilities.get(position).getDebut_fonction());

        return convertView;
    }

}
