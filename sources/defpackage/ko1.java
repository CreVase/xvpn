package defpackage;

/* loaded from: classes.dex */
public final class ko1 implements Cloneable {
    public static final Object e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f2986a = false;

    /* renamed from: b, reason: collision with root package name */
    public long[] f2987b;
    public Object[] c;
    public int d;

    public ko1() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.f2987b = new long[i4];
        this.c = new Object[i4];
    }

    public final void a(long j, Long l) {
        int i = this.d;
        if (i != 0 && j <= this.f2987b[i - 1]) {
            f(j, l);
            return;
        }
        if (this.f2986a && i >= this.f2987b.length) {
            d();
        }
        int i2 = this.d;
        if (i2 >= this.f2987b.length) {
            int i3 = (i2 + 1) * 8;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 8;
            long[] jArr = new long[i6];
            Object[] objArr = new Object[i6];
            long[] jArr2 = this.f2987b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2987b = jArr;
            this.c = objArr;
        }
        this.f2987b[i2] = j;
        this.c[i2] = l;
        this.d = i2 + 1;
    }

    public final void b() {
        int i = this.d;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.f2986a = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ko1 clone() {
        try {
            ko1 ko1Var = (ko1) super.clone();
            ko1Var.f2987b = (long[]) this.f2987b.clone();
            ko1Var.c = (Object[]) this.c.clone();
            return ko1Var;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void d() {
        int i = this.d;
        long[] jArr = this.f2987b;
        Object[] objArr = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != e) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f2986a = false;
        this.d = i2;
    }

    public final Object e(long j, Long l) {
        Object obj;
        int f = fl.f(this.f2987b, this.d, j);
        if (f >= 0 && (obj = this.c[f]) != e) {
            return obj;
        }
        return l;
    }

    public final void f(long j, Object obj) {
        int f = fl.f(this.f2987b, this.d, j);
        if (f >= 0) {
            this.c[f] = obj;
            return;
        }
        int i = ~f;
        int i2 = this.d;
        if (i < i2) {
            Object[] objArr = this.c;
            if (objArr[i] == e) {
                this.f2987b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f2986a && i2 >= this.f2987b.length) {
            d();
            i = ~fl.f(this.f2987b, this.d, j);
        }
        int i3 = this.d;
        if (i3 >= this.f2987b.length) {
            int i4 = (i3 + 1) * 8;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            Object[] objArr2 = new Object[i7];
            long[] jArr2 = this.f2987b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2987b = jArr;
            this.c = objArr2;
        }
        int i8 = this.d - i;
        if (i8 != 0) {
            long[] jArr3 = this.f2987b;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.c;
            System.arraycopy(objArr4, i, objArr4, i9, this.d - i);
        }
        this.f2987b[i] = j;
        this.c[i] = obj;
        this.d++;
    }

    public final Object g(int i) {
        if (this.f2986a) {
            d();
        }
        return this.c[i];
    }

    public final String toString() {
        if (this.f2986a) {
            d();
        }
        int i = this.d;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.f2986a) {
                d();
            }
            sb.append(this.f2987b[i2]);
            sb.append('=');
            Object g = g(i2);
            if (g != this) {
                sb.append(g);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
