package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Nh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0571Nh extends LinearLayout {
    public static String[] A05 = {"JiUd07qZ", "phaLMHqUBlp6P5RZzzm", "VtPMRXbuUkVLmtGCwM", "RgvNiIo52t", "FYi9K2JmgPw1hqWSXD3EPgcEPQmLRiB", "yPPKnDMDveXTdnfoUUkFxo3t2NtgVDwK", "Cr", "5lHXxybE2bQiDNmNKuHItJ8Sueck67l"};
    public int A00;
    public List<GradientDrawable> A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public C0571Nh(YA ya, C1M c1m, int i) {
        super(ya);
        this.A00 = -1;
        setOrientation(0);
        setGravity(17);
        float f = C0506Ku.A02;
        int i2 = (int) (8.0f * f);
        int i3 = (int) (6.0f * f);
        this.A02 = (int) (1.0f * f);
        int A04 = c1m.A04(false);
        this.A04 = A04;
        this.A03 = C00632d.A01(A04, 128);
        this.A01 = new ArrayList();
        for (int margin = 0; margin < i; margin++) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setSize(i2, i2);
            gradientDrawable.setStroke(this.A02, 0);
            ImageView imageView = new ImageView(ya);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, i3, 0);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageDrawable(gradientDrawable);
            this.A01.add(gradientDrawable);
            addView(imageView);
        }
        A00(0);
    }

    /* JADX WARN: Incorrect condition in loop: B:9:0x0027 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A00(int r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            if (r0 != r6) goto L5
            return
        L5:
            r5.A00 = r6
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0571Nh.A05
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 22
            if (r1 == r0) goto L5a
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0571Nh.A05
            java.lang.String r1 = "BJqXxH8n0fuaHx3JVwGHjWVcPjmBGjI"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "ZUGfW6Md7SIL60yz7Eq8Bq3LU56iFcm"
            r0 = 7
            r2[r0] = r1
            r4 = 0
        L21:
            java.util.List<android.graphics.drawable.GradientDrawable> r0 = r5.A01
            int r0 = r0.size()
            if (r4 >= r0) goto L59
            if (r4 != r6) goto L55
            int r3 = r5.A04
            int r2 = r5.A04
        L2f:
            java.util.List<android.graphics.drawable.GradientDrawable> r0 = r5.A01
            java.lang.Object r1 = r0.get(r4)
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            int r0 = r5.A02
            r1.setStroke(r0, r2)
            java.util.List<android.graphics.drawable.GradientDrawable> r0 = r5.A01
            java.lang.Object r0 = r0.get(r4)
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            r0.setColor(r3)
            java.util.List<android.graphics.drawable.GradientDrawable> r0 = r5.A01
            java.lang.Object r0 = r0.get(r4)
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            r0.invalidateSelf()
            int r4 = r4 + 1
            goto L21
        L55:
            int r3 = r5.A03
            r2 = 0
            goto L2f
        L59:
            return
        L5a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0571Nh.A00(int):void");
    }
}
