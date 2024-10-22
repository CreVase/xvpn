package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Zp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0886Zp extends AbstractC00230p {
    public static byte[] A01;
    public static String[] A02 = {"7kSkrPID5YMo1WnvaMIgpKB6WIhQPZTc", "kYnVnFR0h3Yv", "", "4OZGrpocgzJPR2XOpe36kiptmUtlR1IY", "AELVZqmE3v", "ezzX0t3o6v3ClFiCUOYeN27kq8G", "mBbxV2ZqaJcWXY", "eL94qTtIFL"};
    public final /* synthetic */ C0884Zn A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 61);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-28, -13, -20, -53, -41, -42, -36, -38, -41, -44, -44, -51, -38, -120, -47, -37, -120, -42, -35, -44, -44};
    }

    static {
        A01();
    }

    public C0886Zp(C0884Zn c0884Zn) {
        this.A00 = c0884Zn;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00230p
    public final void A06() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A0A;
        s2SRewardedVideoAdExtendedListener.onRewardServerFailed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00230p
    public final void A07() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A0A;
        s2SRewardedVideoAdExtendedListener.onRewardServerSuccess();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00230p
    public final void A08() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A0A;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoCompleted();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00230p
    public final void A09() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A0A;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00230p
    public final void A0A() {
        RewardedVideoAd rewardedVideoAd;
        RewardedVideoAd rewardedVideoAd2;
        long j;
        RewardedVideoAd rewardedVideoAd3;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        LN ln;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd != null) {
            rewardedVideoAd2 = this.A00.A03;
            C01485n c01485n = (C01485n) rewardedVideoAd2.buildShowAdConfig();
            long currentTimeMillis = System.currentTimeMillis();
            j = this.A00.A02;
            c01485n.A02(currentTimeMillis - j);
            rewardedVideoAd3 = this.A00.A03;
            rewardedVideoAd3.show(c01485n.build());
            return;
        }
        s2SRewardedVideoAdExtendedListener = this.A00.A0A;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoClosed();
        ln = this.A00.A07;
        ln.A05();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00230p
    public final void A0C() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        AnonymousClass27 anonymousClass27;
        this.A00.A09.A0E().A2f();
        s2SRewardedVideoAdExtendedListener = this.A00.A0A;
        anonymousClass27 = this.A00.A0B;
        s2SRewardedVideoAdExtendedListener.onAdClicked(anonymousClass27.A00());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00230p
    public final void A0D() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        AnonymousClass27 anonymousClass27;
        s2SRewardedVideoAdExtendedListener = this.A00.A0A;
        anonymousClass27 = this.A00.A0B;
        s2SRewardedVideoAdExtendedListener.onLoggingImpression(anonymousClass27.A00());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00230p
    public final void A0F(InterfaceC00220o interfaceC00220o) {
        EV ev;
        AnonymousClass27 anonymousClass27;
        AnonymousClass27 anonymousClass272;
        EV ev2;
        C1C c1c;
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        AnonymousClass27 anonymousClass273;
        C1C c1c2;
        RewardedVideoAd rewardedVideoAd2;
        C1C c1c3;
        AnonymousClass27 anonymousClass274;
        RewardedVideoAd rewardedVideoAd3;
        C1C c1c4;
        AnonymousClass27 anonymousClass275;
        AnonymousClass27 anonymousClass276;
        AnonymousClass27 anonymousClass277;
        C1C c1c5;
        AnonymousClass27 anonymousClass278;
        ev = this.A00.A05;
        if (ev == null) {
            this.A00.A09.A07().A9M(A00(0, 3, 70), C01997x.A0N, new C02007y(A00(3, 18, 43)));
            return;
        }
        AbstractC0928aW abstractC0928aW = (AbstractC0928aW) interfaceC00220o;
        anonymousClass27 = this.A00.A0B;
        if (anonymousClass27.A03 != null) {
            anonymousClass278 = this.A00.A0B;
            abstractC0928aW.A02(anonymousClass278.A03);
        }
        anonymousClass272 = this.A00.A0B;
        int A0G = abstractC0928aW.A0G();
        String[] strArr = A02;
        if (strArr[4].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "61YjDYRNNN";
        strArr2[7] = "vT3ubuaNP5";
        anonymousClass272.A00 = A0G;
        this.A00.A08 = true;
        C0884Zn c0884Zn = this.A00;
        ev2 = c0884Zn.A05;
        c0884Zn.A04 = ev2.A0F();
        c1c = this.A00.A04;
        if (c1c != null) {
            int i = 0;
            c1c4 = this.A00.A04;
            if (!c1c4.A0h()) {
                c1c5 = this.A00.A04;
                i = ((AbstractC0924aS) c1c5).A0t();
            }
            if (i > 0) {
                C0491Kd chainer = new C0491Kd();
                YA ya = this.A00.A09;
                anonymousClass275 = this.A00.A0B;
                if (chainer.A09(ya, anonymousClass275.A06, i)) {
                    chainer.A08(this.A00.A09, true);
                    C0884Zn c0884Zn2 = this.A00;
                    YA ya2 = c0884Zn2.A09;
                    anonymousClass276 = this.A00.A0B;
                    String str = anonymousClass276.A0C;
                    anonymousClass277 = this.A00.A0B;
                    c0884Zn2.A03 = chainer.A07(ya2, str, anonymousClass277.A06);
                } else {
                    C0884Zn c0884Zn3 = this.A00;
                    String[] strArr3 = A02;
                    if (strArr3[4].length() != strArr3[7].length()) {
                        String[] strArr4 = A02;
                        strArr4[4] = "df15N9yr5s";
                        strArr4[7] = "rrfEFjVt4q";
                        chainer.A08(c0884Zn3.A09, false);
                    } else {
                        String[] strArr5 = A02;
                        strArr5[1] = "7AaEv1vCH3bw";
                        strArr5[5] = "Y1uo0lYkjhkOAjcvNvodbhiOq3C";
                        chainer.A08(c0884Zn3.A09, false);
                    }
                }
            }
        }
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A0A;
            anonymousClass273 = this.A00.A0B;
            s2SRewardedVideoAdExtendedListener.onAdLoaded(anonymousClass273.A00());
            return;
        }
        c1c2 = this.A00.A04;
        ((AbstractC0924aS) c1c2).A16(true);
        rewardedVideoAd2 = this.A00.A03;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled = rewardedVideoAd2.buildLoadAdConfig().withFailOnCacheFailureEnabled(true);
        c1c3 = this.A00.A04;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withRewardData = withFailOnCacheFailureEnabled.withRewardData(c1c3.A0J());
        anonymousClass274 = this.A00.A0B;
        RewardedVideoAd.RewardedVideoLoadAdConfig loadAdConfig = withRewardData.withAdExperience(anonymousClass274.A02).withAdListener(new RewardedVideoAdListener() { // from class: com.facebook.ads.redexgen.X.22
            @Override // com.facebook.ads.AdListener
            public final void onAdClicked(com.facebook.ads.Ad ad) {
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdLoaded(com.facebook.ads.Ad ad) {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                AnonymousClass27 anonymousClass279;
                s2SRewardedVideoAdExtendedListener2 = C0886Zp.this.A00.A0A;
                anonymousClass279 = C0886Zp.this.A00.A0B;
                s2SRewardedVideoAdExtendedListener2.onAdLoaded(anonymousClass279.A00());
            }

            @Override // com.facebook.ads.AdListener
            public final void onError(com.facebook.ads.Ad ad, AdError adError) {
                C1C c1c6;
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                AnonymousClass27 anonymousClass279;
                C0886Zp.this.A00.A03 = null;
                c1c6 = C0886Zp.this.A00.A04;
                ((AbstractC0924aS) c1c6).A16(false);
                s2SRewardedVideoAdExtendedListener2 = C0886Zp.this.A00.A0A;
                anonymousClass279 = C0886Zp.this.A00.A0B;
                s2SRewardedVideoAdExtendedListener2.onAdLoaded(anonymousClass279.A00());
            }

            @Override // com.facebook.ads.AdListener
            public final void onLoggingImpression(com.facebook.ads.Ad ad) {
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoClosed() {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                LN ln;
                s2SRewardedVideoAdExtendedListener2 = C0886Zp.this.A00.A0A;
                s2SRewardedVideoAdExtendedListener2.onRewardedVideoClosed();
                ln = C0886Zp.this.A00.A07;
                ln.A05();
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoCompleted() {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                s2SRewardedVideoAdExtendedListener2 = C0886Zp.this.A00.A0A;
                s2SRewardedVideoAdExtendedListener2.onRewardedVideoCompleted();
            }
        }).build();
        rewardedVideoAd3 = this.A00.A03;
        rewardedVideoAd3.loadAd(loadAdConfig);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00230p
    public final void A0G(JG jg) {
        AnonymousClass27 anonymousClass27;
        long j;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        AnonymousClass27 anonymousClass272;
        this.A00.A0E(true);
        anonymousClass27 = this.A00.A0B;
        C0S A0E = anonymousClass27.A0B.A0E();
        j = this.A00.A01;
        A0E.A2i(LM.A01(j), jg.A03().getErrorCode(), jg.A04());
        s2SRewardedVideoAdExtendedListener = this.A00.A0A;
        anonymousClass272 = this.A00.A0B;
        s2SRewardedVideoAdExtendedListener.onError(anonymousClass272.A00(), C0493Kf.A00(jg));
    }
}
