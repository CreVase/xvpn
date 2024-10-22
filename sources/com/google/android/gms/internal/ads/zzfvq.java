package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfvq extends zzfts {
    private final zzfvs zza;

    public zzfvq(zzfvs zzfvsVar, int i) {
        super(zzfvsVar.size(), i);
        this.zza = zzfvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
