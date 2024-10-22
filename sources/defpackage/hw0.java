package defpackage;

/* loaded from: classes2.dex */
public final class hw0 implements sd1 {
    static final sd1 INSTANCE = new hw0();

    private hw0() {
    }

    @Override // defpackage.sd1
    public boolean isInRange(int i) {
        if (iw0.forNumber(i) != null) {
            return true;
        }
        return false;
    }
}
