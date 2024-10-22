package defpackage;

import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class n0 extends o0 implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f3381a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3382b;
    public final int c;

    public n0(o0 o0Var, int i, int i2) {
        this.f3381a = o0Var;
        this.f3382b = i;
        int c = o0Var.c();
        if (i >= 0 && i2 <= c) {
            if (i <= i2) {
                this.c = i2 - i;
                return;
            }
            throw new IllegalArgumentException(hx2.n("fromIndex: ", i, " > toIndex: ", i2));
        }
        StringBuilder t = hx2.t("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
        t.append(c);
        throw new IndexOutOfBoundsException(t.toString());
    }

    @Override // defpackage.t
    public final int c() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        if (i >= 0 && i < i2) {
            return this.f3381a.get(this.f3382b + i);
        }
        throw new IndexOutOfBoundsException(hx2.n("index: ", i, ", size: ", i2));
    }
}
