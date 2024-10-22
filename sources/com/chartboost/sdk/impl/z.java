package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.q;
import com.chartboost.sdk.impl.z;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import defpackage.aa0;
import defpackage.ba0;
import defpackage.c90;
import defpackage.ch3;
import defpackage.fl;
import defpackage.ke0;
import defpackage.l41;
import defpackage.m20;
import defpackage.p71;
import defpackage.z33;
import defpackage.zf3;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z implements c0, q5, f9, a0 {

    /* renamed from: a, reason: collision with root package name */
    public final q f1323a;

    /* renamed from: b, reason: collision with root package name */
    public final a2 f1324b;
    public final r4 c;
    public final ka d;
    public final d5 e;
    public final e0 f;
    public final t6 g;
    public final w5 h;
    public final d8 i;
    public final Mediation j;
    public final aa0 k;
    public b0 l;
    public q1 m;
    public final b n;

    @ke0(c = "com.chartboost.sdk.internal.AdUnitManager.render.AdUnitRenderer$showImpressionOrHandleError$1", f = "AdUnitRenderer.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends z33 implements l41 {

        /* renamed from: a, reason: collision with root package name */
        public int f1325a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q1 f1326b;
        public final /* synthetic */ z c;
        public final /* synthetic */ s0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q1 q1Var, z zVar, s0 s0Var, c90 c90Var) {
            super(2, c90Var);
            this.f1326b = q1Var;
            this.c = zVar;
            this.d = s0Var;
        }

        @Override // defpackage.l41
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(aa0 aa0Var, c90 c90Var) {
            return ((a) create(aa0Var, c90Var)).invokeSuspend(ch3.f636a);
        }

        @Override // defpackage.mn
        public final c90 create(Object obj, c90 c90Var) {
            return new a(this.f1326b, this.c, this.d, c90Var);
        }

        @Override // defpackage.mn
        public final Object invokeSuspend(Object obj) {
            ch3 ch3Var;
            ba0 ba0Var = ba0.f430a;
            if (this.f1325a == 0) {
                fl.a0(obj);
                q1 q1Var = this.f1326b;
                ch3 ch3Var2 = ch3.f636a;
                if (q1Var != null) {
                    q1Var.L();
                    ch3Var = ch3Var2;
                } else {
                    ch3Var = null;
                }
                if (ch3Var == null) {
                    this.c.d(this.d, CBError.CBImpressionError.PENDING_IMPRESSION_ERROR);
                }
                return ch3Var2;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements wa {
        public b() {
        }

        @Override // com.chartboost.sdk.impl.wa
        public void a() {
            q1 q1Var = z.this.m;
            if (q1Var != null) {
                q1Var.b(CBError.CBImpressionError.WEB_VIEW_PAGE_LOAD_TIMEOUT);
            }
        }
    }

    public z(q qVar, a2 a2Var, r4 r4Var, ka kaVar, d5 d5Var, e0 e0Var, t6 t6Var, w5 w5Var, d8 d8Var, Mediation mediation, aa0 aa0Var) {
        this.f1323a = qVar;
        this.f1324b = a2Var;
        this.c = r4Var;
        this.d = kaVar;
        this.e = d5Var;
        this.f = e0Var;
        this.g = t6Var;
        this.h = w5Var;
        this.i = d8Var;
        this.j = mediation;
        this.k = aa0Var;
        this.n = new b();
    }

    @Override // com.chartboost.sdk.impl.f9
    public String A() {
        String x;
        q1 q1Var = this.m;
        if (q1Var == null || (x = q1Var.x()) == null) {
            return "";
        }
        return x;
    }

    @Override // com.chartboost.sdk.impl.f9
    public String B() {
        String w;
        q1 q1Var = this.m;
        if (q1Var == null || (w = q1Var.w()) == null) {
            return "";
        }
        return w;
    }

    @Override // com.chartboost.sdk.impl.f9
    public void C() {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.F();
        }
    }

    @Override // com.chartboost.sdk.impl.q5
    public void D() {
        s5 s5Var;
        q1 q1Var = this.m;
        if (q1Var != null) {
            s5Var = q1Var.s();
        } else {
            s5Var = null;
        }
        if (s5Var == s5.DISPLAYED && !m20.L(this.f1323a, q.a.g)) {
            this.i.a();
        }
    }

    public final void E() {
        String str;
        try {
            q1 q1Var = this.m;
            if (q1Var != null) {
                this.g.f();
                ViewGroup k = q1Var.k();
                if (k != null) {
                    k.removeAllViews();
                    k.invalidate();
                }
                q1Var.R();
                this.m = null;
                this.l = null;
            }
        } catch (Exception e) {
            str = d0.f748a;
            p71.z("detachBannerImpression error: ", e, str);
        }
    }

    public final Mediation F() {
        return this.j;
    }

    public final int G() {
        q1 q1Var = this.m;
        if (q1Var != null) {
            return q1Var.y();
        }
        return -1;
    }

    public boolean H() {
        q1 q1Var = this.m;
        if (q1Var != null) {
            return q1Var.h();
        }
        return false;
    }

    public final void b(s0 s0Var, CBError.CBImpressionError cBImpressionError) {
        d(s0Var, cBImpressionError);
        if (cBImpressionError != CBError.CBImpressionError.IMPRESSION_ALREADY_VISIBLE) {
            f(s0Var);
        }
        this.g.g();
    }

    public final void c(s0 s0Var, CBError.CBImpressionError cBImpressionError) {
        String unused;
        b0 b0Var = this.l;
        if (b0Var != null) {
            b0Var.b(c(s0Var), cBImpressionError);
        } else {
            unused = d0.f748a;
            Objects.toString(cBImpressionError);
        }
    }

    public final void d(s0 s0Var, CBError.CBImpressionError cBImpressionError) {
        String str;
        c(s0Var, cBImpressionError);
        if (cBImpressionError == CBError.CBImpressionError.NO_AD_FOUND) {
            return;
        }
        str = d0.f748a;
        StringBuilder sb = new StringBuilder("reportError: adTypeTraits: ");
        sb.append(this.f1323a.b());
        sb.append(" reason: cache  format: web error: ");
        sb.append(cBImpressionError);
        sb.append(" adId: ");
        r a2 = s0Var.a();
        sb.append(a2 != null ? a2.a() : null);
        sb.append(" appRequest.location: ");
        sb.append(s0Var.d());
        f6.b(str, sb.toString());
    }

    public final void e(s0 s0Var) {
        String str;
        String name = CBError.CBImpressionError.USER_CANCELLATION.name();
        r a2 = s0Var.a();
        if (a2 == null || (str = a2.m()) == null) {
            str = "";
        }
        y3.d(new y5("show_finish_failure", name, str, s0Var.d(), this.j));
        f(s0Var);
    }

    public final void f(s0 s0Var) {
        s0Var.a((r) null);
    }

    public final void g(s0 s0Var) {
        String str;
        if (this.m != null && s0Var.b() == null) {
            str = d0.f748a;
            f6.e(str, "Fullscreen impression is currently loading.");
            return;
        }
        if (!this.f1324b.e()) {
            c(s0Var, CBError.CBImpressionError.INTERNET_UNAVAILABLE_AT_SHOW);
            return;
        }
        b0 b0Var = this.l;
        if (b0Var != null) {
            b0Var.e(c(s0Var));
        }
        d5 d5Var = this.e;
        s b2 = s0Var.b();
        p5 a2 = d5Var.a(s0Var, this, b2 != null ? b2.b() : null, this, this.h, this, this.n);
        this.m = a2.b();
        a(s0Var, a2.b(), a2.a());
    }

    public final void h(final s0 s0Var) {
        String str;
        String t;
        r a2 = s0Var.a();
        if (a2 != null && a2.v()) {
            ka kaVar = this.d;
            r a3 = s0Var.a();
            String str2 = "";
            if (a3 == null || (str = a3.u()) == null) {
                str = "";
            }
            r a4 = s0Var.a();
            if (a4 != null && (t = a4.t()) != null) {
                str2 = t;
            }
            kaVar.a(str, str2, true, new f0() { // from class: rw3
                @Override // com.chartboost.sdk.impl.f0
                public final void a(String str3) {
                    z.a(z.this, s0Var, str3);
                }
            });
            return;
        }
        g(s0Var);
    }

    public final void i(s0 s0Var) {
        if (s0Var.e()) {
            return;
        }
        s0Var.b(true);
        y3.d(new y5("show_start", "", this.f1323a.b(), s0Var.d()));
    }

    @Override // com.chartboost.sdk.impl.f9
    public void j() {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.O();
        }
    }

    @Override // com.chartboost.sdk.impl.c0
    public void k() {
        this.i.a();
    }

    @Override // com.chartboost.sdk.impl.q5
    public void l() {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.S();
            q1Var.R();
        }
        this.m = null;
        this.l = null;
    }

    @Override // com.chartboost.sdk.impl.f9
    public void m() {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.P();
        }
    }

    @Override // com.chartboost.sdk.impl.c0
    public void n() {
        String str;
        q1 q1Var = this.m;
        if (q1Var == null) {
            str = d0.f748a;
            Log.e(str, "Cannot display missing impression onImpressionReadyToBeDisplayed");
            return;
        }
        q1Var.b(s5.LOADED);
        if (q1Var.N()) {
            q1Var.a(q1Var.k());
        } else {
            this.i.a(this);
        }
    }

    @Override // com.chartboost.sdk.impl.a0
    public void o() {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.g();
        }
    }

    @Override // com.chartboost.sdk.impl.f9
    public void p() {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.H();
        }
    }

    @Override // com.chartboost.sdk.impl.a0
    public void q() {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.b();
        }
    }

    @Override // com.chartboost.sdk.impl.f9
    public String r() {
        String t;
        q1 q1Var = this.m;
        if (q1Var == null || (t = q1Var.t()) == null) {
            return "";
        }
        return t;
    }

    @Override // com.chartboost.sdk.impl.f9
    public void s() {
        this.i.a();
    }

    @Override // com.chartboost.sdk.impl.f9
    public void t() {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.I();
        }
    }

    @Override // com.chartboost.sdk.impl.f9
    public void u() {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.K();
        }
    }

    @Override // com.chartboost.sdk.impl.f9
    public String v() {
        String u;
        q1 q1Var = this.m;
        if (q1Var == null || (u = q1Var.u()) == null) {
            return "";
        }
        return u;
    }

    @Override // com.chartboost.sdk.impl.a0
    public void w() {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.m();
        }
    }

    @Override // com.chartboost.sdk.impl.a0
    public void x() {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.f();
        }
    }

    @Override // com.chartboost.sdk.impl.f9
    public void y() {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.p();
        }
    }

    @Override // com.chartboost.sdk.impl.f9
    public void z() {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.A();
        }
    }

    public final void f(String str) {
        b0 b0Var = this.l;
        if (b0Var != null) {
            b0Var.d(str);
        }
        this.g.i();
    }

    public final void a(s0 s0Var, b0 b0Var) {
        this.l = b0Var;
        if (!this.f1324b.e()) {
            c(s0Var, CBError.CBImpressionError.INTERNET_UNAVAILABLE_AT_SHOW);
            return;
        }
        r a2 = s0Var.a();
        if (a2 == null) {
            d(s0Var, CBError.CBImpressionError.NO_AD_FOUND);
        } else if (!this.c.a(a2).booleanValue()) {
            d(s0Var, CBError.CBImpressionError.ASSET_MISSING);
        } else {
            i(s0Var);
            h(s0Var);
        }
    }

    public final String c(s0 s0Var) {
        r a2;
        if (s0Var == null || (a2 = s0Var.a()) == null) {
            return null;
        }
        return a2.i();
    }

    @Override // com.chartboost.sdk.impl.f9
    public String f() {
        String v;
        q1 q1Var = this.m;
        return (q1Var == null || (v = q1Var.v()) == null) ? "" : v;
    }

    @Override // com.chartboost.sdk.impl.c0
    public void b(String str) {
        b0 b0Var = this.l;
        if (b0Var != null) {
            b0Var.b(str);
        }
    }

    @Override // com.chartboost.sdk.impl.q5
    public void c() {
        ch3 ch3Var;
        String str;
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.G();
            ch3Var = ch3.f636a;
        } else {
            ch3Var = null;
        }
        if (ch3Var == null) {
            str = d0.f748a;
            f6.a(str, "Missing impression on impression click success callback ");
        }
    }

    @Override // com.chartboost.sdk.impl.c0
    public void b(s0 s0Var) {
        c(true);
        String c = c(s0Var);
        b0 b0Var = this.l;
        if (b0Var != null) {
            b0Var.f(c);
        }
        if (H()) {
            f(c);
        }
        d(s0Var);
        f(s0Var);
    }

    public void c(boolean z) {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.b(z);
        }
    }

    @Override // com.chartboost.sdk.impl.f9
    public String h() {
        String r;
        q1 q1Var = this.m;
        return (q1Var == null || (r = q1Var.r()) == null) ? "" : r;
    }

    @Override // com.chartboost.sdk.impl.f9
    public void c(String str) {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.a(str);
        }
    }

    @Override // com.chartboost.sdk.impl.f9
    public void i() {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.J();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:            if (r1 != false) goto L15;     */
    @Override // com.chartboost.sdk.impl.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e() {
        /*
            r3 = this;
            com.chartboost.sdk.impl.q1 r0 = r3.m
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            boolean r0 = r0.D()
            if (r0 != r2) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L1e
            com.chartboost.sdk.impl.q1 r0 = r3.m
            if (r0 == 0) goto L1c
            boolean r0 = r0.o()
            if (r0 != r2) goto L1c
            r1 = 1
        L1c:
            if (r1 == 0) goto L23
        L1e:
            com.chartboost.sdk.impl.d8 r0 = r3.i
            r0.a()
        L23:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.z.e():boolean");
    }

    public final void d(s0 s0Var) {
        e0 e0Var = this.f;
        String d = this.f1323a.d();
        r a2 = s0Var.a();
        e0Var.a(d, new b9(a2 != null ? a2.a() : null, s0Var.d(), G(), this.f1323a.b(), this.j));
    }

    @Override // com.chartboost.sdk.impl.f9
    public void e(String str) {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.b(str);
        }
    }

    public static final void a(z zVar, s0 s0Var, String str) {
        zVar.g(s0Var);
    }

    public final void a(s0 s0Var, q1 q1Var, CBError.CBImpressionError cBImpressionError) {
        if (cBImpressionError != null) {
            d(s0Var, cBImpressionError);
            f(s0Var);
        } else {
            zf3.T(this.k, null, new a(q1Var, this, s0Var, null), 3);
        }
    }

    @Override // com.chartboost.sdk.impl.q5
    public void b(boolean z) {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.e(z);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z(com.chartboost.sdk.impl.q r14, com.chartboost.sdk.impl.a2 r15, com.chartboost.sdk.impl.r4 r16, com.chartboost.sdk.impl.ka r17, com.chartboost.sdk.impl.d5 r18, com.chartboost.sdk.impl.e0 r19, com.chartboost.sdk.impl.t6 r20, com.chartboost.sdk.impl.w5 r21, com.chartboost.sdk.impl.d8 r22, com.chartboost.sdk.Mediation r23, defpackage.aa0 r24, int r25, defpackage.ng0 r26) {
        /*
            r13 = this;
            r0 = r25
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L10
            qi0 r0 = defpackage.vl0.f4854a
            yo1 r0 = defpackage.zo1.f5522a
            z80 r0 = defpackage.pd0.d(r0)
            r12 = r0
            goto L12
        L10:
            r12 = r24
        L12:
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.z.<init>(com.chartboost.sdk.impl.q, com.chartboost.sdk.impl.a2, com.chartboost.sdk.impl.r4, com.chartboost.sdk.impl.ka, com.chartboost.sdk.impl.d5, com.chartboost.sdk.impl.e0, com.chartboost.sdk.impl.t6, com.chartboost.sdk.impl.w5, com.chartboost.sdk.impl.d8, com.chartboost.sdk.Mediation, aa0, int, ng0):void");
    }

    @Override // com.chartboost.sdk.impl.q5
    public void b() {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.e();
        }
    }

    @Override // com.chartboost.sdk.impl.f9
    public void b(float f) {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.a(f);
        }
    }

    @Override // com.chartboost.sdk.impl.f9
    public void g() {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.B();
        }
    }

    @Override // com.chartboost.sdk.impl.a0
    public void a(CBImpressionActivity cBImpressionActivity) {
        String str;
        ch3 ch3Var;
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.a(q1Var.s(), cBImpressionActivity);
            ra z = q1Var.z();
            if (z != null) {
                this.i.a(z);
                ch3Var = ch3.f636a;
            } else {
                ch3Var = null;
            }
            if (ch3Var != null) {
                return;
            }
        }
        str = d0.f748a;
        Log.e(str, "Cannot display missing impression onActivityIsReadyToDisplay");
    }

    @Override // com.chartboost.sdk.impl.a0
    public void d() {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.Q();
        }
    }

    @Override // com.chartboost.sdk.impl.f9
    public void d(String str) {
        String str2;
        str2 = d0.f748a;
        f6.e(str2, "WebView warning occurred closing the webview ".concat(str));
    }

    @Override // com.chartboost.sdk.impl.a0
    public void a(CBError.CBImpressionError cBImpressionError) {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.a(cBImpressionError);
        }
    }

    @Override // com.chartboost.sdk.impl.c0
    public void a(s0 s0Var) {
        e(s0Var);
        this.g.g();
    }

    @Override // com.chartboost.sdk.impl.c0
    public void a(String str, String str2, CBError.CBClickError cBClickError) {
        b0 b0Var = this.l;
        if (b0Var != null) {
            b0Var.a(str, str2, cBClickError);
        }
    }

    @Override // com.chartboost.sdk.impl.c0
    public void a(String str, int i) {
        b0 b0Var = this.l;
        if (b0Var != null) {
            b0Var.a(str, i);
        }
    }

    @Override // com.chartboost.sdk.impl.c0
    public void a(String str) {
        b0 b0Var = this.l;
        if (b0Var != null) {
            b0Var.a(str);
        }
        this.g.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // com.chartboost.sdk.impl.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.content.Context r7) {
        /*
            r6 = this;
            com.chartboost.sdk.impl.q1 r0 = r6.m
            if (r0 == 0) goto L42
            com.chartboost.sdk.impl.t6 r1 = r6.g
            boolean r1 = r1.h()
            if (r1 != 0) goto L1a
            r7 = 1
            r0.c(r7)
            java.lang.String r7 = com.chartboost.sdk.impl.d0.a()
            java.lang.String r0 = "Cannot create visibility tracker due to the OM SDK being disabled!"
            com.chartboost.sdk.impl.f6.a(r7, r0)
            return
        L1a:
            boolean r1 = r0.E()
            if (r1 == 0) goto L2a
            java.lang.String r7 = com.chartboost.sdk.impl.d0.a()
            java.lang.String r0 = "Cannot create VisibilityTracker due to missing view!"
            com.chartboost.sdk.impl.f6.e(r7, r0)
            return
        L2a:
            com.chartboost.sdk.impl.ra r1 = r0.z()
            if (r1 == 0) goto L42
            com.chartboost.sdk.impl.t6 r2 = r6.g
            android.view.View r3 = r1.getRootView()
            ti0 r4 = new ti0
            r5 = 2
            r4.<init>(r5, r6, r0)
            r2.a(r7, r1, r3, r4)
            ch3 r7 = defpackage.ch3.f636a
            goto L43
        L42:
            r7 = 0
        L43:
            if (r7 != 0) goto L4e
            java.lang.String r7 = com.chartboost.sdk.impl.d0.a()
            java.lang.String r0 = "Missing impression onImpressionViewCreated"
            com.chartboost.sdk.impl.f6.b(r7, r0)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.z.a(android.content.Context):void");
    }

    public static final void a(z zVar, q1 q1Var) {
        zVar.a(q1Var);
    }

    public final void a(q1 q1Var) {
        String str;
        str = d0.f748a;
        f6.c(str, "Visibility check success!");
        q1Var.c(true);
        if (q1Var.j()) {
            f(q1Var.q());
        }
    }

    @Override // com.chartboost.sdk.impl.c0
    public void a(s0 s0Var, CBError.CBImpressionError cBImpressionError) {
        b(s0Var, cBImpressionError);
        y3.d(new j3("show_unexpected_dismiss_error", "", this.f1323a.b(), s0Var.d(), this.j));
        this.i.a();
    }

    @Override // com.chartboost.sdk.impl.q5
    public void a(boolean z) {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.a(z);
        }
    }

    @Override // com.chartboost.sdk.impl.q5
    public void a(String str, CBError.CBClickError cBClickError) {
        ch3 ch3Var;
        String str2;
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.a(str, cBClickError);
            ch3Var = ch3.f636a;
        } else {
            ch3Var = null;
        }
        if (ch3Var == null) {
            str2 = d0.f748a;
            f6.a(str2, "Missing impression on impression click failure callback ");
        }
    }

    @Override // com.chartboost.sdk.impl.q5
    public void a(s5 s5Var) {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.b(s5Var);
        }
    }

    @Override // com.chartboost.sdk.impl.q5
    public void a() {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.a();
        }
    }

    @Override // com.chartboost.sdk.impl.f9
    public void a(Context context, Boolean bool) {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.a(context, bool);
        }
    }

    @Override // com.chartboost.sdk.impl.f9
    public void a(w9 w9Var) {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.a(w9Var);
        }
    }

    @Override // com.chartboost.sdk.impl.f9
    public void a(m7 m7Var) {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.a(m7Var);
        }
    }

    @Override // com.chartboost.sdk.impl.f9
    public void a(float f) {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.b(f);
        }
    }

    @Override // com.chartboost.sdk.impl.f9
    public void a(float f, float f2) {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.a(f, f2);
        }
    }

    @Override // com.chartboost.sdk.impl.f9
    public void a(Context context, String str, Boolean bool) {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.a(context, str, bool);
        }
    }

    @Override // com.chartboost.sdk.impl.f9
    public void a(boolean z, String str) {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.a(z, str);
        }
    }

    @Override // com.chartboost.sdk.impl.f9
    public void a(List<x9> list) {
        q1 q1Var = this.m;
        if (q1Var != null) {
            q1Var.a(list);
        }
    }
}
