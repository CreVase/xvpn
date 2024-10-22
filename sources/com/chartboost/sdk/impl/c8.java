package com.chartboost.sdk.impl;

import defpackage.ji1;
import defpackage.k43;
import defpackage.ui1;
import defpackage.v31;

/* loaded from: classes.dex */
public final class c8 implements b8 {

    /* renamed from: a, reason: collision with root package name */
    public final ui1 f738a;

    /* loaded from: classes.dex */
    public static final class a extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0 f739a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t0 f740b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q0 q0Var, t0 t0Var) {
            super(0);
            this.f739a = q0Var;
            this.f740b = t0Var;
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e8 invoke() {
            return new e8(new a5(this.f739a.getContext()), this.f740b.b());
        }
    }

    public c8(q0 q0Var, t0 t0Var) {
        this.f738a = new k43(new a(q0Var, t0Var));
    }

    @Override // com.chartboost.sdk.impl.b8
    public d8 a() {
        return (d8) this.f738a.getValue();
    }
}
