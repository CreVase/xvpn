package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
final class zzavy implements Comparator {
    public zzavy(zzawa zzawaVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzawe zzaweVar = (zzawe) obj;
        zzawe zzaweVar2 = (zzawe) obj2;
        int i = zzaweVar.zzc - zzaweVar2.zzc;
        if (i != 0) {
            return i;
        }
        return (zzaweVar.zza > zzaweVar2.zza ? 1 : (zzaweVar.zza == zzaweVar2.zza ? 0 : -1));
    }
}
