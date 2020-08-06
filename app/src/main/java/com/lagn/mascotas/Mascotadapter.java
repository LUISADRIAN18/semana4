package com.lagn.mascotas;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Mascotadapter extends RecyclerView.Adapter<Mascotadapter.razasholder> {

    ArrayList<Razas> razas;
    Activity activity;

    String nbmf;

    public Mascotadapter(ArrayList<Razas> recibirazas,Activity activity) {
        this.razas = recibirazas;
        this.activity=activity;
    }

    @NonNull
    @Override
    public razasholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate
                (R.layout.activity_card_view,parent,false);
        return new razasholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final razasholder holder, int position) {
        final Razas rass = razas.get(position);
        holder.imgprro.setImageResource(rass.getFotoperro());
        holder.nombprrro.setText(rass.getRazaprro());
        holder.numerolikes.setText(rass.getLikesdados());


        holder.btlikes.setOnClickListener(new View.OnClickListener() {
            int suma=0;

            @Override
            public void onClick(View view) {


                suma=suma+1;


                  holder.numerolikes.setText(suma+"");

            }
        });


        holder.nombprrro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity,rass.getRazaprro(),Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return razas.size();
    }

    public static class razasholder extends RecyclerView.ViewHolder {
        private ImageView imgprro;
        private TextView nombprrro;
        private Button btlikes;
        private TextView numerolikes;
        private String suama;


        public razasholder(@NonNull View itemView) {
            super(itemView);

            imgprro=itemView.findViewById(R.id.fotoraza);
            nombprrro=itemView.findViewById(R.id.Nombremascotaid);
            btlikes=itemView.findViewById(R.id.botonlike);
            numerolikes=itemView.findViewById(R.id.likestxt);



        }
    }


}
