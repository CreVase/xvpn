package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import defpackage.ml1;

/* loaded from: classes.dex */
public final class zzepe implements zzetw {
    private static final Object zzb = new Object();
    final Context zza;
    private final String zzc;
    private final String zzd;
    private final zzcuq zze;
    private final zzfeu zzf;
    private final zzfdn zzg;
    private final com.google.android.gms.ads.internal.util.zzg zzh = com.google.android.gms.ads.internal.zzt.zzo().zzh();
    private final zzdsj zzi;
    private final zzcvc zzj;

    public zzepe(Context context, String str, String str2, zzcuq zzcuqVar, zzfeu zzfeuVar, zzfdn zzfdnVar, zzdsj zzdsjVar, zzcvc zzcvcVar) {
        this.zza = context;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzcuqVar;
        this.zzf = zzfeuVar;
        this.zzg = zzfdnVar;
        this.zzi = zzdsjVar;
        this.zzj = zzcvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhv)).booleanValue()) {
            zzdsj zzdsjVar = this.zzi;
            zzdsjVar.zza().put("seq_num", this.zzc);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfx)).booleanValue()) {
            this.zze.zzk(this.zzg.zzd);
            bundle.putAll(this.zzf.zzb());
        }
        return zzfzt.zzh(new zzetv() { // from class: com.google.android.gms.internal.ads.zzepd
            @Override // com.google.android.gms.internal.ads.zzetv
            public final void zzj(Object obj) {
                zzepe.this.zzc(bundle, (Bundle) obj);
            }
        });
    }

    public final /* synthetic */ void zzc(Bundle bundle, Bundle bundle2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfx)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfw)).booleanValue()) {
                synchronized (zzb) {
                    this.zze.zzk(this.zzg.zzd);
                    bundle2.putBundle("quality_signals", this.zzf.zzb());
                }
            } else {
                this.zze.zzk(this.zzg.zzd);
                bundle2.putBundle("quality_signals", this.zzf.zzb());
            }
        }
        bundle2.putString("seq_num", this.zzc);
        if (!this.zzh.zzQ()) {
            bundle2.putString("session_id", this.zzd);
        }
        bundle2.putBoolean("client_purpose_one", !this.zzh.zzQ());
        com.google.android.gms.ads.internal.zzt.zzp();
        bundle2.putString("_app_id", com.google.android.gms.ads.internal.util.zzt.zzp(this.zza));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfy)).booleanValue() && this.zzg.zzf != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("dload", this.zzj.zzb(this.zzg.zzf));
            bundle3.putInt("pcc", this.zzj.zza(this.zzg.zzf));
            bundle2.putBundle("ad_unit_quality_signals", bundle3);
        }
    }
}
