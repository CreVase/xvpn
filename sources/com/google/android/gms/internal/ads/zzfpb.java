package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* loaded from: classes.dex */
public abstract class zzfpb implements Closeable {
    public static zzfpn zza() {
        return new zzfpn();
    }

    public static zzfpn zzb(final int i, zzfpm zzfpmVar) {
        return new zzfpn(new zzftm() { // from class: com.google.android.gms.internal.ads.zzfoz
            @Override // com.google.android.gms.internal.ads.zzftm
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        }, new zzftm() { // from class: com.google.android.gms.internal.ads.zzfpa
            @Override // com.google.android.gms.internal.ads.zzftm
            public final Object zza() {
                return zzfpb.zze();
            }
        }, zzfpmVar);
    }

    public static zzfpn zzc(zzftm<Integer> zzftmVar, zzftm<Integer> zzftmVar2, zzfpm zzfpmVar) {
        return new zzfpn(zzftmVar, zzftmVar2, zzfpmVar);
    }

    public static /* synthetic */ Integer zze() {
        return -1;
    }
}
