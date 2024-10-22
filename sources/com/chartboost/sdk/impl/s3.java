package com.chartboost.sdk.impl;

import defpackage.jm0;
import defpackage.m20;

/* loaded from: classes.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    public final jm0 f1124a;

    public s3(jm0 jm0Var) {
        this.f1124a = jm0Var;
    }

    public final jm0 a() {
        return this.f1124a;
    }

    public final String b() {
        return this.f1124a.f2790a.f1509a;
    }

    public final float c() {
        return this.f1124a.h.f4534b;
    }

    public final int d() {
        return this.f1124a.f2791b;
    }

    public final long e() {
        return this.f1124a.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s3) && m20.L(this.f1124a, ((s3) obj).f1124a);
    }

    public final String f() {
        return this.f1124a.f2790a.f1510b.toString();
    }

    public int hashCode() {
        return this.f1124a.hashCode();
    }

    public String toString() {
        return "DownloadWrapper(download=" + this.f1124a + ')';
    }
}
