package com.example.mesdeputes;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DeputyActivity extends AppCompatActivity {
    private ResponsabilityAdapter adapter;

    private CollaborateurAdapter adapter2;

    private ListView listViewResponsability;

    private ListView listViewCollaborateur;
    private ImageView imageView;
    private TextView  textViewName, textViewCirco, textViewEmail, textViewGroupe;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deputy);
        textViewName= findViewById(R.id.textViewDeputyName);
        textViewCirco= findViewById(R.id.textViewDeputyCirco);
        textViewGroupe= findViewById(R.id.textViewDeputyGroupe);
        textViewEmail= findViewById(R.id.textViewDeputyEmail);

        imageView= findViewById(R.id.imageViewDeputy);
        listViewResponsability= findViewById(R.id.listViewResponsability);
        listViewCollaborateur= findViewById(R.id.listViewCollaborateur);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Deputy deputy= (Deputy) getIntent().getSerializableExtra("deputy");

        textViewName.setText(deputy.getFirstname()+" "+deputy.getLastname());
        textViewCirco.setText(deputy.getDepartment()+", "+
                deputy.getNameCirco()+ " "+ deputy.getNumCirco()+
                (deputy.getNumCirco()==1? "er": "eme")+" circoncription");
        textViewGroupe.setText(deputy.getGroupe());
        textViewEmail.setText(deputy.getEmail());
        ApiServices.loadDeputyAvatar(this, deputy.getNameForAvatar(), imageView);

        adapter= new ResponsabilityAdapter(deputy.getResponsabilites(), this);
        listViewResponsability.setAdapter(adapter);

        adapter2= new CollaborateurAdapter(deputy.getCollaborateurs(), this);
        listViewCollaborateur.setAdapter(adapter2);
    }
}