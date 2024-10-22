package com.chartboost.sdk.impl;

import defpackage.aa0;
import defpackage.ba0;
import defpackage.c90;
import defpackage.ch3;
import defpackage.df1;
import defpackage.fl;
import defpackage.ji1;
import defpackage.k43;
import defpackage.ke0;
import defpackage.l41;
import defpackage.n41;
import defpackage.pd0;
import defpackage.ui1;
import defpackage.v31;
import defpackage.v90;
import defpackage.y41;
import defpackage.z33;
import defpackage.zf3;

/* loaded from: classes.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    public final b f706a;

    /* renamed from: b, reason: collision with root package name */
    public float f707b;
    public final v90 c;
    public final ui1 d;
    public long e;
    public long f;
    public df1 g;

    /* loaded from: classes.dex */
    public /* synthetic */ class a extends y41 implements n41 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f708a = new a();

        public a() {
            super(3, ba.class, "createRandomAccessFile", "createRandomAccessFile(Lcom/chartboost/sdk/internal/video/VideoAsset;Lcom/chartboost/sdk/internal/video/TempFileDownloadHelper;Lcom/chartboost/sdk/internal/Libraries/FileCache;)Lcom/chartboost/sdk/internal/utils/RandomAccessFileWrapper;", 1);
        }

        @Override // defpackage.n41
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y7 invoke(y9 y9Var, d9 d9Var, r4 r4Var) {
            y7 b2;
            b2 = ba.b(y9Var, d9Var, r4Var);
            return b2;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void g();
    }

    @ke0(c = "com.chartboost.sdk.internal.video.player.mediaplayer.VideoBuffer$checkBufferDownload$1", f = "VideoBuffer.kt", l = {69}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends z33 implements l41 {

        /* renamed from: a, reason: collision with root package name */
        public int f709a;

        public c(c90 c90Var) {
            super(2, c90Var);
        }

        @Override // defpackage.l41
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(aa0 aa0Var, c90 c90Var) {
            return ((c) create(aa0Var, c90Var)).invokeSuspend(ch3.f636a);
        }

        @Override // defpackage.mn
        public final c90 create(Object obj, c90 c90Var) {
            return new c(c90Var);
        }

        @Override // defpackage.mn
        public final Object invokeSuspend(Object obj) {
            ba0 ba0Var = ba0.f430a;
            int i = this.f709a;
            if (i != 0) {
                if (i == 1) {
                    fl.a0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                fl.a0(obj);
                this.f709a = 1;
                if (defpackage.t9.C(1500L, this) == ba0Var) {
                    return ba0Var;
                }
            }
            aa.this.b();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n41 f711a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y9 f712b;
        public final /* synthetic */ d9 c;
        public final /* synthetic */ r4 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(n41 n41Var, y9 y9Var, d9 d9Var, r4 r4Var) {
            super(0);
            this.f711a = n41Var;
            this.f712b = y9Var;
            this.c = d9Var;
            this.d = r4Var;
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y7 invoke() {
            return (y7) this.f711a.invoke(this.f712b, this.c, this.d);
        }
    }

    public aa(y9 y9Var, b bVar, float f, d9 d9Var, r4 r4Var, v90 v90Var, n41 n41Var) {
        this.f706a = bVar;
        this.f707b = f;
        this.c = v90Var;
        this.d = new k43(new d(n41Var, y9Var, d9Var, r4Var));
        this.e = y9Var.c();
    }

    public final void b() {
        long j;
        y7 d2 = d();
        if (d2 != null) {
            j = d2.c();
        } else {
            j = 0;
        }
        long j2 = this.e;
        if (j == j2) {
            f();
        } else if (((float) (j - this.f)) / ((float) j2) > this.f707b) {
            f();
        } else {
            c();
        }
    }

    public final void c() {
        this.g = zf3.T(pd0.d(this.c), null, new c(null), 3);
    }

    public final y7 d() {
        return (y7) this.d.getValue();
    }

    public final void e() {
        df1 df1Var = this.g;
        if (df1Var != null) {
            df1Var.c(null);
        }
        this.g = null;
    }

    public final void f() {
        this.f = 0L;
        e();
        this.f706a.g();
    }

    public final void a() {
        if (this.f == 0) {
            y7 d2 = d();
            this.f = d2 != null ? d2.c() : 0L;
        }
    }

    public final void a(int i) {
        long j = this.e;
        if (j <= 0 || i <= 0) {
            return;
        }
        float f = ((float) j) / 1000000.0f;
        this.f707b = ((f / 1000.0f) / ((i / 60000.0f) * 0.0075f)) / (f * 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aa(com.chartboost.sdk.impl.y9 r10, com.chartboost.sdk.impl.aa.b r11, float r12, com.chartboost.sdk.impl.d9 r13, com.chartboost.sdk.impl.r4 r14, defpackage.v90 r15, defpackage.n41 r16, int r17, defpackage.ng0 r18) {
        /*
            r9 = this;
            r0 = r17 & 4
            if (r0 == 0) goto Lb
            r0 = 1008981770(0x3c23d70a, float:0.01)
            r4 = 1008981770(0x3c23d70a, float:0.01)
            goto Lc
        Lb:
            r4 = r12
        Lc:
            r0 = r17 & 8
            if (r0 == 0) goto L17
            com.chartboost.sdk.impl.d9 r0 = new com.chartboost.sdk.impl.d9
            r0.<init>()
            r5 = r0
            goto L18
        L17:
            r5 = r13
        L18:
            r0 = r17 & 32
            if (r0 == 0) goto L22
            qi0 r0 = defpackage.vl0.f4854a
            yo1 r0 = defpackage.zo1.f5522a
            r7 = r0
            goto L23
        L22:
            r7 = r15
        L23:
            r0 = r17 & 64
            if (r0 == 0) goto L2b
            com.chartboost.sdk.impl.aa$a r0 = com.chartboost.sdk.impl.aa.a.f708a
            r8 = r0
            goto L2d
        L2b:
            r8 = r16
        L2d:
            r1 = r9
            r2 = r10
            r3 = r11
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.aa.<init>(com.chartboost.sdk.impl.y9, com.chartboost.sdk.impl.aa$b, float, com.chartboost.sdk.impl.d9, com.chartboost.sdk.impl.r4, v90, n41, int, ng0):void");
    }
}
