package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import defpackage.ji1;
import defpackage.k43;
import defpackage.ui1;
import defpackage.v31;

/* loaded from: classes.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    public String f984a;

    /* renamed from: b, reason: collision with root package name */
    public String f985b;
    public Application c;
    public final ui1 d = new k43(new a());
    public final ui1 e = new k43(new b());
    public final ui1 f = new k43(new e());
    public final ui1 g = new k43(c.f988a);
    public final ui1 h = new k43(new d());
    public final ui1 i = new k43(new h());
    public final ui1 j = new k43(new g());
    public final ui1 k = new k43(new f());

    /* loaded from: classes.dex */
    public static final class a extends ji1 implements v31 {
        public a() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r0 invoke() {
            return new r0(m3.this.d());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ji1 implements v31 {
        public b() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v0 invoke() {
            return new v0(m3.this.a(), m3.this.f(), m3.this.i(), null, 8, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f988a = new c();

        public c() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b4 invoke() {
            return new b4();
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends ji1 implements v31 {
        public d() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y6 invoke() {
            return new y6(m3.this.a(), m3.this.e());
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends ji1 implements v31 {
        public e() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s7 invoke() {
            return new s7(m3.this.a());
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends ji1 implements v31 {
        public f() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c8 invoke() {
            return new c8(m3.this.a(), m3.this.e());
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends ji1 implements v31 {
        public g() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w8 invoke() {
            return new w8(m3.this.a(), m3.this.f(), m3.this.e(), m3.this.h());
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends ji1 implements v31 {
        public h() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l9 invoke() {
            return new l9(m3.this.a(), m3.this.e(), m3.this.f(), m3.this.i().a());
        }
    }

    public String b() {
        String str = this.f984a;
        if (str == null) {
            return null;
        }
        return str;
    }

    public String c() {
        String str = this.f985b;
        if (str == null) {
            return null;
        }
        return str;
    }

    public final Application d() {
        if (this.c == null) {
            try {
                throw new t2();
            } catch (Exception e2) {
                Log.e("Chartboost", "Missing application. Cannot start Chartboost SDK: " + e2);
            }
        }
        Application application = this.c;
        if (application == null) {
            return null;
        }
        return application;
    }

    public t0 e() {
        return (t0) this.e.getValue();
    }

    public a4 f() {
        return (a4) this.g.getValue();
    }

    public boolean g() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public s6 h() {
        return (s6) this.h.getValue();
    }

    public r7 i() {
        return (r7) this.f.getValue();
    }

    public b8 j() {
        return (b8) this.k.getValue();
    }

    public s8 k() {
        return (s8) this.j.getValue();
    }

    public boolean l() {
        if (this.f984a != null && this.f985b != null) {
            return true;
        }
        return false;
    }

    public k9 m() {
        return (k9) this.i.getValue();
    }

    public q0 a() {
        return (q0) this.d.getValue();
    }

    public void a(Context context) {
        this.c = (Application) context.getApplicationContext();
    }

    public void a(String str, String str2) {
        this.f984a = str;
        this.f985b = str2;
    }
}
