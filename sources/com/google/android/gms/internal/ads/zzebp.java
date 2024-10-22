package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.gms.ads.MobileAds;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzebp implements zzdcd, com.google.android.gms.ads.internal.client.zza, zzcyf, zzcxp {
    private final Context zza;
    private final zzfed zzb;
    private final zzfde zzc;
    private final zzfcr zzd;
    private final zzedo zze;
    private Boolean zzf;
    private final boolean zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgN)).booleanValue();
    private final zzfib zzh;
    private final String zzi;

    public zzebp(Context context, zzfed zzfedVar, zzfde zzfdeVar, zzfcr zzfcrVar, zzedo zzedoVar, zzfib zzfibVar, String str) {
        this.zza = context;
        this.zzb = zzfedVar;
        this.zzc = zzfdeVar;
        this.zzd = zzfcrVar;
        this.zze = zzedoVar;
        this.zzh = zzfibVar;
        this.zzi = str;
    }

    private final zzfia zzd(String str) {
        String str2;
        zzfia zzb = zzfia.zzb(str);
        zzb.zzh(this.zzc, null);
        zzb.zzf(this.zzd);
        zzb.zza("request_id", this.zzi);
        if (!this.zzd.zzv.isEmpty()) {
            zzb.zza("ancn", (String) this.zzd.zzv.get(0));
        }
        if (this.zzd.zzak) {
            if (true != com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza)) {
                str2 = "offline";
            } else {
                str2 = "online";
            }
            zzb.zza("device_connectivity", str2);
            zzb.zza("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            zzb.zza("offline_ad", "1");
        }
        return zzb;
    }

    private final void zze(zzfia zzfiaVar) {
        if (this.zzd.zzak) {
            this.zze.zzd(new zzedq(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), this.zzc.zzb.zzb.zzb, this.zzh.zza(zzfiaVar), 2));
            return;
        }
        this.zzh.zzb(zzfiaVar);
    }

    private final boolean zzf() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
                    String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbr);
                    com.google.android.gms.ads.internal.zzt.zzp();
                    String zzp = com.google.android.gms.ads.internal.util.zzt.zzp(this.zza);
                    boolean z = false;
                    if (str != null && zzp != null) {
                        try {
                            z = Pattern.matches(str, zzp);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzf = Boolean.valueOf(z);
                }
            }
        }
        return this.zzf.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!this.zzd.zzak) {
            return;
        }
        zze(zzd("click"));
    }

    @Override // com.google.android.gms.internal.ads.zzcxp
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (!this.zzg) {
            return;
        }
        int i = zzeVar.zza;
        String str = zzeVar.zzb;
        if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
            i = zzeVar3.zza;
            str = zzeVar3.zzb;
        }
        String zza = this.zzb.zza(str);
        zzfia zzd = zzd("ifts");
        zzd.zza("reason", "adapter");
        if (i >= 0) {
            zzd.zza("arec", String.valueOf(i));
        }
        if (zza != null) {
            zzd.zza("areec", zza);
        }
        this.zzh.zzb(zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzcxp
    public final void zzb() {
        if (!this.zzg) {
            return;
        }
        zzfib zzfibVar = this.zzh;
        zzfia zzd = zzd("ifts");
        zzd.zza("reason", "blocked");
        zzfibVar.zzb(zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzcxp
    public final void zzc(zzdhe zzdheVar) {
        if (!this.zzg) {
            return;
        }
        zzfia zzd = zzd("ifts");
        zzd.zza("reason", "exception");
        if (!TextUtils.isEmpty(zzdheVar.getMessage())) {
            zzd.zza("msg", zzdheVar.getMessage());
        }
        this.zzh.zzb(zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzdcd
    public final void zzi() {
        if (!zzf()) {
            return;
        }
        this.zzh.zzb(zzd("adapter_shown"));
    }

    @Override // com.google.android.gms.internal.ads.zzdcd
    public final void zzj() {
        if (!zzf()) {
            return;
        }
        this.zzh.zzb(zzd("adapter_impression"));
    }

    @Override // com.google.android.gms.internal.ads.zzcyf
    public final void zzq() {
        if (!zzf() && !this.zzd.zzak) {
            return;
        }
        zze(zzd(AdSDKNotificationListener.IMPRESSION_EVENT));
    }
}
