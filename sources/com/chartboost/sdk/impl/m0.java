package com.chartboost.sdk.impl;

import defpackage.m20;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final q9 f980a;

    /* renamed from: b, reason: collision with root package name */
    public final String f981b;

    public m0(q9 q9Var, String str) {
        this.f980a = q9Var;
        this.f981b = str;
    }

    public final String a() {
        return this.f981b;
    }

    public final q9 b() {
        return this.f980a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f980a == m0Var.f980a && m20.L(this.f981b, m0Var.f981b);
    }

    public int hashCode() {
        int hashCode = this.f980a.hashCode() * 31;
        String str = this.f981b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AdvertisingIDHolder(advertisingIDState=" + this.f980a + ", advertisingID=" + this.f981b + ')';
    }
}
