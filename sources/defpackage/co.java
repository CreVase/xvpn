package defpackage;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class co {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f672a;

    static {
        int[] iArr = new int[tj1.values().length];
        f672a = iArr;
        try {
            iArr[tj1.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f672a[tj1.ON_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f672a[tj1.ON_RESUME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f672a[tj1.ON_DESTROY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
