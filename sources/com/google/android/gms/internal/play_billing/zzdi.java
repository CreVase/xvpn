package com.google.android.gms.internal.play_billing;

import defpackage.p71;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdi<T> implements zzdp<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzeq.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzdf zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzct zzl;
    private final zzeg zzm;
    private final zzbo zzn;
    private final int zzo;
    private final zzdk zzp;
    private final zzda zzq;

    private zzdi(int[] iArr, Object[] objArr, int i, int i2, zzdf zzdfVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzdk zzdkVar, zzct zzctVar, zzeg zzegVar, zzbo zzboVar, zzda zzdaVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzo = i3;
        boolean z2 = false;
        if (zzboVar != null && zzboVar.zzc(zzdfVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i4;
        this.zzk = i5;
        this.zzp = zzdkVar;
        this.zzl = zzctVar;
        this.zzm = zzegVar;
        this.zzn = zzboVar;
        this.zzg = zzdfVar;
        this.zzq = zzdaVar;
    }

    private final zzce zzA(int i) {
        int i2 = i / 3;
        return (zzce) this.zzd[i2 + i2 + 1];
    }

    private final zzdp zzB(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzdp zzdpVar = (zzdp) this.zzd[i3];
        if (zzdpVar != null) {
            return zzdpVar;
        }
        zzdp zzb2 = zzdn.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzC(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzD(Object obj, int i) {
        zzdp zzB = zzB(i);
        int zzy = zzy(i) & 1048575;
        if (!zzP(obj, i)) {
            return zzB.zze();
        }
        Object object = zzb.getObject(obj, zzy);
        if (zzS(object)) {
            return object;
        }
        Object zze = zzB.zze();
        if (object != null) {
            zzB.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzE(Object obj, int i, int i2) {
        zzdp zzB = zzB(i2);
        if (!zzT(obj, i, i2)) {
            return zzB.zze();
        }
        Object object = zzb.getObject(obj, zzy(i2) & 1048575);
        if (zzS(object)) {
            return object;
        }
        Object zze = zzB.zze();
        if (object != null) {
            zzB.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzF(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder q = p71.q("Field ", str, " for ", name, " not found. Known fields are ");
            q.append(arrays);
            throw new RuntimeException(q.toString());
        }
    }

    private static void zzG(Object obj) {
        if (zzS(obj)) {
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzH(Object obj, Object obj2, int i) {
        if (!zzP(obj2, i)) {
            return;
        }
        int zzy = zzy(i) & 1048575;
        Unsafe unsafe = zzb;
        long j = zzy;
        Object object = unsafe.getObject(obj2, j);
        if (object != null) {
            zzdp zzB = zzB(i);
            if (!zzP(obj, i)) {
                if (!zzS(object)) {
                    unsafe.putObject(obj, j, object);
                } else {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                }
                zzJ(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
    }

    private final void zzI(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (!zzT(obj2, i2, i)) {
            return;
        }
        int zzy = zzy(i) & 1048575;
        Unsafe unsafe = zzb;
        long j = zzy;
        Object object = unsafe.getObject(obj2, j);
        if (object != null) {
            zzdp zzB = zzB(i);
            if (!zzT(obj, i2, i)) {
                if (!zzS(object)) {
                    unsafe.putObject(obj, j, object);
                } else {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                }
                zzK(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
    }

    private final void zzJ(Object obj, int i) {
        int zzv = zzv(i);
        long j = 1048575 & zzv;
        if (j == 1048575) {
            return;
        }
        zzeq.zzq(obj, j, (1 << (zzv >>> 20)) | zzeq.zzc(obj, j));
    }

    private final void zzK(Object obj, int i, int i2) {
        zzeq.zzq(obj, zzv(i2) & 1048575, i);
    }

    private final void zzL(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzy(i) & 1048575, obj2);
        zzJ(obj, i);
    }

    private final void zzM(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzy(i2) & 1048575, obj2);
        zzK(obj, i, i2);
    }

    private final void zzN(zzey zzeyVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzO(Object obj, Object obj2, int i) {
        if (zzP(obj, i) == zzP(obj2, i)) {
            return true;
        }
        return false;
    }

    private final boolean zzP(Object obj, int i) {
        int zzv = zzv(i);
        long j = zzv & 1048575;
        if (j == 1048575) {
            int zzy = zzy(i);
            long j2 = zzy & 1048575;
            switch (zzx(zzy)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzeq.zza(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzeq.zzb(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzeq.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzeq.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzeq.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzeq.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzeq.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzeq.zzw(obj, j2);
                case 8:
                    Object zzf = zzeq.zzf(obj, j2);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (zzf instanceof zzba) {
                        if (zzba.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (zzeq.zzf(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzba.zzb.equals(zzeq.zzf(obj, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzeq.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzeq.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzeq.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzeq.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzeq.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzeq.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzeq.zzf(obj, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzeq.zzc(obj, j) & (1 << (zzv >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzQ(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzP(obj, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzR(Object obj, int i, zzdp zzdpVar) {
        return zzdpVar.zzk(zzeq.zzf(obj, i & 1048575));
    }

    private static boolean zzS(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzcb) {
            return ((zzcb) obj).zzt();
        }
        return true;
    }

    private final boolean zzT(Object obj, int i, int i2) {
        if (zzeq.zzc(obj, zzv(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    private static boolean zzU(Object obj, long j) {
        return ((Boolean) zzeq.zzf(obj, j)).booleanValue();
    }

    private static final void zzV(int i, Object obj, zzey zzeyVar) throws IOException {
        if (obj instanceof String) {
            zzeyVar.zzF(i, (String) obj);
        } else {
            zzeyVar.zzd(i, (zzba) obj);
        }
    }

    public static zzeh zzd(Object obj) {
        zzcb zzcbVar = (zzcb) obj;
        zzeh zzehVar = zzcbVar.zzc;
        if (zzehVar == zzeh.zzc()) {
            zzeh zzf = zzeh.zzf();
            zzcbVar.zzc = zzf;
            return zzf;
        }
        return zzehVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.play_billing.zzdi zzl(java.lang.Class r30, com.google.android.gms.internal.play_billing.zzdc r31, com.google.android.gms.internal.play_billing.zzdk r32, com.google.android.gms.internal.play_billing.zzct r33, com.google.android.gms.internal.play_billing.zzeg r34, com.google.android.gms.internal.play_billing.zzbo r35, com.google.android.gms.internal.play_billing.zzda r36) {
        /*
            Method dump skipped, instructions count: 993
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zzl(java.lang.Class, com.google.android.gms.internal.play_billing.zzdc, com.google.android.gms.internal.play_billing.zzdk, com.google.android.gms.internal.play_billing.zzct, com.google.android.gms.internal.play_billing.zzeg, com.google.android.gms.internal.play_billing.zzbo, com.google.android.gms.internal.play_billing.zzda):com.google.android.gms.internal.play_billing.zzdi");
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzeq.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzeq.zzf(obj, j)).floatValue();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x003d. Please report as an issue. */
    private final int zzo(Object obj) {
        int i;
        int zzx;
        int zzx2;
        int zzy;
        int zzx3;
        int i2;
        int i3;
        int zzx4;
        int zzx5;
        int zzx6;
        int zzn;
        int zzx7;
        int zzx8;
        int zzh;
        int zzx9;
        int zzx10;
        int i4;
        int zzy2;
        int zzx11;
        Unsafe unsafe = zzb;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        int i9 = 0;
        while (i6 < this.zzc.length) {
            int zzy3 = zzy(i6);
            int[] iArr = this.zzc;
            int i10 = iArr[i6];
            int zzx12 = zzx(zzy3);
            if (zzx12 <= 17) {
                int i11 = iArr[i6 + 2];
                int i12 = i11 & i5;
                int i13 = i11 >>> 20;
                if (i12 != i8) {
                    i9 = unsafe.getInt(obj, i12);
                    i8 = i12;
                }
                i = 1 << i13;
            } else {
                i = 0;
            }
            long j = i5 & zzy3;
            switch (zzx12) {
                case 0:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzx = zzbi.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i7 += zzn;
                        break;
                    }
                case 1:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzx2 = zzbi.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 2:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzy = zzbi.zzy(unsafe.getLong(obj, j));
                        zzx3 = zzbi.zzx(i10 << 3);
                        int i14 = zzy;
                        i2 = zzx3;
                        i3 = i14;
                        i7 = i2 + i3 + i7;
                        break;
                    }
                case 3:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzy = zzbi.zzy(unsafe.getLong(obj, j));
                        zzx3 = zzbi.zzx(i10 << 3);
                        int i142 = zzy;
                        i2 = zzx3;
                        i3 = i142;
                        i7 = i2 + i3 + i7;
                        break;
                    }
                case 4:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        i3 = zzbi.zzu(unsafe.getInt(obj, j));
                        i2 = zzbi.zzx(i10 << 3);
                        i7 = i2 + i3 + i7;
                        break;
                    }
                case 5:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzx = zzbi.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i7 += zzn;
                        break;
                    }
                case 6:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzx2 = zzbi.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 7:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzx4 = zzbi.zzx(i10 << 3);
                        zzn = zzx4 + 1;
                        i7 += zzn;
                        break;
                    }
                case 8:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzba) {
                            int i15 = zzbi.zzb;
                            int zzd = ((zzba) object).zzd();
                            zzx5 = zzd + zzbi.zzx(zzd);
                            zzx6 = zzbi.zzx(i10 << 3);
                            zzn = zzx5 + zzx6;
                            i7 += zzn;
                            break;
                        } else {
                            i3 = zzbi.zzw((String) object);
                            i2 = zzbi.zzx(i10 << 3);
                            i7 = i2 + i3 + i7;
                            break;
                        }
                    }
                case 9:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzn = zzdr.zzn(i10, unsafe.getObject(obj, j), zzB(i6));
                        i7 += zzn;
                        break;
                    }
                case 10:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzba zzbaVar = (zzba) unsafe.getObject(obj, j);
                        int i16 = zzbi.zzb;
                        int zzd2 = zzbaVar.zzd();
                        zzx5 = zzd2 + zzbi.zzx(zzd2);
                        zzx6 = zzbi.zzx(i10 << 3);
                        zzn = zzx5 + zzx6;
                        i7 += zzn;
                        break;
                    }
                case 11:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        i3 = zzbi.zzx(unsafe.getInt(obj, j));
                        i2 = zzbi.zzx(i10 << 3);
                        i7 = i2 + i3 + i7;
                        break;
                    }
                case 12:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        i3 = zzbi.zzu(unsafe.getInt(obj, j));
                        i2 = zzbi.zzx(i10 << 3);
                        i7 = i2 + i3 + i7;
                        break;
                    }
                case 13:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzx2 = zzbi.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 14:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzx = zzbi.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i7 += zzn;
                        break;
                    }
                case 15:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i17 = unsafe.getInt(obj, j);
                        zzx7 = zzbi.zzx(i10 << 3);
                        zzx8 = zzbi.zzx((i17 >> 31) ^ (i17 + i17));
                        zzn = zzx8 + zzx7;
                        i7 += zzn;
                        break;
                    }
                case 16:
                    if ((i & i9) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        zzx5 = zzbi.zzx(i10 << 3);
                        zzx6 = zzbi.zzy((j2 >> 63) ^ (j2 + j2));
                        zzn = zzx5 + zzx6;
                        i7 += zzn;
                        break;
                    }
                case 17:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzn = zzbi.zzt(i10, (zzdf) unsafe.getObject(obj, j), zzB(i6));
                        i7 += zzn;
                        break;
                    }
                case 18:
                    zzn = zzdr.zzg(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 19:
                    zzn = zzdr.zze(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 20:
                    zzn = zzdr.zzl(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 21:
                    zzn = zzdr.zzw(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 22:
                    zzn = zzdr.zzj(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 23:
                    zzn = zzdr.zzg(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 24:
                    zzn = zzdr.zze(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 25:
                    zzn = zzdr.zza(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 26:
                    zzn = zzdr.zzt(i10, (List) unsafe.getObject(obj, j));
                    i7 += zzn;
                    break;
                case 27:
                    zzn = zzdr.zzo(i10, (List) unsafe.getObject(obj, j), zzB(i6));
                    i7 += zzn;
                    break;
                case 28:
                    zzn = zzdr.zzb(i10, (List) unsafe.getObject(obj, j));
                    i7 += zzn;
                    break;
                case 29:
                    zzn = zzdr.zzu(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 30:
                    zzn = zzdr.zzc(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 31:
                    zzn = zzdr.zze(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 32:
                    zzn = zzdr.zzg(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 33:
                    zzn = zzdr.zzp(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 34:
                    zzn = zzdr.zzr(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzn;
                    break;
                case 35:
                    zzh = zzdr.zzh((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 36:
                    zzh = zzdr.zzf((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 37:
                    zzh = zzdr.zzm((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 38:
                    zzh = zzdr.zzx((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 39:
                    zzh = zzdr.zzk((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 40:
                    zzh = zzdr.zzh((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 41:
                    zzh = zzdr.zzf((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(obj, j);
                    int i18 = zzdr.zza;
                    zzh = list.size();
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 43:
                    zzh = zzdr.zzv((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 44:
                    zzh = zzdr.zzd((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 45:
                    zzh = zzdr.zzf((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 46:
                    zzh = zzdr.zzh((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 47:
                    zzh = zzdr.zzq((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 48:
                    zzh = zzdr.zzs((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzbi.zzx(zzh);
                        zzx10 = zzbi.zzx(i10 << 3);
                        i4 = zzx10 + zzx9;
                        i7 += i4 + zzh;
                        break;
                    }
                case 49:
                    zzn = zzdr.zzi(i10, (List) unsafe.getObject(obj, j), zzB(i6));
                    i7 += zzn;
                    break;
                case 50:
                    zzda.zza(i10, unsafe.getObject(obj, j), zzC(i6));
                    break;
                case 51:
                    if (!zzT(obj, i10, i6)) {
                        break;
                    } else {
                        zzx = zzbi.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i7 += zzn;
                        break;
                    }
                case 52:
                    if (!zzT(obj, i10, i6)) {
                        break;
                    } else {
                        zzx2 = zzbi.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 53:
                    if (!zzT(obj, i10, i6)) {
                        break;
                    } else {
                        zzy2 = zzbi.zzy(zzz(obj, j));
                        zzx11 = zzbi.zzx(i10 << 3);
                        int i19 = zzy2;
                        i4 = zzx11;
                        zzh = i19;
                        i7 += i4 + zzh;
                        break;
                    }
                case 54:
                    if (!zzT(obj, i10, i6)) {
                        break;
                    } else {
                        zzy2 = zzbi.zzy(zzz(obj, j));
                        zzx11 = zzbi.zzx(i10 << 3);
                        int i192 = zzy2;
                        i4 = zzx11;
                        zzh = i192;
                        i7 += i4 + zzh;
                        break;
                    }
                case 55:
                    if (!zzT(obj, i10, i6)) {
                        break;
                    } else {
                        zzh = zzbi.zzu(zzp(obj, j));
                        i4 = zzbi.zzx(i10 << 3);
                        i7 += i4 + zzh;
                        break;
                    }
                case 56:
                    if (!zzT(obj, i10, i6)) {
                        break;
                    } else {
                        zzx = zzbi.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i7 += zzn;
                        break;
                    }
                case 57:
                    if (!zzT(obj, i10, i6)) {
                        break;
                    } else {
                        zzx2 = zzbi.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 58:
                    if (!zzT(obj, i10, i6)) {
                        break;
                    } else {
                        zzx4 = zzbi.zzx(i10 << 3);
                        zzn = zzx4 + 1;
                        i7 += zzn;
                        break;
                    }
                case 59:
                    if (!zzT(obj, i10, i6)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzba) {
                            int i20 = zzbi.zzb;
                            int zzd3 = ((zzba) object2).zzd();
                            zzx5 = zzd3 + zzbi.zzx(zzd3);
                            zzx6 = zzbi.zzx(i10 << 3);
                            zzn = zzx5 + zzx6;
                            i7 += zzn;
                            break;
                        } else {
                            zzh = zzbi.zzw((String) object2);
                            i4 = zzbi.zzx(i10 << 3);
                            i7 += i4 + zzh;
                            break;
                        }
                    }
                case 60:
                    if (!zzT(obj, i10, i6)) {
                        break;
                    } else {
                        zzn = zzdr.zzn(i10, unsafe.getObject(obj, j), zzB(i6));
                        i7 += zzn;
                        break;
                    }
                case 61:
                    if (!zzT(obj, i10, i6)) {
                        break;
                    } else {
                        zzba zzbaVar2 = (zzba) unsafe.getObject(obj, j);
                        int i21 = zzbi.zzb;
                        int zzd4 = zzbaVar2.zzd();
                        zzx5 = zzd4 + zzbi.zzx(zzd4);
                        zzx6 = zzbi.zzx(i10 << 3);
                        zzn = zzx5 + zzx6;
                        i7 += zzn;
                        break;
                    }
                case 62:
                    if (!zzT(obj, i10, i6)) {
                        break;
                    } else {
                        zzh = zzbi.zzx(zzp(obj, j));
                        i4 = zzbi.zzx(i10 << 3);
                        i7 += i4 + zzh;
                        break;
                    }
                case 63:
                    if (!zzT(obj, i10, i6)) {
                        break;
                    } else {
                        zzh = zzbi.zzu(zzp(obj, j));
                        i4 = zzbi.zzx(i10 << 3);
                        i7 += i4 + zzh;
                        break;
                    }
                case 64:
                    if (!zzT(obj, i10, i6)) {
                        break;
                    } else {
                        zzx2 = zzbi.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i7 += zzn;
                        break;
                    }
                case 65:
                    if (!zzT(obj, i10, i6)) {
                        break;
                    } else {
                        zzx = zzbi.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i7 += zzn;
                        break;
                    }
                case 66:
                    if (!zzT(obj, i10, i6)) {
                        break;
                    } else {
                        int zzp = zzp(obj, j);
                        zzx7 = zzbi.zzx(i10 << 3);
                        zzx8 = zzbi.zzx((zzp >> 31) ^ (zzp + zzp));
                        zzn = zzx8 + zzx7;
                        i7 += zzn;
                        break;
                    }
                case 67:
                    if (!zzT(obj, i10, i6)) {
                        break;
                    } else {
                        long zzz = zzz(obj, j);
                        zzx5 = zzbi.zzx(i10 << 3);
                        zzx6 = zzbi.zzy((zzz >> 63) ^ (zzz + zzz));
                        zzn = zzx5 + zzx6;
                        i7 += zzn;
                        break;
                    }
                case 68:
                    if (!zzT(obj, i10, i6)) {
                        break;
                    } else {
                        zzn = zzbi.zzt(i10, (zzdf) unsafe.getObject(obj, j), zzB(i6));
                        i7 += zzn;
                        break;
                    }
            }
            i6 += 3;
            i5 = 1048575;
        }
        zzeg zzegVar = this.zzm;
        int zza2 = i7 + zzegVar.zza(zzegVar.zzd(obj));
        if (!this.zzh) {
            return zza2;
        }
        this.zzn.zza(obj);
        throw null;
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzeq.zzf(obj, j)).intValue();
    }

    private final int zzq(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzan zzanVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzC = zzC(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzcz) object).zze()) {
            zzcz zzb2 = zzcz.zza().zzb();
            zzda.zzb(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        throw null;
    }

    private final int zzr(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzan zzanVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzao.zzp(bArr, i))));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzao.zzb(bArr, i))));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int zzm = zzao.zzm(bArr, i, zzanVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzanVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int zzj = zzao.zzj(bArr, i, zzanVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzanVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzao.zzp(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzao.zzb(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzm2 = zzao.zzm(bArr, i, zzanVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzanVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return zzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zzj2 = zzao.zzj(bArr, i, zzanVar);
                    int i13 = zzanVar.zza;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !zzev.zze(bArr, zzj2, zzj2 + i13)) {
                            throw zzci.zzc();
                        }
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i13, zzcg.zzb));
                        zzj2 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzj2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object zzE = zzE(obj, i4, i8);
                    int zzo = zzao.zzo(zzE, zzB(i8), bArr, i, i2, zzanVar);
                    zzM(obj, i4, i8, zzE);
                    return zzo;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int zza2 = zzao.zza(bArr, i, zzanVar);
                    unsafe.putObject(obj, j, zzanVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zzj3 = zzao.zzj(bArr, i, zzanVar);
                    int i14 = zzanVar.zza;
                    zzce zzA = zzA(i8);
                    if (zzA != null && !zzA.zza(i14)) {
                        zzd(obj).zzj(i3, Long.valueOf(i14));
                    } else {
                        unsafe.putObject(obj, j, Integer.valueOf(i14));
                        unsafe.putInt(obj, j2, i4);
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int zzj4 = zzao.zzj(bArr, i, zzanVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzbe.zzb(zzanVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return zzj4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int zzm3 = zzao.zzm(bArr, i, zzanVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzbe.zzc(zzanVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object zzE2 = zzE(obj, i4, i8);
                    int zzn = zzao.zzn(zzE2, zzB(i8), bArr, i, i2, (i3 & (-8)) | 4, zzanVar);
                    zzM(obj, i4, i8, zzE2);
                    return zzn;
                }
                break;
        }
        return i;
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzan zzanVar) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int zzl;
        int i12 = i;
        Unsafe unsafe = zzb;
        zzcf zzcfVar = (zzcf) unsafe.getObject(obj, j2);
        if (!zzcfVar.zzc()) {
            int size = zzcfVar.size();
            zzcfVar = zzcfVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzcfVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzbk zzbkVar = (zzbk) zzcfVar;
                    int zzj = zzao.zzj(bArr, i12, zzanVar);
                    int i13 = zzanVar.zza + zzj;
                    while (zzj < i13) {
                        zzbkVar.zze(Double.longBitsToDouble(zzao.zzp(bArr, zzj)));
                        zzj += 8;
                    }
                    if (zzj == i13) {
                        return zzj;
                    }
                    throw zzci.zzg();
                }
                if (i5 == 1) {
                    zzbk zzbkVar2 = (zzbk) zzcfVar;
                    zzbkVar2.zze(Double.longBitsToDouble(zzao.zzp(bArr, i)));
                    while (true) {
                        i8 = i12 + 8;
                        if (i8 < i2) {
                            i12 = zzao.zzj(bArr, i8, zzanVar);
                            if (i3 == zzanVar.zza) {
                                zzbkVar2.zze(Double.longBitsToDouble(zzao.zzp(bArr, i12)));
                            }
                        }
                    }
                    return i8;
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzbu zzbuVar = (zzbu) zzcfVar;
                    int zzj2 = zzao.zzj(bArr, i12, zzanVar);
                    int i14 = zzanVar.zza + zzj2;
                    while (zzj2 < i14) {
                        zzbuVar.zze(Float.intBitsToFloat(zzao.zzb(bArr, zzj2)));
                        zzj2 += 4;
                    }
                    if (zzj2 == i14) {
                        return zzj2;
                    }
                    throw zzci.zzg();
                }
                if (i5 == 5) {
                    zzbu zzbuVar2 = (zzbu) zzcfVar;
                    zzbuVar2.zze(Float.intBitsToFloat(zzao.zzb(bArr, i)));
                    while (true) {
                        i9 = i12 + 4;
                        if (i9 < i2) {
                            i12 = zzao.zzj(bArr, i9, zzanVar);
                            if (i3 == zzanVar.zza) {
                                zzbuVar2.zze(Float.intBitsToFloat(zzao.zzb(bArr, i12)));
                            }
                        }
                    }
                    return i9;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzcu zzcuVar = (zzcu) zzcfVar;
                    int zzj3 = zzao.zzj(bArr, i12, zzanVar);
                    int i15 = zzanVar.zza + zzj3;
                    while (zzj3 < i15) {
                        zzj3 = zzao.zzm(bArr, zzj3, zzanVar);
                        zzcuVar.zzf(zzanVar.zzb);
                    }
                    if (zzj3 == i15) {
                        return zzj3;
                    }
                    throw zzci.zzg();
                }
                if (i5 == 0) {
                    zzcu zzcuVar2 = (zzcu) zzcfVar;
                    int zzm = zzao.zzm(bArr, i12, zzanVar);
                    zzcuVar2.zzf(zzanVar.zzb);
                    while (zzm < i2) {
                        int zzj4 = zzao.zzj(bArr, zzm, zzanVar);
                        if (i3 != zzanVar.zza) {
                            return zzm;
                        }
                        zzm = zzao.zzm(bArr, zzj4, zzanVar);
                        zzcuVar2.zzf(zzanVar.zzb);
                    }
                    return zzm;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzao.zzf(bArr, i12, zzcfVar, zzanVar);
                }
                if (i5 == 0) {
                    return zzao.zzl(i3, bArr, i, i2, zzcfVar, zzanVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzcu zzcuVar3 = (zzcu) zzcfVar;
                    int zzj5 = zzao.zzj(bArr, i12, zzanVar);
                    int i16 = zzanVar.zza + zzj5;
                    while (zzj5 < i16) {
                        zzcuVar3.zzf(zzao.zzp(bArr, zzj5));
                        zzj5 += 8;
                    }
                    if (zzj5 == i16) {
                        return zzj5;
                    }
                    throw zzci.zzg();
                }
                if (i5 == 1) {
                    zzcu zzcuVar4 = (zzcu) zzcfVar;
                    zzcuVar4.zzf(zzao.zzp(bArr, i));
                    while (true) {
                        i10 = i12 + 8;
                        if (i10 < i2) {
                            i12 = zzao.zzj(bArr, i10, zzanVar);
                            if (i3 == zzanVar.zza) {
                                zzcuVar4.zzf(zzao.zzp(bArr, i12));
                            }
                        }
                    }
                    return i10;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzcc zzccVar = (zzcc) zzcfVar;
                    int zzj6 = zzao.zzj(bArr, i12, zzanVar);
                    int i17 = zzanVar.zza + zzj6;
                    while (zzj6 < i17) {
                        zzccVar.zzf(zzao.zzb(bArr, zzj6));
                        zzj6 += 4;
                    }
                    if (zzj6 == i17) {
                        return zzj6;
                    }
                    throw zzci.zzg();
                }
                if (i5 == 5) {
                    zzcc zzccVar2 = (zzcc) zzcfVar;
                    zzccVar2.zzf(zzao.zzb(bArr, i));
                    while (true) {
                        i11 = i12 + 4;
                        if (i11 < i2) {
                            i12 = zzao.zzj(bArr, i11, zzanVar);
                            if (i3 == zzanVar.zza) {
                                zzccVar2.zzf(zzao.zzb(bArr, i12));
                            }
                        }
                    }
                    return i11;
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzap zzapVar = (zzap) zzcfVar;
                    int zzj7 = zzao.zzj(bArr, i12, zzanVar);
                    int i18 = zzanVar.zza + zzj7;
                    while (zzj7 < i18) {
                        zzj7 = zzao.zzm(bArr, zzj7, zzanVar);
                        zzapVar.zze(zzanVar.zzb != 0);
                    }
                    if (zzj7 == i18) {
                        return zzj7;
                    }
                    throw zzci.zzg();
                }
                if (i5 == 0) {
                    zzap zzapVar2 = (zzap) zzcfVar;
                    int zzm2 = zzao.zzm(bArr, i12, zzanVar);
                    zzapVar2.zze(zzanVar.zzb != 0);
                    while (zzm2 < i2) {
                        int zzj8 = zzao.zzj(bArr, zzm2, zzanVar);
                        if (i3 != zzanVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzao.zzm(bArr, zzj8, zzanVar);
                        zzapVar2.zze(zzanVar.zzb != 0);
                    }
                    return zzm2;
                }
                break;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        i12 = zzao.zzj(bArr, i12, zzanVar);
                        int i19 = zzanVar.zza;
                        if (i19 < 0) {
                            throw zzci.zzd();
                        }
                        if (i19 == 0) {
                            zzcfVar.add("");
                        } else {
                            zzcfVar.add(new String(bArr, i12, i19, zzcg.zzb));
                            i12 += i19;
                        }
                        while (i12 < i2) {
                            int zzj9 = zzao.zzj(bArr, i12, zzanVar);
                            if (i3 != zzanVar.zza) {
                                break;
                            } else {
                                i12 = zzao.zzj(bArr, zzj9, zzanVar);
                                int i20 = zzanVar.zza;
                                if (i20 < 0) {
                                    throw zzci.zzd();
                                }
                                if (i20 == 0) {
                                    zzcfVar.add("");
                                } else {
                                    zzcfVar.add(new String(bArr, i12, i20, zzcg.zzb));
                                    i12 += i20;
                                }
                            }
                        }
                        break;
                    } else {
                        i12 = zzao.zzj(bArr, i12, zzanVar);
                        int i21 = zzanVar.zza;
                        if (i21 < 0) {
                            throw zzci.zzd();
                        }
                        if (i21 == 0) {
                            zzcfVar.add("");
                        } else {
                            int i22 = i12 + i21;
                            if (zzev.zze(bArr, i12, i22)) {
                                zzcfVar.add(new String(bArr, i12, i21, zzcg.zzb));
                                i12 = i22;
                            } else {
                                throw zzci.zzc();
                            }
                        }
                        while (i12 < i2) {
                            int zzj10 = zzao.zzj(bArr, i12, zzanVar);
                            if (i3 != zzanVar.zza) {
                                break;
                            } else {
                                i12 = zzao.zzj(bArr, zzj10, zzanVar);
                                int i23 = zzanVar.zza;
                                if (i23 < 0) {
                                    throw zzci.zzd();
                                }
                                if (i23 == 0) {
                                    zzcfVar.add("");
                                } else {
                                    int i24 = i12 + i23;
                                    if (zzev.zze(bArr, i12, i24)) {
                                        zzcfVar.add(new String(bArr, i12, i23, zzcg.zzb));
                                        i12 = i24;
                                    } else {
                                        throw zzci.zzc();
                                    }
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 27:
                if (i5 == 2) {
                    return zzao.zze(zzB(i6), i3, bArr, i, i2, zzcfVar, zzanVar);
                }
                break;
            case 28:
                if (i5 == 2) {
                    int zzj11 = zzao.zzj(bArr, i12, zzanVar);
                    int i25 = zzanVar.zza;
                    if (i25 >= 0) {
                        if (i25 > bArr.length - zzj11) {
                            throw zzci.zzg();
                        }
                        if (i25 == 0) {
                            zzcfVar.add(zzba.zzb);
                        } else {
                            zzcfVar.add(zzba.zzl(bArr, zzj11, i25));
                            zzj11 += i25;
                        }
                        while (zzj11 < i2) {
                            int zzj12 = zzao.zzj(bArr, zzj11, zzanVar);
                            if (i3 != zzanVar.zza) {
                                return zzj11;
                            }
                            zzj11 = zzao.zzj(bArr, zzj12, zzanVar);
                            int i26 = zzanVar.zza;
                            if (i26 >= 0) {
                                if (i26 > bArr.length - zzj11) {
                                    throw zzci.zzg();
                                }
                                if (i26 == 0) {
                                    zzcfVar.add(zzba.zzb);
                                } else {
                                    zzcfVar.add(zzba.zzl(bArr, zzj11, i26));
                                    zzj11 += i26;
                                }
                            } else {
                                throw zzci.zzd();
                            }
                        }
                        return zzj11;
                    }
                    throw zzci.zzd();
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    zzl = zzao.zzf(bArr, i12, zzcfVar, zzanVar);
                } else if (i5 == 0) {
                    zzl = zzao.zzl(i3, bArr, i, i2, zzcfVar, zzanVar);
                }
                zzce zzA = zzA(i6);
                zzeg zzegVar = this.zzm;
                int i27 = zzdr.zza;
                if (zzA != null) {
                    Object obj2 = null;
                    if (zzcfVar instanceof RandomAccess) {
                        int size2 = zzcfVar.size();
                        int i28 = 0;
                        for (int i29 = 0; i29 < size2; i29++) {
                            int intValue = ((Integer) zzcfVar.get(i29)).intValue();
                            if (zzA.zza(intValue)) {
                                if (i29 != i28) {
                                    zzcfVar.set(i28, Integer.valueOf(intValue));
                                }
                                i28++;
                            } else {
                                obj2 = zzdr.zzA(obj, i4, intValue, obj2, zzegVar);
                            }
                        }
                        if (i28 != size2) {
                            zzcfVar.subList(i28, size2).clear();
                            return zzl;
                        }
                    } else {
                        Iterator it = zzcfVar.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (!zzA.zza(intValue2)) {
                                obj2 = zzdr.zzA(obj, i4, intValue2, obj2, zzegVar);
                                it.remove();
                            }
                        }
                    }
                }
                return zzl;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzcc zzccVar3 = (zzcc) zzcfVar;
                    int zzj13 = zzao.zzj(bArr, i12, zzanVar);
                    int i30 = zzanVar.zza + zzj13;
                    while (zzj13 < i30) {
                        zzj13 = zzao.zzj(bArr, zzj13, zzanVar);
                        zzccVar3.zzf(zzbe.zzb(zzanVar.zza));
                    }
                    if (zzj13 == i30) {
                        return zzj13;
                    }
                    throw zzci.zzg();
                }
                if (i5 == 0) {
                    zzcc zzccVar4 = (zzcc) zzcfVar;
                    int zzj14 = zzao.zzj(bArr, i12, zzanVar);
                    zzccVar4.zzf(zzbe.zzb(zzanVar.zza));
                    while (zzj14 < i2) {
                        int zzj15 = zzao.zzj(bArr, zzj14, zzanVar);
                        if (i3 != zzanVar.zza) {
                            return zzj14;
                        }
                        zzj14 = zzao.zzj(bArr, zzj15, zzanVar);
                        zzccVar4.zzf(zzbe.zzb(zzanVar.zza));
                    }
                    return zzj14;
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzcu zzcuVar5 = (zzcu) zzcfVar;
                    int zzj16 = zzao.zzj(bArr, i12, zzanVar);
                    int i31 = zzanVar.zza + zzj16;
                    while (zzj16 < i31) {
                        zzj16 = zzao.zzm(bArr, zzj16, zzanVar);
                        zzcuVar5.zzf(zzbe.zzc(zzanVar.zzb));
                    }
                    if (zzj16 == i31) {
                        return zzj16;
                    }
                    throw zzci.zzg();
                }
                if (i5 == 0) {
                    zzcu zzcuVar6 = (zzcu) zzcfVar;
                    int zzm3 = zzao.zzm(bArr, i12, zzanVar);
                    zzcuVar6.zzf(zzbe.zzc(zzanVar.zzb));
                    while (zzm3 < i2) {
                        int zzj17 = zzao.zzj(bArr, zzm3, zzanVar);
                        if (i3 != zzanVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzao.zzm(bArr, zzj17, zzanVar);
                        zzcuVar6.zzf(zzbe.zzc(zzanVar.zzb));
                    }
                    return zzm3;
                }
                break;
            default:
                if (i5 == 3) {
                    zzdp zzB = zzB(i6);
                    int i32 = (i3 & (-8)) | 4;
                    int zzc = zzao.zzc(zzB, bArr, i, i2, i32, zzanVar);
                    zzcfVar.add(zzanVar.zzc);
                    while (zzc < i2) {
                        int zzj18 = zzao.zzj(bArr, zzc, zzanVar);
                        if (i3 != zzanVar.zza) {
                            return zzc;
                        }
                        zzc = zzao.zzc(zzB, bArr, zzj18, i2, i32, zzanVar);
                        zzcfVar.add(zzanVar.zzc);
                    }
                    return zzc;
                }
                break;
        }
        return i12;
    }

    private final int zzt(int i) {
        if (i >= this.zze && i <= this.zzf) {
            return zzw(i, 0);
        }
        return -1;
    }

    private final int zzu(int i, int i2) {
        if (i >= this.zze && i <= this.zzf) {
            return zzw(i, i2);
        }
        return -1;
    }

    private final int zzv(int i) {
        return this.zzc[i + 2];
    }

    private final int zzw(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzx(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzy(int i) {
        return this.zzc[i + 1];
    }

    private static long zzz(Object obj, long j) {
        return ((Long) zzeq.zzf(obj, j)).longValue();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x003b. Please report as an issue. */
    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final int zza(Object obj) {
        int zzx;
        int zzx2;
        int zzy;
        int zzx3;
        int zzx4;
        int zzx5;
        int zzx6;
        int zzn;
        int zzx7;
        int zzx8;
        int zzx9;
        int zzx10;
        zzew zzewVar = zzew.zza;
        if (this.zzo - 1 != 0) {
            Unsafe unsafe = zzb;
            int i = 0;
            for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
                int zzy2 = zzy(i2);
                int zzx11 = zzx(zzy2);
                int i3 = this.zzc[i2];
                int i4 = zzy2 & 1048575;
                if (zzx11 >= zzbt.zzJ.zza() && zzx11 <= zzbt.zzW.zza()) {
                    int i5 = this.zzc[i2 + 2];
                }
                long j = i4;
                switch (zzx11) {
                    case 0:
                        if (zzP(obj, i2)) {
                            zzx = zzbi.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzP(obj, i2)) {
                            zzx2 = zzbi.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzP(obj, i2)) {
                            zzy = zzbi.zzy(zzeq.zzd(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzP(obj, i2)) {
                            zzy = zzbi.zzy(zzeq.zzd(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzP(obj, i2)) {
                            zzy = zzbi.zzu(zzeq.zzc(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzP(obj, i2)) {
                            zzx = zzbi.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzP(obj, i2)) {
                            zzx2 = zzbi.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzP(obj, i2)) {
                            zzx4 = zzbi.zzx(i3 << 3);
                            zzn = zzx4 + 1;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzP(obj, i2)) {
                            Object zzf = zzeq.zzf(obj, j);
                            if (zzf instanceof zzba) {
                                int i6 = i3 << 3;
                                int i7 = zzbi.zzb;
                                int zzd = ((zzba) zzf).zzd();
                                zzx5 = zzbi.zzx(zzd) + zzd;
                                zzx6 = zzbi.zzx(i6);
                                zzn = zzx6 + zzx5;
                                i += zzn;
                                break;
                            } else {
                                zzy = zzbi.zzw((String) zzf);
                                zzx3 = zzbi.zzx(i3 << 3);
                                i = zzx3 + zzy + i;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (zzP(obj, i2)) {
                            zzn = zzdr.zzn(i3, zzeq.zzf(obj, j), zzB(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzP(obj, i2)) {
                            zzba zzbaVar = (zzba) zzeq.zzf(obj, j);
                            int i8 = i3 << 3;
                            int i9 = zzbi.zzb;
                            int zzd2 = zzbaVar.zzd();
                            zzx5 = zzbi.zzx(zzd2) + zzd2;
                            zzx6 = zzbi.zzx(i8);
                            zzn = zzx6 + zzx5;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzP(obj, i2)) {
                            zzy = zzbi.zzx(zzeq.zzc(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzP(obj, i2)) {
                            zzy = zzbi.zzu(zzeq.zzc(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzP(obj, i2)) {
                            zzx2 = zzbi.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzP(obj, i2)) {
                            zzx = zzbi.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzP(obj, i2)) {
                            int zzc = zzeq.zzc(obj, j);
                            zzx7 = zzbi.zzx(i3 << 3);
                            zzx8 = zzbi.zzx((zzc >> 31) ^ (zzc + zzc));
                            zzn = zzx8 + zzx7;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzP(obj, i2)) {
                            long zzd3 = zzeq.zzd(obj, j);
                            zzy = zzbi.zzx(i3 << 3);
                            zzx3 = zzbi.zzy((zzd3 + zzd3) ^ (zzd3 >> 63));
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzP(obj, i2)) {
                            zzn = zzbi.zzt(i3, (zzdf) zzeq.zzf(obj, j), zzB(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzn = zzdr.zzg(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 19:
                        zzn = zzdr.zze(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 20:
                        zzn = zzdr.zzl(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 21:
                        zzn = zzdr.zzw(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 22:
                        zzn = zzdr.zzj(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 23:
                        zzn = zzdr.zzg(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 24:
                        zzn = zzdr.zze(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 25:
                        zzn = zzdr.zza(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 26:
                        zzn = zzdr.zzt(i3, (List) zzeq.zzf(obj, j));
                        i += zzn;
                        break;
                    case 27:
                        zzn = zzdr.zzo(i3, (List) zzeq.zzf(obj, j), zzB(i2));
                        i += zzn;
                        break;
                    case 28:
                        zzn = zzdr.zzb(i3, (List) zzeq.zzf(obj, j));
                        i += zzn;
                        break;
                    case 29:
                        zzn = zzdr.zzu(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 30:
                        zzn = zzdr.zzc(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 31:
                        zzn = zzdr.zze(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 32:
                        zzn = zzdr.zzg(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 33:
                        zzn = zzdr.zzp(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 34:
                        zzn = zzdr.zzr(i3, (List) zzeq.zzf(obj, j), false);
                        i += zzn;
                        break;
                    case 35:
                        zzy = zzdr.zzh((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i10 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i10);
                            zzx3 = zzx10 + zzx9;
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        zzy = zzdr.zzf((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i11 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i11);
                            zzx3 = zzx10 + zzx9;
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        zzy = zzdr.zzm((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i12 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i12);
                            zzx3 = zzx10 + zzx9;
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        zzy = zzdr.zzx((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i13 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i13);
                            zzx3 = zzx10 + zzx9;
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        zzy = zzdr.zzk((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i14 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i14);
                            zzx3 = zzx10 + zzx9;
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        zzy = zzdr.zzh((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i15 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i15);
                            zzx3 = zzx10 + zzx9;
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        zzy = zzdr.zzf((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i16 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i16);
                            zzx3 = zzx10 + zzx9;
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        List list = (List) unsafe.getObject(obj, j);
                        int i17 = zzdr.zza;
                        zzy = list.size();
                        if (zzy > 0) {
                            int i18 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i18);
                            zzx3 = zzx10 + zzx9;
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        zzy = zzdr.zzv((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i19 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i19);
                            zzx3 = zzx10 + zzx9;
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        zzy = zzdr.zzd((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i20 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i20);
                            zzx3 = zzx10 + zzx9;
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        zzy = zzdr.zzf((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i21 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i21);
                            zzx3 = zzx10 + zzx9;
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        zzy = zzdr.zzh((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i22 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i22);
                            zzx3 = zzx10 + zzx9;
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        zzy = zzdr.zzq((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i23 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i23);
                            zzx3 = zzx10 + zzx9;
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        zzy = zzdr.zzs((List) unsafe.getObject(obj, j));
                        if (zzy > 0) {
                            int i24 = i3 << 3;
                            zzx9 = zzbi.zzx(zzy);
                            zzx10 = zzbi.zzx(i24);
                            zzx3 = zzx10 + zzx9;
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        zzn = zzdr.zzi(i3, (List) zzeq.zzf(obj, j), zzB(i2));
                        i += zzn;
                        break;
                    case 50:
                        zzda.zza(i3, zzeq.zzf(obj, j), zzC(i2));
                        break;
                    case 51:
                        if (zzT(obj, i3, i2)) {
                            zzx = zzbi.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzT(obj, i3, i2)) {
                            zzx2 = zzbi.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzbi.zzy(zzz(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzbi.zzy(zzz(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzbi.zzu(zzp(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzT(obj, i3, i2)) {
                            zzx = zzbi.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzT(obj, i3, i2)) {
                            zzx2 = zzbi.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzT(obj, i3, i2)) {
                            zzx4 = zzbi.zzx(i3 << 3);
                            zzn = zzx4 + 1;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzT(obj, i3, i2)) {
                            Object zzf2 = zzeq.zzf(obj, j);
                            if (zzf2 instanceof zzba) {
                                int i25 = i3 << 3;
                                int i26 = zzbi.zzb;
                                int zzd4 = ((zzba) zzf2).zzd();
                                zzx5 = zzbi.zzx(zzd4) + zzd4;
                                zzx6 = zzbi.zzx(i25);
                                zzn = zzx6 + zzx5;
                                i += zzn;
                                break;
                            } else {
                                zzy = zzbi.zzw((String) zzf2);
                                zzx3 = zzbi.zzx(i3 << 3);
                                i = zzx3 + zzy + i;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (zzT(obj, i3, i2)) {
                            zzn = zzdr.zzn(i3, zzeq.zzf(obj, j), zzB(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzT(obj, i3, i2)) {
                            zzba zzbaVar2 = (zzba) zzeq.zzf(obj, j);
                            int i27 = i3 << 3;
                            int i28 = zzbi.zzb;
                            int zzd5 = zzbaVar2.zzd();
                            zzx5 = zzbi.zzx(zzd5) + zzd5;
                            zzx6 = zzbi.zzx(i27);
                            zzn = zzx6 + zzx5;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzbi.zzx(zzp(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzT(obj, i3, i2)) {
                            zzy = zzbi.zzu(zzp(obj, j));
                            zzx3 = zzbi.zzx(i3 << 3);
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzT(obj, i3, i2)) {
                            zzx2 = zzbi.zzx(i3 << 3);
                            zzn = zzx2 + 4;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzT(obj, i3, i2)) {
                            zzx = zzbi.zzx(i3 << 3);
                            zzn = zzx + 8;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzT(obj, i3, i2)) {
                            int zzp = zzp(obj, j);
                            zzx7 = zzbi.zzx(i3 << 3);
                            zzx8 = zzbi.zzx((zzp >> 31) ^ (zzp + zzp));
                            zzn = zzx8 + zzx7;
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzT(obj, i3, i2)) {
                            long zzz = zzz(obj, j);
                            zzy = zzbi.zzx(i3 << 3);
                            zzx3 = zzbi.zzy((zzz + zzz) ^ (zzz >> 63));
                            i = zzx3 + zzy + i;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzT(obj, i3, i2)) {
                            zzn = zzbi.zzt(i3, (zzdf) zzeq.zzf(obj, j), zzB(i2));
                            i += zzn;
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzeg zzegVar = this.zzm;
            return i + zzegVar.zza(zzegVar.zzd(obj));
        }
        return zzo(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int zzc;
        int length = this.zzc.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int zzy = zzy(i5);
            int i6 = this.zzc[i5];
            long j = 1048575 & zzy;
            int i7 = 37;
            switch (zzx(zzy)) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzeq.zza(obj, j));
                    byte[] bArr = zzcg.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzeq.zzb(obj, j));
                    i4 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzeq.zzd(obj, j);
                    byte[] bArr2 = zzcg.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzeq.zzd(obj, j);
                    byte[] bArr3 = zzcg.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i3 = i4 * 53;
                    zzc = zzeq.zzc(obj, j);
                    i4 = i3 + zzc;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzeq.zzd(obj, j);
                    byte[] bArr4 = zzcg.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i3 = i4 * 53;
                    zzc = zzeq.zzc(obj, j);
                    i4 = i3 + zzc;
                    break;
                case 7:
                    i2 = i4 * 53;
                    floatToIntBits = zzcg.zza(zzeq.zzw(obj, j));
                    i4 = floatToIntBits + i2;
                    break;
                case 8:
                    i2 = i4 * 53;
                    floatToIntBits = ((String) zzeq.zzf(obj, j)).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case 9:
                    Object zzf = zzeq.zzf(obj, j);
                    if (zzf != null) {
                        i7 = zzf.hashCode();
                    }
                    i4 = (i4 * 53) + i7;
                    break;
                case 10:
                    i2 = i4 * 53;
                    floatToIntBits = zzeq.zzf(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case 11:
                    i3 = i4 * 53;
                    zzc = zzeq.zzc(obj, j);
                    i4 = i3 + zzc;
                    break;
                case 12:
                    i3 = i4 * 53;
                    zzc = zzeq.zzc(obj, j);
                    i4 = i3 + zzc;
                    break;
                case 13:
                    i3 = i4 * 53;
                    zzc = zzeq.zzc(obj, j);
                    i4 = i3 + zzc;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzeq.zzd(obj, j);
                    byte[] bArr5 = zzcg.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i3 = i4 * 53;
                    zzc = zzeq.zzc(obj, j);
                    i4 = i3 + zzc;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzeq.zzd(obj, j);
                    byte[] bArr6 = zzcg.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    Object zzf2 = zzeq.zzf(obj, j);
                    if (zzf2 != null) {
                        i7 = zzf2.hashCode();
                    }
                    i4 = (i4 * 53) + i7;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i4 * 53;
                    floatToIntBits = zzeq.zzf(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    floatToIntBits = zzeq.zzf(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case 51:
                    if (zzT(obj, i6, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzcg.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i6, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i6, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzz(obj, j);
                        byte[] bArr8 = zzcg.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i6, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzz(obj, j);
                        byte[] bArr9 = zzcg.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i6, i5)) {
                        i3 = i4 * 53;
                        zzc = zzp(obj, j);
                        i4 = i3 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i6, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzz(obj, j);
                        byte[] bArr10 = zzcg.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i6, i5)) {
                        i3 = i4 * 53;
                        zzc = zzp(obj, j);
                        i4 = i3 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i6, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzcg.zza(zzU(obj, j));
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i6, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = ((String) zzeq.zzf(obj, j)).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i6, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzeq.zzf(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i6, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzeq.zzf(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i6, i5)) {
                        i3 = i4 * 53;
                        zzc = zzp(obj, j);
                        i4 = i3 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i6, i5)) {
                        i3 = i4 * 53;
                        zzc = zzp(obj, j);
                        i4 = i3 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i6, i5)) {
                        i3 = i4 * 53;
                        zzc = zzp(obj, j);
                        i4 = i3 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i6, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzz(obj, j);
                        byte[] bArr11 = zzcg.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i6, i5)) {
                        i3 = i4 * 53;
                        zzc = zzp(obj, j);
                        i4 = i3 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i6, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzz(obj, j);
                        byte[] bArr12 = zzcg.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i6, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzeq.zzf(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzm.zzd(obj).hashCode() + (i4 * 53);
        if (!this.zzh) {
            return hashCode;
        }
        this.zzn.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0401, code lost:            if (r6 == 1048575) goto L143;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0403, code lost:            r27.putInt(r12, r6, r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0409, code lost:            r2 = r8.zzj;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x040d, code lost:            if (r2 >= r8.zzk) goto L217;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x040f, code lost:            r4 = r8.zzi[r2];        r5 = r8.zzc[r4];        r5 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r8.zzy(r4) & 1048575);     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0421, code lost:            if (r5 != null) goto L149;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0428, code lost:            if (r8.zzA(r4) != null) goto L216;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x042d, code lost:            r5 = (com.google.android.gms.internal.play_billing.zzcz) r5;        r0 = (com.google.android.gms.internal.play_billing.zzcy) r8.zzC(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0435, code lost:            throw null;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x042a, code lost:            r2 = r2 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0436, code lost:            if (r9 != 0) goto L160;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x043a, code lost:            if (r0 != r32) goto L158;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0441, code lost:            throw com.google.android.gms.internal.play_billing.zzci.zze();     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0448, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0444, code lost:            if (r0 > r32) goto L164;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0446, code lost:            if (r3 != r9) goto L164;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x044d, code lost:            throw com.google.android.gms.internal.play_billing.zzci.zze();     */
    /* JADX WARN: Failed to find 'out' block for switch in B:112:0x0092. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.play_billing.zzan r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1140
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzan):int");
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final Object zze() {
        return ((zzcb) this.zzg).zzi();
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final void zzf(Object obj) {
        if (!zzS(obj)) {
            return;
        }
        if (obj instanceof zzcb) {
            zzcb zzcbVar = (zzcb) obj;
            zzcbVar.zzq(Integer.MAX_VALUE);
            zzcbVar.zza = 0;
            zzcbVar.zzo();
        }
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzy = zzy(i);
            int i2 = 1048575 & zzy;
            int zzx = zzx(zzy);
            long j = i2;
            if (zzx != 9) {
                if (zzx != 60 && zzx != 68) {
                    switch (zzx) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.zzl.zza(obj, j);
                            break;
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((zzcz) object).zzc();
                                unsafe.putObject(obj, j, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (zzT(obj, this.zzc[i], i)) {
                    zzB(i).zzf(zzb.getObject(obj, j));
                }
            }
            if (zzP(obj, i)) {
                zzB(i).zzf(zzb.getObject(obj, j));
            }
        }
        this.zzm.zzg(obj);
        if (this.zzh) {
            this.zzn.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final void zzg(Object obj, Object obj2) {
        zzG(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzy = zzy(i);
            int i2 = this.zzc[i];
            long j = 1048575 & zzy;
            switch (zzx(zzy)) {
                case 0:
                    if (zzP(obj2, i)) {
                        zzeq.zzo(obj, j, zzeq.zza(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzP(obj2, i)) {
                        zzeq.zzp(obj, j, zzeq.zzb(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzP(obj2, i)) {
                        zzeq.zzr(obj, j, zzeq.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzP(obj2, i)) {
                        zzeq.zzr(obj, j, zzeq.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzP(obj2, i)) {
                        zzeq.zzq(obj, j, zzeq.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzP(obj2, i)) {
                        zzeq.zzr(obj, j, zzeq.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzP(obj2, i)) {
                        zzeq.zzq(obj, j, zzeq.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzP(obj2, i)) {
                        zzeq.zzm(obj, j, zzeq.zzw(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzP(obj2, i)) {
                        zzeq.zzs(obj, j, zzeq.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i);
                    break;
                case 10:
                    if (zzP(obj2, i)) {
                        zzeq.zzs(obj, j, zzeq.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzP(obj2, i)) {
                        zzeq.zzq(obj, j, zzeq.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzP(obj2, i)) {
                        zzeq.zzq(obj, j, zzeq.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzP(obj2, i)) {
                        zzeq.zzq(obj, j, zzeq.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzP(obj2, i)) {
                        zzeq.zzr(obj, j, zzeq.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzP(obj2, i)) {
                        zzeq.zzq(obj, j, zzeq.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzP(obj2, i)) {
                        zzeq.zzr(obj, j, zzeq.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzl.zzb(obj, obj2, j);
                    break;
                case 50:
                    int i3 = zzdr.zza;
                    zzeq.zzs(obj, j, zzda.zzb(zzeq.zzf(obj, j), zzeq.zzf(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzT(obj2, i2, i)) {
                        zzeq.zzs(obj, j, zzeq.zzf(obj2, j));
                        zzK(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzI(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzT(obj2, i2, i)) {
                        zzeq.zzs(obj, j, zzeq.zzf(obj2, j));
                        zzK(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i);
                    break;
            }
        }
        zzdr.zzB(this.zzm, obj, obj2);
        if (!this.zzh) {
            return;
        }
        this.zzn.zza(obj2);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x02a3, code lost:            if (r0 != r5) goto L97;     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02a5, code lost:            r15 = r28;        r14 = r29;        r12 = r30;        r13 = r32;        r11 = r33;        r1 = r19;        r2 = r22;        r6 = r25;        r7 = r26;     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02b9, code lost:            r2 = r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02e6, code lost:            if (r0 != r15) goto L97;     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x030a, code lost:            if (r0 != r15) goto L97;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x008e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @Override // com.google.android.gms.internal.play_billing.zzdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r29, byte[] r30, int r31, int r32, com.google.android.gms.internal.play_billing.zzan r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 906
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zzh(java.lang.Object, byte[], int, int, com.google.android.gms.internal.play_billing.zzan):void");
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final void zzi(Object obj, zzey zzeyVar) throws IOException {
        int i;
        zzew zzewVar = zzew.zza;
        int i2 = 1048575;
        if (this.zzo - 1 != 0) {
            if (!this.zzh) {
                int length = this.zzc.length;
                for (int i3 = 0; i3 < length; i3 += 3) {
                    int zzy = zzy(i3);
                    int i4 = this.zzc[i3];
                    switch (zzx(zzy)) {
                        case 0:
                            if (zzP(obj, i3)) {
                                zzeyVar.zzf(i4, zzeq.zza(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (zzP(obj, i3)) {
                                zzeyVar.zzo(i4, zzeq.zzb(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (zzP(obj, i3)) {
                                zzeyVar.zzt(i4, zzeq.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (zzP(obj, i3)) {
                                zzeyVar.zzJ(i4, zzeq.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (zzP(obj, i3)) {
                                zzeyVar.zzr(i4, zzeq.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (zzP(obj, i3)) {
                                zzeyVar.zzm(i4, zzeq.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (zzP(obj, i3)) {
                                zzeyVar.zzk(i4, zzeq.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (zzP(obj, i3)) {
                                zzeyVar.zzb(i4, zzeq.zzw(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (zzP(obj, i3)) {
                                zzV(i4, zzeq.zzf(obj, zzy & 1048575), zzeyVar);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (zzP(obj, i3)) {
                                zzeyVar.zzv(i4, zzeq.zzf(obj, zzy & 1048575), zzB(i3));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (zzP(obj, i3)) {
                                zzeyVar.zzd(i4, (zzba) zzeq.zzf(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (zzP(obj, i3)) {
                                zzeyVar.zzH(i4, zzeq.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (zzP(obj, i3)) {
                                zzeyVar.zzi(i4, zzeq.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (zzP(obj, i3)) {
                                zzeyVar.zzw(i4, zzeq.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (zzP(obj, i3)) {
                                zzeyVar.zzy(i4, zzeq.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (zzP(obj, i3)) {
                                zzeyVar.zzA(i4, zzeq.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (zzP(obj, i3)) {
                                zzeyVar.zzC(i4, zzeq.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (zzP(obj, i3)) {
                                zzeyVar.zzq(i4, zzeq.zzf(obj, zzy & 1048575), zzB(i3));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            zzdr.zzF(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 19:
                            zzdr.zzJ(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 20:
                            zzdr.zzM(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 21:
                            zzdr.zzU(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 22:
                            zzdr.zzL(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 23:
                            zzdr.zzI(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 24:
                            zzdr.zzH(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 25:
                            zzdr.zzD(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 26:
                            zzdr.zzS(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar);
                            break;
                        case 27:
                            zzdr.zzN(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, zzB(i3));
                            break;
                        case 28:
                            zzdr.zzE(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar);
                            break;
                        case 29:
                            zzdr.zzT(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 30:
                            zzdr.zzG(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 31:
                            zzdr.zzO(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 32:
                            zzdr.zzP(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 33:
                            zzdr.zzQ(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 34:
                            zzdr.zzR(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                            break;
                        case 35:
                            zzdr.zzF(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 36:
                            zzdr.zzJ(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 37:
                            zzdr.zzM(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 38:
                            zzdr.zzU(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 39:
                            zzdr.zzL(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 40:
                            zzdr.zzI(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 41:
                            zzdr.zzH(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 42:
                            zzdr.zzD(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 43:
                            zzdr.zzT(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 44:
                            zzdr.zzG(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 45:
                            zzdr.zzO(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 46:
                            zzdr.zzP(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 47:
                            zzdr.zzQ(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 48:
                            zzdr.zzR(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                            break;
                        case 49:
                            zzdr.zzK(i4, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, zzB(i3));
                            break;
                        case 50:
                            zzN(zzeyVar, i4, zzeq.zzf(obj, zzy & 1048575), i3);
                            break;
                        case 51:
                            if (zzT(obj, i4, i3)) {
                                zzeyVar.zzf(i4, zzm(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (zzT(obj, i4, i3)) {
                                zzeyVar.zzo(i4, zzn(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (zzT(obj, i4, i3)) {
                                zzeyVar.zzt(i4, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (zzT(obj, i4, i3)) {
                                zzeyVar.zzJ(i4, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (zzT(obj, i4, i3)) {
                                zzeyVar.zzr(i4, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (zzT(obj, i4, i3)) {
                                zzeyVar.zzm(i4, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (zzT(obj, i4, i3)) {
                                zzeyVar.zzk(i4, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (zzT(obj, i4, i3)) {
                                zzeyVar.zzb(i4, zzU(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (zzT(obj, i4, i3)) {
                                zzV(i4, zzeq.zzf(obj, zzy & 1048575), zzeyVar);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (zzT(obj, i4, i3)) {
                                zzeyVar.zzv(i4, zzeq.zzf(obj, zzy & 1048575), zzB(i3));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (zzT(obj, i4, i3)) {
                                zzeyVar.zzd(i4, (zzba) zzeq.zzf(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (zzT(obj, i4, i3)) {
                                zzeyVar.zzH(i4, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (zzT(obj, i4, i3)) {
                                zzeyVar.zzi(i4, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (zzT(obj, i4, i3)) {
                                zzeyVar.zzw(i4, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (zzT(obj, i4, i3)) {
                                zzeyVar.zzy(i4, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (zzT(obj, i4, i3)) {
                                zzeyVar.zzA(i4, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (zzT(obj, i4, i3)) {
                                zzeyVar.zzC(i4, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (zzT(obj, i4, i3)) {
                                zzeyVar.zzq(i4, zzeq.zzf(obj, zzy & 1048575), zzB(i3));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                zzeg zzegVar = this.zzm;
                zzegVar.zzi(zzegVar.zzd(obj), zzeyVar);
                return;
            }
            this.zzn.zza(obj);
            throw null;
        }
        if (!this.zzh) {
            int length2 = this.zzc.length;
            Unsafe unsafe = zzb;
            int i5 = 0;
            int i6 = 1048575;
            int i7 = 0;
            while (i5 < length2) {
                int zzy2 = zzy(i5);
                int[] iArr = this.zzc;
                int i8 = iArr[i5];
                int zzx = zzx(zzy2);
                if (zzx <= 17) {
                    int i9 = iArr[i5 + 2];
                    int i10 = i9 & i2;
                    if (i10 != i6) {
                        i7 = unsafe.getInt(obj, i10);
                        i6 = i10;
                    }
                    i = 1 << (i9 >>> 20);
                } else {
                    i = 0;
                }
                long j = zzy2 & i2;
                switch (zzx) {
                    case 0:
                        if ((i7 & i) == 0) {
                            break;
                        } else {
                            zzeyVar.zzf(i8, zzeq.zza(obj, j));
                            continue;
                        }
                    case 1:
                        if ((i7 & i) != 0) {
                            zzeyVar.zzo(i8, zzeq.zzb(obj, j));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i7 & i) != 0) {
                            zzeyVar.zzt(i8, unsafe.getLong(obj, j));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i7 & i) != 0) {
                            zzeyVar.zzJ(i8, unsafe.getLong(obj, j));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i7 & i) != 0) {
                            zzeyVar.zzr(i8, unsafe.getInt(obj, j));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i7 & i) != 0) {
                            zzeyVar.zzm(i8, unsafe.getLong(obj, j));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i7 & i) != 0) {
                            zzeyVar.zzk(i8, unsafe.getInt(obj, j));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i7 & i) != 0) {
                            zzeyVar.zzb(i8, zzeq.zzw(obj, j));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i7 & i) != 0) {
                            zzV(i8, unsafe.getObject(obj, j), zzeyVar);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i7 & i) != 0) {
                            zzeyVar.zzv(i8, unsafe.getObject(obj, j), zzB(i5));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i7 & i) != 0) {
                            zzeyVar.zzd(i8, (zzba) unsafe.getObject(obj, j));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i7 & i) != 0) {
                            zzeyVar.zzH(i8, unsafe.getInt(obj, j));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i7 & i) != 0) {
                            zzeyVar.zzi(i8, unsafe.getInt(obj, j));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i7 & i) != 0) {
                            zzeyVar.zzw(i8, unsafe.getInt(obj, j));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i7 & i) != 0) {
                            zzeyVar.zzy(i8, unsafe.getLong(obj, j));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i7 & i) != 0) {
                            zzeyVar.zzA(i8, unsafe.getInt(obj, j));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i7 & i) != 0) {
                            zzeyVar.zzC(i8, unsafe.getLong(obj, j));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i7 & i) != 0) {
                            zzeyVar.zzq(i8, unsafe.getObject(obj, j), zzB(i5));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        zzdr.zzF(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        continue;
                    case 19:
                        zzdr.zzJ(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        continue;
                    case 20:
                        zzdr.zzM(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        continue;
                    case 21:
                        zzdr.zzU(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        continue;
                    case 22:
                        zzdr.zzL(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        continue;
                    case 23:
                        zzdr.zzI(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        continue;
                    case 24:
                        zzdr.zzH(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        continue;
                    case 25:
                        zzdr.zzD(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        continue;
                    case 26:
                        zzdr.zzS(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar);
                        break;
                    case 27:
                        zzdr.zzN(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, zzB(i5));
                        break;
                    case 28:
                        zzdr.zzE(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar);
                        break;
                    case 29:
                        zzdr.zzT(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        break;
                    case 30:
                        zzdr.zzG(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        break;
                    case 31:
                        zzdr.zzO(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        break;
                    case 32:
                        zzdr.zzP(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        break;
                    case 33:
                        zzdr.zzQ(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        break;
                    case 34:
                        zzdr.zzR(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        break;
                    case 35:
                        zzdr.zzF(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        break;
                    case 36:
                        zzdr.zzJ(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        break;
                    case 37:
                        zzdr.zzM(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        break;
                    case 38:
                        zzdr.zzU(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        break;
                    case 39:
                        zzdr.zzL(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        break;
                    case 40:
                        zzdr.zzI(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        break;
                    case 41:
                        zzdr.zzH(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        break;
                    case 42:
                        zzdr.zzD(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        break;
                    case 43:
                        zzdr.zzT(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        break;
                    case 44:
                        zzdr.zzG(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        break;
                    case 45:
                        zzdr.zzO(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        break;
                    case 46:
                        zzdr.zzP(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        break;
                    case 47:
                        zzdr.zzQ(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        break;
                    case 48:
                        zzdr.zzR(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        break;
                    case 49:
                        zzdr.zzK(this.zzc[i5], (List) unsafe.getObject(obj, j), zzeyVar, zzB(i5));
                        break;
                    case 50:
                        zzN(zzeyVar, i8, unsafe.getObject(obj, j), i5);
                        break;
                    case 51:
                        if (zzT(obj, i8, i5)) {
                            zzeyVar.zzf(i8, zzm(obj, j));
                            break;
                        }
                        break;
                    case 52:
                        if (zzT(obj, i8, i5)) {
                            zzeyVar.zzo(i8, zzn(obj, j));
                            break;
                        }
                        break;
                    case 53:
                        if (zzT(obj, i8, i5)) {
                            zzeyVar.zzt(i8, zzz(obj, j));
                            break;
                        }
                        break;
                    case 54:
                        if (zzT(obj, i8, i5)) {
                            zzeyVar.zzJ(i8, zzz(obj, j));
                            break;
                        }
                        break;
                    case 55:
                        if (zzT(obj, i8, i5)) {
                            zzeyVar.zzr(i8, zzp(obj, j));
                            break;
                        }
                        break;
                    case 56:
                        if (zzT(obj, i8, i5)) {
                            zzeyVar.zzm(i8, zzz(obj, j));
                            break;
                        }
                        break;
                    case 57:
                        if (zzT(obj, i8, i5)) {
                            zzeyVar.zzk(i8, zzp(obj, j));
                            break;
                        }
                        break;
                    case 58:
                        if (zzT(obj, i8, i5)) {
                            zzeyVar.zzb(i8, zzU(obj, j));
                            break;
                        }
                        break;
                    case 59:
                        if (zzT(obj, i8, i5)) {
                            zzV(i8, unsafe.getObject(obj, j), zzeyVar);
                            break;
                        }
                        break;
                    case 60:
                        if (zzT(obj, i8, i5)) {
                            zzeyVar.zzv(i8, unsafe.getObject(obj, j), zzB(i5));
                            break;
                        }
                        break;
                    case 61:
                        if (zzT(obj, i8, i5)) {
                            zzeyVar.zzd(i8, (zzba) unsafe.getObject(obj, j));
                            break;
                        }
                        break;
                    case 62:
                        if (zzT(obj, i8, i5)) {
                            zzeyVar.zzH(i8, zzp(obj, j));
                            break;
                        }
                        break;
                    case 63:
                        if (zzT(obj, i8, i5)) {
                            zzeyVar.zzi(i8, zzp(obj, j));
                            break;
                        }
                        break;
                    case 64:
                        if (zzT(obj, i8, i5)) {
                            zzeyVar.zzw(i8, zzp(obj, j));
                            break;
                        }
                        break;
                    case 65:
                        if (zzT(obj, i8, i5)) {
                            zzeyVar.zzy(i8, zzz(obj, j));
                            break;
                        }
                        break;
                    case 66:
                        if (zzT(obj, i8, i5)) {
                            zzeyVar.zzA(i8, zzp(obj, j));
                            break;
                        }
                        break;
                    case 67:
                        if (zzT(obj, i8, i5)) {
                            zzeyVar.zzC(i8, zzz(obj, j));
                            break;
                        }
                        break;
                    case 68:
                        if (zzT(obj, i8, i5)) {
                            zzeyVar.zzq(i8, unsafe.getObject(obj, j), zzB(i5));
                            break;
                        }
                        break;
                }
                i5 += 3;
                i2 = 1048575;
            }
            zzeg zzegVar2 = this.zzm;
            zzegVar2.zzi(zzegVar2.zzd(obj), zzeyVar);
            return;
        }
        this.zzn.zza(obj);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c3 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.zzdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzj(java.lang.Object r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zzj(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzj) {
            int i6 = this.zzi[i5];
            int i7 = this.zzc[i6];
            int zzy = zzy(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & zzy) != 0 && !zzQ(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzx = zzx(zzy);
            if (zzx != 9 && zzx != 17) {
                if (zzx != 27) {
                    if (zzx != 60 && zzx != 68) {
                        if (zzx != 49) {
                            if (zzx == 50 && !((zzcz) zzeq.zzf(obj, zzy & 1048575)).isEmpty()) {
                                throw null;
                            }
                        }
                    } else if (zzT(obj, i7, i6) && !zzR(obj, zzy, zzB(i6))) {
                        return false;
                    }
                }
                List list = (List) zzeq.zzf(obj, zzy & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzdp zzB = zzB(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzB.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzQ(obj, i6, i, i2, i10) && !zzR(obj, zzy, zzB(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzn.zza(obj);
        throw null;
    }
}
