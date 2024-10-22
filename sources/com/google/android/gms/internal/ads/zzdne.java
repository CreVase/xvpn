package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ml1;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdne {
    private final zzfdn zza;
    private final Executor zzb;
    private final zzdpt zzc;
    private final zzdoo zzd;
    private final Context zze;
    private final zzdso zzf;
    private final zzfib zzg;
    private final zzfjx zzh;
    private final zzedo zzi;

    public zzdne(zzfdn zzfdnVar, Executor executor, zzdpt zzdptVar, Context context, zzdso zzdsoVar, zzfib zzfibVar, zzfjx zzfjxVar, zzedo zzedoVar, zzdoo zzdooVar) {
        this.zza = zzfdnVar;
        this.zzb = executor;
        this.zzc = zzdptVar;
        this.zze = context;
        this.zzf = zzdsoVar;
        this.zzg = zzfibVar;
        this.zzh = zzfjxVar;
        this.zzi = zzedoVar;
        this.zzd = zzdooVar;
    }

    private final void zzh(zzcgb zzcgbVar) {
        zzi(zzcgbVar);
        zzcgbVar.zzad("/video", zzbji.zzl);
        zzcgbVar.zzad("/videoMeta", zzbji.zzm);
        zzcgbVar.zzad("/precache", new zzceo());
        zzcgbVar.zzad("/delayPageLoaded", zzbji.zzp);
        zzcgbVar.zzad("/instrument", zzbji.zzn);
        zzcgbVar.zzad("/log", zzbji.zzg);
        zzcgbVar.zzad("/click", new zzbih(null, 0 == true ? 1 : 0));
        if (this.zza.zzb != null) {
            zzcgbVar.zzN().zzD(true);
            zzcgbVar.zzad("/open", new zzbju(null, null, null, null, null, null));
        } else {
            zzcgbVar.zzN().zzD(false);
        }
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(zzcgbVar.getContext())) {
            zzcgbVar.zzad("/logScionEvent", new zzbjo(zzcgbVar.getContext()));
        }
    }

    private static final void zzi(zzcgb zzcgbVar) {
        zzcgbVar.zzad("/videoClicked", zzbji.zzh);
        zzcgbVar.zzN().zzF(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdC)).booleanValue()) {
            zzcgbVar.zzad("/getNativeAdViewSignals", zzbji.zzs);
        }
        zzcgbVar.zzad("/getNativeClickMeta", zzbji.zzt);
    }

    public final ml1 zza(final JSONObject jSONObject) {
        return zzfzt.zzn(zzfzt.zzn(zzfzt.zzh(null), new zzfza() { // from class: com.google.android.gms.internal.ads.zzdmv
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzdne.this.zze(obj);
            }
        }, this.zzb), new zzfza() { // from class: com.google.android.gms.internal.ads.zzdmu
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzdne.this.zzc(jSONObject, (zzcgb) obj);
            }
        }, this.zzb);
    }

    public final ml1 zzb(final String str, final String str2, final zzfcr zzfcrVar, final zzfcv zzfcvVar, final com.google.android.gms.ads.internal.client.zzq zzqVar) {
        return zzfzt.zzn(zzfzt.zzh(null), new zzfza() { // from class: com.google.android.gms.internal.ads.zzdmt
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzdne.this.zzd(zzqVar, zzfcrVar, zzfcvVar, str, str2, obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ ml1 zzc(JSONObject jSONObject, final zzcgb zzcgbVar) throws Exception {
        final zzcbk zza = zzcbk.zza(zzcgbVar);
        if (this.zza.zzb != null) {
            zzcgbVar.zzag(zzchq.zzd());
        } else {
            zzcgbVar.zzag(zzchq.zze());
        }
        zzcgbVar.zzN().zzA(new zzchm() { // from class: com.google.android.gms.internal.ads.zzdmw
            @Override // com.google.android.gms.internal.ads.zzchm
            public final void zza(boolean z, int i, String str, String str2) {
                zzdne.this.zzf(zzcgbVar, zza, z, i, str, str2);
            }
        });
        zzcgbVar.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zza;
    }

    public final /* synthetic */ ml1 zzd(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfcr zzfcrVar, zzfcv zzfcvVar, String str, String str2, Object obj) throws Exception {
        final zzcgb zza = this.zzc.zza(zzqVar, zzfcrVar, zzfcvVar);
        final zzcbk zza2 = zzcbk.zza(zza);
        if (this.zza.zzb != null) {
            zzh(zza);
            zza.zzag(zzchq.zzd());
        } else {
            zzdol zzb = this.zzd.zzb();
            zza.zzN().zzM(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zze, null, null), null, null, this.zzi, this.zzh, this.zzf, this.zzg, null, zzb, null, null, null);
            zzi(zza);
        }
        zza.zzN().zzA(new zzchm() { // from class: com.google.android.gms.internal.ads.zzdmx
            @Override // com.google.android.gms.internal.ads.zzchm
            public final void zza(boolean z, int i, String str3, String str4) {
                zzdne.this.zzg(zza, zza2, z, i, str3, str4);
            }
        });
        zza.zzab(str, str2, null);
        return zza2;
    }

    public final /* synthetic */ ml1 zze(Object obj) throws Exception {
        zzcgb zza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        final zzcbk zza2 = zzcbk.zza(zza);
        zzh(zza);
        zza.zzN().zzG(new zzchn() { // from class: com.google.android.gms.internal.ads.zzdmy
            @Override // com.google.android.gms.internal.ads.zzchn
            public final void zza() {
                zzcbk.this.zzb();
            }
        });
        zza.loadUrl((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdB));
        return zza2;
    }

    public final /* synthetic */ void zzf(zzcgb zzcgbVar, zzcbk zzcbkVar, boolean z, int i, String str, String str2) {
        if (this.zza.zza != null && zzcgbVar.zzq() != null) {
            zzcgbVar.zzq().zzs(this.zza.zza);
        }
        zzcbkVar.zzb();
    }

    public final /* synthetic */ void zzg(zzcgb zzcgbVar, zzcbk zzcbkVar, boolean z, int i, String str, String str2) {
        if (z) {
            if (this.zza.zza != null && zzcgbVar.zzq() != null) {
                zzcgbVar.zzq().zzs(this.zza.zza);
            }
            zzcbkVar.zzb();
            return;
        }
        zzcbkVar.zzd(new zzeir(1, "Html video Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }
}
