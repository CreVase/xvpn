package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class i0 extends kh3 {

    /* renamed from: a, reason: collision with root package name */
    public int f2508a = 2;

    /* renamed from: b, reason: collision with root package name */
    public Object f2509b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        Object next;
        int i = this.f2508a;
        if (i != 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int x = hx2.x(i);
            if (x == 0) {
                return true;
            }
            if (x == 2) {
                return false;
            }
            this.f2508a = 4;
            ve1 ve1Var = (ve1) this;
            int i2 = ve1Var.c;
            Object obj = ve1Var.e;
            Iterator it = ve1Var.d;
            switch (i2) {
                case 0:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((t62) obj).apply(next)) {
                            break;
                        }
                    }
                    ve1Var.f2508a = 3;
                    next = null;
                    break;
                default:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((nr2) obj).c.contains(next)) {
                            break;
                        }
                    }
                    ve1Var.f2508a = 3;
                    next = null;
                    break;
            }
            this.f2509b = next;
            if (this.f2508a != 3) {
                this.f2508a = 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f2508a = 2;
            Object obj = this.f2509b;
            this.f2509b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
