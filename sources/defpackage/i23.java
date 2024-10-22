package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class i23 extends g23 {
    public static final boolean R0(CharSequence charSequence, String str, boolean z) {
        if (str instanceof String) {
            if (Z0(charSequence, str, 0, z, 2) < 0) {
                return false;
            }
        } else if (X0(charSequence, str, 0, charSequence.length(), z, false) < 0) {
            return false;
        }
        return true;
    }

    public static boolean S0(CharSequence charSequence, char c) {
        if (Y0(charSequence, c, 0, false, 2) < 0) {
            return false;
        }
        return true;
    }

    public static boolean T0(CharSequence charSequence, String str) {
        if (charSequence instanceof String) {
            return ((String) charSequence).endsWith(str);
        }
        return h1(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static final boolean U0(String str, String str2) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static final int V0(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    public static final int W0(int i, CharSequence charSequence, String str, boolean z) {
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return X0(charSequence, str, i, charSequence.length(), z, false);
    }

    /* JADX WARN: Incorrect condition in loop: B:18:0x004a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int X0(java.lang.CharSequence r8, java.lang.CharSequence r9, int r10, int r11, boolean r12, boolean r13) {
        /*
            r0 = -1
            r1 = 0
            if (r13 != 0) goto L14
            kd1 r13 = new kd1
            if (r10 >= 0) goto L9
            r10 = 0
        L9:
            int r1 = r8.length()
            if (r11 <= r1) goto L10
            r11 = r1
        L10:
            r13.<init>(r10, r11)
            goto L23
        L14:
            int r13 = V0(r8)
            if (r10 <= r13) goto L1b
            r10 = r13
        L1b:
            if (r11 >= 0) goto L1e
            r11 = 0
        L1e:
            id1 r13 = new id1
            r13.<init>(r10, r11, r0)
        L23:
            boolean r10 = r8 instanceof java.lang.String
            int r11 = r13.f2571a
            int r1 = r13.c
            int r13 = r13.f2572b
            if (r10 == 0) goto L51
            boolean r10 = r9 instanceof java.lang.String
            if (r10 == 0) goto L51
            if (r1 <= 0) goto L35
            if (r11 <= r13) goto L39
        L35:
            if (r1 >= 0) goto L6d
            if (r13 > r11) goto L6d
        L39:
            r5 = r9
            java.lang.String r5 = (java.lang.String) r5
            r2 = 0
            r6 = r8
            java.lang.String r6 = (java.lang.String) r6
            int r4 = r9.length()
            r3 = r11
            r7 = r12
            boolean r10 = g1(r2, r3, r4, r5, r6, r7)
            if (r10 == 0) goto L4d
            return r11
        L4d:
            if (r11 == r13) goto L6d
            int r11 = r11 + r1
            goto L39
        L51:
            if (r1 <= 0) goto L55
            if (r11 <= r13) goto L59
        L55:
            if (r1 >= 0) goto L6d
            if (r13 > r11) goto L6d
        L59:
            r3 = 0
            int r6 = r9.length()
            r2 = r9
            r4 = r8
            r5 = r11
            r7 = r12
            boolean r10 = h1(r2, r3, r4, r5, r6, r7)
            if (r10 == 0) goto L69
            return r11
        L69:
            if (r11 == r13) goto L6d
            int r11 = r11 + r1
            goto L59
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i23.X0(java.lang.CharSequence, java.lang.CharSequence, int, int, boolean, boolean):int");
    }

    public static int Y0(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return a1(i, charSequence, z, new char[]{c});
    }

    public static /* synthetic */ int Z0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return W0(i, charSequence, str, z);
    }

    public static final int a1(int i, CharSequence charSequence, boolean z, char[] cArr) {
        boolean z2;
        int i2;
        boolean z3;
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length != 0) {
                if (length == 1) {
                    return ((String) charSequence).indexOf(cArr[0], i);
                }
                throw new IllegalArgumentException("Array has more than one element.");
            }
            throw new NoSuchElementException("Array is empty.");
        }
        if (i < 0) {
            i = 0;
        }
        kd1 kd1Var = new kd1(i, V0(charSequence));
        int i3 = kd1Var.f2572b;
        int i4 = kd1Var.c;
        if (i4 <= 0 ? i >= i3 : i <= i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            i = i3;
        }
        while (z2) {
            if (i == i3) {
                if (z2) {
                    i2 = i;
                    z2 = false;
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                i2 = i4 + i;
            }
            char charAt = charSequence.charAt(i);
            int length2 = cArr.length;
            int i5 = 0;
            while (true) {
                if (i5 < length2) {
                    if (fl.z(cArr[i5], charAt, z)) {
                        z3 = true;
                        break;
                    }
                    i5++;
                } else {
                    z3 = false;
                    break;
                }
            }
            if (z3) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    public static final boolean b1(CharSequence charSequence) {
        boolean z;
        if (charSequence.length() == 0) {
            return true;
        }
        Iterable kd1Var = new kd1(0, charSequence.length() - 1);
        if (!(kd1Var instanceof Collection) || !((Collection) kd1Var).isEmpty()) {
            Iterator it = kd1Var.iterator();
            while (it.hasNext()) {
                if (!fl.K(charSequence.charAt(((jd1) it).c()))) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return true;
        }
        return false;
    }

    public static int c1(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = V0(charSequence);
        }
        if (!(charSequence instanceof String)) {
            char[] cArr = {c};
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(c, i);
            }
            int V0 = V0(charSequence);
            if (i > V0) {
                i = V0;
            }
            while (-1 < i) {
                if (fl.z(cArr[0], charSequence.charAt(i), false)) {
                    return i;
                }
                i--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c, i);
    }

    public static int d1(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = V0(charSequence);
        }
        int i3 = i;
        if (!(charSequence instanceof String)) {
            return X0(charSequence, str, i3, 0, false, true);
        }
        return ((String) charSequence).lastIndexOf(str, i3);
    }

    public static final List e1(CharSequence charSequence) {
        return ip2.r0(new lb3(f1(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0), new fv2(charSequence, 26)));
    }

    public static ik0 f1(CharSequence charSequence, String[] strArr, boolean z, int i) {
        l1(i);
        return new ik0(charSequence, 0, i, new h23(1, Arrays.asList(strArr), z));
    }

    public static final boolean g1(int i, int i2, int i3, String str, String str2, boolean z) {
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    public static final boolean h1(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!fl.z(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final String i1(String str, String str2) {
        if (r1(str2, str)) {
            return str2.substring(str.length());
        }
        return str2;
    }

    public static final String j1(String str, String str2) {
        if (T0(str2, str)) {
            return str2.substring(0, str2.length() - str.length());
        }
        return str2;
    }

    public static final String k1(String str, String str2, String str3, boolean z) {
        int i = 0;
        int W0 = W0(0, str, str2, z);
        if (W0 < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = 1;
        if (length >= 1) {
            i2 = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i, W0);
                sb.append(str3);
                i = W0 + length;
                if (W0 >= str.length()) {
                    break;
                }
                W0 = W0(W0 + i2, str, str2, z);
            } while (W0 > 0);
            sb.append((CharSequence) str, i, str.length());
            return sb.toString();
        }
        throw new OutOfMemoryError();
    }

    public static final void l1(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
        } else {
            throw new IllegalArgumentException(hx2.m("Limit must be non-negative, but was ", i).toString());
        }
    }

    public static final List m1(int i, CharSequence charSequence, String str, boolean z) {
        boolean z2;
        l1(i);
        int i2 = 0;
        int W0 = W0(0, charSequence, str, z);
        if (W0 != -1 && i != 1) {
            if (i > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = 10;
            if (z2 && i <= 10) {
                i3 = i;
            }
            ArrayList arrayList = new ArrayList(i3);
            do {
                arrayList.add(charSequence.subSequence(i2, W0).toString());
                i2 = str.length() + W0;
                if (z2 && arrayList.size() == i - 1) {
                    break;
                }
                W0 = W0(i2, charSequence, str, z);
            } while (W0 != -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        return Collections.singletonList(charSequence.toString());
    }

    public static List n1(CharSequence charSequence, char[] cArr) {
        int i = 0;
        byte b2 = 0;
        if (cArr.length == 1) {
            return m1(0, charSequence, String.valueOf(cArr[0]), false);
        }
        l1(0);
        ac1 ac1Var = new ac1(new ik0(charSequence, 0, 0, new h23(i, cArr, b2 == true ? 1 : 0)));
        ArrayList arrayList = new ArrayList(a20.C0(ac1Var, 10));
        Iterator it = ac1Var.iterator();
        while (it.hasNext()) {
            arrayList.add(s1(charSequence, (kd1) it.next()));
        }
        return arrayList;
    }

    public static List o1(CharSequence charSequence, String[] strArr) {
        boolean z = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z = false;
            }
            if (!z) {
                return m1(0, charSequence, str, false);
            }
        }
        ac1 ac1Var = new ac1(f1(charSequence, strArr, false, 0));
        ArrayList arrayList = new ArrayList(a20.C0(ac1Var, 10));
        Iterator it = ac1Var.iterator();
        while (it.hasNext()) {
            arrayList.add(s1(charSequence, (kd1) it.next()));
        }
        return arrayList;
    }

    public static final boolean p1(String str, int i, String str2, boolean z) {
        if (!z) {
            return str.startsWith(str2, i);
        }
        return g1(i, 0, str2.length(), str, str2, z);
    }

    public static final boolean q1(String str, String str2, boolean z) {
        if (!z) {
            return str.startsWith(str2);
        }
        return g1(0, 0, str2.length(), str, str2, z);
    }

    public static boolean r1(CharSequence charSequence, String str) {
        if (charSequence instanceof String) {
            return q1((String) charSequence, str, false);
        }
        return h1(charSequence, 0, str, 0, str.length(), false);
    }

    public static final String s1(CharSequence charSequence, kd1 kd1Var) {
        return charSequence.subSequence(Integer.valueOf(kd1Var.f2571a).intValue(), Integer.valueOf(kd1Var.f2572b).intValue() + 1).toString();
    }

    public static String t1(String str, String str2) {
        int Z0 = Z0(str, str2, 0, false, 6);
        if (Z0 != -1) {
            return str.substring(str2.length() + Z0, str.length());
        }
        return str;
    }

    public static final CharSequence u1(CharSequence charSequence) {
        int i;
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean K = fl.K(charSequence.charAt(i));
            if (!z) {
                if (!K) {
                    z = true;
                } else {
                    i2++;
                }
            } else {
                if (!K) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }
}
