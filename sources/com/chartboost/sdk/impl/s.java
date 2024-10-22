package com.chartboost.sdk.impl;

import android.view.ViewGroup;
import defpackage.m20;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1117a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1118b;
    public final int c;

    public s(ViewGroup viewGroup, int i, int i2) {
        this.f1117a = viewGroup;
        this.f1118b = i;
        this.c = i2;
    }

    public final int a() {
        return this.c;
    }

    public final ViewGroup b() {
        return this.f1117a;
    }

    public final int c() {
        return this.f1118b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return m20.L(this.f1117a, sVar.f1117a) && this.f1118b == sVar.f1118b && this.c == sVar.c;
    }

    public int hashCode() {
        return (((this.f1117a.hashCode() * 31) + this.f1118b) * 31) + this.c;
    }

    public String toString() {
        return "AdUnitBannerData(bannerView=" + this.f1117a + ", bannerWidth=" + this.f1118b + ", bannerHeight=" + this.c + ')';
    }
}
