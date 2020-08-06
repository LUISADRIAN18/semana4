package com.lagn.mascotas;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int pml=0;

    private ArrayList<Razas> razasprro;
    private RecyclerView ListaRecyclerprros;
    private Button likebt;
    private FloatingActionButton bts;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar tolbar=findViewById(R.id.miappbar);
        //setSupportActionBar(tolbar);

        ListaRecyclerprros=findViewById(R.id.recyclerView);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        ListaRecyclerprros.setLayoutManager(llm);
        razaslistar();
        inicaradaptador();
        bts=findViewById(R.id.floatin);





    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
      return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id= item.getItemId();
        if(id==R.id.estrella5){
            startActivity(new Intent(MainActivity.this,CardView.class));
            return true;

        }return super.onOptionsItemSelected(item);

    }











    public void inicaradaptador(){
        Mascotadapter adaptar= new Mascotadapter(razasprro,this);
        ListaRecyclerprros.setAdapter(adaptar);



}


public void razaslistar( ){

        razasprro=new ArrayList<>();
        razasprro.add(new Razas("Samoyedo",R.drawable.samoyedo,R.id.botonlike,R.id.likestxt));
        razasprro.add(new Razas("Ladrador",R.drawable.ladrador,R.id.botonlike,R.id.likestxt));
        razasprro.add(new Razas("Husky",R.drawable.huky,R.id.botonlike,R.id.likestxt));
        razasprro.add(new Razas("Dalmata",R.drawable.dalmata,R.id.botonlike,R.id.likestxt));
        razasprro.add(new Razas("Akita",R.drawable.akita,R.id.botonlike,R.id.likestxt));



}








}