package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import defpackage.ml1;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzepp implements zzetw {
    private final zzgad zza;
    private final Context zzb;

    public zzepp(zzgad zzgadVar, Context context) {
        this.zza = zzgadVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    @SuppressLint({"UnprotectedReceiver"})
    public final ml1 zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepp.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzepq zzc() throws Exception {
        Intent registerReceiver;
        double d;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkc)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            registerReceiver = this.zzb.registerReceiver(null, intentFilter, 4);
        } else {
            registerReceiver = this.zzb.registerReceiver(null, intentFilter);
        }
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            double intExtra2 = registerReceiver.getIntExtra("level", -1);
            double intExtra3 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            d = intExtra2 / intExtra3;
        } else {
            d = -1.0d;
        }
        return new zzepq(d, z);
    }
}
