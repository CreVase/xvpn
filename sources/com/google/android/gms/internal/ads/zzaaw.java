package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaaw {
    public static final zzaaw zza = new zzaaw(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzaaw(int i, long j, long j2) {
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzaaw zzd(long j, long j2) {
        return new zzaaw(-1, j, j2);
    }

    public static zzaaw zze(long j) {
        return new zzaaw(0, -9223372036854775807L, j);
    }

    public static zzaaw zzf(long j, long j2) {
        return new zzaaw(-2, j, j2);
    }
}
