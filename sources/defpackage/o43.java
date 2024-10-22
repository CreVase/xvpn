package defpackage;

/* loaded from: classes2.dex */
public enum o43 implements qd1 {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final rd1 internalValueMap = new rd1() { // from class: m43
        @Override // defpackage.rd1
        public o43 findValueByNumber(int i) {
            return o43.forNumber(i);
        }
    };
    private final int value;

    o43(int i) {
        this.value = i;
    }

    public static o43 forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return SYNTAX_PROTO3;
        }
        return SYNTAX_PROTO2;
    }

    public static rd1 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd1 internalGetVerifier() {
        return n43.INSTANCE;
    }

    @Override // defpackage.qd1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static o43 valueOf(int i) {
        return forNumber(i);
    }
}
