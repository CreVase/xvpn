package com.chartboost.sdk.impl;

import defpackage.ji1;
import defpackage.k43;
import defpackage.ui1;
import defpackage.v31;

/* loaded from: classes.dex */
public final class y6 implements s6 {

    /* renamed from: a, reason: collision with root package name */
    public final ui1 f1310a;

    /* renamed from: b, reason: collision with root package name */
    public final ui1 f1311b = new k43(c.f1315a);
    public final ui1 c = new k43(new a());

    /* loaded from: classes.dex */
    public static final class a extends ji1 implements v31 {
        public a() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t6 invoke() {
            return new t6(y6.this.a(), y6.this.c());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0 f1313a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t0 f1314b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q0 q0Var, t0 t0Var) {
            super(0);
            this.f1313a = q0Var;
            this.f1314b = t0Var;
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w6 invoke() {
            return new w6(this.f1313a.getContext(), this.f1313a.c(), this.f1313a.g(), this.f1314b.b(), null, 16, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f1315a = new c();

        public c() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z6 invoke() {
            return new z6();
        }
    }

    public y6(q0 q0Var, t0 t0Var) {
        this.f1310a = new k43(new b(q0Var, t0Var));
    }

    @Override // com.chartboost.sdk.impl.s6
    public w6 a() {
        return (w6) this.f1310a.getValue();
    }

    @Override // com.chartboost.sdk.impl.s6
    public t6 b() {
        return (t6) this.c.getValue();
    }

    public z6 c() {
        return (z6) this.f1311b.getValue();
    }
}
