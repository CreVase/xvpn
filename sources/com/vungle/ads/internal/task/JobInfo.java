package com.vungle.ads.internal.task;

import android.os.Bundle;
import android.util.Log;
import defpackage.ng0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class JobInfo implements Cloneable {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "JobInfo";
    private long delay;
    private final String jobTag;
    private long nextRescheduleTimeout;
    private int requiredNetworkType;
    private long rescheduleTimeout;
    private boolean updateCurrent;
    private Bundle extras = new Bundle();
    private int reschedulePolicy = 1;
    private int priority = 2;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes2.dex */
    public @interface NetworkType {
        public static final int ANY = 0;
        public static final int CONNECTED = 1;
        public static final Companion Companion = Companion.$$INSTANCE;

        /* loaded from: classes2.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int ANY = 0;
            public static final int CONNECTED = 1;

            private Companion() {
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Priority {
        public static final int CRITICAL = 5;
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int HIGH = 3;
        public static final int HIGHEST = 4;
        public static final int LOW = 1;
        public static final int LOWEST = 0;
        public static final int NORMAL = 2;

        /* loaded from: classes2.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int CRITICAL = 5;
            public static final int HIGH = 3;
            public static final int HIGHEST = 4;
            public static final int LOW = 1;
            public static final int LOWEST = 0;
            public static final int NORMAL = 2;

            private Companion() {
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ReschedulePolicy {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int EXPONENTIAL = 1;
        public static final int LINEAR = 0;

        /* loaded from: classes2.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int EXPONENTIAL = 1;
            public static final int LINEAR = 0;

            private Companion() {
            }
        }
    }

    public JobInfo(String str) {
        this.jobTag = str;
    }

    public static /* synthetic */ void getPriority$annotations() {
    }

    @NetworkType
    public static /* synthetic */ void getRequiredNetworkType$annotations() {
    }

    private static /* synthetic */ void getReschedulePolicy$annotations() {
    }

    public Object clone() {
        return super.clone();
    }

    public final JobInfo copy() {
        try {
            return (JobInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            Log.e(TAG, Log.getStackTraceString(e));
            return null;
        }
    }

    public final long getDelay() {
        return this.delay;
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    public final String getJobTag() {
        return this.jobTag;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final int getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    public final boolean getUpdateCurrent() {
        return this.updateCurrent;
    }

    public final long makeNextRescedule() {
        long j = this.rescheduleTimeout;
        if (j == 0) {
            return 0L;
        }
        long j2 = this.nextRescheduleTimeout;
        if (j2 == 0) {
            this.nextRescheduleTimeout = j;
        } else if (this.reschedulePolicy == 1) {
            this.nextRescheduleTimeout = j2 * 2;
        }
        return this.nextRescheduleTimeout;
    }

    public final JobInfo setDelay(long j) {
        this.delay = j;
        return this;
    }

    public final JobInfo setExtras(Bundle bundle) {
        this.extras = bundle;
        return this;
    }

    public final JobInfo setPriority(int i) {
        this.priority = i;
        return this;
    }

    public final JobInfo setRequiredNetworkType(@NetworkType int i) {
        this.requiredNetworkType = i;
        return this;
    }

    public final JobInfo setReschedulePolicy(long j, int i) {
        this.rescheduleTimeout = j;
        this.reschedulePolicy = i;
        return this;
    }

    public final JobInfo setUpdateCurrent(boolean z) {
        this.updateCurrent = z;
        return this;
    }
}
