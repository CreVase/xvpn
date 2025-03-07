package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdr {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzeg zzc;
    private static final zzeg zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzeg zzegVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzegVar = (zzeg) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzegVar;
        zzd = new zzei();
    }

    public static Object zzA(Object obj, int i, int i2, Object obj2, zzeg zzegVar) {
        if (obj2 == null) {
            obj2 = zzegVar.zzc(obj);
        }
        zzegVar.zzf(obj2, i, i2);
        return obj2;
    }

    public static void zzB(zzeg zzegVar, Object obj, Object obj2) {
        zzegVar.zzh(obj, zzegVar.zze(zzegVar.zzd(obj), zzegVar.zzd(obj2)));
    }

    public static void zzC(Class cls) {
        Class cls2;
        if (!zzcb.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzD(int i, List list, zzey zzeyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzc(i, list, z);
        }
    }

    public static void zzE(int i, List list, zzey zzeyVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zze(i, list);
        }
    }

    public static void zzF(int i, List list, zzey zzeyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzg(i, list, z);
        }
    }

    public static void zzG(int i, List list, zzey zzeyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzj(i, list, z);
        }
    }

    public static void zzH(int i, List list, zzey zzeyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzl(i, list, z);
        }
    }

    public static void zzI(int i, List list, zzey zzeyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzn(i, list, z);
        }
    }

    public static void zzJ(int i, List list, zzey zzeyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzp(i, list, z);
        }
    }

    public static void zzK(int i, List list, zzey zzeyVar, zzdp zzdpVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((zzbj) zzeyVar).zzq(i, list.get(i2), zzdpVar);
            }
        }
    }

    public static void zzL(int i, List list, zzey zzeyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzs(i, list, z);
        }
    }

    public static void zzM(int i, List list, zzey zzeyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzu(i, list, z);
        }
    }

    public static void zzN(int i, List list, zzey zzeyVar, zzdp zzdpVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((zzbj) zzeyVar).zzv(i, list.get(i2), zzdpVar);
            }
        }
    }

    public static void zzO(int i, List list, zzey zzeyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzx(i, list, z);
        }
    }

    public static void zzP(int i, List list, zzey zzeyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzz(i, list, z);
        }
    }

    public static void zzQ(int i, List list, zzey zzeyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzB(i, list, z);
        }
    }

    public static void zzR(int i, List list, zzey zzeyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzD(i, list, z);
        }
    }

    public static void zzS(int i, List list, zzey zzeyVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzG(i, list);
        }
    }

    public static void zzT(int i, List list, zzey zzeyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzI(i, list, z);
        }
    }

    public static void zzU(int i, List list, zzey zzeyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzeyVar.zzK(i, list, z);
        }
    }

    public static boolean zzV(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbi.zzx(i << 3) + 1) * size;
    }

    public static int zzb(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzx = zzbi.zzx(i << 3) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int zzd2 = ((zzba) list.get(i2)).zzd();
            zzx += zzbi.zzx(zzd2) + zzd2;
        }
        return zzx;
    }

    public static int zzc(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbi.zzx(i << 3) * size) + zzd(list);
    }

    public static int zzd(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzcc) {
            zzcc zzccVar = (zzcc) list;
            i = 0;
            while (i2 < size) {
                i += zzbi.zzu(zzccVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbi.zzu(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zze(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbi.zzx(i << 3) + 4) * size;
    }

    public static int zzf(List list) {
        return list.size() * 4;
    }

    public static int zzg(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbi.zzx(i << 3) + 8) * size;
    }

    public static int zzh(List list) {
        return list.size() * 8;
    }

    public static int zzi(int i, List list, zzdp zzdpVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzbi.zzt(i, (zzdf) list.get(i3), zzdpVar);
        }
        return i2;
    }

    public static int zzj(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbi.zzx(i << 3) * size) + zzk(list);
    }

    public static int zzk(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzcc) {
            zzcc zzccVar = (zzcc) list;
            i = 0;
            while (i2 < size) {
                i += zzbi.zzu(zzccVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbi.zzu(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzl(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzbi.zzx(i << 3) * list.size()) + zzm(list);
    }

    public static int zzm(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzcu) {
            zzcu zzcuVar = (zzcu) list;
            i = 0;
            while (i2 < size) {
                i += zzbi.zzy(zzcuVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbi.zzy(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzn(int i, Object obj, zzdp zzdpVar) {
        if (obj instanceof zzcl) {
            int i2 = zzbi.zzb;
            int zza2 = ((zzcl) obj).zza();
            return zzbi.zzx(i << 3) + zzbi.zzx(zza2) + zza2;
        }
        return zzbi.zzx(i << 3) + zzbi.zzv((zzdf) obj, zzdpVar);
    }

    public static int zzo(int i, List list, zzdp zzdpVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzx = zzbi.zzx(i << 3) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzcl) {
                int zza2 = ((zzcl) obj).zza();
                zzx = zzbi.zzx(zza2) + zza2 + zzx;
            } else {
                zzx = zzbi.zzv((zzdf) obj, zzdpVar) + zzx;
            }
        }
        return zzx;
    }

    public static int zzp(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbi.zzx(i << 3) * size) + zzq(list);
    }

    public static int zzq(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzcc) {
            zzcc zzccVar = (zzcc) list;
            i = 0;
            while (i2 < size) {
                int zze = zzccVar.zze(i2);
                i += zzbi.zzx((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += zzbi.zzx((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzr(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbi.zzx(i << 3) * size) + zzs(list);
    }

    public static int zzs(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzcu) {
            zzcu zzcuVar = (zzcu) list;
            i = 0;
            while (i2 < size) {
                long zze = zzcuVar.zze(i2);
                i += zzbi.zzy((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += zzbi.zzy((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzt(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z = list instanceof zzcn;
        int zzx = zzbi.zzx(i << 3) * size;
        if (z) {
            zzcn zzcnVar = (zzcn) list;
            while (i2 < size) {
                Object zzf = zzcnVar.zzf(i2);
                if (zzf instanceof zzba) {
                    int zzd2 = ((zzba) zzf).zzd();
                    zzx = zzbi.zzx(zzd2) + zzd2 + zzx;
                } else {
                    zzx = zzbi.zzw((String) zzf) + zzx;
                }
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzba) {
                    int zzd3 = ((zzba) obj).zzd();
                    zzx = zzbi.zzx(zzd3) + zzd3 + zzx;
                } else {
                    zzx = zzbi.zzw((String) obj) + zzx;
                }
                i2++;
            }
        }
        return zzx;
    }

    public static int zzu(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbi.zzx(i << 3) * size) + zzv(list);
    }

    public static int zzv(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzcc) {
            zzcc zzccVar = (zzcc) list;
            i = 0;
            while (i2 < size) {
                i += zzbi.zzx(zzccVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbi.zzx(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzw(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbi.zzx(i << 3) * size) + zzx(list);
    }

    public static int zzx(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzcu) {
            zzcu zzcuVar = (zzcu) list;
            i = 0;
            while (i2 < size) {
                i += zzbi.zzy(zzcuVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbi.zzy(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzeg zzy() {
        return zzc;
    }

    public static zzeg zzz() {
        return zzd;
    }
}
