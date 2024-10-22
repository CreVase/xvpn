package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ud, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0748Ud extends K8 {
    public static byte[] A06;
    public static String[] A07 = {"ht2nqOphSkGWhcwEDJi", "8e", "VxeFEfzR5TcwmAdrX4F41ND1Y53QMf69", "I5e6pVtTI36knP1S0AklK89IwpeF3gSj", "5FC5pgnei71RKYYZI1kA418znceUrhge", "dl", "F6vYuzA0zSJD8ZvCMyLH6KoHAiWxL7nL", "PkmJbNAHESzTXEgw33lH9qLKsuvyCSGl"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ C0747Uc A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {30, 32, 49, 50, 30, 41, 28, 49, 38, 42, 34, 48, 49, 30, 42, 45, 63, 72, 69, 65, 74, 80, 59, 61, 76, 69, 59, 82, 65, 78, 79, 69, 75, 74, 48, 60, 58, -5, 51, 46, 48, 50, 47, 60, 60, 56, -5, 56, 46, 65, 46, 59, 46, -5, 61, 63, 60, 67, 54, 49, 50, 63, -5, 22, 59, 64, 65, 46, 57, 57, 31, 50, 51, 50, 63, 63, 50, 63, 29, 63, 60, 67, 54, 49, 50, 63, 5, 17, 16, 22, 7, 16, 22, -36, -47, -47, 5, 17, 15, -48, 8, 3, 5, 7, 4, 17, 17, 13, -48, 13, 3, 22, 3, 16, 3, -48, 18, 20, 17, 24, 11, 6, 7, 20, -48, -21, 16, 21, 22, 3, 14, 14, -12, 7, 8, 7, 20, 20, 7, 20, -14, 20, 17, 24, 11, 6, 7, 20, -47, 59, 64, 69, 70, 51, 62, 62, 49, 68, 55, 56, 55, 68, 68, 55, 68, 66, 76, 56, 60, 77, -2, -17, -15, -7, -17, -11, -13, -19, -4, -17, -5, -13};
        String[] strArr = A07;
        if (strArr[3].charAt(3) == strArr[2].charAt(3)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[3] = "job85majakbps8FhelyinU82maIeQz0H";
        strArr2[2] = "0P3hhYaEnra7OBRV2NrCSNwBS2Mryfib";
        A06 = bArr;
    }

    static {
        A02();
    }

    public C0748Ud(C0747Uc c0747Uc, String str, boolean z, String str2, String str3, long j) {
        this.A01 = c0747Uc;
        this.A02 = str;
        this.A05 = z;
        this.A04 = str2;
        this.A03 = str3;
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        Context context;
        Context context2;
        context = this.A01.A00;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            context2 = this.A01.A00;
            ContentResolver contentResolver = context2.getContentResolver();
            if (contentResolver == null || packageManager.resolveContentProvider(A00(34, 52, 84), 0) == null) {
                return;
            }
            Uri parse = Uri.parse(A00(86, 63, 41) + this.A02);
            ContentValues contentValues = new ContentValues();
            contentValues.put(A00(16, 18, 99), (Integer) 1);
            contentValues.put(A00(165, 5, 96), Boolean.valueOf(this.A05));
            contentValues.put(A00(149, 16, 89), this.A04);
            contentValues.put(A00(170, 12, 21), this.A03);
            contentValues.put(A00(0, 16, 68), Long.valueOf(this.A00));
            try {
                contentResolver.insert(parse, contentValues);
            } catch (UnsupportedOperationException unused) {
            }
        }
    }
}
