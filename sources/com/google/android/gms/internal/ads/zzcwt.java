package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzcwt {
    private Context zza;
    private zzfdn zzb;
    private Bundle zzc;
    private zzfdf zzd;
    private zzcwn zze;
    private zzeez zzf;

    public final zzcwt zzd(zzeez zzeezVar) {
        this.zzf = zzeezVar;
        return this;
    }

    public final zzcwt zze(Context context) {
        this.zza = context;
        return this;
    }

    public final zzcwt zzf(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzcwt zzg(zzcwn zzcwnVar) {
        this.zze = zzcwnVar;
        return this;
    }

    public final zzcwt zzh(zzfdf zzfdfVar) {
        this.zzd = zzfdfVar;
        return this;
    }

    public final zzcwt zzi(zzfdn zzfdnVar) {
        this.zzb = zzfdnVar;
        return this;
    }

    public final zzcwv zzj() {
        return new zzcwv(this, null);
    }
}
