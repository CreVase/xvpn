package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class BA extends Handler {
    public final /* synthetic */ XA A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BA != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T>$MediaDrmHandler */
    public BA(XA xa, Looper looper) {
        super(looper);
        this.A00 = xa;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BA != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T>$MediaDrmHandler */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T> */
    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        List<XB> list;
        if (K0.A02(this)) {
            return;
        }
        try {
            byte[] bArr = (byte[]) msg.obj;
            list = this.A00.A09;
            for (XB xb : list) {
                if (xb.A0N(bArr)) {
                    xb.A0J(msg.what);
                    return;
                }
            }
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
