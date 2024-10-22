package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import defpackage.ch3;
import defpackage.ji1;
import defpackage.p71;
import defpackage.v31;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class u5 implements x5 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f1176a;

    /* renamed from: b, reason: collision with root package name */
    public final g2 f1177b;
    public final u3 c;
    public final WeakReference<ViewGroup> d;
    public final c0 e;
    public final q5 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;

    /* loaded from: classes.dex */
    public static final class a extends ji1 implements v31 {
        public a() {
            super(0);
        }

        public final void a() {
            String str;
            str = v5.f1234a;
            f6.b(str, "Cannot display on host because view was not created!");
            u5.this.a(CBError.CBImpressionError.ERROR_CREATING_VIEW);
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    public u5(s0 s0Var, g2 g2Var, u3 u3Var, WeakReference<ViewGroup> weakReference, c0 c0Var, q5 q5Var) {
        this.f1176a = s0Var;
        this.f1177b = g2Var;
        this.c = u3Var;
        this.d = weakReference;
        this.e = c0Var;
        this.f = q5Var;
    }

    public void a(boolean z) {
        this.k = z;
    }

    @Override // com.chartboost.sdk.impl.x5
    public void b(boolean z) {
        this.h = z;
    }

    @Override // com.chartboost.sdk.impl.x5
    public void c(boolean z) {
        this.g = z;
    }

    @Override // com.chartboost.sdk.impl.x5
    public void d(boolean z) {
        this.j = z;
    }

    @Override // com.chartboost.sdk.impl.x5
    public void f() {
        if (!this.i) {
            this.i = true;
            this.f1177b.F();
        }
    }

    @Override // com.chartboost.sdk.impl.x5
    public void g() {
        this.f.a(false);
    }

    @Override // com.chartboost.sdk.impl.x5
    public boolean h() {
        return this.g;
    }

    @Override // com.chartboost.sdk.impl.x5
    public void i() {
        this.e.n();
    }

    @Override // com.chartboost.sdk.impl.x5
    public boolean j() {
        return this.h;
    }

    @Override // com.chartboost.sdk.impl.x5
    public ViewGroup k() {
        return this.d.get();
    }

    @Override // com.chartboost.sdk.impl.x5
    public boolean l() {
        return this.j;
    }

    @Override // com.chartboost.sdk.impl.x5
    public void m() {
        if (a()) {
            return;
        }
        a(true);
        if (l()) {
            this.f.a();
        } else {
            a(CBError.CBImpressionError.INTERNAL);
        }
        this.f1177b.a(w9.SKIP);
        this.f.b();
        this.f1177b.J();
    }

    @Override // com.chartboost.sdk.impl.x5
    public void n() {
        this.e.b(this.f1176a);
    }

    public boolean a() {
        return this.k;
    }

    @Override // com.chartboost.sdk.impl.x5
    public void b() {
        this.f.a(false);
        if (this.i) {
            this.i = false;
            this.f1177b.G();
        }
    }

    @Override // com.chartboost.sdk.impl.x5
    public void a(CBError.CBImpressionError cBImpressionError) {
        this.j = true;
        this.e.a(this.f1176a, cBImpressionError);
    }

    @Override // com.chartboost.sdk.impl.x5
    public void a(s5 s5Var, CBImpressionActivity cBImpressionActivity) {
        String str;
        if (s5Var == s5.LOADING) {
            str = v5.f1234a;
            f6.a(str, "displayOnActivity invalid state: " + s5Var);
            return;
        }
        a(cBImpressionActivity);
    }

    @Override // com.chartboost.sdk.impl.x5
    public void a(ViewGroup viewGroup) {
        String str;
        String str2;
        try {
            if (viewGroup == null) {
                str2 = v5.f1234a;
                f6.b(str2, "Cannot display on host because it is null!");
                a(CBError.CBImpressionError.ERROR_DISPLAYING_VIEW);
                return;
            }
            CBError.CBImpressionError a2 = this.f1177b.a(viewGroup);
            if (a2 != null) {
                f6.b("test", "displayOnHostView tryCreatingViewOnHostView error " + a2);
                a(a2);
                return;
            }
            ra z = this.f1177b.z();
            if (z != null) {
                a(viewGroup, z);
            } else {
                new a();
            }
        } catch (Exception e) {
            str = v5.f1234a;
            p71.z("displayOnHostView e: ", e, str);
            a(CBError.CBImpressionError.ERROR_CREATING_VIEW);
        }
    }

    public final void a(ViewGroup viewGroup, View view) {
        ch3 ch3Var;
        String str;
        Context context;
        this.f.a(s5.DISPLAYED);
        ra z = this.f1177b.z();
        if (z == null || (context = z.getContext()) == null) {
            ch3Var = null;
        } else {
            this.e.a(context);
            ch3Var = ch3.f636a;
        }
        if (ch3Var == null) {
            str = v5.f1234a;
            f6.b(str, "Missing context on onImpressionViewCreated");
        }
        viewGroup.addView(view);
        this.c.a();
    }

    public final void a(CBImpressionActivity cBImpressionActivity) {
        String str;
        String str2;
        this.f.a(s5.DISPLAYED);
        try {
            CBError.CBImpressionError a2 = this.f1177b.a(cBImpressionActivity);
            if (a2 != null) {
                a(a2);
                return;
            }
            ra z = this.f1177b.z();
            if (z != null) {
                z.a(false);
            }
            str2 = v5.f1234a;
            f6.c(str2, "Displaying the impression");
        } catch (Exception e) {
            str = v5.f1234a;
            p71.z("Cannot create view in protocol: ", e, str);
            a(CBError.CBImpressionError.ERROR_CREATING_VIEW);
        }
    }
}
