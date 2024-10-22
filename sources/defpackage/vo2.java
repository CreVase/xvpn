package defpackage;

import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class vo2 extends at {
    public final transient byte[][] e;
    public final transient int[] f;

    public vo2(byte[][] bArr, int[] iArr) {
        super(at.d.f329a);
        this.e = bArr;
        this.f = iArr;
    }

    @Override // defpackage.at
    public final String a() {
        return new at(l()).a();
    }

    @Override // defpackage.at
    public final at b(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        return new at(messageDigest.digest());
    }

    @Override // defpackage.at
    public final int c() {
        return this.f[this.e.length - 1];
    }

    @Override // defpackage.at
    public final String d() {
        byte[] l = l();
        char[] cArr = new char[l.length * 2];
        int length = l.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b2 = l[i];
            i++;
            int i3 = i2 + 1;
            char[] cArr2 = bx3.k;
            cArr[i2] = cArr2[(b2 >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    @Override // defpackage.at
    public final byte[] e() {
        return l();
    }

    @Override // defpackage.at
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof at) {
                at atVar = (at) obj;
                if (atVar.c() != c() || !h(atVar, c())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.at
    public final byte f(int i) {
        int i2;
        byte[][] bArr = this.e;
        int length = bArr.length - 1;
        int[] iArr = this.f;
        t9.u(iArr[length], i, 1L);
        int i0 = t9.i0(this, i);
        if (i0 == 0) {
            i2 = 0;
        } else {
            i2 = iArr[i0 - 1];
        }
        return bArr[i0][(i - i2) + iArr[bArr.length + i0]];
    }

    @Override // defpackage.at
    public final boolean g(int i, int i2, int i3, byte[] bArr) {
        int i4;
        if (i < 0 || i > c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int i0 = t9.i0(this, i);
        while (true) {
            boolean z = true;
            if (i < i5) {
                int[] iArr = this.f;
                if (i0 == 0) {
                    i4 = 0;
                } else {
                    i4 = iArr[i0 - 1];
                }
                int i6 = iArr[i0] - i4;
                byte[][] bArr2 = this.e;
                int i7 = iArr[bArr2.length + i0];
                int min = Math.min(i5, i6 + i4) - i;
                int i8 = (i - i4) + i7;
                byte[] bArr3 = bArr2[i0];
                if (min > 0) {
                    int i9 = 0;
                    while (true) {
                        int i10 = i9 + 1;
                        if (bArr3[i9 + i8] != bArr[i9 + i2]) {
                            z = false;
                            break;
                        }
                        if (i10 >= min) {
                            break;
                        }
                        i9 = i10;
                    }
                }
                if (!z) {
                    return false;
                }
                i2 += min;
                i += min;
                i0++;
            } else {
                return true;
            }
        }
    }

    @Override // defpackage.at
    public final boolean h(at atVar, int i) {
        int i2;
        if (c() - i < 0) {
            return false;
        }
        int i3 = i + 0;
        int i0 = t9.i0(this, 0);
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int[] iArr = this.f;
            if (i0 == 0) {
                i2 = 0;
            } else {
                i2 = iArr[i0 - 1];
            }
            int i6 = iArr[i0] - i2;
            byte[][] bArr = this.e;
            int i7 = iArr[bArr.length + i0];
            int min = Math.min(i3, i6 + i2) - i4;
            if (!atVar.g(i5, (i4 - i2) + i7, min, bArr[i0])) {
                return false;
            }
            i5 += min;
            i4 += min;
            i0++;
        }
        return true;
    }

    @Override // defpackage.at
    public final int hashCode() {
        int i = this.f330b;
        if (i == 0) {
            byte[][] bArr = this.e;
            int length = bArr.length;
            int i2 = 0;
            int i3 = 1;
            int i4 = 0;
            while (i2 < length) {
                int[] iArr = this.f;
                int i5 = iArr[length + i2];
                int i6 = iArr[i2];
                byte[] bArr2 = bArr[i2];
                int i7 = (i6 - i4) + i5;
                while (i5 < i7) {
                    i3 = (i3 * 31) + bArr2[i5];
                    i5++;
                }
                i2++;
                i4 = i6;
            }
            this.f330b = i3;
            return i3;
        }
        return i;
    }

    @Override // defpackage.at
    public final at i() {
        return new at(l()).i();
    }

    @Override // defpackage.at
    public final void k(lr lrVar, int i) {
        int i2;
        int i3 = 0 + i;
        int i0 = t9.i0(this, 0);
        int i4 = 0;
        while (i4 < i3) {
            int[] iArr = this.f;
            if (i0 == 0) {
                i2 = 0;
            } else {
                i2 = iArr[i0 - 1];
            }
            int i5 = iArr[i0] - i2;
            byte[][] bArr = this.e;
            int i6 = iArr[bArr.length + i0];
            int min = Math.min(i3, i5 + i2) - i4;
            int i7 = (i4 - i2) + i6;
            so2 so2Var = new so2(bArr[i0], i7, i7 + min, true, false);
            so2 so2Var2 = lrVar.f3175a;
            if (so2Var2 == null) {
                so2Var.g = so2Var;
                so2Var.f = so2Var;
                lrVar.f3175a = so2Var;
            } else {
                so2Var2.g.b(so2Var);
            }
            i4 += min;
            i0++;
        }
        lrVar.f3176b += i;
    }

    public final byte[] l() {
        byte[] bArr = new byte[c()];
        byte[][] bArr2 = this.e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            System.arraycopy(bArr2[i], i4, bArr, i3, (i4 + i6) - i4);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.at
    public final String toString() {
        return new at(l()).toString();
    }
}
