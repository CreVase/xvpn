package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.Log;
import com.chartboost.sdk.R;
import defpackage.aa0;
import defpackage.ba0;
import defpackage.c90;
import defpackage.ch3;
import defpackage.fl;
import defpackage.ke0;
import defpackage.l41;
import defpackage.p71;
import defpackage.pd0;
import defpackage.v90;
import defpackage.z33;
import defpackage.zf3;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class w6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1261a;

    /* renamed from: b, reason: collision with root package name */
    public final z8 f1262b;
    public final k8 c;
    public final AtomicReference<t8> d;
    public final v90 e;

    @ke0(c = "com.chartboost.sdk.internal.measurement.OpenMeasurementManager$initialize$1", f = "OpenMeasurementManager.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends z33 implements l41 {

        /* renamed from: a, reason: collision with root package name */
        public int f1263a;

        public a(c90 c90Var) {
            super(2, c90Var);
        }

        @Override // defpackage.l41
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(aa0 aa0Var, c90 c90Var) {
            return ((a) create(aa0Var, c90Var)).invokeSuspend(ch3.f636a);
        }

        @Override // defpackage.mn
        public final c90 create(Object obj, c90 c90Var) {
            return new a(c90Var);
        }

        @Override // defpackage.mn
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            ba0 ba0Var = ba0.f430a;
            if (this.f1263a == 0) {
                fl.a0(obj);
                try {
                    r6.a(w6.this.f1261a);
                    str2 = x6.f1291a;
                    f6.a(str2, "OMSDK is initialized successfully!");
                } catch (Exception e) {
                    str = x6.f1291a;
                    p71.z("OMSDK initialization exception: ", e, str);
                }
                return ch3.f636a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public w6(Context context, z8 z8Var, k8 k8Var, AtomicReference<t8> atomicReference, v90 v90Var) {
        this.f1261a = context;
        this.f1262b = z8Var;
        this.c = k8Var;
        this.d = atomicReference;
        this.e = v90Var;
    }

    public final p6 b() {
        p6 p6Var;
        t8 t8Var = this.d.get();
        if (t8Var != null) {
            p6Var = t8Var.b();
        } else {
            p6Var = null;
        }
        if (p6Var == null) {
            return new p6(false, false, 0, 0, 0L, 0, 63, null);
        }
        return p6Var;
    }

    public final k7 c() {
        String str;
        try {
            return k7.a(h(), "9.4.1");
        } catch (Exception e) {
            str = x6.f1291a;
            p71.z("Omid Partner exception: ", e, str);
            return null;
        }
    }

    public final void d() {
        String str;
        String str2;
        String str3;
        if (!f()) {
            str3 = x6.f1291a;
            f6.a(str3, "OMSDK initialize is disabled by the cb config!");
            return;
        }
        if (e()) {
            str2 = x6.f1291a;
            f6.a(str2, "OMSDK initialize is already active!");
            return;
        }
        try {
            zf3.T(pd0.d(this.e), null, new a(null), 3);
        } catch (Exception e) {
            str = x6.f1291a;
            Log.e(str, "Error launching om activate job: " + e);
        }
    }

    public final boolean e() {
        String str;
        try {
            return r6.a();
        } catch (Exception e) {
            str = x6.f1291a;
            f6.a(str, "OMSDK error when checking isActive: " + e);
            return false;
        }
    }

    public final boolean f() {
        p6 b2;
        t8 t8Var = this.d.get();
        if (t8Var != null && (b2 = t8Var.b()) != null) {
            return b2.f();
        }
        return false;
    }

    public final boolean g() {
        p6 b2;
        t8 t8Var = this.d.get();
        if (t8Var != null && (b2 = t8Var.b()) != null) {
            return b2.d();
        }
        return false;
    }

    public final String h() {
        return "Chartboost";
    }

    public final String a(String str) {
        String str2;
        String str3;
        if (!f()) {
            str3 = x6.f1291a;
            f6.b(str3, "OMSDK injectOmidJsIntoHtml is disabled by the cb config!");
            return str;
        }
        if (!r6.a()) {
            return str;
        }
        try {
            return r8.a(a(), str);
        } catch (Exception e) {
            str2 = x6.f1291a;
            p71.z("OmidJS injection exception: ", e, str2);
            return str;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w6(android.content.Context r7, com.chartboost.sdk.impl.z8 r8, com.chartboost.sdk.impl.k8 r9, java.util.concurrent.atomic.AtomicReference r10, defpackage.v90 r11, int r12, defpackage.ng0 r13) {
        /*
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto L8
            qi0 r11 = defpackage.vl0.f4854a
            yo1 r11 = defpackage.zo1.f5522a
        L8:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.w6.<init>(android.content.Context, com.chartboost.sdk.impl.z8, com.chartboost.sdk.impl.k8, java.util.concurrent.atomic.AtomicReference, v90, int, ng0):void");
    }

    public final String a() {
        return a(R.raw.omsdk_v1, "com.chartboost.sdk.omidjs");
    }

    public final String a(int i, String str) {
        String str2;
        try {
            String a2 = this.f1262b.a(str);
            return a2 == null ? a(str, i) : a2;
        } catch (Exception e) {
            str2 = x6.f1291a;
            p71.z("OmidJS exception: ", e, str2);
            return null;
        }
    }

    public final String a(String str, int i) {
        String str2;
        try {
            String a2 = this.c.a(i);
            if (a2 == null) {
                return null;
            }
            this.f1262b.a(str, a2);
            return a2;
        } catch (Exception e) {
            str2 = x6.f1291a;
            p71.z("OmidJS resource file exception: ", e, str2);
            return null;
        }
    }
}
