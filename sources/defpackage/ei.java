package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final /* synthetic */ class ei implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1935b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ei(Object obj, int i, long j, long j2, int i2) {
        this.f1934a = i2;
        this.e = obj;
        this.f1935b = i;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object next;
        Object obj;
        rt1 rt1Var;
        int i = this.f1934a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                final int i2 = this.f1935b;
                final long j = this.c;
                final long j2 = this.d;
                yt0 yt0Var = (yt0) ((x50) obj2).c;
                int i3 = wi3.f5017a;
                uf0 uf0Var = (uf0) yt0Var.f5387a.q;
                final wa n = uf0Var.n();
                final int i4 = 0;
                uf0Var.o(n, 1011, new rl1(n, i2, j, j2, i4) { // from class: jf0

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f2756a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ wa f2757b;
                    public final /* synthetic */ int c;
                    public final /* synthetic */ long d;

                    {
                        this.f2756a = i4;
                    }

                    @Override // defpackage.rl1
                    public final void invoke(Object obj3) {
                        String str;
                        long longValue;
                        switch (this.f2756a) {
                            case 0:
                                ((xa) obj3).getClass();
                                return;
                            default:
                                jt1 jt1Var = (jt1) ((xa) obj3);
                                jt1Var.getClass();
                                wa waVar = this.f2757b;
                                rt1 rt1Var2 = waVar.d;
                                if (rt1Var2 != null) {
                                    mi0 mi0Var = jt1Var.f2825b;
                                    a93 a93Var = waVar.f4969b;
                                    synchronized (mi0Var) {
                                        str = mi0Var.b(a93Var.h(rt1Var2.f3536a, mi0Var.f3302b).c, rt1Var2).f3131a;
                                    }
                                    HashMap hashMap = jt1Var.h;
                                    Long l = (Long) hashMap.get(str);
                                    HashMap hashMap2 = jt1Var.g;
                                    Long l2 = (Long) hashMap2.get(str);
                                    long j3 = 0;
                                    if (l == null) {
                                        longValue = 0;
                                    } else {
                                        longValue = l.longValue();
                                    }
                                    hashMap.put(str, Long.valueOf(longValue + this.d));
                                    if (l2 != null) {
                                        j3 = l2.longValue();
                                    }
                                    hashMap2.put(str, Long.valueOf(j3 + this.c));
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final int i5 = this.f1935b;
                final long j3 = this.c;
                final long j4 = this.d;
                uf0 uf0Var2 = (uf0) ((wm) obj2).f5036b;
                tf0 tf0Var = uf0Var2.d;
                if (tf0Var.f4492b.isEmpty()) {
                    rt1Var = null;
                } else {
                    hb1 hb1Var = tf0Var.f4492b;
                    if (hb1Var instanceof List) {
                        if (!hb1Var.isEmpty()) {
                            obj = hb1Var.get(hb1Var.size() - 1);
                        } else {
                            throw new NoSuchElementException();
                        }
                    } else {
                        Iterator<E> it = hb1Var.iterator();
                        do {
                            next = it.next();
                        } while (it.hasNext());
                        obj = next;
                    }
                    rt1Var = (rt1) obj;
                }
                final wa g = uf0Var2.g(rt1Var);
                final int i6 = 1;
                uf0Var2.o(g, 1006, new rl1(g, i5, j3, j4, i6) { // from class: jf0

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f2756a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ wa f2757b;
                    public final /* synthetic */ int c;
                    public final /* synthetic */ long d;

                    {
                        this.f2756a = i6;
                    }

                    @Override // defpackage.rl1
                    public final void invoke(Object obj3) {
                        String str;
                        long longValue;
                        switch (this.f2756a) {
                            case 0:
                                ((xa) obj3).getClass();
                                return;
                            default:
                                jt1 jt1Var = (jt1) ((xa) obj3);
                                jt1Var.getClass();
                                wa waVar = this.f2757b;
                                rt1 rt1Var2 = waVar.d;
                                if (rt1Var2 != null) {
                                    mi0 mi0Var = jt1Var.f2825b;
                                    a93 a93Var = waVar.f4969b;
                                    synchronized (mi0Var) {
                                        str = mi0Var.b(a93Var.h(rt1Var2.f3536a, mi0Var.f3302b).c, rt1Var2).f3131a;
                                    }
                                    HashMap hashMap = jt1Var.h;
                                    Long l = (Long) hashMap.get(str);
                                    HashMap hashMap2 = jt1Var.g;
                                    Long l2 = (Long) hashMap2.get(str);
                                    long j32 = 0;
                                    if (l == null) {
                                        longValue = 0;
                                    } else {
                                        longValue = l.longValue();
                                    }
                                    hashMap.put(str, Long.valueOf(longValue + this.d));
                                    if (l2 != null) {
                                        j32 = l2.longValue();
                                    }
                                    hashMap2.put(str, Long.valueOf(j32 + this.c));
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
