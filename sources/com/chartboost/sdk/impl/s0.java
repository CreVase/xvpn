package com.chartboost.sdk.impl;

import defpackage.m20;
import defpackage.ng0;
import defpackage.p71;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1119a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1120b;
    public String c;
    public s d;
    public r e;
    public boolean f;
    public boolean g;

    public s0(int i, String str, String str2, s sVar, r rVar, boolean z, boolean z2) {
        this.f1119a = i;
        this.f1120b = str;
        this.c = str2;
        this.d = sVar;
        this.e = rVar;
        this.f = z;
        this.g = z2;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final s b() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.f1120b;
    }

    public final boolean e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f1119a == s0Var.f1119a && m20.L(this.f1120b, s0Var.f1120b) && m20.L(this.c, s0Var.c) && m20.L(this.d, s0Var.d) && m20.L(this.e, s0Var.e) && this.f == s0Var.f && this.g == s0Var.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int h = p71.h(this.f1120b, this.f1119a * 31, 31);
        String str = this.c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (h + hashCode) * 31;
        s sVar = this.d;
        if (sVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = sVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        r rVar = this.e;
        if (rVar != null) {
            i = rVar.hashCode();
        }
        int i4 = (i3 + i) * 31;
        boolean z = this.f;
        int i5 = 1;
        int i6 = z;
        if (z != 0) {
            i6 = 1;
        }
        int i7 = (i4 + i6) * 31;
        boolean z2 = this.g;
        if (!z2) {
            i5 = z2 ? 1 : 0;
        }
        return i7 + i5;
    }

    public String toString() {
        return "AppRequest(id=" + this.f1119a + ", location=" + this.f1120b + ", bidResponse=" + this.c + ", bannerData=" + this.d + ", adUnit=" + this.e + ", isTrackedCache=" + this.f + ", isTrackedShow=" + this.g + ')';
    }

    public final void a(s sVar) {
        this.d = sVar;
    }

    public final void b(boolean z) {
        this.g = z;
    }

    public final r a() {
        return this.e;
    }

    public final void a(r rVar) {
        this.e = rVar;
    }

    public final void a(boolean z) {
        this.f = z;
    }

    public /* synthetic */ s0(int i, String str, String str2, s sVar, r rVar, boolean z, boolean z2, int i2, ng0 ng0Var) {
        this(i, str, str2, (i2 & 8) != 0 ? null : sVar, (i2 & 16) != 0 ? null : rVar, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2);
    }
}
