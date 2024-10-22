package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcpr implements zzauw, zzcyg, com.google.android.gms.ads.internal.overlay.zzo, zzcyf {
    private final zzcpm zza;
    private final zzcpn zzb;
    private final zzbom zzd;
    private final Executor zze;
    private final Clock zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcpq zzh = new zzcpq();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcpr(zzboj zzbojVar, zzcpn zzcpnVar, Executor executor, zzcpm zzcpmVar, Clock clock) {
        this.zza = zzcpmVar;
        zzbnu zzbnuVar = zzbnx.zza;
        this.zzd = zzbojVar.zza("google.afma.activeView.handleUpdate", zzbnuVar, zzbnuVar);
        this.zzb = zzcpnVar;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzk() {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            this.zza.zzf((zzcgb) it.next());
        }
        this.zza.zze();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbL() {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcyg
    public final synchronized void zzbn(Context context) {
        this.zzh.zze = "u";
        zzg();
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbo() {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcyg
    public final synchronized void zzbp(Context context) {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcyg
    public final synchronized void zzbq(Context context) {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzauw
    public final synchronized void zzbt(zzauv zzauvVar) {
        zzcpq zzcpqVar = this.zzh;
        zzcpqVar.zza = zzauvVar.zzj;
        zzcpqVar.zzf = zzauvVar;
        zzg();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int i) {
    }

    public final synchronized void zzg() {
        if (this.zzj.get() != null) {
            if (!this.zzi && this.zzg.get()) {
                try {
                    this.zzh.zzd = this.zzf.elapsedRealtime();
                    final JSONObject zzb = this.zzb.zzb(this.zzh);
                    for (final zzcgb zzcgbVar : this.zzc) {
                        this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpp
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcgb.this.zzl("AFMA_updateActiveView", zzb);
                            }
                        });
                    }
                    zzcbj.zzb(this.zzd.zzb(zzb), "ActiveViewListener.callActiveViewJs");
                    return;
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Failed to call ActiveViewJS", e);
                    return;
                }
            }
            return;
        }
        zzj();
    }

    public final synchronized void zzh(zzcgb zzcgbVar) {
        this.zzc.add(zzcgbVar);
        this.zza.zzd(zzcgbVar);
    }

    public final void zzi(Object obj) {
        this.zzj = new WeakReference(obj);
    }

    public final synchronized void zzj() {
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcyf
    public final synchronized void zzq() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zzc(this);
            zzg();
        }
    }
}
