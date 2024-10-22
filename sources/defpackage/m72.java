package defpackage;

/* loaded from: classes.dex */
public final class m72 extends m51 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final m72 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile t42 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        m72 m72Var = new m72();
        DEFAULT_INSTANCE = m72Var;
        m51.h(m72.class, m72Var);
    }

    public static void i(m72 m72Var, long j) {
        m72Var.valueCase_ = 4;
        m72Var.value_ = Long.valueOf(j);
    }

    public static void j(m72 m72Var, String str) {
        m72Var.getClass();
        str.getClass();
        m72Var.valueCase_ = 5;
        m72Var.value_ = str;
    }

    public static void k(m72 m72Var, j72 j72Var) {
        m72Var.getClass();
        m72Var.value_ = j72Var.a();
        m72Var.valueCase_ = 6;
    }

    public static void l(m72 m72Var, double d) {
        m72Var.valueCase_ = 7;
        m72Var.value_ = Double.valueOf(d);
    }

    public static void n(m72 m72Var, boolean z) {
        m72Var.valueCase_ = 1;
        m72Var.value_ = Boolean.valueOf(z);
    }

    public static void o(m72 m72Var, float f) {
        m72Var.valueCase_ = 2;
        m72Var.value_ = Float.valueOf(f);
    }

    public static void p(m72 m72Var, int i) {
        m72Var.valueCase_ = 3;
        m72Var.value_ = Integer.valueOf(i);
    }

    public static m72 r() {
        return DEFAULT_INSTANCE;
    }

    public static l72 z() {
        return (l72) ((g51) DEFAULT_INSTANCE.d(l51.NEW_BUILDER));
    }

    @Override // defpackage.m51
    public final Object d(l51 l51Var) {
        switch (l51Var) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new og2(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", k72.class});
            case NEW_MUTABLE_INSTANCE:
                return new m72();
            case NEW_BUILDER:
                return new l72();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                t42 t42Var = PARSER;
                if (t42Var == null) {
                    synchronized (m72.class) {
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

    public final boolean q() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double s() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float t() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int u() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long v() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String w() {
        if (this.valueCase_ == 5) {
            return (String) this.value_;
        }
        return "";
    }

    public final k72 x() {
        if (this.valueCase_ == 6) {
            return (k72) this.value_;
        }
        return k72.k();
    }

    public final int y() {
        switch (this.valueCase_) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }
}
