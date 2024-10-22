package com.facebook.ads.redexgen.X;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.io.Writer;

/* loaded from: assets/audience_network.dex */
public class LC extends Writer {
    public static String[] A03 = {"m3VYVt1tyYlWEg8H2HS3pUr0VsrhpbIN", "rEdvzR", "IUQqTrakmjCy7RtoUebGZ8YLkwuKbv7t", "x1ufNW", "e7NtJ1", "AK7iWzpXctzvcUrQA38QQTSmPkrm2HP", "25DCnOqD1cr08G9nl6wTfczykol7NaSA", "0bM1VBntYb2o4FFsMu8yzxmwObMsLmHM"};
    public int A00;
    public char[] A01 = new char[UserVerificationMethods.USER_VERIFY_ALL];
    public final LB A02;

    public LC(LB lb) {
        this.A02 = lb;
    }

    private void A00() {
        this.A02.ADy(new String(this.A01, 0, this.A00));
        this.A00 = 0;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        flush();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        if (this.A00 > 0) {
            A00();
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            String[] strArr = A03;
            String str = strArr[3];
            String str2 = strArr[1];
            int length = str.length();
            int i5 = str2.length();
            if (length != i5) {
                throw new RuntimeException();
            }
            A03[5] = "5m1TKypG4e5yu";
            if (i3 < i4) {
                if (cArr[i3] != '\n') {
                    int i6 = this.A00;
                    char[] cArr2 = this.A01;
                    int i7 = cArr2.length;
                    if (i6 != i7) {
                        cArr2[i6] = cArr[i3];
                        int i8 = i6 + 1;
                        this.A00 = i8;
                        i3++;
                    }
                }
                A00();
                i3++;
            } else {
                return;
            }
        }
    }
}
