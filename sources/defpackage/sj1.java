package defpackage;

/* loaded from: classes.dex */
public abstract /* synthetic */ class sj1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4355a;

    static {
        int[] iArr = new int[tj1.values().length];
        try {
            iArr[tj1.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tj1.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tj1.ON_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[tj1.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[tj1.ON_RESUME.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[tj1.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[tj1.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f4355a = iArr;
    }
}
