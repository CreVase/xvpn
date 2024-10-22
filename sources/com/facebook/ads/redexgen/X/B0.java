package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;

/* loaded from: assets/audience_network.dex */
public class B0 extends Handler {
    public static String[] A01 = {"cM84svfilY1fRNbexyk2iCqfI9Mic26C", "VfCUxaYZuTeMHkYTo46", "IisOWM0lUS4Lu3RybgGxNVLfKliuyqwW", "FLA43BCGnP8usOUbI7zFQKz6XqVCHsBF", "15Z7KRdp6DwZGqf6xcs1XlQI9Ef5I4", "aZiqtaGs0ZKFWjct68K3nPIYPjFi2TGn", "cvTlG8SSjIZo", "nC1IQLfcrIbetOCM8kZeVdQHlPh2Fjnc"};
    public final /* synthetic */ XB A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B0 != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T>$PostResponseHandler */
    public B0(XB xb, Looper looper) {
        super(looper);
        this.A00 = xb;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B0 != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T>$PostResponseHandler */
    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        if (K0.A02(this)) {
            return;
        }
        try {
            Pair pair = (Pair) msg.obj;
            Object request = pair.first;
            Object obj = pair.second;
            switch (msg.what) {
                case 0:
                    this.A00.A0B(request, obj);
                    return;
                case 1:
                    this.A00.A0A(request, obj);
                    return;
                default:
                    return;
            }
        } catch (Throwable th) {
            String[] strArr = A01;
            if (strArr[7].charAt(13) != strArr[3].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "i1iVGg42veAmjOElKpvcoo5ry7bOnJ67";
            strArr2[3] = "so3bfiHMbtlE8O3JVo65WiqgboEHU0dK";
            K0.A00(th, this);
        }
    }
}
