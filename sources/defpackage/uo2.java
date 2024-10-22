package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class uo2 {

    /* renamed from: a, reason: collision with root package name */
    public static final so2 f4710a = new so2(new byte[0], 0, 0, false, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f4711b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f4711b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(so2 so2Var) {
        boolean z;
        int i;
        boolean z2 = true;
        if (so2Var.f == null && so2Var.g == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (so2Var.d) {
                return;
            }
            AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (f4711b - 1))];
            so2 so2Var2 = (so2) atomicReference.get();
            if (so2Var2 == f4710a) {
                return;
            }
            if (so2Var2 == null) {
                i = 0;
            } else {
                i = so2Var2.c;
            }
            if (i >= 65536) {
                return;
            }
            so2Var.f = so2Var2;
            so2Var.f4387b = 0;
            so2Var.c = i + 8192;
            while (true) {
                if (atomicReference.compareAndSet(so2Var2, so2Var)) {
                    break;
                } else if (atomicReference.get() != so2Var2) {
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                so2Var.f = null;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final so2 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (f4711b - 1))];
        so2 so2Var = f4710a;
        so2 so2Var2 = (so2) atomicReference.getAndSet(so2Var);
        if (so2Var2 == so2Var) {
            return new so2();
        }
        if (so2Var2 == null) {
            atomicReference.set(null);
            return new so2();
        }
        atomicReference.set(so2Var2.f);
        so2Var2.f = null;
        so2Var2.c = 0;
        return so2Var2;
    }
}
