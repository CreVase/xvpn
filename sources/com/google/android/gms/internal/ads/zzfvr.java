package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfvr extends zzfvs {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzfvs zzc;

    public zzfvr(zzfvs zzfvsVar, int i, int i2) {
        this.zzc = zzfvsVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfsw.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfvs, java.util.List
    /* renamed from: zzh */
    public final zzfvs subList(int i, int i2) {
        zzfsw.zzh(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }
}
