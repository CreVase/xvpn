package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzxi extends zzxn implements zzls {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfxb zzc = zzfxb.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzwh
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i = zzxi.zzb;
            if (num.intValue() == -1) {
                if (num2.intValue() != -1) {
                    return -1;
                }
                return 0;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });
    private static final zzfxb zzd = zzfxb.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzwi
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i = zzxi.zzb;
            return 0;
        }
    });
    public final Context zza;
    private final Object zze;
    private final boolean zzf;
    private zzww zzg;
    private zzxb zzh;
    private zzk zzi;
    private final zzwd zzj;

    public zzxi(Context context) {
        Context context2;
        zzwd zzwdVar = new zzwd();
        zzww zzd2 = zzww.zzd(context);
        this.zze = new Object();
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.zza = context2;
        this.zzj = zzwdVar;
        this.zzg = zzd2;
        this.zzi = zzk.zza;
        boolean z = false;
        if (context != null && zzfk.zzH(context)) {
            z = true;
        }
        this.zzf = z;
        if (!z && context != null && zzfk.zza >= 32) {
            this.zzh = zzxb.zza(context);
        }
        if (this.zzg.zzQ && context == null) {
            zzer.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int zza(zzam zzamVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzamVar.zzd)) {
            return 4;
        }
        String zzg = zzg(str);
        String zzg2 = zzg(zzamVar.zzd);
        if (zzg2 != null && zzg != null) {
            if (!zzg2.startsWith(zzg) && !zzg.startsWith(zzg2)) {
                int i = zzfk.zza;
                if (!zzg2.split("-", 2)[0].equals(zzg.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        }
        if (!z || zzg2 != null) {
            return 0;
        }
        return 1;
    }

    public static String zzg(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "und")) {
            return str;
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ void zzh(zzxi zzxiVar) {
        zzxiVar.zzu();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:            if (r1 != 3) goto L105;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ boolean zzl(com.google.android.gms.internal.ads.zzxi r8, com.google.android.gms.internal.ads.zzam r9) {
        /*
            java.lang.Object r0 = r8.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzww r1 = r8.zzg     // Catch: java.lang.Throwable -> L8f
            boolean r1 = r1.zzQ     // Catch: java.lang.Throwable -> L8f
            r2 = 1
            if (r1 == 0) goto L8d
            boolean r1 = r8.zzf     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L8d
            int r1 = r9.zzz     // Catch: java.lang.Throwable -> L8f
            r3 = 2
            if (r1 <= r3) goto L8d
            java.lang.String r1 = r9.zzm     // Catch: java.lang.Throwable -> L8f
            r4 = 32
            r5 = 0
            if (r1 != 0) goto L1b
            goto L65
        L1b:
            int r6 = r1.hashCode()     // Catch: java.lang.Throwable -> L8f
            r7 = 3
            switch(r6) {
                case -2123537834: goto L42;
                case 187078296: goto L38;
                case 187078297: goto L2e;
                case 1504578661: goto L24;
                default: goto L23;
            }
        L23:
            goto L4c
        L24:
            java.lang.String r6 = "audio/eac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 1
            goto L4d
        L2e:
            java.lang.String r6 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 3
            goto L4d
        L38:
            java.lang.String r6 = "audio/ac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 0
            goto L4d
        L42:
            java.lang.String r6 = "audio/eac3-joc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 2
            goto L4d
        L4c:
            r1 = -1
        L4d:
            if (r1 == 0) goto L56
            if (r1 == r2) goto L56
            if (r1 == r3) goto L56
            if (r1 == r7) goto L56
            goto L65
        L56:
            int r1 = com.google.android.gms.internal.ads.zzfk.zza     // Catch: java.lang.Throwable -> L8f
            if (r1 < r4) goto L8d
            com.google.android.gms.internal.ads.zzxb r1 = r8.zzh     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8d
            boolean r1 = r1.zzg()     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L65
            goto L8d
        L65:
            int r1 = com.google.android.gms.internal.ads.zzfk.zza     // Catch: java.lang.Throwable -> L8f
            if (r1 < r4) goto L8c
            com.google.android.gms.internal.ads.zzxb r1 = r8.zzh     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8c
            boolean r3 = r1.zzg()     // Catch: java.lang.Throwable -> L8f
            if (r3 == 0) goto L8c
            boolean r1 = r1.zze()     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzxb r1 = r8.zzh     // Catch: java.lang.Throwable -> L8f
            boolean r1 = r1.zzf()     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzxb r1 = r8.zzh     // Catch: java.lang.Throwable -> L8f
            com.google.android.gms.internal.ads.zzk r8 = r8.zzi     // Catch: java.lang.Throwable -> L8f
            boolean r8 = r1.zzd(r8, r9)     // Catch: java.lang.Throwable -> L8f
            if (r8 == 0) goto L8c
            goto L8d
        L8c:
            r2 = 0
        L8d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            return r2
        L8f:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxi.zzl(com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzam):boolean");
    }

    public static boolean zzn(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    private static void zzt(zzvx zzvxVar, zzdc zzdcVar, Map map) {
        for (int i = 0; i < zzvxVar.zzc; i++) {
            if (((zzcz) zzdcVar.zzC.get(zzvxVar.zzb(i))) != null) {
                throw null;
            }
        }
    }

    public final void zzu() {
        boolean z;
        zzxb zzxbVar;
        synchronized (this.zze) {
            z = false;
            if (this.zzg.zzQ && !this.zzf && zzfk.zza >= 32 && (zzxbVar = this.zzh) != null && zzxbVar.zzg()) {
                z = true;
            }
        }
        if (z) {
            zzs();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.google.android.gms.internal.ads.zzfvs] */
    private static final Pair zzv(int i, zzxm zzxmVar, int[][][] iArr, zzxd zzxdVar, Comparator comparator) {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            if (i == zzxmVar.zzc(i2)) {
                zzvx zzd2 = zzxmVar.zzd(i2);
                for (int i3 = 0; i3 < zzd2.zzc; i3++) {
                    zzcx zzb2 = zzd2.zzb(i3);
                    List zza = zzxdVar.zza(i2, zzb2, iArr[i2][i3]);
                    int i4 = zzb2.zzb;
                    int i5 = 1;
                    boolean[] zArr = new boolean[1];
                    int i6 = 0;
                    while (i6 <= 0) {
                        int i7 = i6 + 1;
                        zzxe zzxeVar = (zzxe) zza.get(i6);
                        int zzb3 = zzxeVar.zzb();
                        if (!zArr[i6] && zzb3 != 0) {
                            if (zzb3 == i5) {
                                arrayList = zzfvs.zzm(zzxeVar);
                            } else {
                                arrayList = new ArrayList();
                                arrayList.add(zzxeVar);
                                for (int i8 = i7; i8 <= 0; i8++) {
                                    zzxe zzxeVar2 = (zzxe) zza.get(i8);
                                    if (zzxeVar2.zzb() == 2 && zzxeVar.zzc(zzxeVar2)) {
                                        arrayList.add(zzxeVar2);
                                        zArr[i8] = true;
                                    }
                                }
                            }
                            arrayList2.add(arrayList);
                        }
                        i6 = i7;
                        i5 = 1;
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList2, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            iArr2[i9] = ((zzxe) list.get(i9)).zzc;
        }
        zzxe zzxeVar3 = (zzxe) list.get(0);
        return Pair.create(new zzxj(zzxeVar3.zzb, iArr2, 0), Integer.valueOf(zzxeVar3.zza));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzxn
    public final Pair zzb(zzxm zzxmVar, int[][][] iArr, final int[] iArr2, zztw zztwVar, zzcv zzcvVar) throws zzil {
        final zzww zzwwVar;
        int i;
        final boolean z;
        final String str;
        zzlu zzluVar;
        int i2;
        int[] iArr3;
        int length;
        zzxk zza;
        zzxj zzxjVar;
        zzxb zzxbVar;
        synchronized (this.zze) {
            zzwwVar = this.zzg;
            if (zzwwVar.zzQ && zzfk.zza >= 32 && (zzxbVar = this.zzh) != null) {
                Looper myLooper = Looper.myLooper();
                zzdx.zzb(myLooper);
                zzxbVar.zzb(this, myLooper);
            }
        }
        int i3 = 2;
        zzxj[] zzxjVarArr = new zzxj[2];
        Pair zzv = zzv(2, zzxmVar, iArr, new zzxd() { // from class: com.google.android.gms.internal.ads.zzwm
            /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
            @Override // com.google.android.gms.internal.ads.zzxd
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.util.List zza(int r19, com.google.android.gms.internal.ads.zzcx r20, int[] r21) {
                /*
                    Method dump skipped, instructions count: 201
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwm.zza(int, com.google.android.gms.internal.ads.zzcx, int[]):java.util.List");
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwn
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                zzfvh zzj = zzfvh.zzj();
                zzxf zzxfVar = new Comparator() { // from class: com.google.android.gms.internal.ads.zzxf
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxh.zzd((zzxh) obj3, (zzxh) obj4);
                    }
                };
                zzfvh zzb2 = zzj.zzc((zzxh) Collections.max(list, zzxfVar), (zzxh) Collections.max(list2, zzxfVar), zzxfVar).zzb(list.size(), list2.size());
                zzxg zzxgVar = new Comparator() { // from class: com.google.android.gms.internal.ads.zzxg
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxh.zza((zzxh) obj3, (zzxh) obj4);
                    }
                };
                return zzb2.zzc((zzxh) Collections.max(list, zzxgVar), (zzxh) Collections.max(list2, zzxgVar), zzxgVar).zza();
            }
        });
        if (zzv != null) {
            zzxjVarArr[((Integer) zzv.second).intValue()] = (zzxj) zzv.first;
        }
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 < 2) {
                if (zzxmVar.zzc(i4) == 2 && zzxmVar.zzd(i4).zzc > 0) {
                    z = true;
                    break;
                }
                i4++;
            } else {
                z = false;
                break;
            }
        }
        Pair zzv2 = zzv(1, zzxmVar, iArr, new zzxd() { // from class: com.google.android.gms.internal.ads.zzwk
            @Override // com.google.android.gms.internal.ads.zzxd
            public final List zza(int i5, zzcx zzcxVar, int[] iArr4) {
                final zzxi zzxiVar = zzxi.this;
                zzfsx zzfsxVar = new zzfsx() { // from class: com.google.android.gms.internal.ads.zzwj
                    @Override // com.google.android.gms.internal.ads.zzfsx
                    public final boolean zza(Object obj) {
                        return zzxi.zzl(zzxi.this, (zzam) obj);
                    }
                };
                zzfvp zzfvpVar = new zzfvp();
                int i6 = 0;
                while (true) {
                    int i7 = zzcxVar.zzb;
                    if (i6 <= 0) {
                        int i8 = i6;
                        zzfvpVar.zzf(new zzwq(i5, zzcxVar, i8, zzwwVar, iArr4[i6], z, zzfsxVar));
                        i6++;
                    } else {
                        return zzfvpVar.zzi();
                    }
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwl
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzwq) Collections.max((List) obj)).zza((zzwq) Collections.max((List) obj2));
            }
        });
        if (zzv2 != null) {
            zzxjVarArr[((Integer) zzv2.second).intValue()] = (zzxj) zzv2.first;
        }
        if (zzv2 == null) {
            str = null;
        } else {
            Object obj = zzv2.first;
            str = ((zzxj) obj).zza.zzb(((zzxj) obj).zzb[0]).zzd;
        }
        int i5 = 3;
        Pair zzv3 = zzv(3, zzxmVar, iArr, new zzxd() { // from class: com.google.android.gms.internal.ads.zzwo
            @Override // com.google.android.gms.internal.ads.zzxd
            public final List zza(int i6, zzcx zzcxVar, int[] iArr4) {
                int i7 = zzxi.zzb;
                zzfvp zzfvpVar = new zzfvp();
                int i8 = 0;
                while (true) {
                    int i9 = zzcxVar.zzb;
                    if (i8 <= 0) {
                        int i10 = i8;
                        zzfvpVar.zzf(new zzxc(i6, zzcxVar, i10, zzww.this, iArr4[i8], str));
                        i8++;
                    } else {
                        return zzfvpVar.zzi();
                    }
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwp
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((zzxc) ((List) obj2).get(0)).zza((zzxc) ((List) obj3).get(0));
            }
        });
        if (zzv3 != null) {
            zzxjVarArr[((Integer) zzv3.second).intValue()] = (zzxj) zzv3.first;
        }
        int i6 = 0;
        while (i6 < i3) {
            int zzc2 = zzxmVar.zzc(i6);
            if (zzc2 != i3 && zzc2 != i && zzc2 != i5) {
                zzvx zzd2 = zzxmVar.zzd(i6);
                int[][] iArr4 = iArr[i6];
                zzcx zzcxVar = null;
                zzwr zzwrVar = null;
                for (int i7 = 0; i7 < zzd2.zzc; i7++) {
                    zzcx zzb2 = zzd2.zzb(i7);
                    int[] iArr5 = iArr4[i7];
                    char c = 0;
                    while (true) {
                        int i8 = zzb2.zzb;
                        if (c <= 0) {
                            if (zzn(iArr5[0], zzwwVar.zzR)) {
                                zzwr zzwrVar2 = new zzwr(zzb2.zzb(0), iArr5[0]);
                                if (zzwrVar == null || zzwrVar2.compareTo(zzwrVar) > 0) {
                                    zzwrVar = zzwrVar2;
                                    zzcxVar = zzb2;
                                }
                            }
                            c = 1;
                        }
                    }
                }
                if (zzcxVar == null) {
                    zzxjVar = null;
                } else {
                    zzxjVar = new zzxj(zzcxVar, new int[]{0}, 0);
                }
                zzxjVarArr[i6] = zzxjVar;
            }
            i6++;
            i3 = 2;
            i = 1;
            i5 = 3;
        }
        HashMap hashMap = new HashMap();
        for (int i9 = 0; i9 < 2; i9++) {
            zzt(zzxmVar.zzd(i9), zzwwVar, hashMap);
        }
        zzt(zzxmVar.zze(), zzwwVar, hashMap);
        for (int i10 = 0; i10 < 2; i10++) {
            if (((zzcz) hashMap.get(Integer.valueOf(zzxmVar.zzc(i10)))) != null) {
                throw null;
            }
        }
        int i11 = 0;
        for (int i12 = 2; i11 < i12; i12 = 2) {
            zzvx zzd3 = zzxmVar.zzd(i11);
            if (zzwwVar.zzg(i11, zzd3)) {
                if (zzwwVar.zze(i11, zzd3) == null) {
                    zzxjVarArr[i11] = null;
                } else {
                    throw null;
                }
            }
            i11++;
        }
        for (int i13 = 0; i13 < 2; i13++) {
            int zzc3 = zzxmVar.zzc(i13);
            if (zzwwVar.zzf(i13) || zzwwVar.zzD.contains(Integer.valueOf(zzc3))) {
                zzxjVarArr[i13] = null;
            }
        }
        zzwd zzwdVar = this.zzj;
        zzxy zzq = zzq();
        zzfvs zzf = zzwe.zzf(zzxjVarArr);
        int i14 = 2;
        zzxk[] zzxkVarArr = new zzxk[2];
        int i15 = 0;
        while (i15 < i14) {
            zzxj zzxjVar2 = zzxjVarArr[i15];
            if (zzxjVar2 != null && (length = (iArr3 = zzxjVar2.zzb).length) != 0) {
                if (length == 1) {
                    zza = new zzxl(zzxjVar2.zza, iArr3[0], 0, 0, null);
                    i2 = i15;
                } else {
                    i2 = i15;
                    zza = zzwdVar.zza(zzxjVar2.zza, iArr3, 0, zzq, (zzfvs) zzf.get(i15));
                }
                zzxkVarArr[i2] = zza;
            } else {
                i2 = i15;
            }
            i15 = i2 + 1;
            i14 = 2;
        }
        zzlu[] zzluVarArr = new zzlu[i14];
        for (int i16 = 0; i16 < i14; i16++) {
            int zzc4 = zzxmVar.zzc(i16);
            if (!zzwwVar.zzf(i16) && !zzwwVar.zzD.contains(Integer.valueOf(zzc4)) && (zzxmVar.zzc(i16) == -2 || zzxkVarArr[i16] != null)) {
                zzluVar = zzlu.zza;
            } else {
                zzluVar = null;
            }
            zzluVarArr[i16] = zzluVar;
        }
        return Pair.create(zzluVarArr, zzxkVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final zzls zzc() {
        return this;
    }

    public final zzww zzd() {
        zzww zzwwVar;
        synchronized (this.zze) {
            zzwwVar = this.zzg;
        }
        return zzwwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzi() {
        zzxb zzxbVar;
        synchronized (this.zze) {
            if (zzfk.zza >= 32 && (zzxbVar = this.zzh) != null) {
                zzxbVar.zzc();
            }
        }
        super.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzj(zzk zzkVar) {
        boolean z;
        synchronized (this.zze) {
            z = !this.zzi.equals(zzkVar);
            this.zzi = zzkVar;
        }
        if (z) {
            zzu();
        }
    }

    public final void zzk(zzwu zzwuVar) {
        boolean z;
        zzww zzwwVar = new zzww(zzwuVar);
        synchronized (this.zze) {
            z = !this.zzg.equals(zzwwVar);
            this.zzg = zzwwVar;
        }
        if (z) {
            if (zzwwVar.zzQ && this.zza == null) {
                zzer.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final boolean zzm() {
        return true;
    }
}
