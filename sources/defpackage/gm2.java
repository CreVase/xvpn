package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class gm2 extends im2 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public fm2 f2281a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2282b = true;
    public final /* synthetic */ jm2 c;

    public gm2(jm2 jm2Var) {
        this.c = jm2Var;
    }

    @Override // defpackage.im2
    public final void a(fm2 fm2Var) {
        boolean z;
        fm2 fm2Var2 = this.f2281a;
        if (fm2Var == fm2Var2) {
            fm2 fm2Var3 = fm2Var2.d;
            this.f2281a = fm2Var3;
            if (fm2Var3 == null) {
                z = true;
            } else {
                z = false;
            }
            this.f2282b = z;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2282b) {
            if (this.c.f2792a != null) {
                return true;
            }
            return false;
        }
        fm2 fm2Var = this.f2281a;
        if (fm2Var != null && fm2Var.c != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        fm2 fm2Var;
        if (this.f2282b) {
            this.f2282b = false;
            this.f2281a = this.c.f2792a;
        } else {
            fm2 fm2Var2 = this.f2281a;
            if (fm2Var2 != null) {
                fm2Var = fm2Var2.c;
            } else {
                fm2Var = null;
            }
            this.f2281a = fm2Var;
        }
        return this.f2281a;
    }
}
