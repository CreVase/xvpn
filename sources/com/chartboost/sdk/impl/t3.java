package com.chartboost.sdk.impl;

import defpackage.hx2;
import defpackage.jm0;
import java.io.File;

/* loaded from: classes.dex */
public final class t3 {
    public static final String a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 7 ? hx2.m("UNKNOWN STATE ", i) : "STATE_RESTARTING" : "STATE_REMOVING" : "STATE_FAILED" : "STATE_COMPLETED" : "STATE_DOWNLOADING" : "STATE_STOPPED" : "STATE_QUEUED";
    }

    public static final s3 a(jm0 jm0Var) {
        return new s3(jm0Var);
    }

    public static final File a(s3 s3Var, File file) {
        return new File(file, s3Var.b());
    }
}
