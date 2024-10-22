package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class pp2 implements Iterator, qh1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3892a;

    /* renamed from: b, reason: collision with root package name */
    public int f3893b;
    public final /* synthetic */ mp2 c;

    public pp2(mp2 mp2Var, int i) {
        this.f3892a = i;
        if (i != 1) {
            this.c = mp2Var;
            this.f3893b = mp2Var.e();
        } else {
            this.c = mp2Var;
            this.f3893b = mp2Var.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3892a) {
            case 0:
                if (this.f3893b <= 0) {
                    return false;
                }
                return true;
            default:
                if (this.f3893b <= 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3892a;
        mp2 mp2Var = this.c;
        switch (i) {
            case 0:
                int e = mp2Var.e();
                int i2 = this.f3893b;
                this.f3893b = i2 - 1;
                return mp2Var.h(e - i2);
            default:
                int e2 = mp2Var.e();
                int i3 = this.f3893b;
                this.f3893b = i3 - 1;
                return mp2Var.f(e2 - i3);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3892a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
