package defpackage;

/* loaded from: classes.dex */
public final class xu2 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5226a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5227b;

    public xu2(v31 v31Var) {
        this.f5227b = v31Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i = this.f5226a;
        Object obj = this.f5227b;
        switch (i) {
            case 0:
                zu2 zu2Var = (zu2) obj;
                zu2Var.getClass();
                do {
                    try {
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                } while (zu2Var.g());
                return;
            default:
                ((v31) obj).invoke();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu2(zu2 zu2Var) {
        super("ExoPlayer:SimpleDecoder");
        this.f5227b = zu2Var;
    }
}
