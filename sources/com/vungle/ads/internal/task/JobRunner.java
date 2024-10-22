package com.vungle.ads.internal.task;

/* loaded from: classes2.dex */
public interface JobRunner {
    void cancelPendingJob(String str);

    void execute(JobInfo jobInfo);
}
