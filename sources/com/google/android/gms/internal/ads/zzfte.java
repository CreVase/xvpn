package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzfte extends zzfth {
    final /* synthetic */ zzftf zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfte(zzftf zzftfVar, zzftj zzftjVar, CharSequence charSequence) {
        super(zzftjVar, charSequence);
        this.zza = zzftfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfth
    public final int zzc(int i) {
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfth
    public final int zzd(int i) {
        int i2 = i + 4000;
        if (i2 < ((zzfth) this).zzb.length()) {
            return i2;
        }
        return -1;
    }
}
