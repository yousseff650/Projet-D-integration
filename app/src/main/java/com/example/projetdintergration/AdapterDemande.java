package com.example.projetdintergration;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterDemande extends  RecyclerView.Adapter<AdapterDemande.AdapterViewHolder>   {
    private ArrayList<ExempleDemande> DExemple;
    View view;
    private Context mcontext;

    public AdapterDemande(View view) {
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder {
        ImageView image1,image2,menu;
        TextView text1,text;

        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            image1=itemView.findViewById(R.id.image1);
            image2=itemView.findViewById(R.id.image2);
            menu=itemView.findViewById(R.id.menu);
            text1=itemView.findViewById(R.id.text1);
            text=itemView.findViewById(R.id.txt);


        }
    }

    public AdapterDemande(ArrayList<ExempleDemande> ExempleDemande) {
        DExemple=ExempleDemande;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cadre_stage,parent,false);
        AdapterViewHolder de= new AdapterViewHolder(view);
        return de;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {
        ExempleDemande exempleDemande=DExemple.get(position);
        holder.image1.setImageResource(exempleDemande.getIm1());
        holder.image2.setImageResource(exempleDemande.getIm2());
        holder.text.setText(exempleDemande.getText1());
        holder.text1.setText(exempleDemande.getText2());
holder.menu.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        PopupMenu popupMenu=new PopupMenu(mcontext,view);
        popupMenu.getMenuInflater().inflate(R.menu.menu, popupMenu.getMenu());
        popupMenu.show();
    }
});




    }

    @Override
    public int getItemCount() {
        return DExemple.size();
    }


}
