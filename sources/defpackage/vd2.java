package defpackage;

/* loaded from: classes2.dex */
public final class vd2 {
    public static final vd2 c = new vd2(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f4820a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4821b;

    public vd2(int i, int i2) {
        this.f4820a = i;
        this.f4821b = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(vd2.class.getSimpleName());
        sb.append("[position = ");
        sb.append(this.f4820a);
        sb.append(", length = ");
        return hx2.r(sb, this.f4821b, "]");
    }
}
