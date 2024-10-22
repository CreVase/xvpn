package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.Intent;
import android.provider.Settings;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class FA extends AbstractC0928aW {
    public static C6Q A0D;
    public static byte[] A0E;
    public static String[] A0F = {"YJVWhBFSVFKs7NrWmWULGh", "0GvTyPfIpVaCupDTXIuhVv", "vKmpQ0k2zgunQxdAFsx7Wlk6dmYtSCUc", "dqRYVPDeGy45RCRFCWIUPRHRtp9NBigI", "NSweCua6lZ8ChPFZ3cKnaOBscLcsrWLc", "HenZyTRrHhMHTWT00jKprDJGPW9d4C4V", "lvvcgtkpn6JHhS0LrJ19j3FN0lJsZZOv", "GmBDkEWrzwPugE8SLtTHysECIxUFQGpg"};
    public long A00;
    public AnonymousClass15 A01;
    public AnonymousClass16 A02;
    public C1C A03;
    public YA A04;
    public EnumC0479Jq A05;
    public C0597Oh A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public final String A0B = UUID.randomUUID().toString();
    public final AtomicBoolean A0C = new AtomicBoolean();

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0E = new byte[]{56, 52, 54, 54, 48, 57, 48, 39, 58, 56, 48, 33, 48, 39, 10, 39, 58, 33, 52, 33, 60, 58, 59, 108, 99, 82, 108, 110, 121, 100, 123, 100, 121, 116, 9, 2, 11, 3, 4, 15, 14, 43, 14, 46, 11, 30, 11, 40, 31, 4, 14, 6, 15, 68, 76, 77, 64, 72, 93, 64, 70, 71, 109, 72, 93, 72, 12, 16, 29, 31, 25, 17, 25, 18, 8, 53, 24, 87, 85, 66, 67, 66, 65, 78, 73, 66, 67, 104, 85, 78, 66, 73, 83, 70, 83, 78, 72, 73, 108, 66, 94, 4, 19, 7, 3, 19, 5, 2, 34, 31, 27, 19, 104, Byte.MAX_VALUE, 109, 123, 104, 126, 73, Byte.MAX_VALUE, 104, 108, Byte.MAX_VALUE, 104, 79, 72, 86, 25, 14, 28, 10, 25, 15, 14, 15, 61, 2, 15, 14, 4, 42, 15, 47, 10, 31, 10, 41, 30, 5, 15, 7, 14, 87, 64, 82, 68, 87, 65, 64, 65, 122, 83, 76, 65, 64, 74, 124, 103, 96, 120, 124, 108, 64, 109, 83, 76, 64, 82, 113, 92, 85, 64};
    }

    static {
        A08();
    }

    private void A06() {
        C00622c A00 = C00622c.A00(this.A04);
        AnonymousClass16 anonymousClass16 = this.A02;
        A00.A06(anonymousClass16, anonymousClass16.A00());
    }

    private void A07() {
        if (this.A02 != null) {
            try {
                C00622c.A00(this.A04).A05(this.A02);
            } catch (Exception unused) {
            }
        }
    }

    private void A09(Intent intent) {
        int i = super.A00;
        String A04 = A04(77, 24, 89);
        if (i != -1) {
            ContentResolver contentResolver = this.A04.getContentResolver();
            if (A0F[3].charAt(29) != 'i') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[7] = "ryaiaZaF8EzuUPZd67FeoIG9jUALGHZG";
            strArr[6] = "XITZtpYy2wf6QHmOozCOnY6Xlkm3ca51";
            if (Settings.System.getInt(contentResolver, A04(1, 22, 43), 0) != 1) {
                int i2 = super.A00;
                if (A0F[2].charAt(2) != 'm') {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0F;
                strArr2[1] = "mo2n49jFbf8CHvb7nubztA";
                strArr2[0] = "3h0LYrxRFByrgEG7Z48zJG";
                intent.putExtra(A04, i2);
                return;
            }
        }
        if (!IP.A0g(this.A04)) {
            intent.putExtra(A04, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B(YA ya, C0922aQ c0922aQ, int i) {
        if (i >= c0922aQ.A0q()) {
            return;
        }
        C0361Ey c0361Ey = (C0361Ey) c0922aQ.A0t(i);
        C6Q c6q = new C6Q(ya);
        A0D = c6q;
        c6q.A0d(new C0452In(c0361Ey.A11(), ya.A09()));
        C00501q.A02(ya, A0D, c0361Ey);
        A0D.A0W(new FB(this, i == 0, ya, c0361Ey, c0922aQ, i), new C6J(c0361Ey.A0R(), A04(152, 14, 91), i));
    }

    private void A0C(boolean z) {
        if (this.A05 == EnumC0479Jq.A0D) {
            A0E(z);
            return;
        }
        EnumC0479Jq enumC0479Jq = this.A05;
        String[] strArr = A0F;
        if (strArr[1].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[4] = "1yOiFacRiwJanRzqDJ6A5hJ77lYfziAe";
        strArr2[5] = "McEelBumOV7dKb1zb6BdvUT5HG6VvrgI";
        if (enumC0479Jq == EnumC0479Jq.A0F) {
            A0F(z);
        } else if (this.A05 == EnumC0479Jq.A0E) {
            A0D(z);
        } else {
            A0F(z);
        }
    }

    private void A0D(boolean z) {
        C6Q c6q = new C6Q(this.A04);
        boolean z2 = IP.A1j(this.A04) && C01515q.A0A(this.A03.A0U());
        if (z2) {
            C01515q unifiedAssetsLoader = new C01515q(c6q, this.A03.A0U(), this.A03.A0O(), this.A03.A0R(), z2, new C0934ac(this));
            c6q.A0d(new C0452In(((AbstractC0924aS) this.A03).A11(), this.A04.A09()));
            unifiedAssetsLoader.A0B();
            return;
        }
        C00491p.A02(this.A04, (AbstractC0924aS) this.A03, z, new C0933ab(this));
    }

    private void A0E(boolean z) {
        C6Q c6q = new C6Q(this.A04);
        c6q.A0d(new C0452In(((AbstractC0924aS) this.A03).A11(), this.A04.A09()));
        C00501q.A03(this.A04, c6q, (C0361Ey) this.A03);
        c6q.A0W(new C0938ag(this), new C6J(this.A03.A0R(), A04(152, 14, 91)));
    }

    private void A0F(boolean z) {
        boolean z2 = false;
        if (this.A03.A0h()) {
            C0922aQ c0922aQ = (C0922aQ) this.A03;
            for (int i = 0; i < c0922aQ.A0q(); i++) {
                if (TextUtils.isEmpty(c0922aQ.A0t(i).A0v().A0D().A08())) {
                    this.A01.ACq(this, AdError.INTERNAL_ERROR);
                    return;
                }
            }
            A0B(this.A04, c0922aQ, 0);
            return;
        }
        C6Q c6q = new C6Q(this.A04);
        c6q.A0d(new C0452In(((AbstractC0924aS) this.A03).A11(), this.A04.A09()));
        if (IP.A1j(this.A04) && C01515q.A0A(this.A03.A0U())) {
            z2 = true;
        }
        boolean A0k = this.A03.A0k();
        if (z2) {
            C01515q unifiedAssetsLoader = new C01515q(c6q, this.A03.A0U(), this.A03.A0O(), this.A03.A0R(), z2, new C0936ae(this, A0k));
            unifiedAssetsLoader.A0B();
            return;
        }
        C0361Ey c0361Ey = (C0361Ey) this.A03;
        if (TextUtils.isEmpty(c0361Ey.A0v().A0D().A08())) {
            this.A01.ACq(this, AdError.INTERNAL_ERROR);
        } else {
            C00501q.A02(this.A04, c6q, c0361Ey);
            c6q.A0W(new FC(this, z, A0k, c0361Ey, this), new C6J(c0361Ey.A0R(), A04(152, 14, 91)));
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0928aW
    public final int A0G() {
        C1C c1c = this.A03;
        if (c1c != null) {
            return c1c.A0G();
        }
        String[] strArr = A0F;
        if (strArr[4].charAt(5) == strArr[5].charAt(5)) {
            throw new RuntimeException();
        }
        A0F[3] = "zy8kAWNFspHhc9OUOOhBHMIK4AaCMilm";
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0928aW
    public final C1C A0H() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0928aW
    public final boolean A0I() {
        if (!this.A0C.get()) {
            return false;
        }
        this.A03.A0W(super.A01);
        String A03 = PU.A03(super.A02, this.A0B, this.A07);
        this.A03.A0X(super.A02);
        this.A03.A0a(A03);
        AdActivityIntent A04 = KN.A04(this.A04);
        A04.putExtra(A04(174, 8, 91), this.A05);
        A04.putExtra(A04(127, 25, 21), this.A03);
        A04.putExtra(A04(34, 19, 20), this.A03);
        A04.putExtra(A04(166, 8, 119), this.A0B);
        if (A03 != null) {
            A04.putExtra(A04(112, 15, 100), A03);
        }
        A04.putExtra(A04(66, 11, 2), this.A0A);
        A04.putExtra(A04(101, 11, 8), this.A00);
        String str = this.A09;
        if (str != null) {
            A04.putExtra(A04(53, 13, 87), str);
        }
        A09(A04);
        A04.setFlags(A04.getFlags() | 268435456);
        ActivityUtils.A03(this.A04);
        try {
            KN.A09(this.A04, A04);
        } catch (KL e) {
            Throwable cause = e.getCause();
            Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            this.A04.A07().A9M(A04(23, 11, 115), C01997x.A01, new C02007y(th));
        }
        String[] strArr = A0F;
        if (strArr[1].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[1] = "L0ou65zbaEHIK9W1EiRqjH";
        strArr2[0] = "MlzKsAmmQguOmiSj0COpPP";
        return true;
    }

    public final void A0J(YA ya, AnonymousClass15 anonymousClass15, C00521s c00521s, boolean z, String str, String str2) {
        this.A0C.set(false);
        this.A04 = ya;
        this.A01 = anonymousClass15;
        this.A0A = c00521s.A02();
        this.A00 = c00521s.A00();
        this.A09 = str2;
        String str3 = this.A0A;
        this.A07 = str3 != null ? str3.split(A04(0, 1, 25))[0] : A04(0, 0, 20);
        C1C A00 = C1C.A00(c00521s.A03(), this.A04);
        this.A03 = A00;
        A00.A0Y(str);
        this.A03.A0V(c00521s.A01().A06());
        if (this.A03.A0h()) {
            this.A08 = ((C0922aQ) this.A03).A0v();
        } else {
            AbstractC0924aS abstractC0924aS = (AbstractC0924aS) this.A03;
            String[] strArr = A0F;
            String str4 = strArr[7];
            String str5 = strArr[6];
            int experienceType = str4.charAt(31);
            if (experienceType != str5.charAt(31)) {
                String[] strArr2 = A0F;
                strArr2[7] = "FFkeuuVk1meHqgTyMiNT7tgr8739x7mc";
                strArr2[6] = "JwuXN3bqyC9CcnquHiHDyzq7R0rb3kLZ";
                this.A08 = abstractC0924aS.A11();
            } else {
                String[] strArr3 = A0F;
                strArr3[7] = "QuYSy7nqZhyT9avsyztjWhd8F7hW1wjU";
                strArr3[6] = "5b6UXiMlNaCol2aZqv4zpvCfEMtgCuxD";
                this.A08 = abstractC0924aS.A11();
            }
        }
        boolean A0k = this.A03.A0k();
        String[] strArr4 = A0F;
        if (strArr4[7].charAt(31) == strArr4[6].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr5 = A0F;
        strArr5[7] = "T6UzDEu82kzY1KsvV3iHB7OkWnIxnMBs";
        strArr5[6] = "PWXGgNcAlDXPEXP1mMx0dPQCA8p68UI5";
        if (A0k) {
            this.A05 = EnumC0479Jq.A07;
            if (this.A03.A0e()) {
                this.A04.A0E().AFV(EnumC00120d.A07);
            } else {
                this.A04.A0E().AFV(EnumC00120d.A09);
            }
        } else {
            switch (this.A03.A0F()) {
                case 0:
                    this.A05 = EnumC0479Jq.A0F;
                    C0S A0E2 = this.A04.A0E();
                    int experienceType2 = A0F[3].charAt(29);
                    if (experienceType2 != 105) {
                        A0F[3] = "i1vVIMuEE2CogviWDEosGc55NgD83ibP";
                        A0E2.AFV(EnumC00120d.A0C);
                        break;
                    } else {
                        A0F[2] = "e7mQJdX4ST7JevLzoIctPRomcGPYY6Su";
                        A0E2.AFV(EnumC00120d.A0C);
                        break;
                    }
                case 1:
                    this.A05 = EnumC0479Jq.A0E;
                    this.A04.A0E().AFV(EnumC00120d.A0B);
                    break;
                case 2:
                    this.A05 = EnumC0479Jq.A04;
                    this.A04.A0E().AFV(EnumC00120d.A04);
                    break;
                case 3:
                    this.A05 = EnumC0479Jq.A0D;
                    this.A04.A0E().AFV(EnumC00120d.A03);
                    break;
            }
        }
        if (IP.A0r(ya)) {
            if (this.A03.A0h()) {
                C0922aQ c0922aQ = (C0922aQ) this.A03;
                for (int A0q = c0922aQ.A0q() - 1; A0q >= 0; A0q--) {
                    AbstractC0924aS A0t = c0922aQ.A0t(A0q);
                    if (C00190k.A06(this.A04, C00190k.A01(ya, A0t.A0U(), A0t.A11()), ya.A09())) {
                        this.A04.A0E().A4H();
                        c0922aQ.A0x(A0q);
                        return;
                    }
                }
                if (c0922aQ.A0q() == 0) {
                    this.A01.ACq(this, AdError.NO_FILL);
                    return;
                }
            } else if (C00190k.A06(this.A04, C00190k.A01(ya, c00521s.A03(), ((AbstractC0924aS) this.A03).A11()), ya.A09())) {
                this.A04.A0E().A4H();
                this.A01.ACq(this, AdError.NO_FILL);
                return;
            }
        }
        this.A02 = new AnonymousClass16(this.A0B, this, anonymousClass15);
        A06();
        A0C(z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00220o
    public final String A6N() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00220o
    public final boolean AFs() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00220o
    public final void onDestroy() {
        A07();
    }
}
