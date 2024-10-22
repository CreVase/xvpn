package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class hh3 {
    public static final hh3 f = new hh3(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f2424a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f2425b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public hh3(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f2424a = i;
        this.f2425b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static hh3 b() {
        return new hh3(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int s0;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f2424a; i3++) {
            int i4 = this.f2425b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 5) {
                                ((Integer) this.c[i3]).intValue();
                                s0 = v10.c0(i5);
                            } else {
                                int i7 = ie1.f2577a;
                                throw new IllegalStateException(new ge1());
                            }
                        } else {
                            i2 = ((hh3) this.c[i3]).a() + (v10.p0(i5) * 2) + i2;
                        }
                    } else {
                        s0 = v10.Z(i5, (vs) this.c[i3]);
                    }
                } else {
                    ((Long) this.c[i3]).longValue();
                    s0 = v10.d0(i5);
                }
            } else {
                s0 = v10.s0(i5, ((Long) this.c[i3]).longValue());
            }
            i2 = s0 + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void c(int i, Object obj) {
        int i2;
        if (this.e) {
            int i3 = this.f2424a;
            int[] iArr = this.f2425b;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.f2425b = Arrays.copyOf(iArr, i4);
                this.c = Arrays.copyOf(this.c, i4);
            }
            int[] iArr2 = this.f2425b;
            int i5 = this.f2424a;
            iArr2[i5] = i;
            this.c[i5] = obj;
            this.f2424a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(v51 v51Var) {
        if (this.f2424a == 0) {
            return;
        }
        v51Var.getClass();
        for (int i = 0; i < this.f2424a; i++) {
            int i2 = this.f2425b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                v51Var.y(i3, ((Integer) obj).intValue());
                            } else {
                                int i5 = ie1.f2577a;
                                throw new RuntimeException(new ge1());
                            }
                        } else {
                            ((v10) v51Var.f4780b).K0(i3, 3);
                            ((hh3) obj).d(v51Var);
                            ((v10) v51Var.f4780b).K0(i3, 4);
                        }
                    } else {
                        v51Var.v(i3, (vs) obj);
                    }
                } else {
                    v51Var.z(i3, ((Long) obj).longValue());
                }
            } else {
                v51Var.D(i3, ((Long) obj).longValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof hh3)) {
            return false;
        }
        hh3 hh3Var = (hh3) obj;
        int i = this.f2424a;
        if (i == hh3Var.f2424a) {
            int[] iArr = this.f2425b;
            int[] iArr2 = hh3Var.f2425b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        z = false;
                        break;
                    }
                    i2++;
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                Object[] objArr = this.c;
                Object[] objArr2 = hh3Var.c;
                int i3 = this.f2424a;
                int i4 = 0;
                while (true) {
                    if (i4 < i3) {
                        if (!objArr[i4].equals(objArr2[i4])) {
                            z2 = false;
                            break;
                        }
                        i4++;
                    } else {
                        z2 = true;
                        break;
                    }
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f2424a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f2425b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.f2424a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
