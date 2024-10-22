package defpackage;

/* loaded from: classes.dex */
public final class j32 extends tf3 {
    public final Throwable K;

    public j32(Throwable th) {
        this.K = th;
    }

    public final String toString() {
        return String.format("FAILURE (%s)", this.K.getMessage());
    }
}
