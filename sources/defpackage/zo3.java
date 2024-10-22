package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zo3 {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final r42 f5524a = new r42();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f5525b = new StringBuilder();

    public static String a(r42 r42Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = r42Var.f4099b;
        int i2 = r42Var.c;
        while (i < i2 && !z) {
            char c2 = (char) r42Var.f4098a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && ((c2 < '0' || c2 > '9') && c2 != '#' && c2 != '-' && c2 != '.' && c2 != '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        r42Var.H(i - r42Var.f4099b);
        return sb.toString();
    }

    public static String b(r42 r42Var, StringBuilder sb) {
        c(r42Var);
        if (r42Var.c - r42Var.f4099b == 0) {
            return null;
        }
        String a2 = a(r42Var, sb);
        if (!"".equals(a2)) {
            return a2;
        }
        return "" + ((char) r42Var.v());
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0067 A[LOOP:1: B:3:0x0002->B:41:0x0067, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(defpackage.r42 r8) {
        /*
            r0 = 1
        L1:
            r1 = 1
        L2:
            int r2 = r8.c
            int r3 = r8.f4099b
            int r2 = r2 - r3
            if (r2 <= 0) goto L69
            if (r1 == 0) goto L69
            byte[] r1 = r8.f4098a
            r1 = r1[r3]
            char r1 = (char) r1
            r2 = 9
            r3 = 0
            if (r1 == r2) goto L27
            r2 = 10
            if (r1 == r2) goto L27
            r2 = 12
            if (r1 == r2) goto L27
            r2 = 13
            if (r1 == r2) goto L27
            r2 = 32
            if (r1 == r2) goto L27
            r1 = 0
            goto L2b
        L27:
            r8.H(r0)
            r1 = 1
        L2b:
            if (r1 != 0) goto L1
            int r1 = r8.f4099b
            int r2 = r8.c
            byte[] r4 = r8.f4098a
            int r5 = r1 + 2
            if (r5 > r2) goto L63
            int r5 = r1 + 1
            r1 = r4[r1]
            r6 = 47
            if (r1 != r6) goto L63
            int r1 = r5 + 1
            r5 = r4[r5]
            r7 = 42
            if (r5 != r7) goto L63
        L47:
            int r5 = r1 + 1
            if (r5 >= r2) goto L5b
            r1 = r4[r1]
            char r1 = (char) r1
            if (r1 != r7) goto L59
            r1 = r4[r5]
            char r1 = (char) r1
            if (r1 != r6) goto L59
            int r2 = r5 + 1
            r1 = r2
            goto L47
        L59:
            r1 = r5
            goto L47
        L5b:
            int r1 = r8.f4099b
            int r2 = r2 - r1
            r8.H(r2)
            r1 = 1
            goto L64
        L63:
            r1 = 0
        L64:
            if (r1 == 0) goto L67
            goto L1
        L67:
            r1 = 0
            goto L2
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo3.c(r42):void");
    }
}
