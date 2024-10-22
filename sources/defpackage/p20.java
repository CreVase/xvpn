package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class p20 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f3768a;

    /* renamed from: b, reason: collision with root package name */
    public int f3769b;
    public int c;
    public final /* synthetic */ s20 d;

    public p20(s20 s20Var) {
        int i;
        this.d = s20Var;
        this.f3768a = s20Var.e;
        if (s20Var.isEmpty()) {
            i = -1;
        } else {
            i = 0;
        }
        this.f3769b = i;
        this.c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3769b >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object l;
        s20 s20Var = this.d;
        if (s20Var.e == this.f3768a) {
            if (hasNext()) {
                int i = this.f3769b;
                this.c = i;
                n20 n20Var = (n20) this;
                int i2 = n20Var.e;
                s20 s20Var2 = n20Var.f;
                switch (i2) {
                    case 0:
                        l = s20Var2.d(i);
                        break;
                    case 1:
                        l = new q20(s20Var2, i);
                        break;
                    default:
                        l = s20Var2.l(i);
                        break;
                }
                int i3 = this.f3769b + 1;
                if (i3 >= s20Var.f) {
                    i3 = -1;
                }
                this.f3769b = i3;
                return l;
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        s20 s20Var = this.d;
        if (s20Var.e == this.f3768a) {
            if (this.c >= 0) {
                z = true;
            } else {
                z = false;
            }
            cp3.n("no calls to next() since the last call to remove()", z);
            this.f3768a += 32;
            s20Var.remove(s20Var.d(this.c));
            this.f3769b--;
            this.c = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
