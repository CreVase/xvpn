package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0710Sq implements N5 {
    public static byte[] A01;
    public static String[] A02 = {"BdhBL09M4Kf5pZVFq3hu", "RvApnOP5TrfSVKNiPYUqrJes", "fe7XFV8kXqba2R6pM5eLN8KkTFIqEiwl", "blbqgiQJp6cs", "NwOGI73VJjSa3U5NpZL78Ksqq7LFe", "B8ngslNEnR5wDlhREJljtiUu", "QAhn6ShnFRB2OsCPxSM", "0DHDykPyyqwhMMlodysb3VmSPsGurPgY"};
    public final /* synthetic */ C0705Sl A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{76, 74, 92, 75, 102, 87, 88, 79, 80, 94, 88, 77, 80, 86, 87, 102, 80, 88, 91};
    }

    static {
        A01();
    }

    public C0710Sq(C0705Sl c0705Sl) {
        this.A00 = c0705Sl;
    }

    @Override // com.facebook.ads.redexgen.X.N5
    public final void ACG(String str) {
        C0561Mx c0561Mx;
        C0561Mx c0561Mx2;
        AbstractC0924aS abstractC0924aS;
        TJ tj;
        AbstractC0924aS abstractC0924aS2;
        TJ tj2;
        this.A00.A0U = false;
        c0561Mx = this.A00.A0I;
        c0561Mx.setProgress(100);
        c0561Mx2 = this.A00.A0I;
        LV.A0N(c0561Mx2, 8);
        abstractC0924aS = this.A00.A0G;
        if (abstractC0924aS.A0l()) {
            tj = this.A00.A0J;
            if (tj != null) {
                abstractC0924aS2 = this.A00.A0G;
                String A0Q = abstractC0924aS2.A0Q();
                if (!TextUtils.isEmpty(A0Q)) {
                    tj2 = this.A00.A0J;
                    tj2.loadUrl(A0Q);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.N5
    public final void ACI(String str) {
        C0561Mx c0561Mx;
        C0560Mw c0560Mw;
        boolean z;
        int i;
        this.A00.A0U = true;
        c0561Mx = this.A00.A0I;
        LV.A0N(c0561Mx, 0);
        c0560Mw = this.A00.A0H;
        c0560Mw.setUrl(str);
        z = this.A00.A0T;
        if (!z) {
            i = this.A00.A01;
            if (i > 1) {
                this.A00.A0T = true;
                this.A00.A0e(A00(0, 19, 51));
            }
        }
        C0705Sl.A03(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.N5
    public final void ACa(int i) {
        boolean z;
        C0561Mx c0561Mx;
        z = this.A00.A0U;
        if (z) {
            c0561Mx = this.A00.A0I;
            String[] strArr = A02;
            if (strArr[6].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[2] = "QY4HeEjZ5INYif1SeRyocKWTC9N0iQjQ";
            strArr2[7] = "IhWprrJJT2Yl4c8tLv2o4taD3peu2qkx";
            c0561Mx.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.N5
    public final void ACf(String str) {
        C0560Mw c0560Mw;
        c0560Mw = this.A00.A0H;
        c0560Mw.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.N5
    public final void ACh() {
        C0589Nz c0589Nz;
        c0589Nz = this.A00.A0L;
        c0589Nz.A09().AAl(14);
    }
}
