package com.jobsearch.jobconnect.work.jobs.devimpact.activities;



import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jobsearch.jobconnect.work.jobs.devimpact.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class JobConnectFragment extends Fragment {

    private String videoID = "";
    public JobConnectFragment() {
        // Required empty public constructor
    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_jobconnect, container, false);
  //// add to FrameLayout as inside the Home Fragment

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
       transaction.commit();
        rootView.findViewById(R.id.jobconnect1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityContract.class);
                startActivity(intent);
            }
        });

        rootView.findViewById(R.id.jobconnect2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), com.jobsearch.jobconnect.work.jobs.devimpact.activities.jobs.MainActivityFullTime.class);
                startActivity(intent);
            }
        });
        return rootView;
    }


}
