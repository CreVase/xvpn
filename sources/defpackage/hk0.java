package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class hk0 implements Iterator, qh1 {

    /* renamed from: a, reason: collision with root package name */
    public int f2436a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f2437b;
    public int c;
    public kd1 d;
    public int e;
    public final /* synthetic */ ik0 f;

    public hk0(ik0 ik0Var) {
        this.f = ik0Var;
        int i = ik0Var.f2613b;
        int length = ik0Var.f2612a.length();
        if (length >= 0) {
            if (i < 0) {
                i = 0;
            } else if (i > length) {
                i = length;
            }
            this.f2437b = i;
            this.c = i;
            return;
        }
        throw new IllegalArgumentException(p71.k("Cannot coerce value to an empty range: maximum ", length, " is less than minimum 0."));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:            if (r6 < r3) goto L9;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r7 = this;
            int r0 = r7.c
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.f2436a = r1
            r0 = 0
            r7.d = r0
            goto L7b
        Lb:
            ik0 r2 = r7.f
            int r3 = r2.c
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.e
            int r6 = r6 + r5
            r7.e = r6
            if (r6 >= r3) goto L22
        L1a:
            java.lang.CharSequence r3 = r2.f2612a
            int r3 = r3.length()
            if (r0 <= r3) goto L34
        L22:
            kd1 r0 = new kd1
            int r1 = r7.f2437b
            java.lang.CharSequence r2 = r2.f2612a
            int r2 = defpackage.i23.V0(r2)
            r0.<init>(r1, r2)
            r7.d = r0
            r7.c = r4
            goto L79
        L34:
            l41 r0 = r2.d
            java.lang.CharSequence r3 = r2.f2612a
            int r6 = r7.c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.invoke(r3, r6)
            n42 r0 = (defpackage.n42) r0
            if (r0 != 0) goto L58
            kd1 r0 = new kd1
            int r1 = r7.f2437b
            java.lang.CharSequence r2 = r2.f2612a
            int r2 = defpackage.i23.V0(r2)
            r0.<init>(r1, r2)
            r7.d = r0
            r7.c = r4
            goto L79
        L58:
            java.lang.Object r2 = r0.f3395a
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f3396b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f2437b
            kd1 r3 = defpackage.t9.I0(r3, r2)
            r7.d = r3
            int r2 = r2 + r0
            r7.f2437b = r2
            if (r0 != 0) goto L76
            r1 = 1
        L76:
            int r2 = r2 + r1
            r7.c = r2
        L79:
            r7.f2436a = r5
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hk0.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2436a == -1) {
            a();
        }
        if (this.f2436a == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2436a == -1) {
            a();
        }
        if (this.f2436a != 0) {
            kd1 kd1Var = this.d;
            this.d = null;
            this.f2436a = -1;
            return kd1Var;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
