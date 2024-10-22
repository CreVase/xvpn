package defpackage;

/* loaded from: classes2.dex */
public final class gd0 {

    /* renamed from: a, reason: collision with root package name */
    public final rd2 f2238a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2239b;

    public gd0(rd2 rd2Var, boolean z) {
        this.f2238a = rd2Var;
        this.f2239b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gd0)) {
            return false;
        }
        gd0 gd0Var = (gd0) obj;
        if (!gd0Var.f2238a.equals(this.f2238a) || gd0Var.f2239b != this.f2239b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f2238a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f2239b).hashCode();
    }
}
