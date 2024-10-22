package defpackage;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f0a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1b;
    public final String c;

    public /* synthetic */ a(int i, int i2, String str) {
        this.f0a = i;
        this.f1b = i2;
        this.c = str;
    }

    public static a a(r42 r42Var) {
        String str;
        r42Var.H(2);
        int v = r42Var.v();
        int i = v >> 1;
        int v2 = ((r42Var.v() >> 3) & 31) | ((v & 1) << 5);
        if (i != 4 && i != 5 && i != 7) {
            if (i == 8) {
                str = "hev1";
            } else if (i == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(".0");
        sb.append(i);
        if (v2 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(v2);
        return new a(i, v2, sb.toString());
    }
}
