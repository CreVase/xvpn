package defpackage;

/* loaded from: classes2.dex */
public abstract class bu {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f528a;

    static {
        Object pk2Var;
        try {
            pk2Var = Class.forName("java.lang.ClassValue");
        } catch (Throwable th) {
            pk2Var = new pk2(th);
        }
        if (!(pk2Var instanceof pk2)) {
            pk2Var = Boolean.TRUE;
        }
        Object obj = Boolean.FALSE;
        if (pk2Var instanceof pk2) {
            pk2Var = obj;
        }
        f528a = ((Boolean) pk2Var).booleanValue();
    }
}
