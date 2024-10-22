package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzux implements zzvo {
    final /* synthetic */ zzva zza;
    private final int zzb;

    public zzux(zzva zzvaVar, int i) {
        this.zza = zzvaVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final int zza(zzkn zzknVar, zzht zzhtVar, int i) {
        return this.zza.zzg(this.zzb, zzknVar, zzhtVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final int zzb(long j) {
        return this.zza.zzi(this.zzb, j);
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final void zzd() throws IOException {
        this.zza.zzI(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final boolean zze() {
        return this.zza.zzP(this.zzb);
    }
}
