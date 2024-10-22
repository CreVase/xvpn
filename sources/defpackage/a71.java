package defpackage;

/* loaded from: classes.dex */
public final class a71 {

    /* renamed from: a, reason: collision with root package name */
    public final xa3 f34a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f35b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;

    public a71(xa3 xa3Var) {
        this.f34a = xa3Var;
    }

    public final void a(int i, byte[] bArr, int i2) {
        boolean z;
        if (this.c) {
            int i3 = this.f;
            int i4 = (i + 1) - i3;
            if (i4 < i2) {
                if (((bArr[i4] & 192) >> 6) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.d = z;
                this.c = false;
                return;
            }
            this.f = (i2 - i) + i3;
        }
    }
}
