package com.chartboost.sdk.impl;

/* loaded from: classes.dex */
public interface ga {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ void a(ga gaVar, long j, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    j = 500;
                }
                gaVar.a(j);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startProgressUpdate");
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        long b();
    }

    void a();

    void a(long j);
}
