package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class zzbca {
    private final int zza;
    private final String zzb;
    private final Object zzc;

    public /* synthetic */ zzbca(int i, String str, Object obj, zzbbz zzbbzVar) {
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        com.google.android.gms.ads.internal.client.zzba.zza().zzd(this);
    }

    public static zzbca zzf(int i, String str, float f) {
        return new zzbbx(1, str, Float.valueOf(f));
    }

    public static zzbca zzg(int i, String str, int i2) {
        return new zzbbv(1, str, Integer.valueOf(i2));
    }

    public static zzbca zzh(int i, String str, long j) {
        return new zzbbw(1, str, Long.valueOf(j));
    }

    public static zzbca zzi(int i, String str, Boolean bool) {
        return new zzbbu(i, str, bool);
    }

    public static zzbca zzj(int i, String str, String str2) {
        return new zzbby(1, str, str2);
    }

    public static zzbca zzk(int i, String str) {
        zzbca zzj = zzj(1, "gads:sdk_core_constants:experiment_id", null);
        com.google.android.gms.ads.internal.client.zzba.zza().zzc(zzj);
        return zzj;
    }

    public abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    public abstract Object zzc(SharedPreferences sharedPreferences);

    public abstract void zzd(SharedPreferences.Editor editor, Object obj);

    public final int zze() {
        return this.zza;
    }

    public final Object zzl() {
        return com.google.android.gms.ads.internal.client.zzba.zzc().zzb(this);
    }

    public final Object zzm() {
        return this.zzc;
    }

    public final String zzn() {
        return this.zzb;
    }
}
