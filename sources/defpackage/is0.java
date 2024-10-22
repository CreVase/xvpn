package defpackage;

/* loaded from: classes2.dex */
public final class is0 extends js0 {
    public final uu c;
    public final /* synthetic */ ls0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is0(ls0 ls0Var, long j, vu vuVar) {
        super(j);
        this.d = ls0Var;
        this.c = vuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.e(this.d);
    }

    @Override // defpackage.js0
    public final String toString() {
        return super.toString() + this.c;
    }
}
