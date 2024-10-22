package com.vungle.ads.internal.task;

import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import defpackage.ng0;

/* loaded from: classes2.dex */
public final class JobRunnable extends PriorityRunnable {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "JobRunnable";
    private final JobCreator creator;
    private final JobRunner jobRunner;
    private final JobInfo jobinfo;
    private final ThreadPriorityHelper threadPriorityHelper;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    public JobRunnable(JobInfo jobInfo, JobCreator jobCreator, JobRunner jobRunner, ThreadPriorityHelper threadPriorityHelper) {
        this.jobinfo = jobInfo;
        this.creator = jobCreator;
        this.jobRunner = jobRunner;
        this.threadPriorityHelper = threadPriorityHelper;
    }

    public static /* synthetic */ void getPriority$annotations() {
    }

    @Override // com.vungle.ads.internal.task.PriorityRunnable
    public int getPriority() {
        return this.jobinfo.getPriority();
    }

    @Override // java.lang.Runnable
    public void run() {
        ThreadPriorityHelper threadPriorityHelper = this.threadPriorityHelper;
        if (threadPriorityHelper != null) {
            try {
                Process.setThreadPriority(threadPriorityHelper.makeAndroidThreadPriority(this.jobinfo));
                this.jobinfo.getJobTag();
            } catch (Throwable unused) {
                Log.e(TAG, "Error on setting process thread priority");
            }
        }
        try {
            String jobTag = this.jobinfo.getJobTag();
            Bundle extras = this.jobinfo.getExtras();
            Thread.currentThread().getName();
            if (this.creator.create(jobTag).onRunJob(extras, this.jobRunner) == 2) {
                long makeNextRescedule = this.jobinfo.makeNextRescedule();
                if (makeNextRescedule > 0) {
                    this.jobinfo.setDelay(makeNextRescedule);
                    this.jobRunner.execute(this.jobinfo);
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "Cannot create job" + e.getLocalizedMessage());
        }
    }
}
