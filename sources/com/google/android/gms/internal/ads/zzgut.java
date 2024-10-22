package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class zzgut extends zzgux {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ zzgut(zzgus zzgusVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j, int i) {
        zzguq zzguqVar;
        List arrayList;
        List list = (List) zzgxd.zzh(obj, j);
        if (list.isEmpty()) {
            if (list instanceof zzgur) {
                arrayList = new zzguq(i);
            } else if ((list instanceof zzgvq) && (list instanceof zzgui)) {
                arrayList = ((zzgui) list).zzd(i);
            } else {
                arrayList = new ArrayList(i);
            }
            zzgxd.zzv(obj, j, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            zzgxd.zzv(obj, j, arrayList2);
            zzguqVar = arrayList2;
        } else if (list instanceof zzgwy) {
            zzguq zzguqVar2 = new zzguq(list.size() + i);
            zzguqVar2.addAll(zzguqVar2.size(), (zzgwy) list);
            zzgxd.zzv(obj, j, zzguqVar2);
            zzguqVar = zzguqVar2;
        } else {
            if ((list instanceof zzgvq) && (list instanceof zzgui)) {
                zzgui zzguiVar = (zzgui) list;
                if (!zzguiVar.zzc()) {
                    zzgui zzd = zzguiVar.zzd(list.size() + i);
                    zzgxd.zzv(obj, j, zzd);
                    return zzd;
                }
                return list;
            }
            return list;
        }
        return zzguqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgux
    public final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzgux
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzgxd.zzh(obj, j);
        if (list instanceof zzgur) {
            unmodifiableList = ((zzgur) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzgvq) && (list instanceof zzgui)) {
                zzgui zzguiVar = (zzgui) list;
                if (zzguiVar.zzc()) {
                    zzguiVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzgxd.zzv(obj, j, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.zzgux
    public final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzgxd.zzh(obj2, j);
        List zzf = zzf(obj, j, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzgxd.zzv(obj, j, list);
    }

    private zzgut() {
        super(null);
    }
}
