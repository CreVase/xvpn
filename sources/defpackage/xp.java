package defpackage;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public final class xp implements tg2 {
    public int d = -1;
    public boolean e = false;
    public int f = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f5198a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f5199b = 0;
    public int c = Integer.MIN_VALUE;
    public Object g = null;

    public xp(int i) {
    }

    @Override // defpackage.tg2
    public final void a(List list, mn2 mn2Var, yu0 yu0Var) {
        int i;
        int i2 = this.d;
        if ((i2 & 7) != 2) {
            int i3 = ie1.f2577a;
            throw new ge1();
        }
        do {
            list.add(k(mn2Var, yu0Var));
            if (f()) {
                return;
            } else {
                i = this.f5198a;
            }
        } while (n() == i2);
        this.f5198a = i;
    }

    @Override // defpackage.tg2
    public final void b(xp1 xp1Var, eb3 eb3Var, yu0 yu0Var) {
        s(2);
        int n = n();
        q(n);
        int i = this.c;
        this.c = this.f5198a + n;
        try {
            Object obj = eb3Var.f1908b;
            Object obj2 = eb3Var.d;
            while (true) {
                int fieldNumber = getFieldNumber();
                if (fieldNumber == Integer.MAX_VALUE) {
                    xp1Var.put(obj, obj2);
                    return;
                }
                if (fieldNumber != 1) {
                    if (fieldNumber != 2) {
                        try {
                            if (!u()) {
                                throw new ie1("Unable to parse map entry.");
                                break;
                            }
                        } catch (ge1 unused) {
                            if (!u()) {
                                throw new ie1("Unable to parse map entry.");
                            }
                        }
                    } else {
                        obj2 = g((lr3) eb3Var.c, eb3Var.d.getClass(), yu0Var);
                    }
                } else {
                    obj = g((lr3) eb3Var.f1907a, null, null);
                }
            }
        } finally {
            this.c = i;
        }
    }

    @Override // defpackage.tg2
    public final Object c(mn2 mn2Var, yu0 yu0Var) {
        s(3);
        return h(mn2Var, yu0Var);
    }

    @Override // defpackage.tg2
    public final Object d(mn2 mn2Var, yu0 yu0Var) {
        s(2);
        return k(mn2Var, yu0Var);
    }

    @Override // defpackage.tg2
    public final void e(List list, mn2 mn2Var, yu0 yu0Var) {
        int i;
        int i2 = this.d;
        if ((i2 & 7) != 3) {
            int i3 = ie1.f2577a;
            throw new ge1();
        }
        do {
            list.add(h(mn2Var, yu0Var));
            if (f()) {
                return;
            } else {
                i = this.f5198a;
            }
        } while (n() == i2);
        this.f5198a = i;
    }

    public final boolean f() {
        if (this.f5198a == this.c) {
            return true;
        }
        return false;
    }

    public final Object g(lr3 lr3Var, Class cls, yu0 yu0Var) {
        switch (lr3Var.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(readInt64());
            case 3:
                return Long.valueOf(readUInt64());
            case 4:
                return Integer.valueOf(readInt32());
            case 5:
                return Long.valueOf(readFixed64());
            case 6:
                return Integer.valueOf(readFixed32());
            case 7:
                return Boolean.valueOf(readBool());
            case 8:
                return l(true);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                s(2);
                return k(ka2.c.a(cls), yu0Var);
            case 11:
                return readBytes();
            case 12:
                return Integer.valueOf(readUInt32());
            case 13:
                return Integer.valueOf(readEnum());
            case 14:
                return Integer.valueOf(readSFixed32());
            case 15:
                return Long.valueOf(readSFixed64());
            case 16:
                return Integer.valueOf(readSInt32());
            case 17:
                return Long.valueOf(readSInt64());
        }
    }

    @Override // defpackage.tg2
    public final int getFieldNumber() {
        if (f()) {
            return Integer.MAX_VALUE;
        }
        int n = n();
        this.d = n;
        if (n == this.f) {
            return Integer.MAX_VALUE;
        }
        return n >>> 3;
    }

    @Override // defpackage.tg2
    public final int getTag() {
        return this.d;
    }

    public final Object h(mn2 mn2Var, yu0 yu0Var) {
        int i = this.f;
        this.f = ((this.d >>> 3) << 3) | 4;
        try {
            Object newInstance = mn2Var.newInstance();
            mn2Var.a(newInstance, this, yu0Var);
            mn2Var.makeImmutable(newInstance);
            if (this.d == this.f) {
                return newInstance;
            }
            throw ie1.e();
        } finally {
            this.f = i;
        }
    }

    public final int i() {
        int i = this.f5198a;
        byte[] bArr = (byte[]) this.g;
        this.f5198a = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long j() {
        int i = this.f5198a;
        byte[] bArr = (byte[]) this.g;
        this.f5198a = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public final Object k(mn2 mn2Var, yu0 yu0Var) {
        int n = n();
        q(n);
        int i = this.c;
        int i2 = this.f5198a + n;
        this.c = i2;
        try {
            Object newInstance = mn2Var.newInstance();
            mn2Var.a(newInstance, this, yu0Var);
            mn2Var.makeImmutable(newInstance);
            if (this.f5198a == i2) {
                return newInstance;
            }
            throw ie1.e();
        } finally {
            this.c = i;
        }
    }

    public final String l(boolean z) {
        boolean z2;
        s(2);
        int n = n();
        if (n == 0) {
            return "";
        }
        q(n);
        if (z) {
            byte[] bArr = (byte[]) this.g;
            int i = this.f5198a;
            if (ui3.f4677a.a0(bArr, i, i + n) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                throw ie1.a();
            }
        }
        String str = new String((byte[]) this.g, this.f5198a, n, yd1.f5317a);
        this.f5198a += n;
        return str;
    }

    public final void m(List list, boolean z) {
        int i;
        int i2;
        if ((this.d & 7) == 2) {
            if ((list instanceof jj1) && !z) {
                jj1 jj1Var = (jj1) list;
                do {
                    jj1Var.d(readBytes());
                    if (f()) {
                        return;
                    } else {
                        i2 = this.f5198a;
                    }
                } while (n() == this.d);
                this.f5198a = i2;
                return;
            }
            do {
                list.add(l(z));
                if (f()) {
                    return;
                } else {
                    i = this.f5198a;
                }
            } while (n() == this.d);
            this.f5198a = i;
            return;
        }
        throw ie1.b();
    }

    public final int n() {
        int i;
        int i2 = this.f5198a;
        int i3 = this.c;
        if (i3 != i2) {
            Object obj = this.g;
            int i4 = i2 + 1;
            byte b2 = ((byte[]) obj)[i2];
            if (b2 >= 0) {
                this.f5198a = i4;
                return b2;
            }
            if (i3 - i4 < 9) {
                return (int) p();
            }
            int i5 = i4 + 1;
            int i6 = b2 ^ (((byte[]) obj)[i4] << 7);
            if (i6 < 0) {
                i = i6 ^ (-128);
            } else {
                int i7 = i5 + 1;
                int i8 = i6 ^ (((byte[]) obj)[i5] << 14);
                if (i8 >= 0) {
                    i = i8 ^ 16256;
                } else {
                    i5 = i7 + 1;
                    int i9 = i8 ^ (((byte[]) obj)[i7] << 21);
                    if (i9 < 0) {
                        i = i9 ^ (-2080896);
                    } else {
                        i7 = i5 + 1;
                        byte b3 = ((byte[]) obj)[i5];
                        i = (i9 ^ (b3 << 28)) ^ 266354560;
                        if (b3 < 0) {
                            i5 = i7 + 1;
                            if (((byte[]) obj)[i7] < 0) {
                                i7 = i5 + 1;
                                if (((byte[]) obj)[i5] < 0) {
                                    i5 = i7 + 1;
                                    if (((byte[]) obj)[i7] < 0) {
                                        i7 = i5 + 1;
                                        if (((byte[]) obj)[i5] < 0) {
                                            i5 = i7 + 1;
                                            if (((byte[]) obj)[i7] < 0) {
                                                throw ie1.c();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i5 = i7;
            }
            this.f5198a = i5;
            return i;
        }
        throw ie1.f();
    }

    public final long o() {
        long j;
        long j2;
        long j3;
        int i;
        int i2 = this.f5198a;
        int i3 = this.c;
        if (i3 != i2) {
            byte[] bArr = (byte[]) this.g;
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.f5198a = i4;
                return b2;
            }
            if (i3 - i4 < 9) {
                return p();
            }
            int i5 = i4 + 1;
            int i6 = b2 ^ (bArr[i4] << 7);
            if (i6 < 0) {
                i = i6 ^ (-128);
            } else {
                int i7 = i5 + 1;
                int i8 = i6 ^ (bArr[i5] << 14);
                if (i8 >= 0) {
                    i5 = i7;
                    j = i8 ^ 16256;
                } else {
                    i5 = i7 + 1;
                    int i9 = i8 ^ (bArr[i7] << 21);
                    if (i9 < 0) {
                        i = i9 ^ (-2080896);
                    } else {
                        long j4 = i9;
                        int i10 = i5 + 1;
                        long j5 = j4 ^ (bArr[i5] << 28);
                        if (j5 >= 0) {
                            j3 = 266354560;
                        } else {
                            i5 = i10 + 1;
                            long j6 = j5 ^ (bArr[i10] << 35);
                            if (j6 < 0) {
                                j2 = -34093383808L;
                            } else {
                                i10 = i5 + 1;
                                j5 = j6 ^ (bArr[i5] << 42);
                                if (j5 >= 0) {
                                    j3 = 4363953127296L;
                                } else {
                                    i5 = i10 + 1;
                                    j6 = j5 ^ (bArr[i10] << 49);
                                    if (j6 < 0) {
                                        j2 = -558586000294016L;
                                    } else {
                                        int i11 = i5 + 1;
                                        long j7 = (j6 ^ (bArr[i5] << 56)) ^ 71499008037633920L;
                                        if (j7 < 0) {
                                            i5 = i11 + 1;
                                            if (bArr[i11] < 0) {
                                                throw ie1.c();
                                            }
                                        } else {
                                            i5 = i11;
                                        }
                                        j = j7;
                                    }
                                }
                            }
                            j = j6 ^ j2;
                        }
                        j = j5 ^ j3;
                        i5 = i10;
                    }
                }
                this.f5198a = i5;
                return j;
            }
            j = i;
            this.f5198a = i5;
            return j;
        }
        throw ie1.f();
    }

    public final long p() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f5198a;
            if (i2 != this.c) {
                byte[] bArr = (byte[]) this.g;
                this.f5198a = i2 + 1;
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((bArr[i2] & 128) == 0) {
                    return j;
                }
            } else {
                throw ie1.f();
            }
        }
        throw ie1.c();
    }

    public final void q(int i) {
        if (i >= 0 && i <= this.c - this.f5198a) {
        } else {
            throw ie1.f();
        }
    }

    public final void r(int i) {
        if (this.f5198a == i) {
        } else {
            throw ie1.f();
        }
    }

    @Override // defpackage.tg2
    public final boolean readBool() {
        s(0);
        if (n() == 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.tg2
    public final void readBoolList(List list) {
        int i;
        boolean z;
        if (list instanceof pq) {
            int i2 = this.d & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int n = n();
                    int i3 = this.f5198a;
                    int i4 = n + i3;
                    if (i3 >= i4) {
                        r(i4);
                        return;
                    } else {
                        n();
                        throw null;
                    }
                }
                throw ie1.b();
            }
            readBool();
            throw null;
        }
        int i5 = this.d & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int n2 = this.f5198a + n();
                while (this.f5198a < n2) {
                    if (n() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    list.add(Boolean.valueOf(z));
                }
                r(n2);
                return;
            }
            throw ie1.b();
        }
        do {
            list.add(Boolean.valueOf(readBool()));
            if (f()) {
                return;
            } else {
                i = this.f5198a;
            }
        } while (n() == this.d);
        this.f5198a = i;
    }

    @Override // defpackage.tg2
    public final vs readBytes() {
        vs e;
        s(2);
        int n = n();
        if (n == 0) {
            return vs.f4885b;
        }
        q(n);
        if (this.e) {
            byte[] bArr = (byte[]) this.g;
            int i = this.f5198a;
            xs xsVar = vs.f4885b;
            e = new qs(bArr, i, n);
        } else {
            e = vs.e(this.f5198a, (byte[]) this.g, n);
        }
        this.f5198a += n;
        return e;
    }

    @Override // defpackage.tg2
    public final void readBytesList(List list) {
        int i;
        if ((this.d & 7) != 2) {
            throw ie1.b();
        }
        do {
            list.add(readBytes());
            if (f()) {
                return;
            } else {
                i = this.f5198a;
            }
        } while (n() == this.d);
        this.f5198a = i;
    }

    @Override // defpackage.tg2
    public final double readDouble() {
        s(1);
        q(8);
        return Double.longBitsToDouble(j());
    }

    @Override // defpackage.tg2
    public final void readDoubleList(List list) {
        int i;
        if (list instanceof dm0) {
            int i2 = this.d & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int n = n();
                    w(n);
                    int i3 = this.f5198a;
                    if (i3 < n + i3) {
                        Double.longBitsToDouble(j());
                        throw null;
                    }
                    return;
                }
                throw ie1.b();
            }
            readDouble();
            throw null;
        }
        int i4 = this.d & 7;
        if (i4 != 1) {
            if (i4 == 2) {
                int n2 = n();
                w(n2);
                int i5 = this.f5198a + n2;
                while (this.f5198a < i5) {
                    list.add(Double.valueOf(Double.longBitsToDouble(j())));
                }
                return;
            }
            throw ie1.b();
        }
        do {
            list.add(Double.valueOf(readDouble()));
            if (f()) {
                return;
            } else {
                i = this.f5198a;
            }
        } while (n() == this.d);
        this.f5198a = i;
    }

    @Override // defpackage.tg2
    public final int readEnum() {
        s(0);
        return n();
    }

    @Override // defpackage.tg2
    public final void readEnumList(List list) {
        int i;
        if (list instanceof fd1) {
            int i2 = this.d & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int n = n();
                    int i3 = this.f5198a;
                    if (i3 < n + i3) {
                        n();
                        throw null;
                    }
                    return;
                }
                throw ie1.b();
            }
            readEnum();
            throw null;
        }
        int i4 = this.d & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int n2 = this.f5198a + n();
                while (this.f5198a < n2) {
                    list.add(Integer.valueOf(n()));
                }
                return;
            }
            throw ie1.b();
        }
        do {
            list.add(Integer.valueOf(readEnum()));
            if (f()) {
                return;
            } else {
                i = this.f5198a;
            }
        } while (n() == this.d);
        this.f5198a = i;
    }

    @Override // defpackage.tg2
    public final int readFixed32() {
        s(5);
        q(4);
        return i();
    }

    @Override // defpackage.tg2
    public final void readFixed32List(List list) {
        int i;
        if (list instanceof fd1) {
            int i2 = this.d & 7;
            if (i2 != 2) {
                if (i2 != 5) {
                    throw ie1.b();
                }
                readFixed32();
                throw null;
            }
            int n = n();
            v(n);
            int i3 = this.f5198a;
            if (i3 < n + i3) {
                i();
                throw null;
            }
            return;
        }
        int i4 = this.d & 7;
        if (i4 != 2) {
            if (i4 != 5) {
                throw ie1.b();
            }
            do {
                list.add(Integer.valueOf(readFixed32()));
                if (f()) {
                    return;
                } else {
                    i = this.f5198a;
                }
            } while (n() == this.d);
            this.f5198a = i;
            return;
        }
        int n2 = n();
        v(n2);
        int i5 = this.f5198a + n2;
        while (this.f5198a < i5) {
            list.add(Integer.valueOf(i()));
        }
    }

    @Override // defpackage.tg2
    public final long readFixed64() {
        s(1);
        q(8);
        return j();
    }

    @Override // defpackage.tg2
    public final void readFixed64List(List list) {
        int i;
        if (list instanceof eo1) {
            int i2 = this.d & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int n = n();
                    w(n);
                    int i3 = this.f5198a;
                    if (i3 < n + i3) {
                        j();
                        throw null;
                    }
                    return;
                }
                throw ie1.b();
            }
            readFixed64();
            throw null;
        }
        int i4 = this.d & 7;
        if (i4 != 1) {
            if (i4 == 2) {
                int n2 = n();
                w(n2);
                int i5 = this.f5198a + n2;
                while (this.f5198a < i5) {
                    list.add(Long.valueOf(j()));
                }
                return;
            }
            throw ie1.b();
        }
        do {
            list.add(Long.valueOf(readFixed64()));
            if (f()) {
                return;
            } else {
                i = this.f5198a;
            }
        } while (n() == this.d);
        this.f5198a = i;
    }

    @Override // defpackage.tg2
    public final float readFloat() {
        s(5);
        q(4);
        return Float.intBitsToFloat(i());
    }

    @Override // defpackage.tg2
    public final void readFloatList(List list) {
        int i;
        if (list instanceof zy0) {
            int i2 = this.d & 7;
            if (i2 != 2) {
                if (i2 != 5) {
                    throw ie1.b();
                }
                readFloat();
                throw null;
            }
            int n = n();
            v(n);
            int i3 = this.f5198a;
            if (i3 < n + i3) {
                Float.intBitsToFloat(i());
                throw null;
            }
            return;
        }
        int i4 = this.d & 7;
        if (i4 != 2) {
            if (i4 != 5) {
                throw ie1.b();
            }
            do {
                list.add(Float.valueOf(readFloat()));
                if (f()) {
                    return;
                } else {
                    i = this.f5198a;
                }
            } while (n() == this.d);
            this.f5198a = i;
            return;
        }
        int n2 = n();
        v(n2);
        int i5 = this.f5198a + n2;
        while (this.f5198a < i5) {
            list.add(Float.valueOf(Float.intBitsToFloat(i())));
        }
    }

    @Override // defpackage.tg2
    public final int readInt32() {
        s(0);
        return n();
    }

    @Override // defpackage.tg2
    public final void readInt32List(List list) {
        int i;
        if (list instanceof fd1) {
            int i2 = this.d & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int n = n();
                    int i3 = this.f5198a;
                    int i4 = n + i3;
                    if (i3 >= i4) {
                        r(i4);
                        return;
                    } else {
                        n();
                        throw null;
                    }
                }
                throw ie1.b();
            }
            readInt32();
            throw null;
        }
        int i5 = this.d & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int n2 = this.f5198a + n();
                while (this.f5198a < n2) {
                    list.add(Integer.valueOf(n()));
                }
                r(n2);
                return;
            }
            throw ie1.b();
        }
        do {
            list.add(Integer.valueOf(readInt32()));
            if (f()) {
                return;
            } else {
                i = this.f5198a;
            }
        } while (n() == this.d);
        this.f5198a = i;
    }

    @Override // defpackage.tg2
    public final long readInt64() {
        s(0);
        return o();
    }

    @Override // defpackage.tg2
    public final void readInt64List(List list) {
        int i;
        if (list instanceof eo1) {
            int i2 = this.d & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int n = n();
                    int i3 = this.f5198a;
                    int i4 = n + i3;
                    if (i3 >= i4) {
                        r(i4);
                        return;
                    } else {
                        o();
                        throw null;
                    }
                }
                throw ie1.b();
            }
            readInt64();
            throw null;
        }
        int i5 = this.d & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int n2 = this.f5198a + n();
                while (this.f5198a < n2) {
                    list.add(Long.valueOf(o()));
                }
                r(n2);
                return;
            }
            throw ie1.b();
        }
        do {
            list.add(Long.valueOf(readInt64()));
            if (f()) {
                return;
            } else {
                i = this.f5198a;
            }
        } while (n() == this.d);
        this.f5198a = i;
    }

    @Override // defpackage.tg2
    public final int readSFixed32() {
        s(5);
        q(4);
        return i();
    }

    @Override // defpackage.tg2
    public final void readSFixed32List(List list) {
        int i;
        if (list instanceof fd1) {
            int i2 = this.d & 7;
            if (i2 != 2) {
                if (i2 != 5) {
                    throw ie1.b();
                }
                readSFixed32();
                throw null;
            }
            int n = n();
            v(n);
            int i3 = this.f5198a;
            if (i3 < n + i3) {
                i();
                throw null;
            }
            return;
        }
        int i4 = this.d & 7;
        if (i4 != 2) {
            if (i4 != 5) {
                throw ie1.b();
            }
            do {
                list.add(Integer.valueOf(readSFixed32()));
                if (f()) {
                    return;
                } else {
                    i = this.f5198a;
                }
            } while (n() == this.d);
            this.f5198a = i;
            return;
        }
        int n2 = n();
        v(n2);
        int i5 = this.f5198a + n2;
        while (this.f5198a < i5) {
            list.add(Integer.valueOf(i()));
        }
    }

    @Override // defpackage.tg2
    public final long readSFixed64() {
        s(1);
        q(8);
        return j();
    }

    @Override // defpackage.tg2
    public final void readSFixed64List(List list) {
        int i;
        if (list instanceof eo1) {
            int i2 = this.d & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int n = n();
                    w(n);
                    int i3 = this.f5198a;
                    if (i3 < n + i3) {
                        j();
                        throw null;
                    }
                    return;
                }
                throw ie1.b();
            }
            readSFixed64();
            throw null;
        }
        int i4 = this.d & 7;
        if (i4 != 1) {
            if (i4 == 2) {
                int n2 = n();
                w(n2);
                int i5 = this.f5198a + n2;
                while (this.f5198a < i5) {
                    list.add(Long.valueOf(j()));
                }
                return;
            }
            throw ie1.b();
        }
        do {
            list.add(Long.valueOf(readSFixed64()));
            if (f()) {
                return;
            } else {
                i = this.f5198a;
            }
        } while (n() == this.d);
        this.f5198a = i;
    }

    @Override // defpackage.tg2
    public final int readSInt32() {
        s(0);
        int n = n();
        return (-(n & 1)) ^ (n >>> 1);
    }

    @Override // defpackage.tg2
    public final void readSInt32List(List list) {
        int i;
        if (list instanceof fd1) {
            int i2 = this.d & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int n = n();
                    int i3 = this.f5198a;
                    if (i3 < n + i3) {
                        n();
                        throw null;
                    }
                    return;
                }
                int i4 = ie1.f2577a;
                throw new ge1();
            }
            readSInt32();
            throw null;
        }
        int i5 = this.d & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int n2 = this.f5198a + n();
                while (this.f5198a < n2) {
                    int n3 = n();
                    list.add(Integer.valueOf((-(n3 & 1)) ^ (n3 >>> 1)));
                }
                return;
            }
            int i6 = ie1.f2577a;
            throw new ge1();
        }
        do {
            list.add(Integer.valueOf(readSInt32()));
            if (f()) {
                return;
            } else {
                i = this.f5198a;
            }
        } while (n() == this.d);
        this.f5198a = i;
    }

    @Override // defpackage.tg2
    public final long readSInt64() {
        s(0);
        long o = o();
        return (-(o & 1)) ^ (o >>> 1);
    }

    @Override // defpackage.tg2
    public final void readSInt64List(List list) {
        int i;
        if (list instanceof eo1) {
            int i2 = this.d & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int n = n();
                    int i3 = this.f5198a;
                    if (i3 < n + i3) {
                        o();
                        throw null;
                    }
                    return;
                }
                int i4 = ie1.f2577a;
                throw new ge1();
            }
            readSInt64();
            throw null;
        }
        int i5 = this.d & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int n2 = this.f5198a + n();
                while (this.f5198a < n2) {
                    long o = o();
                    list.add(Long.valueOf((-(o & 1)) ^ (o >>> 1)));
                }
                return;
            }
            int i6 = ie1.f2577a;
            throw new ge1();
        }
        do {
            list.add(Long.valueOf(readSInt64()));
            if (f()) {
                return;
            } else {
                i = this.f5198a;
            }
        } while (n() == this.d);
        this.f5198a = i;
    }

    @Override // defpackage.tg2
    public final String readString() {
        return l(false);
    }

    @Override // defpackage.tg2
    public final void readStringList(List list) {
        m(list, false);
    }

    @Override // defpackage.tg2
    public final void readStringListRequireUtf8(List list) {
        m(list, true);
    }

    @Override // defpackage.tg2
    public final String readStringRequireUtf8() {
        return l(true);
    }

    @Override // defpackage.tg2
    public final int readUInt32() {
        s(0);
        return n();
    }

    @Override // defpackage.tg2
    public final void readUInt32List(List list) {
        int i;
        if (list instanceof fd1) {
            int i2 = this.d & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int n = n();
                    int i3 = this.f5198a;
                    if (i3 < n + i3) {
                        n();
                        throw null;
                    }
                    return;
                }
                throw ie1.b();
            }
            readUInt32();
            throw null;
        }
        int i4 = this.d & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int n2 = this.f5198a + n();
                while (this.f5198a < n2) {
                    list.add(Integer.valueOf(n()));
                }
                return;
            }
            throw ie1.b();
        }
        do {
            list.add(Integer.valueOf(readUInt32()));
            if (f()) {
                return;
            } else {
                i = this.f5198a;
            }
        } while (n() == this.d);
        this.f5198a = i;
    }

    @Override // defpackage.tg2
    public final long readUInt64() {
        s(0);
        return o();
    }

    @Override // defpackage.tg2
    public final void readUInt64List(List list) {
        int i;
        if (list instanceof eo1) {
            int i2 = this.d & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int n = n();
                    int i3 = this.f5198a;
                    int i4 = n + i3;
                    if (i3 >= i4) {
                        r(i4);
                        return;
                    } else {
                        o();
                        throw null;
                    }
                }
                throw ie1.b();
            }
            readUInt64();
            throw null;
        }
        int i5 = this.d & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int n2 = this.f5198a + n();
                while (this.f5198a < n2) {
                    list.add(Long.valueOf(o()));
                }
                r(n2);
                return;
            }
            throw ie1.b();
        }
        do {
            list.add(Long.valueOf(readUInt64()));
            if (f()) {
                return;
            } else {
                i = this.f5198a;
            }
        } while (n() == this.d);
        this.f5198a = i;
    }

    public final void s(int i) {
        if ((this.d & 7) == i) {
        } else {
            throw ie1.b();
        }
    }

    public final void t(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.P(i);
            this.e = false;
            return;
        }
        if (this.e) {
            Interpolator interpolator = (Interpolator) this.g;
            if (interpolator != null && this.c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i2 = this.c;
            if (i2 >= 1) {
                recyclerView.p0.c(this.f5198a, this.f5199b, i2, interpolator);
                int i3 = this.f + 1;
                this.f = i3;
                if (i3 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.e = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        this.f = 0;
    }

    public final boolean u() {
        int i;
        int i2;
        if (f() || (i = this.d) == (i2 = this.f)) {
            return false;
        }
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 5) {
                            q(4);
                            this.f5198a += 4;
                            return true;
                        }
                        int i4 = ie1.f2577a;
                        throw new ge1();
                    }
                    this.f = ((i >>> 3) << 3) | 4;
                    while (getFieldNumber() != Integer.MAX_VALUE && u()) {
                    }
                    if (this.d == this.f) {
                        this.f = i2;
                        return true;
                    }
                    throw ie1.e();
                }
                int n = n();
                q(n);
                this.f5198a += n;
                return true;
            }
            q(8);
            this.f5198a += 8;
            return true;
        }
        int i5 = this.c;
        int i6 = this.f5198a;
        if (i5 - i6 >= 10) {
            byte[] bArr = (byte[]) this.g;
            int i7 = 0;
            while (i7 < 10) {
                int i8 = i6 + 1;
                if (bArr[i6] >= 0) {
                    this.f5198a = i8;
                    break;
                }
                i7++;
                i6 = i8;
            }
        }
        for (int i9 = 0; i9 < 10; i9++) {
            int i10 = this.f5198a;
            if (i10 != this.c) {
                byte[] bArr2 = (byte[]) this.g;
                this.f5198a = i10 + 1;
                if (bArr2[i10] >= 0) {
                    return true;
                }
            } else {
                throw ie1.f();
            }
        }
        throw ie1.c();
    }

    public final void v(int i) {
        q(i);
        if ((i & 3) == 0) {
        } else {
            throw ie1.e();
        }
    }

    public final void w(int i) {
        q(i);
        if ((i & 7) == 0) {
        } else {
            throw ie1.e();
        }
    }
}
