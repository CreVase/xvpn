package defpackage;

/* loaded from: classes2.dex */
public final class ni3 {
    private ni3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleFourBytes(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) throws he1 {
        if (!isNotTrailingByte(b3)) {
            if ((((b3 + 112) + (b2 << 28)) >> 30) == 0 && !isNotTrailingByte(b4) && !isNotTrailingByte(b5)) {
                int trailingByteValue = ((b2 & 7) << 18) | (trailingByteValue(b3) << 12) | (trailingByteValue(b4) << 6) | trailingByteValue(b5);
                cArr[i] = highSurrogate(trailingByteValue);
                cArr[i + 1] = lowSurrogate(trailingByteValue);
                return;
            }
        }
        throw he1.invalidUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleOneByte(byte b2, char[] cArr, int i) {
        cArr[i] = (char) b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleThreeBytes(byte b2, byte b3, byte b4, char[] cArr, int i) throws he1 {
        if (!isNotTrailingByte(b3) && ((b2 != -32 || b3 >= -96) && ((b2 != -19 || b3 < -96) && !isNotTrailingByte(b4)))) {
            cArr[i] = (char) (((b2 & 15) << 12) | (trailingByteValue(b3) << 6) | trailingByteValue(b4));
            return;
        }
        throw he1.invalidUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleTwoBytes(byte b2, byte b3, char[] cArr, int i) throws he1 {
        if (b2 >= -62 && !isNotTrailingByte(b3)) {
            cArr[i] = (char) (((b2 & 31) << 6) | trailingByteValue(b3));
            return;
        }
        throw he1.invalidUtf8();
    }

    private static char highSurrogate(int i) {
        return (char) ((i >>> 10) + 55232);
    }

    private static boolean isNotTrailingByte(byte b2) {
        return b2 > -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isOneByte(byte b2) {
        return b2 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isThreeBytes(byte b2) {
        return b2 < -16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isTwoBytes(byte b2) {
        return b2 < -32;
    }

    private static char lowSurrogate(int i) {
        return (char) ((i & 1023) + 56320);
    }

    private static int trailingByteValue(byte b2) {
        return b2 & 63;
    }
}
