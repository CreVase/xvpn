package com.chartboost.sdk.impl;

import android.os.Handler;
import com.chartboost.sdk.Mediation;
import defpackage.ji1;
import defpackage.k43;
import defpackage.ng0;
import defpackage.s41;
import defpackage.ui1;
import defpackage.v31;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e<T> {

    /* renamed from: a, reason: collision with root package name */
    public final v31 f779a;

    /* renamed from: b, reason: collision with root package name */
    public final Mediation f780b;
    public final s2 c;
    public final ui1 d;
    public final t e;
    public final z f;
    public final Handler g;
    public final ui1 h;
    public final ScheduledExecutorService i;
    public final x8 j;
    public final h1 k;
    public final c l;

    /* loaded from: classes.dex */
    public static final class a extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<T> f781a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f782b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e<T> eVar, q qVar) {
            super(0);
            this.f781a = eVar;
            this.f782b = qVar;
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w invoke() {
            return new w(this.f781a.c.a(), this.f781a.c.d(), this.f781a.c.e(), this.f782b, this.f781a.c.i(), this.f781a.c.g(), this.f781a.f780b);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<T> f783a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e<T> eVar) {
            super(0);
            this.f783a = eVar;
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AtomicReference<t8> invoke() {
            return this.f783a.c.d().b();
        }
    }

    public e(q qVar, v31 v31Var, Mediation mediation, s2 s2Var) {
        this.f779a = v31Var;
        this.f780b = mediation;
        this.c = s2Var;
        this.d = new k43(new a(this, qVar));
        this.e = b().b();
        this.f = b().c();
        this.g = s2Var.a().d();
        this.h = new k43(new b(this));
        this.i = s2Var.e().b();
        this.j = s2Var.d().h();
        this.k = s2Var.a().a();
        this.l = new d(s2Var.a()).a();
    }

    public final AtomicReference<t8> c() {
        return (AtomicReference) this.h.getValue();
    }

    public final T a() {
        return (T) ((s41) this.f779a.invoke()).invoke(this.e, this.f, this.g, c(), this.i, this.l, this.j, this.k);
    }

    public final w b() {
        return (w) this.d.getValue();
    }

    public /* synthetic */ e(q qVar, v31 v31Var, Mediation mediation, s2 s2Var, int i, ng0 ng0Var) {
        this(qVar, v31Var, mediation, (i & 8) != 0 ? s2.f1122b : s2Var);
    }
}
