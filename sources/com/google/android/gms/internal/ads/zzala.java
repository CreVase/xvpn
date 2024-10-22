package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzala {
    public final int zza;
    public final long zzb;

    private zzala(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public static zzala zza(zzabn zzabnVar, zzfb zzfbVar) throws IOException {
        ((zzabc) zzabnVar).zzm(zzfbVar.zzI(), 0, 8, false);
        zzfbVar.zzG(0);
        return new zzala(zzfbVar.zzf(), zzfbVar.zzr());
    }
}
