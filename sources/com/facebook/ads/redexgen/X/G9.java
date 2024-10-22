package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network.dex */
public final class G9 {
    public static byte[] A01;
    public static String[] A02 = {"JYYG6mQudNNGYNEgDR02nAMcKzDjIK4P", "2FeNcZ4AMvklOu4dQ", "gTW6toOfk8MVsyPSs", "RutE2HgswW2Ba8ERBuDpKSxIcN55U9", "rp2dSjsGIei", "VbvhM5GUqSDZ5Gwz8nmiFAQ41xb0JLlL", "3r4p5hSJjLrlxa79edZPjpayqJig4NbN", "nYAJe"};
    public static final Pattern A03;
    public static final Pattern A04;
    public final StringBuilder A00 = new StringBuilder();

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{39, 124, 71, 101, 17, 30, 102, 114, 100, 119, 101, 17, 30, 102, 100, 100, 94, 66, 56, 31, 7, 16, 29, 24, 21, 81, 16, 29, 24, 22, 31, 28, 20, 31, 5, 81, 7, 16, 29, 4, 20, 75, 81, 25, 62, 38, 49, 60, 57, 52, 112, 49, 62, 51, 56, 63, 34, 112, 38, 49, 60, 37, 53, 106, 112, 81, 105, 107, 114, 114, 107, 108, 101, 34, 96, 99, 102, 34, 97, 119, 103, 34, 113, 103, 118, 118, 107, 108, 101, 56, 34, 105, 81, 83, 74, 74, 83, 84, 93, 26, 89, 79, 95, 26, 77, 83, 78, 82, 26, 88, 91, 94, 26, 82, 95, 91, 94, 95, 72, 0, 26, 15, 52, 49, 52, 53, 45, 52, 122, 57, 47, 63, 122, 41, 63, 46, 46, 51, 52, 61, 122, 21, 39, 32, 52, 54, 54, 1, 55, 39, 18, 35, 48, 49, 39, 48, 58, 65, 61, 79, 60, 88, 46, 90, 85, 45, 47, 90, 117, 45, 43, 43, 56, 90, 117, 45, 46, 90, 85, 45, 47, 46, 40, 44, 47, 57, 34, 106, 103, 98, 108, 101, 48, 60, 33, 109, 36, 76, 74, 65, 91, 74, 93, 24, 19, 25, 20, 7, 66, 99, 109, 100, 101, 120, 99, 100, 109, 42, Byte.MAX_VALUE, 100, 121, Byte.MAX_VALUE, 122, 122, 101, 120, 126, 111, 110, 42, 111, 100, 126, 99, 126, 115, 48, 42, 45, 44, 53, 56, 55, 62, 9, 0, 3, 17, 114, 119, 112, 123, 84, 76, 24, 28, 17, 17, 25, 16, 87, 91, 74, 73, 79, 80, 76, 86, 75, 86, 80, 81, 34, 57, 55, 56, 36, 58, 32, 51, 44, 29, 26, 15, 28, 26, 111, 74};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A0C(String str, String str2, G6 g6, List<G4> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            switch (charAt) {
                case '&':
                    int indexOf = str2.indexOf(59, i + 1);
                    int indexOf2 = str2.indexOf(32, i + 1);
                    if (indexOf == -1) {
                        indexOf = indexOf2;
                    } else if (indexOf2 != -1) {
                        indexOf = Math.min(indexOf, indexOf2);
                    }
                    if (indexOf == -1) {
                        spannableStringBuilder.append(charAt);
                        i++;
                        break;
                    } else {
                        A07(str2.substring(i + 1, indexOf), spannableStringBuilder);
                        if (indexOf == indexOf2) {
                            spannableStringBuilder.append((CharSequence) A03(1, 1, 17));
                        }
                        i = indexOf + 1;
                        break;
                    }
                case '<':
                    if (i + 1 < str2.length()) {
                        int i2 = i;
                        boolean z = str2.charAt(i2 + 1) == '/';
                        i = A01(str2, i2 + 1);
                        boolean z2 = str2.charAt(i + (-2)) == '/';
                        String substring = str2.substring((z ? 2 : 1) + i2, z2 ? i - 2 : i - 1);
                        String A042 = A04(substring);
                        if (A042 != null && A0E(A042)) {
                            if (!z) {
                                if (!z2) {
                                    arrayDeque.push(G7.A01(substring, spannableStringBuilder.length()));
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                while (!arrayDeque.isEmpty()) {
                                    G7 g7 = (G7) arrayDeque.pop();
                                    A0B(str, g7, spannableStringBuilder, list, arrayList);
                                    if (g7.A01.equals(A042)) {
                                        break;
                                    }
                                }
                                break;
                            }
                        }
                    } else {
                        i++;
                        break;
                    }
                    break;
                default:
                    spannableStringBuilder.append(charAt);
                    if (A02[6].charAt(12) == 'U') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A02;
                    strArr[0] = "1EgemSjEd6OX6IjZrpNfGkrOscE7SpVJ";
                    strArr[5] = "BPkE8PNmcvUgQGAm1QCgLjutlWPlJ3J2";
                    i++;
                    break;
            }
        }
        while (!arrayDeque.isEmpty()) {
            A0B(str, (G7) arrayDeque.pop(), spannableStringBuilder, list, arrayList);
        }
        A0B(str, G7.A00(), spannableStringBuilder, list, arrayList);
        g6.A0C(spannableStringBuilder);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final boolean A0G(C0420Hh c0420Hh, G6 g6, List<G4> list) {
        String A0P = c0420Hh.A0P();
        if (A0P == null) {
            return false;
        }
        Pattern pattern = A03;
        Matcher matcher = pattern.matcher(A0P);
        if (matcher.matches()) {
            return A0F(null, matcher, c0420Hh, g6, this.A00, list);
        }
        String A0P2 = c0420Hh.A0P();
        if (A0P2 == null) {
            return false;
        }
        Matcher matcher2 = pattern.matcher(A0P2);
        if (matcher2.matches()) {
            return A0F(A0P.trim(), matcher2, c0420Hh, g6, this.A00, list);
        }
        return false;
    }

    static {
        A05();
        A03 = Pattern.compile(A03(161, 26, 75));
        A04 = Pattern.compile(A03(3, 12, 0));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:            if (r3 != false) goto L12;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:            r0 = 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:            if (r3 != false) goto L12;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b8 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(java.lang.String r7) {
        /*
            int r0 = r7.hashCode()
            r6 = 2
            r5 = 1
            r4 = 0
            switch(r0) {
                case -1364013995: goto L39;
                case -1074341483: goto L6c;
                case 100571: goto L7d;
                case 109757538: goto La5;
                default: goto La;
            }
        La:
            r0 = -1
        Lb:
            switch(r0) {
                case 0: goto Lb7;
                case 1: goto Lb8;
                case 2: goto Lb8;
                case 3: goto Lb9;
                default: goto Le;
            }
        Le:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 43
            r1 = 22
            r0 = 29
            java.lang.String r0 = A03(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r3 = r0.toString()
            r2 = 141(0x8d, float:1.98E-43)
            r1 = 15
            r0 = 15
            java.lang.String r0 = A03(r2, r1, r0)
            android.util.Log.w(r0, r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            return r0
        L39:
            r2 = 197(0xc5, float:2.76E-43)
            r1 = 6
            r0 = 98
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r3 = r7.equals(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.G9.A02
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 5
            if (r1 == r0) goto L5d
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.G9.A02
            java.lang.String r1 = "DMfdGkOFUxynodxW9z1tlml8oHZW88"
            r0 = 4
            r2[r0] = r1
            if (r3 == 0) goto La
        L5b:
            r0 = 1
            goto Lb
        L5d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.G9.A02
            java.lang.String r1 = "ZWUMzT4FbwhCC9zvg"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "lQdDUKdfIZs4MkB9q"
            r0 = 1
            r2[r0] = r1
            if (r3 == 0) goto La
            goto L5b
        L6c:
            r2 = 254(0xfe, float:3.56E-43)
            r1 = 6
            r0 = 56
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto La
            r0 = 2
            goto Lb
        L7d:
            r3 = 203(0xcb, float:2.84E-43)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.G9.A02
            r0 = 6
            r1 = r1[r0]
            r0 = 12
            char r1 = r1.charAt(r0)
            r0 = 85
            if (r1 == r0) goto Lba
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.G9.A02
            java.lang.String r1 = "1rUDZc1zpmKXAlK5wqzuXN7L1n8yuk"
            r0 = 4
            r2[r0] = r1
            r1 = 3
            r0 = 48
            java.lang.String r0 = A03(r3, r1, r0)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto La
            r0 = 3
            goto Lb
        La5:
            r2 = 281(0x119, float:3.94E-43)
            r1 = 5
            r0 = 35
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto La
            r0 = 0
            goto Lb
        Lb7:
            return r4
        Lb8:
            return r5
        Lb9:
            return r6
        Lba:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.G9.A00(java.lang.String):int");
    }

    public static int A01(String str, int i) {
        int indexOf = str.indexOf(62, i);
        if (indexOf == -1) {
            int index = str.length();
            return index;
        }
        int index2 = indexOf + 1;
        return index2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Layout.Alignment A02(String str) {
        char c;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(A03(197, 6, 98))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1074341483:
                if (str.equals(A03(254, 6, 56))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 100571:
                if (str.equals(A03(203, 3, 48))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3317767:
                if (str.equals(A03(244, 4, 40))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 108511772:
                if (str.equals(A03(272, 5, 29))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 109757538:
                if (str.equals(A03(281, 5, 35))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 3:
                return Layout.Alignment.ALIGN_CENTER;
            case 4:
            case 5:
                return Layout.Alignment.ALIGN_OPPOSITE;
            default:
                Log.w(A03(141, 15, 15), A03(18, 25, 60) + str);
                return null;
        }
    }

    public static String A04(String str) {
        String trim = str.trim();
        if (!trim.isEmpty()) {
            return C0436Hx.A0m(trim, A03(156, 5, 44))[0];
        }
        if (A02[4].length() == 19) {
            throw new RuntimeException();
        }
        A02[3] = "n2qP40ip31gyFkT4bwxWbWgEBn8x5R";
        return null;
    }

    public static void A06(SpannableStringBuilder spannableStringBuilder, G4 g4, int i, int i2) {
        if (g4 == null) {
            return;
        }
        if (g4.A08() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(g4.A08()), i, i2, 33);
        }
        if (g4.A0O()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (g4.A0P()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (g4.A0N()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(g4.A06()), i, i2, 33);
        }
        if (g4.A0M()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(g4.A05()), i, i2, 33);
        }
        String A0H = g4.A0H();
        if (A02[6].charAt(12) == 'U') {
            throw new RuntimeException();
        }
        A02[6] = "tzfwj6Yb5L7snAfsv0bj9UNvpNFUfxvv";
        if (A0H != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(g4.A0H()), i, i2, 33);
        }
        if (g4.A0A() != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(g4.A0A()), i, i2, 33);
        }
        switch (g4.A07()) {
            case 1:
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) g4.A04(), true), i, i2, 33);
                return;
            case 2:
                spannableStringBuilder.setSpan(new RelativeSizeSpan(g4.A04()), i, i2, 33);
                return;
            case 3:
                spannableStringBuilder.setSpan(new RelativeSizeSpan(g4.A04() / 100.0f), i, i2, 33);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void A07(String str, SpannableStringBuilder spannableStringBuilder) {
        char c;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals(A03(206, 2, 62))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3464:
                if (str.equals(A03(252, 2, 117))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 96708:
                if (str.equals(A03(192, 3, 28))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3374865:
                if (str.equals(A03(260, 4, 116))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                spannableStringBuilder.append('<');
                return;
            case 1:
                spannableStringBuilder.append('>');
                return;
            case 2:
                spannableStringBuilder.append(' ');
                return;
            case 3:
                if (A02[7].length() != 5) {
                    throw new RuntimeException();
                }
                A02[7] = "j55CB";
                spannableStringBuilder.append('&');
                return;
            default:
                Log.w(A03(141, 15, 15), A03(209, 31, 71) + str + A03(16, 2, 40));
                return;
        }
    }

    public static void A08(String str, G6 g6) {
        String A032 = A03(141, 15, 15);
        Matcher matcher = A04.matcher(str);
        while (true) {
            boolean find = matcher.find();
            if (A02[7].length() != 5) {
                throw new RuntimeException();
            }
            A02[7] = "ISZNO";
            if (find) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                try {
                    if (A03(248, 4, 83).equals(group)) {
                        A09(group2, g6);
                    } else if (A03(187, 5, 70).equals(group)) {
                        g6.A0B(A02(group2));
                    } else if (A03(264, 8, 114).equals(group)) {
                        A0A(group2, g6);
                    } else if (A03(277, 4, 4).equals(group)) {
                        g6.A05(GA.A00(group2));
                    } else {
                        Log.w(A032, A03(121, 20, 23) + group + A03(15, 1, 19) + group2);
                    }
                } catch (NumberFormatException unused) {
                    Log.w(A032, A03(65, 26, 79) + matcher.group());
                }
            } else {
                return;
            }
        }
    }

    public static void A09(String str, G6 g6) throws NumberFormatException {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            g6.A06(A00(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            g6.A06(Integer.MIN_VALUE);
        }
        if (str.endsWith(A03(2, 1, 47))) {
            g6.A03(GA.A00(str)).A07(0);
            return;
        }
        int commaIndex = Integer.parseInt(str);
        if (commaIndex < 0) {
            commaIndex--;
        }
        g6.A03(commaIndex).A07(1);
    }

    public static void A0A(String str, G6 g6) throws NumberFormatException {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            int commaIndex = indexOf + 1;
            g6.A08(A00(str.substring(commaIndex)));
            str = str.substring(0, indexOf);
        } else {
            g6.A08(Integer.MIN_VALUE);
        }
        g6.A04(GA.A00(str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void A0B(String str, G7 g7, SpannableStringBuilder spannableStringBuilder, List<G4> list, List<G8> list2) {
        char c;
        int i = g7.A00;
        int i2 = spannableStringBuilder.length();
        String str2 = g7.A01;
        int start = str2.hashCode();
        switch (start) {
            case 0:
                if (str2.equals(A03(0, 0, 94))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 98:
                if (str2.equals(A03(195, 1, 66))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 99:
                if (str2.equals(A03(196, 1, 10))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 105:
                if (str2.equals(A03(208, 1, 102))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 117:
                if (str2.equals(A03(286, 1, 87))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 118:
                if (str2.equals(A03(287, 1, 113))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3314158:
                if (str2.equals(A03(240, 4, 20))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String[] strArr = A02;
        String str3 = strArr[2];
        String str4 = strArr[1];
        int end = str3.length();
        int start2 = str4.length();
        if (end != start2) {
            throw new RuntimeException();
        }
        A02[4] = "fbk5bLqQNEDh8uMBzoI0ZNvOUZBwB";
        switch (c) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i, i2, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
                break;
            case 2:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                return;
        }
        list2.clear();
        A0D(list, str, g7, list2);
        int styleMatchesCount = list2.size();
        for (int end2 = 0; end2 < styleMatchesCount; end2++) {
            A06(spannableStringBuilder, list2.get(end2).A01, i, i2);
        }
    }

    public static void A0D(List<G4> list, String str, G7 g7, List<G8> list2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            G4 g4 = list.get(i);
            String str2 = g7.A01;
            String[] strArr = g7.A03;
            String str3 = g7.A02;
            if (A02[3].length() == 7) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[0] = "AMyBO4NnCnMpgJ1A04yWFmVBrU3uxkkG";
            strArr2[5] = "4pWDMPx0mcGHcptb8cUlFxOOK6mkNbT4";
            int i2 = g4.A09(str, str2, strArr, str3);
            if (i2 > 0) {
                list2.add(new G8(i2, g4));
            }
        }
        Collections.sort(list2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean A0E(String str) {
        char c;
        switch (str.hashCode()) {
            case 98:
                if (str.equals(A03(195, 1, 66))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 99:
                if (str.equals(A03(196, 1, 10))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 105:
                if (str.equals(A03(208, 1, 102))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 117:
                if (str.equals(A03(286, 1, 87))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 118:
                if (str.equals(A03(287, 1, 113))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3314158:
                if (str.equals(A03(240, 4, 20))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                return false;
        }
    }

    public static boolean A0F(String str, Matcher matcher, C0420Hh c0420Hh, G6 g6, StringBuilder sb, List<G4> list) {
        try {
            g6.A0A(GA.A01(matcher.group(1))).A09(GA.A01(matcher.group(2)));
            A08(matcher.group(3), g6);
            sb.setLength(0);
            while (true) {
                String A0P = c0420Hh.A0P();
                if (!TextUtils.isEmpty(A0P)) {
                    if (sb.length() > 0) {
                        sb.append(A03(0, 1, 96));
                    }
                    sb.append(A0P.trim());
                } else {
                    A0C(str, sb.toString(), g6, list);
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
            Log.w(A03(141, 15, 15), A03(91, 30, 119) + matcher.group());
            return false;
        }
    }
}
