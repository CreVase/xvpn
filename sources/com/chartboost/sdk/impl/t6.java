package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import com.chartboost.sdk.impl.sa;
import com.chartboost.sdk.impl.z6;
import defpackage.ch3;
import java.util.List;

/* loaded from: classes.dex */
public final class t6 implements v6 {

    /* renamed from: a, reason: collision with root package name */
    public final w6 f1151a;

    /* renamed from: b, reason: collision with root package name */
    public final z6 f1152b;
    public b7 c;
    public sa d;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1153a;

        static {
            int[] iArr = new int[x7.values().length];
            try {
                iArr[x7.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x7.MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x7.THIRD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1153a = iArr;
        }
    }

    public t6(w6 w6Var, z6 z6Var) {
        this.f1151a = w6Var;
        this.f1152b = z6Var;
    }

    public final void a(Context context, View view, View view2, sa.b bVar) {
        g();
        p6 b2 = this.f1151a.b();
        sa saVar = new sa(context, view, view2, b2.a(), b2.b(), b2.e(), b2.c());
        saVar.a(bVar);
        saVar.h();
        this.d = saVar;
    }

    @Override // com.chartboost.sdk.impl.v6
    public void b() {
        ch3 ch3Var;
        String str;
        b7 b7Var = this.c;
        if (b7Var != null) {
            b7Var.l();
            ch3Var = ch3.f636a;
        } else {
            ch3Var = null;
        }
        if (ch3Var == null) {
            str = u6.f1179a;
            f6.a(str, "onImpressionNotifyClick missing om tracker");
        }
    }

    @Override // com.chartboost.sdk.impl.v6
    public void c() {
        ch3 ch3Var;
        String str;
        b7 b7Var = this.c;
        if (b7Var != null) {
            b7Var.j();
            ch3Var = ch3.f636a;
        } else {
            ch3Var = null;
        }
        if (ch3Var == null) {
            str = u6.f1179a;
            f6.a(str, "onImpressionNotifyVideoSkipped missing om tracker");
        }
    }

    @Override // com.chartboost.sdk.impl.v6
    public void d() {
        ch3 ch3Var;
        String str;
        b7 b7Var = this.c;
        if (b7Var != null) {
            b7Var.e();
            ch3Var = ch3.f636a;
        } else {
            ch3Var = null;
        }
        if (ch3Var == null) {
            str = u6.f1179a;
            f6.a(str, "onImpressionNotifyVideoComplete missing om tracker");
        }
    }

    @Override // com.chartboost.sdk.impl.v6
    public void e() {
        ch3 ch3Var;
        String str;
        b7 b7Var = this.c;
        if (b7Var != null) {
            b7Var.i();
            ch3Var = ch3.f636a;
        } else {
            ch3Var = null;
        }
        if (ch3Var == null) {
            str = u6.f1179a;
            f6.a(str, "onImpressionNotifyVideoResumed missing om tracker");
        }
    }

    @Override // com.chartboost.sdk.impl.v6
    public void f() {
        ch3 ch3Var;
        String str;
        b7 b7Var = this.c;
        if (b7Var != null) {
            b7Var.n();
            ch3Var = ch3.f636a;
        } else {
            ch3Var = null;
        }
        if (ch3Var == null) {
            str = u6.f1179a;
            f6.a(str, "onImpressionDestroyWebview missing om tracker");
        }
        this.c = null;
    }

    public final void g() {
        sa saVar = this.d;
        if (saVar != null) {
            saVar.b();
        }
        this.d = null;
    }

    public final boolean h() {
        return this.f1151a.f();
    }

    public final void i() {
        ch3 ch3Var;
        String str;
        b7 b7Var = this.c;
        if (b7Var != null) {
            b7Var.a();
            ch3Var = ch3.f636a;
        } else {
            ch3Var = null;
        }
        if (ch3Var == null) {
            str = u6.f1179a;
            f6.a(str, "signalImpressionEvent missing om tracker");
        }
    }

    public final void j() {
        ch3 ch3Var;
        String str;
        b7 b7Var = this.c;
        if (b7Var != null) {
            b7Var.m();
            b7Var.b();
            ch3Var = ch3.f636a;
        } else {
            ch3Var = null;
        }
        if (ch3Var == null) {
            str = u6.f1179a;
            f6.a(str, "startAndLoadSession missing tracker");
        }
    }

    public final void k() {
        b7 b7Var = this.c;
        if (b7Var != null) {
            b7Var.n();
        }
        this.c = null;
    }

    public final void b(h6 h6Var, i2 i2Var, List<x9> list) throws Exception {
        this.f1151a.d();
        k();
        z6.a a2 = this.f1152b.a(i2Var, h6Var, this.f1151a.c(), this.f1151a.a(), list, this.f1151a.g());
        if (a2 != null) {
            this.c = new b7(a2, this.f1151a.f());
        }
        j();
    }

    @Override // com.chartboost.sdk.impl.v6
    public void a(h6 h6Var, i2 i2Var, List<x9> list) {
        String str;
        try {
            b(h6Var, i2Var, list);
        } catch (Exception e) {
            str = u6.f1179a;
            f6.a(str, "OMSDK Session error: " + e);
        }
    }

    @Override // com.chartboost.sdk.impl.v6
    public void a(float f, float f2) {
        ch3 ch3Var;
        String str;
        b7 b7Var = this.c;
        if (b7Var != null) {
            b7Var.a(f, f2);
            ch3Var = ch3.f636a;
        } else {
            ch3Var = null;
        }
        if (ch3Var == null) {
            str = u6.f1179a;
            f6.a(str, "onImpressionNotifyVideoStarted missing om tracker");
        }
    }

    @Override // com.chartboost.sdk.impl.v6
    public void a(x7 x7Var) {
        ch3 ch3Var;
        String str;
        b7 b7Var = this.c;
        if (b7Var != null) {
            int i = a.f1153a[x7Var.ordinal()];
            if (i == 1) {
                b7Var.f();
            } else if (i == 2) {
                b7Var.g();
            } else if (i == 3) {
                b7Var.k();
            }
            ch3Var = ch3.f636a;
        } else {
            ch3Var = null;
        }
        if (ch3Var == null) {
            str = u6.f1179a;
            f6.a(str, "onImpressionNotifyVideoProgress missing om tracker");
        }
    }

    @Override // com.chartboost.sdk.impl.v6
    public void a() {
        ch3 ch3Var;
        String str;
        b7 b7Var = this.c;
        if (b7Var != null) {
            b7Var.h();
            ch3Var = ch3.f636a;
        } else {
            ch3Var = null;
        }
        if (ch3Var == null) {
            str = u6.f1179a;
            f6.a(str, "onImpressionNotifyVideoPaused missing om tracker");
        }
    }

    @Override // com.chartboost.sdk.impl.v6
    public void a(boolean z) {
        ch3 ch3Var;
        String str;
        b7 b7Var = this.c;
        if (b7Var != null) {
            if (z) {
                b7Var.d();
            } else {
                b7Var.c();
            }
            ch3Var = ch3.f636a;
        } else {
            ch3Var = null;
        }
        if (ch3Var == null) {
            str = u6.f1179a;
            f6.a(str, "onImpressionNotifyVideoBuffer missing om tracker");
        }
    }

    @Override // com.chartboost.sdk.impl.v6
    public void a(float f) {
        ch3 ch3Var;
        String str;
        b7 b7Var = this.c;
        if (b7Var != null) {
            b7Var.a(f);
            ch3Var = ch3.f636a;
        } else {
            ch3Var = null;
        }
        if (ch3Var == null) {
            str = u6.f1179a;
            f6.a(str, "onImpressionNotifyVolumeChanged missing om tracker");
        }
    }

    @Override // com.chartboost.sdk.impl.v6
    public void a(l7 l7Var) {
        ch3 ch3Var;
        String str;
        b7 b7Var = this.c;
        if (b7Var != null) {
            b7Var.a(l7Var);
            ch3Var = ch3.f636a;
        } else {
            ch3Var = null;
        }
        if (ch3Var == null) {
            str = u6.f1179a;
            f6.a(str, "onImpressionNotifyStateChanged missing om tracker");
        }
    }
}
