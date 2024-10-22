package com.chartboost.sdk.impl;

/* loaded from: classes.dex */
public class y0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f1302a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1303b;
    public final int c;
    public final int d;

    public y0(x0 x0Var, boolean z, int i, int i2) {
        this.f1302a = x0Var;
        this.f1303b = z;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1302a.a(this.f1303b);
    }
}
