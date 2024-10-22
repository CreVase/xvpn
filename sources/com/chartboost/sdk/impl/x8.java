package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import com.chartboost.sdk.impl.q;
import java.util.UUID;

/* loaded from: classes.dex */
public class x8 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f1294a;

    /* renamed from: b, reason: collision with root package name */
    public String f1295b;
    public int d;
    public long c = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;

    public x8(SharedPreferences sharedPreferences) {
        this.d = 0;
        this.f1294a = sharedPreferences;
        this.d = f();
    }

    public void a() {
        this.f1295b = b();
        this.c = System.currentTimeMillis();
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.d++;
        g();
    }

    public int b(q qVar) {
        if (qVar == q.b.g) {
            return this.e;
        }
        if (qVar == q.c.g) {
            return this.f;
        }
        if (qVar == q.a.g) {
            return this.g;
        }
        return 0;
    }

    public int c() {
        return this.d;
    }

    public long d() {
        return System.currentTimeMillis() - this.c;
    }

    public String e() {
        return this.f1295b;
    }

    public final int f() {
        SharedPreferences sharedPreferences = this.f1294a;
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("session_key", 0);
        }
        return -1;
    }

    public final void g() {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.f1294a;
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null) {
            edit.putInt("session_key", this.d).apply();
        }
    }

    public y8 h() {
        return new y8(e(), d(), c(), b(q.a.g), b(q.c.g), b(q.b.g));
    }

    public final String b() {
        String uuid = UUID.randomUUID().toString();
        String a2 = n1.a(uuid);
        return a2 != null ? a2 : uuid;
    }

    public void a(q qVar) {
        if (qVar == q.b.g) {
            this.e++;
        } else if (qVar == q.c.g) {
            this.f++;
        }
        if (qVar == q.a.g) {
            this.g++;
        }
    }
}
