package com.jobsearch.jobconnect.work.jobs.devimpact.activities;

import java.io.Serializable;

public class JobConnectInfo implements Serializable {
    String JobName;
    String JobDetail;
    String jobconnectphoto;
    //Category either : fansclubiste (1-99), SilverFans(100-999), goldenFans(>10e6) , DiamondFans()
    public JobConnectInfo(String jobname, String jobdetail, String jobconnectphoto) {
        JobName = jobname;
        JobDetail = jobdetail;
        this.jobconnectphoto = jobconnectphoto;
    }
    public JobConnectInfo(String jobname, String jobdetail) {
        JobName = jobname;
        JobDetail = jobdetail;
        this.jobconnectphoto = "";
    }
    public String getJobName() {
        return JobName;
    }
    public String getJobDetail() {
        return JobDetail;
    }
    public String getPersonalPhoto() {
        return jobconnectphoto;
    }

}
