package defpackage;

/* loaded from: classes.dex */
public final class tl1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4526a;

    /* renamed from: b, reason: collision with root package name */
    public u93 f4527b = new u93(5);
    public boolean c;
    public boolean d;

    public tl1(Object obj) {
        this.f4526a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tl1.class == obj.getClass()) {
            return this.f4526a.equals(((tl1) obj).f4526a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4526a.hashCode();
    }
}
