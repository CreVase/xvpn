package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaef implements zzabp {
    private final long zzb;
    private final zzabp zzc;

    public zzaef(long j, zzabp zzabpVar) {
        this.zzb = j;
        this.zzc = zzabpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final void zzD() {
        this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final void zzO(zzacm zzacmVar) {
        this.zzc.zzO(new zzaee(this, zzacmVar, zzacmVar));
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final zzacs zzw(int i, int i2) {
        return this.zzc.zzw(i, i2);
    }
}
