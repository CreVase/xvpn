package defpackage;

/* loaded from: classes2.dex */
public final class sw {

    /* renamed from: a, reason: collision with root package name */
    public static final sw f4422a = new sw();

    /* renamed from: b, reason: collision with root package name */
    public static final gg f4423b = new gg();
    public static int c;
    public static final int d;

    static {
        Object pk2Var;
        int i;
        try {
            pk2Var = g23.P0(System.getProperty("kotlinx.serialization.json.pool.size"));
        } catch (Throwable th) {
            pk2Var = new pk2(th);
        }
        if (pk2Var instanceof pk2) {
            pk2Var = null;
        }
        Integer num = (Integer) pk2Var;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 1048576;
        }
        d = i;
    }
}
