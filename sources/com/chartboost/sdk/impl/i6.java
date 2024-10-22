package com.chartboost.sdk.impl;

import defpackage.m20;
import defpackage.p71;

/* loaded from: classes.dex */
public final class i6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f874a;

    /* renamed from: b, reason: collision with root package name */
    public final String f875b;
    public final String c;

    public i6(String str, String str2, String str3) {
        this.f874a = str;
        this.f875b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.f875b;
    }

    public final String c() {
        return this.f874a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6)) {
            return false;
        }
        i6 i6Var = (i6) obj;
        return m20.L(this.f874a, i6Var.f874a) && m20.L(this.f875b, i6Var.f875b) && m20.L(this.c, i6Var.c);
    }

    public int hashCode() {
        return this.c.hashCode() + p71.h(this.f875b, this.f874a.hashCode() * 31, 31);
    }

    public String toString() {
        return "MediationBodyFields(mediationName=" + this.f874a + ", libraryVersion=" + this.f875b + ", adapterVersion=" + this.c + ')';
    }
}
