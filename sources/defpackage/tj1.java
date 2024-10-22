package defpackage;

/* loaded from: classes.dex */
public enum tj1 {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public static final rj1 Companion = new rj1();

    public final uj1 a() {
        switch (sj1.f4355a[ordinal()]) {
            case 1:
            case 2:
                return uj1.CREATED;
            case 3:
            case 4:
                return uj1.STARTED;
            case 5:
                return uj1.RESUMED;
            case 6:
                return uj1.DESTROYED;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
