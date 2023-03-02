package com.jobsearch.jobconnect.work.jobs.devimpact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class Jobs extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    private AdView adView;
    Button B1,B2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types_job);


        adView = findViewById(R.id.adView);

        // Create an ad request.
        AdRequest adRequest = new AdRequest.Builder().build();

        // Start loading the ad in the background.
        adView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-7977505325397665/1689477886");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

       
        B1 = (Button)findViewById(R.id.usajobvite1);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Jobs.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityFullTime.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });


        B2 = (Button)findViewById(R.id.usajobvite2);
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Jobs.this, com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.class);
                startActivity(i1);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });




    }

}
