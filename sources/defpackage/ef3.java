package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes.dex */
public final class ef3 extends zu2 {
    public final r42 m = new r42();
    public final boolean n;
    public final int o;
    public final int p;
    public final String q;
    public final float r;
    public final int s;

    public ef3(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.o = bArr[24];
            this.p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.q = "Serif".equals(new String(bArr, 43, bArr.length - 43, ex.c)) ? "serif" : "sans-serif";
            int i = bArr[25] * 20;
            this.s = i;
            boolean z = (bArr[0] & 32) != 0;
            this.n = z;
            if (z) {
                this.r = wi3.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
                return;
            } else {
                this.r = 0.85f;
                return;
            }
        }
        this.o = 0;
        this.p = -1;
        this.q = "sans-serif";
        this.n = false;
        this.r = 0.85f;
        this.s = -1;
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z3 = true;
            if ((i & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) == 0) {
                z3 = false;
            }
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (!z3 && !z && !z2) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    @Override // defpackage.zu2
    public final v23 e(byte[] bArr, int i, boolean z) {
        boolean z2;
        String t;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        int i3;
        r42 r42Var = this.m;
        r42Var.E(i, bArr);
        int i4 = 1;
        if (r42Var.c - r42Var.f4099b >= 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int A = r42Var.A();
            if (A == 0) {
                t = "";
            } else {
                int i5 = r42Var.f4099b;
                Charset C = r42Var.C();
                int i6 = A - (r42Var.f4099b - i5);
                if (C == null) {
                    C = ex.c;
                }
                t = r42Var.t(i6, C);
            }
            if (t.isEmpty()) {
                return ff3.f2086b;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(t);
            h(spannableStringBuilder, this.o, 0, 0, spannableStringBuilder.length(), 16711680);
            int length = spannableStringBuilder.length();
            int i7 = this.p;
            if (i7 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((i7 & 255) << 24) | (i7 >>> 8)), 0, length, 16711713);
            }
            int length2 = spannableStringBuilder.length();
            String str = this.q;
            if (str != "sans-serif") {
                spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
            }
            float f = this.r;
            while (true) {
                int i8 = r42Var.c;
                int i9 = r42Var.f4099b;
                if (i8 - i9 >= 8) {
                    int f2 = r42Var.f();
                    int f3 = r42Var.f();
                    if (f3 == 1937013100) {
                        if (r42Var.c - r42Var.f4099b >= 2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            int A2 = r42Var.A();
                            int i10 = 0;
                            while (i10 < A2) {
                                if (r42Var.c - r42Var.f4099b >= 12) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    int A3 = r42Var.A();
                                    int A4 = r42Var.A();
                                    r42Var.H(2);
                                    int v = r42Var.v();
                                    r42Var.H(i4);
                                    int f4 = r42Var.f();
                                    if (A4 > spannableStringBuilder.length()) {
                                        spannableStringBuilder.length();
                                        sn1.f();
                                        A4 = spannableStringBuilder.length();
                                    }
                                    int i11 = A4;
                                    if (A3 >= i11) {
                                        sn1.f();
                                        i2 = i10;
                                        i3 = A2;
                                    } else {
                                        i2 = i10;
                                        i3 = A2;
                                        h(spannableStringBuilder, v, this.o, A3, i11, 0);
                                        if (f4 != i7) {
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan((f4 >>> 8) | ((f4 & 255) << 24)), A3, i11, 33);
                                        }
                                    }
                                    i10 = i2 + 1;
                                    A2 = i3;
                                    i4 = 1;
                                } else {
                                    throw new x23("Unexpected subtitle format.");
                                }
                            }
                        } else {
                            throw new x23("Unexpected subtitle format.");
                        }
                    } else if (f3 == 1952608120 && this.n) {
                        if (r42Var.c - r42Var.f4099b >= 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            f = wi3.h(r42Var.A() / this.s, 0.0f, 0.95f);
                        } else {
                            throw new x23("Unexpected subtitle format.");
                        }
                    }
                    r42Var.G(i9 + f2);
                    i4 = 1;
                } else {
                    return new ff3(new hc0(spannableStringBuilder, null, null, null, f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f));
                }
            }
        } else {
            throw new x23("Unexpected subtitle format.");
        }
    }
}
