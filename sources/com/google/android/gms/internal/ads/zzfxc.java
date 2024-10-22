package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfxc extends zzfvs {
    static final zzfvs zza = new zzfxc(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzfxc(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfsw.zza(i, this.zzc, "index");
        Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfvs, com.google.android.gms.internal.ads.zzfvn
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.zzc);
        return i + this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final Object[] zzg() {
        return this.zzb;
    }
}
