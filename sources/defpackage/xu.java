package defpackage;

/* loaded from: classes.dex */
public final class xu {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5222a;

    /* renamed from: b, reason: collision with root package name */
    public wu f5223b;
    public boolean c;

    public final void a(wu wuVar) {
        synchronized (this) {
            while (this.c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f5223b == wuVar) {
                return;
            }
            this.f5223b = wuVar;
            if (this.f5222a) {
                wuVar.b();
            }
        }
    }
}
