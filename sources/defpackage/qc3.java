package defpackage;

/* loaded from: classes.dex */
public final class qc3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3981a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3982b;
    public final int c;
    public int d;
    public String e;

    public qc3(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    public final void a() {
        int i;
        int i2 = this.d;
        if (i2 == Integer.MIN_VALUE) {
            i = this.f3982b;
        } else {
            i = i2 + this.c;
        }
        this.d = i;
        this.e = this.f3981a + this.d;
    }

    public final void b() {
        if (this.d != Integer.MIN_VALUE) {
        } else {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public qc3(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.f3981a = str;
        this.f3982b = i2;
        this.c = i3;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }
}
