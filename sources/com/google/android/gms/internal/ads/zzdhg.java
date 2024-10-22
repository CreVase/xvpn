package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import defpackage.kg;

/* loaded from: classes.dex */
public final class zzdhg implements zzcyz, com.google.android.gms.ads.internal.overlay.zzo, zzcyf {
    zzfkc zza;
    private final Context zzb;
    private final zzcgb zzc;
    private final zzfcr zzd;
    private final zzcaz zze;
    private final zzayf zzf;

    public zzdhg(Context context, zzcgb zzcgbVar, zzfcr zzfcrVar, zzcaz zzcazVar, zzayf zzayfVar) {
        this.zzb = context;
        this.zzc = zzcgbVar;
        this.zzd = zzfcrVar;
        this.zze = zzcazVar;
        this.zzf = zzayfVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        if (this.zza != null && this.zzc != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeX)).booleanValue()) {
                this.zzc.zzd("onSdkImpression", new kg());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int i) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzcyf
    public final void zzq() {
        if (this.zza != null && this.zzc != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeX)).booleanValue()) {
                this.zzc.zzd("onSdkImpression", new kg());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyz
    public final void zzr() {
        zzeep zzeepVar;
        zzeep zzeepVar2;
        zzeeo zzeeoVar;
        zzayf zzayfVar = this.zzf;
        if ((zzayfVar == zzayf.REWARD_BASED_VIDEO_AD || zzayfVar == zzayf.INTERSTITIAL || zzayfVar == zzayf.APP_OPEN) && this.zzd.zzV && this.zzc != null) {
            if (com.google.android.gms.ads.internal.zzt.zzA().zzj(this.zzb)) {
                zzcaz zzcazVar = this.zze;
                String str = zzcazVar.zzb + "." + zzcazVar.zzc;
                zzfdq zzfdqVar = this.zzd.zzX;
                String zza = zzfdqVar.zza();
                if (zzfdqVar.zzb() == 1) {
                    zzeeoVar = zzeeo.VIDEO;
                    zzeepVar2 = zzeep.DEFINED_BY_JAVASCRIPT;
                } else {
                    if (this.zzd.zzaa == 2) {
                        zzeepVar = zzeep.UNSPECIFIED;
                    } else {
                        zzeepVar = zzeep.BEGIN_TO_RENDER;
                    }
                    zzeepVar2 = zzeepVar;
                    zzeeoVar = zzeeo.HTML_DISPLAY;
                }
                zzfkc zza2 = com.google.android.gms.ads.internal.zzt.zzA().zza(str, this.zzc.zzG(), "", "javascript", zza, zzeepVar2, zzeeoVar, this.zzd.zzan);
                this.zza = zza2;
                if (zza2 != null) {
                    com.google.android.gms.ads.internal.zzt.zzA().zzh(this.zza, (View) this.zzc);
                    this.zzc.zzap(this.zza);
                    com.google.android.gms.ads.internal.zzt.zzA().zzi(this.zza);
                    this.zzc.zzd("onSdkLoaded", new kg());
                }
            }
        }
    }
}
