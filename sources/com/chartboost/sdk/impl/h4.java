package com.chartboost.sdk.impl;

import android.content.Context;
import defpackage.bu0;
import defpackage.cp3;
import defpackage.ji1;
import defpackage.kt0;
import defpackage.nt0;
import defpackage.ot0;
import defpackage.qt1;
import defpackage.v31;
import defpackage.wl1;

/* loaded from: classes.dex */
public final class h4 {

    /* renamed from: a, reason: collision with root package name */
    public final v31 f851a;

    /* renamed from: b, reason: collision with root package name */
    public final v31 f852b;
    public final Context c;

    /* loaded from: classes.dex */
    public static final class a extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c4 f853a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c4 c4Var) {
            super(0);
            this.f853a = c4Var;
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final qt1 invoke() {
            return n3.a(this.f853a.b());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f854a = new b();

        public b() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wl1 invoke() {
            return n3.a(0, 0, 3, (Object) null);
        }
    }

    public h4(Context context, c4 c4Var, v31 v31Var, v31 v31Var2) {
        this.f851a = v31Var;
        this.f852b = v31Var2;
        this.c = context.getApplicationContext();
    }

    public final ot0 a() {
        nt0 nt0Var = new nt0(this.c);
        qt1 qt1Var = (qt1) this.f851a.invoke();
        cp3.m(!nt0Var.r);
        qt1Var.getClass();
        nt0Var.d = new kt0(qt1Var, 0);
        wl1 wl1Var = (wl1) this.f852b.invoke();
        cp3.m(!nt0Var.r);
        wl1Var.getClass();
        nt0Var.f = new kt0(wl1Var, 1);
        cp3.m(!nt0Var.r);
        nt0Var.r = true;
        return new bu0(nt0Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ h4(android.content.Context r1, com.chartboost.sdk.impl.c4 r2, defpackage.v31 r3, defpackage.v31 r4, int r5, defpackage.ng0 r6) {
        /*
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto Le
            com.chartboost.sdk.impl.s2 r2 = com.chartboost.sdk.impl.s2.f1122b
            com.chartboost.sdk.impl.t0 r2 = r2.d()
            com.chartboost.sdk.impl.c4 r2 = r2.c()
        Le:
            r6 = r5 & 4
            if (r6 == 0) goto L17
            com.chartboost.sdk.impl.h4$a r3 = new com.chartboost.sdk.impl.h4$a
            r3.<init>(r2)
        L17:
            r5 = r5 & 8
            if (r5 == 0) goto L1d
            com.chartboost.sdk.impl.h4$b r4 = com.chartboost.sdk.impl.h4.b.f854a
        L1d:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.h4.<init>(android.content.Context, com.chartboost.sdk.impl.c4, v31, v31, int, ng0):void");
    }
}
