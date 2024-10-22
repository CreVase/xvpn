package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class gu implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f2323a;

    /* renamed from: b, reason: collision with root package name */
    public long f2324b;
    public long[] c;
    public int d;
    public final tf3 e;

    public gu() {
        y92 y92Var = z92.f;
        this.f2323a = new ArrayList();
        this.f2324b = 0L;
        this.e = y92Var;
    }

    public final synchronized void a(z12 z12Var) {
        if (z12Var != null) {
            int lastIndexOf = this.f2323a.lastIndexOf(z12Var);
            if (lastIndexOf < 0 || b(lastIndexOf)) {
                this.f2323a.add(z12Var);
            }
        } else {
            throw new IllegalArgumentException("callback cannot be null");
        }
    }

    public final boolean b(int i) {
        int i2;
        if (i < 64) {
            if (((1 << i) & this.f2324b) != 0) {
                return true;
            }
            return false;
        }
        long[] jArr = this.c;
        if (jArr == null || (i2 = (i / 64) - 1) >= jArr.length) {
            return false;
        }
        if (((1 << (i % 64)) & jArr[i2]) != 0) {
            return true;
        }
        return false;
    }

    public final synchronized void c(int i, Object obj) {
        this.d++;
        int size = this.f2323a.size();
        long[] jArr = this.c;
        int length = jArr == null ? -1 : jArr.length - 1;
        e(obj, i, length);
        d(obj, i, (length + 2) * 64, size, 0L);
        int i2 = this.d - 1;
        this.d = i2;
        if (i2 == 0) {
            long[] jArr2 = this.c;
            long j = Long.MIN_VALUE;
            if (jArr2 != null) {
                for (int length2 = jArr2.length - 1; length2 >= 0; length2--) {
                    long j2 = this.c[length2];
                    if (j2 != 0) {
                        int i3 = (length2 + 1) * 64;
                        long j3 = Long.MIN_VALUE;
                        for (int i4 = (i3 + 64) - 1; i4 >= i3; i4--) {
                            if ((j2 & j3) != 0) {
                                this.f2323a.remove(i4);
                            }
                            j3 >>>= 1;
                        }
                        this.c[length2] = 0;
                    }
                }
            }
            long j4 = this.f2324b;
            if (j4 != 0) {
                for (int i5 = 63; i5 >= 0; i5--) {
                    if ((j4 & j) != 0) {
                        this.f2323a.remove(i5);
                    }
                    j >>>= 1;
                }
                this.f2324b = 0L;
            }
        }
    }

    public final Object clone() {
        gu guVar;
        CloneNotSupportedException e;
        synchronized (this) {
            try {
                guVar = (gu) super.clone();
            } catch (CloneNotSupportedException e2) {
                guVar = null;
                e = e2;
            }
            try {
                guVar.f2324b = 0L;
                guVar.c = null;
                guVar.d = 0;
                guVar.f2323a = new ArrayList();
                int size = this.f2323a.size();
                for (int i = 0; i < size; i++) {
                    if (!b(i)) {
                        guVar.f2323a.add(this.f2323a.get(i));
                    }
                }
            } catch (CloneNotSupportedException e3) {
                e = e3;
                e.printStackTrace();
                return guVar;
            }
        }
        return guVar;
    }

    public final void d(Object obj, int i, int i2, int i3, long j) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.e.n0(i, this.f2323a.get(i2), obj);
            }
            j2 <<= 1;
            i2++;
        }
    }

    public final void e(Object obj, int i, int i2) {
        if (i2 < 0) {
            d(obj, i, 0, Math.min(64, this.f2323a.size()), this.f2324b);
            return;
        }
        long j = this.c[i2];
        int i3 = (i2 + 1) * 64;
        int min = Math.min(this.f2323a.size(), i3 + 64);
        e(obj, i, i2 - 1);
        d(obj, i, i3, min, j);
    }

    public final synchronized void f(z12 z12Var) {
        if (this.d == 0) {
            this.f2323a.remove(z12Var);
        } else {
            int lastIndexOf = this.f2323a.lastIndexOf(z12Var);
            if (lastIndexOf >= 0) {
                g(lastIndexOf);
            }
        }
    }

    public final void g(int i) {
        if (i < 64) {
            this.f2324b = (1 << i) | this.f2324b;
            return;
        }
        int i2 = (i / 64) - 1;
        long[] jArr = this.c;
        if (jArr == null) {
            this.c = new long[this.f2323a.size() / 64];
        } else if (jArr.length <= i2) {
            long[] jArr2 = new long[this.f2323a.size() / 64];
            long[] jArr3 = this.c;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.c = jArr2;
        }
        long j = 1 << (i % 64);
        long[] jArr4 = this.c;
        jArr4[i2] = j | jArr4[i2];
    }
}
