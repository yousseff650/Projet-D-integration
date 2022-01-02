package com.example.projetdintergration;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.Objects;

public class page_offre_de_stage extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager mlayout;
    private RecyclerView.Adapter madapter;
    private Context mcontext;
    private Toolbar toolbar;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_offre_de_stage);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.B1)));
       // getSupportActionBar().hide();
     //  toolbar=findViewById(R.id.navbar);
      //  setSupportActionBar(toolbar);

        bottomNavigationView=findViewById(R.id.bottom_bar);






        ArrayList<ExempleDemande> ExempleDemande=new ArrayList<>();
        String []arrs={"Aurax","Aurax","Aurax"};
        String []arrs2={"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
        };
        int [] arr = {R.drawable.aurax,R.drawable.aurax,R.drawable.aurax};
        int [] arr2 = {R.drawable.ren,R.drawable.ren,R.drawable.ren};
        for(int i=0;i<arrs.length;i++) {
            ExempleDemande.add(new ExempleDemande(arr[i],arrs[i],arr2[i],arrs2[i]));
        }
        recyclerView=findViewById(R.id.demande);
        recyclerView.setHasFixedSize(true);
        mlayout=new LinearLayoutManager(this);
        madapter =new AdapterDemande(ExempleDemande);
        recyclerView.setLayoutManager(mlayout);
        recyclerView.setAdapter(madapter);
    }




    public void menu(View view){
        PopupMenu popupMenu= new PopupMenu(this,view);
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,popupMenu.getMenu());
        popupMenu.show();
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.demande:
                        Toast.makeText(mcontext,"demande",Toast.LENGTH_LONG).show();

                }
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.nav_barre,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){

            case R.id.profil:
                Intent i = new Intent(getApplicationContext(),page_profil.class);

                startActivity(i);

        }
        return super.onOptionsItemSelected(item);
    }
}