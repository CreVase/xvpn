package defpackage;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class hp3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f2463a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f2464b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = Collections.unmodifiableMap(hashMap2);
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, ep3 ep3Var, String str, List list, List list2) {
        char c2;
        char c3;
        char c4;
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5 = ep3Var.f1972b;
        int length = spannableStringBuilder.length();
        String str2 = ep3Var.f1971a;
        str2.getClass();
        int hashCode = str2.hashCode();
        int i6 = -1;
        if (hashCode != 0) {
            if (hashCode != 105) {
                if (hashCode != 3314158) {
                    if (hashCode != 3511770) {
                        if (hashCode != 98) {
                            if (hashCode != 99) {
                                if (hashCode != 117) {
                                    if (hashCode == 118 && str2.equals("v")) {
                                        c2 = 5;
                                    }
                                    c2 = 65535;
                                } else {
                                    if (str2.equals("u")) {
                                        c2 = 4;
                                    }
                                    c2 = 65535;
                                }
                            } else {
                                if (str2.equals("c")) {
                                    c2 = 2;
                                }
                                c2 = 65535;
                            }
                        } else {
                            if (str2.equals("b")) {
                                c2 = 1;
                            }
                            c2 = 65535;
                        }
                    } else {
                        if (str2.equals("ruby")) {
                            c2 = 7;
                        }
                        c2 = 65535;
                    }
                } else {
                    if (str2.equals("lang")) {
                        c2 = 6;
                    }
                    c2 = 65535;
                }
            } else {
                if (str2.equals("i")) {
                    c2 = 3;
                }
                c2 = 65535;
            }
        } else {
            if (str2.equals("")) {
                c2 = 0;
            }
            c2 = 65535;
        }
        switch (c2) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i5, length, 33);
                break;
            case 2:
                for (String str3 : ep3Var.d) {
                    Map map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i5, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i5, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i5, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i5, length, 33);
                break;
            case 7:
                int c5 = c(list2, str, ep3Var);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, dp3.c);
                int i7 = ep3Var.f1972b;
                int i8 = 0;
                int i9 = 0;
                while (i8 < arrayList.size()) {
                    if ("rt".equals(((dp3) arrayList.get(i8)).f1815a.f1971a)) {
                        dp3 dp3Var = (dp3) arrayList.get(i8);
                        int c6 = c(list2, str, dp3Var.f1815a);
                        if (c6 == i6) {
                            if (c5 != i6) {
                                c6 = c5;
                            } else {
                                c6 = 1;
                            }
                        }
                        int i10 = dp3Var.f1815a.f1972b - i9;
                        int i11 = dp3Var.f1816b - i9;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i10, i11);
                        spannableStringBuilder.delete(i10, i11);
                        spannableStringBuilder.setSpan(new vp(subSequence.toString(), c6), i7, i10, 33);
                        i9 = subSequence.length() + i9;
                        i7 = i10;
                    }
                    i8++;
                    i6 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b2 = b(list2, str, ep3Var);
        for (int i12 = 0; i12 < b2.size(); i12++) {
            ap3 ap3Var = ((fp3) b2.get(i12)).f2134b;
            if (ap3Var != null) {
                int i13 = ap3Var.l;
                if (i13 == -1 && ap3Var.m == -1) {
                    i = -1;
                } else {
                    if (i13 == 1) {
                        c3 = 1;
                    } else {
                        c3 = 0;
                    }
                    if (ap3Var.m == 1) {
                        c4 = 2;
                    } else {
                        c4 = 0;
                    }
                    i = c4 | c3;
                }
                if (i != -1) {
                    int i14 = ap3Var.l;
                    if (i14 == -1 && ap3Var.m == -1) {
                        i4 = -1;
                    } else {
                        if (i14 == 1) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        if (ap3Var.m == 1) {
                            i3 = 2;
                        } else {
                            i3 = 0;
                        }
                        i4 = i2 | i3;
                    }
                    cp3.a(spannableStringBuilder, new StyleSpan(i4), i5, length);
                }
                if (ap3Var.j == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i5, length, 33);
                }
                if (ap3Var.k == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i5, length, 33);
                }
                if (ap3Var.g) {
                    if (ap3Var.g) {
                        cp3.a(spannableStringBuilder, new ForegroundColorSpan(ap3Var.f), i5, length);
                    } else {
                        throw new IllegalStateException("Font color not defined");
                    }
                }
                if (ap3Var.i) {
                    if (ap3Var.i) {
                        cp3.a(spannableStringBuilder, new BackgroundColorSpan(ap3Var.h), i5, length);
                    } else {
                        throw new IllegalStateException("Background color not defined.");
                    }
                }
                if (ap3Var.e != null) {
                    cp3.a(spannableStringBuilder, new TypefaceSpan(ap3Var.e), i5, length);
                }
                int i15 = ap3Var.n;
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 == 3) {
                            cp3.a(spannableStringBuilder, new RelativeSizeSpan(ap3Var.o / 100.0f), i5, length);
                        }
                    } else {
                        cp3.a(spannableStringBuilder, new RelativeSizeSpan(ap3Var.o), i5, length);
                    }
                } else {
                    cp3.a(spannableStringBuilder, new AbsoluteSizeSpan((int) ap3Var.o, true), i5, length);
                }
                if (ap3Var.q) {
                    spannableStringBuilder.setSpan(new s71(22), i5, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, ep3 ep3Var) {
        int i;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ap3 ap3Var = (ap3) list.get(i2);
            String str2 = ep3Var.f1971a;
            if (ap3Var.f314a.isEmpty() && ap3Var.f315b.isEmpty() && ap3Var.c.isEmpty() && ap3Var.d.isEmpty()) {
                i = TextUtils.isEmpty(str2);
            } else {
                int a2 = ap3.a(ap3.a(ap3.a(0, 1073741824, ap3Var.f314a, str), 2, ap3Var.f315b, str2), 4, ap3Var.d, ep3Var.c);
                if (a2 != -1) {
                    if (ep3Var.d.containsAll(ap3Var.c)) {
                        i = a2 + (ap3Var.c.size() * 4);
                    }
                }
                i = 0;
            }
            if (i > 0) {
                arrayList.add(new fp3(i, ap3Var));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, ep3 ep3Var) {
        ArrayList b2 = b(list, str, ep3Var);
        for (int i = 0; i < b2.size(); i++) {
            int i2 = ((fp3) b2.get(i)).f2134b.p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static bp3 d(String str, Matcher matcher, r42 r42Var, ArrayList arrayList) {
        gp3 gp3Var = new gp3();
        try {
            String group = matcher.group(1);
            group.getClass();
            gp3Var.f2300a = jp3.b(group);
            String group2 = matcher.group(2);
            group2.getClass();
            gp3Var.f2301b = jp3.b(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, gp3Var);
            StringBuilder sb = new StringBuilder();
            String g = r42Var.g();
            while (!TextUtils.isEmpty(g)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(g.trim());
                g = r42Var.g();
            }
            gp3Var.c = f(str, sb.toString(), arrayList);
            return new bp3(gp3Var.a().a(), gp3Var.f2300a, gp3Var.f2301b);
        } catch (NumberFormatException unused) {
            matcher.group();
            sn1.f();
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c1, code lost:            if (r6.equals("start") == false) goto L53;     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0082, code lost:            switch(r14) {            case 0: goto L44;            case 1: goto L44;            case 2: goto L43;            case 3: goto L42;            case 4: goto L41;            case 5: goto L45;            default: goto L40;        };     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0085, code lost:            "Invalid alignment value: ".concat(r5);        defpackage.sn1.f();     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x008e, code lost:            r2 = 5;     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0090, code lost:            r2 = 4;     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0092, code lost:            r2 = 3;     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0094, code lost:            r2 = 2;     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0095, code lost:            r19.d = r2;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:46:0x00f4. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(java.lang.String r18, defpackage.gp3 r19) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hp3.e(java.lang.String, gp3):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01f3, code lost:            switch(r13) {            case 0: goto L140;            case 1: goto L139;            case 2: goto L138;            case 3: goto L137;            default: goto L136;        };     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01f6, code lost:            defpackage.sn1.f();     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0209, code lost:            if (r9 != r12) goto L143;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x020b, code lost:            r3.append((java.lang.CharSequence) " ");     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x020e, code lost:            r7 = r9 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01fa, code lost:            r3.append(' ');     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01fe, code lost:            r3.append('&');     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0202, code lost:            r3.append('<');     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0206, code lost:            r3.append('>');     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString f(java.lang.String r16, java.lang.String r17, java.util.List r18) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hp3.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static void g(String str, gp3 gp3Var) {
        int indexOf = str.indexOf(44);
        char c2 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            int i = 2;
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                case 1:
                    i = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i = 0;
                    break;
                default:
                    "Invalid anchor value: ".concat(substring);
                    sn1.f();
                    i = Integer.MIN_VALUE;
                    break;
            }
            gp3Var.g = i;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            gp3Var.e = jp3.a(str);
            gp3Var.f = 0;
        } else {
            gp3Var.e = Integer.parseInt(str);
            gp3Var.f = 1;
        }
    }
}
