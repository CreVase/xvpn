package defpackage;

/* loaded from: classes.dex */
public final class rj1 {
    public static tj1 a(uj1 uj1Var) {
        int ordinal = uj1Var.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    return null;
                }
                return tj1.ON_PAUSE;
            }
            return tj1.ON_STOP;
        }
        return tj1.ON_DESTROY;
    }

    public static tj1 b(uj1 uj1Var) {
        int ordinal = uj1Var.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    return null;
                }
                return tj1.ON_RESUME;
            }
            return tj1.ON_START;
        }
        return tj1.ON_CREATE;
    }
}
