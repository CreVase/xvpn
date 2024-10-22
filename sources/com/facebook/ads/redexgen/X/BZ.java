package com.facebook.ads.redexgen.X;

import android.util.Pair;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class BZ {
    public static byte[] A00;
    public static String[] A01 = {"", "PlMS0jkvO9vM5P9u90Ds4f1TdgxD3Thw", "", "l", "pH03IupWUvAV01", "AaMD9RuQcbEx2RDlcaNkwISY5", "CN9ykJnxtHUTm8if1f3f2dcU", "LBX0HYPzD8"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static long A00(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Pair<Long, Long> A01(BJ<?> bj) {
        Map<String, String> AE5 = bj.AE5();
        if (AE5 == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(A00(AE5, A02(0, 24, 56))), Long.valueOf(A00(AE5, A02(24, 25, 22))));
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 110);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {-14, 15, 9, 11, 20, 25, 11, -22, 27, 24, 7, 26, 15, 21, 20, -8, 11, 19, 7, 15, 20, 15, 20, 13, -44, -16, -27, -3, -26, -27, -25, -17, -56, -7, -10, -27, -8, -19, -13, -14, -42, -23, -15, -27, -19, -14, -19, -14, -21};
        String[] strArr = A01;
        if (strArr[4].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A01[1] = "ypeOQlh2OkKl5SxmyCjdjAc832M2Y7KR";
        A00 = bArr;
    }

    static {
        A03();
    }
}
