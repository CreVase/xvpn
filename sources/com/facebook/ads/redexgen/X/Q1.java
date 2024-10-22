package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class Q1 implements View.OnClickListener {
    public final /* synthetic */ C6E A00;

    public Q1(C6E c6e) {
        this.A00 = c6e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RX videoView;
        C0452In c0452In;
        YA ya;
        RX videoView2;
        RX videoView3;
        RX videoView4;
        C0452In c0452In2;
        if (K0.A02(this)) {
            return;
        }
        try {
            videoView = this.A00.getVideoView();
            if (videoView != null) {
                c0452In = this.A00.A02;
                if (c0452In != null) {
                    c0452In2 = this.A00.A02;
                    c0452In2.A04(EnumC0451Im.A0p, null);
                }
                ya = this.A00.A01;
                ya.A0E().A31();
                int[] iArr = Q2.A00;
                videoView2 = this.A00.getVideoView();
                switch (iArr[videoView2.getState().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        videoView3 = this.A00.getVideoView();
                        videoView3.A0b(EnumC0625Pj.A04, 12);
                        return;
                    case 5:
                        videoView4 = this.A00.getVideoView();
                        videoView4.A0e(true, 8);
                        return;
                    default:
                        return;
                }
            }
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
