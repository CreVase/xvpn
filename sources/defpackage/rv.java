package defpackage;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public abstract class rv implements w23 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f4216a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f4217b;
    public final PriorityQueue c;
    public pv d;
    public long e;
    public long f;

    public rv() {
        for (int i = 0; i < 10; i++) {
            this.f4216a.add(new pv());
        }
        this.f4217b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f4217b.add(new qv(new z5(this, 24)));
        }
        this.c = new PriorityQueue();
    }

    @Override // defpackage.w23
    public final void a(long j) {
        this.e = j;
    }

    @Override // defpackage.re0
    public final Object c() {
        boolean z;
        if (this.d == null) {
            z = true;
        } else {
            z = false;
        }
        cp3.m(z);
        ArrayDeque arrayDeque = this.f4216a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        pv pvVar = (pv) arrayDeque.pollFirst();
        this.d = pvVar;
        return pvVar;
    }

    @Override // defpackage.re0
    public final void d(a33 a33Var) {
        boolean z;
        if (a33Var == this.d) {
            z = true;
        } else {
            z = false;
        }
        cp3.e(z);
        pv pvVar = (pv) a33Var;
        if (pvVar.h()) {
            pvVar.i();
            this.f4216a.add(pvVar);
        } else {
            long j = this.f;
            this.f = 1 + j;
            pvVar.k = j;
            this.c.add(pvVar);
        }
        this.d = null;
    }

    public abstract sv e();

    public abstract void f(pv pvVar);

    @Override // defpackage.re0
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f4216a;
            if (isEmpty) {
                break;
            }
            pv pvVar = (pv) priorityQueue.poll();
            int i = wi3.f5017a;
            pvVar.i();
            arrayDeque.add(pvVar);
        }
        pv pvVar2 = this.d;
        if (pvVar2 != null) {
            pvVar2.i();
            arrayDeque.add(pvVar2);
            this.d = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:            return null;     */
    @Override // defpackage.re0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.b33 b() {
        /*
            r12 = this;
            java.util.ArrayDeque r0 = r12.f4217b
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.PriorityQueue r1 = r12.c
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L6d
            java.lang.Object r3 = r1.peek()
            pv r3 = (defpackage.pv) r3
            int r4 = defpackage.wi3.f5017a
            long r3 = r3.f
            long r5 = r12.e
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L6d
            java.lang.Object r1 = r1.poll()
            pv r1 = (defpackage.pv) r1
            r3 = 4
            boolean r4 = r1.g(r3)
            java.util.ArrayDeque r5 = r12.f4216a
            if (r4 == 0) goto L41
            java.lang.Object r0 = r0.pollFirst()
            b33 r0 = (defpackage.b33) r0
            r0.e(r3)
            r1.i()
            r5.add(r1)
            return r0
        L41:
            r12.f(r1)
            boolean r3 = r12.h()
            if (r3 == 0) goto L66
            sv r9 = r12.e()
            java.lang.Object r0 = r0.pollFirst()
            b33 r0 = (defpackage.b33) r0
            long r7 = r1.f
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r0
            r6.j(r7, r9, r10)
            r1.i()
            r5.add(r1)
            return r0
        L66:
            r1.i()
            r5.add(r1)
            goto La
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv.b():b33");
    }

    public abstract boolean h();

    @Override // defpackage.re0
    public void release() {
    }
}
