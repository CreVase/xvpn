package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.impl.xb;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes.dex */
public class za implements xb.a {
    public static za f = new za(new xb());

    /* renamed from: a, reason: collision with root package name */
    public gc f1339a = new gc();

    /* renamed from: b, reason: collision with root package name */
    public Date f1340b;
    public boolean c;
    public xb d;
    public boolean e;

    public za(xb xbVar) {
        this.d = xbVar;
    }

    public static za a() {
        return f;
    }

    public Date b() {
        Date date = this.f1340b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public final void c() {
        if (!this.c || this.f1340b == null) {
            return;
        }
        Iterator<xa> it = rb.c().a().iterator();
        while (it.hasNext()) {
            it.next().k().a(b());
        }
    }

    public void d() {
        Date a2 = this.f1339a.a();
        Date date = this.f1340b;
        if (date == null || a2.after(date)) {
            this.f1340b = a2;
            c();
        }
    }

    public void a(Context context) {
        if (this.c) {
            return;
        }
        this.d.a(context);
        this.d.a(this);
        this.d.e();
        this.e = this.d.c();
        this.c = true;
    }

    @Override // com.chartboost.sdk.impl.xb.a
    public void a(boolean z) {
        if (!this.e && z) {
            d();
        }
        this.e = z;
    }
}
