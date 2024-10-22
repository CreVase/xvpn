package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzfqc extends zzfqo {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzfqo
    public final zzfqo zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqo
    public final zzfqo zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqo
    public final zzfqp zzc() {
        return new zzfqe(this.zza, this.zzb, null);
    }
}
