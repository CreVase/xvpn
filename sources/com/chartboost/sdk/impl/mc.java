package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Handler;
import com.chartboost.sdk.impl.xb;
import java.util.Iterator;

/* loaded from: classes.dex */
public class mc implements xb.a, qb {
    public static mc f;

    /* renamed from: a, reason: collision with root package name */
    public float f1002a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public final fc f1003b;
    public final ib c;
    public bc d;
    public rb e;

    public mc(fc fcVar, ib ibVar) {
        this.f1003b = fcVar;
        this.c = ibVar;
    }

    public static mc c() {
        if (f == null) {
            f = new mc(new fc(), new ib());
        }
        return f;
    }

    public final rb a() {
        if (this.e == null) {
            this.e = rb.c();
        }
        return this.e;
    }

    public float b() {
        return this.f1002a;
    }

    public void d() {
        jb.g().a(this);
        jb.g().e();
        r9.h().i();
        this.d.c();
    }

    public void e() {
        r9.h().k();
        jb.g().f();
        this.d.d();
    }

    @Override // com.chartboost.sdk.impl.qb
    public void a(float f2) {
        this.f1002a = f2;
        Iterator<xa> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().k().a(f2);
        }
    }

    public void a(Context context) {
        this.d = this.f1003b.a(new Handler(), context, this.c.a(), this);
    }

    @Override // com.chartboost.sdk.impl.xb.a
    public void a(boolean z) {
        if (z) {
            r9.h().i();
        } else {
            r9.h().g();
        }
    }
}
