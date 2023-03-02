package com.seekers.job.work.jobnumbers.devimpact.activities.jobs.usa;

import androidx.appcompat.app.AppCompatActivity;
import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;
import com.seekers.job.work.jobnumbers.devimpact.R;
import com.seekers.job.work.jobnumbers.devimpact.activities.JobConnectAdapter;
import com.seekers.job.work.jobnumbers.devimpact.activities.JobConnectInfo;

public class CityOneAtlanta extends AppCompatActivity {

    ArrayList<JobConnectInfo> fanList;
    ListView lv;
    JobConnectAdapter adapter;
    private AdView adView;
    public ProgressDialog mProgressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
   adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        fanList = new ArrayList<JobConnectInfo>();
        lv = (ListView) findViewById(R.id.linearv1);
       
        if (isNetworkConnected()) {
            showProgressDialog();
            FirebaseDatabase.getInstance().getReference("JobConnectOne/CityOneAtlanta").orderByValue().addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    if (!dataSnapshot.exists()) {
                        hideProgressDialog();
                        return;
                    }
                    for (DataSnapshot dataSnapshotItem : dataSnapshot.getChildren()) {
                      
                        fanList.add(new JobConnectInfo( dataSnapshotItem.child("jobvitename").getValue(String.class), dataSnapshotItem.child("jobviteodetail").getValue(String.class), dataSnapshotItem.child("jobconnectphoto").getValue(String.class)));
                    }
                    if (fanList.size() > 0) {
                        adapter = new JobConnectAdapter(CityOneAtlanta.this, fanList);
                        lv.setAdapter(adapter);
                        adapter.notifyDataSetChanged();
                        hideProgressDialog();
                    }
                }
                @Override
                public void onCancelled(DatabaseError databaseError) {
                 
                    Toast.makeText(CityOneAtlanta.this, databaseError.getMessage(), Toast.LENGTH_LONG).show();
                }
            });
        }else {
            Toast.makeText(CityOneAtlanta.this, R.string.check_the_network, Toast.LENGTH_LONG).show();
            hideProgressDialog();
        }
        

    }

    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo ni = cm.getActiveNetworkInfo();
        if (ni != null) {
            return true;
        } else {
            return false;
        }
    }
    public void showProgressDialog() {
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(this);
            mProgressDialog.setMessage(getString(R.string.loading));
            mProgressDialog.setIndeterminate(true);
        }
        mProgressDialog.show();
    }
    public void hideProgressDialog() {
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }
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
