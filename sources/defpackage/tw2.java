package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class tw2 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f4586a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4587b;
    public Iterator c;
    public final /* synthetic */ iw2 d;

    public tw2(iw2 iw2Var) {
        this.d = iw2Var;
    }

    public final Iterator a() {
        if (this.c == null) {
            this.c = this.d.c.entrySet().iterator();
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f4586a + 1;
        iw2 iw2Var = this.d;
        if (i < iw2Var.f2662b.size()) {
            return true;
        }
        if (!iw2Var.c.isEmpty() && a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f4587b = true;
        int i = this.f4586a + 1;
        this.f4586a = i;
        iw2 iw2Var = this.d;
        if (i < iw2Var.f2662b.size()) {
            return (Map.Entry) iw2Var.f2662b.get(this.f4586a);
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f4587b) {
            this.f4587b = false;
            int i = iw2.g;
            iw2 iw2Var = this.d;
            iw2Var.c();
            if (this.f4586a < iw2Var.f2662b.size()) {
                int i2 = this.f4586a;
                this.f4586a = i2 - 1;
                iw2Var.p(i2);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
