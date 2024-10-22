package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* loaded from: classes.dex */
final class zzew extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    private final zzez zza;

    public zzew(zzez zzezVar) {
        this.zza = zzezVar;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        boolean z;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i = 5;
        if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
            z = false;
        } else {
            z = true;
        }
        zzez zzezVar = this.zza;
        if (true == z) {
            i = 10;
        }
        zzez.zzc(zzezVar, i);
    }
}
