package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public abstract class to2 extends s40 implements l02 {
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(to2.class, "cleanedAndPointers");
    public final long c;
    private volatile int cleanedAndPointers;

    public to2(long j, to2 to2Var, int i) {
        super(to2Var);
        this.c = j;
        this.cleanedAndPointers = i << 16;
    }

    @Override // defpackage.s40
    public final boolean c() {
        boolean z;
        if (d.get(this) != f()) {
            return false;
        }
        if (b() == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        boolean z;
        if (d.addAndGet(this, -65536) != f()) {
            return false;
        }
        if (b() == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return true;
    }

    public abstract int f();

    public abstract void g(int i, t90 t90Var);

    public final void h() {
        if (d.incrementAndGet(this) == f()) {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i() {
        /*
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.to2.d
            int r1 = r0.get(r5)
            int r2 = r5.f()
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L1c
            s40 r2 = r5.b()
            if (r2 != 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            if (r2 == 0) goto L1a
            goto L1c
        L1a:
            r2 = 0
            goto L1d
        L1c:
            r2 = 1
        L1d:
            if (r2 != 0) goto L21
            r3 = 0
            goto L2a
        L21:
            r2 = 65536(0x10000, float:9.1835E-41)
            int r2 = r2 + r1
            boolean r0 = r0.compareAndSet(r5, r1, r2)
            if (r0 == 0) goto L0
        L2a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.to2.i():boolean");
    }
}
