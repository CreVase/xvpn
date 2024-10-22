package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;

/* loaded from: classes.dex */
public final class zzdhk implements zzcxl, zzdem {
    private final zzbyg zza;
    private final Context zzb;
    private final zzbyy zzc;
    private final View zzd;
    private String zze;
    private final zzayf zzf;

    public zzdhk(zzbyg zzbygVar, Context context, zzbyy zzbyyVar, View view, zzayf zzayfVar) {
        this.zza = zzbygVar;
        this.zzb = context;
        this.zzc = zzbyyVar;
        this.zzd = view;
        this.zzf = zzayfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zza() {
        this.zza.zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzbw(zzbvw zzbvwVar, String str, String str2) {
        if (this.zzc.zzu(this.zzb)) {
            try {
                zzbyy zzbyyVar = this.zzc;
                Context context = this.zzb;
                zzbyyVar.zzo(context, zzbyyVar.zza(context), this.zza.zza(), zzbvwVar.zzc(), zzbvwVar.zzb());
            } catch (RemoteException e) {
                zzcat.zzk("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzc() {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzs(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final void zzl() {
        String str;
        if (this.zzf == zzayf.APP_OPEN) {
            return;
        }
        String zzd = this.zzc.zzd(this.zzb);
        this.zze = zzd;
        zzayf zzayfVar = this.zzf;
        String valueOf = String.valueOf(zzd);
        if (zzayfVar == zzayf.REWARD_BASED_VIDEO_AD) {
            str = "/Rewarded";
        } else {
            str = "/Interstitial";
        }
        this.zze = valueOf.concat(str);
    }
}
