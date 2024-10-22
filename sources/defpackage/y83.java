package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class y83 implements bs {
    public static final String h = wi3.z(0);
    public static final String i = wi3.z(1);
    public static final String j = wi3.z(2);
    public static final String k = wi3.z(3);
    public static final String l = wi3.z(4);

    /* renamed from: a, reason: collision with root package name */
    public Object f5293a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5294b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public r7 g = r7.g;

    static {
        new qb0(3);
    }

    public final long a(int i2, int i3) {
        q7 a2 = this.g.a(i2);
        if (a2.f3964b != -1) {
            return a2.f[i3];
        }
        return -9223372036854775807L;
    }

    public final int b(long j2) {
        int i2;
        boolean z;
        r7 r7Var = this.g;
        long j3 = this.d;
        r7Var.getClass();
        if (j2 == Long.MIN_VALUE) {
            return -1;
        }
        if (j3 != -9223372036854775807L && j2 >= j3) {
            return -1;
        }
        int i3 = r7Var.e;
        while (true) {
            i2 = r7Var.f4111b;
            if (i3 >= i2) {
                break;
            }
            if (r7Var.a(i3).f3963a == Long.MIN_VALUE || r7Var.a(i3).f3963a > j2) {
                q7 a2 = r7Var.a(i3);
                int i4 = a2.f3964b;
                if (i4 != -1 && a2.a(-1) >= i4) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    break;
                }
            }
            i3++;
        }
        if (i3 >= i2) {
            return -1;
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[LOOP:0: B:2:0x0008->B:14:0x0033, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[EDGE_INSN: B:15:0x0036->B:16:0x0036 BREAK  A[LOOP:0: B:2:0x0008->B:14:0x0033], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(long r12) {
        /*
            r11 = this;
            r7 r0 = r11.g
            long r1 = r11.d
            int r3 = r0.f4111b
            r4 = 1
            int r3 = r3 - r4
        L8:
            r5 = 0
            if (r3 < 0) goto L36
            r6 = -9223372036854775808
            int r8 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r8 != 0) goto L12
            goto L30
        L12:
            q7 r8 = r0.a(r3)
            long r8 = r8.f3963a
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L2a
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 == 0) goto L2e
            int r6 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r6 >= 0) goto L30
            goto L2e
        L2a:
            int r6 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r6 >= 0) goto L30
        L2e:
            r6 = 1
            goto L31
        L30:
            r6 = 0
        L31:
            if (r6 == 0) goto L36
            int r3 = r3 + (-1)
            goto L8
        L36:
            r12 = -1
            if (r3 < 0) goto L55
            q7 r13 = r0.a(r3)
            int r0 = r13.f3964b
            if (r0 != r12) goto L42
            goto L52
        L42:
            r1 = 0
        L43:
            if (r1 >= r0) goto L51
            int[] r2 = r13.e
            r2 = r2[r1]
            if (r2 == 0) goto L52
            if (r2 != r4) goto L4e
            goto L52
        L4e:
            int r1 = r1 + 1
            goto L43
        L51:
            r4 = 0
        L52:
            if (r4 == 0) goto L55
            goto L56
        L55:
            r3 = -1
        L56:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y83.c(long):int");
    }

    public final int d(int i2, int i3) {
        q7 a2 = this.g.a(i2);
        if (a2.f3964b != -1) {
            return a2.e[i3];
        }
        return 0;
    }

    public final int e(int i2) {
        return this.g.a(i2).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !y83.class.equals(obj.getClass())) {
            return false;
        }
        y83 y83Var = (y83) obj;
        if (wi3.a(this.f5293a, y83Var.f5293a) && wi3.a(this.f5294b, y83Var.f5294b) && this.c == y83Var.c && this.d == y83Var.d && this.e == y83Var.e && this.f == y83Var.f && wi3.a(this.g, y83Var.g)) {
            return true;
        }
        return false;
    }

    public final long f() {
        return this.e;
    }

    public final boolean g(int i2) {
        return this.g.a(i2).h;
    }

    public final void h(Object obj, Object obj2, int i2, long j2, long j3, r7 r7Var, boolean z) {
        this.f5293a = obj;
        this.f5294b = obj2;
        this.c = i2;
        this.d = j2;
        this.e = j3;
        this.g = r7Var;
        this.f = z;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f5293a;
        int i2 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i3 = (217 + hashCode) * 31;
        Object obj2 = this.f5294b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        int i4 = (((i3 + i2) * 31) + this.c) * 31;
        long j2 = this.d;
        int i5 = (i4 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        return this.g.hashCode() + ((((i5 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i2 = this.c;
        if (i2 != 0) {
            bundle.putInt(h, i2);
        }
        long j2 = this.d;
        if (j2 != -9223372036854775807L) {
            bundle.putLong(i, j2);
        }
        long j3 = this.e;
        if (j3 != 0) {
            bundle.putLong(j, j3);
        }
        boolean z = this.f;
        if (z) {
            bundle.putBoolean(k, z);
        }
        if (!this.g.equals(r7.g)) {
            bundle.putBundle(l, this.g.toBundle());
        }
        return bundle;
    }
}
