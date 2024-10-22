package com.chartboost.sdk.impl;

import defpackage.ji1;
import defpackage.k43;
import defpackage.ui1;
import defpackage.v31;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f745a;

    /* renamed from: b, reason: collision with root package name */
    public final ui1 f746b = new k43(new a());

    /* loaded from: classes.dex */
    public static final class a extends ji1 implements v31 {
        public a() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            return new c(d.this.f745a.d());
        }
    }

    public d(q0 q0Var) {
        this.f745a = q0Var;
    }

    public c a() {
        return (c) this.f746b.getValue();
    }
}
