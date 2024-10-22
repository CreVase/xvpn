package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes.dex */
public class rb {
    public static rb c = new rb();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<xa> f1115a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<xa> f1116b = new ArrayList<>();

    public static rb c() {
        return c;
    }

    public Collection<xa> a() {
        return Collections.unmodifiableCollection(this.f1116b);
    }

    public Collection<xa> b() {
        return Collections.unmodifiableCollection(this.f1115a);
    }

    public boolean d() {
        return this.f1116b.size() > 0;
    }

    public void a(xa xaVar) {
        this.f1115a.add(xaVar);
    }

    public void b(xa xaVar) {
        boolean d = d();
        this.f1115a.remove(xaVar);
        this.f1116b.remove(xaVar);
        if (!d || d()) {
            return;
        }
        mc.c().e();
    }

    public void c(xa xaVar) {
        boolean d = d();
        this.f1116b.add(xaVar);
        if (d) {
            return;
        }
        mc.c().d();
    }
}
