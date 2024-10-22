package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.NativeAd;

/* renamed from: com.facebook.ads.redexgen.X.Yj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0855Yj implements OW {
    public final /* synthetic */ NativeAd A00;
    public final /* synthetic */ C0850Ye A01;
    public final /* synthetic */ UJ A02;

    public C0855Yj(C0850Ye c0850Ye, UJ uj, NativeAd nativeAd) {
        this.A01 = c0850Ye;
        this.A02 = uj;
        this.A00 = nativeAd;
    }

    @Override // com.facebook.ads.redexgen.X.OW
    public final void A97() {
    }

    @Override // com.facebook.ads.redexgen.X.OW
    public final void ABE(AnonymousClass95 anonymousClass95) {
        new Handler(Looper.getMainLooper()).postDelayed(new C0856Yk(this, anonymousClass95), 1L);
    }

    @Override // com.facebook.ads.redexgen.X.OW
    public final void ABT() {
        AnonymousClass95 anonymousClass95;
        AnonymousClass95 anonymousClass952;
        anonymousClass95 = this.A01.A0A;
        if (anonymousClass95 != null) {
            anonymousClass952 = this.A01.A0A;
            anonymousClass952.A08();
        }
    }

    @Override // com.facebook.ads.redexgen.X.OW
    public final void ADB(View view, MotionEvent motionEvent) {
        YA ya;
        boolean A0J;
        LN A19 = this.A02.A19();
        ya = this.A01.A07;
        A19.A06(ya, motionEvent, view, view);
        if (motionEvent.getAction() == 1) {
            A0J = this.A01.A0J(this.A00);
            if (!A0J && this.A02.A12() != null) {
                this.A02.A12().onClick(view);
            }
        }
    }
}
