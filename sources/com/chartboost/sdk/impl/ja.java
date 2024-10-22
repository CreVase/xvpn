package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.SurfaceView;
import com.chartboost.sdk.Mediation;
import defpackage.ch3;
import defpackage.ng0;
import defpackage.p41;

/* loaded from: classes.dex */
public final class ja extends g2 implements l0 {
    public static final a f0 = new a(null);
    public final r4 R;
    public final ka S;
    public final String T;
    public final Mediation U;
    public final p41 V;
    public final String W;
    public final f9 X;
    public long Y;
    public long Z;
    public long a0;
    public int b0;
    public final SurfaceView c0;
    public z9 d0;
    public k0 e0;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(ng0 ng0Var) {
            this();
        }

        public a() {
        }
    }

    public ja(Context context, String str, h6 h6Var, String str2, s9 s9Var, r4 r4Var, e2 e2Var, ka kaVar, String str3, Mediation mediation, p41 p41Var, z1 z1Var, String str4, v6 v6Var, c0 c0Var, f9 f9Var, wa waVar) {
        super(context, str, h6Var, str2, s9Var, r4Var, z1Var, e2Var, mediation, str4, v6Var, c0Var, waVar);
        this.R = r4Var;
        this.S = kaVar;
        this.T = str3;
        this.U = mediation;
        this.V = p41Var;
        this.W = str4;
        this.X = f9Var;
        this.c0 = new SurfaceView(context);
    }

    @Override // com.chartboost.sdk.impl.g2
    public void D() {
        int i;
        z9 z9Var = this.d0;
        int i2 = 0;
        if (z9Var != null) {
            i = z9Var.getWidth();
        } else {
            i = 0;
        }
        z9 z9Var2 = this.d0;
        if (z9Var2 != null) {
            i2 = z9Var2.getHeight();
        }
        k0 k0Var = this.e0;
        if (!(k0Var instanceof q8)) {
            k0Var = null;
        }
        if (k0Var != null) {
            k0Var.a(i, i2);
        }
    }

    @Override // com.chartboost.sdk.impl.g2
    public void F() {
        f6.c("VideoProtocol", "onPause()");
        k0 k0Var = this.e0;
        if (k0Var != null) {
            k0Var.pause();
        }
        super.F();
    }

    @Override // com.chartboost.sdk.impl.g2
    public void G() {
        f6.c("VideoProtocol", "onResume()");
        f1 f1Var = null;
        this.S.a(null, 1, false);
        k0 k0Var = this.e0;
        if (k0Var != null) {
            if (k0Var instanceof f1) {
                f1Var = (f1) k0Var;
            }
            if (f1Var != null) {
                f1Var.e();
            }
            k0Var.play();
        }
        super.G();
    }

    public final void L() {
        M();
    }

    public final void M() {
        k0 k0Var = this.e0;
        if (k0Var != null) {
            k0Var.stop();
        }
        z9 z9Var = this.d0;
        if (z9Var != null) {
            z9Var.b();
        }
        this.e0 = null;
        this.d0 = null;
    }

    public final int N() {
        f6.a("VideoProtocol", "getAssetDownloadStateNow()");
        y9 b2 = this.S.b(this.T);
        if (b2 != null) {
            return this.S.a(b2);
        }
        return 0;
    }

    public final i2 O() {
        z9 z9Var = this.d0;
        if (z9Var != null) {
            return z9Var.f1114b;
        }
        return null;
    }

    public final void P() {
        k0 k0Var = this.e0;
        if (k0Var != null) {
            k0Var.d();
        }
        s().a(0.0f);
    }

    public final void Q() {
        e2 v = v();
        if (v != null) {
            v.c(O(), o(), h());
        }
    }

    public final void R() {
        f6.a("VideoProtocol", "notifyTemplateVideoStarted() duration: " + this.Y);
        e2 v = v();
        if (v != null) {
            v.b(O(), ((float) this.Y) / 1000.0f, o(), h());
        }
    }

    public final void S() {
        f6.a("VideoProtocol", "pauseVideo()");
        s().a();
        k0 k0Var = this.e0;
        if (k0Var != null) {
            k0Var.pause();
        }
    }

    public final void T() {
        f6.a("VideoProtocol", "playVideo()");
        U();
        this.Z = c9.a();
        k0 k0Var = this.e0;
        if (k0Var != null) {
            k0Var.play();
        }
    }

    public final void U() {
        boolean z;
        float f;
        s().a(l7.FULLSCREEN);
        k0 k0Var = this.e0;
        if (k0Var != null && !k0Var.f()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            v6 s = s();
            float f2 = ((float) this.Y) / 1000.0f;
            k0 k0Var2 = this.e0;
            if (k0Var2 != null) {
                f = k0Var2.c();
            } else {
                f = 1.0f;
            }
            s.a(f2, f);
            return;
        }
        s().e();
    }

    public final void V() {
        k0 k0Var = this.e0;
        if (k0Var != null) {
            k0Var.a();
        }
        s().a(1.0f);
    }

    @Override // com.chartboost.sdk.impl.l0
    public void a() {
        f6.a("VideoProtocol", "onVideoDisplayStarted");
        R();
        this.a0 = c9.a();
    }

    @Override // com.chartboost.sdk.impl.l0
    public void b(long j) {
        f6.a("VideoProtocol", "onVideoDisplayPrepared ready to receive signal from template, duration: " + j);
        this.b0 = N();
        this.Y = j;
        E();
    }

    @Override // com.chartboost.sdk.impl.g2
    public ra c(Context context) {
        z9 z9Var;
        f6.a("VideoProtocol", "createViewObject()");
        ch3 ch3Var = null;
        try {
            z9Var = new z9(context, this.W, k(), w(), this.n, this.X, this.c0, null, 128, null);
        } catch (Exception e) {
            b("Can't instantiate VideoBase: " + e);
            z9Var = null;
        }
        this.d0 = z9Var;
        k0 k0Var = (k0) this.V.invoke(context, this.c0, this, w(), this.R);
        y9 b2 = this.S.b(this.T);
        if (b2 != null) {
            k0Var.a(b2);
            ch3Var = ch3.f636a;
        }
        if (ch3Var == null) {
            f6.b("VideoProtocol", "Video asset not found in the repository");
        }
        this.e0 = k0Var;
        return this.d0;
    }

    @Override // com.chartboost.sdk.impl.l0
    public void d() {
        s().a(false);
    }

    @Override // com.chartboost.sdk.impl.g2
    public void g() {
        f6.a("VideoProtocol", "destroyView()");
        M();
        super.g();
    }

    @Override // com.chartboost.sdk.impl.l0
    public void a(long j) {
        float f = ((float) j) / 1000.0f;
        float f2 = ((float) this.Y) / 1000.0f;
        if (p8.f1074a.d()) {
            f6.c("VideoProtocol", "onVideoDisplayProgress: " + f + '/' + f2);
        }
        e2 v = v();
        if (v != null) {
            v.a(O(), f, o(), h());
        }
        a(f2, f);
    }

    @Override // com.chartboost.sdk.impl.l0
    public void b() {
        f6.a("VideoProtocol", "onVideoDisplayCompleted");
        a(true);
        Q();
        s().d();
    }

    @Override // com.chartboost.sdk.impl.l0
    public void a(String str) {
        f6.a("VideoProtocol", "onVideoDisplayError: ".concat(str));
        a(false);
        e2 v = v();
        if (v != null) {
            v.d(O(), o(), h());
        }
        M();
        b(str);
    }

    public final void a(boolean z) {
        o9 w3Var;
        long a2;
        long j;
        String valueOf = String.valueOf(this.b0);
        if (z) {
            w3Var = new y5("video_finish_success", valueOf, h(), o(), this.U);
            w3Var.a((float) (this.a0 - this.Z));
        } else {
            w3Var = new w3("video_finish_failure", valueOf, h(), o(), this.U);
            if (this.a0 == 0) {
                a2 = this.Z;
                j = c9.a();
            } else {
                a2 = c9.a();
                j = this.a0;
            }
            w3Var.a((float) (a2 - j));
        }
        y3.d(w3Var);
    }

    @Override // com.chartboost.sdk.impl.l0
    public void c() {
        s().a(true);
    }
}
