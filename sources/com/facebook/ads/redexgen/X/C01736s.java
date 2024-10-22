package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C01736s extends MI {
    public static byte[] A01;
    public final /* synthetic */ C01726r A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-7, 13, -4, 1, 7};
    }

    public C01736s(C01726r c01726r) {
        this.A00 = c01726r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:            if (r0.get() == null) goto L6;     */
    @Override // com.facebook.ads.redexgen.X.AbstractC02028a
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A03(com.facebook.ads.redexgen.X.MJ r5) {
        /*
            r4 = this;
            com.facebook.ads.redexgen.X.6r r0 = r4.A00
            java.lang.ref.WeakReference r0 = com.facebook.ads.redexgen.X.C01726r.A03(r0)
            if (r0 == 0) goto L14
            com.facebook.ads.redexgen.X.6r r0 = r4.A00
            java.lang.ref.WeakReference r0 = com.facebook.ads.redexgen.X.C01726r.A03(r0)
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L23
        L14:
            com.facebook.ads.redexgen.X.6r r2 = r4.A00
            com.facebook.ads.redexgen.X.Pt r1 = new com.facebook.ads.redexgen.X.Pt
            r1.<init>(r4)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            com.facebook.ads.redexgen.X.C01726r.A04(r2, r0)
        L23:
            com.facebook.ads.redexgen.X.6r r0 = r4.A00
            android.content.Context r0 = r0.getContext()
            android.content.Context r3 = r0.getApplicationContext()
            r2 = 0
            r1 = 5
            r0 = 34
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.Object r3 = r3.getSystemService(r0)
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            com.facebook.ads.redexgen.X.6r r0 = r4.A00
            java.lang.ref.WeakReference r0 = com.facebook.ads.redexgen.X.C01726r.A03(r0)
            java.lang.Object r2 = r0.get()
            android.media.AudioManager$OnAudioFocusChangeListener r2 = (android.media.AudioManager.OnAudioFocusChangeListener) r2
            r1 = 3
            r0 = 1
            r3.requestAudioFocus(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C01736s.A03(com.facebook.ads.redexgen.X.MJ):void");
    }
}
