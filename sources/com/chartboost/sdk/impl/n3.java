package com.chartboost.sdk.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import com.chartboost.sdk.impl.p2;
import defpackage.cf0;
import defpackage.cp3;
import defpackage.di0;
import defpackage.e91;
import defpackage.gn2;
import defpackage.he0;
import defpackage.ii0;
import defpackage.jt;
import defpackage.kh0;
import defpackage.m52;
import defpackage.mt;
import defpackage.om0;
import defpackage.pt;
import defpackage.qm0;
import defpackage.qt1;
import defpackage.rg0;
import defpackage.vu2;
import defpackage.wi3;
import defpackage.wl1;
import defpackage.yd0;
import java.io.File;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class n3 {
    public static /* synthetic */ jt a(i4 i4Var, he0 he0Var, ca caVar, p2.b bVar, pt ptVar, int i, Object obj) {
        if ((i & 16) != 0) {
            ptVar = new p2(caVar.b(), bVar, null, 4, null);
        }
        return a(i4Var, he0Var, caVar, bVar, ptVar);
    }

    public static final File b(Context context) {
        return new s4(context.getCacheDir()).h;
    }

    public static final File c(Context context) {
        return new s4(context.getCacheDir()).i;
    }

    public static final jt a(i4 i4Var, he0 he0Var, ca caVar, p2.b bVar, pt ptVar) {
        return new vu2(i4Var.b(), ptVar, he0Var);
    }

    public static final mt a(jt jtVar, e91 e91Var) {
        mt mtVar = new mt();
        mtVar.f3347a = jtVar;
        mtVar.e = e91Var;
        mtVar.c = null;
        mtVar.d = true;
        return mtVar;
    }

    public static final qm0 a(Context context, he0 he0Var, jt jtVar, e91 e91Var, om0 om0Var, int i, int i2) {
        qm0 qm0Var = new qm0(context, he0Var, jtVar, e91Var, Executors.newFixedThreadPool(i));
        cp3.e(i2 > 0);
        if (qm0Var.j != i2) {
            qm0Var.j = i2;
            qm0Var.f++;
            qm0Var.c.obtainMessage(4, i2, 0).sendToTarget();
        }
        qm0Var.e.add(om0Var);
        return qm0Var;
    }

    public static final he0 a(Context context) {
        return new rg0(new l4(context, null, null, 0, 14, null));
    }

    public static final void a() {
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
        CookieHandler.setDefault(cookieManager);
    }

    public static /* synthetic */ wl1 a(int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 500;
        }
        if ((i3 & 2) != 0) {
            i2 = 50000;
        }
        return a(i, i2);
    }

    public static final wl1 a(int i, int i2) {
        di0.a(i, 0, "bufferForPlaybackMs", "0");
        di0.a(i, 0, "bufferForPlaybackAfterRebufferMs", "0");
        di0.a(i, i, "minBufferMs", "bufferForPlaybackMs");
        di0.a(i, i, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        di0.a(i2, i, "maxBufferMs", "minBufferMs");
        return new di0(new cf0(), i, i2, i, i);
    }

    public static final qt1 a(yd0 yd0Var) {
        return new ii0(yd0Var, new kh0());
    }

    public static /* synthetic */ gn2 a(Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return a(context, i);
    }

    @SuppressLint({"MissingPermission"})
    public static final gn2 a(Context context, int i) {
        if (wi3.f5017a >= 21) {
            return new m52(context, i);
        }
        return null;
    }
}
