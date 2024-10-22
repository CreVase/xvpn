package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import defpackage.ng0;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class v1<T> {
    public static final a j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f1226a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1227b;
    public final o7 c;
    public final File e;
    public final AtomicInteger d = new AtomicInteger();
    public long f = 0;
    public long g = 0;
    public long h = 0;
    public int i = 0;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(ng0 ng0Var) {
            this();
        }

        public a() {
        }
    }

    public v1(String str, String str2, o7 o7Var, File file) {
        this.f1226a = str;
        this.f1227b = str2;
        this.c = o7Var;
        this.e = file;
    }

    public void a(CBError cBError, y1 y1Var) {
    }

    public final boolean b() {
        return this.d.compareAndSet(0, -1);
    }

    public final String c() {
        return this.f1226a;
    }

    public final o7 d() {
        return this.c;
    }

    public final String e() {
        return this.f1227b;
    }

    public void a(T t, y1 y1Var) {
    }

    public void a(String str, long j2) {
    }

    public w1 a() {
        return new w1(null, null, null);
    }

    public x1<T> a(y1 y1Var) {
        return x1.a((Object) null);
    }
}
