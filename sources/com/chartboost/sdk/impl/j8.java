package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.internal.Libraries.CBUtility;
import defpackage.p71;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f938a;

    /* renamed from: b, reason: collision with root package name */
    public final String f939b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final JSONObject m;
    public final String n;
    public final String o;
    public final Integer p;
    public final l2 q;
    public final q7 r;
    public final y8 s;
    public final y4 t;
    public final z7 u;
    public final i9 v;
    public final f3 w;
    public final o3 x;
    public final i6 y;

    public j8(String str, String str2, y4 y4Var, z7 z7Var, l2 l2Var, y8 y8Var, i9 i9Var, q7 q7Var, f3 f3Var, o3 o3Var, i6 i6Var) {
        String str3;
        String str4;
        this.t = y4Var;
        this.u = z7Var;
        this.q = l2Var;
        this.s = y8Var;
        this.v = i9Var;
        this.r = q7Var;
        this.h = str;
        this.i = str2;
        this.w = f3Var;
        this.x = o3Var;
        this.y = i6Var;
        String str5 = Build.PRODUCT;
        if (!"sdk".equals(str5) && !"google_sdk".equals(str5) && ((str4 = Build.MANUFACTURER) == null || !str4.contains("Genymotion"))) {
            this.f938a = Build.MODEL;
        } else {
            this.f938a = "Android Simulator";
        }
        String str6 = Build.MANUFACTURER;
        if (str6 == null) {
            str3 = "unknown";
        } else {
            str3 = str6;
        }
        this.k = str3;
        StringBuilder p = p71.p(str6, " ");
        p.append(Build.MODEL);
        this.j = p.toString();
        this.l = o3Var.b();
        this.f939b = "Android " + Build.VERSION.RELEASE;
        this.c = Locale.getDefault().getCountry();
        this.d = Locale.getDefault().getLanguage();
        this.g = "9.4.1";
        this.e = o3Var.i();
        this.f = o3Var.g();
        this.n = b(l2Var);
        this.m = a(l2Var);
        this.o = CBUtility.a();
        this.p = z7Var.a();
    }

    public final JSONObject a(l2 l2Var) {
        if (l2Var != null) {
            return a(l2Var, new n2());
        }
        return new JSONObject();
    }

    public final String b(l2 l2Var) {
        return l2Var != null ? l2Var.d() : "";
    }

    public y4 c() {
        return this.t;
    }

    public i6 d() {
        return this.y;
    }

    public Integer e() {
        return Integer.valueOf(this.x.f());
    }

    public q7 f() {
        return this.r;
    }

    public z7 g() {
        return this.u;
    }

    public y8 h() {
        return this.s;
    }

    public int i() {
        y8 y8Var = this.s;
        if (y8Var != null) {
            return y8Var.f();
        }
        return -1;
    }

    public i9 j() {
        return this.v;
    }

    public o3 b() {
        return this.x;
    }

    public JSONObject a(l2 l2Var, n2 n2Var) {
        if (n2Var != null) {
            return n2Var.a(l2Var);
        }
        return new JSONObject();
    }

    public f3 a() {
        return this.w;
    }
}
