package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.internal.Model.CBError;
import defpackage.ch3;
import defpackage.ji1;
import defpackage.x31;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class t implements v, z0 {

    /* renamed from: a */
    public final q f1138a;

    /* renamed from: b */
    public final r4 f1139b;
    public final a2 c;
    public final ka d;
    public final d1 e;
    public final i f;
    public final h7 g;
    public final Mediation h;
    public s0 j;
    public u k;
    public s l;
    public final String i = "t";
    public final AtomicBoolean m = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1140a;

        static {
            int[] iArr = new int[a1.values().length];
            try {
                iArr[a1.FAILURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a1.READY_TO_SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a1.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1140a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ji1 implements x31 {

        /* renamed from: b */
        public final /* synthetic */ s0 f1142b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s0 s0Var) {
            super(1);
            this.f1142b = s0Var;
        }

        public final void a(e6 e6Var) {
            if (e6Var.b() == null) {
                t.this.b(this.f1142b, e6Var);
                t.this.c(this.f1142b);
            } else {
                t.this.a(this.f1142b.d(), e6Var.b().getErrorDesc());
                t.this.a(this.f1142b, e6Var);
            }
        }

        @Override // defpackage.x31
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((e6) obj);
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends ji1 implements x31 {

        /* renamed from: a */
        public final /* synthetic */ s0 f1143a;

        /* renamed from: b */
        public final /* synthetic */ t f1144b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s0 s0Var, t tVar) {
            super(1);
            this.f1143a = s0Var;
            this.f1144b = tVar;
        }

        public final void a(e6 e6Var) {
            if (e6Var.b() != null) {
                this.f1144b.a(this.f1143a, e6Var);
                return;
            }
            this.f1143a.a(e6Var.a());
            this.f1144b.f(this.f1143a);
            this.f1144b.b(this.f1143a, e6Var);
            this.f1144b.a(this.f1143a);
        }

        @Override // defpackage.x31
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((e6) obj);
            return ch3.f636a;
        }
    }

    public t(q qVar, r4 r4Var, a2 a2Var, ka kaVar, d1 d1Var, i iVar, h7 h7Var, Mediation mediation) {
        this.f1138a = qVar;
        this.f1139b = r4Var;
        this.c = a2Var;
        this.d = kaVar;
        this.e = d1Var;
        this.f = iVar;
        this.g = h7Var;
        this.h = mediation;
    }

    public final void c(s0 s0Var) {
        this.e.a(s0Var, this.f1138a.b(), this, this);
    }

    public final String d(s0 s0Var) {
        r a2 = s0Var.a();
        if (a2 != null) {
            return a2.i();
        }
        return null;
    }

    public final void e(s0 s0Var) {
        b(s0Var, CBError.CBImpressionError.ASSETS_DOWNLOAD_FAILURE);
        g(s0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:            if (r0.v() == true) goto L31;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(com.chartboost.sdk.impl.s0 r5) {
        /*
            r4 = this;
            com.chartboost.sdk.impl.r r0 = r5.a()
            r1 = 0
            if (r0 == 0) goto Lf
            boolean r0 = r0.v()
            r2 = 1
            if (r0 != r2) goto Lf
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r2 == 0) goto L35
            com.chartboost.sdk.impl.ka r0 = r4.d
            com.chartboost.sdk.impl.r r2 = r5.a()
            java.lang.String r3 = ""
            if (r2 == 0) goto L22
            java.lang.String r2 = r2.u()
            if (r2 != 0) goto L23
        L22:
            r2 = r3
        L23:
            com.chartboost.sdk.impl.r r5 = r5.a()
            if (r5 == 0) goto L31
            java.lang.String r5 = r5.t()
            if (r5 != 0) goto L30
            goto L31
        L30:
            r3 = r5
        L31:
            r5 = 0
            r0.a(r2, r3, r1, r5)
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.t.f(com.chartboost.sdk.impl.s0):void");
    }

    public final void g(s0 s0Var) {
        b(s0Var);
        s0Var.a((r) null);
        this.m.set(false);
    }

    public final void h(s0 s0Var) {
        Integer num;
        s sVar = this.l;
        Integer num2 = null;
        if (sVar != null) {
            num = Integer.valueOf(sVar.a());
        } else {
            num = null;
        }
        s sVar2 = this.l;
        if (sVar2 != null) {
            num2 = Integer.valueOf(sVar2.c());
        }
        d6 d6Var = new d6(s0Var, true, num, num2);
        if (s0Var.c() != null) {
            b(s0Var, d6Var);
        } else {
            a(s0Var, d6Var);
        }
    }

    public final void i(s0 s0Var) {
        try {
            h(s0Var);
        } catch (Exception e) {
            f6.b(this.i, "sendAdGetRequest: " + e);
            a(s0Var, new CBError(CBError.b.MISCELLANEOUS, "error sending ad-get request"));
        }
    }

    public final void b() {
        if (this.m.get()) {
            return;
        }
        s0 s0Var = this.j;
        if (s0Var != null) {
            b(s0Var);
            s0Var.a((r) null);
        }
        this.j = null;
    }

    public final s0 a() {
        return this.j;
    }

    public static /* synthetic */ void a(t tVar, String str, u uVar, String str2, s sVar, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            sVar = null;
        }
        tVar.a(str, uVar, str2, sVar);
    }

    public final void a(String str, u uVar, String str2, s sVar) {
        r a2;
        if (this.m.getAndSet(true)) {
            return;
        }
        s0 s0Var = this.j;
        if (s0Var != null && (a2 = s0Var.a()) != null && !this.f1139b.a(a2).booleanValue()) {
            b(s0Var);
            this.j = null;
        }
        s0 s0Var2 = this.j;
        if (s0Var2 != null) {
            s0Var2.a(str2);
        }
        s0 s0Var3 = this.j;
        if (s0Var3 == null) {
            s0Var3 = new s0((int) System.currentTimeMillis(), str, str2, null, null, false, false, 120, null);
            this.k = uVar;
            this.l = sVar;
            s0Var3.a(sVar);
            this.j = s0Var3;
        }
        if (!this.c.e()) {
            b(s0Var3, CBError.CBImpressionError.INTERNET_UNAVAILABLE_AT_CACHE);
            return;
        }
        s0Var3.a(true);
        a(s0Var3.d());
        if (s0Var3.a() == null) {
            i(s0Var3);
        } else {
            a(s0Var3);
        }
    }

    public final void b(s0 s0Var, d6 d6Var) {
        this.g.a(d6Var, new c(s0Var, this));
    }

    public final void b(s0 s0Var, e6 e6Var) {
        a(s0Var.d(), e6Var.a());
        s0Var.a(e6Var.a());
    }

    public final void b(s0 s0Var) {
        String str;
        r a2 = s0Var.a();
        if (a2 == null || (str = a2.m()) == null) {
            str = "";
        }
        y3.a(str, s0Var.d());
    }

    public final void b(s0 s0Var, CBError.CBImpressionError cBImpressionError) {
        this.m.set(false);
        a(s0Var, cBImpressionError);
        if (cBImpressionError == CBError.CBImpressionError.NO_AD_FOUND) {
            return;
        }
        String str = this.i;
        StringBuilder sb = new StringBuilder("reportError: adTypeTraits: ");
        sb.append(this.f1138a.b());
        sb.append(" reason: cache  format: web error: ");
        sb.append(cBImpressionError);
        sb.append(" adId: ");
        r a2 = s0Var.a();
        sb.append(a2 != null ? a2.a() : null);
        sb.append(" appRequest.location: ");
        sb.append(s0Var.d());
        f6.b(str, sb.toString());
    }

    @Override // com.chartboost.sdk.impl.z0
    public void a(s0 s0Var, a1 a1Var) {
        int i = a.f1140a[a1Var.ordinal()];
        if (i == 1) {
            e(s0Var);
        } else if (i == 2) {
            f6.a(this.i, "onAssetDownloaded: Ready to show");
        } else {
            if (i != 3) {
                return;
            }
            f6.a(this.i, "onAssetDownloaded: Success");
        }
    }

    @Override // com.chartboost.sdk.impl.v
    public void a(s0 s0Var) {
        u uVar = this.k;
        if (uVar != null) {
            uVar.c(d(s0Var));
        }
        this.m.set(false);
    }

    public final void a(s0 s0Var, d6 d6Var) {
        this.f.a(d6Var, new b(s0Var));
    }

    public final void a(s0 s0Var, e6 e6Var) {
        a(s0Var.d(), (r) null);
        a(s0Var, e6Var.b());
    }

    public final void a(s0 s0Var, CBError cBError) {
        b(s0Var, a(cBError));
        g(s0Var);
    }

    public final CBError.CBImpressionError a(CBError cBError) {
        CBError.CBImpressionError cBImpressionError = CBError.CBImpressionError.INTERNAL;
        return (cBError == null || cBError.getImpressionError() == null) ? cBImpressionError : cBError.getImpressionError();
    }

    public final void a(s0 s0Var, CBError.CBImpressionError cBImpressionError) {
        u uVar = this.k;
        if (uVar != null) {
            uVar.a(d(s0Var), cBImpressionError);
        }
    }

    public final void a(String str, r rVar) {
        String k;
        String f;
        String i;
        y3.b(new j9(str, this.f1138a.b(), (rVar == null || (i = rVar.i()) == null) ? "" : i, (rVar == null || (f = rVar.f()) == null) ? "" : f, (rVar == null || (k = rVar.k()) == null) ? "" : k));
    }

    public final void a(String str) {
        y3.d(new y5("cache_start", "", this.f1138a.b(), str, this.h));
    }

    public final void a(String str, String str2) {
        y3.d(new w3("cache_request_error", str2, this.f1138a.b(), str, this.h));
    }
}
