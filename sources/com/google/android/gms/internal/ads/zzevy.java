package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ml1;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzevy implements zzetw {
    private final Context zza;
    private final zzcac zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final String zze;
    private final zzbzt zzf;

    public zzevy(zzbzt zzbztVar, int i, Context context, zzcac zzcacVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.zzf = zzbztVar;
        this.zza = context;
        this.zzb = zzcacVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 44;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return zzfzt.zze((zzfzk) zzfzt.zzo(zzfzt.zzm(zzfzk.zzu(zzfzt.zzk(new zzfyz() { // from class: com.google.android.gms.internal.ads.zzevv
            @Override // com.google.android.gms.internal.ads.zzfyz
            public final ml1 zza() {
                return zzfzt.zzh(null);
            }
        }, this.zzd)), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzevw
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new zzevz(str);
            }
        }, this.zzd), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzaU)).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzevx
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                zzevy.this.zzc((Exception) obj);
                return null;
            }
        }, zzgaj.zzb());
    }

    public final /* synthetic */ zzevz zzc(Exception exc) {
        this.zzb.zzu(exc, "AttestationTokenSignal");
        return null;
    }
}
