package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ml1;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdoi {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final zzcgn zzc;
    private final Context zzd;
    private final zzdso zze;
    private final zzfib zzf;
    private final Executor zzg;
    private final zzaro zzh;
    private final zzcaz zzi;
    private final zzedo zzk;
    private final zzfjx zzl;
    private final zzedz zzm;
    private ml1 zzn;
    private final zzdnv zza = new zzdnv();
    private final zzbjy zzj = new zzbjy();

    public zzdoi(zzdof zzdofVar) {
        this.zzd = zzdof.zza(zzdofVar);
        this.zzg = zzdof.zzk(zzdofVar);
        this.zzh = zzdof.zzb(zzdofVar);
        this.zzi = zzdof.zzd(zzdofVar);
        this.zzb = zzdof.zzc(zzdofVar);
        this.zzc = zzdof.zze(zzdofVar);
        this.zzk = zzdof.zzg(zzdofVar);
        this.zzl = zzdof.zzj(zzdofVar);
        this.zze = zzdof.zzf(zzdofVar);
        this.zzf = zzdof.zzi(zzdofVar);
        this.zzm = zzdof.zzh(zzdofVar);
    }

    public final /* synthetic */ zzcgb zza(zzcgb zzcgbVar) {
        zzcgbVar.zzad("/result", this.zzj);
        zzcho zzN = zzcgbVar.zzN();
        com.google.android.gms.ads.internal.zzb zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzd, null, null);
        zzedo zzedoVar = this.zzk;
        zzfjx zzfjxVar = this.zzl;
        zzdso zzdsoVar = this.zze;
        zzfib zzfibVar = this.zzf;
        zzdnv zzdnvVar = this.zza;
        zzN.zzM(null, zzdnvVar, zzdnvVar, zzdnvVar, zzdnvVar, false, null, zzbVar, null, null, zzedoVar, zzfjxVar, zzdsoVar, zzfibVar, null, null, null, null, null);
        return zzcgbVar;
    }

    public final /* synthetic */ ml1 zzc(String str, JSONObject jSONObject, zzcgb zzcgbVar) throws Exception {
        return this.zzj.zzb(zzcgbVar, str, jSONObject);
    }

    public final synchronized ml1 zzd(final String str, final JSONObject jSONObject) {
        ml1 ml1Var = this.zzn;
        if (ml1Var == null) {
            return zzfzt.zzh(null);
        }
        return zzfzt.zzn(ml1Var, new zzfza() { // from class: com.google.android.gms.internal.ads.zzdnw
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzdoi.this.zzc(str, jSONObject, (zzcgb) obj);
            }
        }, this.zzg);
    }

    public final synchronized void zze(zzfcr zzfcrVar, zzfcv zzfcvVar) {
        ml1 ml1Var = this.zzn;
        if (ml1Var == null) {
            return;
        }
        zzfzt.zzr(ml1Var, new zzdoc(this, zzfcrVar, zzfcvVar), this.zzg);
    }

    public final synchronized void zzf() {
        ml1 ml1Var = this.zzn;
        if (ml1Var == null) {
            return;
        }
        zzfzt.zzr(ml1Var, new zzdny(this), this.zzg);
        this.zzn = null;
    }

    public final synchronized void zzg(String str, Map map) {
        ml1 ml1Var = this.zzn;
        if (ml1Var == null) {
            return;
        }
        zzfzt.zzr(ml1Var, new zzdob(this, "sendMessageToNativeJs", map), this.zzg);
    }

    public final synchronized void zzh() {
        final String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdA);
        final Context context = this.zzd;
        final zzaro zzaroVar = this.zzh;
        final zzcaz zzcazVar = this.zzi;
        final com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        final zzedz zzedzVar = this.zzm;
        ml1 zzm = zzfzt.zzm(zzfzt.zzk(new zzfyz() { // from class: com.google.android.gms.internal.ads.zzcgl
            @Override // com.google.android.gms.internal.ads.zzfyz
            public final ml1 zza() {
                com.google.android.gms.ads.internal.zzt.zzz();
                Context context2 = context;
                zzchq zza = zzchq.zza();
                zzaro zzaroVar2 = zzaroVar;
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                zzcgb zza2 = zzcgn.zza(context2, zza, "", false, false, zzaroVar2, null, zzcazVar, null, null, zzaVar2, zzaxv.zza(), null, null, zzedzVar);
                final zzcbk zza3 = zzcbk.zza(zza2);
                zza2.zzN().zzA(new zzchm() { // from class: com.google.android.gms.internal.ads.zzcgj
                    @Override // com.google.android.gms.internal.ads.zzchm
                    public final void zza(boolean z, int i, String str2, String str3) {
                        zzcbk.this.zzb();
                    }
                });
                zza2.loadUrl(str);
                return zza3;
            }
        }, zzcbg.zze), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzdnx
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                zzcgb zzcgbVar = (zzcgb) obj;
                zzdoi.this.zza(zzcgbVar);
                return zzcgbVar;
            }
        }, this.zzg);
        this.zzn = zzm;
        zzcbj.zza(zzm, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzi(String str, zzbjj zzbjjVar) {
        ml1 ml1Var = this.zzn;
        if (ml1Var == null) {
            return;
        }
        zzfzt.zzr(ml1Var, new zzdnz(this, str, zzbjjVar), this.zzg);
    }

    public final void zzj(WeakReference weakReference, String str, zzbjj zzbjjVar) {
        zzi(str, new zzdoh(this, weakReference, str, zzbjjVar, null));
    }

    public final synchronized void zzk(String str, zzbjj zzbjjVar) {
        ml1 ml1Var = this.zzn;
        if (ml1Var == null) {
            return;
        }
        zzfzt.zzr(ml1Var, new zzdoa(this, str, zzbjjVar), this.zzg);
    }
}
