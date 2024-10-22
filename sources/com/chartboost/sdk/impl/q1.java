package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.chartboost.sdk.impl.q;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import defpackage.m20;
import defpackage.ng0;
import defpackage.p71;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class q1 implements h5, o5, k5, x5 {

    /* renamed from: a, reason: collision with root package name */
    public final l5 f1079a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h5 f1080b;
    public final /* synthetic */ o5 c;
    public final /* synthetic */ k5 d;
    public final /* synthetic */ x5 e;
    public s5 f;

    public q1(l5 l5Var, ViewGroup viewGroup, h5 h5Var, o5 o5Var, k5 k5Var, x5 x5Var) {
        this.f1079a = l5Var;
        this.f1080b = h5Var;
        this.c = o5Var;
        this.d = k5Var;
        this.e = x5Var;
        this.f = s5.LOADING;
    }

    public final void A() {
        if (this.f1079a.m().m() <= 1) {
            d();
            g2 m = this.f1079a.m();
            m.b(m.m() + 1);
        }
    }

    public final void B() {
        if (l() && m20.L(this.f1079a.a(), q.c.g)) {
            A();
        }
    }

    public final void C() {
        if (this.f1079a.m().n() <= 1) {
            M();
            g2 m = this.f1079a.m();
            m.c(m.n() + 1);
        }
    }

    public final boolean D() {
        return this.f1079a.m().B();
    }

    public final boolean E() {
        View view;
        if (this.f1079a.m().z() != null) {
            ra z = this.f1079a.m().z();
            if (z != null) {
                view = z.getRootView();
            } else {
                view = null;
            }
            if (view != null) {
                return false;
            }
        }
        return true;
    }

    public final void F() {
        String str;
        try {
            if (this.f1079a.m() instanceof ja) {
                ((ja) this.f1079a.m()).P();
            } else {
                this.f1079a.m().C();
                this.f1079a.m().a(w9.VOLUME_CHANGE);
            }
        } catch (Exception unused) {
            str = s1.f1121a;
            f6.b(str, "Invalid mute video command");
        }
    }

    public final void G() {
        b(this.f1079a.i(), Float.valueOf(this.f1079a.m().y()), Float.valueOf(this.f1079a.m().x()));
        c();
    }

    public final void H() {
        if (this.f1079a.m().q() <= 1) {
            C();
            g2 m = this.f1079a.m();
            m.d(m.q() + 1);
        }
    }

    public final void I() {
        if (this.f == s5.DISPLAYED && !l()) {
            n();
            d(true);
        }
    }

    public final void J() {
        String str;
        try {
            ((ja) this.f1079a.m()).S();
        } catch (Exception e) {
            str = s1.f1121a;
            p71.z("Invalid pause video command: ", e, str);
        }
    }

    public final void K() {
        String str;
        try {
            ((ja) this.f1079a.m()).T();
        } catch (Exception e) {
            str = s1.f1121a;
            p71.z("Invalid play video command: ", e, str);
        }
    }

    public final void L() {
        this.f = s5.LOADING;
        CBError.CBImpressionError H = this.f1079a.m().H();
        if (H == null) {
            i();
        } else {
            b(H);
        }
    }

    public final void M() {
        a(this.f1079a.i(), Float.valueOf(this.f1079a.m().y()), Float.valueOf(this.f1079a.m().x()));
    }

    public final boolean N() {
        return this.f1079a.a().c();
    }

    public final void O() {
        if (this.f1079a.m().r() <= 1) {
            A();
            C();
            g2 m = this.f1079a.m();
            m.e(m.r() + 1);
        }
    }

    public final void P() {
        String str;
        try {
            if (this.f1079a.m() instanceof ja) {
                ((ja) this.f1079a.m()).V();
            } else {
                this.f1079a.m().K();
                this.f1079a.m().a(w9.VOLUME_CHANGE);
            }
        } catch (Exception unused) {
            str = s1.f1121a;
            f6.b(str, "Invalid unmute video command");
        }
    }

    public final void Q() {
        this.f1079a.m().D();
    }

    public final void R() {
        this.f1079a.m().g();
    }

    public final void S() {
        if (this.f1079a.m() instanceof ja) {
            this.f1079a.m().g();
        }
        if (this.f1079a.m() instanceof j2) {
            this.f1079a.m().g();
        }
    }

    @Override // com.chartboost.sdk.impl.o5
    public void a() {
        this.c.a();
    }

    @Override // com.chartboost.sdk.impl.x5
    public void b() {
        this.e.b();
    }

    @Override // com.chartboost.sdk.impl.h5
    public void c() {
        this.f1080b.c();
    }

    @Override // com.chartboost.sdk.impl.k5
    public void d() {
        this.d.d();
    }

    @Override // com.chartboost.sdk.impl.o5
    public void e(boolean z) {
        this.c.e(z);
    }

    @Override // com.chartboost.sdk.impl.x5
    public void f() {
        this.e.f();
    }

    @Override // com.chartboost.sdk.impl.x5
    public void g() {
        this.e.g();
    }

    @Override // com.chartboost.sdk.impl.x5
    public boolean h() {
        return this.e.h();
    }

    @Override // com.chartboost.sdk.impl.x5
    public void i() {
        this.e.i();
    }

    @Override // com.chartboost.sdk.impl.x5
    public boolean j() {
        return this.e.j();
    }

    @Override // com.chartboost.sdk.impl.x5
    public ViewGroup k() {
        return this.e.k();
    }

    @Override // com.chartboost.sdk.impl.x5
    public boolean l() {
        return this.e.l();
    }

    @Override // com.chartboost.sdk.impl.x5
    public void m() {
        this.e.m();
    }

    @Override // com.chartboost.sdk.impl.x5
    public void n() {
        this.e.n();
    }

    public final boolean o() {
        return this.f1079a.a().a();
    }

    public final void p() {
        String str;
        try {
            ((ja) this.f1079a.m()).L();
        } catch (Exception e) {
            str = s1.f1121a;
            p71.z("Invalid close video command: ", e, str);
        }
    }

    public final String q() {
        return this.f1079a.b().i();
    }

    public final String r() {
        return this.f1079a.b().o();
    }

    public s5 s() {
        return this.f;
    }

    public final String t() {
        return this.f1079a.m().j();
    }

    public final String u() {
        return this.f1079a.m().l();
    }

    public final String v() {
        return this.f1079a.m().p();
    }

    public final String w() {
        return this.f1079a.m().t();
    }

    public final String x() {
        return this.f1079a.m().u();
    }

    public final int y() {
        if (this.f1079a.m() instanceof ja) {
            return ((ja) this.f1079a.m()).N();
        }
        return -1;
    }

    public final ra z() {
        return this.f1079a.m().z();
    }

    @Override // com.chartboost.sdk.impl.h5
    public void a(Context context, String str, Boolean bool) {
        this.f1080b.a(context, str, bool);
    }

    @Override // com.chartboost.sdk.impl.h5
    public void b(String str, Float f, Float f2) {
        this.f1080b.b(str, f, f2);
    }

    @Override // com.chartboost.sdk.impl.x5
    public void c(boolean z) {
        this.e.c(z);
    }

    @Override // com.chartboost.sdk.impl.x5
    public void d(boolean z) {
        this.e.d(z);
    }

    public final void e() {
        a(this.f);
    }

    @Override // com.chartboost.sdk.impl.x5
    public void a(ViewGroup viewGroup) {
        this.e.a(viewGroup);
    }

    @Override // com.chartboost.sdk.impl.x5
    public void b(boolean z) {
        this.e.b(z);
    }

    @Override // com.chartboost.sdk.impl.o5
    public void a(s5 s5Var) {
        this.c.a(s5Var);
    }

    public void b(s5 s5Var) {
        this.f = s5Var;
    }

    @Override // com.chartboost.sdk.impl.x5
    public void a(s5 s5Var, CBImpressionActivity cBImpressionActivity) {
        this.e.a(s5Var, cBImpressionActivity);
    }

    public final void b(CBError.CBImpressionError cBImpressionError) {
        if (l()) {
            this.f1079a.c().k();
        } else {
            a(cBImpressionError);
        }
    }

    public /* synthetic */ q1(l5 l5Var, ViewGroup viewGroup, h5 h5Var, o5 o5Var, k5 k5Var, x5 x5Var, int i, ng0 ng0Var) {
        this(l5Var, viewGroup, (i & 4) != 0 ? new f5(l5Var.b(), l5Var.l(), l5Var.e(), l5Var.j(), l5Var.h(), l5Var.k(), l5Var.c()) : h5Var, (i & 8) != 0 ? new m5(l5Var.b(), l5Var.i(), l5Var.a(), l5Var.c(), l5Var.h(), l5Var.d(), l5Var.g(), l5Var.k()) : o5Var, (i & 16) != 0 ? new i5(l5Var.b(), l5Var.a(), l5Var.f(), l5Var.c()) : k5Var, (i & 32) != 0 ? new u5(l5Var.d(), l5Var.m(), l5Var.g(), new WeakReference(viewGroup), l5Var.c(), l5Var.h()) : x5Var);
    }

    @Override // com.chartboost.sdk.impl.x5
    public void a(CBError.CBImpressionError cBImpressionError) {
        this.e.a(cBImpressionError);
    }

    @Override // com.chartboost.sdk.impl.h5
    public void a(String str, CBError.CBClickError cBClickError) {
        this.f1080b.a(str, cBClickError);
    }

    @Override // com.chartboost.sdk.impl.k5
    public void a(String str, Float f, Float f2) {
        this.d.a(str, f, f2);
    }

    public final void b(String str) {
        List<String> list;
        Map<String, List<String>> h = this.f1079a.b().h();
        if (!(str.length() > 0) || (list = h.get(str)) == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f1079a.m().d((String) it.next());
        }
    }

    @Override // com.chartboost.sdk.impl.h5
    public void a(boolean z) {
        this.f1080b.a(z);
    }

    @Override // com.chartboost.sdk.impl.h5
    public boolean a(Context context, Boolean bool, s5 s5Var) {
        return this.f1080b.a(context, bool, s5Var);
    }

    public final void a(boolean z, String str) {
        this.f1079a.m().a(z, str);
    }

    public final void a(List<x9> list) {
        this.f1079a.m().a(list);
    }

    public final void a(float f, float f2) {
        this.f1079a.m().a(f, f2);
    }

    public final void b(float f) {
        this.f1079a.m().b(f);
    }

    public final void a(float f) {
        this.f1079a.m().a(f);
    }

    public final void a(m7 m7Var) {
        this.f1079a.m().a(m7Var);
    }

    public final void a(w9 w9Var) {
        this.f1079a.m().a(w9Var);
    }

    public final void a(Context context, Boolean bool) {
        a(context, bool, this.f);
    }

    public final void a(String str) {
        b(this.f1079a.m().b(str));
    }
}
