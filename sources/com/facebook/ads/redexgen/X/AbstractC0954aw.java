package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0954aw extends AbstractC00150g {
    public static String A03;
    public static String A04;
    public static String A05;
    public static byte[] A06;
    public static String[] A07 = {"1", "OJ2IOsbUnCKybSqk53zM3JXcifahO", "e4RldewFXKwYCBzcZ5CwWZ5XjhlRHNiJ", "729G42gqUNiz5ZAUAxRhvFZ2YWMhTd0L", "J1Ql0tv9onNfDvsMKNTgjNyaDa6Pnzub", "9fBm", "mbPUpspz4Nj5AFGqwEe2w9x9WWs", "2uSYGuFAJgr"};
    public final boolean A00;
    public final C00210n A01;
    public final boolean A02;

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 30);
            if (A07[3].charAt(0) != '7') {
                throw new RuntimeException();
            }
            A07[5] = "PWjD";
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A06 = new byte[]{93, 114, 119, 125, 117, 62, 114, 113, 121, 121, 123, 122, 68, 75, 65, 87, 74, 76, 65, 11, 76, 75, 81, 64, 75, 81, 11, 68, 70, 81, 76, 74, 75, 11, 115, 108, 96, 114, 24, 27, 25, 17, 37, 14, 19, 23, 31, 46, 39, 35, 52, 39, 29, 54, 43, 47, 39, 11, 17, 16, 7, 11, 9, 1, 37, 35, 53, 53, 51, 37, 37, 76, 87, 80, 79, 92, 75, 74, 88, 85, 102, 85, 80, 87, 82, 89, 95, 73, 94, 115, 88, 94, 77, 79, 71, 73, 94, 115, 69, 95, 115, 66, 67, 88, 115, 66, 89, 64, 64, 75, 93, 72, 95, 84, 99, 93, 82, 88, 99, 94, 78, 83, 75, 79, 89};
    }

    public abstract void A0D();

    static {
        A0B();
        A03 = A0A(64, 7, 72);
        A04 = A0A(85, 24, 50);
        A05 = A0A(109, 16, 34);
    }

    public AbstractC0954aw(YA ya, InterfaceC0444If interfaceC0444If, String str, C00210n c00210n, boolean z) {
        this(ya, interfaceC0444If, str, c00210n, z, false);
    }

    public AbstractC0954aw(YA ya, InterfaceC0444If interfaceC0444If, String str, C00210n c00210n, boolean z, boolean z2) {
        super(ya, interfaceC0444If, str);
        this.A01 = c00210n;
        this.A02 = z;
        this.A00 = z2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00150g
    public final void A0C() {
        C00210n c00210n = this.A01;
        if (c00210n != null) {
            c00210n.A07(super.A02);
        }
        A0D();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:            if (r4 != false) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:            r3 = r7.A01;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:            if (com.facebook.ads.redexgen.X.AbstractC0954aw.A07[6].length() == 8) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:            r2 = com.facebook.ads.redexgen.X.AbstractC0954aw.A07;        r2[2] = "42brCgECckKxVuTsLxKp6fXlInYi7mUj";        r2[4] = "SJ7s8Rg0tKhfkKPQamVQVBa2w2xrx0QV";        r3.A05();     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:            r3.A05();     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:            if (r4 != false) goto L21;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0E(java.util.Map<java.lang.String, java.lang.String> r8, com.facebook.ads.redexgen.X.EnumC00140f r9) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC0954aw.A0E(java.util.Map, com.facebook.ads.redexgen.X.0f):void");
    }

    public final boolean A0F(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter(A0A(71, 14, 39));
            if (TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            String universalLink = A0A(12, 26, 59);
            Intent launchIntent = new Intent(universalLink, C0490Kc.A00(queryParameter));
            launchIntent.addFlags(268435456);
            if (Build.VERSION.SDK_INT >= 30) {
                launchIntent.addFlags(UserVerificationMethods.USER_VERIFY_ALL);
            }
            boolean redirectedToApp = KN.A0B(super.A00, launchIntent);
            return redirectedToApp;
        } catch (KL unused) {
            return false;
        }
    }
}
