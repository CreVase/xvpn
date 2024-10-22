package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzgn;
import defpackage.ho3;

/* loaded from: classes2.dex */
public final class AppMeasurementReceiver extends ho3 implements zzgn.zza {
    private zzgn zza;

    public final BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }

    @Override // com.google.android.gms.measurement.internal.zzgn.zza
    public final void doStartService(Context context, Intent intent) {
        ho3.startWakefulService(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.zza == null) {
            this.zza = new zzgn(this);
        }
        this.zza.zza(context, intent);
    }
}
