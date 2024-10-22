package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import defpackage.ch3;
import defpackage.p71;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e8 implements d8 {

    /* renamed from: a, reason: collision with root package name */
    public final a5 f797a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<t8> f798b;
    public WeakReference<a> c;
    public WeakReference<a0> d;

    public e8(a5 a5Var, AtomicReference<t8> atomicReference) {
        this.f797a = a5Var;
        this.f798b = atomicReference;
    }

    @Override // com.chartboost.sdk.impl.d8
    public void a(a aVar, CBImpressionActivity cBImpressionActivity) {
        a0 a0Var;
        this.c = new WeakReference<>(aVar);
        WeakReference<a0> weakReference = this.d;
        if (weakReference == null || (a0Var = weakReference.get()) == null) {
            return;
        }
        a0Var.a(cBImpressionActivity);
    }

    @Override // com.chartboost.sdk.impl.d8
    public void b() {
        ch3 ch3Var;
        String str;
        a0 a0Var;
        WeakReference<a0> weakReference = this.d;
        if (weakReference != null && (a0Var = weakReference.get()) != null) {
            a0Var.q();
            ch3Var = ch3.f636a;
        } else {
            ch3Var = null;
        }
        if (ch3Var == null) {
            str = f8.f823a;
            f6.a(str, "Bridge onResume missing callback to renderer");
        }
    }

    @Override // com.chartboost.sdk.impl.d8
    public t8 c() {
        return this.f798b.get();
    }

    @Override // com.chartboost.sdk.impl.d8
    public void d() {
        a0 a0Var;
        WeakReference<a0> weakReference = this.d;
        if (weakReference != null && (a0Var = weakReference.get()) != null) {
            a0Var.d();
        }
    }

    @Override // com.chartboost.sdk.impl.d8
    public boolean e() {
        a0 a0Var;
        WeakReference<a0> weakReference = this.d;
        if (weakReference != null && (a0Var = weakReference.get()) != null) {
            return a0Var.e();
        }
        return false;
    }

    @Override // com.chartboost.sdk.impl.d8
    public void f() {
        ch3 ch3Var;
        String str;
        a0 a0Var;
        WeakReference<a0> weakReference = this.d;
        if (weakReference != null && (a0Var = weakReference.get()) != null) {
            a0Var.x();
            ch3Var = ch3.f636a;
        } else {
            ch3Var = null;
        }
        if (ch3Var == null) {
            str = f8.f823a;
            f6.a(str, "Bridge onPause missing callback to renderer");
        }
    }

    @Override // com.chartboost.sdk.impl.d8
    public void g() {
        ch3 ch3Var;
        String str;
        a0 a0Var;
        WeakReference<a0> weakReference = this.d;
        if (weakReference != null && (a0Var = weakReference.get()) != null) {
            a0Var.o();
            ch3Var = ch3.f636a;
        } else {
            ch3Var = null;
        }
        if (ch3Var == null) {
            str = f8.f823a;
            f6.a(str, "Bridge onStart missing callback to renderer");
        }
    }

    @Override // com.chartboost.sdk.impl.d8
    public void h() {
        ch3 ch3Var;
        String str;
        a0 a0Var;
        WeakReference<a0> weakReference = this.d;
        if (weakReference != null && (a0Var = weakReference.get()) != null) {
            a0Var.w();
            ch3Var = ch3.f636a;
        } else {
            ch3Var = null;
        }
        if (ch3Var == null) {
            str = f8.f823a;
            f6.a(str, "Bridge onDestroy missing callback to renderer");
        }
    }

    @Override // com.chartboost.sdk.impl.d8
    public void a(ra raVar) {
        ch3 ch3Var;
        String str;
        a aVar;
        WeakReference<a> weakReference = this.c;
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            ch3Var = null;
        } else {
            aVar.a(raVar);
            ch3Var = ch3.f636a;
        }
        if (ch3Var == null) {
            str = f8.f823a;
            f6.a(str, "activityInterface is null");
        }
    }

    @Override // com.chartboost.sdk.impl.d8
    public void a(a0 a0Var) {
        String str;
        this.d = new WeakReference<>(a0Var);
        try {
            a5 a5Var = this.f797a;
            a5Var.a(a5Var.a());
        } catch (Exception e) {
            str = f8.f823a;
            p71.z("Please add CBImpressionActivity in AndroidManifest.xml following README.md instructions. ", e, str);
            a(CBError.CBImpressionError.ACTIVITY_MISSING_IN_MANIFEST);
        }
    }

    @Override // com.chartboost.sdk.impl.d8
    public void a(CBError.CBImpressionError cBImpressionError) {
        a0 a0Var;
        WeakReference<a0> weakReference = this.d;
        if (weakReference == null || (a0Var = weakReference.get()) == null) {
            return;
        }
        a0Var.a(cBImpressionError);
    }

    @Override // com.chartboost.sdk.impl.d8
    public void a() {
        a aVar;
        WeakReference<a> weakReference = this.c;
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            return;
        }
        aVar.a();
    }
}
