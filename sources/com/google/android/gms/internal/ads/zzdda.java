package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdda {
    private final Set zza = new HashSet();
    private final Set zzb = new HashSet();
    private final Set zzc = new HashSet();
    private final Set zzd = new HashSet();
    private final Set zze = new HashSet();
    private final Set zzf = new HashSet();
    private final Set zzg = new HashSet();
    private final Set zzh = new HashSet();
    private final Set zzi = new HashSet();
    private final Set zzj = new HashSet();
    private final Set zzk = new HashSet();
    private final Set zzl = new HashSet();
    private final Set zzm = new HashSet();
    private final Set zzn = new HashSet();
    private zzfaf zzo;

    public final zzdda zza(com.google.android.gms.ads.internal.client.zza zzaVar, Executor executor) {
        this.zzc.add(new zzdev(zzaVar, executor));
        return this;
    }

    public final zzdda zzb(zzcxo zzcxoVar, Executor executor) {
        this.zzi.add(new zzdev(zzcxoVar, executor));
        return this;
    }

    public final zzdda zzc(zzcyb zzcybVar, Executor executor) {
        this.zzl.add(new zzdev(zzcybVar, executor));
        return this;
    }

    public final zzdda zzd(zzcyf zzcyfVar, Executor executor) {
        this.zzf.add(new zzdev(zzcyfVar, executor));
        return this;
    }

    public final zzdda zze(zzcxl zzcxlVar, Executor executor) {
        this.zze.add(new zzdev(zzcxlVar, executor));
        return this;
    }

    public final zzdda zzf(zzcyz zzcyzVar, Executor executor) {
        this.zzh.add(new zzdev(zzcyzVar, executor));
        return this;
    }

    public final zzdda zzg(zzczk zzczkVar, Executor executor) {
        this.zzg.add(new zzdev(zzczkVar, executor));
        return this;
    }

    public final zzdda zzh(com.google.android.gms.ads.internal.overlay.zzo zzoVar, Executor executor) {
        this.zzn.add(new zzdev(zzoVar, executor));
        return this;
    }

    public final zzdda zzi(zzczw zzczwVar, Executor executor) {
        this.zzm.add(new zzdev(zzczwVar, executor));
        return this;
    }

    public final zzdda zzj(zzdag zzdagVar, Executor executor) {
        this.zzb.add(new zzdev(zzdagVar, executor));
        return this;
    }

    public final zzdda zzk(AppEventListener appEventListener, Executor executor) {
        this.zzk.add(new zzdev(appEventListener, executor));
        return this;
    }

    public final zzdda zzl(zzdfd zzdfdVar, Executor executor) {
        this.zzd.add(new zzdev(zzdfdVar, executor));
        return this;
    }

    public final zzdda zzm(zzfaf zzfafVar) {
        this.zzo = zzfafVar;
        return this;
    }

    public final zzddc zzn() {
        return new zzddc(this, null);
    }
}
