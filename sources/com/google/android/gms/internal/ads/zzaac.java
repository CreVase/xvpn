package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class zzaac {
    private final Handler zza;
    private final zzaad zzb;

    public zzaac(Handler handler, zzaad zzaadVar) {
        this.zza = zzaadVar == null ? null : handler;
        this.zzb = zzaadVar;
    }

    public final void zza(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzs
                @Override // java.lang.Runnable
                public final void run() {
                    zzaac.this.zzg(str, j, j2);
                }
            });
        }
    }

    public final void zzb(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaab
                @Override // java.lang.Runnable
                public final void run() {
                    zzaac.this.zzh(str);
                }
            });
        }
    }

    public final void zzc(final zzid zzidVar) {
        zzidVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaa
                @Override // java.lang.Runnable
                public final void run() {
                    zzaac.this.zzi(zzidVar);
                }
            });
        }
    }

    public final void zzd(final int i, final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzu
                @Override // java.lang.Runnable
                public final void run() {
                    zzaac.this.zzj(i, j);
                }
            });
        }
    }

    public final void zze(final zzid zzidVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzy
                @Override // java.lang.Runnable
                public final void run() {
                    zzaac.this.zzk(zzidVar);
                }
            });
        }
    }

    public final void zzf(final zzam zzamVar, final zzie zzieVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzz
                @Override // java.lang.Runnable
                public final void run() {
                    zzaac.this.zzl(zzamVar, zzieVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzg(String str, long j, long j2) {
        int i = zzfk.zza;
        this.zzb.zzo(str, j, j2);
    }

    public final /* synthetic */ void zzh(String str) {
        int i = zzfk.zza;
        this.zzb.zzp(str);
    }

    public final /* synthetic */ void zzi(zzid zzidVar) {
        zzidVar.zza();
        int i = zzfk.zza;
        this.zzb.zzq(zzidVar);
    }

    public final /* synthetic */ void zzj(int i, long j) {
        int i2 = zzfk.zza;
        this.zzb.zzk(i, j);
    }

    public final /* synthetic */ void zzk(zzid zzidVar) {
        int i = zzfk.zza;
        this.zzb.zzr(zzidVar);
    }

    public final /* synthetic */ void zzl(zzam zzamVar, zzie zzieVar) {
        int i = zzfk.zza;
        this.zzb.zzt(zzamVar, zzieVar);
    }

    public final /* synthetic */ void zzm(Object obj, long j) {
        int i = zzfk.zza;
        this.zzb.zzl(obj, j);
    }

    public final /* synthetic */ void zzn(long j, int i) {
        int i2 = zzfk.zza;
        this.zzb.zzs(j, i);
    }

    public final /* synthetic */ void zzo(Exception exc) {
        int i = zzfk.zza;
        this.zzb.zzn(exc);
    }

    public final /* synthetic */ void zzp(zzdm zzdmVar) {
        int i = zzfk.zza;
        this.zzb.zzu(zzdmVar);
    }

    public final void zzq(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzv
                @Override // java.lang.Runnable
                public final void run() {
                    zzaac.this.zzm(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j, final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzw
                @Override // java.lang.Runnable
                public final void run() {
                    zzaac.this.zzn(j, i);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzx
                @Override // java.lang.Runnable
                public final void run() {
                    zzaac.this.zzo(exc);
                }
            });
        }
    }

    public final void zzt(final zzdm zzdmVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzt
                @Override // java.lang.Runnable
                public final void run() {
                    zzaac.this.zzp(zzdmVar);
                }
            });
        }
    }
}
