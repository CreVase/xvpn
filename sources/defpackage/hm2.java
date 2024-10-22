package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class hm2 extends im2 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public fm2 f2450a;

    /* renamed from: b, reason: collision with root package name */
    public fm2 f2451b;

    public hm2(fm2 fm2Var, fm2 fm2Var2) {
        this.f2450a = fm2Var2;
        this.f2451b = fm2Var;
    }

    @Override // defpackage.im2
    public final void a(fm2 fm2Var) {
        fm2 fm2Var2;
        if (this.f2450a == fm2Var && fm2Var == this.f2451b) {
            this.f2451b = null;
            this.f2450a = null;
        }
        fm2 fm2Var3 = this.f2450a;
        if (fm2Var3 == fm2Var) {
            switch (((em2) this).c) {
                case 0:
                    fm2Var2 = fm2Var3.d;
                    break;
                default:
                    fm2Var2 = fm2Var3.c;
                    break;
            }
            this.f2450a = fm2Var2;
        }
        if (this.f2451b == fm2Var) {
            this.f2451b = b();
        }
    }

    public final fm2 b() {
        fm2 fm2Var = this.f2451b;
        fm2 fm2Var2 = this.f2450a;
        if (fm2Var != fm2Var2 && fm2Var2 != null) {
            switch (((em2) this).c) {
                case 0:
                    return fm2Var.c;
                default:
                    return fm2Var.d;
            }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2451b != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        fm2 fm2Var = this.f2451b;
        this.f2451b = b();
        return fm2Var;
    }
}
