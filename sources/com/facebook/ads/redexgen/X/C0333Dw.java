package com.facebook.ads.redexgen.X;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* renamed from: com.facebook.ads.redexgen.X.Dw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0333Dw extends Y6<String> {
    public static byte[] A08;
    public static String[] A09 = {"l", "T0JdG9ZEnLfTeCeftC9G7d8cUsVG3XZb", "aLcPLzyPnyiGnlL0eBnocVG2Im", "W3EwFUE7CvVeZV", "t2q4fu0Y0bIBimY2SigNyotMmunbmEsF", "TUpEXXUjgi8xLksArOVlucAVZCM", "AqOn5F5Mae0spU5kh0gbanyLcs", "chqW8UrgIl8Ef4OOKimE4h"};
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C7b A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ Map A07;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{-112, -115, -96, -115, -114, -115, -97, -111};
    }

    static {
        A02();
    }

    public C0333Dw(C7b c7b, String str, String str2, int i, double d, double d2, String str3, Map map) {
        this.A03 = c7b;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = i;
        this.A01 = d;
        this.A00 = d2;
        this.A04 = str3;
        this.A07 = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C7e
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final String A03() {
        Y9 y9;
        Lock lock;
        Y9 y92;
        Lock lock2;
        Y9 y93;
        Lock lock3;
        Y9 y94;
        Y8 y8;
        Y7 y7;
        Lock lock4;
        Y9 y95;
        String A01 = A01(0, 8, 12);
        y9 = this.A03.A01;
        y9.A07().A8b(this.A06);
        if (TextUtils.isEmpty(this.A05)) {
            return null;
        }
        lock = C7b.A08;
        lock.lock();
        String[] strArr = A09;
        if (strArr[6].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[1] = "mqnyRlomjFPPGlBu5iJ3A4HRnrnsorAH";
        strArr2[4] = "vLAqNnzkqKgbXCY8NZfbbPBhHyGRm9s6";
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabase = this.A03.A0E();
                sQLiteDatabase.beginTransaction();
                y8 = this.A03.A02;
                y7 = this.A03.A03;
                String A0E = y8.A0E(y7.A0C(this.A05), this.A02, this.A06, this.A01, this.A00, this.A04, this.A07);
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e) {
                        y95 = this.A03.A01;
                        y95.A07().A9M(A01, C01997x.A0z, new C02007y(e));
                    }
                }
                lock4 = C7b.A08;
                lock4.unlock();
                return A0E;
            } catch (Exception e2) {
                A01(EnumC01827d.A06);
                y92 = this.A03.A01;
                y92.A07().A9M(A01, C01997x.A0y, new C02007y(e2));
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e3) {
                        y93 = this.A03.A01;
                        y93.A07().A9M(A01, C01997x.A0z, new C02007y(e3));
                    }
                }
                lock2 = C7b.A08;
                lock2.unlock();
                return null;
            }
        } catch (Throwable th) {
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                try {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                } catch (Exception e4) {
                    y94 = this.A03.A01;
                    y94.A07().A9M(A01, C01997x.A0z, new C02007y(e4));
                }
            }
            lock3 = C7b.A08;
            lock3.unlock();
            throw th;
        }
    }
}
