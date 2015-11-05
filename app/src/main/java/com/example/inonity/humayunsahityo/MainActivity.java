package com.example.inonity.humayunsahityo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    public ImageButton btnFb,btnTwitter,btnGPlus;
    private String[] quotes;
    public TextView txtViewQuote1,txtViewQuote2,txtViewQuote3 ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        /*
        * navigation drawer
        * */
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        /*
        * initialize quotes in array and generate random numbers to show quotes randomly in textview
        * */
        initializeQuotes();

        Random randomNumber = new Random();
        int ranNum1 = randomNumber.nextInt(9)+1;
        int ranNum2 = randomNumber.nextInt(9)+1;
        int ranNum3 = randomNumber.nextInt(9)+1;


        txtViewQuote1 = (TextView) findViewById(R.id.textViewQuoteOne);
        txtViewQuote2 = (TextView) findViewById(R.id.textViewQuoteTwo);
        txtViewQuote3 = (TextView) findViewById(R.id.textViewQuoteThree);

        txtViewQuote1.setText(quotes[ranNum1]);
        txtViewQuote2.setText(quotes[ranNum2]);
        txtViewQuote3.setText(quotes[ranNum3]);

        btnFb= (ImageButton) findViewById(R.id.imageButtonFb);
        btnFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Browser.class);
                intent.putExtra("url", "http://facebook.com/humayunsahityo");
                startActivity(intent);

            }
        });

        btnTwitter= (ImageButton) findViewById(R.id.imageButtonTwitter);
        btnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Browser.class);
                intent.putExtra("url", "http://twitter.com/ruhul_azam");
                startActivity(intent);

            }
        });
        btnGPlus= (ImageButton) findViewById(R.id.imageButtonGooglePlus);
        btnGPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Browser.class);
                intent.putExtra("url", "http://twitter.com/ruhul_azam");
                startActivity(intent);

            }
        });
/*        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/






    }

    private void initializeQuotes() {
        quotes = new String[]{
                " কিছু কিছু কষ্ট আছে সুখের মতো। আবার কিছু কিছু কষ্ট খুব কঠিন।",
                " এই সংসারে বাস করতে হলে মাঝে মধ্যে কষ্ট পেতে হয়। সংসারের অনেক নিয়মের একটা নিয়ম হলো কষ্ট পাওয়া ।",
                " সন্ধ্যাবেলার এই অদ্ভুত সময়টাতে প্রিয়জনদের কাছে যেতে নেই। তবু সব মানুষই প্রিয়জনদের কাছে যাবার জন্যে এই সময়টাই বেছে নেয়। কেন বেছে নেয় কে জানে?",
                " মেয়েদের বেশি বুদ্ধি থাকা ভালো নয়। সংসারে যে মেয়ের বুদ্ধি কম সে সবচেয়ে সুখী।",
                "মায়ের সঙ্গে মিল আছে এই জাতীয় মেয়ের প্রতি পুরুষেরা প্রচন্ড আকর্ষন বোধ করে।",
                "মানুষের মুখ দেখে কিছু বোঝার উপায় নাই। মানুষ খুব জটিল জিনিস। এর চেয়ে যন্ত্র ভালো। যন্ত্র দেখলে বোঝা যায় যন্ত্র ঠিক আছে না, নষ্ট।",
                " মেয়ে হয়ে জন্মানোর অনেক সমস্যা। কুৎসিত ইঙ্গিত এবং কুৎসিত রসিকতা সব সময় মেয়েদের নিয়েই করা হয়। পুরুষদের নিয়ে নয়।",
                " আমরা দ্রুত ওয়ানটাইমের দিকে এগুচ্ছি। এই অভ্যাস কি আমরা প্রকৃতির কাছ থেকে পেয়েছি? প্রকৃতিও এই রকমই করে। একটা মেঘ একবার ব্যবহার করে ফেলে দেয়। আবার নতুন মেঘ তৈরি করে।",
                "কষ্ট পাওয়ার মধ্যেও এ রকম আনন্দ আছে। যারা কষ্ট পেতে পেতে পেকে গেছে, তাদের কাছে আর কষ্টকে কষ্ট মনে হয়না।",
                " মূর্খ লোকের সাথে তর্কে যাওয়া উচিৎ নয়, কারন সে তোমাকে তার পর্যায়ে নামিয়ে এনে তর্কে হারিয়ে দেবে।"
        };
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);

    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_life_story) {
            // Handle the camera action
            Intent intent = new Intent(MainActivity.this,LifeStory.class);
            startActivity(intent);

        } else if (id == R.id.nav_novels) {
            Intent intent = new Intent(MainActivity.this,NovelsList.class);
            startActivity(intent);

        } else if (id == R.id.nav_movies) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
