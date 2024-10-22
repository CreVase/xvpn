package com.chartboost.sdk.impl;

import java.io.File;

/* loaded from: classes.dex */
public final class ca {

    /* renamed from: a, reason: collision with root package name */
    public long f741a;

    /* renamed from: b, reason: collision with root package name */
    public int f742b;
    public int c;
    public long d;
    public long e;
    public long f;
    public int g;
    public final a2 h;
    public volatile long i;
    public volatile int j;

    public ca(long j, int i, int i2, long j2, long j3, long j4, int i3, a2 a2Var) {
        this.f741a = j;
        this.f742b = i;
        this.c = i2;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = i3;
        this.h = a2Var;
    }

    public final void a(int i) {
        this.g = i;
    }

    public final long b() {
        return this.f741a;
    }

    public final void c(long j) {
        this.f741a = j;
    }

    public final void d(long j) {
        this.d = j;
    }

    public final void e(long j) {
        this.e = j;
    }

    public final void f(long j) {
        this.f = j;
    }

    public final boolean g() {
        boolean z;
        String unused;
        h();
        if (this.j >= c()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            p8.a("Video loading limit reached, will resume in timeToResetWindow: " + d());
        }
        unused = da.f772a;
        return z;
    }

    public final void h() {
        boolean z;
        String unused;
        String unused2;
        unused = da.f772a;
        if (e() > f()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            unused2 = da.f772a;
            p8.a("Video loading limit reset");
            this.j = 0;
            this.i = 0L;
        }
    }

    public final long i() {
        return f() - (c9.a() - this.i);
    }

    public final void a() {
        String unused;
        unused = da.f772a;
        if (this.i == 0) {
            this.i = c9.a();
        }
        this.j++;
    }

    public final void b(int i) {
        this.f742b = i;
    }

    public final void c(int i) {
        this.c = i;
    }

    public final long d() {
        return f() - e();
    }

    public final long e() {
        return c9.a() - this.i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:            if (r0.d() == true) goto L8;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f() {
        /*
            r4 = this;
            com.chartboost.sdk.impl.a2 r0 = r4.h
            if (r0 == 0) goto Lc
            boolean r0 = r0.d()
            r1 = 1
            if (r0 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 == 0) goto L12
            long r0 = r4.e
            goto L14
        L12:
            long r0 = r4.d
        L14:
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2
            long r0 = r0 * r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.ca.f():long");
    }

    public final boolean b(long j) {
        return j >= this.f741a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:            if (r0.d() == true) goto L8;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c() {
        /*
            r2 = this;
            com.chartboost.sdk.impl.a2 r0 = r2.h
            if (r0 == 0) goto Lc
            boolean r0 = r0.d()
            r1 = 1
            if (r0 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 == 0) goto L12
            int r0 = r2.c
            goto L14
        L12:
            int r0 = r2.f742b
        L14:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.ca.c():int");
    }

    public final boolean a(File file) {
        return a(file.lastModified());
    }

    public final boolean a(long j) {
        return c9.a() - j > this.f * ((long) 1000);
    }
}
