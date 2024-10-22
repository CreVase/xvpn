package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.ml1;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzeoj implements zzetw {
    private final zzgad zza;
    private final zzdqj zzb;
    private final zzdur zzc;
    private final zzeol zzd;

    public zzeoj(zzgad zzgadVar, zzdqj zzdqjVar, zzdur zzdurVar, zzeol zzeolVar) {
        this.zza = zzgadVar;
        this.zzb = zzdqjVar;
        this.zzc = zzdurVar;
        this.zzd = zzeolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        zzbca zzbcaVar = zzbci.zzkG;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbcaVar)).booleanValue() && this.zzd.zza() != null) {
            zzeok zza = this.zzd.zza();
            zza.getClass();
            return zzfzt.zzh(zza);
        }
        if (!zzftl.zzd((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbp)) && (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbcaVar)).booleanValue() || (!this.zzd.zzd() && this.zzc.zzt()))) {
            this.zzd.zzc(true);
            return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeoi
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzeoj.this.zzc();
                }
            });
        }
        return zzfzt.zzh(new zzeok(new Bundle()));
    }

    public final /* synthetic */ zzeok zzc() throws Exception {
        List<String> asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbp)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                zzfej zzc = this.zzb.zzc(str, new JSONObject());
                zzc.zzC();
                boolean zzt = this.zzc.zzt();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkG)).booleanValue() || zzt) {
                    try {
                        zzbrj zzf = zzc.zzf();
                        if (zzf != null) {
                            bundle2.putString("sdk_version", zzf.toString());
                        }
                    } catch (zzfds unused) {
                    }
                }
                try {
                    zzbrj zze = zzc.zze();
                    if (zze != null) {
                        bundle2.putString("adapter_version", zze.toString());
                    }
                } catch (zzfds unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfds unused3) {
            }
        }
        zzeok zzeokVar = new zzeok(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkG)).booleanValue()) {
            this.zzd.zzb(zzeokVar);
        }
        return zzeokVar;
    }
}
