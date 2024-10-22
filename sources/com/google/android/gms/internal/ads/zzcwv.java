package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzcwv {
    private final Context zza;
    private final zzfdn zzb;
    private final Bundle zzc;
    private final zzfdf zzd;
    private final zzcwn zze;
    private final zzeez zzf;

    public /* synthetic */ zzcwv(zzcwt zzcwtVar, zzcwu zzcwuVar) {
        this.zza = zzcwt.zza(zzcwtVar);
        this.zzb = zzcwt.zzm(zzcwtVar);
        this.zzc = zzcwt.zzb(zzcwtVar);
        this.zzd = zzcwt.zzl(zzcwtVar);
        this.zze = zzcwt.zzc(zzcwtVar);
        this.zzf = zzcwt.zzk(zzcwtVar);
    }

    public final Context zza(Context context) {
        return this.zza;
    }

    public final Bundle zzb() {
        return this.zzc;
    }

    public final zzcwn zzc() {
        return this.zze;
    }

    public final zzcwt zzd() {
        zzcwt zzcwtVar = new zzcwt();
        zzcwtVar.zze(this.zza);
        zzcwtVar.zzi(this.zzb);
        zzcwtVar.zzf(this.zzc);
        zzcwtVar.zzg(this.zze);
        zzcwtVar.zzd(this.zzf);
        return zzcwtVar;
    }

    public final zzeez zze(String str) {
        zzeez zzeezVar = this.zzf;
        if (zzeezVar != null) {
            return zzeezVar;
        }
        return new zzeez(str);
    }

    public final zzfdf zzf() {
        return this.zzd;
    }

    public final zzfdn zzg() {
        return this.zzb;
    }
}
