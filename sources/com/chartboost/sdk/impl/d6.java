package com.chartboost.sdk.impl;

import defpackage.m20;

/* loaded from: classes.dex */
public final class d6 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f762a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f763b;
    public final Integer c;
    public final Integer d;

    public d6(s0 s0Var, boolean z, Integer num, Integer num2) {
        this.f762a = s0Var;
        this.f763b = z;
        this.c = num;
        this.d = num2;
    }

    public final s0 a() {
        return this.f762a;
    }

    public final Integer b() {
        return this.c;
    }

    public final Integer c() {
        return this.d;
    }

    public final boolean d() {
        return this.f763b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6)) {
            return false;
        }
        d6 d6Var = (d6) obj;
        return m20.L(this.f762a, d6Var.f762a) && this.f763b == d6Var.f763b && m20.L(this.c, d6Var.c) && m20.L(this.d, d6Var.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f762a.hashCode() * 31;
        boolean z = this.f763b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        Integer num = this.c;
        int hashCode2 = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "LoadParams(appRequest=" + this.f762a + ", isCacheRequest=" + this.f763b + ", bannerHeight=" + this.c + ", bannerWidth=" + this.d + ')';
    }
}
