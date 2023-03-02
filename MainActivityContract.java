package com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.jobsearch.jobconnect.work.jobs.devimpact.R;


public class MainActivityContract extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    Button B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,B26,B27,B28,B29,B30,B31,B32,B33,B34,B35,B36,B37,B38,B39,B40,B41,B42,B43,B44,B45,B46,B47,B48,B49,B50,B51;
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_city);


        AdView adView = findViewById(R.id.adView);

        // Create an ad request.
        AdRequest adRequest = new AdRequest.Builder().build();

        // Start loading the ad in the background.
        adView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-7977505325397665/1689477886");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        B1 = (Button)findViewById(R.id.city1);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneAlbuquerque.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B2 = (Button)findViewById(R.id.city2);
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneArlington.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B3 = (Button)findViewById(R.id.city3);
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneAtlanta.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B4 = (Button)findViewById(R.id.city4);
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneAustin.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B5 = (Button)findViewById(R.id.city5);
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneBaltimore.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B6 = (Button)findViewById(R.id.city6);
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneBoston.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B7 = (Button)findViewById(R.id.city7);
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneCharleston.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B8 = (Button)findViewById(R.id.city8);
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneCharlotte.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B9 = (Button)findViewById(R.id.city9);
        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneChicago.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B10 = (Button)findViewById(R.id.city10);
        B10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneColoradoSprings.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B11 = (Button)findViewById(R.id.city11);
        B11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneColumbus.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B12 = (Button)findViewById(R.id.city12);
        B12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneDallas.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B13 = (Button)findViewById(R.id.city13);
        B13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneDenver.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B14 = (Button)findViewById(R.id.city14);
        B14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneDetroit.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B15 = (Button)findViewById(R.id.city15);
        B15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneElPaso.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B16 = (Button)findViewById(R.id.city16);
        B16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneFortWorth.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B17 = (Button)findViewById(R.id.city17);
        B17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneFresno.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B18 = (Button)findViewById(R.id.city18);
        B18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneHonolulu.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B19 = (Button)findViewById(R.id.city19);
        B19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneHouston.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B20 = (Button)findViewById(R.id.city20);
        B20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneIndianapolis.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B21 = (Button)findViewById(R.id.city21);
        B21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneJacksonville.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B22 = (Button)findViewById(R.id.city22);
        B22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneJerseyCity.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B23 = (Button)findViewById(R.id.city23);
        B23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneKansasCity.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B24 = (Button)findViewById(R.id.city24);
        B24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneLasVegas.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B25 = (Button)findViewById(R.id.city25);
        B25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneLosAngeles.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B26 = (Button)findViewById(R.id.city26);
        B26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneLouisville.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B27 = (Button)findViewById(R.id.city27);
        B27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneMemphis.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B28 = (Button)findViewById(R.id.city28);
        B28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneMesa.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B29 = (Button)findViewById(R.id.city29);
        B29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneMiami.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B30 = (Button)findViewById(R.id.city30);
        B30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneMilwaukee.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B31 = (Button)findViewById(R.id.city31);
        B31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneMinneapolis.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B32 = (Button)findViewById(R.id.city32);
        B32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneNashville.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B33 = (Button)findViewById(R.id.city33);
        B33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneNewOrleans.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B34 = (Button)findViewById(R.id.city34);
        B34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneNewYork.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B35 = (Button)findViewById(R.id.city35);
        B35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneOklahomaCity.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B36 = (Button)findViewById(R.id.city36);
        B36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneOmaha.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B37 = (Button)findViewById(R.id.city37);
        B37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOnePhiladelphia.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B38 = (Button)findViewById(R.id.city38);
        B38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOnePhoenix.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B39 = (Button)findViewById(R.id.city39);
        B39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneRaleigh.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B40 = (Button)findViewById(R.id.city40);
        B40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneSacramento.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B41 = (Button)findViewById(R.id.city41);
        B41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneSaltLakeCity.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B42 = (Button)findViewById(R.id.city42);
        B42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneSanAntonio.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B43 = (Button)findViewById(R.id.city43);
        B43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneSanDiego.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B44 = (Button)findViewById(R.id.city44);
        B44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneSanFrancisco.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B45 = (Button)findViewById(R.id.city45);
        B45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneSanJose.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B46 = (Button)findViewById(R.id.city46);
        B46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneSeattle.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B47 = (Button)findViewById(R.id.city47);
        B47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneTucson.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B48 = (Button)findViewById(R.id.city48);
        B48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneTulsa.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B49 = (Button)findViewById(R.id.city49);
        B49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneVirginiaBeach.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        B50 = (Button)findViewById(R.id.city50);
        B50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneWashingtonDC.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });

		 B51 = (Button)findViewById(R.id.city51);
        B51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.one.CityOneWichita.class);                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
		
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if (item.getItemId()==android.R.id.home){

            finish();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
