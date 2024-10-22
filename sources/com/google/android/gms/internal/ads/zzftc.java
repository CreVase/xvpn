package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzftc extends zzfth {
    final /* synthetic */ zzftd zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzftc(zzftd zzftdVar, zzftj zzftjVar, CharSequence charSequence) {
        super(zzftjVar, charSequence);
        this.zza = zzftdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfth
    public final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfth
    public final int zzd(int i) {
        CharSequence charSequence = ((zzfth) this).zzb;
        int length = charSequence.length();
        zzfsw.zzb(i, length, "index");
        while (i < length) {
            zzftd zzftdVar = this.zza;
            if (!zzftdVar.zza.zzb(charSequence.charAt(i))) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }
}
