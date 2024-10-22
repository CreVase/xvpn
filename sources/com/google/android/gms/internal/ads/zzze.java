package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzze implements zzdi {
    private static final zzftm zza = zzftp.zza(new zzftm() { // from class: com.google.android.gms.internal.ads.zzzc
        @Override // com.google.android.gms.internal.ads.zzftm
        public final Object zza() {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                Object invoke = cls.getMethod("build", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]);
                invoke.getClass();
                return (zzdi) invoke;
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    });

    private zzze() {
    }

    public /* synthetic */ zzze(zzzd zzzdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdi
    public final zzdk zza(Context context, zzv zzvVar, zzs zzsVar, zzs zzsVar2, boolean z, Executor executor, zzdj zzdjVar) throws zzdh {
        return ((zzdi) zza.zza()).zza(context, zzvVar, zzsVar, zzsVar2, false, executor, zzdjVar);
    }
}
