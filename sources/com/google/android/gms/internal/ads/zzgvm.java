package com.google.android.gms.internal.ads;

import defpackage.p71;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgvm<T> implements zzgwc<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgxd.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgvj zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzgux zzm;
    private final zzgwt zzn;
    private final zzgtm zzo;
    private final zzgvo zzp;
    private final zzgve zzq;

    private zzgvm(int[] iArr, Object[] objArr, int i, int i2, zzgvj zzgvjVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzgvo zzgvoVar, zzgux zzguxVar, zzgwt zzgwtVar, zzgtm zzgtmVar, zzgve zzgveVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzgvjVar instanceof zzgtz;
        boolean z2 = false;
        if (zzgtmVar != null && zzgtmVar.zzh(zzgvjVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzp = zzgvoVar;
        this.zzm = zzguxVar;
        this.zzn = zzgwtVar;
        this.zzo = zzgtmVar;
        this.zzg = zzgvjVar;
        this.zzq = zzgveVar;
    }

    private final Object zzA(Object obj, int i) {
        zzgwc zzx = zzx(i);
        int zzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzgwc zzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i2) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzC(Class cls, String str) {
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

    private static void zzD(Object obj) {
        if (zzQ(obj)) {
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (!zzN(obj2, i)) {
            return;
        }
        int zzu = zzu(i) & 1048575;
        Unsafe unsafe = zzb;
        long j = zzu;
        Object object = unsafe.getObject(obj2, j);
        if (object != null) {
            zzgwc zzx = zzx(i);
            if (!zzN(obj, i)) {
                if (!zzQ(object)) {
                    unsafe.putObject(obj, j, object);
                } else {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (!zzR(obj2, i2, i)) {
            return;
        }
        int zzu = zzu(i) & 1048575;
        Unsafe unsafe = zzb;
        long j = zzu;
        Object object = unsafe.getObject(obj2, j);
        if (object != null) {
            zzgwc zzx = zzx(i);
            if (!zzR(obj, i2, i)) {
                if (!zzQ(object)) {
                    unsafe.putObject(obj, j, object);
                } else {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                }
                zzI(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
    }

    private final void zzG(Object obj, int i, zzgvu zzgvuVar) throws IOException {
        long j = i & 1048575;
        if (zzM(i)) {
            zzgxd.zzv(obj, j, zzgvuVar.zzs());
        } else if (this.zzi) {
            zzgxd.zzv(obj, j, zzgvuVar.zzr());
        } else {
            zzgxd.zzv(obj, j, zzgvuVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int zzr = zzr(i);
        long j = 1048575 & zzr;
        if (j == 1048575) {
            return;
        }
        zzgxd.zzt(obj, j, (1 << (zzr >>> 20)) | zzgxd.zzd(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzgxd.zzt(obj, zzr(i2) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        if (zzN(obj, i) == zzN(obj2, i)) {
            return true;
        }
        return false;
    }

    private static boolean zzM(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int zzr = zzr(i);
        long j = zzr & 1048575;
        if (j == 1048575) {
            int zzu = zzu(i);
            long j2 = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzgxd.zzb(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzgxd.zzc(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzgxd.zzf(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzgxd.zzf(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzgxd.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzgxd.zzf(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzgxd.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzgxd.zzz(obj, j2);
                case 8:
                    Object zzh = zzgxd.zzh(obj, j2);
                    if (zzh instanceof String) {
                        if (((String) zzh).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (zzh instanceof zzgsr) {
                        if (zzgsr.zzb.equals(zzh)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (zzgxd.zzh(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzgsr.zzb.equals(zzgxd.zzh(obj, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzgxd.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzgxd.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzgxd.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzgxd.zzf(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzgxd.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzgxd.zzf(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzgxd.zzh(obj, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzgxd.zzd(obj, j) & (1 << (zzr >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzN(obj, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzP(Object obj, int i, zzgwc zzgwcVar) {
        return zzgwcVar.zzk(zzgxd.zzh(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgtz) {
            return ((zzgtz) obj).zzaY();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        if (zzgxd.zzd(obj, zzr(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzgxd.zzh(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzgth zzgthVar) throws IOException {
        if (obj instanceof String) {
            zzgthVar.zzF(i, (String) obj);
        } else {
            zzgthVar.zzd(i, (zzgsr) obj);
        }
    }

    public static zzgwu zzd(Object obj) {
        zzgtz zzgtzVar = (zzgtz) obj;
        zzgwu zzgwuVar = zzgtzVar.zzc;
        if (zzgwuVar == zzgwu.zzc()) {
            zzgwu zzf = zzgwu.zzf();
            zzgtzVar.zzc = zzf;
            return zzf;
        }
        return zzgwuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzgvm zzl(java.lang.Class r33, com.google.android.gms.internal.ads.zzgvg r34, com.google.android.gms.internal.ads.zzgvo r35, com.google.android.gms.internal.ads.zzgux r36, com.google.android.gms.internal.ads.zzgwt r37, com.google.android.gms.internal.ads.zzgtm r38, com.google.android.gms.internal.ads.zzgve r39) {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgvm.zzl(java.lang.Class, com.google.android.gms.internal.ads.zzgvg, com.google.android.gms.internal.ads.zzgvo, com.google.android.gms.internal.ads.zzgux, com.google.android.gms.internal.ads.zzgwt, com.google.android.gms.internal.ads.zzgtm, com.google.android.gms.internal.ads.zzgve):com.google.android.gms.internal.ads.zzgvm");
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzgxd.zzh(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzgxd.zzh(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzgxd.zzh(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i >= this.zze && i <= this.zzf) {
            return zzs(i, 0);
        }
        return -1;
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
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

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzgxd.zzh(obj, j)).longValue();
    }

    private final zzgud zzw(int i) {
        int i2 = i / 3;
        return (zzgud) this.zzd[i2 + i2 + 1];
    }

    private final zzgwc zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzgwc zzgwcVar = (zzgwc) objArr[i3];
        if (zzgwcVar != null) {
            return zzgwcVar;
        }
        zzgwc zzb2 = zzgvr.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzgwt zzgwtVar, Object obj3) {
        int i2 = this.zzc[i];
        Object zzh = zzgxd.zzh(obj, zzu(i) & 1048575);
        if (zzh == null) {
            return obj2;
        }
        if (zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x005b. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzgwc
    public final int zza(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        int zzA;
        int zzA2;
        int zzB;
        int zzA3;
        int zzA4;
        int zzA5;
        int zzA6;
        int zzh;
        int zzA7;
        int zzA8;
        int zzA9;
        int size;
        int zzl;
        int zzA10;
        int zzA11;
        int i5;
        int zzA12;
        int zzA13;
        Unsafe unsafe = zzb;
        boolean z = false;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < this.zzc.length) {
            int zzu = zzu(i9);
            int zzt = zzt(zzu);
            int[] iArr = this.zzc;
            int i11 = iArr[i9];
            int i12 = iArr[i9 + 2];
            int i13 = i12 & i6;
            if (zzt <= 17) {
                if (i13 != i7) {
                    if (i13 == i6) {
                        i8 = 0;
                    } else {
                        i8 = unsafe.getInt(obj, i13);
                    }
                    i7 = i13;
                }
                i2 = i8;
                i3 = 1 << (i12 >>> 20);
                i = i7;
            } else {
                i = i7;
                i2 = i8;
                i3 = 0;
            }
            int i14 = i6 & zzu;
            if (zzt >= zzgtr.zzJ.zza()) {
                zzgtr.zzW.zza();
            }
            long j = i14;
            switch (zzt) {
                case 0:
                    i4 = i10;
                    if (zzO(obj, i9, i, i2, i3)) {
                        zzA = zzgtg.zzA(i11 << 3);
                        zzh = zzA + 8;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 1:
                    i4 = i10;
                    if (zzO(obj, i9, i, i2, i3)) {
                        zzA2 = zzgtg.zzA(i11 << 3);
                        zzh = zzA2 + 4;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 2:
                    i4 = i10;
                    if (zzO(obj, i9, i, i2, i3)) {
                        zzB = zzgtg.zzB(unsafe.getLong(obj, j));
                        zzA3 = zzgtg.zzA(i11 << 3);
                        zzh = zzA3 + zzB;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 3:
                    i4 = i10;
                    if (zzO(obj, i9, i, i2, i3)) {
                        zzB = zzgtg.zzB(unsafe.getLong(obj, j));
                        zzA3 = zzgtg.zzA(i11 << 3);
                        zzh = zzA3 + zzB;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 4:
                    i4 = i10;
                    if (zzO(obj, i9, i, i2, i3)) {
                        zzB = zzgtg.zzx(unsafe.getInt(obj, j));
                        zzA3 = zzgtg.zzA(i11 << 3);
                        zzh = zzA3 + zzB;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 5:
                    i4 = i10;
                    if (zzO(obj, i9, i, i2, i3)) {
                        zzA = zzgtg.zzA(i11 << 3);
                        zzh = zzA + 8;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 6:
                    i4 = i10;
                    if (zzO(obj, i9, i, i2, i3)) {
                        zzA2 = zzgtg.zzA(i11 << 3);
                        zzh = zzA2 + 4;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 7:
                    i4 = i10;
                    if (zzO(obj, i9, i, i2, i3)) {
                        zzA4 = zzgtg.zzA(i11 << 3);
                        zzh = zzA4 + 1;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 8:
                    i4 = i10;
                    if (zzO(obj, i9, i, i2, i3)) {
                        int i15 = i11 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzgsr) {
                            int i16 = zzgtg.zzf;
                            int zzd = ((zzgsr) object).zzd();
                            zzA5 = zzgtg.zzA(zzd) + zzd;
                            zzA6 = zzgtg.zzA(i15);
                            zzh = zzA6 + zzA5;
                            i10 = i4 + zzh;
                            i9 += 3;
                            z = false;
                            i6 = 1048575;
                            i7 = i;
                            i8 = i2;
                        } else {
                            zzB = zzgtg.zzz((String) object);
                            zzA3 = zzgtg.zzA(i15);
                            zzh = zzA3 + zzB;
                            i10 = i4 + zzh;
                            i9 += 3;
                            z = false;
                            i6 = 1048575;
                            i7 = i;
                            i8 = i2;
                        }
                    }
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 9:
                    i4 = i10;
                    if (zzO(obj, i9, i, i2, i3)) {
                        zzh = zzgwe.zzh(i11, unsafe.getObject(obj, j), zzx(i9));
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 10:
                    i4 = i10;
                    if (zzO(obj, i9, i, i2, i3)) {
                        zzgsr zzgsrVar = (zzgsr) unsafe.getObject(obj, j);
                        int i17 = zzgtg.zzf;
                        int zzd2 = zzgsrVar.zzd();
                        zzA5 = zzgtg.zzA(zzd2) + zzd2;
                        zzA6 = zzgtg.zzA(i11 << 3);
                        zzh = zzA6 + zzA5;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 11:
                    i4 = i10;
                    if (zzO(obj, i9, i, i2, i3)) {
                        zzB = zzgtg.zzA(unsafe.getInt(obj, j));
                        zzA3 = zzgtg.zzA(i11 << 3);
                        zzh = zzA3 + zzB;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 12:
                    i4 = i10;
                    if (zzO(obj, i9, i, i2, i3)) {
                        zzB = zzgtg.zzx(unsafe.getInt(obj, j));
                        zzA3 = zzgtg.zzA(i11 << 3);
                        zzh = zzA3 + zzB;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 13:
                    i4 = i10;
                    if (zzO(obj, i9, i, i2, i3)) {
                        zzA2 = zzgtg.zzA(i11 << 3);
                        zzh = zzA2 + 4;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 14:
                    i4 = i10;
                    if (zzO(obj, i9, i, i2, i3)) {
                        zzA = zzgtg.zzA(i11 << 3);
                        zzh = zzA + 8;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 15:
                    i4 = i10;
                    if (zzO(obj, i9, i, i2, i3)) {
                        int i18 = unsafe.getInt(obj, j);
                        zzA7 = zzgtg.zzA(i11 << 3);
                        zzA8 = zzgtg.zzA((i18 >> 31) ^ (i18 + i18));
                        i10 = zzA8 + zzA7 + i4;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 16:
                    i4 = i10;
                    if (zzO(obj, i9, i, i2, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzA7 = zzgtg.zzA(i11 << 3);
                        zzA8 = zzgtg.zzB((j2 >> 63) ^ (j2 + j2));
                        i10 = zzA8 + zzA7 + i4;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 17:
                    i4 = i10;
                    if (zzO(obj, i9, i, i2, i3)) {
                        zzh = zzgtg.zzw(i11, (zzgvj) unsafe.getObject(obj, j), zzx(i9));
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 18:
                    zzh = zzgwe.zzd(i11, (List) unsafe.getObject(obj, j), z);
                    i4 = i10;
                    i10 = i4 + zzh;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 19:
                    zzh = zzgwe.zzb(i11, (List) unsafe.getObject(obj, j), z);
                    i4 = i10;
                    i10 = i4 + zzh;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i19 = zzgwe.zza;
                    if (list.size() != 0) {
                        zzA9 = (zzgtg.zzA(i11 << 3) * list.size()) + zzgwe.zzg(list);
                        i10 += zzA9;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    zzA9 = 0;
                    i10 += zzA9;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i20 = zzgwe.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzgwe.zzl(list2);
                        zzA10 = zzgtg.zzA(i11 << 3);
                        zzA11 = (zzA10 * size) + zzl;
                        i10 += zzA11;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    zzA11 = 0;
                    i10 += zzA11;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i21 = zzgwe.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzgwe.zzf(list3);
                        zzA10 = zzgtg.zzA(i11 << 3);
                        zzA11 = (zzA10 * size) + zzl;
                        i10 += zzA11;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    zzA11 = 0;
                    i10 += zzA11;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 23:
                    zzh = zzgwe.zzd(i11, (List) unsafe.getObject(obj, j), z);
                    i4 = i10;
                    i10 = i4 + zzh;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 24:
                    zzh = zzgwe.zzb(i11, (List) unsafe.getObject(obj, j), z);
                    i4 = i10;
                    i10 = i4 + zzh;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i22 = zzgwe.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzA9 = (zzgtg.zzA(i11 << 3) + 1) * size2;
                        i10 += zzA9;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    zzA9 = 0;
                    i10 += zzA9;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i23 = zzgwe.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        boolean z2 = list5 instanceof zzgur;
                        zzA11 = zzgtg.zzA(i11 << 3) * size3;
                        if (z2) {
                            zzgur zzgurVar = (zzgur) list5;
                            for (int i24 = 0; i24 < size3; i24++) {
                                Object zzf = zzgurVar.zzf(i24);
                                if (zzf instanceof zzgsr) {
                                    int zzd3 = ((zzgsr) zzf).zzd();
                                    zzA11 = zzgtg.zzA(zzd3) + zzd3 + zzA11;
                                } else {
                                    zzA11 = zzgtg.zzz((String) zzf) + zzA11;
                                }
                            }
                        } else {
                            for (int i25 = 0; i25 < size3; i25++) {
                                Object obj2 = list5.get(i25);
                                if (obj2 instanceof zzgsr) {
                                    int zzd4 = ((zzgsr) obj2).zzd();
                                    zzA11 = zzgtg.zzA(zzd4) + zzd4 + zzA11;
                                } else {
                                    zzA11 = zzgtg.zzz((String) obj2) + zzA11;
                                }
                            }
                        }
                        i10 += zzA11;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    zzA11 = 0;
                    i10 += zzA11;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j);
                    zzgwc zzx = zzx(i9);
                    int i26 = zzgwe.zza;
                    int size4 = list6.size();
                    if (size4 != 0) {
                        int zzA14 = zzgtg.zzA(i11 << 3) * size4;
                        for (int i27 = 0; i27 < size4; i27++) {
                            Object obj3 = list6.get(i27);
                            if (obj3 instanceof zzgup) {
                                int zza2 = ((zzgup) obj3).zza();
                                zzA14 = zzgtg.zzA(zza2) + zza2 + zzA14;
                            } else {
                                zzA14 = zzgtg.zzy((zzgvj) obj3, zzx) + zzA14;
                            }
                        }
                        i5 = zzA14;
                        i10 += i5;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i5 = 0;
                    i10 += i5;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i28 = zzgwe.zza;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        zzA11 = zzgtg.zzA(i11 << 3) * size5;
                        for (int i29 = 0; i29 < list7.size(); i29++) {
                            int zzd5 = ((zzgsr) list7.get(i29)).zzd();
                            zzA11 += zzgtg.zzA(zzd5) + zzd5;
                        }
                        i10 += zzA11;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    zzA11 = 0;
                    i10 += zzA11;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i30 = zzgwe.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzl = zzgwe.zzk(list8);
                        zzA10 = zzgtg.zzA(i11 << 3);
                        zzA11 = (zzA10 * size) + zzl;
                        i10 += zzA11;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    zzA11 = 0;
                    i10 += zzA11;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i31 = zzgwe.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzl = zzgwe.zza(list9);
                        zzA10 = zzgtg.zzA(i11 << 3);
                        zzA11 = (zzA10 * size) + zzl;
                        i10 += zzA11;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    zzA11 = 0;
                    i10 += zzA11;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 31:
                    zzh = zzgwe.zzb(i11, (List) unsafe.getObject(obj, j), z);
                    i4 = i10;
                    i10 = i4 + zzh;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 32:
                    zzh = zzgwe.zzd(i11, (List) unsafe.getObject(obj, j), z);
                    i4 = i10;
                    i10 = i4 + zzh;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i32 = zzgwe.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzl = zzgwe.zzi(list10);
                        zzA10 = zzgtg.zzA(i11 << 3);
                        zzA11 = (zzA10 * size) + zzl;
                        i10 += zzA11;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    zzA11 = 0;
                    i10 += zzA11;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j);
                    int i33 = zzgwe.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzl = zzgwe.zzj(list11);
                        zzA10 = zzgtg.zzA(i11 << 3);
                        zzA11 = (zzA10 * size) + zzl;
                        i10 += zzA11;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    zzA11 = 0;
                    i10 += zzA11;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 35:
                    zzA7 = zzgwe.zze((List) unsafe.getObject(obj, j));
                    if (zzA7 > 0) {
                        zzA12 = zzgtg.zzA(zzA7);
                        zzA13 = zzgtg.zzA(i11 << 3);
                        zzA8 = zzA13 + zzA12;
                        i4 = i10;
                        i10 = zzA8 + zzA7 + i4;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 36:
                    zzA7 = zzgwe.zzc((List) unsafe.getObject(obj, j));
                    if (zzA7 > 0) {
                        zzA12 = zzgtg.zzA(zzA7);
                        zzA13 = zzgtg.zzA(i11 << 3);
                        zzA8 = zzA13 + zzA12;
                        i4 = i10;
                        i10 = zzA8 + zzA7 + i4;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 37:
                    zzA7 = zzgwe.zzg((List) unsafe.getObject(obj, j));
                    if (zzA7 > 0) {
                        zzA12 = zzgtg.zzA(zzA7);
                        zzA13 = zzgtg.zzA(i11 << 3);
                        zzA8 = zzA13 + zzA12;
                        i4 = i10;
                        i10 = zzA8 + zzA7 + i4;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 38:
                    zzA7 = zzgwe.zzl((List) unsafe.getObject(obj, j));
                    if (zzA7 > 0) {
                        zzA12 = zzgtg.zzA(zzA7);
                        zzA13 = zzgtg.zzA(i11 << 3);
                        zzA8 = zzA13 + zzA12;
                        i4 = i10;
                        i10 = zzA8 + zzA7 + i4;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 39:
                    zzA7 = zzgwe.zzf((List) unsafe.getObject(obj, j));
                    if (zzA7 > 0) {
                        zzA12 = zzgtg.zzA(zzA7);
                        zzA13 = zzgtg.zzA(i11 << 3);
                        zzA8 = zzA13 + zzA12;
                        i4 = i10;
                        i10 = zzA8 + zzA7 + i4;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 40:
                    zzA7 = zzgwe.zze((List) unsafe.getObject(obj, j));
                    if (zzA7 > 0) {
                        zzA12 = zzgtg.zzA(zzA7);
                        zzA13 = zzgtg.zzA(i11 << 3);
                        zzA8 = zzA13 + zzA12;
                        i4 = i10;
                        i10 = zzA8 + zzA7 + i4;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 41:
                    zzA7 = zzgwe.zzc((List) unsafe.getObject(obj, j));
                    if (zzA7 > 0) {
                        zzA12 = zzgtg.zzA(zzA7);
                        zzA13 = zzgtg.zzA(i11 << 3);
                        zzA8 = zzA13 + zzA12;
                        i4 = i10;
                        i10 = zzA8 + zzA7 + i4;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j);
                    int i34 = zzgwe.zza;
                    zzA7 = list12.size();
                    if (zzA7 > 0) {
                        zzA12 = zzgtg.zzA(zzA7);
                        zzA13 = zzgtg.zzA(i11 << 3);
                        zzA8 = zzA13 + zzA12;
                        i4 = i10;
                        i10 = zzA8 + zzA7 + i4;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 43:
                    zzA7 = zzgwe.zzk((List) unsafe.getObject(obj, j));
                    if (zzA7 > 0) {
                        zzA12 = zzgtg.zzA(zzA7);
                        zzA13 = zzgtg.zzA(i11 << 3);
                        zzA8 = zzA13 + zzA12;
                        i4 = i10;
                        i10 = zzA8 + zzA7 + i4;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 44:
                    zzA7 = zzgwe.zza((List) unsafe.getObject(obj, j));
                    if (zzA7 > 0) {
                        zzA12 = zzgtg.zzA(zzA7);
                        zzA13 = zzgtg.zzA(i11 << 3);
                        zzA8 = zzA13 + zzA12;
                        i4 = i10;
                        i10 = zzA8 + zzA7 + i4;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 45:
                    zzA7 = zzgwe.zzc((List) unsafe.getObject(obj, j));
                    if (zzA7 > 0) {
                        zzA12 = zzgtg.zzA(zzA7);
                        zzA13 = zzgtg.zzA(i11 << 3);
                        zzA8 = zzA13 + zzA12;
                        i4 = i10;
                        i10 = zzA8 + zzA7 + i4;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 46:
                    zzA7 = zzgwe.zze((List) unsafe.getObject(obj, j));
                    if (zzA7 > 0) {
                        zzA12 = zzgtg.zzA(zzA7);
                        zzA13 = zzgtg.zzA(i11 << 3);
                        zzA8 = zzA13 + zzA12;
                        i4 = i10;
                        i10 = zzA8 + zzA7 + i4;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 47:
                    zzA7 = zzgwe.zzi((List) unsafe.getObject(obj, j));
                    if (zzA7 > 0) {
                        zzA12 = zzgtg.zzA(zzA7);
                        zzA13 = zzgtg.zzA(i11 << 3);
                        zzA8 = zzA13 + zzA12;
                        i4 = i10;
                        i10 = zzA8 + zzA7 + i4;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 48:
                    zzA7 = zzgwe.zzj((List) unsafe.getObject(obj, j));
                    if (zzA7 > 0) {
                        zzA12 = zzgtg.zzA(zzA7);
                        zzA13 = zzgtg.zzA(i11 << 3);
                        zzA8 = zzA13 + zzA12;
                        i4 = i10;
                        i10 = zzA8 + zzA7 + i4;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j);
                    zzgwc zzx2 = zzx(i9);
                    int i35 = zzgwe.zza;
                    int size6 = list13.size();
                    if (size6 != 0) {
                        int i36 = 0;
                        for (int i37 = 0; i37 < size6; i37++) {
                            i36 += zzgtg.zzw(i11, (zzgvj) list13.get(i37), zzx2);
                        }
                        i5 = i36;
                        i10 += i5;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i5 = 0;
                    i10 += i5;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 50:
                    zzgvd zzgvdVar = (zzgvd) unsafe.getObject(obj, j);
                    if (!zzgvdVar.isEmpty()) {
                        Iterator it = zzgvdVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 51:
                    if (zzR(obj, i11, i9)) {
                        zzA = zzgtg.zzA(i11 << 3);
                        i4 = i10;
                        zzh = zzA + 8;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 52:
                    if (zzR(obj, i11, i9)) {
                        zzA2 = zzgtg.zzA(i11 << 3);
                        i4 = i10;
                        zzh = zzA2 + 4;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 53:
                    if (zzR(obj, i11, i9)) {
                        zzB = zzgtg.zzB(zzv(obj, j));
                        zzA3 = zzgtg.zzA(i11 << 3);
                        i4 = i10;
                        zzh = zzA3 + zzB;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 54:
                    if (zzR(obj, i11, i9)) {
                        zzB = zzgtg.zzB(zzv(obj, j));
                        zzA3 = zzgtg.zzA(i11 << 3);
                        i4 = i10;
                        zzh = zzA3 + zzB;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 55:
                    if (zzR(obj, i11, i9)) {
                        zzB = zzgtg.zzx(zzp(obj, j));
                        zzA3 = zzgtg.zzA(i11 << 3);
                        i4 = i10;
                        zzh = zzA3 + zzB;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 56:
                    if (zzR(obj, i11, i9)) {
                        zzA = zzgtg.zzA(i11 << 3);
                        i4 = i10;
                        zzh = zzA + 8;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 57:
                    if (zzR(obj, i11, i9)) {
                        zzA2 = zzgtg.zzA(i11 << 3);
                        i4 = i10;
                        zzh = zzA2 + 4;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 58:
                    if (zzR(obj, i11, i9)) {
                        zzA4 = zzgtg.zzA(i11 << 3);
                        i4 = i10;
                        zzh = zzA4 + 1;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 59:
                    if (zzR(obj, i11, i9)) {
                        int i38 = i11 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzgsr) {
                            int i39 = zzgtg.zzf;
                            int zzd6 = ((zzgsr) object2).zzd();
                            zzA5 = zzgtg.zzA(zzd6) + zzd6;
                            zzA6 = zzgtg.zzA(i38);
                            i4 = i10;
                            zzh = zzA6 + zzA5;
                            i10 = i4 + zzh;
                            i9 += 3;
                            z = false;
                            i6 = 1048575;
                            i7 = i;
                            i8 = i2;
                        } else {
                            zzB = zzgtg.zzz((String) object2);
                            zzA3 = zzgtg.zzA(i38);
                            i4 = i10;
                            zzh = zzA3 + zzB;
                            i10 = i4 + zzh;
                            i9 += 3;
                            z = false;
                            i6 = 1048575;
                            i7 = i;
                            i8 = i2;
                        }
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 60:
                    if (zzR(obj, i11, i9)) {
                        zzh = zzgwe.zzh(i11, unsafe.getObject(obj, j), zzx(i9));
                        i4 = i10;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 61:
                    if (zzR(obj, i11, i9)) {
                        zzgsr zzgsrVar2 = (zzgsr) unsafe.getObject(obj, j);
                        int i40 = zzgtg.zzf;
                        int zzd7 = zzgsrVar2.zzd();
                        zzA5 = zzgtg.zzA(zzd7) + zzd7;
                        zzA6 = zzgtg.zzA(i11 << 3);
                        i4 = i10;
                        zzh = zzA6 + zzA5;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 62:
                    if (zzR(obj, i11, i9)) {
                        zzB = zzgtg.zzA(zzp(obj, j));
                        zzA3 = zzgtg.zzA(i11 << 3);
                        i4 = i10;
                        zzh = zzA3 + zzB;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 63:
                    if (zzR(obj, i11, i9)) {
                        zzB = zzgtg.zzx(zzp(obj, j));
                        zzA3 = zzgtg.zzA(i11 << 3);
                        i4 = i10;
                        zzh = zzA3 + zzB;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 64:
                    if (zzR(obj, i11, i9)) {
                        zzA2 = zzgtg.zzA(i11 << 3);
                        i4 = i10;
                        zzh = zzA2 + 4;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 65:
                    if (zzR(obj, i11, i9)) {
                        zzA = zzgtg.zzA(i11 << 3);
                        i4 = i10;
                        zzh = zzA + 8;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 66:
                    if (zzR(obj, i11, i9)) {
                        int zzp = zzp(obj, j);
                        zzA7 = zzgtg.zzA(i11 << 3);
                        zzA8 = zzgtg.zzA((zzp >> 31) ^ (zzp + zzp));
                        i4 = i10;
                        i10 = zzA8 + zzA7 + i4;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 67:
                    if (zzR(obj, i11, i9)) {
                        long zzv = zzv(obj, j);
                        zzA7 = zzgtg.zzA(i11 << 3);
                        zzA8 = zzgtg.zzB((zzv >> 63) ^ (zzv + zzv));
                        i4 = i10;
                        i10 = zzA8 + zzA7 + i4;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                case 68:
                    if (zzR(obj, i11, i9)) {
                        zzh = zzgtg.zzw(i11, (zzgvj) unsafe.getObject(obj, j), zzx(i9));
                        i4 = i10;
                        i10 = i4 + zzh;
                        i9 += 3;
                        z = false;
                        i6 = 1048575;
                        i7 = i;
                        i8 = i2;
                    }
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
                default:
                    i4 = i10;
                    i10 = i4;
                    i9 += 3;
                    z = false;
                    i6 = 1048575;
                    i7 = i;
                    i8 = i2;
            }
        }
        zzgwt zzgwtVar = this.zzn;
        int zza3 = i10 + zzgwtVar.zza(zzgwtVar.zzd(obj));
        if (!this.zzh) {
            return zza3;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001c. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzgwc
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int zzd;
        int i4;
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzc.length; i6 += 3) {
            int zzu = zzu(i6);
            int[] iArr = this.zzc;
            int i7 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i8 = iArr[i6];
            long j = i7;
            int i9 = 37;
            switch (zzt) {
                case 0:
                    i = i5 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzgxd.zzb(obj, j));
                    byte[] bArr = zzguj.zzd;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i5 * 53;
                    floatToIntBits = Float.floatToIntBits(zzgxd.zzc(obj, j));
                    i5 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i5 * 53;
                    doubleToLongBits = zzgxd.zzf(obj, j);
                    byte[] bArr2 = zzguj.zzd;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i5 * 53;
                    doubleToLongBits = zzgxd.zzf(obj, j);
                    byte[] bArr3 = zzguj.zzd;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i3 = i5 * 53;
                    zzd = zzgxd.zzd(obj, j);
                    i5 = i3 + zzd;
                    break;
                case 5:
                    i = i5 * 53;
                    doubleToLongBits = zzgxd.zzf(obj, j);
                    byte[] bArr4 = zzguj.zzd;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i3 = i5 * 53;
                    zzd = zzgxd.zzd(obj, j);
                    i5 = i3 + zzd;
                    break;
                case 7:
                    i2 = i5 * 53;
                    floatToIntBits = zzguj.zza(zzgxd.zzz(obj, j));
                    i5 = floatToIntBits + i2;
                    break;
                case 8:
                    i2 = i5 * 53;
                    floatToIntBits = ((String) zzgxd.zzh(obj, j)).hashCode();
                    i5 = floatToIntBits + i2;
                    break;
                case 9:
                    i4 = i5 * 53;
                    Object zzh = zzgxd.zzh(obj, j);
                    if (zzh != null) {
                        i9 = zzh.hashCode();
                    }
                    i5 = i4 + i9;
                    break;
                case 10:
                    i2 = i5 * 53;
                    floatToIntBits = zzgxd.zzh(obj, j).hashCode();
                    i5 = floatToIntBits + i2;
                    break;
                case 11:
                    i3 = i5 * 53;
                    zzd = zzgxd.zzd(obj, j);
                    i5 = i3 + zzd;
                    break;
                case 12:
                    i3 = i5 * 53;
                    zzd = zzgxd.zzd(obj, j);
                    i5 = i3 + zzd;
                    break;
                case 13:
                    i3 = i5 * 53;
                    zzd = zzgxd.zzd(obj, j);
                    i5 = i3 + zzd;
                    break;
                case 14:
                    i = i5 * 53;
                    doubleToLongBits = zzgxd.zzf(obj, j);
                    byte[] bArr5 = zzguj.zzd;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i3 = i5 * 53;
                    zzd = zzgxd.zzd(obj, j);
                    i5 = i3 + zzd;
                    break;
                case 16:
                    i = i5 * 53;
                    doubleToLongBits = zzgxd.zzf(obj, j);
                    byte[] bArr6 = zzguj.zzd;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i4 = i5 * 53;
                    Object zzh2 = zzgxd.zzh(obj, j);
                    if (zzh2 != null) {
                        i9 = zzh2.hashCode();
                    }
                    i5 = i4 + i9;
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
                    i2 = i5 * 53;
                    floatToIntBits = zzgxd.zzh(obj, j).hashCode();
                    i5 = floatToIntBits + i2;
                    break;
                case 50:
                    i2 = i5 * 53;
                    floatToIntBits = zzgxd.zzh(obj, j).hashCode();
                    i5 = floatToIntBits + i2;
                    break;
                case 51:
                    if (zzR(obj, i8, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzguj.zzd;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i5 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i8, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zzguj.zzd;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i8, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zzguj.zzd;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i8, i6)) {
                        i3 = i5 * 53;
                        zzd = zzp(obj, j);
                        i5 = i3 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i8, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zzguj.zzd;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i8, i6)) {
                        i3 = i5 * 53;
                        zzd = zzp(obj, j);
                        i5 = i3 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = zzguj.zza(zzS(obj, j));
                        i5 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = ((String) zzgxd.zzh(obj, j)).hashCode();
                        i5 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = zzgxd.zzh(obj, j).hashCode();
                        i5 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = zzgxd.zzh(obj, j).hashCode();
                        i5 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i8, i6)) {
                        i3 = i5 * 53;
                        zzd = zzp(obj, j);
                        i5 = i3 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i8, i6)) {
                        i3 = i5 * 53;
                        zzd = zzp(obj, j);
                        i5 = i3 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i8, i6)) {
                        i3 = i5 * 53;
                        zzd = zzp(obj, j);
                        i5 = i3 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i8, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zzguj.zzd;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i8, i6)) {
                        i3 = i5 * 53;
                        zzd = zzp(obj, j);
                        i5 = i3 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i8, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zzguj.zzd;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = zzgxd.zzh(obj, j).hashCode();
                        i5 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzn.zzd(obj).hashCode() + (i5 * 53);
        if (!this.zzh) {
            return hashCode;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0b5e, code lost:            if (r5 == r0) goto L487;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0b60, code lost:            r14.putInt(r7, r5, r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0b64, code lost:            r11 = r12.zzk;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0b69, code lost:            if (r11 >= r12.zzl) goto L565;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0b6b, code lost:            zzy(r34, r12.zzj[r11], null, r12.zzn, r34);        r11 = r11 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0b7e, code lost:            if (r9 != 0) goto L496;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0b80, code lost:            if (r6 != r10) goto L494;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0b87, code lost:            throw com.google.android.gms.internal.ads.zzgul.zzg();     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0b8c, code lost:            return r6;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0b88, code lost:            if (r6 > r10) goto L499;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0b8a, code lost:            if (r8 != r9) goto L499;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0b91, code lost:            throw com.google.android.gms.internal.ads.zzgul.zzg();     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0383. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:399:0x089e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:496:0x00a9. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0adf  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0aee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0833 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0843 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.ads.zzgsd r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3106
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgvm.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzgsd):int");
    }

    @Override // com.google.android.gms.internal.ads.zzgwc
    public final Object zze() {
        return ((zzgtz) this.zzg).zzaD();
    }

    @Override // com.google.android.gms.internal.ads.zzgwc
    public final void zzf(Object obj) {
        if (!zzQ(obj)) {
            return;
        }
        if (obj instanceof zzgtz) {
            zzgtz zzgtzVar = (zzgtz) obj;
            zzgtzVar.zzaV(Integer.MAX_VALUE);
            zzgtzVar.zza = 0;
            zzgtzVar.zzaT();
        }
        int[] iArr = this.zzc;
        for (int i = 0; i < iArr.length; i += 3) {
            int zzu = zzu(i);
            int i2 = 1048575 & zzu;
            int zzt = zzt(zzu);
            long j = i2;
            if (zzt != 9) {
                if (zzt != 60 && zzt != 68) {
                    switch (zzt) {
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
                            this.zzm.zzb(obj, j);
                            break;
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((zzgvd) object).zzc();
                                unsafe.putObject(obj, j, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (zzR(obj, this.zzc[i], i)) {
                    zzx(i).zzf(zzb.getObject(obj, j));
                }
            }
            if (zzN(obj, i)) {
                zzx(i).zzf(zzb.getObject(obj, j));
            }
        }
        this.zzn.zzm(obj);
        if (this.zzh) {
            this.zzo.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwc
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            int i2 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i3 = iArr[i];
            long j = i2;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzgxd.zzr(obj, j, zzgxd.zzb(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i)) {
                        zzgxd.zzs(obj, j, zzgxd.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i)) {
                        zzgxd.zzu(obj, j, zzgxd.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i)) {
                        zzgxd.zzu(obj, j, zzgxd.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i)) {
                        zzgxd.zzt(obj, j, zzgxd.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i)) {
                        zzgxd.zzu(obj, j, zzgxd.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i)) {
                        zzgxd.zzt(obj, j, zzgxd.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i)) {
                        zzgxd.zzp(obj, j, zzgxd.zzz(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i)) {
                        zzgxd.zzv(obj, j, zzgxd.zzh(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzgxd.zzv(obj, j, zzgxd.zzh(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i)) {
                        zzgxd.zzt(obj, j, zzgxd.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i)) {
                        zzgxd.zzt(obj, j, zzgxd.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i)) {
                        zzgxd.zzt(obj, j, zzgxd.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i)) {
                        zzgxd.zzu(obj, j, zzgxd.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i)) {
                        zzgxd.zzt(obj, j, zzgxd.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i)) {
                        zzgxd.zzu(obj, j, zzgxd.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i);
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
                    this.zzm.zzc(obj, obj2, j);
                    break;
                case 50:
                    int i4 = zzgwe.zza;
                    zzgxd.zzv(obj, j, zzgve.zzb(zzgxd.zzh(obj, j), zzgxd.zzh(obj2, j)));
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
                    if (zzR(obj2, i3, i)) {
                        zzgxd.zzv(obj, j, zzgxd.zzh(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i3, i)) {
                        zzgxd.zzv(obj, j, zzgxd.zzh(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzgwe.zzq(this.zzn, obj, obj2);
        if (!this.zzh) {
            return;
        }
        this.zzo.zza(obj2);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x00c3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0659 A[LOOP:2: B:38:0x0655->B:40:0x0659, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0621 A[Catch: all -> 0x0616, TryCatch #3 {all -> 0x0616, blocks: (B:17:0x05ef, B:46:0x061c, B:48:0x0621, B:49:0x0626), top: B:16:0x05ef }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x062c A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgwc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r18, com.google.android.gms.internal.ads.zzgvu r19, com.google.android.gms.internal.ads.zzgtl r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgvm.zzh(java.lang.Object, com.google.android.gms.internal.ads.zzgvu, com.google.android.gms.internal.ads.zzgtl):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgwc
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgsd zzgsdVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzgsdVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c3 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgwc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzj(java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgvm.zzj(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzgwc
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i5];
            int i7 = iArr2[i6];
            int zzu = zzu(i6);
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
            if ((268435456 & zzu) != 0 && !zzO(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt != 60 && zzt != 68) {
                        if (zzt != 49) {
                            if (zzt == 50 && !((zzgvd) zzgxd.zzh(obj, zzu & 1048575)).isEmpty()) {
                                throw null;
                            }
                        }
                    } else if (zzR(obj, i7, i6) && !zzP(obj, zzu, zzx(i6))) {
                        return false;
                    }
                }
                List list = (List) zzgxd.zzh(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgwc zzx = zzx(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzx.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj, i6, i, i2, i10) && !zzP(obj, zzu, zzx(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgwc
    public final void zzm(Object obj, zzgth zzgthVar) throws IOException {
        int i;
        int i2;
        int i3;
        int i4;
        if (!this.zzh) {
            int[] iArr = this.zzc;
            Unsafe unsafe = zzb;
            int i5 = 1048575;
            int i6 = 1048575;
            int i7 = 0;
            int i8 = 0;
            while (i8 < iArr.length) {
                int zzu = zzu(i8);
                int[] iArr2 = this.zzc;
                int zzt = zzt(zzu);
                int i9 = iArr2[i8];
                if (zzt <= 17) {
                    int i10 = iArr2[i8 + 2];
                    int i11 = i10 & i5;
                    if (i11 != i6) {
                        if (i11 == i5) {
                            i4 = 0;
                        } else {
                            i4 = unsafe.getInt(obj, i11);
                        }
                        i7 = i4;
                        i6 = i11;
                    }
                    i = i6;
                    i2 = i7;
                    i3 = 1 << (i10 >>> 20);
                } else {
                    i = i6;
                    i2 = i7;
                    i3 = 0;
                }
                long j = zzu & i5;
                switch (zzt) {
                    case 0:
                        if (zzO(obj, i8, i, i2, i3)) {
                            zzgthVar.zzf(i9, zzgxd.zzb(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzO(obj, i8, i, i2, i3)) {
                            zzgthVar.zzo(i9, zzgxd.zzc(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzO(obj, i8, i, i2, i3)) {
                            zzgthVar.zzt(i9, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzO(obj, i8, i, i2, i3)) {
                            zzgthVar.zzJ(i9, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzO(obj, i8, i, i2, i3)) {
                            zzgthVar.zzr(i9, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzO(obj, i8, i, i2, i3)) {
                            zzgthVar.zzm(i9, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzO(obj, i8, i, i2, i3)) {
                            zzgthVar.zzk(i9, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzO(obj, i8, i, i2, i3)) {
                            zzgthVar.zzb(i9, zzgxd.zzz(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzO(obj, i8, i, i2, i3)) {
                            zzT(i9, unsafe.getObject(obj, j), zzgthVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzO(obj, i8, i, i2, i3)) {
                            zzgthVar.zzv(i9, unsafe.getObject(obj, j), zzx(i8));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzO(obj, i8, i, i2, i3)) {
                            zzgthVar.zzd(i9, (zzgsr) unsafe.getObject(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzO(obj, i8, i, i2, i3)) {
                            zzgthVar.zzH(i9, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzO(obj, i8, i, i2, i3)) {
                            zzgthVar.zzi(i9, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzO(obj, i8, i, i2, i3)) {
                            zzgthVar.zzw(i9, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzO(obj, i8, i, i2, i3)) {
                            zzgthVar.zzy(i9, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzO(obj, i8, i, i2, i3)) {
                            zzgthVar.zzA(i9, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzO(obj, i8, i, i2, i3)) {
                            zzgthVar.zzC(i9, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzO(obj, i8, i, i2, i3)) {
                            zzgthVar.zzq(i9, unsafe.getObject(obj, j), zzx(i8));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzgwe.zzu(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, false);
                        break;
                    case 19:
                        zzgwe.zzy(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, false);
                        break;
                    case 20:
                        zzgwe.zzA(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, false);
                        break;
                    case 21:
                        zzgwe.zzG(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, false);
                        break;
                    case 22:
                        zzgwe.zzz(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, false);
                        break;
                    case 23:
                        zzgwe.zzx(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, false);
                        break;
                    case 24:
                        zzgwe.zzw(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, false);
                        break;
                    case 25:
                        zzgwe.zzt(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, false);
                        break;
                    case 26:
                        int i12 = this.zzc[i8];
                        List list = (List) unsafe.getObject(obj, j);
                        int i13 = zzgwe.zza;
                        if (list != null && !list.isEmpty()) {
                            zzgthVar.zzG(i12, list);
                            break;
                        }
                        break;
                    case 27:
                        int i14 = this.zzc[i8];
                        List list2 = (List) unsafe.getObject(obj, j);
                        zzgwc zzx = zzx(i8);
                        int i15 = zzgwe.zza;
                        if (list2 != null && !list2.isEmpty()) {
                            for (int i16 = 0; i16 < list2.size(); i16++) {
                                zzgthVar.zzv(i14, list2.get(i16), zzx);
                            }
                            break;
                        }
                        break;
                    case 28:
                        int i17 = this.zzc[i8];
                        List list3 = (List) unsafe.getObject(obj, j);
                        int i18 = zzgwe.zza;
                        if (list3 != null && !list3.isEmpty()) {
                            zzgthVar.zze(i17, list3);
                            break;
                        }
                        break;
                    case 29:
                        zzgwe.zzF(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, false);
                        break;
                    case 30:
                        zzgwe.zzv(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, false);
                        break;
                    case 31:
                        zzgwe.zzB(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, false);
                        break;
                    case 32:
                        zzgwe.zzC(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, false);
                        break;
                    case 33:
                        zzgwe.zzD(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, false);
                        break;
                    case 34:
                        zzgwe.zzE(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, false);
                        break;
                    case 35:
                        zzgwe.zzu(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, true);
                        break;
                    case 36:
                        zzgwe.zzy(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, true);
                        break;
                    case 37:
                        zzgwe.zzA(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, true);
                        break;
                    case 38:
                        zzgwe.zzG(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, true);
                        break;
                    case 39:
                        zzgwe.zzz(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, true);
                        break;
                    case 40:
                        zzgwe.zzx(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, true);
                        break;
                    case 41:
                        zzgwe.zzw(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, true);
                        break;
                    case 42:
                        zzgwe.zzt(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, true);
                        break;
                    case 43:
                        zzgwe.zzF(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, true);
                        break;
                    case 44:
                        zzgwe.zzv(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, true);
                        break;
                    case 45:
                        zzgwe.zzB(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, true);
                        break;
                    case 46:
                        zzgwe.zzC(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, true);
                        break;
                    case 47:
                        zzgwe.zzD(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, true);
                        break;
                    case 48:
                        zzgwe.zzE(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgthVar, true);
                        break;
                    case 49:
                        int i19 = this.zzc[i8];
                        List list4 = (List) unsafe.getObject(obj, j);
                        zzgwc zzx2 = zzx(i8);
                        int i20 = zzgwe.zza;
                        if (list4 != null && !list4.isEmpty()) {
                            for (int i21 = 0; i21 < list4.size(); i21++) {
                                zzgthVar.zzq(i19, list4.get(i21), zzx2);
                            }
                            break;
                        }
                        break;
                    case 50:
                        if (unsafe.getObject(obj, j) != null) {
                            throw null;
                        }
                        break;
                    case 51:
                        if (zzR(obj, i9, i8)) {
                            zzgthVar.zzf(i9, zzn(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzR(obj, i9, i8)) {
                            zzgthVar.zzo(i9, zzo(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzR(obj, i9, i8)) {
                            zzgthVar.zzt(i9, zzv(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzR(obj, i9, i8)) {
                            zzgthVar.zzJ(i9, zzv(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzR(obj, i9, i8)) {
                            zzgthVar.zzr(i9, zzp(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzR(obj, i9, i8)) {
                            zzgthVar.zzm(i9, zzv(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzR(obj, i9, i8)) {
                            zzgthVar.zzk(i9, zzp(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzR(obj, i9, i8)) {
                            zzgthVar.zzb(i9, zzS(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzR(obj, i9, i8)) {
                            zzT(i9, unsafe.getObject(obj, j), zzgthVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzR(obj, i9, i8)) {
                            zzgthVar.zzv(i9, unsafe.getObject(obj, j), zzx(i8));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzR(obj, i9, i8)) {
                            zzgthVar.zzd(i9, (zzgsr) unsafe.getObject(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzR(obj, i9, i8)) {
                            zzgthVar.zzH(i9, zzp(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzR(obj, i9, i8)) {
                            zzgthVar.zzi(i9, zzp(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzR(obj, i9, i8)) {
                            zzgthVar.zzw(i9, zzp(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzR(obj, i9, i8)) {
                            zzgthVar.zzy(i9, zzv(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzR(obj, i9, i8)) {
                            zzgthVar.zzA(i9, zzp(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzR(obj, i9, i8)) {
                            zzgthVar.zzC(i9, zzv(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzR(obj, i9, i8)) {
                            zzgthVar.zzq(i9, unsafe.getObject(obj, j), zzx(i8));
                            break;
                        } else {
                            break;
                        }
                }
                i8 += 3;
                i6 = i;
                i7 = i2;
                i5 = 1048575;
            }
            zzgwt zzgwtVar = this.zzn;
            zzgwtVar.zzr(zzgwtVar.zzd(obj), zzgthVar);
            return;
        }
        this.zzo.zza(obj);
        throw null;
    }
}
