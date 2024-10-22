package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.ga;
import defpackage.aa0;
import defpackage.c90;
import defpackage.ch3;
import defpackage.df1;
import defpackage.ke0;
import defpackage.l41;
import defpackage.pd0;
import defpackage.v90;
import defpackage.z33;
import defpackage.zf3;

/* loaded from: classes.dex */
public final class ha implements ga {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f859a;

    /* renamed from: b, reason: collision with root package name */
    public final ga.b f860b;
    public final v90 c;
    public df1 d;

    @ke0(c = "com.chartboost.sdk.internal.video.player.scheduler.VideoProgressSchedulerCoroutines$startProgressUpdate$1", f = "VideoProgressSchedulerCoroutines.kt", l = {28}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends z33 implements l41 {

        /* renamed from: a, reason: collision with root package name */
        public int f861a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f862b;
        public final /* synthetic */ ha c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, ha haVar, c90 c90Var) {
            super(2, c90Var);
            this.f862b = j;
            this.c = haVar;
        }

        @Override // defpackage.l41
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(aa0 aa0Var, c90 c90Var) {
            return ((a) create(aa0Var, c90Var)).invokeSuspend(ch3.f636a);
        }

        @Override // defpackage.mn
        public final c90 create(Object obj, c90 c90Var) {
            return new a(this.f862b, this.c, c90Var);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0022 -> B:5:0x0025). Please report as a decompilation issue!!! */
        @Override // defpackage.mn
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                ba0 r0 = defpackage.ba0.f430a
                int r1 = r5.f861a
                r2 = 1
                if (r1 == 0) goto L16
                if (r1 != r2) goto Le
                defpackage.fl.a0(r6)
                r6 = r5
                goto L25
            Le:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L16:
                defpackage.fl.a0(r6)
                r6 = r5
            L1a:
                long r3 = r6.f862b
                r6.f861a = r2
                java.lang.Object r1 = defpackage.t9.C(r3, r6)
                if (r1 != r0) goto L25
                return r0
            L25:
                com.chartboost.sdk.impl.ha r1 = r6.c
                com.chartboost.sdk.impl.l0 r1 = com.chartboost.sdk.impl.ha.a(r1)
                if (r1 == 0) goto L1a
                com.chartboost.sdk.impl.ha r3 = r6.c
                com.chartboost.sdk.impl.ga$b r3 = com.chartboost.sdk.impl.ha.b(r3)
                long r3 = r3.b()
                r1.a(r3)
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.ha.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ha(l0 l0Var, ga.b bVar, v90 v90Var) {
        this.f859a = l0Var;
        this.f860b = bVar;
        this.c = v90Var;
    }

    @Override // com.chartboost.sdk.impl.ga
    public void a(long j) {
        String str;
        str = ia.f882a;
        f6.a(str, "startProgressUpdate()");
        if (this.d != null) {
            return;
        }
        this.d = zf3.T(pd0.d(this.c), null, new a(j, this, null), 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ha(com.chartboost.sdk.impl.l0 r1, com.chartboost.sdk.impl.ga.b r2, defpackage.v90 r3, int r4, defpackage.ng0 r5) {
        /*
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            qi0 r3 = defpackage.vl0.f4854a
            yo1 r3 = defpackage.zo1.f5522a
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.ha.<init>(com.chartboost.sdk.impl.l0, com.chartboost.sdk.impl.ga$b, v90, int, ng0):void");
    }

    @Override // com.chartboost.sdk.impl.ga
    public void a() {
        String str;
        str = ia.f882a;
        f6.a(str, "stopProgressUpdate()");
        df1 df1Var = this.d;
        if (df1Var != null) {
            df1Var.c(null);
        }
        this.d = null;
    }
}
