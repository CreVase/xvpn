package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class zzdfw extends zzcsx {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdel zze;
    private final zzdhf zzf;
    private final zzctr zzg;
    private final zzfnb zzh;
    private final zzcxy zzi;
    private final zzcag zzj;
    private boolean zzk;

    public zzdfw(zzcsw zzcswVar, Context context, zzcgb zzcgbVar, zzdel zzdelVar, zzdhf zzdhfVar, zzctr zzctrVar, zzfnb zzfnbVar, zzcxy zzcxyVar, zzcag zzcagVar) {
        super(zzcswVar);
        this.zzk = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcgbVar);
        this.zze = zzdelVar;
        this.zzf = zzdhfVar;
        this.zzg = zzctrVar;
        this.zzh = zzfnbVar;
        this.zzi = zzcxyVar;
        this.zzj = zzcagVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcgb zzcgbVar = (zzcgb) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgH)).booleanValue()) {
                if (!this.zzk && zzcgbVar != null) {
                    zzcbg.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdfv
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcgb.this.destroy();
                        }
                    });
                }
            } else if (zzcgbVar != null) {
                zzcgbVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzc(boolean z, Activity activity) {
        zzfcr zzD;
        this.zze.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzaA)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzF(this.zzc)) {
                zzcat.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzaB)).booleanValue()) {
                    this.zzh.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        zzcgb zzcgbVar = (zzcgb) this.zzd.get();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkP)).booleanValue() && zzcgbVar != null && (zzD = zzcgbVar.zzD()) != null && zzD.zzas && zzD.zzat != this.zzj.zzb()) {
            zzcat.zzj("The interstitial consent form has been shown.");
            this.zzi.zza(zzfeo.zzd(12, "The consent form has already been shown.", null));
        } else {
            if (this.zzk) {
                zzcat.zzj("The interstitial ad has been shown.");
                this.zzi.zza(zzfeo.zzd(10, null, null));
            }
            Activity activity2 = activity;
            if (!this.zzk) {
                if (activity == null) {
                    activity2 = this.zzc;
                }
                try {
                    this.zzf.zza(z, activity2, this.zzi);
                    this.zze.zza();
                    this.zzk = true;
                    return true;
                } catch (zzdhe e) {
                    this.zzi.zzc(e);
                }
            }
        }
        return false;
    }
}
