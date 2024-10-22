package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgwe {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzgwt zzc;
    private static final zzgwt zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzgwt zzgwtVar = null;
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
                zzgwtVar = (zzgwt) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzgwtVar;
        zzd = new zzgwv();
    }

    public static void zzA(int i, List list, zzgth zzgthVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgthVar.zzu(i, list, z);
        }
    }

    public static void zzB(int i, List list, zzgth zzgthVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgthVar.zzx(i, list, z);
        }
    }

    public static void zzC(int i, List list, zzgth zzgthVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgthVar.zzz(i, list, z);
        }
    }

    public static void zzD(int i, List list, zzgth zzgthVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgthVar.zzB(i, list, z);
        }
    }

    public static void zzE(int i, List list, zzgth zzgthVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgthVar.zzD(i, list, z);
        }
    }

    public static void zzF(int i, List list, zzgth zzgthVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgthVar.zzI(i, list, z);
        }
    }

    public static void zzG(int i, List list, zzgth zzgthVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgthVar.zzK(i, list, z);
        }
    }

    public static int zza(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgua) {
            zzgua zzguaVar = (zzgua) list;
            i = 0;
            while (i2 < size) {
                i += zzgtg.zzx(zzguaVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgtg.zzx(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzb(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgtg.zzA(i << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgtg.zzA(i << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgua) {
            zzgua zzguaVar = (zzgua) list;
            i = 0;
            while (i2 < size) {
                i += zzgtg.zzx(zzguaVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgtg.zzx(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzg(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzguy) {
            zzguy zzguyVar = (zzguy) list;
            i = 0;
            while (i2 < size) {
                i += zzgtg.zzB(zzguyVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgtg.zzB(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzh(int i, Object obj, zzgwc zzgwcVar) {
        int i2 = i << 3;
        if (obj instanceof zzgup) {
            int i3 = zzgtg.zzf;
            int zza2 = ((zzgup) obj).zza();
            return zzgtg.zzA(i2) + zzgtg.zzA(zza2) + zza2;
        }
        return zzgtg.zzA(i2) + zzgtg.zzy((zzgvj) obj, zzgwcVar);
    }

    public static int zzi(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgua) {
            zzgua zzguaVar = (zzgua) list;
            i = 0;
            while (i2 < size) {
                int zze = zzguaVar.zze(i2);
                i += zzgtg.zzA((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += zzgtg.zzA((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzj(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzguy) {
            zzguy zzguyVar = (zzguy) list;
            i = 0;
            while (i2 < size) {
                long zze = zzguyVar.zze(i2);
                i += zzgtg.zzB((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += zzgtg.zzB((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzk(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgua) {
            zzgua zzguaVar = (zzgua) list;
            i = 0;
            while (i2 < size) {
                i += zzgtg.zzA(zzguaVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgtg.zzA(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzl(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzguy) {
            zzguy zzguyVar = (zzguy) list;
            i = 0;
            while (i2 < size) {
                i += zzgtg.zzB(zzguyVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgtg.zzB(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzgwt zzm() {
        return zzc;
    }

    public static zzgwt zzn() {
        return zzd;
    }

    public static Object zzo(Object obj, int i, List list, zzgud zzgudVar, Object obj2, zzgwt zzgwtVar) {
        if (zzgudVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (zzgudVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj2 = zzp(obj, i, intValue, obj2, zzgwtVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzgudVar.zza(intValue2)) {
                    obj2 = zzp(obj, i, intValue2, obj2, zzgwtVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzp(Object obj, int i, int i2, Object obj2, zzgwt zzgwtVar) {
        if (obj2 == null) {
            obj2 = zzgwtVar.zzc(obj);
        }
        zzgwtVar.zzl(obj2, i, i2);
        return obj2;
    }

    public static void zzq(zzgwt zzgwtVar, Object obj, Object obj2) {
        zzgwtVar.zzo(obj, zzgwtVar.zze(zzgwtVar.zzd(obj), zzgwtVar.zzd(obj2)));
    }

    public static void zzr(Class cls) {
        Class cls2;
        if (!zzgtz.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzs(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static void zzt(int i, List list, zzgth zzgthVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgthVar.zzc(i, list, z);
        }
    }

    public static void zzu(int i, List list, zzgth zzgthVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgthVar.zzg(i, list, z);
        }
    }

    public static void zzv(int i, List list, zzgth zzgthVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgthVar.zzj(i, list, z);
        }
    }

    public static void zzw(int i, List list, zzgth zzgthVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgthVar.zzl(i, list, z);
        }
    }

    public static void zzx(int i, List list, zzgth zzgthVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgthVar.zzn(i, list, z);
        }
    }

    public static void zzy(int i, List list, zzgth zzgthVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgthVar.zzp(i, list, z);
        }
    }

    public static void zzz(int i, List list, zzgth zzgthVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgthVar.zzs(i, list, z);
        }
    }
}
