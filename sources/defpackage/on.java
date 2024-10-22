package defpackage;

/* loaded from: classes2.dex */
public final class on implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pn f3697b;

    public /* synthetic */ on(pn pnVar, int i) {
        this.f3696a = i;
        this.f3697b = pnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3696a;
        pn pnVar = this.f3697b;
        switch (i) {
            case 0:
                p71.x(pnVar.l(), 487);
                return;
            default:
                p71.x(pnVar.l(), 488);
                return;
        }
    }
}
