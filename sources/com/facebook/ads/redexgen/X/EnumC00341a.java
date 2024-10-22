package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A05' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.facebook.ads.redexgen.X.1a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class EnumC00341a {
    public static byte[] A01;
    public static final /* synthetic */ EnumC00341a[] A02;
    public static final EnumC00341a A03;
    public static final EnumC00341a A04;
    public static final EnumC00341a A05;
    public final String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{24, 23, 18, 27, 1, 14, 12, 27, 29, 31, 29, 22, 27, 3, 1, 28, 11, 10, 12, 3, 1, 22, 16, 18, 16, 27, 22, 119, 101, 98, 118, 105, 101, 119, Byte.MAX_VALUE, 112, 114, 101, 99, 97, 99, 104, 101};
    }

    static {
        A02();
        String A012 = A01(27, 16, 0);
        EnumC00341a enumC00341a = new EnumC00341a(A012, 0, A012);
        A05 = enumC00341a;
        String A013 = A01(13, 14, 115);
        EnumC00341a enumC00341a2 = new EnumC00341a(A013, 1, A013);
        A04 = enumC00341a2;
        String A014 = A01(0, 13, 126);
        EnumC00341a enumC00341a3 = new EnumC00341a(A014, 2, A014);
        A03 = enumC00341a3;
        A02 = new EnumC00341a[]{enumC00341a, enumC00341a2, enumC00341a3};
    }

    public EnumC00341a(String str, int i, String str2) {
        this.A00 = str2;
    }

    public static EnumC00341a A00(String str) {
        for (EnumC00341a enumC00341a : values()) {
            if (enumC00341a.A00.equalsIgnoreCase(str)) {
                return enumC00341a;
            }
        }
        return A03;
    }

    public static EnumC00341a valueOf(String str) {
        return (EnumC00341a) Enum.valueOf(EnumC00341a.class, str);
    }

    public static EnumC00341a[] values() {
        return (EnumC00341a[]) A02.clone();
    }
}
