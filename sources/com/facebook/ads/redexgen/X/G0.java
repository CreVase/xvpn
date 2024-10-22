package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network.dex */
public final class G0 {
    public static byte[] A02;
    public static String[] A03 = {"o6dtQbEX6DUU2ZPrt5fMpvPTiwhNIFVw", "", "MFXGqw4wC6wJal5", "uC7LPUo8IknDiYQWYNCx", "R0uPVJBemfZgswV0fGveV9P1kI7oDQdd", "Ua883bT78DPlxnLPMdUDySsZEoLcqfDA", "dE9C57ZljM4PWQ1xUFFc", "KkKO0GZU5SD8UwtXdKEVEJnvfx0O6Fgr"};
    public static final Pattern A04;
    public final C0420Hh A00 = new C0420Hh();
    public final StringBuilder A01 = new StringBuilder();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 6);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A02 = new byte[]{119, -114, -93, -114, -114, -73, -55, -71, 85, -81, -127, -36, -37, -10, -17, -23, -29, -27, -67, -94, -88, -37, -34, -94, -35, -86, -87, -94, -36, -35, Byte.MIN_VALUE, Byte.MAX_VALUE, -127, -119, -123, -112, -115, -109, -116, -126, 75, -127, -115, -118, -115, -112, -72, -59, -62, -70, -97, -85, -88, -85, -82, 123, -124, -125, -119, 66, 123, 118, -126, 126, -127, -114, -90, -81, -82, -76, 109, -77, -76, -71, -84, -91, -74, -65, -66, -60, 125, -57, -75, -71, -73, -72, -60, -36, -25, -44, -33, -36, -42, -33, -48, -29, -33, -104, -49, -48, -50, -38, -35, -52, -33, -44, -38, -39, -80, -87, -97, -96, -83, -89, -92, -87, -96, -103, -124};
    }

    static {
        A07();
        A04 = Pattern.compile(A01(11, 19, 122));
    }

    public static char A00(C0420Hh c0420Hh, int i) {
        return (char) c0420Hh.A00[i];
    }

    public static String A02(C0420Hh c0420Hh) {
        int limit = c0420Hh.A06();
        int A07 = c0420Hh.A07();
        char c = 0;
        while (limit < A07 && c == 0) {
            int i = limit + 1;
            int position = c0420Hh.A00[limit];
            int limit2 = (char) position;
            c = limit2 == 41 ? (char) 1 : (char) 0;
            limit = i;
        }
        int position2 = c0420Hh.A06();
        return c0420Hh.A0S((limit - 1) - position2).trim();
    }

    public static String A03(C0420Hh c0420Hh, StringBuilder sb) {
        sb.setLength(0);
        int A06 = c0420Hh.A06();
        int A07 = c0420Hh.A07();
        boolean z = false;
        while (A06 < A07 && !z) {
            int position = c0420Hh.A00[A06];
            char c = (char) position;
            if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                A06++;
                sb.append(c);
            } else {
                z = true;
            }
        }
        int position2 = c0420Hh.A06();
        c0420Hh.A0Z(A06 - position2);
        return sb.toString();
    }

    public static String A04(C0420Hh c0420Hh, StringBuilder sb) {
        A0A(c0420Hh);
        if (c0420Hh.A04() == 0) {
            return null;
        }
        String A032 = A03(c0420Hh, sb);
        String A01 = A01(0, 0, 115);
        if (!A01.equals(A032)) {
            return A032;
        }
        String identifier = A01 + ((char) c0420Hh.A0E());
        return identifier;
    }

    public static String A05(C0420Hh c0420Hh, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int A06 = c0420Hh.A06();
            String token = A04(c0420Hh, sb);
            if (token == null) {
                return null;
            }
            if (A01(118, 1, 1).equals(token) || A01(8, 1, 20).equals(token)) {
                c0420Hh.A0Y(A06);
                z = true;
            } else {
                sb2.append(token);
            }
        }
        return sb2.toString();
    }

    public static String A06(C0420Hh c0420Hh, StringBuilder sb) {
        A0A(c0420Hh);
        if (c0420Hh.A04() < 5) {
            return null;
        }
        String A0S = c0420Hh.A0S(5);
        String cueSelector = A01(3, 5, 78);
        if (!cueSelector.equals(A0S)) {
            return null;
        }
        int A06 = c0420Hh.A06();
        String token = A04(c0420Hh, sb);
        if (token == null) {
            return null;
        }
        String cueSelector2 = A01(117, 1, 24);
        if (cueSelector2.equals(token)) {
            c0420Hh.A0Y(A06);
            String cueSelector3 = A01(0, 0, 115);
            return cueSelector3;
        }
        String target = null;
        String cueSelector4 = A01(0, 1, 73);
        if (cueSelector4.equals(token)) {
            target = A02(c0420Hh);
        }
        String token2 = A04(c0420Hh, sb);
        String cueSelector5 = A01(1, 1, 95);
        if (!cueSelector5.equals(token2) || token2 == null) {
            return null;
        }
        return target;
    }

    private void A08(G4 g4, String str) {
        if (A01(0, 0, 115).equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        String[] strArr = A03;
        String str2 = strArr[6];
        String str3 = strArr[3];
        int length = str2.length();
        int voiceStartIndex = str3.length();
        if (length != voiceStartIndex) {
            throw new RuntimeException();
        }
        A03[2] = "CW487BEDmC1UFYo";
        if (indexOf != -1) {
            Matcher matcher = A04.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                g4.A0K(matcher.group(1));
            }
            str = str.substring(0, indexOf);
        }
        String[] A0l = C0436Hx.A0l(str, A01(9, 2, 77));
        String str4 = A0l[0];
        int indexOf2 = str4.indexOf(35);
        if (indexOf2 != -1) {
            g4.A0J(str4.substring(0, indexOf2));
            int voiceStartIndex2 = indexOf2 + 1;
            g4.A0I(str4.substring(voiceStartIndex2));
        } else {
            g4.A0J(str4);
        }
        int voiceStartIndex3 = A0l.length;
        if (voiceStartIndex3 > 1) {
            int voiceStartIndex4 = A0l.length;
            g4.A0L((String[]) Arrays.copyOfRange(A0l, 1, voiceStartIndex4));
        }
    }

    public static void A09(C0420Hh c0420Hh) {
        String line;
        do {
            line = c0420Hh.A0P();
        } while (!TextUtils.isEmpty(line));
    }

    public static void A0A(C0420Hh c0420Hh) {
        boolean skipping = true;
        while (c0420Hh.A04() > 0 && skipping) {
            boolean skipping2 = A0D(c0420Hh);
            if (!skipping2) {
                boolean skipping3 = A0C(c0420Hh);
                if (!skipping3) {
                    skipping = false;
                }
            }
            skipping = true;
        }
    }

    public static void A0B(C0420Hh c0420Hh, G4 g4, StringBuilder sb) {
        A0A(c0420Hh);
        String A032 = A03(c0420Hh, sb);
        String A01 = A01(0, 0, 115);
        if (A01.equals(A032)) {
            return;
        }
        String A012 = A01(2, 1, 99);
        String property = A04(c0420Hh, sb);
        if (!A012.equals(property)) {
            return;
        }
        A0A(c0420Hh);
        String A05 = A05(c0420Hh, sb);
        if (A05 == null || A01.equals(A05)) {
            return;
        }
        int A06 = c0420Hh.A06();
        String A042 = A04(c0420Hh, sb);
        String[] strArr = A03;
        String str = strArr[4];
        String value = strArr[7];
        int position = str.charAt(25);
        if (position != value.charAt(25)) {
            A03[2] = "4K4C1V7x7MHXc7r";
            String property2 = A01(8, 1, 20);
            if (!property2.equals(A042)) {
                String property3 = A03[2];
                int position2 = property3.length();
                if (position2 != 15) {
                    String property4 = A01(118, 1, 1);
                    if (!property4.equals(A042)) {
                        return;
                    }
                } else {
                    A03[2] = "7FFtYIqbw4CKtyv";
                    String property5 = A01(118, 1, 1);
                    if (!property5.equals(A042)) {
                        return;
                    }
                }
                c0420Hh.A0Y(A06);
            }
            String property6 = A01(50, 5, 54);
            if (property6.equals(A032)) {
                g4.A0C(HN.A02(A05));
                return;
            }
            String property7 = A01(30, 16, 24);
            if (property7.equals(A032)) {
                g4.A0B(HN.A02(A05));
                return;
            }
            String property8 = A01(93, 15, 101);
            if (!property8.equals(A032)) {
                String property9 = A01(55, 11, 15);
                if (property9.equals(A032)) {
                    g4.A0D(A05);
                    return;
                }
                String property10 = A01(76, 11, 74);
                if (property10.equals(A032)) {
                    String property11 = A01(46, 4, 80);
                    if (!property11.equals(A05)) {
                        return;
                    }
                    g4.A0E(true);
                    return;
                }
                String property12 = A01(66, 10, 58);
                if (!property12.equals(A032)) {
                    return;
                }
                String property13 = A01(87, 6, 109);
                if (!property13.equals(A05)) {
                    return;
                }
                g4.A0F(true);
                return;
            }
            String[] strArr2 = A03;
            String str2 = strArr2[6];
            String property14 = strArr2[3];
            int position3 = str2.length();
            if (position3 == property14.length()) {
                String[] strArr3 = A03;
                strArr3[6] = "4EBATBo3G3iJZ8CvpiMB";
                strArr3[3] = "oi6BgvCdqkOJFnhZ1QlM";
                String property15 = A01(108, 9, 53);
                if (!property15.equals(A05)) {
                    return;
                }
                g4.A0G(true);
                return;
            }
        }
        throw new RuntimeException();
    }

    public static boolean A0C(C0420Hh c0420Hh) {
        int position = c0420Hh.A06();
        int limit = c0420Hh.A07();
        byte[] bArr = c0420Hh.A00;
        if (position + 2 > limit) {
            return false;
        }
        int i = position + 1;
        if (bArr[position] != 47) {
            return false;
        }
        int i2 = i + 1;
        if (bArr[i] == 42) {
            while (i2 + 1 < limit) {
                int i3 = i2 + 1;
                char skippedChar = (char) bArr[i2];
                if (skippedChar == '*') {
                    char skippedChar2 = (char) bArr[i3];
                    if (skippedChar2 == '/') {
                        limit = i3 + 1;
                        i2 = limit;
                    }
                }
                i2 = i3;
            }
            c0420Hh.A0Z(limit - c0420Hh.A06());
            return true;
        }
        return false;
    }

    public static boolean A0D(C0420Hh c0420Hh) {
        switch (A00(c0420Hh, c0420Hh.A06())) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
                c0420Hh.A0Z(1);
                return true;
            default:
                return false;
        }
    }

    public final G4 A0E(C0420Hh c0420Hh) {
        this.A01.setLength(0);
        int A06 = c0420Hh.A06();
        A09(c0420Hh);
        C0420Hh c0420Hh2 = this.A00;
        byte[] bArr = c0420Hh.A00;
        int initialInputPosition = c0420Hh.A06();
        c0420Hh2.A0b(bArr, initialInputPosition);
        this.A00.A0Y(A06);
        String A062 = A06(this.A00, this.A01);
        if (A062 != null) {
            if (A01(117, 1, 24).equals(A04(this.A00, this.A01))) {
                G4 g4 = new G4();
                A08(g4, A062);
                String str = null;
                boolean z = false;
                while (A03[2].length() == 15) {
                    String[] strArr = A03;
                    strArr[0] = "u1M5SbGaD18kT3mlqswMZWeIcd6Kf1Bl";
                    strArr[5] = "tCvfJbvExhfaq7uM8GkpPqKnHxthSgb1";
                    String A01 = A01(118, 1, 1);
                    if (!z) {
                        int A063 = this.A00.A06();
                        str = A04(this.A00, this.A01);
                        z = str == null || A01.equals(str);
                        if (!z) {
                            this.A00.A0Y(A063);
                            A0B(this.A00, g4, this.A01);
                        }
                    } else {
                        if (A01.equals(str)) {
                            return g4;
                        }
                        return null;
                    }
                }
                throw new RuntimeException();
            }
        }
        return null;
    }
}
