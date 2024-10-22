package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class y90 extends Thread {
    public static final AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(y90.class, "workerCtl");

    /* renamed from: a, reason: collision with root package name */
    public final ms3 f5295a;

    /* renamed from: b, reason: collision with root package name */
    public final ei2 f5296b;
    public int c;
    public long d;
    public long e;
    public int f;
    public boolean g;
    public final /* synthetic */ z90 h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    public y90(z90 z90Var, int i2) {
        this.h = z90Var;
        setDaemon(true);
        this.f5295a = new ms3();
        this.f5296b = new ei2();
        this.c = 4;
        this.nextParkedWorker = z90.k;
        gg2.f2251a.getClass();
        this.f = gg2.f2252b.a().nextInt();
        f(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.f63 a(boolean r11) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y90.a(boolean):f63");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i2) {
        int i3 = this.f;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f = i6;
        int i7 = i2 - 1;
        if ((i7 & i2) == 0) {
            return i6 & i7;
        }
        return (i6 & Integer.MAX_VALUE) % i2;
    }

    public final f63 e() {
        int d = d(2);
        z90 z90Var = this.h;
        if (d == 0) {
            f63 f63Var = (f63) z90Var.e.d();
            if (f63Var != null) {
                return f63Var;
            }
            return (f63) z90Var.f.d();
        }
        f63 f63Var2 = (f63) z90Var.f.d();
        if (f63Var2 != null) {
            return f63Var2;
        }
        return (f63) z90Var.e.d();
    }

    public final void f(int i2) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.h.d);
        sb.append("-worker-");
        if (i2 == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i2);
        }
        sb.append(valueOf);
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i2) {
        int i3 = this.c;
        boolean z = true;
        if (i3 != 1) {
            z = false;
        }
        if (z) {
            z90.i.addAndGet(this.h, 4398046511104L);
        }
        if (i3 != i2) {
            this.c = i2;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0092, code lost:            r5 = -1;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x008e, code lost:            r7 = -2;        r18 = r6;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.f63 i(int r21) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y90.i(int):f63");
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0004, code lost:            continue;     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0004, code lost:            continue;     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y90.run():void");
    }
}
