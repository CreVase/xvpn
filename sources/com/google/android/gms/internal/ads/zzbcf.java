package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbcf implements zzber {
    final /* synthetic */ zzbcg zza;

    public zzbcf(zzbcg zzbcgVar) {
        this.zza = zzbcgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final Boolean zza(String str, boolean z) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.zza.zze;
            return Boolean.valueOf(sharedPreferences2.getBoolean(str, z));
        } catch (ClassCastException unused) {
            sharedPreferences = this.zza.zze;
            return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(z)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final Double zzb(String str, double d) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.zza.zze;
            return Double.valueOf(sharedPreferences2.getFloat(str, (float) d));
        } catch (ClassCastException unused) {
            sharedPreferences = this.zza.zze;
            return Double.valueOf(sharedPreferences.getString(str, String.valueOf(d)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final Long zzc(String str, long j) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.zza.zze;
            return Long.valueOf(sharedPreferences2.getLong(str, j));
        } catch (ClassCastException unused) {
            int i = (int) j;
            sharedPreferences = this.zza.zze;
            return Long.valueOf(sharedPreferences.getInt(str, i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final String zzd(String str, String str2) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.zza.zze;
        return sharedPreferences.getString(str, str2);
    }
}
