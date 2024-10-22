package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import defpackage.p71;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzein {
    final String zza;
    final String zzb;
    int zzc;
    long zzd;
    final Integer zze;

    public zzein(String str, String str2, int i, long j, Integer num) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = j;
        this.zze = num;
    }

    public final String toString() {
        String str = this.zza + "." + this.zzc + "." + this.zzd;
        if (!TextUtils.isEmpty(this.zzb)) {
            str = p71.m(str, ".", this.zzb);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbA)).booleanValue() && this.zze != null && !TextUtils.isEmpty(this.zzb)) {
            return str + "." + this.zze;
        }
        return str;
    }
}
