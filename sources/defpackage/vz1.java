package defpackage;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* loaded from: classes.dex */
public final class vz1 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final wz1 f4919a;

    public vz1(wz1 wz1Var) {
        this.f4919a = wz1Var;
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
        wz1 wz1Var = this.f4919a;
        if (z) {
            i = 10;
        }
        wz1.a(i, wz1Var);
    }
}
