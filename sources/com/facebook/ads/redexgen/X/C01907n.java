package com.facebook.ads.redexgen.X;

import android.os.Process;
import android.text.TextUtils;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.7n, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01907n implements Thread.UncaughtExceptionHandler {
    public static byte[] A04;
    public final Y9 A00;
    public final InterfaceC01967u A01;
    public final Thread.UncaughtExceptionHandler A02;
    public final Map<String, String> A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 65);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{42, 28, 94, 122, 96, 96, 122, 125, 116, 51, 80, 124, 125, 103, 118, 107, 103, 11, 7, 5, 70, 14, 9, 11, 13, 10, 7, 7, 3, 70, 9, 12, 27, 71, 86, 69, 87, 76, 20, 18, 5, 19, 30, 23, 2, 80, 86, 65, 87, 90, 83, 70, 124, 64, 76, 71, 70};
    }

    public C01907n(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Y9 y9, InterfaceC01897m interfaceC01897m) {
        this(uncaughtExceptionHandler, y9, interfaceC01897m, C01977v.A00());
    }

    public C01907n(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Y9 y9, InterfaceC01897m interfaceC01897m, InterfaceC01967u interfaceC01967u) {
        this.A02 = uncaughtExceptionHandler;
        if (y9 != null) {
            this.A00 = y9;
            this.A03 = interfaceC01897m.A7r(y9);
            this.A01 = interfaceC01967u;
            return;
        }
        throw new IllegalArgumentException(A00(2, 15, 82));
    }

    public static void A02() {
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        try {
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }

    private void A03(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A02;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            A02();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            String A03 = LD.A03(this.A00, th);
            if (!TextUtils.isEmpty(A03)) {
                String stackTraceString = A00(17, 16, 41);
                if (A03.contains(stackTraceString)) {
                    Map<String, String> A02 = new C01887l(A03, this.A03).A02();
                    String A00 = A00(38, 7, 38);
                    String stackTraceString2 = A00(33, 5, 101);
                    A02.put(A00, stackTraceString2);
                    Throwable A002 = AbstractRunnableC0483Jv.A00();
                    String A003 = A00(45, 12, 98);
                    if (A002 != th) {
                        String stackTraceString3 = A00(0, 1, 91);
                        A02.put(A003, stackTraceString3);
                    } else {
                        String stackTraceString4 = A00(1, 1, 108);
                        A02.put(A003, stackTraceString4);
                    }
                    this.A01.AGU(new AnonymousClass81(this.A00.A08().A01(), this.A00.A08().A02(), A02), this.A00);
                    if (IP.A1g(this.A00)) {
                        IP.A0d(this.A00);
                    }
                }
            }
        } catch (Exception unused) {
        }
        A03(thread, th);
    }
}
