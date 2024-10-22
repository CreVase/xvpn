package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import defpackage.ml1;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdps {
    private final zzcxj zza;
    private final zzdfb zzb;
    private final zzcys zzc;
    private final zzczf zzd;
    private final zzczr zze;
    private final zzdcf zzf;
    private final Executor zzg;
    private final zzdex zzh;
    private final zzcpr zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final zzbxu zzk;
    private final zzaro zzl;
    private final zzdbw zzm;
    private final zzedo zzn;
    private final zzfjx zzo;
    private final zzdso zzp;
    private final zzfib zzq;
    private final zzcou zzr;
    private final zzdpy zzs;

    public zzdps(zzcxj zzcxjVar, zzcys zzcysVar, zzczf zzczfVar, zzczr zzczrVar, zzdcf zzdcfVar, Executor executor, zzdex zzdexVar, zzcpr zzcprVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbxu zzbxuVar, zzaro zzaroVar, zzdbw zzdbwVar, zzedo zzedoVar, zzfjx zzfjxVar, zzdso zzdsoVar, zzfib zzfibVar, zzdfb zzdfbVar, zzcou zzcouVar, zzdpy zzdpyVar) {
        this.zza = zzcxjVar;
        this.zzc = zzcysVar;
        this.zzd = zzczfVar;
        this.zze = zzczrVar;
        this.zzf = zzdcfVar;
        this.zzg = executor;
        this.zzh = zzdexVar;
        this.zzi = zzcprVar;
        this.zzj = zzbVar;
        this.zzk = zzbxuVar;
        this.zzl = zzaroVar;
        this.zzm = zzdbwVar;
        this.zzn = zzedoVar;
        this.zzo = zzfjxVar;
        this.zzp = zzdsoVar;
        this.zzq = zzfibVar;
        this.zzb = zzdfbVar;
        this.zzr = zzcouVar;
        this.zzs = zzdpyVar;
    }

    public static final ml1 zzj(zzcgb zzcgbVar, String str, String str2) {
        final zzcbl zzcblVar = new zzcbl();
        zzcgbVar.zzN().zzA(new zzchm() { // from class: com.google.android.gms.internal.ads.zzdpj
            @Override // com.google.android.gms.internal.ads.zzchm
            public final void zza(boolean z, int i, String str3, String str4) {
                zzcbl zzcblVar2 = zzcbl.this;
                if (z) {
                    zzcblVar2.zzc(null);
                    return;
                }
                zzcblVar2.zzd(new Exception("Ad Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzcgbVar.zzab(str, str2, null);
        return zzcblVar;
    }

    public final /* synthetic */ void zzc() {
        this.zza.onAdClicked();
    }

    public final /* synthetic */ void zzd(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    public final /* synthetic */ void zze() {
        this.zzc.zzb();
    }

    public final /* synthetic */ void zzf(View view) {
        this.zzj.zza();
    }

    public final /* synthetic */ void zzg(zzcgb zzcgbVar, zzcgb zzcgbVar2, Map map) {
        this.zzi.zzh(zzcgbVar);
    }

    public final /* synthetic */ boolean zzh(View view, MotionEvent motionEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzju)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.zzs.zzb(motionEvent);
        }
        this.zzj.zza();
        if (view != null) {
            view.performClick();
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzi(final zzcgb zzcgbVar, boolean z, zzbjl zzbjlVar) {
        zzcho zzN = zzcgbVar.zzN();
        com.google.android.gms.ads.internal.client.zza zzaVar = new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdpk
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                zzdps.this.zzc();
            }
        };
        zzbib zzbibVar = new zzbib() { // from class: com.google.android.gms.internal.ads.zzdpl
            @Override // com.google.android.gms.internal.ads.zzbib
            public final void zzb(String str, String str2) {
                zzdps.this.zzd(str, str2);
            }
        };
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = new com.google.android.gms.ads.internal.overlay.zzz() { // from class: com.google.android.gms.internal.ads.zzdpm
            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                zzdps.this.zze();
            }
        };
        zzdpr zzdprVar = new zzdpr(this);
        zzbxu zzbxuVar = this.zzk;
        zzedo zzedoVar = this.zzn;
        zzfjx zzfjxVar = this.zzo;
        zzdso zzdsoVar = this.zzp;
        zzN.zzM(zzaVar, this.zzd, this.zze, zzbibVar, zzzVar, z, zzbjlVar, this.zzj, zzdprVar, zzbxuVar, zzedoVar, zzfjxVar, zzdsoVar, this.zzq, null, this.zzb, null, null, this.zzr);
        zzcgbVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdpn
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                zzdps.this.zzh(view, motionEvent);
                return false;
            }
        });
        zzcgbVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdpo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zzdps.this.zzf(view);
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcs)).booleanValue()) {
            this.zzl.zzc().zzo((View) zzcgbVar);
        }
        this.zzh.zzo(zzcgbVar, this.zzg);
        this.zzh.zzo(new zzauw() { // from class: com.google.android.gms.internal.ads.zzdpp
            @Override // com.google.android.gms.internal.ads.zzauw
            public final void zzbt(zzauv zzauvVar) {
                zzcho zzN2 = zzcgb.this.zzN();
                Rect rect = zzauvVar.zzd;
                zzN2.zzp(rect.left, rect.top, false);
            }
        }, this.zzg);
        this.zzh.zza((View) zzcgbVar);
        zzcgbVar.zzad("/trackActiveViewUnit", new zzbjj() { // from class: com.google.android.gms.internal.ads.zzdpq
            @Override // com.google.android.gms.internal.ads.zzbjj
            public final void zza(Object obj, Map map) {
                zzdps.this.zzg(zzcgbVar, (zzcgb) obj, map);
            }
        });
        this.zzi.zzi(zzcgbVar);
    }
}
