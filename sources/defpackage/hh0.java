package defpackage;

/* loaded from: classes2.dex */
public abstract class hh0 {

    /* renamed from: a, reason: collision with root package name */
    public static final vj0 f2423a;

    static {
        String str;
        boolean z;
        vj0 vj0Var;
        int i = d53.f1736a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            z = Boolean.parseBoolean(str);
        } else {
            z = false;
        }
        if (!z) {
            vj0Var = gh0.i;
        } else {
            qi0 qi0Var = vl0.f4854a;
            r90 r90Var = zo1.f5522a;
            h71 h71Var = ((h71) r90Var).e;
            if (!(r90Var instanceof vj0)) {
                vj0Var = gh0.i;
            } else {
                vj0Var = (vj0) r90Var;
            }
        }
        f2423a = vj0Var;
    }
}
