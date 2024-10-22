package com.vungle.ads.internal.task;

import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public interface Job {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Result {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int FAILURE = 1;
        public static final int RESCHEDULE = 2;
        public static final int SUCCESS = 0;

        /* loaded from: classes2.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int FAILURE = 1;
            public static final int RESCHEDULE = 2;
            public static final int SUCCESS = 0;

            private Companion() {
            }
        }
    }

    int onRunJob(Bundle bundle, JobRunner jobRunner);
}
