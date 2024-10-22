package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzemk implements AppEventListener, zzdag, zzcyz, zzcxo, zzcyf, com.google.android.gms.ads.internal.client.zza, zzcxl, zzczw, zzcyb, zzdfd {
    private final zzfib zzj;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicBoolean zzg = new AtomicBoolean(true);
    private final AtomicBoolean zzh = new AtomicBoolean(false);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    final BlockingQueue zza = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziC)).intValue());

    public zzemk(zzfib zzfibVar) {
        this.zzj = zzfibVar;
    }

    private final void zzo() {
        if (this.zzh.get() && this.zzi.get()) {
            for (final Pair pair : this.zza) {
                zzezw.zza(this.zzc, new zzezv() { // from class: com.google.android.gms.internal.ads.zzelv
                    @Override // com.google.android.gms.internal.ads.zzezv
                    public final void zza(Object obj) {
                        Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzcb) obj).zzc((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.zza.clear();
            this.zzg.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjU)).booleanValue()) {
            zzezw.zza(this.zzb, zzemi.zza);
        }
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (this.zzg.get()) {
            if (!this.zza.offer(new Pair(str, str2))) {
                zzcat.zze("The queue for app events is full, dropping the new event.");
                zzfib zzfibVar = this.zzj;
                if (zzfibVar != null) {
                    zzfia zzb = zzfia.zzb("dae_action");
                    zzb.zza("dae_name", str);
                    zzb.zza("dae_data", str2);
                    zzfibVar.zzb(zzb);
                    return;
                }
            }
            return;
        }
        zzezw.zza(this.zzc, new zzezv() { // from class: com.google.android.gms.internal.ads.zzemc
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcb) obj).zzc(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zza() {
        zzezw.zza(this.zzb, new zzezv() { // from class: com.google.android.gms.internal.ads.zzels
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzd();
            }
        });
        zzezw.zza(this.zzf, new zzezv() { // from class: com.google.android.gms.internal.ads.zzelt
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzb() {
        zzezw.zza(this.zzb, new zzezv() { // from class: com.google.android.gms.internal.ads.zzemd
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxo
    public final void zzbF(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzezw.zza(this.zzb, new zzezv() { // from class: com.google.android.gms.internal.ads.zzelw
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzf(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzezw.zza(this.zzb, new zzezv() { // from class: com.google.android.gms.internal.ads.zzelx
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zze(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
        zzezw.zza(this.zze, new zzezv() { // from class: com.google.android.gms.internal.ads.zzely
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzb(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        this.zzg.set(false);
        this.zza.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzbK() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjU)).booleanValue()) {
            zzezw.zza(this.zzb, zzemi.zza);
        }
        zzezw.zza(this.zzf, new zzezv() { // from class: com.google.android.gms.internal.ads.zzelu
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzbr(zzbvg zzbvgVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzbs(zzfde zzfdeVar) {
        this.zzg.set(true);
        this.zzi.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzbw(zzbvw zzbvwVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzc() {
        zzezw.zza(this.zzb, new zzezv() { // from class: com.google.android.gms.internal.ads.zzemf
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzj();
            }
        });
        zzezw.zza(this.zzf, new zzezv() { // from class: com.google.android.gms.internal.ads.zzemg
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzf();
            }
        });
        zzezw.zza(this.zzf, new zzezv() { // from class: com.google.android.gms.internal.ads.zzemh
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzf() {
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbh zzg() {
        return (com.google.android.gms.ads.internal.client.zzbh) this.zzb.get();
    }

    @Override // com.google.android.gms.internal.ads.zzczw
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzezw.zza(this.zzd, new zzezv() { // from class: com.google.android.gms.internal.ads.zzemj
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzcb zzi() {
        return (com.google.android.gms.ads.internal.client.zzcb) this.zzc.get();
    }

    public final void zzj(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzb.set(zzbhVar);
    }

    public final void zzk(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zze.set(zzbkVar);
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzd.set(zzdgVar);
    }

    public final void zzm(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        this.zzc.set(zzcbVar);
        this.zzh.set(true);
        zzo();
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzci zzciVar) {
        this.zzf.set(zzciVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyb
    public final void zzp(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzezw.zza(this.zzf, new zzezv() { // from class: com.google.android.gms.internal.ads.zzemb
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzd(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyf
    public final void zzq() {
        zzezw.zza(this.zzb, new zzezv() { // from class: com.google.android.gms.internal.ads.zzelr
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyz
    public final synchronized void zzr() {
        zzezw.zza(this.zzb, new zzezv() { // from class: com.google.android.gms.internal.ads.zzelz
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzi();
            }
        });
        zzezw.zza(this.zze, new zzezv() { // from class: com.google.android.gms.internal.ads.zzema
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzc();
            }
        });
        this.zzi.set(true);
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzs() {
        zzezw.zza(this.zzb, new zzezv() { // from class: com.google.android.gms.internal.ads.zzeme
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzk();
            }
        });
    }
}
