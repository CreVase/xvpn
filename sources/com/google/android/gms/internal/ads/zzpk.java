package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzpk {
    private final zzpj zza;
    private int zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;

    public zzpk(AudioTrack audioTrack) {
        int i = zzfk.zza;
        this.zza = new zzpj(audioTrack);
        zzh(0);
    }

    private final void zzh(int i) {
        this.zzb = i;
        long j = 10000;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    j = 500000;
                } else {
                    j = 10000000;
                }
            } else {
                this.zzd = 10000L;
                return;
            }
        } else {
            this.zze = 0L;
            this.zzf = -1L;
            this.zzc = System.nanoTime() / 1000;
        }
        this.zzd = j;
    }

    @TargetApi(19)
    public final long zza() {
        return this.zza.zza();
    }

    @TargetApi(19)
    public final long zzb() {
        return this.zza.zzb();
    }

    public final void zzc() {
        if (this.zzb == 4) {
            zzh(0);
        }
    }

    public final void zzd() {
        zzh(4);
    }

    public final void zze() {
        zzh(0);
    }

    public final boolean zzf() {
        return this.zzb == 2;
    }

    @TargetApi(19)
    public final boolean zzg(long j) {
        if (j - this.zze < this.zzd) {
            return false;
        }
        zzpj zzpjVar = this.zza;
        this.zze = j;
        boolean zzc = zzpjVar.zzc();
        int i = this.zzb;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return zzc;
                    }
                    if (!zzc) {
                        return false;
                    }
                    zzh(0);
                    return true;
                }
                if (!zzc) {
                    zzh(0);
                    return false;
                }
            } else if (zzc) {
                if (this.zza.zza() > this.zzf) {
                    zzh(2);
                    return true;
                }
            } else {
                zzh(0);
                return false;
            }
            return true;
        }
        if (zzc) {
            if (this.zza.zzb() < this.zzc) {
                return false;
            }
            this.zzf = this.zza.zza();
            zzh(1);
            return true;
        }
        if (j - this.zzc <= 500000) {
            return false;
        }
        zzh(3);
        return false;
    }
}
