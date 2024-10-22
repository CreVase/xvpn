package defpackage;

/* loaded from: classes2.dex */
public final class mb1 extends kh3 {

    /* renamed from: a, reason: collision with root package name */
    public final kh3 f3266a;

    /* renamed from: b, reason: collision with root package name */
    public kh3 f3267b = xe1.e;

    public mb1(nb1 nb1Var) {
        this.f3266a = ((hb1) nb1Var.d.values()).listIterator(0);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f3267b.hasNext() && !this.f3266a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f3267b.hasNext()) {
            this.f3267b = ((ab1) this.f3266a.next()).iterator();
        }
        return this.f3267b.next();
    }
}
