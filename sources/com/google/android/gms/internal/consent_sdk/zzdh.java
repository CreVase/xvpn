package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdh extends zzde {
    static final zzde zza = new zzdh(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzdh(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzcx.zza(i, this.zzc, "index");
        Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzde, com.google.android.gms.internal.consent_sdk.zzdb
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb
    public final Object[] zze() {
        return this.zzb;
    }
}
