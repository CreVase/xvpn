package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.SurfaceView;
import com.chartboost.sdk.impl.aa;
import com.chartboost.sdk.impl.ea;
import com.chartboost.sdk.impl.ga;
import defpackage.j11;
import defpackage.ji1;
import defpackage.k43;
import defpackage.n41;
import defpackage.ng0;
import defpackage.o41;
import defpackage.p41;
import defpackage.ui1;
import defpackage.v31;
import defpackage.v90;
import defpackage.x31;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class v0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final ui1 f1188a;

    /* renamed from: b, reason: collision with root package name */
    public final ui1 f1189b;
    public final ui1 c;
    public final ui1 d;
    public final ui1 e;
    public final ui1 f;
    public final ui1 g;
    public final ui1 h;
    public final ui1 i;
    public final ui1 j;
    public final ui1 k;
    public final ui1 l;
    public final ui1 m;
    public final ui1 n;
    public final ui1 o;
    public final ui1 p;
    public final ui1 q;
    public final ui1 r;
    public final ui1 s;
    public final ui1 t;
    public final ui1 u;
    public final ui1 v;
    public final ui1 w;
    public final ui1 x;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1190a;

        static {
            int[] iArr = new int[ea.b.values().length];
            try {
                iArr[ea.b.MEDIA_PLAYER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ea.b.EXO_PLAYER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f1190a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ji1 implements v31 {

        /* loaded from: classes.dex */
        public static final class a extends ji1 implements p41 {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ v0 f1192a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v0 v0Var) {
                super(5);
                this.f1192a = v0Var;
            }

            @Override // defpackage.p41
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g0 invoke(Context context, SurfaceView surfaceView, l0 l0Var, s9 s9Var, r4 r4Var) {
                return new g0(context, null, this.f1192a.t(), surfaceView, l0Var, s9Var, this.f1192a.z(), 2, null);
            }
        }

        public b() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p41 invoke() {
            return new a(v0.this);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends ji1 implements v31 {

        /* loaded from: classes.dex */
        public static final class a extends ji1 implements p41 {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ v0 f1194a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v0 v0Var) {
                super(5);
                this.f1194a = v0Var;
            }

            @Override // defpackage.p41
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i0 invoke(Context context, SurfaceView surfaceView, l0 l0Var, s9 s9Var, r4 r4Var) {
                return new i0(null, surfaceView, l0Var, s9Var, this.f1194a.z(), this.f1194a.x(), null, r4Var, 65, null);
            }
        }

        public c() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p41 invoke() {
            return new a(v0.this);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0 f1195a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(q0 q0Var) {
            super(0);
            this.f1195a = q0Var;
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n0 invoke() {
            return new n0(this.f1195a.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f1196a = new e();

        public e() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m2 invoke() {
            return new m2();
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a4 f1197a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v0 f1198b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(a4 a4Var, v0 v0Var) {
            super(0);
            this.f1197a = a4Var;
            this.f1198b = v0Var;
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u3 invoke() {
            return new u3(this.f1197a.b(), this.f1198b.f(), this.f1198b.e(), this.f1198b.g(), this.f1198b.b(), this.f1198b.m());
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f1199a = new g();

        public g() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g4 invoke() {
            return g4.f840b;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends ji1 implements v31 {
        public h() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k4 invoke() {
            return new k4(v0.this.c());
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0 f1201a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v0 f1202b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(q0 q0Var, v0 v0Var) {
            super(0);
            this.f1201a = q0Var;
            this.f1202b = v0Var;
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r4 invoke() {
            return new r4(this.f1201a.getContext(), this.f1202b.b());
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0 f1203a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v0 f1204b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(q0 q0Var, v0 v0Var) {
            super(0);
            this.f1203a = q0Var;
            this.f1204b = v0Var;
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o1 invoke() {
            return new o1(this.f1203a.getContext(), this.f1203a.e(), this.f1204b.s(), this.f1203a.a(), null, null, 48, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final k f1205a = new k();

        public k() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m6 invoke() {
            return new m6();
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a4 f1206a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v0 f1207b;
        public final /* synthetic */ q0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(a4 a4Var, v0 v0Var, q0 q0Var) {
            super(0);
            this.f1206a = a4Var;
            this.f1207b = v0Var;
            this.c = q0Var;
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z1 invoke() {
            return new z1(this.f1206a.b(), this.f1207b.u(), this.f1207b.g(), this.f1207b.m(), this.c.d(), this.f1206a.a());
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends ji1 implements v31 {
        public m() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n7 invoke() {
            return new n7(v0.this.d(), v0.this.f(), v0.this.e(), v0.this.o(), v0.this.b());
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r7 f1209a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(r7 r7Var) {
            super(0);
            this.f1209a = r7Var;
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p7 invoke() {
            return this.f1209a.a();
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0 f1210a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(q0 q0Var) {
            super(0);
            this.f1210a = q0Var;
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a2 invoke() {
            return new a2(this.f1210a.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0 f1211a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v0 f1212b;
        public final /* synthetic */ r7 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(q0 q0Var, v0 v0Var, r7 r7Var) {
            super(0);
            this.f1211a = q0Var;
            this.f1212b = v0Var;
            this.c = r7Var;
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i8 invoke() {
            return new i8(this.f1211a.getContext(), this.f1212b.k(), this.f1212b.g(), this.f1212b.b(), this.f1211a.f(), this.f1212b.m(), this.f1212b.n(), this.f1212b.h(), this.c.a(), null);
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x31 f1213a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q0 f1214b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(x31 x31Var, q0 q0Var) {
            super(0);
            this.f1213a = x31Var;
            this.f1214b = q0Var;
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AtomicReference<t8> invoke() {
            return new AtomicReference<>(this.f1213a.invoke(this.f1214b));
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0 f1215a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(q0 q0Var) {
            super(0);
            this.f1215a = q0Var;
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8 invoke() {
            return new x8(this.f1215a.f());
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final s f1216a = new s();

        public s() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d9 invoke() {
            return new d9();
        }
    }

    /* loaded from: classes.dex */
    public static final class t extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final t f1217a = new t();

        public t() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h9 invoke() {
            return new h9();
        }
    }

    /* loaded from: classes.dex */
    public static final class u extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final u f1218a = new u();

        /* loaded from: classes.dex */
        public static final class a extends ji1 implements o41 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f1219a = new a();

            public a() {
                super(4);
            }

            @Override // defpackage.o41
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final aa invoke(y9 y9Var, aa.b bVar, v90 v90Var, r4 r4Var) {
                return new aa(y9Var, bVar, 0.0f, null, r4Var, v90Var, null, 76, null);
            }
        }

        public u() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o41 invoke() {
            return a.f1219a;
        }
    }

    /* loaded from: classes.dex */
    public static final class v extends ji1 implements v31 {
        public v() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ca invoke() {
            ea eaVar = new ea(0L, 0, 0, 0L, 0L, 0L, 0, null, 255, null);
            return new ca(eaVar.b(), eaVar.c(), eaVar.d(), eaVar.e(), eaVar.f(), eaVar.g(), eaVar.a(), v0.this.g());
        }
    }

    /* loaded from: classes.dex */
    public static final class w extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final w f1221a = new w();

        /* loaded from: classes.dex */
        public static final class a extends ji1 implements n41 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f1222a = new a();

            public a() {
                super(3);
            }

            @Override // defpackage.n41
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ha invoke(l0 l0Var, ga.b bVar, s9 s9Var) {
                return new ha(l0Var, bVar, null, 4, null);
            }
        }

        public w() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n41 invoke() {
            return a.f1222a;
        }
    }

    /* loaded from: classes.dex */
    public static final class x extends ji1 implements v31 {
        public x() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final la invoke() {
            return new la(v0.this.l(), v0.this.c(), null, null, 12, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class y extends ji1 implements v31 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a4 f1225b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(a4 a4Var) {
            super(0);
            this.f1225b = a4Var;
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final na invoke() {
            return new na(v0.this.e(), v0.this.l(), v0.this.g(), v0.this.f(), v0.this.w(), this.f1225b.b());
        }
    }

    public v0(q0 q0Var, a4 a4Var, r7 r7Var, x31 x31Var) {
        this.f1188a = new k43(new m());
        this.f1189b = new k43(new n(r7Var));
        this.c = new k43(new p(q0Var, this, r7Var));
        this.d = new k43(new l(a4Var, this, q0Var));
        this.e = new k43(t.f1217a);
        this.f = new k43(new r(q0Var));
        this.g = new k43(new o(q0Var));
        this.h = new k43(new j(q0Var, this));
        this.i = new k43(new i(q0Var, this));
        this.j = new k43(new q(x31Var, q0Var));
        this.k = new k43(k.f1205a);
        this.l = new k43(new f(a4Var, this));
        this.m = new k43(e.f1196a);
        this.n = new k43(s.f1216a);
        this.o = new k43(g.f1199a);
        this.p = new k43(new h());
        this.q = new k43(new y(a4Var));
        this.r = new k43(new x());
        this.s = new k43(new v());
        this.t = new k43(new c());
        this.u = new k43(new b());
        this.v = new k43(w.f1221a);
        this.w = new k43(u.f1218a);
        this.x = new k43(new d(q0Var));
    }

    public final ka A() {
        return (ka) this.r.getValue();
    }

    public final ka B() {
        return (ka) this.q.getValue();
    }

    @Override // com.chartboost.sdk.impl.t0
    public z1 e() {
        return (z1) this.d.getValue();
    }

    @Override // com.chartboost.sdk.impl.t0
    public r4 f() {
        return (r4) this.i.getValue();
    }

    @Override // com.chartboost.sdk.impl.t0
    public a2 g() {
        return (a2) this.g.getValue();
    }

    @Override // com.chartboost.sdk.impl.t0
    public x8 h() {
        return (x8) this.f.getValue();
    }

    @Override // com.chartboost.sdk.impl.t0
    public p41 i() {
        int i2 = a.f1190a[y().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return q();
            }
            throw new j11(null);
        }
        return r();
    }

    @Override // com.chartboost.sdk.impl.t0
    public n7 j() {
        return (n7) this.f1188a.getValue();
    }

    @Override // com.chartboost.sdk.impl.t0
    public o1 k() {
        return (o1) this.h.getValue();
    }

    @Override // com.chartboost.sdk.impl.t0
    public ca l() {
        return (ca) this.s.getValue();
    }

    @Override // com.chartboost.sdk.impl.t0
    public h9 m() {
        return (h9) this.e.getValue();
    }

    @Override // com.chartboost.sdk.impl.t0
    public m2 n() {
        return (m2) this.m.getValue();
    }

    @Override // com.chartboost.sdk.impl.t0
    public ka p() {
        ka B;
        int i2 = a.f1190a[y().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                B = A();
            } else {
                throw new j11(null);
            }
        } else {
            B = B();
        }
        f6.a(u0.f1167a, "Video repository: " + B);
        return B;
    }

    public final p41 q() {
        return (p41) this.u.getValue();
    }

    public final p41 r() {
        return (p41) this.t.getValue();
    }

    public final n0 s() {
        return (n0) this.x.getValue();
    }

    public k4 t() {
        return (k4) this.p.getValue();
    }

    public final m6 u() {
        return (m6) this.k.getValue();
    }

    @Override // com.chartboost.sdk.impl.t0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public i8 o() {
        return (i8) this.c.getValue();
    }

    public d9 w() {
        return (d9) this.n.getValue();
    }

    public final o41 x() {
        return (o41) this.w.getValue();
    }

    public final ea.b y() {
        ea.b bVar;
        ea c2;
        t8 t8Var = b().get();
        if (t8Var == null || (c2 = t8Var.c()) == null || (bVar = c2.h()) == null) {
            bVar = ea.b.EXO_PLAYER;
        }
        String unused = u0.f1167a;
        Objects.toString(bVar);
        return bVar;
    }

    public final n41 z() {
        return (n41) this.v.getValue();
    }

    @Override // com.chartboost.sdk.impl.t0
    public p7 a() {
        return (p7) this.f1189b.getValue();
    }

    @Override // com.chartboost.sdk.impl.t0
    public AtomicReference<t8> b() {
        return (AtomicReference) this.j.getValue();
    }

    @Override // com.chartboost.sdk.impl.t0
    public c4 c() {
        return (c4) this.o.getValue();
    }

    @Override // com.chartboost.sdk.impl.t0
    public u3 d() {
        return (u3) this.l.getValue();
    }

    public /* synthetic */ v0(q0 q0Var, a4 a4Var, r7 r7Var, x31 x31Var, int i2, ng0 ng0Var) {
        this(q0Var, a4Var, r7Var, (i2 & 8) != 0 ? u0.f1168b : x31Var);
    }
}
