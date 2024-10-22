package defpackage;

/* loaded from: classes.dex */
public enum uj1 {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    public final boolean a(uj1 uj1Var) {
        if (compareTo(uj1Var) >= 0) {
            return true;
        }
        return false;
    }
}
