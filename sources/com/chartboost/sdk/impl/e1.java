package com.chartboost.sdk.impl;

import android.os.Handler;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.e1;
import defpackage.j11;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class e1 implements d1 {

    /* renamed from: a, reason: collision with root package name */
    public final u3 f786a;

    /* renamed from: b, reason: collision with root package name */
    public final h9 f787b;
    public final ka c;
    public Handler d;
    public q e;
    public final Mediation f;

    public e1(u3 u3Var, h9 h9Var, ka kaVar, Handler handler, q qVar, Mediation mediation) {
        this.f786a = u3Var;
        this.f787b = h9Var;
        this.c = kaVar;
        this.d = handler;
        this.e = qVar;
        this.f = mediation;
    }

    @Override // com.chartboost.sdk.impl.d1
    public void a(final s0 s0Var, String str, final z0 z0Var, final v vVar) {
        final r a2 = s0Var.a();
        if (a2 == null) {
            return;
        }
        x0 x0Var = new x0() { // from class: mv3
            @Override // com.chartboost.sdk.impl.x0
            public final void a(boolean z) {
                e1.a(e1.this, s0Var, a2, vVar, z0Var, z);
            }
        };
        this.f786a.c();
        this.f786a.a(o7.NORMAL, a2.c(), new AtomicInteger(), (x0) p4.a().a(x0Var), str);
    }

    public static final void a(e1 e1Var, s0 s0Var, r rVar, v vVar, z0 z0Var, boolean z) {
        a1 a1Var;
        if (z) {
            a1Var = e1Var.a(s0Var, rVar, vVar);
        } else if (!z) {
            a1Var = a1.FAILURE;
        } else {
            throw new j11(null);
        }
        z0Var.a(s0Var, a1Var);
    }

    public final a1 a(s0 s0Var, r rVar, v vVar) {
        vVar.a(s0Var);
        if (rVar.v()) {
            if (!this.c.a(rVar.t())) {
                this.c.a(rVar.u(), rVar.t(), false, null);
            }
            return a1.SUCCESS;
        }
        return a1.READY_TO_SHOW;
    }
}
