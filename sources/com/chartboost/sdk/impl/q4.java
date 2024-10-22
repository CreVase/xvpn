package com.chartboost.sdk.impl;

import java.io.File;

/* loaded from: classes.dex */
public final class q4 {

    /* renamed from: a, reason: collision with root package name */
    public final i4 f1084a;

    public q4(i4 i4Var) {
        this.f1084a = i4Var;
    }

    public final File a(s3 s3Var) {
        return t3.a(s3Var, this.f1084a.c());
    }

    public final File b(s3 s3Var) {
        return t3.a(s3Var, this.f1084a.a());
    }

    public final void c(s3 s3Var) {
        if (p8.f1074a.d()) {
            b(s3Var).createNewFile();
        }
    }

    public final void d(s3 s3Var) {
        if (p8.f1074a.d()) {
            a(s3Var).delete();
            b(s3Var).delete();
        }
    }

    public final void e(s3 s3Var) {
        if (p8.f1074a.d()) {
            b(s3Var).delete();
            a(s3Var).createNewFile();
        }
    }
}
