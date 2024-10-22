package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzhbn implements zzhbc {
    private static final zzhbc zza = zzhbd.zza(Collections.emptySet());
    private final List zzb;
    private final List zzc;

    public /* synthetic */ zzhbn(List list, List list2, zzhbl zzhblVar) {
        this.zzb = list;
        this.zzc = list2;
    }

    public static zzhbm zza(int i, int i2) {
        return new zzhbm(i, i2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        int size = this.zzb.size();
        ArrayList arrayList = new ArrayList(this.zzc.size());
        int size2 = this.zzc.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((zzhbp) this.zzc.get(i)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet zza2 = zzhaz.zza(size);
        int size3 = this.zzb.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object zzb = ((zzhbp) this.zzb.get(i2)).zzb();
            zzb.getClass();
            zza2.add(zzb);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                obj.getClass();
                zza2.add(obj);
            }
        }
        return Collections.unmodifiableSet(zza2);
    }
}
