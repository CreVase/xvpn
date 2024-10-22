package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.gms.ads.MobileAds;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzdrx implements zzdcd, com.google.android.gms.ads.internal.client.zza, zzcyf, zzcxp {
    private final Context zza;
    private final zzfed zzb;
    private final zzdso zzc;
    private final zzfde zzd;
    private final zzfcr zze;
    private final zzedo zzf;
    private Boolean zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgN)).booleanValue();

    public zzdrx(Context context, zzfed zzfedVar, zzdso zzdsoVar, zzfde zzfdeVar, zzfcr zzfcrVar, zzedo zzedoVar) {
        this.zza = context;
        this.zzb = zzfedVar;
        this.zzc = zzdsoVar;
        this.zzd = zzfdeVar;
        this.zze = zzfcrVar;
        this.zzf = zzedoVar;
    }

    private final zzdsn zzd(String str) {
        String str2;
        zzdsn zza = this.zzc.zza();
        zza.zze(this.zzd.zzb.zzb);
        zza.zzd(this.zze);
        zza.zzb("action", str);
        boolean z = false;
        if (!this.zze.zzv.isEmpty()) {
            zza.zzb("ancn", (String) this.zze.zzv.get(0));
        }
        if (this.zze.zzak) {
            if (true != com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza)) {
                str2 = "offline";
            } else {
                str2 = "online";
            }
            zza.zzb("device_connectivity", str2);
            zza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            zza.zzb("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgW)).booleanValue()) {
            if (com.google.android.gms.ads.nonagon.signalgeneration.zzf.zze(this.zzd.zza.zza) != 1) {
                z = true;
            }
            zza.zzb("scar", String.valueOf(z));
            if (z) {
                com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzd.zza.zza.zzd;
                zza.zzc("ragent", zzlVar.zzp);
                zza.zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(zzlVar)));
            }
        }
        return zza;
    }

    private final void zze(zzdsn zzdsnVar) {
        if (this.zze.zzak) {
            this.zzf.zzd(new zzedq(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzdsnVar.zzf(), 2));
            return;
        }
        zzdsnVar.zzg();
    }

    private final boolean zzf() {
        if (this.zzg == null) {
            synchronized (this) {
                if (this.zzg == null) {
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
                    this.zzg = Boolean.valueOf(z);
                }
            }
        }
        return this.zzg.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!this.zze.zzak) {
            return;
        }
        zze(zzd("click"));
    }

    @Override // com.google.android.gms.internal.ads.zzcxp
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (!this.zzh) {
            return;
        }
        zzdsn zzd = zzd("ifts");
        zzd.zzb("reason", "adapter");
        int i = zzeVar.zza;
        String str = zzeVar.zzb;
        if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
            i = zzeVar3.zza;
            str = zzeVar3.zzb;
        }
        if (i >= 0) {
            zzd.zzb("arec", String.valueOf(i));
        }
        String zza = this.zzb.zza(str);
        if (zza != null) {
            zzd.zzb("areec", zza);
        }
        zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcxp
    public final void zzb() {
        if (!this.zzh) {
            return;
        }
        zzdsn zzd = zzd("ifts");
        zzd.zzb("reason", "blocked");
        zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcxp
    public final void zzc(zzdhe zzdheVar) {
        if (!this.zzh) {
            return;
        }
        zzdsn zzd = zzd("ifts");
        zzd.zzb("reason", "exception");
        if (!TextUtils.isEmpty(zzdheVar.getMessage())) {
            zzd.zzb("msg", zzdheVar.getMessage());
        }
        zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdcd
    public final void zzi() {
        if (!zzf()) {
            return;
        }
        zzd("adapter_shown").zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdcd
    public final void zzj() {
        if (!zzf()) {
            return;
        }
        zzd("adapter_impression").zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcyf
    public final void zzq() {
        if (!zzf() && !this.zze.zzak) {
            return;
        }
        zze(zzd(AdSDKNotificationListener.IMPRESSION_EVENT));
    }
}
