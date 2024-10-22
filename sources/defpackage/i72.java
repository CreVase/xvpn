package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class i72 extends m51 {
    private static final i72 DEFAULT_INSTANCE;
    private static volatile t42 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private xp1 preferences_ = xp1.f5200b;

    static {
        i72 i72Var = new i72();
        DEFAULT_INSTANCE = i72Var;
        m51.h(i72.class, i72Var);
    }

    public static xp1 j(i72 i72Var) {
        xp1 xp1Var = i72Var.preferences_;
        if (!xp1Var.f5201a) {
            i72Var.preferences_ = xp1Var.c();
        }
        return i72Var.preferences_;
    }

    public static g72 l() {
        return (g72) ((g51) DEFAULT_INSTANCE.d(l51.NEW_BUILDER));
    }

    public static i72 m(FileInputStream fileInputStream) {
        i72 i72Var = DEFAULT_INSTANCE;
        n10 n10Var = new n10(fileInputStream);
        yu0 a2 = yu0.a();
        m51 m51Var = (m51) i72Var.d(l51.NEW_MUTABLE_INSTANCE);
        try {
            ka2 ka2Var = ka2.c;
            ka2Var.getClass();
            mn2 a3 = ka2Var.a(m51Var.getClass());
            p10 p10Var = n10Var.d;
            if (p10Var == null) {
                p10Var = new p10(n10Var);
            }
            a3.a(m51Var, p10Var, a2);
            a3.makeImmutable(m51Var);
            if (m51Var.g()) {
                return (i72) m51Var;
            }
            throw new ie1(new ju0().getMessage());
        } catch (IOException e) {
            if (e.getCause() instanceof ie1) {
                throw ((ie1) e.getCause());
            }
            throw new ie1(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof ie1) {
                throw ((ie1) e2.getCause());
            }
            throw e2;
        }
    }

    @Override // defpackage.m51
    public final Object d(l51 l51Var) {
        switch (l51Var) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new og2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", h72.f2378a});
            case NEW_MUTABLE_INSTANCE:
                return new i72();
            case NEW_BUILDER:
                return new g72();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                t42 t42Var = PARSER;
                if (t42Var == null) {
                    synchronized (i72.class) {
                        try {
                            t42Var = PARSER;
                            if (t42Var == null) {
                                t42Var = new i51();
                                PARSER = t42Var;
                            }
                        } finally {
                        }
                    }
                }
                return t42Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map k() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
