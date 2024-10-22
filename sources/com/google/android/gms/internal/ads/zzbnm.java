package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzbnm {
    private final Context zzb;
    private final String zzc;
    private final zzcaz zzd;
    private final zzfjh zze;
    private final com.google.android.gms.ads.internal.util.zzbd zzf;
    private final com.google.android.gms.ads.internal.util.zzbd zzg;
    private zzbnl zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbnm(Context context, zzcaz zzcazVar, String str, com.google.android.gms.ads.internal.util.zzbd zzbdVar, com.google.android.gms.ads.internal.util.zzbd zzbdVar2, zzfjh zzfjhVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = zzcazVar;
        this.zze = zzfjhVar;
        this.zzf = zzbdVar;
        this.zzg = zzbdVar2;
    }

    public final zzbng zzb(zzaro zzaroVar) {
        synchronized (this.zza) {
            synchronized (this.zza) {
                zzbnl zzbnlVar = this.zzh;
                if (zzbnlVar != null && this.zzi == 0) {
                    zzbnlVar.zzi(new zzcbp() { // from class: com.google.android.gms.internal.ads.zzbms
                        @Override // com.google.android.gms.internal.ads.zzcbp
                        public final void zza(Object obj) {
                            zzbnm.this.zzk((zzbmh) obj);
                        }
                    }, new zzcbn() { // from class: com.google.android.gms.internal.ads.zzbmt
                        @Override // com.google.android.gms.internal.ads.zzcbn
                        public final void zza() {
                        }
                    });
                }
            }
            zzbnl zzbnlVar2 = this.zzh;
            if (zzbnlVar2 != null && zzbnlVar2.zze() != -1) {
                int i = this.zzi;
                if (i == 0) {
                    return this.zzh.zza();
                }
                if (i == 1) {
                    this.zzi = 2;
                    zzd(null);
                    return this.zzh.zza();
                }
                return this.zzh.zza();
            }
            this.zzi = 2;
            zzbnl zzd = zzd(null);
            this.zzh = zzd;
            return zzd.zza();
        }
    }

    public final zzbnl zzd(zzaro zzaroVar) {
        zzfit zza = zzfis.zza(this.zzb, 6);
        zza.zzh();
        final zzbnl zzbnlVar = new zzbnl(this.zzg);
        final zzaro zzaroVar2 = null;
        zzcbg.zze.execute(new Runnable(zzaroVar2, zzbnlVar) { // from class: com.google.android.gms.internal.ads.zzbmw
            public final /* synthetic */ zzbnl zzb;

            {
                this.zzb = zzbnlVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbnm.this.zzj(null, this.zzb);
            }
        });
        zzbnlVar.zzi(new zzbnb(this, zzbnlVar, zza), new zzbnc(this, zzbnlVar, zza));
        return zzbnlVar;
    }

    public final /* synthetic */ void zzi(zzbnl zzbnlVar, final zzbmh zzbmhVar, ArrayList arrayList, long j) {
        synchronized (this.zza) {
            if (zzbnlVar.zze() != -1 && zzbnlVar.zze() != 1) {
                zzbnlVar.zzg();
                zzcbg.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmu
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbmh.this.zzc();
                    }
                });
                com.google.android.gms.ads.internal.util.zze.zza("Could not receive /jsLoaded in " + String.valueOf(com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzc)) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + zzbnlVar.zze() + ". Update status(onEngLoadedTimeout) is " + this.zzi + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + String.valueOf(arrayList.get(0)) + " ms. Total latency(onEngLoadedTimeout) is " + (com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - j) + " ms. Rejecting.");
            }
        }
    }

    public final /* synthetic */ void zzj(zzaro zzaroVar, zzbnl zzbnlVar) {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            zzbmp zzbmpVar = new zzbmp(this.zzb, this.zzd, null, null);
            zzbmpVar.zzk(new zzbmv(this, arrayList, currentTimeMillis, zzbnlVar, zzbmpVar));
            zzbmpVar.zzq("/jsLoaded", new zzbmx(this, currentTimeMillis, zzbnlVar, zzbmpVar));
            com.google.android.gms.ads.internal.util.zzcc zzccVar = new com.google.android.gms.ads.internal.util.zzcc();
            zzbmy zzbmyVar = new zzbmy(this, null, zzbmpVar, zzccVar);
            zzccVar.zzb(zzbmyVar);
            zzbmpVar.zzq("/requestReload", zzbmyVar);
            if (this.zzc.endsWith(".js")) {
                zzbmpVar.zzh(this.zzc);
            } else if (this.zzc.startsWith("<html>")) {
                zzbmpVar.zzf(this.zzc);
            } else {
                zzbmpVar.zzg(this.zzc);
            }
            com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new zzbna(this, zzbnlVar, zzbmpVar, arrayList, currentTimeMillis), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzd)).intValue());
        } catch (Throwable th) {
            zzcat.zzh("Error creating webview.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzbnlVar.zzg();
        }
    }

    public final /* synthetic */ void zzk(zzbmh zzbmhVar) {
        if (zzbmhVar.zzi()) {
            this.zzi = 1;
        }
    }
}
