package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.Log;
import com.chartboost.sdk.impl.ka;
import com.chartboost.sdk.impl.pa;
import com.chartboost.sdk.internal.Model.CBError;
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
import defpackage.ng0;
import defpackage.pd0;
import defpackage.ui1;
import defpackage.v31;
import defpackage.v90;
import defpackage.vl0;
import defpackage.x31;
import defpackage.z33;
import defpackage.zf3;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class la implements ka, pa.a {

    /* renamed from: a, reason: collision with root package name */
    public final ca f971a;

    /* renamed from: b, reason: collision with root package name */
    public final c4 f972b;
    public final x31 c;
    public final v90 d;
    public final ui1 e;
    public final ui1 f;
    public i4 g;
    public df1 h;

    /* loaded from: classes.dex */
    public static final class a extends ji1 implements x31 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f973a = new a();

        public a() {
            super(1);
        }

        @Override // defpackage.x31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j4 invoke(Context context) {
            return new j4(context, null, null, null, 14, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f974a = new b();

        public b() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap<String, y9> invoke() {
            return new ConcurrentHashMap<>();
        }
    }

    @ke0(c = "com.chartboost.sdk.internal.video.repository.exoplayer.VideoRepositoryExoplayer$retryNonForcedDownloadAfterTimeWindowEnds$1", f = "VideoRepositoryExoplayer.kt", l = {161}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends z33 implements l41 {

        /* renamed from: a, reason: collision with root package name */
        public int f975a;

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
            String str;
            ba0 ba0Var = ba0.f430a;
            int i = this.f975a;
            if (i != 0) {
                if (i == 1) {
                    fl.a0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                fl.a0(obj);
                long i2 = la.this.f971a.i();
                this.f975a = 1;
                if (defpackage.t9.C(i2, this) == ba0Var) {
                    return ba0Var;
                }
            }
            la.this.h = null;
            try {
                ka.a.a(la.this, null, 0, false, 7, null);
            } catch (IllegalStateException e) {
                str = ma.f999a;
                Log.e(str, "Cannot start download", e);
            }
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f977a = new d();

        public d() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap<String, f0> invoke() {
            return new ConcurrentHashMap<>();
        }
    }

    public la(ca caVar, c4 c4Var, x31 x31Var, v90 v90Var) {
        this.f971a = caVar;
        this.f972b = c4Var;
        this.c = x31Var;
        this.d = v90Var;
        this.e = new k43(b.f974a);
        this.f = new k43(d.f977a);
    }

    public final ConcurrentHashMap<String, f0> b() {
        return (ConcurrentHashMap) this.f.getValue();
    }

    public final File c(String str) {
        i4 i4Var = this.g;
        if (i4Var != null) {
            return i4Var.a(str);
        }
        return null;
    }

    public final void d(y9 y9Var) {
        String unused;
        unused = ma.f999a;
        Objects.toString(y9Var);
        this.f971a.a();
        this.f972b.a(y9Var);
    }

    public final void e(y9 y9Var) {
        r3 r3Var;
        if (this.f971a.g()) {
            d();
            r3Var = r3.MAX_COUNT_TIME_WINDOW;
        } else {
            r3Var = r3.NONE;
        }
        a(y9Var, r3Var);
    }

    public final y9 b(y9 y9Var) {
        a().put(y9Var.d(), y9Var);
        return y9Var;
    }

    public final y9 c(y9 y9Var) {
        String unused;
        unused = ma.f999a;
        Objects.toString(y9Var);
        a(y9Var, r3.STOPPED_QUEUE);
        return y9Var;
    }

    public final ConcurrentHashMap<String, y9> a() {
        return (ConcurrentHashMap) this.e.getValue();
    }

    @Override // com.chartboost.sdk.impl.ka
    public y9 b(String str) {
        return a().get(str);
    }

    @Override // com.chartboost.sdk.impl.ka
    public void a(Context context) {
        String unused;
        unused = ma.f999a;
        this.g = (i4) this.c.invoke(context);
        c4 c4Var = this.f972b;
        c4Var.a(context);
        c4Var.a(this);
        c4Var.a();
    }

    public final void c() {
        r3 r3Var;
        if (this.f971a.g()) {
            d();
            r3Var = r3.MAX_COUNT_TIME_WINDOW;
        } else {
            r3Var = r3.NONE;
        }
        if (r3Var == r3.NONE) {
            this.f971a.a();
        }
        this.f972b.a(r3Var);
    }

    public final void d() {
        if (this.h == null) {
            this.h = zf3.T(pd0.d(this.d), null, new c(null), 3);
        }
    }

    @Override // com.chartboost.sdk.impl.ka
    public void a(String str, String str2, boolean z, f0 f0Var) {
        y9 a2;
        y9 b2;
        String unused;
        String unused2;
        unused = ma.f999a;
        Objects.toString(f0Var);
        if (f0Var != null) {
            b().put(str, f0Var);
        }
        File c2 = c(str2);
        if (c2 == null || (a2 = a(c2, str)) == null || (b2 = b(a2)) == null || c(b2) == null) {
            unused2 = ma.f999a;
        }
        ka.a.a(this, str2, 0, z, 2, null);
    }

    public la(ca caVar, c4 c4Var, x31 x31Var, v90 v90Var, int i, ng0 ng0Var) {
        this(caVar, c4Var, (i & 4) != 0 ? a.f973a : x31Var, (i & 8) != 0 ? vl0.c : v90Var);
    }

    public final y9 a(File file, String str) {
        y9 y9Var = new y9(str, file.getName(), file, file.getParentFile(), 0L, null, 0L, 112, null);
        file.setLastModified(y9Var.a());
        return y9Var;
    }

    @Override // com.chartboost.sdk.impl.ka
    public void a(String str, int i, boolean z) {
        ch3 ch3Var;
        y9 y9Var;
        String unused;
        String unused2;
        String unused3;
        unused = ma.f999a;
        if (str == null || (y9Var = a().get(str)) == null) {
            ch3Var = null;
        } else {
            unused2 = ma.f999a;
            y9Var.toString();
            if (z) {
                d(y9Var);
            } else {
                e(y9Var);
            }
            ch3Var = ch3.f636a;
        }
        if (ch3Var == null) {
            unused3 = ma.f999a;
            c();
        }
    }

    public final void a(y9 y9Var, r3 r3Var) {
        String unused;
        unused = ma.f999a;
        Objects.toString(y9Var);
        if (r3Var == r3.NONE) {
            this.f971a.a();
        }
        this.f972b.a(y9Var, r3Var);
    }

    @Override // com.chartboost.sdk.impl.ka
    public boolean a(String str) {
        return this.f972b.a(str);
    }

    @Override // com.chartboost.sdk.impl.ka
    public int a(y9 y9Var) {
        if (y9Var != null) {
            return g8.a(this.f972b.d(y9Var.d()));
        }
        return 0;
    }

    @Override // com.chartboost.sdk.impl.pa.a
    public void a(String str, String str2, long j, f0 f0Var) {
        String unused;
        unused = ma.f999a;
        if (f0Var == null) {
            f0Var = b().get(str);
        }
        if (f0Var != null) {
            f0Var.a(str);
        }
    }

    @Override // com.chartboost.sdk.impl.pa.a
    public void a(String str, String str2) {
        String unused;
        unused = ma.f999a;
        b().remove(str);
        ka.a.a(this, null, 0, false, 7, null);
    }

    @Override // com.chartboost.sdk.impl.pa.a
    public void a(String str, String str2, CBError cBError) {
        String unused;
        unused = ma.f999a;
        Objects.toString(cBError);
        b().remove(str);
    }
}
