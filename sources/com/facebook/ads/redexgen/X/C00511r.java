package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdExperienceType;
import com.facebook.ads.AdSettings;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.1r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C00511r {
    public static String[] A0D = {"erlsxJKV5RGKo0fyhsjft4C8myFkBTFD", "xxCOSS58nTJL4g358MAx2boWparhVsnt", "50HA7KO7TX73z1", "kwTSvTyvqMkAeNvnsZNufhK8xoNKpC5A", "CvvJJ5wn5WoPjh", "PJeUG8MSArG13FCqdbuWaTyquTMQa3YW", "KbVXHt7uQSAfPtAdYM2eE220TAgmiqZ3", "QWgxf2msfb1fWKXeTjGnwNJbVHOPLzwf"};
    public int A00;
    public long A01;
    public RewardData A02;
    public EnumC0463Iy A03;
    public String A04;
    public String A05;
    public boolean A06;
    public final JJ A07;
    public final JL A08;
    public final String A09;
    public final EnumSet<CacheFlag> A0A;
    public final int A0B;
    public final AdPlacementType A0C;

    public C00511r(String str, JL jl, AdPlacementType adPlacementType, JJ jj, int i) {
        this(str, jl, adPlacementType, jj, i, EnumSet.of(CacheFlag.NONE));
    }

    public C00511r(String str, JL jl, AdPlacementType adPlacementType, JJ jj, int i, EnumSet<CacheFlag> cacheFlags) {
        this.A09 = str;
        this.A0C = adPlacementType;
        this.A07 = jj;
        this.A0B = i;
        this.A0A = cacheFlags;
        this.A08 = jl;
        this.A00 = -1;
    }

    public final AdPlacementType A00() {
        AdPlacementType adPlacementType = this.A0C;
        if (adPlacementType != null) {
            return adPlacementType;
        }
        JJ jj = this.A07;
        if (jj == null) {
            return AdPlacementType.NATIVE;
        }
        if (jj == JJ.A07) {
            return AdPlacementType.INTERSTITIAL;
        }
        return AdPlacementType.BANNER;
    }

    public final C0470Jg A01(YA ya, JQ jq, AdExperienceType adExperienceType) {
        L7 l7;
        String str;
        String str2 = this.A09;
        JJ jj = this.A07;
        if (jj != null) {
            l7 = new L7(jj.A03(), this.A07.A02());
        } else {
            l7 = null;
        }
        JL jl = this.A08;
        if (AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT) {
            str = AdSettings.getTestAdType().getAdTypeString();
        } else {
            str = null;
        }
        C0470Jg c0470Jg = new C0470Jg(ya, str2, l7, jl, str, this.A0B, AdSettings.isTestMode(ya), AdSettings.isMixedAudience(), jq, LD.A01(IP.A0J(ya)), this.A04, adExperienceType != null ? adExperienceType.getAdExperienceType() : null);
        String[] strArr = A0D;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[0] = "1YKhexqCB6oyofjWexJTrFb8PReFz0lW";
        strArr2[3] = "PDYLpd11u8hpbIrKg4rw9QV8MRNrtAlX";
        return c0470Jg;
    }

    public final void A02(int i) {
        this.A00 = i;
    }

    public final void A03(long j) {
        this.A01 = j;
    }

    public final void A04(RewardData rewardData) {
        this.A02 = rewardData;
    }

    public final void A05(EnumC0463Iy enumC0463Iy) {
        this.A03 = enumC0463Iy;
    }

    public final void A06(String str) {
        this.A04 = str;
    }

    public final void A07(String str) {
        this.A05 = str;
    }

    public final void A08(boolean z) {
        this.A06 = z;
    }
}
