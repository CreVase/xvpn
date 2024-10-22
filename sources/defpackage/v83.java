package defpackage;

import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class v83 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f4794a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static char[] f4795b = new char[24];

    public static void a(long j, PrintWriter printWriter) {
        synchronized (f4794a) {
            printWriter.print(new String(f4795b, 0, b(j)));
        }
    }

    public static int b(long j) {
        char c;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        if (f4795b.length < 0) {
            f4795b = new char[0];
        }
        char[] cArr = f4795b;
        if (j == 0) {
            cArr[0] = '0';
            return 1;
        }
        if (j > 0) {
            c = '+';
        } else {
            j = -j;
            c = '-';
        }
        int i5 = (int) (j % 1000);
        int floor = (int) Math.floor(j / 1000);
        if (floor > 86400) {
            i = floor / 86400;
            floor -= 86400 * i;
        } else {
            i = 0;
        }
        if (floor > 3600) {
            i2 = floor / 3600;
            floor -= i2 * 3600;
        } else {
            i2 = 0;
        }
        if (floor > 60) {
            int i6 = floor / 60;
            i3 = floor - (i6 * 60);
            i4 = i6;
        } else {
            i3 = floor;
            i4 = 0;
        }
        cArr[0] = c;
        int c2 = c(cArr, i, 'd', 1, false, 0);
        if (c2 != 1) {
            z = true;
        } else {
            z = false;
        }
        int c3 = c(cArr, i2, 'h', c2, z, 0);
        if (c3 != 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int c4 = c(cArr, i4, 'm', c3, z2, 0);
        if (c4 != 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int c5 = c(cArr, i5, 'm', c(cArr, i3, 's', c4, z3, 0), true, 0);
        cArr[c5] = 's';
        return c5 + 1;
    }

    public static int c(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (z || i > 0) {
            if ((z && i3 >= 3) || i > 99) {
                int i5 = i / 100;
                cArr[i2] = (char) (i5 + 48);
                i4 = i2 + 1;
                i -= i5 * 100;
            } else {
                i4 = i2;
            }
            if ((z && i3 >= 2) || i > 9 || i2 != i4) {
                int i6 = i / 10;
                cArr[i4] = (char) (i6 + 48);
                i4++;
                i -= i6 * 10;
            }
            cArr[i4] = (char) (i + 48);
            int i7 = i4 + 1;
            cArr[i7] = c;
            return i7 + 1;
        }
        return i2;
    }
}
