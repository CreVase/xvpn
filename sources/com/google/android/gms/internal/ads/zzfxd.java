package com.google.android.gms.internal.ads;

import java.util.AbstractMap;

/* loaded from: classes.dex */
final class zzfxd extends zzfvs {
    final /* synthetic */ zzfxe zza;

    public zzfxd(zzfxe zzfxeVar) {
        this.zza = zzfxeVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zza.zzc;
        zzfsw.zza(i, i2, "index");
        zzfxe zzfxeVar = this.zza;
        objArr = zzfxeVar.zzb;
        int i3 = i + i;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = zzfxeVar.zzb;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zza.zzc;
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final boolean zzf() {
        return true;
    }
}
