package defpackage;

import java.util.Collections;

/* loaded from: classes.dex */
public final class yu0 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile yu0 f5389a;

    /* renamed from: b, reason: collision with root package name */
    public static final yu0 f5390b;

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        f5390b = new yu0();
    }

    public yu0() {
        Collections.emptyMap();
    }

    public static yu0 a() {
        yu0 yu0Var = f5389a;
        if (yu0Var == null) {
            synchronized (yu0.class) {
                yu0Var = f5389a;
                if (yu0Var == null) {
                    Class cls = uu0.f4740a;
                    if (cls != null) {
                        try {
                            yu0Var = (yu0) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                        f5389a = yu0Var;
                    }
                    yu0Var = f5390b;
                    f5389a = yu0Var;
                }
            }
        }
        return yu0Var;
    }
}
