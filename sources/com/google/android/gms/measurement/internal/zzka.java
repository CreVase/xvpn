package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* loaded from: classes2.dex */
final class zzka implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ Uri zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ zzjx zze;

    public zzka(zzjx zzjxVar, boolean z, Uri uri, String str, String str2) {
        this.zze = zzjxVar;
        this.zza = z;
        this.zzb = uri;
        this.zzc = str;
        this.zzd = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjx.zza(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
