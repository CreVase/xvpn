package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import com.android.vending.billing.IInAppBillingService;

/* loaded from: classes2.dex */
public abstract class zzd extends zzi implements zze {
    public static zze zzn(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(IInAppBillingService.DESCRIPTOR);
        if (queryLocalInterface instanceof zze) {
            return (zze) queryLocalInterface;
        }
        return new zzc(iBinder);
    }
}
