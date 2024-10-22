package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class zzfvx extends zzfvn implements Set {
    private transient zzfvs zza;

    public static int zzh(int i) {
        boolean z;
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            z = true;
        } else {
            z = false;
        }
        zzfsw.zzf(z, "collection too large");
        return 1073741824;
    }

    public static zzfvw zzj(int i) {
        return new zzfvw(i);
    }

    public static zzfvx zzl(Collection collection) {
        Object[] array = collection.toArray();
        return zzs(array.length, array);
    }

    public static zzfvx zzm() {
        return zzfxi.zza;
    }

    public static zzfvx zzn(Object obj) {
        return new zzfxp(obj);
    }

    public static zzfvx zzo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzs(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzfvx zzp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return zzs(12, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfvx zzs(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int zzh = zzh(i);
                Object[] objArr2 = new Object[zzh];
                int i2 = zzh - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    zzfxa.zza(obj, i5);
                    int hashCode = obj.hashCode();
                    int zza = zzfvk.zza(hashCode);
                    while (true) {
                        int i6 = zza & i2;
                        Object obj2 = objArr2[i6];
                        if (obj2 == null) {
                            objArr[i4] = obj;
                            objArr2[i6] = obj;
                            i3 += hashCode;
                            i4++;
                            break;
                        }
                        if (!obj2.equals(obj)) {
                            zza++;
                        }
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    return new zzfxp(obj3);
                }
                if (zzh(i4) < zzh / 2) {
                    return zzs(i4, objArr);
                }
                if (zzt(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new zzfxi(objArr, i3, objArr2, i2, i4);
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzfxp(obj4);
        }
        return zzfxi.zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzt(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfvx) && zzr() && ((zzfvx) obj).zzr() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzfxo.zzc(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzfxo.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public zzfvs zzd() {
        zzfvs zzfvsVar = this.zza;
        if (zzfvsVar == null) {
            zzfvs zzi = zzi();
            this.zza = zzi;
            return zzi;
        }
        return zzfvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzfxs iterator();

    public zzfvs zzi() {
        Object[] array = toArray();
        int i = zzfvs.zzd;
        return zzfvs.zzi(array, array.length);
    }

    public boolean zzr() {
        return false;
    }
}
