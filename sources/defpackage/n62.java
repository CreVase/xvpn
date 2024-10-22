package defpackage;

/* loaded from: classes.dex */
public final class n62 extends m62 {
    public final Object d;

    public n62() {
        super(12, 1);
        this.d = new Object();
    }

    @Override // defpackage.m62
    public final Object a() {
        Object a2;
        synchronized (this.d) {
            a2 = super.a();
        }
        return a2;
    }

    @Override // defpackage.m62
    public final boolean b(Object obj) {
        boolean b2;
        synchronized (this.d) {
            b2 = super.b(obj);
        }
        return b2;
    }
}
