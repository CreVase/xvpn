package com.chartboost.sdk.impl;

import defpackage.ng0;

/* loaded from: classes.dex */
public final class p6 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1070a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1071b;
    public int c;
    public int d;
    public long e;
    public int f;

    public p6() {
        this(false, false, 0, 0, 0L, 0, 63, null);
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.f;
    }

    public final boolean d() {
        return this.f1071b;
    }

    public final long e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6)) {
            return false;
        }
        p6 p6Var = (p6) obj;
        return this.f1070a == p6Var.f1070a && this.f1071b == p6Var.f1071b && this.c == p6Var.c && this.d == p6Var.d && this.e == p6Var.e && this.f == p6Var.f;
    }

    public final boolean f() {
        return this.f1070a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public int hashCode() {
        boolean z = this.f1070a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.f1071b;
        int i2 = (((((i + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.c) * 31) + this.d) * 31;
        long j = this.e;
        return ((i2 + ((int) (j ^ (j >>> 32)))) * 31) + this.f;
    }

    public String toString() {
        return "OmSdkModel(isEnabled=" + this.f1070a + ", verificationEnabled=" + this.f1071b + ", minVisibleDips=" + this.c + ", minVisibleDurationMs=" + this.d + ", visibilityCheckIntervalMs=" + this.e + ", traversalLimit=" + this.f + ')';
    }

    public p6(boolean z, boolean z2, int i, int i2, long j, int i3) {
        this.f1070a = z;
        this.f1071b = z2;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = i3;
    }

    public /* synthetic */ p6(boolean z, boolean z2, int i, int i2, long j, int i3, int i4, ng0 ng0Var) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? false : z2, (i4 & 4) != 0 ? 1 : i, (i4 & 8) == 0 ? i2 : 0, (i4 & 16) != 0 ? 100L : j, (i4 & 32) != 0 ? 25 : i3);
    }
}
