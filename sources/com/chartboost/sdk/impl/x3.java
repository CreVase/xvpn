package com.chartboost.sdk.impl;

import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public class x3 {

    /* renamed from: a, reason: collision with root package name */
    public int f1289a;

    /* renamed from: b, reason: collision with root package name */
    public int f1290b;
    public final HashMap<String, Long> c = new HashMap<>();
    public final HashMap<String, Integer> d = new HashMap<>();
    public final HashSet<String> e = new HashSet<>();

    public x3(int i, int i2) {
        this.f1289a = 10;
        this.f1290b = 30;
        this.f1289a = i;
        this.f1290b = i2;
    }

    public final long a(long j, long j2) {
        return (j - j2) / 1000;
    }

    public synchronized o9 b(o9 o9Var) {
        if (o9Var == null) {
            return null;
        }
        String g = o9Var.g();
        long h = o9Var.h();
        long a2 = a(o9Var);
        a(g, h);
        if (a(h, a2) > this.f1290b) {
            this.c.remove(g);
            a(g, h);
            this.d.remove(g);
        }
        if (this.e.contains(g)) {
            return null;
        }
        if (a(g, a(g)) > this.f1289a) {
            this.e.add(o9Var.g());
            return new y5("too_many_events", g, "", "");
        }
        return o9Var;
    }

    public final void a(String str, long j) {
        if (this.c.containsKey(str)) {
            return;
        }
        this.c.put(str, Long.valueOf(j));
    }

    public final int a(String str, int i) {
        int i2 = i + 1;
        this.d.put(str, Integer.valueOf(i2));
        return i2;
    }

    public final int a(String str) {
        Integer num = this.d.get(str);
        if (num == null) {
            num = 0;
        }
        return num.intValue();
    }

    public final long a(o9 o9Var) {
        Long l = this.c.get(o9Var.g());
        if (l == null) {
            l = Long.valueOf(o9Var.h());
        }
        return l.longValue();
    }
}
