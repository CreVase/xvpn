package com.vungle.ads.internal.task;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import defpackage.m20;
import defpackage.ng0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class VungleJobRunner implements JobRunner {
    private final JobCreator creator;
    private final Executor executor;
    private long nextCheck = Long.MAX_VALUE;
    private final List<PendingJob> pendingJobs = new CopyOnWriteArrayList();
    private final Runnable pendingRunnable = new PendingRunnable(new WeakReference(this));
    private final ThreadPriorityHelper threadPriorityHelper;
    public static final Companion Companion = new Companion(null);
    private static final Handler handler = new Handler(Looper.getMainLooper());
    private static final String TAG = "VungleJobRunner";

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class PendingJob {
        private JobInfo info;
        private final long uptimeMillis;

        public PendingJob(long j, JobInfo jobInfo) {
            this.uptimeMillis = j;
            this.info = jobInfo;
        }

        public final JobInfo getInfo() {
            return this.info;
        }

        public final long getUptimeMillis() {
            return this.uptimeMillis;
        }

        public final void setInfo(JobInfo jobInfo) {
            this.info = jobInfo;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PendingRunnable implements Runnable {
        private WeakReference<VungleJobRunner> runner;

        public PendingRunnable(WeakReference<VungleJobRunner> weakReference) {
            this.runner = weakReference;
        }

        public final WeakReference<VungleJobRunner> getRunner() {
            return this.runner;
        }

        @Override // java.lang.Runnable
        public void run() {
            VungleJobRunner vungleJobRunner = this.runner.get();
            if (vungleJobRunner != null) {
                vungleJobRunner.executePendingJobs();
            }
        }

        public final void setRunner(WeakReference<VungleJobRunner> weakReference) {
            this.runner = weakReference;
        }
    }

    public VungleJobRunner(JobCreator jobCreator, Executor executor, ThreadPriorityHelper threadPriorityHelper) {
        this.creator = jobCreator;
        this.executor = executor;
        this.threadPriorityHelper = threadPriorityHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void executePendingJobs() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = Long.MAX_VALUE;
        for (PendingJob pendingJob : this.pendingJobs) {
            if (uptimeMillis >= pendingJob.getUptimeMillis()) {
                this.pendingJobs.remove(pendingJob);
                JobInfo info = pendingJob.getInfo();
                if (info != null) {
                    this.executor.execute(new JobRunnable(info, this.creator, this, this.threadPriorityHelper));
                }
            } else {
                j = Math.min(j, pendingJob.getUptimeMillis());
            }
        }
        if (j != Long.MAX_VALUE && j != this.nextCheck) {
            Handler handler2 = handler;
            handler2.removeCallbacks(this.pendingRunnable);
            handler2.postAtTime(this.pendingRunnable, TAG, j);
        }
        this.nextCheck = j;
    }

    @Override // com.vungle.ads.internal.task.JobRunner
    public synchronized void cancelPendingJob(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        for (PendingJob pendingJob : this.pendingJobs) {
            JobInfo info = pendingJob.getInfo();
            if (info != null) {
                str2 = info.getJobTag();
            } else {
                str2 = null;
            }
            if (m20.L(str2, str)) {
                arrayList.add(pendingJob);
            }
        }
        this.pendingJobs.removeAll(arrayList);
    }

    @Override // com.vungle.ads.internal.task.JobRunner
    public synchronized void execute(JobInfo jobInfo) {
        String str;
        JobInfo copy = jobInfo.copy();
        if (copy != null) {
            String jobTag = copy.getJobTag();
            long delay = copy.getDelay();
            copy.setDelay(0L);
            if (copy.getUpdateCurrent()) {
                for (PendingJob pendingJob : this.pendingJobs) {
                    JobInfo info = pendingJob.getInfo();
                    if (info != null) {
                        str = info.getJobTag();
                    } else {
                        str = null;
                    }
                    if (m20.L(str, jobTag)) {
                        this.pendingJobs.remove(pendingJob);
                    }
                }
            }
            this.pendingJobs.add(new PendingJob(SystemClock.uptimeMillis() + delay, copy));
            executePendingJobs();
        }
    }

    public final int getPendingJobSize$vungle_ads_release() {
        return this.pendingJobs.size();
    }
}
