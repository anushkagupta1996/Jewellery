package com.student.jewellery;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private CardView bangels,necklace,nosepins,earings,bracelets,mangalsutra,rings,chains;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bangels=findViewById(R.id.bangels1);
        necklace=findViewById(R.id.neckles1);
        nosepins=findViewById(R.id.nosepins1);
        earings=findViewById(R.id.earings1);
        bracelets=findViewById(R.id.bracelets1);
        mangalsutra=findViewById(R.id.mangalsutra1);
        rings=findViewById(R.id.rings1);
        chains=findViewById(R.id.chains);

        bangels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,Bangels.class);
                startActivity(intent);
            }
        });

        necklace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Neckles.class);
                startActivity(intent);
            }
        });

        nosepins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Nosepin.class);
                startActivity(intent);
            }
        });

        earings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Earings.class);
                startActivity(intent);
            }
        });

        bracelets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Bracelets.class);
                startActivity(intent);
            }
        });

        mangalsutra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,Mangalsutra.class);
                startActivity(intent);
            }
        });

        rings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Rings.class);
                startActivity(intent);
            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
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

        if (id == R.id.bracelets) {
            Intent myintent=new Intent(MainActivity.this,Bracelets.class);
            startActivity(myintent);

            // Handle the camera action
        } else if (id == R.id.rings) {
            Intent myintent=new Intent(MainActivity.this,Rings.class);
            startActivity(myintent);

        } else if (id == R.id.neckles) {
            Intent myintent =new Intent(MainActivity.this,Neckles.class);
            startActivity(myintent);

        } else if (id == R.id.earings) {
            Intent myintent =new Intent(MainActivity.this,Earings.class);
            startActivity(myintent);

        } else if (id == R.id.aboutus) {
            Intent myintent=new Intent(MainActivity.this,Aboutus.class);
            startActivity(myintent);

        } else if (id == R.id.nosepins) {

            Intent myintent =new Intent(MainActivity.this,Nosepin.class);
            startActivity(myintent);
        } else if (id == R.id.magalsutra) {

            Intent myintent =new Intent(MainActivity.this,Mangalsutra.class);
            startActivity(myintent);
        } else if (id == R.id.contactus) {

            Intent myintent = new Intent(MainActivity.this,Contactus.class);
            startActivity(myintent);
        } else if (id == R.id.bangels){
            Intent myintent =new Intent(MainActivity.this,Bangels.class);
            startActivity(myintent);
        } else if (id == R.id.chains){
            Intent myintent =new Intent(MainActivity.this,Chains.class);
            startActivity(myintent);
        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
