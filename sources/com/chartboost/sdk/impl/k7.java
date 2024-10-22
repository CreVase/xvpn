package com.chartboost.sdk.impl;

/* loaded from: classes.dex */
public class k7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f952a;

    /* renamed from: b, reason: collision with root package name */
    public final String f953b;

    public k7(String str, String str2) {
        this.f952a = str;
        this.f953b = str2;
    }

    public static k7 a(String str, String str2) {
        kc.a(str, "Name is null or empty");
        kc.a(str2, "Version is null or empty");
        return new k7(str, str2);
    }

    public String b() {
        return this.f953b;
    }

    public String a() {
        return this.f952a;
    }
}
