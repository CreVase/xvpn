package defpackage;

/* loaded from: classes2.dex */
public enum r12 implements qd1 {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private static final rd1 internalValueMap = new rd1() { // from class: p12
        @Override // defpackage.rd1
        public r12 findValueByNumber(int i) {
            return r12.forNumber(i);
        }
    };
    private final int value;

    r12(int i) {
        this.value = i;
    }

    public static r12 forNumber(int i) {
        if (i != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static rd1 internalGetValueMap() {
        return internalValueMap;
    }

    public static sd1 internalGetVerifier() {
        return q12.INSTANCE;
    }

    @Override // defpackage.qd1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static r12 valueOf(int i) {
        return forNumber(i);
    }
}
