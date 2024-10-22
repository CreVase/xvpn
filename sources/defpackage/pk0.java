package defpackage;

import android.os.Looper;
import android.os.Message;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class pk0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3859a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3860b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final AbstractCollection f;
    public final AbstractCollection g;
    public Object h;
    public final Object i;

    public pk0(s70 s70Var) {
        this.f3859a = true;
        this.f3860b = true;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = null;
        this.i = new fp();
        this.g = new ArrayList();
        this.c = s70Var;
        this.d = s70Var;
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.i) {
            if (this.f3859a) {
                return;
            }
            ((CopyOnWriteArraySet) this.f).add(new tl1(obj));
        }
    }

    public final void b(qk0 qk0Var, int i, int i2, ArrayList arrayList, sl2 sl2Var) {
        pp3 pp3Var = qk0Var.d;
        if (pp3Var.c == null) {
            s70 s70Var = (s70) this.c;
            if (pp3Var != s70Var.d && pp3Var != s70Var.e) {
                if (sl2Var == null) {
                    sl2Var = new sl2(pp3Var);
                    arrayList.add(sl2Var);
                }
                pp3Var.c = sl2Var;
                sl2Var.f4365b.add(pp3Var);
                qk0 qk0Var2 = pp3Var.h;
                Iterator it = qk0Var2.k.iterator();
                while (it.hasNext()) {
                    lk0 lk0Var = (lk0) it.next();
                    if (lk0Var instanceof qk0) {
                        b((qk0) lk0Var, i, 0, arrayList, sl2Var);
                    }
                }
                qk0 qk0Var3 = pp3Var.i;
                Iterator it2 = qk0Var3.k.iterator();
                while (it2.hasNext()) {
                    lk0 lk0Var2 = (lk0) it2.next();
                    if (lk0Var2 instanceof qk0) {
                        b((qk0) lk0Var2, i, 1, arrayList, sl2Var);
                    }
                }
                if (i == 1 && (pp3Var instanceof zj3)) {
                    Iterator it3 = ((zj3) pp3Var).k.k.iterator();
                    while (it3.hasNext()) {
                        lk0 lk0Var3 = (lk0) it3.next();
                        if (lk0Var3 instanceof qk0) {
                            b((qk0) lk0Var3, i, 2, arrayList, sl2Var);
                        }
                    }
                }
                Iterator it4 = qk0Var2.l.iterator();
                while (it4.hasNext()) {
                    b((qk0) it4.next(), i, 0, arrayList, sl2Var);
                }
                Iterator it5 = qk0Var3.l.iterator();
                while (it5.hasNext()) {
                    b((qk0) it5.next(), i, 1, arrayList, sl2Var);
                }
                if (i == 1 && (pp3Var instanceof zj3)) {
                    Iterator it6 = ((zj3) pp3Var).k.l.iterator();
                    while (it6.hasNext()) {
                        b((qk0) it6.next(), i, 2, arrayList, sl2Var);
                    }
                }
            }
        }
    }

    public final void c(s70 s70Var) {
        int i;
        int i2;
        int i3;
        int i4;
        Iterator it = s70Var.q0.iterator();
        while (it.hasNext()) {
            r70 r70Var = (r70) it.next();
            int[] iArr = r70Var.p0;
            int i5 = iArr[0];
            int i6 = iArr[1];
            if (r70Var.g0 == 8) {
                r70Var.f4112a = true;
            } else {
                float f = r70Var.w;
                if (f < 1.0f && i5 == 3) {
                    r70Var.r = 2;
                }
                float f2 = r70Var.z;
                if (f2 < 1.0f && i6 == 3) {
                    r70Var.s = 2;
                }
                if (r70Var.W > 0.0f) {
                    if (i5 == 3 && (i6 == 2 || i6 == 1)) {
                        r70Var.r = 3;
                    } else if (i6 == 3 && (i5 == 2 || i5 == 1)) {
                        r70Var.s = 3;
                    } else if (i5 == 3 && i6 == 3) {
                        if (r70Var.r == 0) {
                            r70Var.r = 3;
                        }
                        if (r70Var.s == 0) {
                            r70Var.s = 3;
                        }
                    }
                }
                z60 z60Var = r70Var.K;
                z60 z60Var2 = r70Var.I;
                if (i5 == 3 && r70Var.r == 1 && (z60Var2.f == null || z60Var.f == null)) {
                    i5 = 2;
                }
                z60 z60Var3 = r70Var.L;
                z60 z60Var4 = r70Var.J;
                if (i6 == 3 && r70Var.s == 1 && (z60Var4.f == null || z60Var3.f == null)) {
                    i = 2;
                } else {
                    i = i6;
                }
                c91 c91Var = r70Var.d;
                c91Var.d = i5;
                int i7 = r70Var.r;
                c91Var.f3894a = i7;
                zj3 zj3Var = r70Var.e;
                zj3Var.d = i;
                int i8 = r70Var.s;
                zj3Var.f3894a = i8;
                if ((i5 != 4 && i5 != 1 && i5 != 2) || (i != 4 && i != 1 && i != 2)) {
                    int[] iArr2 = s70Var.p0;
                    z60[] z60VarArr = r70Var.Q;
                    if (i5 == 3 && (i == 2 || i == 1)) {
                        if (i7 == 3) {
                            if (i == 2) {
                                h(r70Var, 2, 0, 2, 0);
                            }
                            int l = r70Var.l();
                            h(r70Var, 1, (int) ((l * r70Var.W) + 0.5f), 1, l);
                            r70Var.d.e.d(r70Var.r());
                            r70Var.e.e.d(r70Var.l());
                            r70Var.f4112a = true;
                        } else if (i7 == 1) {
                            h(r70Var, 2, 0, i, 0);
                            r70Var.d.e.m = r70Var.r();
                        } else if (i7 == 2) {
                            int i9 = iArr2[0];
                            if (i9 == 1 || i9 == 4) {
                                h(r70Var, 1, (int) ((f * s70Var.r()) + 0.5f), i, r70Var.l());
                                r70Var.d.e.d(r70Var.r());
                                r70Var.e.e.d(r70Var.l());
                                r70Var.f4112a = true;
                            }
                        } else if (z60VarArr[0].f == null || z60VarArr[1].f == null) {
                            h(r70Var, 2, 0, i, 0);
                            r70Var.d.e.d(r70Var.r());
                            r70Var.e.e.d(r70Var.l());
                            r70Var.f4112a = true;
                        }
                    }
                    if (i == 3 && (i5 == 2 || i5 == 1)) {
                        if (i8 == 3) {
                            if (i5 == 2) {
                                h(r70Var, 2, 0, 2, 0);
                            }
                            int r = r70Var.r();
                            float f3 = r70Var.W;
                            if (r70Var.X == -1) {
                                f3 = 1.0f / f3;
                            }
                            h(r70Var, 1, r, 1, (int) ((r * f3) + 0.5f));
                            r70Var.d.e.d(r70Var.r());
                            r70Var.e.e.d(r70Var.l());
                            r70Var.f4112a = true;
                        } else if (i8 == 1) {
                            h(r70Var, i5, 0, 2, 0);
                            r70Var.e.e.m = r70Var.l();
                        } else if (i8 == 2) {
                            int i10 = iArr2[1];
                            if (i10 == 1 || i10 == 4) {
                                h(r70Var, i5, r70Var.r(), 1, (int) ((f2 * s70Var.l()) + 0.5f));
                                r70Var.d.e.d(r70Var.r());
                                r70Var.e.e.d(r70Var.l());
                                r70Var.f4112a = true;
                            }
                        } else if (z60VarArr[2].f == null || z60VarArr[3].f == null) {
                            h(r70Var, 2, 0, i, 0);
                            r70Var.d.e.d(r70Var.r());
                            r70Var.e.e.d(r70Var.l());
                            r70Var.f4112a = true;
                        }
                    }
                    if (i5 == 3 && i == 3) {
                        if (i7 != 1 && i8 != 1) {
                            if (i8 == 2 && i7 == 2 && iArr2[0] == 1 && iArr2[1] == 1) {
                                h(r70Var, 1, (int) ((f * s70Var.r()) + 0.5f), 1, (int) ((f2 * s70Var.l()) + 0.5f));
                                r70Var.d.e.d(r70Var.r());
                                r70Var.e.e.d(r70Var.l());
                                r70Var.f4112a = true;
                            }
                        } else {
                            h(r70Var, 2, 0, 2, 0);
                            r70Var.d.e.m = r70Var.r();
                            r70Var.e.e.m = r70Var.l();
                        }
                    }
                } else {
                    int r2 = r70Var.r();
                    if (i5 == 4) {
                        i2 = (s70Var.r() - z60Var2.g) - z60Var.g;
                        i5 = 1;
                    } else {
                        i2 = r2;
                    }
                    int l2 = r70Var.l();
                    if (i == 4) {
                        i3 = (s70Var.l() - z60Var4.g) - z60Var3.g;
                        i4 = 1;
                    } else {
                        i3 = l2;
                        i4 = i;
                    }
                    h(r70Var, i5, i2, i4, i3);
                    r70Var.d.e.d(r70Var.r());
                    r70Var.e.e.d(r70Var.l());
                    r70Var.f4112a = true;
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = (ArrayList) this.e;
        arrayList.clear();
        s70 s70Var = (s70) this.d;
        s70Var.d.f();
        s70Var.e.f();
        arrayList.add(s70Var.d);
        arrayList.add(s70Var.e);
        Iterator it = s70Var.q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            r70 r70Var = (r70) it.next();
            if (r70Var instanceof t61) {
                arrayList.add(new u61(r70Var));
            } else {
                if (r70Var.y()) {
                    if (r70Var.f4113b == null) {
                        r70Var.f4113b = new wv(0, r70Var);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(r70Var.f4113b);
                } else {
                    arrayList.add(r70Var.d);
                }
                if (r70Var.z()) {
                    if (r70Var.c == null) {
                        r70Var.c = new wv(1, r70Var);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(r70Var.c);
                } else {
                    arrayList.add(r70Var.e);
                }
                if (r70Var instanceof z71) {
                    arrayList.add(new y71(r70Var));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((pp3) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            pp3 pp3Var = (pp3) it3.next();
            if (pp3Var.f3895b != s70Var) {
                pp3Var.d();
            }
        }
        ArrayList arrayList2 = (ArrayList) this.g;
        arrayList2.clear();
        s70 s70Var2 = (s70) this.c;
        f(s70Var2.d, 0, arrayList2);
        f(s70Var2.e, 1, arrayList2);
        this.f3859a = false;
    }

    public final int e(s70 s70Var, int i) {
        long j;
        ArrayList arrayList;
        int i2;
        pp3 pp3Var;
        pp3 pp3Var2;
        long max;
        float f;
        long j2;
        s70 s70Var2 = s70Var;
        int i3 = i;
        ArrayList arrayList2 = (ArrayList) this.g;
        int size = arrayList2.size();
        int i4 = 0;
        long j3 = 0;
        while (i4 < size) {
            pp3 pp3Var3 = ((sl2) arrayList2.get(i4)).f4364a;
            if (!(pp3Var3 instanceof wv) ? !(i3 != 0 ? (pp3Var3 instanceof zj3) : (pp3Var3 instanceof c91)) : ((wv) pp3Var3).f != i3) {
                j = 0;
                arrayList = arrayList2;
                i2 = size;
            } else {
                if (i3 == 0) {
                    pp3Var = s70Var2.d;
                } else {
                    pp3Var = s70Var2.e;
                }
                qk0 qk0Var = pp3Var.h;
                if (i3 == 0) {
                    pp3Var2 = s70Var2.d;
                } else {
                    pp3Var2 = s70Var2.e;
                }
                qk0 qk0Var2 = pp3Var2.i;
                boolean contains = pp3Var3.h.l.contains(qk0Var);
                qk0 qk0Var3 = pp3Var3.i;
                boolean contains2 = qk0Var3.l.contains(qk0Var2);
                long j4 = pp3Var3.j();
                qk0 qk0Var4 = pp3Var3.h;
                if (contains && contains2) {
                    long b2 = sl2.b(qk0Var4, 0L);
                    long a2 = sl2.a(qk0Var3, 0L);
                    long j5 = b2 - j4;
                    int i5 = qk0Var3.f;
                    arrayList = arrayList2;
                    i2 = size;
                    if (j5 >= (-i5)) {
                        j5 += i5;
                    }
                    long j6 = j5;
                    long j7 = (-a2) - j4;
                    long j8 = qk0Var4.f;
                    long j9 = j7 - j8;
                    if (j9 >= j8) {
                        j9 -= j8;
                    }
                    r70 r70Var = pp3Var3.f3895b;
                    if (i3 == 0) {
                        f = r70Var.d0;
                    } else if (i3 == 1) {
                        f = r70Var.e0;
                    } else {
                        r70Var.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j2 = (((float) j6) / (1.0f - f)) + (((float) j9) / f);
                    } else {
                        j2 = 0;
                    }
                    float f2 = (float) j2;
                    j = (qk0Var4.f + ((((f2 * f) + 0.5f) + j4) + hx2.f(1.0f, f, f2, 0.5f))) - qk0Var3.f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    if (contains) {
                        max = Math.max(sl2.b(qk0Var4, qk0Var4.f), qk0Var4.f + j4);
                    } else if (contains2) {
                        max = Math.max(-sl2.a(qk0Var3, qk0Var3.f), (-qk0Var3.f) + j4);
                    } else {
                        j = (pp3Var3.j() + qk0Var4.f) - qk0Var3.f;
                    }
                    j = max;
                }
            }
            j3 = Math.max(j3, j);
            i4++;
            s70Var2 = s70Var;
            i3 = i;
            arrayList2 = arrayList;
            size = i2;
        }
        return (int) j3;
    }

    public final void f(pp3 pp3Var, int i, ArrayList arrayList) {
        qk0 qk0Var;
        Iterator it = pp3Var.h.k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            qk0Var = pp3Var.i;
            if (!hasNext) {
                break;
            }
            lk0 lk0Var = (lk0) it.next();
            if (lk0Var instanceof qk0) {
                b((qk0) lk0Var, i, 0, arrayList, null);
            } else if (lk0Var instanceof pp3) {
                b(((pp3) lk0Var).h, i, 0, arrayList, null);
            }
        }
        Iterator it2 = qk0Var.k.iterator();
        while (it2.hasNext()) {
            lk0 lk0Var2 = (lk0) it2.next();
            if (lk0Var2 instanceof qk0) {
                b((qk0) lk0Var2, i, 1, arrayList, null);
            } else if (lk0Var2 instanceof pp3) {
                b(((pp3) lk0Var2).i, i, 1, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((zj3) pp3Var).k.k.iterator();
            while (it3.hasNext()) {
                lk0 lk0Var3 = (lk0) it3.next();
                if (lk0Var3 instanceof qk0) {
                    b((qk0) lk0Var3, i, 2, arrayList, null);
                }
            }
        }
    }

    public final void g() {
        m();
        if (((ArrayDeque) this.h).isEmpty()) {
            return;
        }
        z43 z43Var = (z43) ((j71) this.d);
        if (!z43Var.f5426a.hasMessages(0)) {
            z43Var.getClass();
            y43 b2 = z43.b();
            b2.f5269a = z43Var.f5426a.obtainMessage(0);
            z43Var.getClass();
            Message message = b2.f5269a;
            message.getClass();
            z43Var.f5426a.sendMessageAtFrontOfQueue(message);
            b2.f5269a = null;
            ArrayList arrayList = z43.f5425b;
            synchronized (arrayList) {
                if (arrayList.size() < 50) {
                    arrayList.add(b2);
                }
            }
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.g;
        boolean z = !arrayDeque.isEmpty();
        arrayDeque.addAll((ArrayDeque) this.h);
        ((ArrayDeque) this.h).clear();
        if (z) {
            return;
        }
        while (!arrayDeque.isEmpty()) {
            ((Runnable) arrayDeque.peekFirst()).run();
            arrayDeque.removeFirst();
        }
    }

    public final void h(r70 r70Var, int i, int i2, int i3, int i4) {
        boolean z;
        fp fpVar = (fp) this.i;
        fpVar.f2130a = i;
        fpVar.f2131b = i3;
        fpVar.c = i2;
        fpVar.d = i4;
        ((mp3) this.h).b(r70Var, fpVar);
        r70Var.O(fpVar.e);
        r70Var.L(fpVar.f);
        r70Var.E = fpVar.h;
        int i5 = fpVar.g;
        r70Var.a0 = i5;
        if (i5 > 0) {
            z = true;
        } else {
            z = false;
        }
        r70Var.E = z;
    }

    public final void i() {
        boolean z;
        ep epVar;
        Iterator it = ((s70) this.c).q0.iterator();
        while (it.hasNext()) {
            r70 r70Var = (r70) it.next();
            if (!r70Var.f4112a) {
                int[] iArr = r70Var.p0;
                boolean z2 = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = r70Var.r;
                int i4 = r70Var.s;
                if (i != 2 && (i != 3 || i3 != 1)) {
                    z = false;
                } else {
                    z = true;
                }
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z2 = true;
                }
                ml0 ml0Var = r70Var.d.e;
                boolean z3 = ml0Var.j;
                ml0 ml0Var2 = r70Var.e.e;
                boolean z4 = ml0Var2.j;
                if (z3 && z4) {
                    h(r70Var, 1, ml0Var.g, 1, ml0Var2.g);
                    r70Var.f4112a = true;
                } else if (z3 && z2) {
                    h(r70Var, 1, ml0Var.g, 2, ml0Var2.g);
                    if (i2 == 3) {
                        r70Var.e.e.m = r70Var.l();
                    } else {
                        r70Var.e.e.d(r70Var.l());
                        r70Var.f4112a = true;
                    }
                } else if (z4 && z) {
                    h(r70Var, 2, ml0Var.g, 1, ml0Var2.g);
                    if (i == 3) {
                        r70Var.d.e.m = r70Var.r();
                    } else {
                        r70Var.d.e.d(r70Var.r());
                        r70Var.f4112a = true;
                    }
                }
                if (r70Var.f4112a && (epVar = r70Var.e.l) != null) {
                    epVar.d(r70Var.a0);
                }
            }
        }
    }

    public final void j(int i, rl1 rl1Var) {
        m();
        ((ArrayDeque) this.h).add(new vk0(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f), i, rl1Var, 4));
    }

    public final void k() {
        m();
        synchronized (this.i) {
            this.f3859a = true;
        }
        Iterator it = ((CopyOnWriteArraySet) this.f).iterator();
        while (it.hasNext()) {
            tl1 tl1Var = (tl1) it.next();
            sl1 sl1Var = (sl1) this.e;
            tl1Var.d = true;
            if (tl1Var.c) {
                tl1Var.c = false;
                sl1Var.a(tl1Var.f4526a, tl1Var.f4527b.d());
            }
        }
        ((CopyOnWriteArraySet) this.f).clear();
    }

    public final void l(int i, rl1 rl1Var) {
        j(i, rl1Var);
        g();
    }

    public final void m() {
        boolean z;
        if (!this.f3860b) {
            return;
        }
        if (Thread.currentThread() == ((z43) ((j71) this.d)).f5426a.getLooper().getThread()) {
            z = true;
        } else {
            z = false;
        }
        cp3.m(z);
    }

    public pk0(Looper looper, f10 f10Var, sl1 sl1Var) {
        this(new CopyOnWriteArraySet(), looper, f10Var, sl1Var);
    }

    public pk0(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, f10 f10Var, sl1 sl1Var) {
        this.c = f10Var;
        this.f = copyOnWriteArraySet;
        this.e = sl1Var;
        this.i = new Object();
        this.g = new ArrayDeque();
        this.h = new ArrayDeque();
        this.d = ((t43) f10Var).a(looper, new lm0(this, 1));
        this.f3860b = true;
    }
}
