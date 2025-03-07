package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzakq {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private String zze;

    public zzakq(int i, int i2, int i3) {
        String str;
        if (i == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = i + "/";
        }
        this.zza = str;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = Integer.MIN_VALUE;
        this.zze = "";
    }

    private final void zzd() {
        if (this.zzd != Integer.MIN_VALUE) {
        } else {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final int zza() {
        zzd();
        return this.zzd;
    }

    public final String zzb() {
        zzd();
        return this.zze;
    }

    public final void zzc() {
        int i;
        int i2 = this.zzd;
        if (i2 == Integer.MIN_VALUE) {
            i = this.zzb;
        } else {
            i = i2 + this.zzc;
        }
        this.zzd = i;
        this.zze = this.zza + i;
    }
}
