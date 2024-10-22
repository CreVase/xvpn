package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.t8;
import defpackage.ji1;
import defpackage.k43;
import defpackage.ui1;
import defpackage.v31;

/* loaded from: classes.dex */
public final class s7 implements r7 {

    /* renamed from: a, reason: collision with root package name */
    public final ui1 f1129a;

    /* loaded from: classes.dex */
    public static final class a extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0 f1130a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q0 q0Var) {
            super(0);
            this.f1130a = q0Var;
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p7 invoke() {
            t7 t7Var = new t7(this.f1130a.f());
            p7 p7Var = new p7(new w7(t7Var), new u4(t7Var), new a8(t7Var), new v4(), new w4(t7Var));
            p7Var.a(new t8.b());
            return p7Var;
        }
    }

    public s7(q0 q0Var) {
        this.f1129a = new k43(new a(q0Var));
    }

    @Override // com.chartboost.sdk.impl.r7
    public p7 a() {
        return (p7) this.f1129a.getValue();
    }
}
