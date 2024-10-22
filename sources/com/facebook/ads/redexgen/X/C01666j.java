package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.6j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01666j extends PX {
    public static String[] A04 = {"t7nWMgaAgPrF08nCpsue0KJ0bXYxildh", "6KdtKMmtzfHYFwbGu3Z1Ir1zVfPvm0mZ", "4a3tRJ2Sc2HJRD7iGLBoGFg5dIAFXATk", "UpueiF5Mlf4qFrRwKkN0oaj1wZcm2sVE", "2I2trXzlQyfCpDc0SWIB9I9l1xDqUCt2", "pVCp6f81Bxfp7pGgyLuO3QWY2ZOI1Rz7", "JWrnXr9CYPwxDsxVPLOhiB9OxQPOAEin", "O346HS8RGmqKBjl58VTWQBGWIRLrpgc9"};
    public final ImageView A00;
    public final YA A01;
    public final AbstractC02028a<AnonymousClass75> A02;
    public final AbstractC02028a<MJ> A03;

    public C01666j(YA ya) {
        super(ya);
        this.A03 = new C0478Jp(this);
        this.A02 = new C0468Jd(this);
        this.A01 = ya;
        ImageView imageView = new ImageView(ya);
        this.A00 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        LV.A0M(imageView, -16777216);
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(imageView);
    }

    @Override // com.facebook.ads.redexgen.X.PX
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.PX
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A03);
        }
        super.A08();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A00.layout(0, 0, i3 - i, i4 - i2);
    }

    public void setImage(String str) {
        setImage(str, null);
    }

    public void setImage(String str, NK nk) {
        if (str == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        T8 downloadImageTask = new T8(this.A00, this.A01).A04();
        if (nk != null) {
            downloadImageTask.A06(nk);
        }
        downloadImageTask.A07(str);
        String[] strArr = A04;
        if (strArr[0].charAt(21) == strArr[6].charAt(21)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "kA5c9xFlh2VnhKEqDnwhhyQ6vC8xp51l";
        strArr2[6] = "v6NK46wFN1tyoiPUrV3jpTAezqYTXUDI";
    }
}
