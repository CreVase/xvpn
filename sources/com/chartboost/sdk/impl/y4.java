package com.chartboost.sdk.impl;

import defpackage.m20;
import defpackage.ng0;

/* loaded from: classes.dex */
public final class y4 {

    /* renamed from: a, reason: collision with root package name */
    public final q9 f1308a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1309b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;

    public y4() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f1309b;
    }

    public final String c() {
        return this.e;
    }

    public final Integer d() {
        return this.f;
    }

    public final q9 e() {
        return this.f1308a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4)) {
            return false;
        }
        y4 y4Var = (y4) obj;
        return this.f1308a == y4Var.f1308a && m20.L(this.f1309b, y4Var.f1309b) && m20.L(this.c, y4Var.c) && m20.L(this.d, y4Var.d) && m20.L(this.e, y4Var.e) && m20.L(this.f, y4Var.f);
    }

    public final String f() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = this.f1308a.hashCode() * 31;
        String str = this.f1309b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "IdentityBodyFields(trackingState=" + this.f1308a + ", identifiers=" + this.f1309b + ", uuid=" + this.c + ", gaid=" + this.d + ", setId=" + this.e + ", setIdScope=" + this.f + ')';
    }

    public y4(q9 q9Var, String str, String str2, String str3, String str4, Integer num) {
        this.f1308a = q9Var;
        this.f1309b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = num;
    }

    public /* synthetic */ y4(q9 q9Var, String str, String str2, String str3, String str4, Integer num, int i, ng0 ng0Var) {
        this((i & 1) != 0 ? q9.TRACKING_UNKNOWN : q9Var, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) == 0 ? num : null);
    }
}
