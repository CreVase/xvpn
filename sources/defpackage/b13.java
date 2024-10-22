package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class b13 extends z1 implements gy1, gz0 {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(b13.class, Object.class, "_state");
    private volatile Object _state;
    public int d;

    public b13(Object obj) {
        this._state = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:            if (defpackage.m20.L(r4, r0) != false) goto L46;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007b, code lost:            if (r0 != r3) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007b, code lost:            if (0 == 0) goto L51;     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:13:0x003a, B:14:0x007b, B:16:0x0083, B:19:0x008a, B:20:0x0090, B:24:0x0096, B:26:0x00b7, B:30:0x00cc, B:31:0x00e4, B:36:0x00f4, B:38:0x00f8, B:39:0x00fb, B:33:0x00ee, B:50:0x009c, B:53:0x00a3, B:61:0x0050, B:63:0x005b, B:64:0x006c), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // defpackage.gz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.iz0 r18, defpackage.c90 r19) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b13.a(iz0, c90):java.lang.Object");
    }

    @Override // defpackage.iz0
    public final Object b(Object obj, c90 c90Var) {
        g(obj);
        return ch3.f636a;
    }

    @Override // defpackage.z1
    public final a2 d() {
        return new c13();
    }

    @Override // defpackage.z1
    public final a2[] e() {
        return new c13[2];
    }

    public final void g(Object obj) {
        int i;
        a2[] a2VarArr;
        pq0 pq0Var;
        boolean z;
        boolean z2;
        if (obj == null) {
            obj = pd0.c;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            if (!m20.L(atomicReferenceFieldUpdater.get(this), obj)) {
                atomicReferenceFieldUpdater.set(this, obj);
                int i2 = this.d;
                if ((i2 & 1) == 0) {
                    int i3 = i2 + 1;
                    this.d = i3;
                    a2[] a2VarArr2 = this.f5412a;
                    while (true) {
                        c13[] c13VarArr = (c13[]) a2VarArr2;
                        if (c13VarArr != null) {
                            for (c13 c13Var : c13VarArr) {
                                if (c13Var != null) {
                                    while (true) {
                                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = c13.f567a;
                                        Object obj2 = atomicReferenceFieldUpdater2.get(c13Var);
                                        if (obj2 != null && obj2 != (pq0Var = pd0.e)) {
                                            pq0 pq0Var2 = pd0.d;
                                            if (obj2 == pq0Var2) {
                                                while (true) {
                                                    if (atomicReferenceFieldUpdater2.compareAndSet(c13Var, obj2, pq0Var)) {
                                                        z = true;
                                                        break;
                                                    } else if (atomicReferenceFieldUpdater2.get(c13Var) != obj2) {
                                                        z = false;
                                                        break;
                                                    }
                                                }
                                                if (z) {
                                                    break;
                                                }
                                            } else {
                                                while (true) {
                                                    if (atomicReferenceFieldUpdater2.compareAndSet(c13Var, obj2, pq0Var2)) {
                                                        z2 = true;
                                                        break;
                                                    } else if (atomicReferenceFieldUpdater2.get(c13Var) != obj2) {
                                                        z2 = false;
                                                        break;
                                                    }
                                                }
                                                if (z2) {
                                                    ((vu) obj2).resumeWith(ch3.f636a);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        synchronized (this) {
                            i = this.d;
                            if (i == i3) {
                                this.d = i3 + 1;
                                return;
                            }
                            a2VarArr = this.f5412a;
                        }
                        a2VarArr2 = a2VarArr;
                        i3 = i;
                    }
                } else {
                    this.d = i2 + 2;
                }
            }
        }
    }

    @Override // defpackage.z03
    public final Object getValue() {
        pq0 pq0Var = pd0.c;
        Object obj = e.get(this);
        if (obj == pq0Var) {
            return null;
        }
        return obj;
    }
}
