package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class UB extends K8 {
    public static byte[] A02;
    public static String[] A03 = {"jAsZfZwQ15YE1xm95Uum6vWOaDH1Az8A", "fi77qJmjg5Rwb", "EORDPJJatEjTyV", "9q4WoxWSHvvys", "ZnqFv4LDFQ916SUcrxzb43hFVVFJOLFp", "nu1Fhr1q5Uq1RKDrD4GP42DLl0Uj", "wJhiR1cxoop1phUk5wYOXEGX7ooerIC3", "cvoiCCK"};
    public final /* synthetic */ C0470Jg A00;
    public final /* synthetic */ C0472Jj A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 119);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{10, 75, 89, 68, 71, 72, 72, 67, 84, 89, 77, 67, 95, 101, 68, 11, 69, 78, 95, 92, 68, 89, 64, 11, 72, 68, 69, 69, 78, 72, 95, 66, 68, 69};
    }

    static {
        A02();
    }

    public UB(C0472Jj c0472Jj, C0470Jg c0470Jg) {
        this.A01 = c0472Jj;
        this.A00 = c0470Jg;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        YA ya;
        YA ya2;
        YA ya3;
        YA ya4;
        YA ya5;
        long j;
        YA ya6;
        String str;
        Map<String, String> adRequestParameters;
        InterfaceC0650Qi A022;
        YA ya7;
        YA ya8;
        YA ya9;
        YA ya10;
        long j2;
        ya = this.A01.A04;
        if (LK.A00(ya) != LJ.A07) {
            ya2 = this.A01.A04;
            AnonymousClass86.A08(ya2);
            ya3 = this.A01.A04;
            AnonymousClass62.A07(ya3);
            C0470Jg c0470Jg = this.A00;
            C8S A00 = C8S.A00();
            ya4 = this.A01.A04;
            boolean z = true;
            Map<String, String> A08 = c0470Jg.A08(A00.A01(ya4, true).A0C());
            this.A01.A02 = A08;
            try {
                ya7 = this.A01.A04;
                PackageManager packageManager = ya7.getPackageManager();
                if (packageManager != null) {
                    String A002 = A00(1, 12, 113);
                    StringBuilder sb = new StringBuilder();
                    ya8 = this.A01.A04;
                    StringBuilder append = sb.append(ya8.getPackageName()).append(A00(0, 1, 93));
                    ya9 = this.A01.A04;
                    A08.put(A002, new String(Base64.encode(append.append(packageManager.getInstallerPackageName(ya9.getPackageName())).toString().getBytes(), 2)));
                }
            } catch (Exception unused) {
            }
            try {
                if (this.A00.A05() != JL.A03 && this.A00.A05() != JL.A05 && this.A00.A05() != JL.A04 && this.A00.A05() != null) {
                    z = false;
                }
                ya6 = this.A01.A04;
                InterfaceC0649Qh A023 = C0667Qz.A02(z, ya6);
                str = this.A01.A06;
                C0663Qv c0663Qv = new C0663Qv();
                adRequestParameters = this.A01.A02;
                byte[] A082 = c0663Qv.A05(adRequestParameters).A08();
                A022 = this.A01.A02(LM.A00(), this.A00);
                A023.ADq(str, A082, A022);
                return;
            } catch (Exception e) {
                AdErrorType adRequestFailed = AdErrorType.AD_REQUEST_FAILED;
                String message = e.getMessage();
                ya5 = this.A01.A04;
                C0S A0E = ya5.A0E();
                if (A03[5].length() == 14) {
                    throw new RuntimeException();
                }
                String[] strArr = A03;
                strArr[3] = "KP51TgwZ8p9oo";
                strArr[2] = "i0Q8y5VFLDaPT7";
                j = this.A01.A00;
                A0E.A2r(LM.A01(j), adRequestFailed.getErrorCode(), message, adRequestFailed.isPublicError());
                this.A01.A0D(JG.A01(adRequestFailed, message));
                return;
            }
        }
        this.A01.A09();
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String errorMessage = A00(13, 21, 92);
        ya10 = this.A01.A04;
        C0S A0E2 = ya10.A0E();
        j2 = this.A01.A00;
        A0E2.A2r(LM.A01(j2), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A01.A0D(new JG(adErrorType, errorMessage));
    }
}
