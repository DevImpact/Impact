package com.jobsearch.jobconnect.work.jobs.devimpact.activities;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jobsearch.jobconnect.work.jobs.devimpact.R;

import java.util.ArrayList;

public class JobConnectAdapter extends ArrayAdapter<JobConnectInfo> {

    public JobConnectAdapter(Activity context , ArrayList<JobConnectInfo> Feeds){
        super(context, 0, Feeds);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View ListItemView=convertView;
        if(ListItemView ==null){
            ListItemView= LayoutInflater.from(getContext()).inflate(R.layout.jobconnect_item,parent,false);
        }
        JobConnectInfo currentFan=getItem(position);

        ImageView profileImage=(ImageView)ListItemView.findViewById(R.id.profile_image);

       // profileImage.setImageResource(this.getContext().getResources().getIdentifier("profilfans", "drawable", this.getContext().getPackageName()));

      if(currentFan.getPersonalPhoto().equals(null)||currentFan.getPersonalPhoto().equals("")) {
            profileImage.setImageResource(this.getContext().getResources().getIdentifier("devimpact", "drawable", this.getContext().getPackageName()));
        }else{
            profileImage.setImageResource(this.getContext().getResources().getIdentifier(currentFan.getPersonalPhoto(), "drawable", this.getContext().getPackageName()));
        }

        TextView jobname=(TextView)ListItemView.findViewById(R.id.jobname);
        jobname.setText(this.getContext().getResources().getString(R.string.name)+" "+currentFan.getJobName());

        TextView jobdetail=(TextView)ListItemView.findViewById(R.id.jobdetail);
        jobdetail.setText(this.getContext().getResources().getString(R.string.fund)+" "+currentFan.getJobDetail()+" "+this.getContext().getResources().getString(R.string.unit));

        return ListItemView;
    }
}
