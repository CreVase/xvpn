package defpackage;

import androidx.lifecycle.b;

/* loaded from: classes.dex */
public abstract class vl1 {

    /* renamed from: a, reason: collision with root package name */
    public final a22 f4856a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4857b;
    public int c = -1;
    public final /* synthetic */ b d;

    public vl1(b bVar, a22 a22Var) {
        this.d = bVar;
        this.f4856a = a22Var;
    }

    public final void c(boolean z) {
        int i;
        boolean z2;
        boolean z3;
        if (z == this.f4857b) {
            return;
        }
        this.f4857b = z;
        if (z) {
            i = 1;
        } else {
            i = -1;
        }
        b bVar = this.d;
        int i2 = bVar.c;
        bVar.c = i + i2;
        if (!bVar.d) {
            bVar.d = true;
            while (true) {
                try {
                    int i3 = bVar.c;
                    if (i2 == i3) {
                        break;
                    }
                    if (i2 == 0 && i3 > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i2 > 0 && i3 == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2) {
                        bVar.f();
                    } else if (z3) {
                        bVar.g();
                    }
                    i2 = i3;
                } finally {
                    bVar.d = false;
                }
            }
        }
        if (this.f4857b) {
            bVar.c(this);
        }
    }

    public void d() {
    }

    public boolean f(bk1 bk1Var) {
        return false;
    }

    public abstract boolean g();
}
