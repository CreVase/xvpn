package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbe {
    private static zzaf zza(zzaf zzafVar, zzh zzhVar, zzal zzalVar, Boolean bool, Boolean bool2) {
        zzaf zzafVar2 = new zzaf();
        Iterator<Integer> zzg = zzafVar.zzg();
        while (zzg.hasNext()) {
            int intValue = zzg.next().intValue();
            if (zzafVar.zzc(intValue)) {
                zzaq zza = zzalVar.zza(zzhVar, Arrays.asList(zzafVar.zza(intValue), new zzai(Double.valueOf(intValue)), zzafVar));
                if (zza.zzd().equals(bool)) {
                    return zzafVar2;
                }
                if (bool2 == null || zza.zzd().equals(bool2)) {
                    zzafVar2.zzb(intValue, zza);
                }
            }
        }
        return zzafVar2;
    }

    private static zzaf zza(zzaf zzafVar, zzh zzhVar, zzal zzalVar) {
        return zza(zzafVar, zzhVar, zzalVar, null, null);
    }

    public static zzaq zza(String str, zzaf zzafVar, zzh zzhVar, List<zzaq> list) {
        String str2;
        zzal zzalVar;
        double min;
        zzh zzhVar2;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    c = 0;
                    break;
                }
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    c = 1;
                    break;
                }
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    c = 2;
                    break;
                }
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    c = 3;
                    break;
                }
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c = 4;
                    break;
                }
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c = 5;
                    break;
                }
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c = 6;
                    break;
                }
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c = 7;
                    break;
                }
                break;
            case 107868:
                if (str.equals("map")) {
                    c = '\b';
                    break;
                }
                break;
            case 111185:
                if (str.equals("pop")) {
                    c = '\t';
                    break;
                }
                break;
            case 3267882:
                if (str.equals("join")) {
                    c = '\n';
                    break;
                }
                break;
            case 3452698:
                if (str.equals("push")) {
                    c = 11;
                    break;
                }
                break;
            case 3536116:
                if (str.equals("some")) {
                    c = '\f';
                    break;
                }
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c = '\r';
                    break;
                }
                break;
            case 96891675:
                if (str.equals("every")) {
                    c = 14;
                    break;
                }
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c = 15;
                    break;
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c = 16;
                    break;
                }
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c = 17;
                    break;
                }
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c = 18;
                    break;
                }
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c = 19;
                    break;
                }
                break;
        }
        double d = 0.0d;
        switch (c) {
            case 0:
                zzg.zza("toString", 0, list);
                return new zzas(zzafVar.toString());
            case 1:
                zzaf zzafVar2 = (zzaf) zzafVar.zzc();
                if (!list.isEmpty()) {
                    Iterator<zzaq> it = list.iterator();
                    while (it.hasNext()) {
                        zzaq zza = zzhVar.zza(it.next());
                        if (!(zza instanceof zzaj)) {
                            int zzb = zzafVar2.zzb();
                            if (zza instanceof zzaf) {
                                zzaf zzafVar3 = (zzaf) zza;
                                Iterator<Integer> zzg = zzafVar3.zzg();
                                while (zzg.hasNext()) {
                                    Integer next = zzg.next();
                                    zzafVar2.zzb(next.intValue() + zzb, zzafVar3.zza(next.intValue()));
                                }
                            } else {
                                zzafVar2.zzb(zzb, zza);
                            }
                        } else {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                    }
                }
                return zzafVar2;
            case 2:
                zzg.zza("filter", 1, list);
                zzaq zza2 = zzhVar.zza(list.get(0));
                if (zza2 instanceof zzar) {
                    if (zzafVar.zza() == 0) {
                        return new zzaf();
                    }
                    zzaf zzafVar4 = (zzaf) zzafVar.zzc();
                    zzaf zza3 = zza(zzafVar, zzhVar, (zzar) zza2, null, Boolean.TRUE);
                    zzaf zzafVar5 = new zzaf();
                    Iterator<Integer> zzg2 = zza3.zzg();
                    while (zzg2.hasNext()) {
                        zzafVar5.zza(zzafVar4.zza(zzg2.next().intValue()));
                    }
                    return zzafVar5;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 3:
                return zza(zzafVar, zzhVar, list, true);
            case 4:
                if (list.isEmpty()) {
                    return new zzaf();
                }
                int zza4 = (int) zzg.zza(zzhVar.zza(list.get(0)).zze().doubleValue());
                if (zza4 < 0) {
                    zza4 = Math.max(0, zzafVar.zzb() + zza4);
                } else if (zza4 > zzafVar.zzb()) {
                    zza4 = zzafVar.zzb();
                }
                int zzb2 = zzafVar.zzb();
                zzaf zzafVar6 = new zzaf();
                if (list.size() <= 1) {
                    while (zza4 < zzb2) {
                        zzafVar6.zza(zzafVar.zza(zza4));
                        zzafVar.zzb(zza4, null);
                        zza4++;
                    }
                    return zzafVar6;
                }
                int max = Math.max(0, (int) zzg.zza(zzhVar.zza(list.get(1)).zze().doubleValue()));
                if (max > 0) {
                    for (int i = zza4; i < Math.min(zzb2, zza4 + max); i++) {
                        zzafVar6.zza(zzafVar.zza(zza4));
                        zzafVar.zzb(zza4);
                    }
                }
                if (list.size() > 2) {
                    for (int i2 = 2; i2 < list.size(); i2++) {
                        zzaq zza5 = zzhVar.zza(list.get(i2));
                        if (!(zza5 instanceof zzaj)) {
                            zzafVar.zza((zza4 + i2) - 2, zza5);
                        } else {
                            throw new IllegalArgumentException("Failed to parse elements to add");
                        }
                    }
                }
                return zzafVar6;
            case 5:
                zzg.zza("forEach", 1, list);
                zzaq zza6 = zzhVar.zza(list.get(0));
                if (zza6 instanceof zzar) {
                    if (zzafVar.zza() == 0) {
                        return zzaq.zzc;
                    }
                    zza(zzafVar, zzhVar, (zzar) zza6);
                    return zzaq.zzc;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 6:
                zzg.zzc("lastIndexOf", 2, list);
                zzaq zzaqVar = zzaq.zzc;
                if (!list.isEmpty()) {
                    zzaqVar = zzhVar.zza(list.get(0));
                }
                double zzb3 = zzafVar.zzb() - 1;
                if (list.size() > 1) {
                    zzaq zza7 = zzhVar.zza(list.get(1));
                    if (Double.isNaN(zza7.zze().doubleValue())) {
                        zzb3 = zzafVar.zzb() - 1;
                    } else {
                        zzb3 = zzg.zza(zza7.zze().doubleValue());
                    }
                    if (zzb3 < 0.0d) {
                        zzb3 += zzafVar.zzb();
                    }
                }
                if (zzb3 < 0.0d) {
                    return new zzai(Double.valueOf(-1.0d));
                }
                for (int min2 = (int) Math.min(zzafVar.zzb(), zzb3); min2 >= 0; min2--) {
                    if (zzafVar.zzc(min2) && zzg.zza(zzafVar.zza(min2), zzaqVar)) {
                        return new zzai(Double.valueOf(min2));
                    }
                }
                return new zzai(Double.valueOf(-1.0d));
            case 7:
                if (!list.isEmpty()) {
                    zzaf zzafVar7 = new zzaf();
                    Iterator<zzaq> it2 = list.iterator();
                    while (it2.hasNext()) {
                        zzaq zza8 = zzhVar.zza(it2.next());
                        if (!(zza8 instanceof zzaj)) {
                            zzafVar7.zza(zza8);
                        } else {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                    }
                    int zzb4 = zzafVar7.zzb();
                    Iterator<Integer> zzg3 = zzafVar.zzg();
                    while (zzg3.hasNext()) {
                        Integer next2 = zzg3.next();
                        zzafVar7.zzb(next2.intValue() + zzb4, zzafVar.zza(next2.intValue()));
                    }
                    zzafVar.zzj();
                    Iterator<Integer> zzg4 = zzafVar7.zzg();
                    while (zzg4.hasNext()) {
                        Integer next3 = zzg4.next();
                        zzafVar.zzb(next3.intValue(), zzafVar7.zza(next3.intValue()));
                    }
                }
                return new zzai(Double.valueOf(zzafVar.zzb()));
            case '\b':
                zzg.zza("map", 1, list);
                zzaq zza9 = zzhVar.zza(list.get(0));
                if (zza9 instanceof zzar) {
                    if (zzafVar.zzb() == 0) {
                        return new zzaf();
                    }
                    return zza(zzafVar, zzhVar, (zzar) zza9);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\t':
                zzg.zza("pop", 0, list);
                int zzb5 = zzafVar.zzb();
                if (zzb5 == 0) {
                    return zzaq.zzc;
                }
                int i3 = zzb5 - 1;
                zzaq zza10 = zzafVar.zza(i3);
                zzafVar.zzb(i3);
                return zza10;
            case '\n':
                zzg.zzc("join", 1, list);
                if (zzafVar.zzb() == 0) {
                    return zzaq.zzj;
                }
                if (list.isEmpty()) {
                    str2 = ",";
                } else {
                    zzaq zza11 = zzhVar.zza(list.get(0));
                    str2 = ((zza11 instanceof zzao) || (zza11 instanceof zzax)) ? "" : zza11.zzf();
                }
                return new zzas(zzafVar.zzb(str2));
            case 11:
                if (!list.isEmpty()) {
                    Iterator<zzaq> it3 = list.iterator();
                    while (it3.hasNext()) {
                        zzafVar.zza(zzhVar.zza(it3.next()));
                    }
                }
                return new zzai(Double.valueOf(zzafVar.zzb()));
            case '\f':
                zzg.zza("some", 1, list);
                zzaq zza12 = zzhVar.zza(list.get(0));
                if (zza12 instanceof zzal) {
                    if (zzafVar.zzb() != 0) {
                        zzal zzalVar2 = (zzal) zza12;
                        Iterator<Integer> zzg5 = zzafVar.zzg();
                        while (zzg5.hasNext()) {
                            int intValue = zzg5.next().intValue();
                            if (zzafVar.zzc(intValue) && zzalVar2.zza(zzhVar, Arrays.asList(zzafVar.zza(intValue), new zzai(Double.valueOf(intValue)), zzafVar)).zzd().booleanValue()) {
                                return zzaq.zzh;
                            }
                        }
                    }
                    return zzaq.zzi;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\r':
                zzg.zzc("sort", 1, list);
                if (zzafVar.zzb() >= 2) {
                    List<zzaq> zzi = zzafVar.zzi();
                    if (list.isEmpty()) {
                        zzalVar = null;
                    } else {
                        zzaq zza13 = zzhVar.zza(list.get(0));
                        if (zza13 instanceof zzal) {
                            zzalVar = (zzal) zza13;
                        } else {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                    }
                    Collections.sort(zzi, new zzbh(zzalVar, zzhVar));
                    zzafVar.zzj();
                    Iterator<zzaq> it4 = zzi.iterator();
                    int i4 = 0;
                    while (it4.hasNext()) {
                        zzafVar.zzb(i4, it4.next());
                        i4++;
                    }
                }
                return zzafVar;
            case 14:
                zzg.zza("every", 1, list);
                zzaq zza14 = zzhVar.zza(list.get(0));
                if (zza14 instanceof zzar) {
                    if (zzafVar.zzb() != 0 && zza(zzafVar, zzhVar, (zzar) zza14, Boolean.FALSE, Boolean.TRUE).zzb() != zzafVar.zzb()) {
                        return zzaq.zzi;
                    }
                    return zzaq.zzh;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 15:
                zzg.zza("shift", 0, list);
                if (zzafVar.zzb() == 0) {
                    return zzaq.zzc;
                }
                zzaq zza15 = zzafVar.zza(0);
                zzafVar.zzb(0);
                return zza15;
            case 16:
                zzg.zzc("slice", 2, list);
                if (list.isEmpty()) {
                    return zzafVar.zzc();
                }
                double zzb6 = zzafVar.zzb();
                double zza16 = zzg.zza(zzhVar.zza(list.get(0)).zze().doubleValue());
                if (zza16 < 0.0d) {
                    min = Math.max(zza16 + zzb6, 0.0d);
                } else {
                    min = Math.min(zza16, zzb6);
                }
                if (list.size() == 2) {
                    double zza17 = zzg.zza(zzhVar.zza(list.get(1)).zze().doubleValue());
                    if (zza17 < 0.0d) {
                        zzb6 = Math.max(zzb6 + zza17, 0.0d);
                    } else {
                        zzb6 = Math.min(zzb6, zza17);
                    }
                }
                zzaf zzafVar8 = new zzaf();
                for (int i5 = (int) min; i5 < zzb6; i5++) {
                    zzafVar8.zza(zzafVar.zza(i5));
                }
                return zzafVar8;
            case 17:
                return zza(zzafVar, zzhVar, list, false);
            case 18:
                zzg.zza("reverse", 0, list);
                int zzb7 = zzafVar.zzb();
                if (zzb7 != 0) {
                    for (int i6 = 0; i6 < zzb7 / 2; i6++) {
                        if (zzafVar.zzc(i6)) {
                            zzaq zza18 = zzafVar.zza(i6);
                            zzafVar.zzb(i6, null);
                            int i7 = (zzb7 - 1) - i6;
                            if (zzafVar.zzc(i7)) {
                                zzafVar.zzb(i6, zzafVar.zza(i7));
                            }
                            zzafVar.zzb(i7, zza18);
                        }
                    }
                }
                return zzafVar;
            case 19:
                zzg.zzc("indexOf", 2, list);
                zzaq zzaqVar2 = zzaq.zzc;
                if (list.isEmpty()) {
                    zzhVar2 = zzhVar;
                } else {
                    zzhVar2 = zzhVar;
                    zzaqVar2 = zzhVar2.zza(list.get(0));
                }
                if (list.size() > 1) {
                    double zza19 = zzg.zza(zzhVar2.zza(list.get(1)).zze().doubleValue());
                    if (zza19 >= zzafVar.zzb()) {
                        return new zzai(Double.valueOf(-1.0d));
                    }
                    d = zza19 < 0.0d ? zzafVar.zzb() + zza19 : zza19;
                }
                Iterator<Integer> zzg6 = zzafVar.zzg();
                while (zzg6.hasNext()) {
                    int intValue2 = zzg6.next().intValue();
                    double d2 = intValue2;
                    if (d2 >= d && zzg.zza(zzafVar.zza(intValue2), zzaqVar2)) {
                        return new zzai(Double.valueOf(d2));
                    }
                }
                return new zzai(Double.valueOf(-1.0d));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    private static zzaq zza(zzaf zzafVar, zzh zzhVar, List<zzaq> list, boolean z) {
        zzaq zzaqVar;
        zzg.zzb("reduce", 1, list);
        zzg.zzc("reduce", 2, list);
        zzaq zza = zzhVar.zza(list.get(0));
        if (zza instanceof zzal) {
            if (list.size() == 2) {
                zzaqVar = zzhVar.zza(list.get(1));
                if (zzaqVar instanceof zzaj) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else {
                if (zzafVar.zzb() == 0) {
                    throw new IllegalStateException("Empty array with no initial value error");
                }
                zzaqVar = null;
            }
            zzal zzalVar = (zzal) zza;
            int zzb = zzafVar.zzb();
            int i = z ? 0 : zzb - 1;
            int i2 = z ? zzb - 1 : 0;
            int i3 = z ? 1 : -1;
            if (zzaqVar == null) {
                zzaqVar = zzafVar.zza(i);
                i += i3;
            }
            while ((i2 - i) * i3 >= 0) {
                if (zzafVar.zzc(i)) {
                    zzaqVar = zzalVar.zza(zzhVar, Arrays.asList(zzaqVar, zzafVar.zza(i), new zzai(Double.valueOf(i)), zzafVar));
                    if (zzaqVar instanceof zzaj) {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                    i += i3;
                } else {
                    i += i3;
                }
            }
            return zzaqVar;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }
}
