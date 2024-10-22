package com.chartboost.sdk.impl;

import android.os.Handler;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.q;
import defpackage.ji1;
import defpackage.s41;
import defpackage.v31;
import defpackage.y41;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class f {

    /* loaded from: classes.dex */
    public static final class a extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f804a = new a();

        /* renamed from: com.chartboost.sdk.impl.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0000a extends y41 implements s41 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0000a f805a = new C0000a();

            public C0000a() {
                super(8, g1.class, "<init>", "<init>(Lcom/chartboost/sdk/internal/AdUnitManager/loaders/AdUnitLoader;Lcom/chartboost/sdk/internal/AdUnitManager/render/AdUnitRenderer;Landroid/os/Handler;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/ScheduledExecutorService;Lcom/chartboost/sdk/internal/api/AdApiCallbackSender;Lcom/chartboost/sdk/tracking/Session;Lcom/chartboost/sdk/internal/utils/Base64Wrapper;)V", 0);
            }

            @Override // defpackage.s41
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g1 invoke(t tVar, z zVar, Handler handler, AtomicReference<t8> atomicReference, ScheduledExecutorService scheduledExecutorService, com.chartboost.sdk.impl.c cVar, x8 x8Var, h1 h1Var) {
                return new g1(tVar, zVar, handler, atomicReference, scheduledExecutorService, cVar, x8Var, h1Var);
            }
        }

        public a() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s41 invoke() {
            return C0000a.f805a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f806a = new b();

        /* loaded from: classes.dex */
        public /* synthetic */ class a extends y41 implements s41 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f807a = new a();

            public a() {
                super(8, c6.class, "<init>", "<init>(Lcom/chartboost/sdk/internal/AdUnitManager/loaders/AdUnitLoader;Lcom/chartboost/sdk/internal/AdUnitManager/render/AdUnitRenderer;Landroid/os/Handler;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/ScheduledExecutorService;Lcom/chartboost/sdk/internal/api/AdApiCallbackSender;Lcom/chartboost/sdk/tracking/Session;Lcom/chartboost/sdk/internal/utils/Base64Wrapper;)V", 0);
            }

            @Override // defpackage.s41
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c6 invoke(t tVar, z zVar, Handler handler, AtomicReference<t8> atomicReference, ScheduledExecutorService scheduledExecutorService, com.chartboost.sdk.impl.c cVar, x8 x8Var, h1 h1Var) {
                return new c6(tVar, zVar, handler, atomicReference, scheduledExecutorService, cVar, x8Var, h1Var);
            }
        }

        public b() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s41 invoke() {
            return a.f807a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f808a = new c();

        /* loaded from: classes.dex */
        public /* synthetic */ class a extends y41 implements s41 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f809a = new a();

            public a() {
                super(8, m8.class, "<init>", "<init>(Lcom/chartboost/sdk/internal/AdUnitManager/loaders/AdUnitLoader;Lcom/chartboost/sdk/internal/AdUnitManager/render/AdUnitRenderer;Landroid/os/Handler;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/ScheduledExecutorService;Lcom/chartboost/sdk/internal/api/AdApiCallbackSender;Lcom/chartboost/sdk/tracking/Session;Lcom/chartboost/sdk/internal/utils/Base64Wrapper;)V", 0);
            }

            @Override // defpackage.s41
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m8 invoke(t tVar, z zVar, Handler handler, AtomicReference<t8> atomicReference, ScheduledExecutorService scheduledExecutorService, com.chartboost.sdk.impl.c cVar, x8 x8Var, h1 h1Var) {
                return new m8(tVar, zVar, handler, atomicReference, scheduledExecutorService, cVar, x8Var, h1Var);
            }
        }

        public c() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s41 invoke() {
            return a.f809a;
        }
    }

    public static final g1 a(Mediation mediation) {
        return (g1) new e(q.a.g, a.f804a, mediation, null, 8, null).a();
    }

    public static final c6 b(Mediation mediation) {
        return (c6) new e(q.b.g, b.f806a, mediation, null, 8, null).a();
    }

    public static final m8 c(Mediation mediation) {
        return (m8) new e(q.c.g, c.f808a, mediation, null, 8, null).a();
    }
}
