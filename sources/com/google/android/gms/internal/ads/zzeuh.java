package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import defpackage.ml1;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeuh implements zzetw {
    private final zzgad zza;
    private final Context zzb;

    public zzeuh(zzgad zzgadVar, Context context) {
        this.zza = zzgadVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeug
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeuh.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeuf zzc() throws Exception {
        int i;
        boolean z;
        int i2;
        TelephonyManager telephonyManager = (TelephonyManager) this.zzb.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzt.zzp();
        int i3 = -1;
        if (com.google.android.gms.ads.internal.util.zzt.zzz(this.zzb, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.zzb.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i = type;
                i3 = ordinal;
            } else {
                i = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
            i2 = i3;
        } else {
            i = -2;
            z = false;
            i2 = -1;
        }
        return new zzeuf(networkOperator, i, com.google.android.gms.ads.internal.zzt.zzq().zzn(this.zzb), phoneType, z, i2);
    }
}
