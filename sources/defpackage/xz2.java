package defpackage;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class xz2 extends zu2 {
    public static final Pattern r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean m;
    public final yz2 n;
    public LinkedHashMap o;
    public float p = -3.4028235E38f;
    public float q = -3.4028235E38f;

    public xz2(List list) {
        if (list != null && !list.isEmpty()) {
            this.m = true;
            byte[] bArr = (byte[]) list.get(0);
            int i = wi3.f5017a;
            Charset charset = ex.c;
            String str = new String(bArr, charset);
            cp3.e(str.startsWith("Format:"));
            yz2 b2 = yz2.b(str);
            b2.getClass();
            this.n = b2;
            i(new r42((byte[]) list.get(1)), charset);
            return;
        }
        this.m = false;
        this.n = null;
    }

    public static int h(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        ArrayList arrayList3;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() == j) {
                    return size;
                }
                if (((Long) arrayList.get(size)).longValue() < j) {
                    i = size + 1;
                    break;
                }
            } else {
                i = 0;
                break;
            }
        }
        arrayList.add(i, Long.valueOf(j));
        if (i == 0) {
            arrayList3 = new ArrayList();
        } else {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i - 1));
        }
        arrayList2.add(i, arrayList3);
        return i;
    }

    public static long j(String str) {
        Matcher matcher = r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i = wi3.f5017a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(group) * 60 * 60 * 1000000);
    }

    @Override // defpackage.zu2
    public final v23 e(byte[] bArr, int i, boolean z) {
        yz2 yz2Var;
        r42 r42Var;
        Charset charset;
        yz2 yz2Var2;
        b03 b03Var;
        int i2;
        int i3;
        float f;
        Layout.Alignment alignment;
        int i4;
        int i5;
        float f2;
        float f3;
        float f4;
        float f5;
        int i6;
        float f6;
        int i7;
        int i8;
        int i9;
        Integer num;
        int i10;
        int i11;
        xz2 xz2Var = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        r42 r42Var2 = new r42(bArr, i);
        Charset C = r42Var2.C();
        if (C == null) {
            C = ex.c;
        }
        boolean z2 = xz2Var.m;
        if (!z2) {
            xz2Var.i(r42Var2, C);
        }
        if (z2) {
            yz2Var = xz2Var.n;
        } else {
            yz2Var = null;
        }
        while (true) {
            String h = r42Var2.h(C);
            if (h != null) {
                if (h.startsWith("Format:")) {
                    yz2Var = yz2.b(h);
                } else {
                    if (h.startsWith("Dialogue:")) {
                        if (yz2Var == null) {
                            "Skipping dialogue line before complete format: ".concat(h);
                            sn1.f();
                        } else {
                            cp3.e(h.startsWith("Dialogue:"));
                            String substring = h.substring(9);
                            int i12 = yz2Var.e;
                            String[] split = substring.split(",", i12);
                            if (split.length != i12) {
                                "Skipping dialogue line with fewer columns than format: ".concat(h);
                                sn1.f();
                            } else {
                                long j = j(split[yz2Var.f5404a]);
                                if (j == -9223372036854775807L) {
                                    "Skipping invalid timing: ".concat(h);
                                    sn1.f();
                                } else {
                                    long j2 = j(split[yz2Var.f5405b]);
                                    if (j2 == -9223372036854775807L) {
                                        "Skipping invalid timing: ".concat(h);
                                        sn1.f();
                                    } else {
                                        LinkedHashMap linkedHashMap = xz2Var.o;
                                        if (linkedHashMap != null && (i11 = yz2Var.c) != -1) {
                                            b03Var = (b03) linkedHashMap.get(split[i11].trim());
                                        } else {
                                            b03Var = null;
                                        }
                                        String str = split[yz2Var.d];
                                        Matcher matcher = a03.f10a.matcher(str);
                                        PointF pointF = null;
                                        int i13 = -1;
                                        while (matcher.find()) {
                                            r42 r42Var3 = r42Var2;
                                            String group = matcher.group(1);
                                            group.getClass();
                                            try {
                                                PointF a2 = a03.a(group);
                                                if (a2 != null) {
                                                    pointF = a2;
                                                }
                                            } catch (RuntimeException unused) {
                                            }
                                            try {
                                                Matcher matcher2 = a03.d.matcher(group);
                                                if (matcher2.find()) {
                                                    String group2 = matcher2.group(1);
                                                    group2.getClass();
                                                    i10 = b03.a(group2);
                                                } else {
                                                    i10 = -1;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            if (i10 != -1) {
                                                i13 = i10;
                                                r42Var2 = r42Var3;
                                            } else {
                                                r42Var2 = r42Var3;
                                            }
                                        }
                                        r42Var = r42Var2;
                                        String replace = a03.f10a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f7 = xz2Var.p;
                                        float f8 = xz2Var.q;
                                        SpannableString spannableString = new SpannableString(replace);
                                        float f9 = -3.4028235E38f;
                                        if (b03Var != null) {
                                            Integer num2 = b03Var.c;
                                            if (num2 != null) {
                                                charset = C;
                                                yz2Var2 = yz2Var;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                charset = C;
                                                yz2Var2 = yz2Var;
                                            }
                                            if (b03Var.j == 3 && (num = b03Var.d) != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                            }
                                            float f10 = b03Var.e;
                                            if (f10 != -3.4028235E38f && f8 != -3.4028235E38f) {
                                                f5 = f10 / f8;
                                                i6 = 1;
                                            } else {
                                                f5 = -3.4028235E38f;
                                                i6 = Integer.MIN_VALUE;
                                            }
                                            boolean z3 = b03Var.g;
                                            boolean z4 = b03Var.f;
                                            if (z4 && z3) {
                                                f6 = f5;
                                                i7 = i6;
                                                i8 = 33;
                                                i9 = 0;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                f6 = f5;
                                                i7 = i6;
                                                i8 = 33;
                                                i9 = 0;
                                                if (z4) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z3) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (b03Var.h) {
                                                spannableString.setSpan(new UnderlineSpan(), i9, spannableString.length(), i8);
                                            }
                                            if (b03Var.i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i9, spannableString.length(), i8);
                                            }
                                            i3 = i7;
                                            f = f6;
                                            i2 = -1;
                                        } else {
                                            charset = C;
                                            yz2Var2 = yz2Var;
                                            i2 = -1;
                                            i3 = Integer.MIN_VALUE;
                                            f = -3.4028235E38f;
                                        }
                                        if (i13 != i2) {
                                            i2 = i13;
                                        } else if (b03Var != null) {
                                            i2 = b03Var.f381b;
                                        }
                                        switch (i2) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                sn1.f();
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                break;
                                        }
                                        alignment = null;
                                        switch (i2) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                sn1.f();
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i4 = 0;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i4 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i4 = 2;
                                                break;
                                        }
                                        i4 = Integer.MIN_VALUE;
                                        switch (i2) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                sn1.f();
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i5 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i5 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i5 = 0;
                                                break;
                                        }
                                        i5 = Integer.MIN_VALUE;
                                        if (pointF != null && f8 != -3.4028235E38f && f7 != -3.4028235E38f) {
                                            f3 = pointF.x / f7;
                                            f4 = pointF.y / f8;
                                        } else {
                                            if (i4 != 0) {
                                                if (i4 != 1) {
                                                    if (i4 != 2) {
                                                        f2 = -3.4028235E38f;
                                                    } else {
                                                        f2 = 0.95f;
                                                    }
                                                } else {
                                                    f2 = 0.5f;
                                                }
                                            } else {
                                                f2 = 0.05f;
                                            }
                                            if (i5 != 0) {
                                                if (i5 != 1) {
                                                    if (i5 == 2) {
                                                        f9 = 0.95f;
                                                    }
                                                } else {
                                                    f9 = 0.5f;
                                                }
                                            } else {
                                                f9 = 0.05f;
                                            }
                                            f3 = f2;
                                            f4 = f9;
                                        }
                                        hc0 hc0Var = new hc0(spannableString, alignment, null, null, f4, 0, i5, f3, i4, i3, f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                        int h2 = h(j2, arrayList2, arrayList);
                                        for (int h3 = h(j, arrayList2, arrayList); h3 < h2; h3++) {
                                            ((List) arrayList.get(h3)).add(hc0Var);
                                        }
                                        xz2Var = this;
                                        r42Var2 = r42Var;
                                        C = charset;
                                        yz2Var = yz2Var2;
                                    }
                                }
                            }
                        }
                    }
                    r42Var = r42Var2;
                    charset = C;
                    yz2Var2 = yz2Var;
                    xz2Var = this;
                    r42Var2 = r42Var;
                    C = charset;
                    yz2Var = yz2Var2;
                }
            } else {
                return new c03(0, arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0288 A[Catch: RuntimeException -> 0x02af, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x02af, blocks: (B:49:0x01c0, B:51:0x01ce, B:52:0x01dd, B:54:0x01e1, B:55:0x01f0, B:57:0x01f4, B:58:0x0203, B:60:0x0207, B:62:0x020d, B:64:0x0230, B:66:0x0234, B:69:0x0245, B:71:0x0249, B:74:0x025a, B:76:0x025e, B:79:0x026f, B:81:0x0273, B:84:0x0284, B:86:0x0288, B:88:0x028e, B:95:0x02a9, B:96:0x02a1, B:108:0x0216), top: B:48:0x01c0, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(defpackage.r42 r28, java.nio.charset.Charset r29) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz2.i(r42, java.nio.charset.Charset):void");
    }
}
