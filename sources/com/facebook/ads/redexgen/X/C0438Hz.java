package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Hz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0438Hz {
    public static byte[] A05;
    public static String[] A06 = {"BmLXPPjgF3W3yl6sHxYVjODx4Gc4ZSvN", "I4b0P0MoHEzHAP7yyYIBBQ151YdBHOwS", "TnUUZ2ELhZytD28RyaEX2mWW0X", "N95", "x88QxZ2XVEltUSPssGjwLeARzs7qYdf0", "T8gtGJunXdUSumjdX3X9mxIBVL", "lBAIpAErMYY7sFwVqjboSux", "Abd"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final List<byte[]> A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C0438Hz A00(C0420Hh c0420Hh) throws C02309d {
        try {
            c0420Hh.A0Z(4);
            int A0E = (c0420Hh.A0E() & 3) + 1;
            if (A0E == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int A0E2 = c0420Hh.A0E() & 31;
            for (int i = 0; i < A0E2; i++) {
                arrayList.add(A03(c0420Hh));
            }
            int A0E3 = c0420Hh.A0E();
            for (int i2 = 0; i2 < A0E3; i2++) {
                arrayList.add(A03(c0420Hh));
            }
            int i3 = -1;
            int i4 = -1;
            float f = 1.0f;
            if (A0E2 > 0) {
                C0415Hc A062 = C0416Hd.A06((byte[]) arrayList.get(0), A0E, ((byte[]) arrayList.get(0)).length);
                i3 = A062.A06;
                i4 = A062.A02;
                f = A062.A00;
            } else {
                String[] strArr = A06;
                if (strArr[3].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A06;
                strArr2[2] = "uBIRbiuvHYy0oHv2RJvgJqXQ4A";
                strArr2[5] = "sPpQgCzWXqIb9lVIC566YsDxxs";
            }
            return new C0438Hz(arrayList, A0E, i3, i4, f);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C02309d(A01(0, 24, 65), e);
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 108);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-14, 31, 31, 28, 31, -51, 29, 14, 31, 32, 22, 27, 20, -51, -18, 3, -16, -51, 16, 28, 27, 19, 22, 20};
    }

    static {
        A02();
    }

    public C0438Hz(List<byte[]> initializationData, int i, int i2, int i3, float f) {
        this.A04 = initializationData;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A00 = f;
    }

    public static byte[] A03(C0420Hh c0420Hh) {
        int A0I = c0420Hh.A0I();
        int offset = c0420Hh.A06();
        c0420Hh.A0Z(A0I);
        return HM.A08(c0420Hh.A00, offset, A0I);
    }
}
