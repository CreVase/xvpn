package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public class o83 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3617b = AtomicIntegerFieldUpdater.newUpdater(o83.class, "_size");
    private volatile int _size;

    /* renamed from: a, reason: collision with root package name */
    public js0[] f3618a;

    public final void a(js0 js0Var) {
        js0Var.e((ks0) this);
        js0[] js0VarArr = this.f3618a;
        if (js0VarArr == null) {
            js0VarArr = new js0[4];
            this.f3618a = js0VarArr;
        } else if (b() >= js0VarArr.length) {
            js0VarArr = (js0[]) Arrays.copyOf(js0VarArr, b() * 2);
            this.f3618a = js0VarArr;
        }
        int b2 = b();
        f3617b.set(this, b2 + 1);
        js0VarArr[b2] = js0Var;
        js0Var.f2821b = b2;
        while (b2 > 0) {
            Object[] objArr = this.f3618a;
            int i = (b2 - 1) / 2;
            if (objArr[i].compareTo(objArr[b2]) <= 0) {
                return;
            }
            f(b2, i);
            b2 = i;
        }
    }

    public final int b() {
        return f3617b.get(this);
    }

    public final js0 c() {
        js0 js0Var;
        synchronized (this) {
            js0[] js0VarArr = this.f3618a;
            if (js0VarArr != null) {
                js0Var = js0VarArr[0];
            } else {
                js0Var = null;
            }
        }
        return js0Var;
    }

    public final void d(js0 js0Var) {
        synchronized (this) {
            if (js0Var.a() != null) {
                e(js0Var.f2821b);
            }
        }
    }

    public final js0 e(int i) {
        Object[] objArr = this.f3618a;
        f3617b.set(this, b() - 1);
        if (i < b()) {
            f(i, b());
            int i2 = (i - 1) / 2;
            if (i <= 0 || objArr[i].compareTo(objArr[i2]) >= 0) {
                while (true) {
                    int i3 = (i * 2) + 1;
                    if (i3 >= b()) {
                        break;
                    }
                    Object[] objArr2 = this.f3618a;
                    int i4 = i3 + 1;
                    if (i4 < b() && objArr2[i4].compareTo(objArr2[i3]) < 0) {
                        i3 = i4;
                    }
                    if (objArr2[i].compareTo(objArr2[i3]) <= 0) {
                        break;
                    }
                    f(i, i3);
                    i = i3;
                }
            } else {
                f(i, i2);
                while (i2 > 0) {
                    Object[] objArr3 = this.f3618a;
                    int i5 = (i2 - 1) / 2;
                    if (objArr3[i5].compareTo(objArr3[i2]) <= 0) {
                        break;
                    }
                    f(i2, i5);
                    i2 = i5;
                }
            }
        }
        js0 js0Var = objArr[b()];
        js0Var.e(null);
        js0Var.f2821b = -1;
        objArr[b()] = null;
        return js0Var;
    }

    public final void f(int i, int i2) {
        js0[] js0VarArr = this.f3618a;
        js0 js0Var = js0VarArr[i2];
        js0 js0Var2 = js0VarArr[i];
        js0VarArr[i] = js0Var;
        js0VarArr[i2] = js0Var2;
        js0Var.f2821b = i;
        js0Var2.f2821b = i2;
    }
}
