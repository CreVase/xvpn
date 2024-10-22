package com.chartboost.sdk.impl;

import defpackage.ji1;
import defpackage.jt;
import defpackage.jw3;
import defpackage.k43;
import defpackage.l41;
import defpackage.ng0;
import defpackage.pt;
import defpackage.tt;
import defpackage.ui1;
import defpackage.v31;
import defpackage.vu2;
import defpackage.y41;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class p2 implements pt {

    /* renamed from: a, reason: collision with root package name */
    public final long f1060a;

    /* renamed from: b, reason: collision with root package name */
    public final b f1061b;
    public final v31 c;
    public final ui1 d;
    public long e;

    /* loaded from: classes.dex */
    public static final class a extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1062a = new a();

        /* renamed from: com.chartboost.sdk.impl.p2$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0001a extends y41 implements l41 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0001a f1063a = new C0001a();

            public C0001a() {
                super(2, q2.class, "compare", "compare(Lcom/google/android/exoplayer2/upstream/cache/CacheSpan;Lcom/google/android/exoplayer2/upstream/cache/CacheSpan;)I", 1);
            }

            @Override // defpackage.l41
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(tt ttVar, tt ttVar2) {
                int b2;
                b2 = q2.b(ttVar, ttVar2);
                return Integer.valueOf(b2);
            }
        }

        public a() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TreeSet<tt> invoke() {
            return new TreeSet<>(new jw3(C0001a.f1063a, 0));
        }

        public static final int a(l41 l41Var, Object obj, Object obj2) {
            return ((Number) l41Var.invoke(obj, obj2)).intValue();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void c(String str);
    }

    /* loaded from: classes.dex */
    public static final class c extends ji1 implements v31 {
        public c() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TreeSet<tt> invoke() {
            return (TreeSet) p2.this.c.invoke();
        }
    }

    public p2(long j, b bVar, v31 v31Var) {
        this.f1060a = j;
        this.f1061b = bVar;
        this.c = v31Var;
        this.d = new k43(new c());
    }

    @Override // defpackage.pt
    public void onCacheInitialized() {
    }

    @Override // defpackage.pt
    public void onSpanAdded(jt jtVar, tt ttVar) {
        a().add(ttVar);
        this.e += ttVar.c;
        a(jtVar, 0L);
    }

    @Override // defpackage.pt
    public void onSpanRemoved(jt jtVar, tt ttVar) {
        a().remove(ttVar);
        this.e -= ttVar.c;
    }

    @Override // defpackage.pt
    public void onSpanTouched(jt jtVar, tt ttVar, tt ttVar2) {
        onSpanRemoved(jtVar, ttVar);
        onSpanAdded(jtVar, ttVar2);
    }

    @Override // defpackage.pt
    public void onStartFile(jt jtVar, String str, long j, long j2) {
        if (j2 != -1) {
            a(jtVar, j2);
        }
    }

    @Override // defpackage.pt
    public boolean requiresCacheSpanTouches() {
        return true;
    }

    public final TreeSet<tt> a() {
        return (TreeSet) this.d.getValue();
    }

    public final void a(jt jtVar, long j) {
        String unused;
        while (this.e + j > this.f1060a && !a().isEmpty()) {
            tt first = a().first();
            unused = q2.f1081a;
            String str = first.f4569a;
            vu2 vu2Var = (vu2) jtVar;
            synchronized (vu2Var) {
                vu2Var.l(first);
            }
            this.f1061b.c(first.f4569a);
        }
    }

    public /* synthetic */ p2(long j, b bVar, v31 v31Var, int i, ng0 ng0Var) {
        this(j, bVar, (i & 4) != 0 ? a.f1062a : v31Var);
    }
}
