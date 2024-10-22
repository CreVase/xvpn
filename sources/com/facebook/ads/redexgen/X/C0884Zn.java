package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.internal.api.AdCompanionView;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Zn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0884Zn implements AnonymousClass20 {
    public static byte[] A0C;
    public static String[] A0D = {"gd6Snq8TqC5qGLc", "5Vo8FrFWo5Fl4YG5W1yHT6ZfMsOXSACT", "HYpFHiAeuVvng5d4eXQK0awgijL0SEef", "zgL9OdntC9Jt", "c4pha1QVXZPHNWU", "oPtBq8V8zceab2K03f0YSkruz1vfGvQp", "tGZii7gSURWSZ1CI0FSKqsks", "YmWpveYB3lCv"};
    public static final String A0E;
    public long A02;
    public RewardedVideoAd A03;
    public C1C A04;
    public EV A05;
    public C0867Yv A06;
    public final YA A09;
    public final S2SRewardedVideoAdExtendedListener A0A;
    public final AnonymousClass27 A0B;
    public int A00 = 0;
    public boolean A08 = false;
    public long A01 = -1;
    public LN A07 = new LN();

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0C = new byte[]{120, 87, 25, 88, 93, 25, 85, 86, 88, 93, 25, 80, 74, 25, 88, 85, 75, 92, 88, 93, 64, 25, 80, 87, 25, 73, 75, 86, 94, 75, 92, 74, 74, 23, 25, 96, 86, 76, 25, 74, 81, 86, 76, 85, 93, 25, 78, 88, 80, 77, 25, 95, 86, 75, 25, 88, 93, 117, 86, 88, 93, 92, 93, 17, 16, 25, 77, 86, 25, 91, 92, 25, 90, 88, 85, 85, 92, 93, 47, 24, 24, 5, 24, 74, 6, 5, 11, 14, 3, 4, 13, 74, 24, 15, 29, 11, 24, 14, 15, 14, 74, 28, 3, 14, 15, 5, 74, 11, 14, 92, 77, 84};
        if (A0D[6].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A0D;
        strArr[4] = "OGOVhUIoezz1oHK";
        strArr[0] = "xl2MkcRK0CWEWUY";
    }

    static {
        A0B();
        A0E = C0884Zn.class.getSimpleName();
    }

    public C0884Zn(AnonymousClass27 anonymousClass27, C2A c2a, String str) {
        this.A0B = anonymousClass27;
        this.A09 = anonymousClass27.A0B;
        this.A0A = new C0878Zg(str, c2a, this, anonymousClass27);
    }

    private void A0D(String str, AdExperienceType adExperienceType, boolean z) {
        String A02;
        if (!this.A08 && this.A05 != null) {
            Log.w(A0E, A0A(0, 78, 100));
        }
        A0E(false);
        this.A08 = false;
        C00511r c00511r = new C00511r(this.A0B.A0C, JL.A06, AdPlacementType.REWARDED_VIDEO, JJ.A07, 1);
        c00511r.A08(z);
        if (IP.A24(this.A09) && (A02 = C0491Kd.A02(this.A09, this.A0B.A06)) != null) {
            AnonymousClass27 anonymousClass27 = this.A0B;
            String[] strArr = A0D;
            String extraHints = strArr[2];
            if (extraHints.charAt(28) != strArr[1].charAt(28)) {
                throw new RuntimeException();
            }
            A0D[6] = "NRWBzlFLQPOGySbiiYXSLDN6";
            anonymousClass27.A06 = A02;
        }
        c00511r.A06(this.A0B.A06);
        c00511r.A07(this.A0B.A07);
        EV ev = new EV(this.A0B.A0B, c00511r);
        this.A05 = ev;
        ev.A0O(new C0886Zp(this));
        this.A05.A0S(str, adExperienceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(boolean z) {
        EV ev = this.A05;
        if (ev != null) {
            ev.A0O(new C0885Zo(this));
            this.A05.A0T(z);
            this.A05 = null;
        }
    }

    public final long A0G() {
        EV ev = this.A05;
        if (ev != null) {
            return ev.A0D();
        }
        return -1L;
    }

    public final void A0H() {
        A0E(true);
    }

    public final void A0I() {
        C0867Yv c0867Yv = this.A06;
        if (c0867Yv != null) {
            c0867Yv.A02();
        }
    }

    public final void A0J(RewardData rewardData) {
        EV ev;
        this.A0B.A03 = rewardData;
        if (this.A08 && (ev = this.A05) != null) {
            ev.A0V(rewardData);
        }
    }

    public final void A0K(AdCompanionView adCompanionView) {
        C1C c1c;
        C0867Yv c0867Yv = (C0867Yv) adCompanionView.getAdCompanionViewApi();
        this.A06 = c0867Yv;
        YA ya = this.A09;
        if (ya != null && (c1c = this.A04) != null) {
            c0867Yv.A03(ya, (AbstractC0924aS) c1c);
        }
    }

    public final void A0L(String str, AdExperienceType adExperienceType, boolean z) {
        this.A01 = System.currentTimeMillis();
        try {
            A0D(str, adExperienceType, z);
        } catch (Exception e) {
            Log.e(A0E, A0A(78, 31, 55), e);
            this.A0B.A0B.A07().A9M(A0A(109, 3, 96), C01997x.A0b, new C02007y(e));
            AdError internalError = AdError.internalError(2004);
            this.A0B.A0B.A0E().A2i(LM.A01(this.A01), internalError.getErrorCode(), internalError.getErrorMessage());
            this.A0A.onError(this.A0B.A00(), internalError);
        }
    }

    public final boolean A0M() {
        EV ev = this.A05;
        return ev == null || ev.A0U();
    }

    public final boolean A0N() {
        return this.A08;
    }

    public final boolean A0O(int i, long j) {
        if (!this.A08) {
            this.A0A.onError(this.A0B.A00(), AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            return false;
        }
        if (this.A05 != null) {
            this.A02 = System.currentTimeMillis();
            this.A05.A07.A02(i);
            this.A05.A07.A03(j);
            this.A05.A0I();
            this.A08 = false;
            return true;
        }
        this.A08 = false;
        return false;
    }
}
