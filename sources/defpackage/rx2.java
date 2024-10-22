package defpackage;

/* loaded from: classes.dex */
public final class rx2 implements Cloneable {
    public static final Object e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f4231a = false;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4232b;
    public Object[] c;
    public int d;

    public rx2() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.f4232b = new int[i4];
        this.c = new Object[i4];
    }

    public final void a(int i, Object obj) {
        int i2 = this.d;
        if (i2 != 0 && i <= this.f4232b[i2 - 1]) {
            e(i, obj);
            return;
        }
        if (this.f4231a && i2 >= this.f4232b.length) {
            c();
        }
        int i3 = this.d;
        if (i3 >= this.f4232b.length) {
            int i4 = (i3 + 1) * 4;
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
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr = new Object[i7];
            int[] iArr2 = this.f4232b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f4232b = iArr;
            this.c = objArr;
        }
        this.f4232b[i3] = i;
        this.c[i3] = obj;
        this.d = i3 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final rx2 clone() {
        try {
            rx2 rx2Var = (rx2) super.clone();
            rx2Var.f4232b = (int[]) this.f4232b.clone();
            rx2Var.c = (Object[]) this.c.clone();
            return rx2Var;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void c() {
        int i = this.d;
        int[] iArr = this.f4232b;
        Object[] objArr = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != e) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f4231a = false;
        this.d = i2;
    }

    public final Object d(int i, Integer num) {
        Object obj;
        int e2 = fl.e(this.d, i, this.f4232b);
        if (e2 >= 0 && (obj = this.c[e2]) != e) {
            return obj;
        }
        return num;
    }

    public final void e(int i, Object obj) {
        int e2 = fl.e(this.d, i, this.f4232b);
        if (e2 >= 0) {
            this.c[e2] = obj;
            return;
        }
        int i2 = ~e2;
        int i3 = this.d;
        if (i2 < i3) {
            Object[] objArr = this.c;
            if (objArr[i2] == e) {
                this.f4232b[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f4231a && i3 >= this.f4232b.length) {
            c();
            i2 = ~fl.e(this.d, i, this.f4232b);
        }
        int i4 = this.d;
        if (i4 >= this.f4232b.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr2 = new Object[i8];
            int[] iArr2 = this.f4232b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f4232b = iArr;
            this.c = objArr2;
        }
        int i9 = this.d - i2;
        if (i9 != 0) {
            int[] iArr3 = this.f4232b;
            int i10 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i10, i9);
            Object[] objArr4 = this.c;
            System.arraycopy(objArr4, i2, objArr4, i10, this.d - i2);
        }
        this.f4232b[i2] = i;
        this.c[i2] = obj;
        this.d++;
    }

    public final int f() {
        if (this.f4231a) {
            c();
        }
        return this.d;
    }

    public final Object g(int i) {
        if (this.f4231a) {
            c();
        }
        return this.c[i];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        for (int i = 0; i < this.d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f4231a) {
                c();
            }
            sb.append(this.f4232b[i]);
            sb.append('=');
            Object g = g(i);
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
