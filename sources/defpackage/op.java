package defpackage;

import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class op {
    public static final String d;
    public static final String e;
    public static final op f;
    public static final op g;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3710a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3711b;
    public final u63 c;

    static {
        v63 v63Var = w63.c;
        d = Character.toString((char) 8206);
        e = Character.toString((char) 8207);
        f = new op(false, 2, v63Var);
        g = new op(true, 2, v63Var);
    }

    public op(boolean z, int i, u63 u63Var) {
        this.f3710a = z;
        this.f3711b = i;
        this.c = u63Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:            return 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:            if (r1 != 0) goto L31;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:            if (r2 == 0) goto L33;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008f, code lost:            return r2;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0077, code lost:            if (r0.c <= 0) goto L63;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007d, code lost:            switch(r0.a()) {            case 14: goto L66;            case 15: goto L66;            case 16: goto L65;            case 17: goto L65;            case 18: goto L64;            default: goto L70;        };     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0081, code lost:            r3 = r3 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0084, code lost:            if (r1 != r3) goto L43;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x008c, code lost:            r3 = r3 - 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0088, code lost:            if (r1 != r3) goto L43;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:            return 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:            return 0;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(java.lang.CharSequence r9) {
        /*
            np r0 = new np
            r0.<init>(r9)
            r9 = 0
            r0.c = r9
            r1 = 0
            r2 = 0
            r3 = 0
        Lb:
            int r4 = r0.c
            int r5 = r0.f3508b
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L6e
            if (r1 != 0) goto L6e
            java.lang.CharSequence r5 = r0.f3507a
            char r4 = r5.charAt(r4)
            r0.d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L37
            int r4 = r0.c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4b
        L37:
            int r4 = r0.c
            int r4 = r4 + r7
            r0.c = r4
            char r4 = r0.d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L47
            byte[] r5 = defpackage.np.e
            r4 = r5[r4]
            goto L4b
        L47:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L4b:
            if (r4 == 0) goto L69
            if (r4 == r7) goto L66
            r5 = 2
            if (r4 == r5) goto L66
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L62;
                case 15: goto L62;
                case 16: goto L5e;
                case 17: goto L5e;
                case 18: goto L5a;
                default: goto L59;
            }
        L59:
            goto L6c
        L5a:
            int r3 = r3 + (-1)
            r2 = 0
            goto Lb
        L5e:
            int r3 = r3 + 1
            r2 = 1
            goto Lb
        L62:
            int r3 = r3 + 1
            r2 = -1
            goto Lb
        L66:
            if (r3 != 0) goto L6c
            goto L86
        L69:
            if (r3 != 0) goto L6c
            goto L8a
        L6c:
            r1 = r3
            goto Lb
        L6e:
            if (r1 != 0) goto L71
            goto L8f
        L71:
            if (r2 == 0) goto L75
            r9 = r2
            goto L8f
        L75:
            int r2 = r0.c
            if (r2 <= 0) goto L8f
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L88;
                case 15: goto L88;
                case 16: goto L84;
                case 17: goto L84;
                case 18: goto L81;
                default: goto L80;
            }
        L80:
            goto L75
        L81:
            int r3 = r3 + 1
            goto L75
        L84:
            if (r1 != r3) goto L8c
        L86:
            r9 = 1
            goto L8f
        L88:
            if (r1 != r3) goto L8c
        L8a:
            r9 = -1
            goto L8f
        L8c:
            int r3 = r3 + (-1)
            goto L75
        L8f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.op.a(java.lang.CharSequence):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0020. Please report as an issue. */
    public static int b(CharSequence charSequence) {
        np npVar = new np(charSequence);
        npVar.c = npVar.f3508b;
        int i = 0;
        int i2 = 0;
        while (npVar.c > 0) {
            byte a2 = npVar.a();
            if (a2 != 0) {
                if (a2 != 1 && a2 != 2) {
                    if (a2 != 9) {
                        switch (a2) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                } else {
                                    i2 = i;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                        i2 = i;
                    }
                }
            } else {
                if (i == 0) {
                    return -1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            }
        }
        return 0;
    }

    public final SpannableStringBuilder c(CharSequence charSequence, u63 u63Var) {
        boolean z;
        v63 v63Var;
        char c;
        v63 v63Var2;
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean b2 = u63Var.b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.f3711b & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = e;
        String str3 = d;
        boolean z2 = this.f3710a;
        if (z) {
            if (b2) {
                v63Var2 = w63.f4951b;
            } else {
                v63Var2 = w63.f4950a;
            }
            boolean b3 = v63Var2.b(charSequence, charSequence.length());
            if (!z2 && (b3 || a(charSequence) == 1)) {
                str = str3;
            } else if (!z2 || (b3 && a(charSequence) != -1)) {
                str = "";
            } else {
                str = str2;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (b2 != z2) {
            if (b2) {
                c = 8235;
            } else {
                c = 8234;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (b2) {
            v63Var = w63.f4951b;
        } else {
            v63Var = w63.f4950a;
        }
        boolean b4 = v63Var.b(charSequence, charSequence.length());
        if (!z2 && (b4 || b(charSequence) == 1)) {
            str2 = str3;
        } else if (!z2 || (b4 && b(charSequence) != -1)) {
            str2 = "";
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
