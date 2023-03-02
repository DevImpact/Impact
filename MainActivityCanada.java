package com.seekers.job.work.jobnumbers.devimpact.activities.jobs;

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
import com.seekers.job.work.jobnumbers.devimpact.R;


public class MainActivityCanada extends AppCompatActivity {


    private InterstitialAd mInterstitialAd;
    private AdView adView;
    Button B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,B26,B27,B28,B29,B30,B31,B32,B33,B34,B35,B36,B37,B38,B39,B40,B41,B42,B43,B44,B45,B46,B47,B48,B49,B50,B51;
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_city);
  

        adView = findViewById(R.id.adView);

        // Create an ad request.
        AdRequest adRequest = new AdRequest.Builder().build();

        // Start loading the ad in the background.
        adView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-7977505325397665/1689477886");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        B1 = (Button)findViewById(R.id.city1); B1.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneAbbotsford.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B2 = (Button)findViewById(R.id.city1); B2.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneAirdrie.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B3 = (Button)findViewById(R.id.city1); B3.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneBanff.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B4 = (Button)findViewById(R.id.city1); B4.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneBarrie.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B5 = (Button)findViewById(R.id.city1); B5.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneBrampton.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B6 = (Button)findViewById(R.id.city1); B6.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneBurnaby.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B7 = (Button)findViewById(R.id.city1); B7.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneCalgary.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B8 = (Button)findViewById(R.id.city1); B8.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneCharlottetown.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B9 = (Button)findViewById(R.id.city1); B9.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneChilliwack.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B10 = (Button)findViewById(R.id.city1); B10.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneCoquitlam.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B11 = (Button)findViewById(R.id.city1); B11.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneDelta.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B12 = (Button)findViewById(R.id.city1); B12.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneEdmonton.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B13 = (Button)findViewById(R.id.city1); B13.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneFredericton.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B14 = (Button)findViewById(R.id.city1); B14.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneGrandePrairie.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B15 = (Button)findViewById(R.id.city1); B15.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneGreaterSudbury.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B16 = (Button)findViewById(R.id.city1); B16.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneHalifaxRegionalMunicipality.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B17 = (Button)findViewById(R.id.city1); B17.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneHamilton.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B18 = (Button)findViewById(R.id.city1); B18.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneKamloops.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B19 = (Button)findViewById(R.id.city1); B19.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneKelowna.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B20 = (Button)findViewById(R.id.city1); B20.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneKingston.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B21 = (Button)findViewById(R.id.city1); B21.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneKitchener.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B22 = (Button)findViewById(R.id.city1); B22.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneLethbridge.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B23 = (Button)findViewById(R.id.city1); B23.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneLondon.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B24 = (Button)findViewById(R.id.city1); B24.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneMedicineHat.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B25 = (Button)findViewById(R.id.city1); B25.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneMississauga.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B26 = (Button)findViewById(R.id.city1); B26.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneMoncton.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B27 = (Button)findViewById(R.id.city1); B27.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneMontreal.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B28 = (Button)findViewById(R.id.city1); B28.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneNanaimo.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B29 = (Button)findViewById(R.id.city1); B29.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneNewWestminster.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B30 = (Button)findViewById(R.id.city1); B30.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneNorthVancouver.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B31 = (Button)findViewById(R.id.city1); B31.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneOttawa.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B32 = (Button)findViewById(R.id.city1); B32.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOnePortCoquitlam.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B33 = (Button)findViewById(R.id.city1); B33.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOnePrinceGeorge.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B34 = (Button)findViewById(R.id.city1); B34.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneQuebecCity.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B35 = (Button)findViewById(R.id.city1); B35.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneRedDeer.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B36 = (Button)findViewById(R.id.city1); B36.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneRegina.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B37 = (Button)findViewById(R.id.city1); B37.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneRichmond.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B38 = (Button)findViewById(R.id.city1); B38.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneSaintJohn.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B39 = (Button)findViewById(R.id.city1); B39.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneSaskatoon.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B40 = (Button)findViewById(R.id.city1); B40.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneSherbrooke.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B41 = (Button)findViewById(R.id.city1); B41.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneStAlbert.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B42 = (Button)findViewById(R.id.city1); B42.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneStJohns.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B43 = (Button)findViewById(R.id.city1); B43.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneSurrey.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B44 = (Button)findViewById(R.id.city1); B44.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneThunderBay.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B45 = (Button)findViewById(R.id.city1); B45.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneToronto.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B46 = (Button)findViewById(R.id.city1); B46.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneTroisRivieres.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B47 = (Button)findViewById(R.id.city1); B47.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneVancouver.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B48 = (Button)findViewById(R.id.city1); B48.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneVictoria.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B49 = (Button)findViewById(R.id.city1); B49.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneWhitehorse.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B50 = (Button)findViewById(R.id.city1); B50.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneWindsor.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
        B51 = (Button)findViewById(R.id.city1); B51.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Intent i1 = new Intent(com.seekers.job.work.jobnumbers.devimpact.activities.jobs.MainActivityCanada.this, com.seekers.job.work.jobnumbers.devimpact.activities.jobs.canada.CityOneWinnipeg.class); startActivity(i1); if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); } else { Log.d("TAG", "The interstitial wasn't loaded yet."); } } });
		
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