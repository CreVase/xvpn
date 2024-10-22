package com.vungle.ads.internal.task;

/* loaded from: classes2.dex */
public final class JobRunnerThreadPriorityHelper implements ThreadPriorityHelper {
    @Override // com.vungle.ads.internal.task.ThreadPriorityHelper
    public int makeAndroidThreadPriority(JobInfo jobInfo) {
        return Math.min(19, Math.abs(Math.min(0, jobInfo.getPriority() - 2)) + 10);
    }
}
