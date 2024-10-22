package com.chartboost.sdk.impl;

import defpackage.ng0;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f1077a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1078b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* loaded from: classes.dex */
    public static final class a extends q {
        public static final a g = new a();

        public a() {
            super("Banner", "/auction/sdk/banner", "/banner/show", true, false, 16, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q {
        public static final b g = new b();

        public b() {
            super("Interstitial", "webview/%s/interstitial/get", "/interstitial/show", false, false, 24, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q {
        public static final c g = new c();

        public c() {
            super("Rewarded", "webview/%s/reward/get", "/reward/show", false, false, 8, null);
        }
    }

    public /* synthetic */ q(String str, String str2, String str3, boolean z, boolean z2, ng0 ng0Var) {
        this(str, str2, str3, z, z2);
    }

    public final boolean a() {
        return this.e;
    }

    public final String b() {
        return this.f1077a;
    }

    public final boolean c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.f1078b;
    }

    public final boolean f() {
        return this.f;
    }

    public q(String str, String str2, String str3, boolean z, boolean z2) {
        this.f1077a = str;
        this.f1078b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = !z;
    }

    public /* synthetic */ q(String str, String str2, String str3, boolean z, boolean z2, int i, ng0 ng0Var) {
        this(str, str2, str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, null);
    }
}
