package com.chartboost.sdk.impl;

import defpackage.ji1;
import defpackage.k43;
import defpackage.ui1;
import defpackage.v31;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class b4 implements a4 {

    /* renamed from: a, reason: collision with root package name */
    public final ui1 f720a = new k43(b.f723a);

    /* renamed from: b, reason: collision with root package name */
    public final ui1 f721b = new k43(a.f722a);

    /* loaded from: classes.dex */
    public static final class a extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f722a = new a();

        public a() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScheduledExecutorService invoke() {
            return k1.a();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f723a = new b();

        public b() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return k1.a(4);
        }
    }

    @Override // com.chartboost.sdk.impl.a4
    public ExecutorService a() {
        return (ExecutorService) this.f720a.getValue();
    }

    @Override // com.chartboost.sdk.impl.a4
    public ScheduledExecutorService b() {
        return (ScheduledExecutorService) this.f721b.getValue();
    }
}
