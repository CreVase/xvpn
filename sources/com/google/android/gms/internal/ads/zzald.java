package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzald implements zzabm {
    private final zzfb zza = new zzfb(4);
    private final zzaco zzb = new zzaco();

    @Override // com.google.android.gms.internal.ads.zzabm
    public final int zzb(zzabn zzabnVar, zzacj zzacjVar) throws IOException {
        return this.zzb.zza(zzabnVar, zzacjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzc(zzabp zzabpVar) {
        this.zzb.zzb(zzabpVar, "image/webp");
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzd(long j, long j2) {
        this.zzb.zzc(j);
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final boolean zze(zzabn zzabnVar) throws IOException {
        this.zza.zzD(4);
        zzabc zzabcVar = (zzabc) zzabnVar;
        zzabcVar.zzm(this.zza.zzI(), 0, 4, false);
        if (this.zza.zzt() == 1380533830) {
            zzabcVar.zzl(4, false);
            this.zza.zzD(4);
            zzabcVar.zzm(this.zza.zzI(), 0, 4, false);
            if (this.zza.zzt() == 1464156752) {
                return true;
            }
        }
        return false;
    }
}
