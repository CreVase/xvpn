package defpackage;

/* loaded from: classes.dex */
public final class og2 implements uv1 {

    /* renamed from: a, reason: collision with root package name */
    public final i1 f3658a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3659b;
    public final Object[] c;
    public final int d;

    public og2(m51 m51Var, String str, Object[] objArr) {
        this.f3658a = m51Var;
        this.f3659b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            } else {
                this.d = i | (charAt2 << i3);
                return;
            }
        }
    }

    public final i1 a() {
        return this.f3658a;
    }

    public final Object[] b() {
        return this.c;
    }

    public final String c() {
        return this.f3659b;
    }

    public final int d() {
        if ((this.d & 1) == 1) {
            return 1;
        }
        return 2;
    }
}
