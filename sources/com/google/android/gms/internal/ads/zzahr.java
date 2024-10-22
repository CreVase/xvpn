package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzahr implements zzabm, zzacm {
    public static final zzabt zza = new zzabt() { // from class: com.google.android.gms.internal.ads.zzahp
        @Override // com.google.android.gms.internal.ads.zzabt
        public final /* synthetic */ zzabm[] zza(Uri uri, Map map) {
            int i = zzabs.zza;
            return new zzabm[]{new zzahr(0)};
        }
    };
    private final zzfb zzb;
    private final zzfb zzc;
    private final zzfb zzd;
    private final zzfb zze;
    private final ArrayDeque zzf;
    private final zzaht zzg;
    private final List zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private int zzl;
    private zzfb zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private zzabp zzr;
    private zzahq[] zzs;
    private long[][] zzt;
    private int zzu;
    private long zzv;
    private int zzw;
    private zzafu zzx;

    public zzahr() {
        this(0);
    }

    private static int zzf(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzi(zzahy zzahyVar, long j) {
        int zza2 = zzahyVar.zza(j);
        if (zza2 == -1) {
            return zzahyVar.zzb(j);
        }
        return zza2;
    }

    private static long zzj(zzahy zzahyVar, long j, long j2) {
        int zzi = zzi(zzahyVar, j);
        if (zzi == -1) {
            return j2;
        }
        return Math.min(zzahyVar.zzc[zzi], j2);
    }

    private final void zzk() {
        this.zzi = 0;
        this.zzl = 0;
    }

    private final void zzl(long j) throws zzcc {
        zzby zzbyVar;
        zzby zzbyVar2;
        boolean z;
        long j2;
        List list;
        int i;
        int i2;
        int i3;
        zzby zzbyVar3;
        int i4;
        zzacc zzaccVar;
        while (!this.zzf.isEmpty() && ((zzagw) this.zzf.peek()).zza == j) {
            zzagw zzagwVar = (zzagw) this.zzf.pop();
            if (zzagwVar.zzd == 1836019574) {
                ArrayList arrayList = new ArrayList();
                int i5 = this.zzw;
                zzacc zzaccVar2 = new zzacc();
                zzagx zzb = zzagwVar.zzb(1969517665);
                if (zzb != null) {
                    zzby zzb2 = zzahg.zzb(zzb);
                    zzaccVar2.zzb(zzb2);
                    zzbyVar = zzb2;
                } else {
                    zzbyVar = null;
                }
                zzagw zza2 = zzagwVar.zza(1835365473);
                if (zza2 != null) {
                    zzbyVar2 = zzahg.zza(zza2);
                } else {
                    zzbyVar2 = null;
                }
                zzbx[] zzbxVarArr = new zzbx[1];
                zzagx zzb3 = zzagwVar.zzb(1836476516);
                zzb3.getClass();
                if (i5 == 1) {
                    z = true;
                } else {
                    z = false;
                }
                zzbxVarArr[0] = zzahg.zzc(zzb3.zza);
                zzby zzbyVar4 = new zzby(-9223372036854775807L, zzbxVarArr);
                zzby zzbyVar5 = zzbyVar;
                long j3 = -9223372036854775807L;
                List zzd = zzahg.zzd(zzagwVar, zzaccVar2, -9223372036854775807L, null, false, z, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzaho
                    @Override // com.google.android.gms.internal.ads.zzfsk
                    public final Object apply(Object obj) {
                        zzahv zzahvVar = (zzahv) obj;
                        zzabt zzabtVar = zzahr.zza;
                        return zzahvVar;
                    }
                });
                int size = zzd.size();
                long j4 = -9223372036854775807L;
                int i6 = -1;
                int i7 = 0;
                while (true) {
                    j2 = 0;
                    if (i7 >= size) {
                        break;
                    }
                    zzahy zzahyVar = (zzahy) zzd.get(i7);
                    if (zzahyVar.zzb == 0) {
                        list = zzd;
                        i = size;
                        zzaccVar = zzaccVar2;
                    } else {
                        zzahv zzahvVar = zzahyVar.zza;
                        list = zzd;
                        long j5 = zzahvVar.zze;
                        if (j5 == j3) {
                            j5 = zzahyVar.zzh;
                        }
                        long max = Math.max(j4, j5);
                        i = size;
                        zzahq zzahqVar = new zzahq(zzahvVar, zzahyVar, this.zzr.zzw(i7, zzahvVar.zzb));
                        if ("audio/true-hd".equals(zzahvVar.zzf.zzm)) {
                            i2 = zzahyVar.zze * 16;
                        } else {
                            i2 = zzahyVar.zze + 30;
                        }
                        zzak zzb4 = zzahvVar.zzf.zzb();
                        zzb4.zzN(i2);
                        if (zzahvVar.zzb == 2 && j5 > 0) {
                            int i8 = zzahyVar.zzb;
                            i3 = 1;
                            if (i8 > 1) {
                                zzb4.zzG(i8 / (((float) j5) / 1000000.0f));
                            }
                        } else {
                            i3 = 1;
                        }
                        if (zzahvVar.zzb == i3 && zzaccVar2.zza()) {
                            zzb4.zzE(zzaccVar2.zza);
                            zzb4.zzF(zzaccVar2.zzb);
                        }
                        int i9 = zzahvVar.zzb;
                        zzby[] zzbyVarArr = new zzby[3];
                        if (this.zzh.isEmpty()) {
                            i4 = 0;
                            zzbyVar3 = null;
                        } else {
                            zzbyVar3 = new zzby(this.zzh);
                            i4 = 0;
                        }
                        zzbyVarArr[i4] = zzbyVar3;
                        zzbyVarArr[i3] = zzbyVar5;
                        zzbyVarArr[2] = zzbyVar4;
                        zzaccVar = zzaccVar2;
                        zzby zzbyVar6 = new zzby(-9223372036854775807L, new zzbx[i4]);
                        if (zzbyVar2 != null) {
                            for (int i10 = 0; i10 < zzbyVar2.zza(); i10++) {
                                zzbx zzb5 = zzbyVar2.zzb(i10);
                                if (zzb5 instanceof zzfo) {
                                    zzfo zzfoVar = (zzfo) zzb5;
                                    if (zzfoVar.zza.equals("com.android.capture.fps")) {
                                        if (i9 == 2) {
                                            zzbyVar6 = zzbyVar6.zzc(zzfoVar);
                                        }
                                    } else {
                                        zzbyVar6 = zzbyVar6.zzc(zzfoVar);
                                    }
                                }
                            }
                        }
                        for (int i11 = 0; i11 < 3; i11++) {
                            zzbyVar6 = zzbyVar6.zzd(zzbyVarArr[i11]);
                        }
                        if (zzbyVar6.zza() > 0) {
                            zzb4.zzO(zzbyVar6);
                        }
                        zzahqVar.zzc.zzl(zzb4.zzac());
                        if (zzahvVar.zzb == 2 && i6 == -1) {
                            i6 = arrayList.size();
                        }
                        arrayList.add(zzahqVar);
                        j4 = max;
                    }
                    i7++;
                    zzaccVar2 = zzaccVar;
                    zzd = list;
                    size = i;
                    j3 = -9223372036854775807L;
                }
                this.zzu = i6;
                this.zzv = j4;
                zzahq[] zzahqVarArr = (zzahq[]) arrayList.toArray(new zzahq[0]);
                this.zzs = zzahqVarArr;
                int length = zzahqVarArr.length;
                long[][] jArr = new long[length];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i12 = 0; i12 < zzahqVarArr.length; i12++) {
                    jArr[i12] = new long[zzahqVarArr[i12].zzb.zzb];
                    jArr2[i12] = zzahqVarArr[i12].zzb.zzf[0];
                }
                int i13 = 0;
                while (i13 < zzahqVarArr.length) {
                    long j6 = Long.MAX_VALUE;
                    int i14 = -1;
                    for (int i15 = 0; i15 < zzahqVarArr.length; i15++) {
                        if (!zArr[i15]) {
                            long j7 = jArr2[i15];
                            if (j7 <= j6) {
                                i14 = i15;
                                j6 = j7;
                            }
                        }
                    }
                    int i16 = iArr[i14];
                    long[] jArr3 = jArr[i14];
                    jArr3[i16] = j2;
                    zzahy zzahyVar2 = zzahqVarArr[i14].zzb;
                    j2 += zzahyVar2.zzd[i16];
                    int i17 = i16 + 1;
                    iArr[i14] = i17;
                    if (i17 < jArr3.length) {
                        jArr2[i14] = zzahyVar2.zzf[i17];
                    } else {
                        zArr[i14] = true;
                        i13++;
                    }
                }
                this.zzt = jArr;
                this.zzr.zzD();
                this.zzr.zzO(this);
                this.zzf.clear();
                this.zzi = 2;
            } else if (!this.zzf.isEmpty()) {
                ((zzagw) this.zzf.peek()).zzc(zzagwVar);
            }
        }
        if (this.zzi != 2) {
            zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final long zza() {
        return this.zzv;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0379, code lost:            r3 = true;     */
    /* JADX WARN: Removed duplicated region for block: B:193:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0081 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzabm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzabn r33, com.google.android.gms.internal.ads.zzacj r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahr.zzb(com.google.android.gms.internal.ads.zzabn, com.google.android.gms.internal.ads.zzacj):int");
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzc(zzabp zzabpVar) {
        this.zzr = zzabpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzd(long j, long j2) {
        this.zzf.clear();
        this.zzl = 0;
        this.zzn = -1;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        if (j == 0) {
            zzk();
            return;
        }
        for (zzahq zzahqVar : this.zzs) {
            zzahy zzahyVar = zzahqVar.zzb;
            int zza2 = zzahyVar.zza(j2);
            if (zza2 == -1) {
                zza2 = zzahyVar.zzb(j2);
            }
            zzahqVar.zze = zza2;
            zzact zzactVar = zzahqVar.zzd;
            if (zzactVar != null) {
                zzactVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final boolean zze(zzabn zzabnVar) throws IOException {
        return zzahu.zzb(zzabnVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final zzack zzg(long j) {
        long j2;
        long j3;
        int zzb;
        zzahq[] zzahqVarArr = this.zzs;
        if (zzahqVarArr.length == 0) {
            zzacn zzacnVar = zzacn.zza;
            return new zzack(zzacnVar, zzacnVar);
        }
        int i = this.zzu;
        long j4 = -1;
        if (i != -1) {
            zzahy zzahyVar = zzahqVarArr[i].zzb;
            int zzi = zzi(zzahyVar, j);
            if (zzi == -1) {
                zzacn zzacnVar2 = zzacn.zza;
                return new zzack(zzacnVar2, zzacnVar2);
            }
            long j5 = zzahyVar.zzf[zzi];
            j2 = zzahyVar.zzc[zzi];
            if (j5 < j && zzi < zzahyVar.zzb - 1 && (zzb = zzahyVar.zzb(j)) != -1 && zzb != zzi) {
                j3 = zzahyVar.zzf[zzb];
                j4 = zzahyVar.zzc[zzb];
            } else {
                j3 = -9223372036854775807L;
            }
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            zzahq[] zzahqVarArr2 = this.zzs;
            if (i2 >= zzahqVarArr2.length) {
                break;
            }
            if (i2 != this.zzu) {
                zzahy zzahyVar2 = zzahqVarArr2[i2].zzb;
                long zzj = zzj(zzahyVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    j4 = zzj(zzahyVar2, j3, j4);
                }
                j2 = zzj;
            }
            i2++;
        }
        zzacn zzacnVar3 = new zzacn(j, j2);
        if (j3 == -9223372036854775807L) {
            return new zzack(zzacnVar3, zzacnVar3);
        }
        return new zzack(zzacnVar3, new zzacn(j3, j4));
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final boolean zzh() {
        return true;
    }

    public zzahr(int i) {
        this.zzi = 0;
        this.zzg = new zzaht();
        this.zzh = new ArrayList();
        this.zze = new zzfb(16);
        this.zzf = new ArrayDeque();
        this.zzb = new zzfb(zzfy.zza);
        this.zzc = new zzfb(4);
        this.zzd = new zzfb();
        this.zzn = -1;
        this.zzr = zzabp.zza;
        this.zzs = new zzahq[0];
    }
}
