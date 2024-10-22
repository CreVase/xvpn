package com.chartboost.sdk.impl;

import android.os.Handler;
import defpackage.lw3;
import defpackage.v31;

/* loaded from: classes.dex */
public final class t9 implements s9 {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f1160a;

    public t9(Handler handler) {
        this.f1160a = handler;
    }

    public static final void b(v31 v31Var) {
        v31Var.invoke();
    }

    public static final void c(v31 v31Var) {
        v31Var.invoke();
    }

    @Override // com.chartboost.sdk.impl.s9
    public void a(v31 v31Var) {
        this.f1160a.post(new lw3(v31Var, 0));
    }

    @Override // com.chartboost.sdk.impl.s9
    public void a(long j, v31 v31Var) {
        this.f1160a.postDelayed(new lw3(v31Var, 1), j);
    }
}
