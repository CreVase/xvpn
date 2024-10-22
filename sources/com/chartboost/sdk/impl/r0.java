package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import defpackage.ew3;
import defpackage.ji1;
import defpackage.k43;
import defpackage.ui1;
import defpackage.v31;

/* loaded from: classes.dex */
public final class r0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1091a;

    /* renamed from: b, reason: collision with root package name */
    public final ui1 f1092b = new k43(new d());
    public final ui1 c = new k43(a.f1093a);
    public final ui1 d = new k43(f.f1098a);
    public final ui1 e = new k43(new g());
    public final ui1 f = new k43(b.f1094a);
    public final ui1 g = new k43(new c());
    public final ui1 h = new k43(new e());

    /* loaded from: classes.dex */
    public static final class a extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1093a = new a();

        public a() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p0 invoke() {
            return p0.b();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f1094a = new b();

        public b() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h1 invoke() {
            return new h1();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends ji1 implements v31 {
        public c() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k8 invoke() {
            return new k8(r0.this.getContext().getResources());
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends ji1 implements v31 {
        public d() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return r0.this.getContext().getSharedPreferences("cbPrefs", 0);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends ji1 implements v31 {
        public e() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z8 invoke() {
            return new z8(r0.this.f());
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f1098a = new f();

        public f() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return ew3.H0(Looper.getMainLooper());
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends ji1 implements v31 {
        public g() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t9 invoke() {
            return new t9(r0.this.d());
        }
    }

    public r0(Context context) {
        this.f1091a = context;
    }

    @Override // com.chartboost.sdk.impl.q0
    public h1 a() {
        return (h1) this.f.getValue();
    }

    @Override // com.chartboost.sdk.impl.q0
    public s9 b() {
        return (s9) this.e.getValue();
    }

    @Override // com.chartboost.sdk.impl.q0
    public z8 c() {
        return (z8) this.h.getValue();
    }

    @Override // com.chartboost.sdk.impl.q0
    public Handler d() {
        return (Handler) this.d.getValue();
    }

    @Override // com.chartboost.sdk.impl.q0
    public p0 e() {
        return (p0) this.c.getValue();
    }

    @Override // com.chartboost.sdk.impl.q0
    public SharedPreferences f() {
        return (SharedPreferences) this.f1092b.getValue();
    }

    @Override // com.chartboost.sdk.impl.q0
    public k8 g() {
        return (k8) this.g.getValue();
    }

    @Override // com.chartboost.sdk.impl.q0
    public Context getContext() {
        return this.f1091a;
    }
}
