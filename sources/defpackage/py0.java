package defpackage;

/* loaded from: classes.dex */
public final class py0 extends dq {
    public py0(f93 f93Var, long j, long j2) {
        super(new mp0(20), new uy0(f93Var, 0), j, j + 1, 0L, j2, 188L, 1000);
    }

    public static int d(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public py0(f93 f93Var, long j, long j2, int i, int i2) {
        super(new mp0(20), new nd1(i, f93Var, i2), j, j + 1, 0L, j2, 188L, 940);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public py0(defpackage.vy0 r15, int r16, long r17, long r19) {
        /*
            r14 = this;
            r0 = r15
            java.util.Objects.requireNonNull(r15)
            z5 r1 = new z5
            r2 = 20
            r1.<init>(r15, r2)
            f30 r2 = new f30
            r3 = r16
            r2.<init>(r15, r3)
            long r3 = r15.b()
            long r5 = r0.j
            int r7 = r0.c
            int r8 = r0.d
            if (r8 <= 0) goto L27
            long r8 = (long) r8
            long r10 = (long) r7
            long r8 = r8 + r10
            r10 = 2
            long r8 = r8 / r10
            r10 = 1
            goto L42
        L27:
            int r8 = r0.f4913b
            int r9 = r0.f4912a
            if (r9 != r8) goto L31
            if (r9 <= 0) goto L31
            long r8 = (long) r9
            goto L33
        L31:
            r8 = 4096(0x1000, double:2.0237E-320)
        L33:
            int r10 = r0.g
            long r10 = (long) r10
            long r8 = r8 * r10
            int r0 = r0.h
            long r10 = (long) r0
            long r8 = r8 * r10
            r10 = 8
            long r8 = r8 / r10
            r10 = 64
        L42:
            long r11 = r8 + r10
            r0 = 6
            int r13 = java.lang.Math.max(r0, r7)
            r0 = r14
            r7 = r17
            r9 = r19
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py0.<init>(vy0, int, long, long):void");
    }
}
