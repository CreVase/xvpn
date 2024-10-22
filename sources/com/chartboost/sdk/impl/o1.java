package com.chartboost.sdk.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import defpackage.aa0;
import defpackage.ba0;
import defpackage.c90;
import defpackage.ch3;
import defpackage.df1;
import defpackage.fl;
import defpackage.i23;
import defpackage.iw3;
import defpackage.ji1;
import defpackage.k43;
import defpackage.ke0;
import defpackage.l41;
import defpackage.m20;
import defpackage.ui1;
import defpackage.v31;
import defpackage.v90;
import defpackage.x31;
import defpackage.z33;
import defpackage.zf3;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1029a;

    /* renamed from: b, reason: collision with root package name */
    public final p0 f1030b;
    public final n0 c;
    public final h1 d;
    public final aa0 e;
    public final v90 f;
    public final ui1 g;
    public final ui1 h;
    public final ui1 i;
    public volatile df1 j;

    /* loaded from: classes.dex */
    public static final class a extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1031a = new a();

        public a() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AtomicReference<y4> invoke() {
            return new AtomicReference<>(null);
        }
    }

    @ke0(c = "com.chartboost.sdk.internal.Libraries.CBIdentity$launchIdentityJob$1", f = "CBIdentity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends z33 implements l41 {

        /* renamed from: a, reason: collision with root package name */
        public int f1032a;

        public b(c90 c90Var) {
            super(2, c90Var);
        }

        @Override // defpackage.l41
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(aa0 aa0Var, c90 c90Var) {
            return ((b) create(aa0Var, c90Var)).invokeSuspend(ch3.f636a);
        }

        @Override // defpackage.mn
        public final c90 create(Object obj, c90 c90Var) {
            return new b(c90Var);
        }

        @Override // defpackage.mn
        public final Object invokeSuspend(Object obj) {
            ba0 ba0Var = ba0.f430a;
            if (this.f1032a == 0) {
                fl.a0(obj);
                o1.this.b();
                o1.this.j = null;
                return ch3.f636a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends ji1 implements x31 {
        public c() {
            super(1);
        }

        public final void a(AppSetIdInfo appSetIdInfo) {
            o1.this.a(appSetIdInfo);
        }

        @Override // defpackage.x31
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AppSetIdInfo) obj);
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f1035a = new d();

        public d() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AtomicReference<String> invoke() {
            return new AtomicReference<>(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f1036a = new e();

        public e() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AtomicInteger invoke() {
            return new AtomicInteger();
        }
    }

    public o1(Context context, p0 p0Var, n0 n0Var, h1 h1Var, aa0 aa0Var, v90 v90Var) {
        this.f1029a = context;
        this.f1030b = p0Var;
        this.c = n0Var;
        this.d = h1Var;
        this.e = aa0Var;
        this.f = v90Var;
        this.g = new k43(d.f1035a);
        this.h = new k43(e.f1036a);
        this.i = new k43(a.f1031a);
        i();
    }

    public final boolean a() {
        return true;
    }

    public final void b() {
        j();
        e().set(b(this.f1029a));
    }

    public final m0 c() {
        String str;
        try {
            if (h()) {
                return a(this.f1029a);
            }
            return d();
        } catch (Exception e2) {
            str = p1.f1059a;
            Log.e(str, "getAdvertisingId error: " + e2);
            return new m0(q9.TRACKING_UNKNOWN, "");
        }
    }

    public final m0 d() {
        this.c.a();
        return new m0(this.c.c(), this.c.b());
    }

    public final AtomicReference<y4> e() {
        return (AtomicReference) this.i.getValue();
    }

    public final AtomicReference<String> f() {
        return (AtomicReference) this.g.getValue();
    }

    public final AtomicInteger g() {
        return (AtomicInteger) this.h.getValue();
    }

    public final boolean h() {
        return i23.U0("Amazon", Build.MANUFACTURER);
    }

    public final void i() {
        String str;
        try {
            this.j = zf3.T(this.e, this.f, new b(null), 2);
        } catch (Throwable th) {
            str = p1.f1059a;
            Log.e(str, "Error launching identity job: " + th);
        }
    }

    public final void j() {
        String str;
        String unused;
        try {
            if (!a()) {
                unused = p1.f1059a;
            } else {
                Task<AppSetIdInfo> a2 = this.f1030b.a(this.f1029a);
                if (a2 != null) {
                    a2.addOnSuccessListener(new iw3(0, new c()));
                }
            }
        } catch (Exception e2) {
            str = p1.f1059a;
            Log.e(str, "Error requesting AppSetId: " + e2);
        }
    }

    public final y4 k() {
        if (this.j == null) {
            i();
        }
        y4 y4Var = e().get();
        if (y4Var == null) {
            return b(this.f1029a);
        }
        return y4Var;
    }

    public final y4 b(Context context) {
        String str;
        try {
            m0 c2 = c();
            String a2 = c2.a();
            q9 b2 = c2.b();
            String a3 = q3.a(context, b2 == q9.TRACKING_LIMITED);
            if (a2 != null) {
                a3 = "000000000";
            }
            String str2 = a3;
            if (p8.f1074a.d()) {
                p8.b(a2);
                p8.c(str2);
            }
            return new y4(b2, a(a2, str2), str2, a2, f().get(), Integer.valueOf(g().get()));
        } catch (Exception e2) {
            String message = e2.getMessage();
            if (message != null) {
                str = p1.f1059a;
                Log.e(str, message);
            }
            return new y4(null, null, null, null, null, null, 63, null);
        }
    }

    public static final void a(x31 x31Var, Object obj) {
        x31Var.invoke(obj);
    }

    public final String a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            t1.a(jSONObject, "gaid", str);
        } else if (str2 != null) {
            t1.a(jSONObject, "uuid", str2);
        }
        String str3 = f().get();
        if (str3 != null) {
            t1.a(jSONObject, "appsetid", str3);
        }
        return this.d.c(jSONObject.toString());
    }

    public final m0 a(Context context) {
        q9 q9Var;
        String str;
        q9 q9Var2;
        ContentResolver contentResolver;
        try {
            contentResolver = context.getContentResolver();
        } catch (Settings.SettingNotFoundException unused) {
            q9Var = q9.TRACKING_UNKNOWN;
        }
        if (!(Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0)) {
            str = Settings.Secure.getString(contentResolver, "advertising_id");
            if (m20.L("00000000-0000-0000-0000-000000000000", str)) {
                q9Var = q9.TRACKING_LIMITED;
            } else {
                q9Var2 = q9.TRACKING_ENABLED;
                return new m0(q9Var2, str);
            }
        } else {
            q9Var = q9.TRACKING_LIMITED;
        }
        q9Var2 = q9Var;
        str = null;
        return new m0(q9Var2, str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o1(android.content.Context r8, com.chartboost.sdk.impl.p0 r9, com.chartboost.sdk.impl.n0 r10, com.chartboost.sdk.impl.h1 r11, defpackage.aa0 r12, defpackage.v90 r13, int r14, defpackage.ng0 r15) {
        /*
            r7 = this;
            r15 = r14 & 16
            if (r15 == 0) goto L16
            qi0 r12 = defpackage.vl0.f4854a
            yo1 r12 = defpackage.zo1.f5522a
            gf1 r15 = new gf1
            r0 = 0
            r15.<init>(r0)
            t90 r12 = r12.plus(r15)
            z80 r12 = defpackage.pd0.d(r12)
        L16:
            r5 = r12
            r12 = r14 & 32
            if (r12 == 0) goto L1d
            sh0 r13 = defpackage.vl0.c
        L1d:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.o1.<init>(android.content.Context, com.chartboost.sdk.impl.p0, com.chartboost.sdk.impl.n0, com.chartboost.sdk.impl.h1, aa0, v90, int, ng0):void");
    }

    public final void a(AppSetIdInfo appSetIdInfo) {
        if (appSetIdInfo != null) {
            f().set(appSetIdInfo.getId());
            g().set(appSetIdInfo.getScope());
        }
    }
}
