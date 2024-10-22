package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class zu2 implements w23, re0 {

    /* renamed from: a, reason: collision with root package name */
    public final xu2 f5550a;
    public final we0[] f;
    public int h;
    public ve0 i;
    public x23 j;
    public boolean k;
    public boolean l;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5551b = new Object();
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();
    public final ve0[] e = new a33[2];
    public int g = 2;

    public zu2() {
        b33[] b33VarArr = new b33[2];
        for (int i = 0; i < this.g; i++) {
            this.e[i] = new a33();
        }
        this.f = b33VarArr;
        this.h = 2;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= this.h) {
                break;
            }
            this.f[i2] = new nu0(this, z ? 1 : 0);
            i2++;
        }
        xu2 xu2Var = new xu2(this);
        this.f5550a = xu2Var;
        xu2Var.start();
        int i3 = this.g;
        ve0[] ve0VarArr = this.e;
        cp3.m(i3 == ve0VarArr.length);
        for (ve0 ve0Var : ve0VarArr) {
            ve0Var.k(UserVerificationMethods.USER_VERIFY_ALL);
        }
    }

    @Override // defpackage.w23
    public final void a(long j) {
    }

    @Override // defpackage.re0
    public final Object b() {
        synchronized (this.f5551b) {
            try {
                x23 x23Var = this.j;
                if (x23Var == null) {
                    if (this.d.isEmpty()) {
                        return null;
                    }
                    return (we0) this.d.removeFirst();
                }
                throw x23Var;
            } finally {
            }
        }
    }

    @Override // defpackage.re0
    public final Object c() {
        boolean z;
        ve0 ve0Var;
        synchronized (this.f5551b) {
            try {
                x23 x23Var = this.j;
                if (x23Var == null) {
                    if (this.i == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cp3.m(z);
                    int i = this.g;
                    if (i == 0) {
                        ve0Var = null;
                    } else {
                        ve0[] ve0VarArr = this.e;
                        int i2 = i - 1;
                        this.g = i2;
                        ve0Var = ve0VarArr[i2];
                    }
                    this.i = ve0Var;
                } else {
                    throw x23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ve0Var;
    }

    @Override // defpackage.re0
    public final void d(a33 a33Var) {
        boolean z;
        synchronized (this.f5551b) {
            try {
                x23 x23Var = this.j;
                if (x23Var == null) {
                    boolean z2 = true;
                    if (a33Var == this.i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cp3.e(z);
                    this.c.addLast(a33Var);
                    if (this.c.isEmpty() || this.h <= 0) {
                        z2 = false;
                    }
                    if (z2) {
                        this.f5551b.notify();
                    }
                    this.i = null;
                } else {
                    throw x23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract v23 e(byte[] bArr, int i, boolean z);

    public final x23 f(ve0 ve0Var, we0 we0Var, boolean z) {
        a33 a33Var = (a33) ve0Var;
        b33 b33Var = (b33) we0Var;
        try {
            ByteBuffer byteBuffer = a33Var.d;
            byteBuffer.getClass();
            b33Var.j(a33Var.f, e(byteBuffer.array(), byteBuffer.limit(), z), a33Var.j);
            b33Var.f3342b &= Integer.MAX_VALUE;
            return null;
        } catch (x23 e) {
            return e;
        }
    }

    @Override // defpackage.re0
    public final void flush() {
        synchronized (this.f5551b) {
            this.k = true;
            ve0 ve0Var = this.i;
            if (ve0Var != null) {
                ve0Var.i();
                int i = this.g;
                this.g = i + 1;
                this.e[i] = ve0Var;
                this.i = null;
            }
            while (!this.c.isEmpty()) {
                ve0 ve0Var2 = (ve0) this.c.removeFirst();
                ve0Var2.i();
                int i2 = this.g;
                this.g = i2 + 1;
                this.e[i2] = ve0Var2;
            }
            while (!this.d.isEmpty()) {
                ((we0) this.d.removeFirst()).i();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f5551b
            monitor-enter(r0)
        L3:
            boolean r1 = r7.l     // Catch: java.lang.Throwable -> L17
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L23
            java.util.ArrayDeque r1 = r7.c     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L1a
            int r1 = r7.h     // Catch: java.lang.Throwable -> L17
            if (r1 <= 0) goto L1a
            r1 = 1
            goto L1b
        L17:
            r1 = move-exception
            goto Lb1
        L1a:
            r1 = 0
        L1b:
            if (r1 != 0) goto L23
            java.lang.Object r1 = r7.f5551b     // Catch: java.lang.Throwable -> L17
            r1.wait()     // Catch: java.lang.Throwable -> L17
            goto L3
        L23:
            boolean r1 = r7.l     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L2a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            goto Lad
        L2a:
            java.util.ArrayDeque r1 = r7.c     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L17
            ve0 r1 = (defpackage.ve0) r1     // Catch: java.lang.Throwable -> L17
            we0[] r4 = r7.f     // Catch: java.lang.Throwable -> L17
            int r5 = r7.h     // Catch: java.lang.Throwable -> L17
            int r5 = r5 - r3
            r7.h = r5     // Catch: java.lang.Throwable -> L17
            r4 = r4[r5]     // Catch: java.lang.Throwable -> L17
            boolean r5 = r7.k     // Catch: java.lang.Throwable -> L17
            r7.k = r2     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            r0 = 4
            boolean r6 = r1.g(r0)
            if (r6 == 0) goto L4b
            r4.e(r0)
            goto L84
        L4b:
            boolean r0 = r1.h()
            if (r0 == 0) goto L56
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.e(r0)
        L56:
            r0 = 134217728(0x8000000, float:3.85186E-34)
            boolean r6 = r1.g(r0)
            if (r6 == 0) goto L61
            r4.e(r0)
        L61:
            x23 r0 = r7.f(r1, r4, r5)     // Catch: java.lang.OutOfMemoryError -> L66 java.lang.RuntimeException -> L6f
            goto L78
        L66:
            r0 = move-exception
            x23 r5 = new x23
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
            goto L77
        L6f:
            r0 = move-exception
            x23 r5 = new x23
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
        L77:
            r0 = r5
        L78:
            if (r0 == 0) goto L84
            java.lang.Object r5 = r7.f5551b
            monitor-enter(r5)
            r7.j = r0     // Catch: java.lang.Throwable -> L81
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L81
            goto Lad
        L81:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L81
            throw r0
        L84:
            java.lang.Object r2 = r7.f5551b
            monitor-enter(r2)
            boolean r0 = r7.k     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L8f
            r4.i()     // Catch: java.lang.Throwable -> Lae
            goto L9e
        L8f:
            boolean r0 = r4.h()     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L99
            r4.i()     // Catch: java.lang.Throwable -> Lae
            goto L9e
        L99:
            java.util.ArrayDeque r0 = r7.d     // Catch: java.lang.Throwable -> Lae
            r0.addLast(r4)     // Catch: java.lang.Throwable -> Lae
        L9e:
            r1.i()     // Catch: java.lang.Throwable -> Lae
            int r0 = r7.g     // Catch: java.lang.Throwable -> Lae
            int r4 = r0 + 1
            r7.g = r4     // Catch: java.lang.Throwable -> Lae
            ve0[] r4 = r7.e     // Catch: java.lang.Throwable -> Lae
            r4[r0] = r1     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lae
            r2 = 1
        Lad:
            return r2
        Lae:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lae
            throw r0
        Lb1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu2.g():boolean");
    }

    @Override // defpackage.re0
    public final void release() {
        synchronized (this.f5551b) {
            this.l = true;
            this.f5551b.notify();
        }
        try {
            this.f5550a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
