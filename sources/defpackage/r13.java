package defpackage;

/* loaded from: classes.dex */
public abstract class r13 {

    /* renamed from: b, reason: collision with root package name */
    public xa3 f4090b;
    public fv0 c;
    public d22 d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;

    /* renamed from: a, reason: collision with root package name */
    public final tp f4089a = new tp();
    public uy0 j = new uy0(1, 0);

    public void a(long j) {
        this.g = j;
    }

    public abstract long b(r42 r42Var);

    public abstract boolean c(r42 r42Var, long j, uy0 uy0Var);

    public void d(boolean z) {
        int i = 1;
        if (z) {
            this.j = new uy0(i, 0);
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
