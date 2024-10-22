package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzeip {
    private final zzfed zza;
    private final zzdqg zzb;
    private final zzdso zzc;
    private final zzfib zzd;

    public zzeip(zzfed zzfedVar, zzdqg zzdqgVar, zzdso zzdsoVar, zzfib zzfibVar) {
        this.zza = zzfedVar;
        this.zzb = zzdqgVar;
        this.zzc = zzdsoVar;
        this.zzd = zzfibVar;
    }

    public final void zza(zzfcv zzfcvVar, zzfcr zzfcrVar, int i, zzeey zzeeyVar, long j) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzir)).booleanValue()) {
            zzfia zzb = zzfia.zzb("adapter_status");
            zzb.zzg(zzfcvVar);
            zzb.zzf(zzfcrVar);
            zzb.zza("adapter_l", String.valueOf(j));
            zzb.zza("sc", Integer.toString(i));
            if (zzeeyVar != null) {
                zzb.zza("arec", Integer.toString(zzeeyVar.zzb().zza));
                String zza = this.zza.zza(zzeeyVar.getMessage());
                if (zza != null) {
                    zzb.zza("areec", zza);
                }
            }
            zzdqf zzb2 = this.zzb.zzb(zzfcrVar.zzv);
            if (zzb2 != null) {
                zzb.zza("ancn", zzb2.zza);
                zzbrj zzbrjVar = zzb2.zzb;
                if (zzbrjVar != null) {
                    zzb.zza("adapter_v", zzbrjVar.toString());
                }
                zzbrj zzbrjVar2 = zzb2.zzc;
                if (zzbrjVar2 != null) {
                    zzb.zza("adapter_sv", zzbrjVar2.toString());
                }
            }
            this.zzd.zzb(zzb);
            return;
        }
        zzdsn zza2 = this.zzc.zza();
        zza2.zze(zzfcvVar);
        zza2.zzd(zzfcrVar);
        zza2.zzb("action", "adapter_status");
        zza2.zzb("adapter_l", String.valueOf(j));
        zza2.zzb("sc", Integer.toString(i));
        if (zzeeyVar != null) {
            zza2.zzb("arec", Integer.toString(zzeeyVar.zzb().zza));
            String zza3 = this.zza.zza(zzeeyVar.getMessage());
            if (zza3 != null) {
                zza2.zzb("areec", zza3);
            }
        }
        zzdqf zzb3 = this.zzb.zzb(zzfcrVar.zzv);
        if (zzb3 != null) {
            zza2.zzb("ancn", zzb3.zza);
            zzbrj zzbrjVar3 = zzb3.zzb;
            if (zzbrjVar3 != null) {
                zza2.zzb("adapter_v", zzbrjVar3.toString());
            }
            zzbrj zzbrjVar4 = zzb3.zzc;
            if (zzbrjVar4 != null) {
                zza2.zzb("adapter_sv", zzbrjVar4.toString());
            }
        }
        zza2.zzg();
    }
}
