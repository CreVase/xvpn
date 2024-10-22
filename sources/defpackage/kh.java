package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class kh implements jh {

    /* renamed from: a, reason: collision with root package name */
    public int f2942a;

    /* renamed from: b, reason: collision with root package name */
    public int f2943b;
    public int c;
    public int d;
    public Object e;

    public kh() {
        this.f2942a = 0;
        this.f2943b = -1;
        this.c = 0;
        this.e = new int[16];
        this.d = r0.length - 1;
    }

    @Override // defpackage.jh
    public final int a() {
        return -1;
    }

    @Override // defpackage.jh
    public final int b() {
        return this.f2942a;
    }

    @Override // defpackage.jh
    public final int c() {
        int i = this.f2943b;
        if (i == 8) {
            return ((r42) this.e).v();
        }
        if (i == 16) {
            return ((r42) this.e).A();
        }
        int i2 = this.c;
        this.c = i2 + 1;
        if (i2 % 2 == 0) {
            int v = ((r42) this.e).v();
            this.d = v;
            return (v & 240) >> 4;
        }
        return this.d & 15;
    }

    public final void d(int i) {
        int i2 = this.c;
        Object obj = this.e;
        if (i2 == ((int[]) obj).length) {
            int[] iArr = (int[]) obj;
            int length = iArr.length << 1;
            if (length >= 0) {
                int[] iArr2 = new int[length];
                int length2 = iArr.length;
                int i3 = this.f2942a;
                int i4 = length2 - i3;
                System.arraycopy(iArr, i3, iArr2, 0, i4);
                System.arraycopy((int[]) this.e, 0, iArr2, i4, i3);
                this.f2942a = 0;
                this.f2943b = this.c - 1;
                this.e = iArr2;
                this.d = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i5 = (this.f2943b + 1) & this.d;
        this.f2943b = i5;
        ((int[]) this.e)[i5] = i;
        this.c++;
    }

    public final int e() {
        int i = this.c;
        if (i != 0) {
            int[] iArr = (int[]) this.e;
            int i2 = this.f2942a;
            int i3 = iArr[i2];
            this.f2942a = (i2 + 1) & this.d;
            this.c = i - 1;
            return i3;
        }
        throw new NoSuchElementException();
    }

    public kh(gh ghVar) {
        r42 r42Var = ghVar.c;
        this.e = r42Var;
        r42Var.G(12);
        this.f2943b = ((r42) this.e).y() & 255;
        this.f2942a = ((r42) this.e).y();
    }
}
