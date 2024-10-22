package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class zzguv extends zzgux {
    public /* synthetic */ zzguv(zzguu zzguuVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgux
    public final List zza(Object obj, long j) {
        int i;
        zzgui zzguiVar = (zzgui) zzgxd.zzh(obj, j);
        if (!zzguiVar.zzc()) {
            int size = zzguiVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            zzgui zzd = zzguiVar.zzd(i);
            zzgxd.zzv(obj, j, zzd);
            return zzd;
        }
        return zzguiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgux
    public final void zzb(Object obj, long j) {
        ((zzgui) zzgxd.zzh(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgux
    public final void zzc(Object obj, Object obj2, long j) {
        zzgui zzguiVar = (zzgui) zzgxd.zzh(obj, j);
        zzgui zzguiVar2 = (zzgui) zzgxd.zzh(obj2, j);
        int size = zzguiVar.size();
        int size2 = zzguiVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzguiVar.zzc()) {
                zzguiVar = zzguiVar.zzd(size2 + size);
            }
            zzguiVar.addAll(zzguiVar2);
        }
        if (size > 0) {
            zzguiVar2 = zzguiVar;
        }
        zzgxd.zzv(obj, j, zzguiVar2);
    }

    private zzguv() {
        super(null);
    }
}
