package com.google.android.gms.internal.ads;

import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.BaseGmsClient;

/* loaded from: classes.dex */
public final class zzbuj extends BaseGmsClient {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbuj(android.content.Context r9, android.os.Looper r10, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks r11, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener r12) {
        /*
            r8 = this;
            android.content.Context r0 = r9.getApplicationContext()
            if (r0 == 0) goto L8
            r2 = r0
            goto L9
        L8:
            r2 = r9
        L9:
            r4 = 8
            r7 = 0
            r1 = r8
            r3 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbuj.<init>(android.content.Context, android.os.Looper, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener):void");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsService");
        if (queryLocalInterface instanceof zzbuw) {
            return (zzbuw) queryLocalInterface;
        }
        return new zzbuu(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdsService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.ADS";
    }

    public final zzbuw zzp() throws DeadObjectException {
        return (zzbuw) super.getService();
    }
}
