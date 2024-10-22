package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import defpackage.kg;

/* loaded from: classes.dex */
public final class zzcsk implements zzcyz, zzcyf {
    private final Context zza;
    private final zzcgb zzb;
    private final zzfcr zzc;
    private final zzcaz zzd;
    private zzfkc zze;
    private boolean zzf;

    public zzcsk(Context context, zzcgb zzcgbVar, zzfcr zzfcrVar, zzcaz zzcazVar) {
        this.zza = context;
        this.zzb = zzcgbVar;
        this.zzc = zzfcrVar;
        this.zzd = zzcazVar;
    }

    private final synchronized void zza() {
        zzeep zzeepVar;
        zzeep zzeepVar2;
        zzeeo zzeeoVar;
        if (!this.zzc.zzV) {
            return;
        }
        if (this.zzb == null) {
            return;
        }
        if (!com.google.android.gms.ads.internal.zzt.zzA().zzj(this.zza)) {
            return;
        }
        zzcaz zzcazVar = this.zzd;
        String str = zzcazVar.zzb + "." + zzcazVar.zzc;
        zzfdq zzfdqVar = this.zzc.zzX;
        String zza = zzfdqVar.zza();
        if (zzfdqVar.zzb() == 1) {
            zzeeoVar = zzeeo.VIDEO;
            zzeepVar2 = zzeep.DEFINED_BY_JAVASCRIPT;
        } else {
            zzfcr zzfcrVar = this.zzc;
            zzeeo zzeeoVar2 = zzeeo.HTML_DISPLAY;
            if (zzfcrVar.zzf == 1) {
                zzeepVar = zzeep.ONE_PIXEL;
            } else {
                zzeepVar = zzeep.BEGIN_TO_RENDER;
            }
            zzeepVar2 = zzeepVar;
            zzeeoVar = zzeeoVar2;
        }
        zzfkc zza2 = com.google.android.gms.ads.internal.zzt.zzA().zza(str, this.zzb.zzG(), "", "javascript", zza, zzeepVar2, zzeeoVar, this.zzc.zzan);
        this.zze = zza2;
        Object obj = this.zzb;
        if (zza2 != null) {
            com.google.android.gms.ads.internal.zzt.zzA().zzh(this.zze, (View) obj);
            this.zzb.zzap(this.zze);
            com.google.android.gms.ads.internal.zzt.zzA().zzi(this.zze);
            this.zzf = true;
            this.zzb.zzd("onSdkLoaded", new kg());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyf
    public final synchronized void zzq() {
        zzcgb zzcgbVar;
        if (!this.zzf) {
            zza();
        }
        if (this.zzc.zzV && this.zze != null && (zzcgbVar = this.zzb) != null) {
            zzcgbVar.zzd("onSdkImpression", new kg());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyz
    public final synchronized void zzr() {
        if (this.zzf) {
            return;
        }
        zza();
    }
}
