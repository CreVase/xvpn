package defpackage;

/* loaded from: classes2.dex */
public final class xq0 implements vb1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5204a;

    public xq0(boolean z) {
        this.f5204a = z;
    }

    @Override // defpackage.vb1
    public final boolean a() {
        return this.f5204a;
    }

    @Override // defpackage.vb1
    public final g02 c() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.f5204a) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
