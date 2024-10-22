package com.chartboost.sdk.impl;

import defpackage.ji1;
import defpackage.k43;
import defpackage.ui1;
import defpackage.v31;

/* loaded from: classes.dex */
public final class l9 implements k9 {

    /* renamed from: a, reason: collision with root package name */
    public final ui1 f966a;

    /* renamed from: b, reason: collision with root package name */
    public final ui1 f967b;

    /* loaded from: classes.dex */
    public static final class a extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t0 f968a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t0 t0Var) {
            super(0);
            this.f968a = t0Var;
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x3 invoke() {
            n9 f = this.f968a.b().get().f();
            return new x3(f.b(), f.c());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0 f969a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l9 f970b;
        public final /* synthetic */ t0 c;
        public final /* synthetic */ a4 d;
        public final /* synthetic */ p7 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q0 q0Var, l9 l9Var, t0 t0Var, a4 a4Var, p7 p7Var) {
            super(0);
            this.f969a = q0Var;
            this.f970b = l9Var;
            this.c = t0Var;
            this.d = a4Var;
            this.e = p7Var;
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y3 invoke() {
            return new y3(this.f969a.getContext(), this.f970b.b(), this.c.e(), this.c.o(), this.d.b(), this.c.b().get().f(), this.e);
        }
    }

    public l9(q0 q0Var, t0 t0Var, a4 a4Var, p7 p7Var) {
        this.f966a = new k43(new b(q0Var, this, t0Var, a4Var, p7Var));
        this.f967b = new k43(new a(t0Var));
    }

    @Override // com.chartboost.sdk.impl.k9
    public y3 a() {
        return (y3) this.f966a.getValue();
    }

    public x3 b() {
        return (x3) this.f967b.getValue();
    }
}
