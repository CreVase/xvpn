package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzxj {
    public final zzcx zza;
    public final int[] zzb;

    public zzxj(zzcx zzcxVar, int[] iArr, int i) {
        if (iArr.length == 0) {
            zzer.zzd("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzcxVar;
        this.zzb = iArr;
    }
}
