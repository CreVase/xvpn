package defpackage;

/* loaded from: classes.dex */
public final class s1 extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4253a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(String str, int i) {
        super(str);
        this.f4253a = i;
    }

    private synchronized void a() {
    }

    private synchronized void b() {
    }

    private synchronized void c() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f4253a) {
            case 0:
                a();
                return this;
            case 1:
                b();
                return this;
            default:
                c();
                return this;
        }
    }
}
