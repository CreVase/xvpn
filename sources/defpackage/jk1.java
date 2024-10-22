package defpackage;

import android.view.View;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class jk1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2778a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f2779b;
    public boolean c;
    public boolean d;
    public int e;
    public Object f;

    public jk1(int i) {
        this.f2779b = i;
        byte[] bArr = new byte[131];
        this.f = bArr;
        bArr[2] = 1;
    }

    public final void a(int i, byte[] bArr, int i2) {
        if (!this.c) {
            return;
        }
        int i3 = i2 - i;
        Object obj = this.f;
        int length = ((byte[]) obj).length;
        int i4 = this.e;
        if (length < i4 + i3) {
            this.f = Arrays.copyOf((byte[]) obj, (i4 + i3) * 2);
        }
        System.arraycopy(bArr, i, (byte[]) this.f, this.e, i3);
        this.e += i3;
    }

    public final void b() {
        int h;
        if (this.c) {
            h = ((v32) this.f).f();
        } else {
            h = ((v32) this.f).h();
        }
        this.e = h;
    }

    public final void c(View view, int i) {
        int i2;
        if (this.c) {
            int b2 = ((v32) this.f).b(view);
            v32 v32Var = (v32) this.f;
            if (Integer.MIN_VALUE == v32Var.f4776b) {
                i2 = 0;
            } else {
                i2 = v32Var.i() - v32Var.f4776b;
            }
            this.e = i2 + b2;
        } else {
            this.e = ((v32) this.f).d(view);
        }
        this.f2779b = i;
    }

    public final void d(View view, int i) {
        int i2;
        v32 v32Var = (v32) this.f;
        if (Integer.MIN_VALUE == v32Var.f4776b) {
            i2 = 0;
        } else {
            i2 = v32Var.i() - v32Var.f4776b;
        }
        if (i2 >= 0) {
            c(view, i);
            return;
        }
        this.f2779b = i;
        if (this.c) {
            int f = (((v32) this.f).f() - i2) - ((v32) this.f).b(view);
            this.e = ((v32) this.f).f() - f;
            if (f > 0) {
                int c = this.e - ((v32) this.f).c(view);
                int h = ((v32) this.f).h();
                int min = c - (Math.min(((v32) this.f).d(view) - h, 0) + h);
                if (min < 0) {
                    this.e = Math.min(f, -min) + this.e;
                    return;
                }
                return;
            }
            return;
        }
        int d = ((v32) this.f).d(view);
        int h2 = d - ((v32) this.f).h();
        this.e = d;
        if (h2 > 0) {
            int f2 = (((v32) this.f).f() - Math.min(0, (((v32) this.f).f() - i2) - ((v32) this.f).b(view))) - (((v32) this.f).c(view) + d);
            if (f2 < 0) {
                this.e -= Math.min(h2, -f2);
            }
        }
    }

    public final boolean e(int i) {
        if (!this.c) {
            return false;
        }
        this.e -= i;
        this.c = false;
        this.d = true;
        return true;
    }

    public final void f() {
        switch (this.f2778a) {
            case 0:
                this.f2779b = -1;
                this.e = Integer.MIN_VALUE;
                this.c = false;
                this.d = false;
                return;
            default:
                this.c = false;
                this.d = false;
                return;
        }
    }

    public final void g(int i) {
        boolean z = true;
        cp3.m(!this.c);
        if (i != this.f2779b) {
            z = false;
        }
        this.c = z;
        if (z) {
            this.e = 3;
            this.d = false;
        }
    }

    public final String toString() {
        switch (this.f2778a) {
            case 0:
                return "AnchorInfo{mPosition=" + this.f2779b + ", mCoordinate=" + this.e + ", mLayoutFromEnd=" + this.c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public jk1() {
        f();
    }
}
