package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.impl.p2;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.ch3;
import defpackage.e91;
import defpackage.he0;
import defpackage.ji1;
import defpackage.jt;
import defpackage.l41;
import defpackage.m20;
import defpackage.mt;
import defpackage.ng0;
import defpackage.o41;
import defpackage.oh0;
import defpackage.om0;
import defpackage.p41;
import defpackage.pt;
import defpackage.qm0;
import defpackage.v31;
import defpackage.x31;
import defpackage.y41;

/* loaded from: classes.dex */
public final class d4 {

    /* renamed from: a, reason: collision with root package name */
    public final ca f751a;

    /* renamed from: b, reason: collision with root package name */
    public final x31 f752b;
    public final o41 c;
    public final l41 d;
    public final oh0 e;
    public final p41 f;
    public final x31 g;
    public final v31 h;
    public final x31 i;

    /* loaded from: classes.dex */
    public static final class a extends ji1 implements x31 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f753a = new a();

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
    public static final class b extends ji1 implements o41 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f754a = new b();

        public b() {
            super(4);
        }

        @Override // defpackage.o41
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final jt invoke(i4 i4Var, ca caVar, he0 he0Var, p2.b bVar) {
            return n3.a(i4Var, he0Var, caVar, bVar, (pt) null, 16, (Object) null);
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class c extends y41 implements l41 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f755a = new c();

        public c() {
            super(2, n3.class, "cacheDataSourceFactory", "cacheDataSourceFactory(Lcom/google/android/exoplayer2/upstream/cache/Cache;Lcom/google/android/exoplayer2/upstream/HttpDataSource$Factory;)Lcom/google/android/exoplayer2/upstream/cache/CacheDataSource$Factory;", 1);
        }

        @Override // defpackage.l41
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final mt invoke(jt jtVar, e91 e91Var) {
            return n3.a(jtVar, e91Var);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends ji1 implements p41 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f756a = new d();

        public d() {
            super(5);
        }

        @Override // defpackage.p41
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final qm0 invoke(Context context, he0 he0Var, jt jtVar, e91 e91Var, om0 om0Var) {
            qm0 a2;
            a2 = n3.a(context, he0Var, jtVar, e91Var, om0Var, (r14 & 32) != 0 ? 2 : 0, (r14 & 64) != 0 ? 1 : 0);
            return a2;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class e extends y41 implements x31 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f757a = new e();

        public e() {
            super(1, n3.class, "databaseProvider", "databaseProvider(Landroid/content/Context;)Lcom/google/android/exoplayer2/database/DatabaseProvider;", 1);
        }

        @Override // defpackage.x31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final he0 invoke(Context context) {
            return n3.a(context);
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class f extends y41 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f758a = new f();

        public f() {
            super(0, n3.class, "setCookieHandler", "setCookieHandler()V", 1);
        }

        public final void a() {
            n3.a();
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends ji1 implements x31 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f759a = new g();

        public g() {
            super(1);
        }

        @Override // defpackage.x31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q4 invoke(i4 i4Var) {
            return new q4(i4Var);
        }
    }

    public d4() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public final l41 a() {
        return this.d;
    }

    public final o41 b() {
        return this.c;
    }

    public final x31 c() {
        return this.g;
    }

    public final p41 d() {
        return this.f;
    }

    public final x31 e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4)) {
            return false;
        }
        d4 d4Var = (d4) obj;
        return m20.L(this.f751a, d4Var.f751a) && m20.L(this.f752b, d4Var.f752b) && m20.L(this.c, d4Var.c) && m20.L(this.d, d4Var.d) && m20.L(this.e, d4Var.e) && m20.L(this.f, d4Var.f) && m20.L(this.g, d4Var.g) && m20.L(this.h, d4Var.h) && m20.L(this.i, d4Var.i);
    }

    public final x31 f() {
        return this.f752b;
    }

    public final oh0 g() {
        return this.e;
    }

    public final v31 h() {
        return this.h;
    }

    public int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.f752b.hashCode() + (this.f751a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final ca i() {
        return this.f751a;
    }

    public String toString() {
        return "ExoPlayerDownloadManagerDependencies(videoCachePolicy=" + this.f751a + ", fileCachingFactory=" + this.f752b + ", cacheFactory=" + this.c + ", cacheDataSourceFactoryFactory=" + this.d + ", httpDataSourceFactory=" + this.e + ", downloadManagerFactory=" + this.f + ", databaseProviderFactory=" + this.g + ", setCookieHandler=" + this.h + ", fakePrecacheFilesManagerFactory=" + this.i + ')';
    }

    public d4(ca caVar, x31 x31Var, o41 o41Var, l41 l41Var, oh0 oh0Var, p41 p41Var, x31 x31Var2, v31 v31Var, x31 x31Var3) {
        this.f751a = caVar;
        this.f752b = x31Var;
        this.c = o41Var;
        this.d = l41Var;
        this.e = oh0Var;
        this.f = p41Var;
        this.g = x31Var2;
        this.h = v31Var;
        this.i = x31Var3;
    }

    public /* synthetic */ d4(ca caVar, x31 x31Var, o41 o41Var, l41 l41Var, oh0 oh0Var, p41 p41Var, x31 x31Var2, v31 v31Var, x31 x31Var3, int i, ng0 ng0Var) {
        this((i & 1) != 0 ? s2.f1122b.d().l() : caVar, (i & 2) != 0 ? a.f753a : x31Var, (i & 4) != 0 ? b.f754a : o41Var, (i & 8) != 0 ? c.f755a : l41Var, (i & 16) != 0 ? new oh0() : oh0Var, (i & 32) != 0 ? d.f756a : p41Var, (i & 64) != 0 ? e.f757a : x31Var2, (i & 128) != 0 ? f.f758a : v31Var, (i & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? g.f759a : x31Var3);
    }
}
