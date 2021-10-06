package com.vasyilla.recycler_view;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Movie;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MoviesRecyclerViewAdapter adapter;
    ArrayList<Movies> objMovies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        //String title, String genre, String director, double rating, String description, String releasedate
        objMovies.add(new Movies("SQUID GAME", "Drama, Laga, Cerita seru", "Hwang Dong-hyuk", "4.3", "Empat ratus lima puluh enam orang, yang semuanya berjuang secara finansial dalam hidup, diundang untuk memainkan kompetisi bertahan hidup yang misterius. Berkompetisi dalam serangkaian permainan anak-anak tradisional tetapi dengan tikungan yang mematikan, mereka mempertaruhkan hidup mereka untuk bersaing memperebutkan hadiah ₩45.6 miliar (US$38,5 juta).", "17 September 2021"));
        objMovies.add(new Movies("VINCENZO", "Drama Korea, Roman, Komedi hitam, Crime TV genre", "Kim Hee-Won", "4.8", "Saat mengunjungi tanah airnya, seorang pengacara mafia keturunan Korea-Italia memihak keadilan dengan membalas kejahatan seorang konglomerat yang tak tertandingi.", "20 Februari 2021"));
        objMovies.add(new Movies("SWEET HOME", "Drama; Horor", "Lee Eung-bok", "4.0", "Saat banyak manusia berubah menjadi monster dan menebar teror, seorang remaja bermasalah dan para tetangganya berjuang untuk hidup—dan mempertahankan kemanusiaan mereka.", "18 Desember 2020."));

        adapter = new MoviesRecyclerViewAdapter(objMovies);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}