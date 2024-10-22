package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Fc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0365Fc {
    public static String[] A08 = {"XC7eQ7mnDigGIQL7dx0KfLpc2FT", "IUrjEkKy3b2jJtDJZ33sGt", "", "4VXLd4NK2UMSrr9tKiehY90A", "S2gwvpBwwRoio7AP3LwECfAaRkk6O4ZY", "9TUF7Ks7YtQxur", "s5iWH5PZ", "Ea283cgdBM89En3yGupwQHUZzzjf5u4Q"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final List<C0364Fb> A06 = new ArrayList();
    public final List<SpannableString> A07 = new ArrayList();
    public final StringBuilder A05 = new StringBuilder();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final FV A05() {
        float f;
        int i;
        int i2;
        int i3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i4 = 0; i4 < this.A07.size(); i4++) {
            spannableStringBuilder.append((CharSequence) this.A07.get(i4));
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append((CharSequence) A00());
        if (A08[2].length() != 4) {
            A08[4] = "XUGi3jQBIuRQftqARNMB36bn2TyuzRos";
            if (spannableStringBuilder.length() == 0) {
                if (A08[1].length() != 22) {
                    A08[1] = "sMaadG1MTySiyP3TGzo1T4";
                    return null;
                }
                A08[1] = "nS4SC9sWxiUu8g9Arai4ZN";
                return null;
            }
            int i5 = this.A02;
            int i6 = this.A04;
            if (A08[7].charAt(3) != 'N') {
                A08[4] = "yDKFp8g0FkQkvFDtr9inWFZi093Wo6Xo";
                int i7 = i5 + i6;
                int length = (32 - i7) - spannableStringBuilder.length();
                int i8 = i7 - length;
                if (this.A00 == 2 && (Math.abs(i8) < 3 || length < 0)) {
                    f = 0.5f;
                    i = 1;
                } else if (this.A00 != 2 || i8 <= 0) {
                    f = (0.8f * (i7 / 32.0f)) + 0.1f;
                    i = 0;
                } else {
                    int i9 = 32 - length;
                    if (A08[4].charAt(13) == 'W') {
                        throw new RuntimeException();
                    }
                    A08[2] = "dWj1xsuyJgYxC";
                    f = (0.8f * (i9 / 32.0f)) + 0.1f;
                    i = 2;
                }
                if (this.A00 == 1 || this.A03 > 7) {
                    i2 = 2;
                    i3 = (this.A03 - 15) - 2;
                } else {
                    i2 = 0;
                    i3 = this.A03;
                }
                return new FV(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, i3, 1, i2, f, i, Float.MIN_VALUE);
            }
        }
        throw new RuntimeException();
    }

    public C0365Fc(int i, int i2) {
        A09(i);
        A0A(i2);
    }

    private final SpannableString A00() {
        int i;
        int[] iArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A05);
        int nextColor = spannableStringBuilder.length();
        int color = -1;
        int colorStartPosition = -1;
        int italicStartPosition = 0;
        int underlineStartPosition = -1;
        boolean z = false;
        int i2 = -1;
        for (int length = 0; length < this.A06.size(); length++) {
            C0364Fb c0364Fb = this.A06.get(length);
            boolean z2 = c0364Fb.A02;
            int i3 = c0364Fb.A01;
            if (i3 != 8) {
                z = i3 == 7;
                if (i3 != 7) {
                    iArr = C3A.A0K;
                    i2 = iArr[i3];
                }
            }
            int i4 = c0364Fb.A00;
            if (A08[1].length() != 22) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[6] = "A7DJ6NHY";
            strArr[5] = "4roHVg72rzpV8d";
            if (length + 1 < this.A06.size()) {
                i = this.A06.get(length + 1).A00;
            } else {
                i = nextColor;
            }
            if (i4 != i) {
                if (color != -1 && !z2) {
                    A02(spannableStringBuilder, color, i4);
                    color = -1;
                } else if (color == -1 && z2) {
                    color = i4;
                }
                if (colorStartPosition != -1 && !z) {
                    A01(spannableStringBuilder, colorStartPosition, i4);
                    colorStartPosition = -1;
                } else if (colorStartPosition == -1 && z) {
                    colorStartPosition = i4;
                }
                if (i2 != underlineStartPosition) {
                    A03(spannableStringBuilder, italicStartPosition, i4, underlineStartPosition);
                    underlineStartPosition = i2;
                    italicStartPosition = i4;
                }
            }
        }
        if (color != -1 && color != nextColor) {
            A02(spannableStringBuilder, color, nextColor);
        }
        if (colorStartPosition != -1 && colorStartPosition != nextColor) {
            A01(spannableStringBuilder, colorStartPosition, nextColor);
        }
        if (italicStartPosition != nextColor) {
            A03(spannableStringBuilder, italicStartPosition, nextColor, underlineStartPosition);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public static void A01(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
    }

    public static void A02(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
    }

    public static void A03(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        if (i3 == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
    }

    public final int A04() {
        return this.A03;
    }

    public final void A06() {
        int length = this.A05.length();
        if (length > 0) {
            int length2 = length - 1;
            this.A05.delete(length2, length);
            int length3 = this.A06.size();
            for (int i = length3 - 1; i >= 0; i--) {
                C0364Fb c0364Fb = this.A06.get(i);
                int length4 = c0364Fb.A00;
                if (length4 == length) {
                    int length5 = c0364Fb.A00;
                    c0364Fb.A00 = length5 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void A07() {
        this.A07.add(A00());
        this.A05.setLength(0);
        this.A06.clear();
        int min = Math.min(this.A01, this.A03);
        while (true) {
            int size = this.A07.size();
            String[] strArr = A08;
            String str = strArr[6];
            String str2 = strArr[5];
            int length = str.length();
            int numRows = str2.length();
            if (length == numRows) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[6] = "4Kk3waKD";
            strArr2[5] = "8nOP5N7C4Kf2hN";
            if (size >= min) {
                this.A07.remove(0);
            } else {
                return;
            }
        }
    }

    public final void A08(char c) {
        this.A05.append(c);
    }

    public final void A09(int i) {
        this.A00 = i;
        this.A06.clear();
        this.A07.clear();
        this.A05.setLength(0);
        this.A03 = 15;
        this.A02 = 0;
        this.A04 = 0;
    }

    public final void A0A(int i) {
        this.A01 = i;
    }

    public final void A0B(int i) {
        this.A02 = i;
    }

    public final void A0C(int i) {
        this.A03 = i;
    }

    public final void A0D(int i) {
        this.A04 = i;
    }

    public final void A0E(int i, boolean z) {
        this.A06.add(new C0364Fb(i, z, this.A05.length()));
    }

    public final boolean A0F() {
        return this.A06.isEmpty() && this.A07.isEmpty() && this.A05.length() == 0;
    }

    public final String toString() {
        return this.A05.toString();
    }
}
