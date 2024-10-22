package defpackage;

/* loaded from: classes2.dex */
public final class q12 implements sd1 {
    static final sd1 INSTANCE = new q12();

    private q12() {
    }

    @Override // defpackage.sd1
    public boolean isInRange(int i) {
        if (r12.forNumber(i) != null) {
            return true;
        }
        return false;
    }
}
