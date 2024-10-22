package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class zzym {
    public static final zzyg zza = new zzyg(0, -9223372036854775807L, null);
    public static final zzyg zzb = new zzyg(1, -9223372036854775807L, null);
    public static final zzyg zzc = new zzyg(2, -9223372036854775807L, null);
    public static final zzyg zzd = new zzyg(3, -9223372036854775807L, null);
    private final ExecutorService zze = zzfk.zzC("ExoPlayer:Loader:ProgressiveMediaPeriod");
    private zzyh zzf;
    private IOException zzg;

    public zzym(String str) {
    }

    public static zzyg zzb(boolean z, long j) {
        return new zzyg(z ? 1 : 0, j, null);
    }

    public final long zza(zzyi zzyiVar, zzye zzyeVar, int i) {
        Looper myLooper = Looper.myLooper();
        zzdx.zzb(myLooper);
        this.zzg = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzyh(this, myLooper, zzyiVar, zzyeVar, i, elapsedRealtime).zzc(0L);
        return elapsedRealtime;
    }

    public final void zzg() {
        zzyh zzyhVar = this.zzf;
        zzdx.zzb(zzyhVar);
        zzyhVar.zza(false);
    }

    public final void zzh() {
        this.zzg = null;
    }

    public final void zzi(int i) throws IOException {
        IOException iOException = this.zzg;
        if (iOException == null) {
            zzyh zzyhVar = this.zzf;
            if (zzyhVar != null) {
                zzyhVar.zzb(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void zzj(zzyj zzyjVar) {
        zzyh zzyhVar = this.zzf;
        if (zzyhVar != null) {
            zzyhVar.zza(true);
        }
        this.zze.execute(new zzyk(zzyjVar));
        this.zze.shutdown();
    }

    public final boolean zzk() {
        return this.zzg != null;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}
