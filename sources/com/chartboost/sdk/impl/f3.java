package com.chartboost.sdk.impl;

import defpackage.m20;

/* loaded from: classes.dex */
public final class f3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f814a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f815b;
    public final String c;

    public f3(String str, boolean z, String str2) {
        this.f814a = str;
        this.f815b = z;
        this.c = str2;
    }

    public final String a() {
        return this.f814a;
    }

    public final boolean b() {
        return this.f815b;
    }

    public final String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj;
        return m20.L(this.f814a, f3Var.f814a) && this.f815b == f3Var.f815b && m20.L(this.c, f3Var.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f814a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.f815b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.c.hashCode() + ((hashCode + i) * 31);
    }

    public String toString() {
        return "ConfigurationBodyFields(configVariant=" + this.f814a + ", webViewEnabled=" + this.f815b + ", webViewVersion=" + this.c + ')';
    }
}
