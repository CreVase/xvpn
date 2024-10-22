package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class ms3 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3345b = AtomicReferenceFieldUpdater.newUpdater(ms3.class, Object.class, "lastScheduledTask");
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(ms3.class, "producerIndex");
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(ms3.class, "consumerIndex");
    public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(ms3.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f3346a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final f63 a(f63 f63Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return f63Var;
        }
        boolean z = true;
        if (f63Var.f2051b.f3720a != 1) {
            z = false;
        }
        if (z) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f3346a;
            if (atomicReferenceArray.get(i) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i, f63Var);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    public final f63 b() {
        f63 f63Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (f63Var = (f63) this.f3346a.getAndSet(i2, null)) != null) {
                boolean z = true;
                if (f63Var.f2051b.f3720a != 1) {
                    z = false;
                }
                if (z) {
                    e.decrementAndGet(this);
                }
                return f63Var;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:            if (r0.get(r7) == r1) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:            if (r4 == false) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:            if (r8 == false) goto L17;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:            defpackage.ms3.e.decrementAndGet(r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:            return r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0020, code lost:            r4 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:            if (r3 == r8) goto L9;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:            if (r0.compareAndSet(r7, r1, null) == false) goto L12;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.f63 c(int r7, boolean r8) {
        /*
            r6 = this;
            r7 = r7 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f3346a
            java.lang.Object r1 = r0.get(r7)
            f63 r1 = (defpackage.f63) r1
            r2 = 0
            if (r1 == 0) goto L32
            os r3 = r1.f2051b
            int r3 = r3.f3720a
            r4 = 0
            r5 = 1
            if (r3 != r5) goto L17
            r3 = 1
            goto L18
        L17:
            r3 = 0
        L18:
            if (r3 != r8) goto L32
        L1a:
            boolean r3 = r0.compareAndSet(r7, r1, r2)
            if (r3 == 0) goto L22
            r4 = 1
            goto L28
        L22:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r1) goto L1a
        L28:
            if (r4 == 0) goto L32
            if (r8 == 0) goto L31
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = defpackage.ms3.e
            r7.decrementAndGet(r6)
        L31:
            return r1
        L32:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ms3.c(int, boolean):f63");
    }
}
