package defpackage;

/* loaded from: classes2.dex */
public enum iw0 implements qd1 {
    CARDINALITY_UNKNOWN(0),
    CARDINALITY_OPTIONAL(1),
    CARDINALITY_REQUIRED(2),
    CARDINALITY_REPEATED(3),
    UNRECOGNIZED(-1);

    public static final int CARDINALITY_OPTIONAL_VALUE = 1;
    public static final int CARDINALITY_REPEATED_VALUE = 3;
    public static final int CARDINALITY_REQUIRED_VALUE = 2;
    public static final int CARDINALITY_UNKNOWN_VALUE = 0;
    private static final rd1 internalValueMap = new rd1() { // from class: gw0
        @Override // defpackage.rd1
        public iw0 findValueByNumber(int i) {
            return iw0.forNumber(i);
        }
    };
    private final int value;

    iw0(int i) {
        this.value = i;
    }

    public static iw0 forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return CARDINALITY_REPEATED;
                }
                return CARDINALITY_REQUIRED;
            }
            return CARDINALITY_OPTIONAL;
        }
        return CARDINALITY_UNKNOWN;
    }

    public static rd1 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd1 internalGetVerifier() {
        return hw0.INSTANCE;
    }

    @Override // defpackage.qd1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static iw0 valueOf(int i) {
        return forNumber(i);
    }
}
