package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzfql extends zzfre {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzfre
    public final zzfre zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    public final zzfre zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    public final zzfrf zzc() {
        return new zzfqn(this.zza, this.zzb, null);
    }
}
