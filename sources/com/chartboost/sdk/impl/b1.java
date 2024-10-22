package com.chartboost.sdk.impl;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class b1 implements Comparable<b1> {

    /* renamed from: a, reason: collision with root package name */
    public final h9 f715a;

    /* renamed from: b, reason: collision with root package name */
    public final o7 f716b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final AtomicInteger g;
    public final AtomicReference<x0> h;
    public final long i;
    public final AtomicInteger j;

    public b1(h9 h9Var, o7 o7Var, String str, String str2, String str3, AtomicInteger atomicInteger, AtomicReference<x0> atomicReference, long j, AtomicInteger atomicInteger2, String str4) {
        this.f715a = h9Var;
        this.f716b = o7Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.g = atomicInteger;
        this.h = atomicReference;
        this.i = j;
        this.j = atomicInteger2;
        this.f = str4;
        atomicInteger.incrementAndGet();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(b1 b1Var) {
        return this.f716b.b() - b1Var.f716b.b();
    }

    public void a(Executor executor, boolean z) {
        x0 andSet;
        if ((this.g.decrementAndGet() == 0 || !z) && (andSet = this.h.getAndSet(null)) != null) {
            executor.execute(new y0(andSet, z, (int) TimeUnit.NANOSECONDS.toMillis(this.f715a.b() - this.i), this.j.get()));
        }
    }
}
