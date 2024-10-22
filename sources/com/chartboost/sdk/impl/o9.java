package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;

/* loaded from: classes.dex */
public abstract class o9 {

    /* renamed from: a, reason: collision with root package name */
    public String f1048a;

    /* renamed from: b, reason: collision with root package name */
    public String f1049b;
    public long c;
    public float d;
    public a e;
    public j9 f;
    public String g;
    public String h;
    public boolean i;
    public Mediation j;

    /* loaded from: classes.dex */
    public enum a {
        INFO,
        CRITICAL,
        ERROR
    }

    public o9(String str, String str2, String str3, String str4, Mediation mediation) {
        a(str, str2, str3, str4, mediation);
    }

    public final void a(String str, String str2, String str3, String str4, Mediation mediation) {
        d(str);
        c(str2);
        a(0.0f);
        a(str3);
        b(str4);
        this.c = System.currentTimeMillis();
        this.i = false;
        this.j = mediation;
        a(new j9("", "", "", "", ""));
    }

    public void b(String str) {
        this.h = str;
    }

    public void c(String str) {
        this.f1049b = str;
    }

    public void d(String str) {
        this.f1048a = str;
    }

    public Mediation e() {
        return this.j;
    }

    public String f() {
        return this.f1049b;
    }

    public String g() {
        return this.f1048a;
    }

    public long h() {
        return this.c;
    }

    public long i() {
        return this.c / 1000;
    }

    public j9 j() {
        return this.f;
    }

    public a k() {
        return this.e;
    }

    public String toString() {
        return "TrackingEvent{mName='" + this.f1048a + "', mMessage='" + this.f1049b + "', mTimestamp=" + this.c + ", mLatency=" + this.d + ", mType=" + this.e + ", trackAd=" + this.f + ", impressionAdType=" + this.g + ", location=" + this.h + ", mediation=" + this.j + '}';
    }

    public boolean b() {
        return this.i;
    }

    public float c() {
        return this.d;
    }

    public String d() {
        return this.h;
    }

    public void a(float f) {
        this.d = f;
    }

    public void a(a aVar) {
        this.e = aVar;
    }

    public void a(j9 j9Var) {
        this.f = j9Var;
    }

    public String a() {
        return this.g;
    }

    public void a(String str) {
        this.g = str;
    }

    public void a(boolean z) {
        this.i = z;
    }
}
