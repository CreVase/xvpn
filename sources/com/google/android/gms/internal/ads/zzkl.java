package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzkl implements Handler.Callback, zztt, zzxp, zzli, zzii, zzll {
    private boolean zzB;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private int zzH;
    private zzkk zzI;
    private long zzJ;
    private int zzK;
    private boolean zzL;
    private zzil zzM;
    private final zzix zzO;
    private final zzig zzP;
    private final zzlr[] zza;
    private final Set zzb;
    private final zzlt[] zzc;
    private final zzxq zzd;
    private final zzxr zze;
    private final zzko zzf;
    private final zzxy zzg;
    private final zzei zzh;
    private final HandlerThread zzi;
    private final Looper zzj;
    private final zzcu zzk;
    private final zzcs zzl;
    private final long zzm;
    private final zzij zzn;
    private final ArrayList zzo;
    private final zzdy zzp;
    private final zzkx zzq;
    private final zzlj zzr;
    private final long zzs;
    private zzlv zzt;
    private zzlk zzu;
    private zzkj zzv;
    private boolean zzw;
    private boolean zzy;
    private boolean zzz;
    private int zzC = 0;
    private boolean zzD = false;
    private boolean zzx = false;
    private long zzN = -9223372036854775807L;
    private long zzA = -9223372036854775807L;

    public zzkl(zzlr[] zzlrVarArr, zzxq zzxqVar, zzxr zzxrVar, zzko zzkoVar, zzxy zzxyVar, int i, boolean z, zzmb zzmbVar, zzlv zzlvVar, zzig zzigVar, long j, boolean z2, Looper looper, zzdy zzdyVar, zzix zzixVar, zzol zzolVar, Looper looper2) {
        this.zzO = zzixVar;
        this.zza = zzlrVarArr;
        this.zzd = zzxqVar;
        this.zze = zzxrVar;
        this.zzf = zzkoVar;
        this.zzg = zzxyVar;
        this.zzt = zzlvVar;
        this.zzP = zzigVar;
        this.zzs = j;
        this.zzp = zzdyVar;
        this.zzm = zzkoVar.zza();
        zzkoVar.zzf();
        zzlk zzi = zzlk.zzi(zzxrVar);
        this.zzu = zzi;
        this.zzv = new zzkj(zzi);
        int length = zzlrVarArr.length;
        this.zzc = new zzlt[2];
        zzls zzc = zzxqVar.zzc();
        for (int i2 = 0; i2 < 2; i2++) {
            zzlrVarArr[i2].zzu(i2, zzolVar, zzdyVar);
            this.zzc[i2] = zzlrVarArr[i2].zzl();
            this.zzc[i2].zzJ(zzc);
        }
        this.zzn = new zzij(this, zzdyVar);
        this.zzo = new ArrayList();
        this.zzb = Collections.newSetFromMap(new IdentityHashMap());
        this.zzk = new zzcu();
        this.zzl = new zzcs();
        zzxqVar.zzr(this, zzxyVar);
        this.zzL = true;
        zzei zzb = zzdyVar.zzb(looper, null);
        this.zzq = new zzkx(zzmbVar, zzb);
        this.zzr = new zzlj(this, zzmbVar, zzb, zzolVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.zzi = handlerThread;
        handlerThread.start();
        Looper looper3 = handlerThread.getLooper();
        this.zzj = looper3;
        this.zzh = zzdyVar.zzb(looper3, this);
    }

    private final void zzA(zzlr zzlrVar) throws zzil {
        if (!zzaf(zzlrVar)) {
            return;
        }
        this.zzn.zzd(zzlrVar);
        zzam(zzlrVar);
        zzlrVar.zzq();
        this.zzH--;
    }

    private final void zzB() throws zzil {
        int length = this.zza.length;
        zzC(new boolean[2], this.zzq.zze().zzf());
    }

    private final void zzC(boolean[] zArr, long j) throws zzil {
        boolean z;
        boolean z2;
        boolean z3;
        zzku zze = this.zzq.zze();
        zzxr zzi = zze.zzi();
        int i = 0;
        while (true) {
            int length = this.zza.length;
            if (i >= 2) {
                break;
            }
            if (!zzi.zzb(i) && this.zzb.remove(this.zza[i])) {
                this.zza[i].zzG();
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            int length2 = this.zza.length;
            if (i2 < 2) {
                if (zzi.zzb(i2)) {
                    boolean z4 = zArr[i2];
                    zzlr zzlrVar = this.zza[i2];
                    if (!zzaf(zzlrVar)) {
                        zzkx zzkxVar = this.zzq;
                        zzku zze2 = zzkxVar.zze();
                        if (zze2 == zzkxVar.zzd()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        zzxr zzi2 = zze2.zzi();
                        zzlu zzluVar = zzi2.zzb[i2];
                        zzam[] zzak = zzak(zzi2.zzc[i2]);
                        if (zzai() && this.zzu.zze == 3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z4 && z2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        this.zzH++;
                        this.zzb.add(zzlrVar);
                        zzlrVar.zzr(zzluVar, zzak, zze2.zzc[i2], this.zzJ, z3, z, j, zze2.zze());
                        zzlrVar.zzt(11, new zzke(this));
                        this.zzn.zze(zzlrVar);
                        if (z2) {
                            zzlrVar.zzL();
                        }
                    }
                }
                i2++;
            } else {
                zze.zzg = true;
                return;
            }
        }
    }

    private final void zzD(IOException iOException, int i) {
        zzkx zzkxVar = this.zzq;
        zzil zzc = zzil.zzc(iOException, i);
        zzku zzd = zzkxVar.zzd();
        if (zzd != null) {
            zzc = zzc.zza(zzd.zzf.zza);
        }
        zzer.zzd("ExoPlayerImplInternal", "Playback error", zzc);
        zzW(false, false);
        this.zzu = this.zzu.zzf(zzc);
    }

    private final void zzE(boolean z) {
        zztw zztwVar;
        long zzc;
        zzku zzc2 = this.zzq.zzc();
        if (zzc2 == null) {
            zztwVar = this.zzu.zzb;
        } else {
            zztwVar = zzc2.zzf.zza;
        }
        boolean z2 = !this.zzu.zzk.equals(zztwVar);
        if (z2) {
            this.zzu = this.zzu.zzc(zztwVar);
        }
        zzlk zzlkVar = this.zzu;
        if (zzc2 == null) {
            zzc = zzlkVar.zzr;
        } else {
            zzc = zzc2.zzc();
        }
        zzlkVar.zzp = zzc;
        this.zzu.zzq = zzt();
        if ((z2 || z) && zzc2 != null && zzc2.zzd) {
            zzZ(zzc2.zzf.zza, zzc2.zzh(), zzc2.zzi());
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private final void zzF(com.google.android.gms.internal.ads.zzcv r29, boolean r30) throws com.google.android.gms.internal.ads.zzil {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkl.zzF(com.google.android.gms.internal.ads.zzcv, boolean):void");
    }

    private final void zzG(zzcg zzcgVar, boolean z) throws zzil {
        zzH(zzcgVar, zzcgVar.zzc, true, z);
    }

    private final void zzH(zzcg zzcgVar, float f, boolean z, boolean z2) throws zzil {
        int i;
        zzkl zzklVar = this;
        if (z) {
            if (z2) {
                zzklVar.zzv.zza(1);
            }
            zzlk zzlkVar = zzklVar.zzu;
            zzklVar = this;
            zzklVar.zzu = new zzlk(zzlkVar.zza, zzlkVar.zzb, zzlkVar.zzc, zzlkVar.zzd, zzlkVar.zze, zzlkVar.zzf, zzlkVar.zzg, zzlkVar.zzh, zzlkVar.zzi, zzlkVar.zzj, zzlkVar.zzk, zzlkVar.zzl, zzlkVar.zzm, zzcgVar, zzlkVar.zzp, zzlkVar.zzq, zzlkVar.zzr, zzlkVar.zzs, zzlkVar.zzo);
        }
        float f2 = zzcgVar.zzc;
        zzku zzd = zzklVar.zzq.zzd();
        while (true) {
            i = 0;
            if (zzd == null) {
                break;
            }
            zzxk[] zzxkVarArr = zzd.zzi().zzc;
            int length = zzxkVarArr.length;
            while (i < length) {
                zzxk zzxkVar = zzxkVarArr[i];
                i++;
            }
            zzd = zzd.zzg();
        }
        zzlr[] zzlrVarArr = zzklVar.zza;
        int length2 = zzlrVarArr.length;
        while (i < 2) {
            zzlr zzlrVar = zzlrVarArr[i];
            if (zzlrVar != null) {
                zzlrVar.zzK(f, zzcgVar.zzc);
            }
            i++;
        }
    }

    private final void zzI() {
        long zze;
        long j;
        boolean z = false;
        if (zzae()) {
            zzku zzc = this.zzq.zzc();
            long zzu = zzu(zzc.zzd());
            if (zzc == this.zzq.zzd()) {
                zze = this.zzJ;
                j = zzc.zze();
            } else {
                zze = this.zzJ - zzc.zze();
                j = zzc.zzf.zzb;
            }
            long j2 = zze - j;
            boolean zzg = this.zzf.zzg(j2, zzu, this.zzn.zzc().zzc);
            if (!zzg && zzu < 500000 && this.zzm > 0) {
                this.zzq.zzd().zza.zzj(this.zzu.zzr, false);
                z = this.zzf.zzg(j2, zzu, this.zzn.zzc().zzc);
            } else {
                z = zzg;
            }
        }
        this.zzB = z;
        if (z) {
            this.zzq.zzc().zzk(this.zzJ, this.zzn.zzc().zzc, this.zzA);
        }
        zzY();
    }

    private final void zzJ() {
        boolean z;
        this.zzv.zzc(this.zzu);
        z = this.zzv.zzg;
        if (z) {
            zzix zzixVar = this.zzO;
            zzixVar.zza.zzU(this.zzv);
            this.zzv = new zzkj(this.zzu);
        }
    }

    private final void zzK() throws zzil {
        int i;
        boolean z;
        float f = this.zzn.zzc().zzc;
        zzkx zzkxVar = this.zzq;
        zzku zze = zzkxVar.zze();
        boolean z2 = true;
        for (zzku zzd = zzkxVar.zzd(); zzd != null && zzd.zzd; zzd = zzd.zzg()) {
            zzxr zzj = zzd.zzj(f, this.zzu.zza);
            zzxr zzi = zzd.zzi();
            boolean z3 = false;
            if (zzi != null) {
                if (zzi.zzc.length == zzj.zzc.length) {
                    for (int i2 = 0; i2 < zzj.zzc.length; i2++) {
                        if (zzj.zza(zzi, i2)) {
                        }
                    }
                    if (zzd != zze) {
                        z3 = true;
                    }
                    z2 &= z3;
                }
            }
            if (z2) {
                zzkx zzkxVar2 = this.zzq;
                zzku zzd2 = zzkxVar2.zzd();
                boolean zzm = zzkxVar2.zzm(zzd2);
                int length = this.zza.length;
                boolean[] zArr = new boolean[2];
                long zzb = zzd2.zzb(zzj, this.zzu.zzr, zzm, zArr);
                zzlk zzlkVar = this.zzu;
                if (zzlkVar.zze != 4 && zzb != zzlkVar.zzr) {
                    z = true;
                } else {
                    z = false;
                }
                zzlk zzlkVar2 = this.zzu;
                i = 2;
                this.zzu = zzz(zzlkVar2.zzb, zzb, zzlkVar2.zzc, zzlkVar2.zzd, z, 5);
                if (z) {
                    zzO(zzb);
                }
                int length2 = this.zza.length;
                boolean[] zArr2 = new boolean[2];
                int i3 = 0;
                while (true) {
                    zzlr[] zzlrVarArr = this.zza;
                    int length3 = zzlrVarArr.length;
                    if (i3 >= 2) {
                        break;
                    }
                    zzlr zzlrVar = zzlrVarArr[i3];
                    boolean zzaf = zzaf(zzlrVar);
                    zArr2[i3] = zzaf;
                    zzvo zzvoVar = zzd2.zzc[i3];
                    if (zzaf) {
                        if (zzvoVar != zzlrVar.zzo()) {
                            zzA(zzlrVar);
                        } else if (zArr[i3]) {
                            zzlrVar.zzH(this.zzJ);
                        }
                    }
                    i3++;
                }
                zzC(zArr2, this.zzJ);
            } else {
                i = 2;
                this.zzq.zzm(zzd);
                if (zzd.zzd) {
                    zzd.zza(zzj, Math.max(zzd.zzf.zzb, this.zzJ - zzd.zze()), false);
                }
            }
            zzE(true);
            if (this.zzu.zze != 4) {
                zzI();
                zzaa();
                this.zzh.zzi(i);
                return;
            }
            return;
        }
    }

    private final void zzL() throws zzil {
        zzK();
        zzR(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzM(boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkl.zzM(boolean, boolean, boolean, boolean):void");
    }

    private final void zzN() {
        zzku zzd = this.zzq.zzd();
        boolean z = false;
        if (zzd != null && zzd.zzf.zzh && this.zzx) {
            z = true;
        }
        this.zzy = z;
    }

    private final void zzO(long j) throws zzil {
        long zze;
        zzku zzd = this.zzq.zzd();
        if (zzd == null) {
            zze = 1000000000000L;
        } else {
            zze = zzd.zze();
        }
        long j2 = j + zze;
        this.zzJ = j2;
        this.zzn.zzf(j2);
        zzlr[] zzlrVarArr = this.zza;
        int length = zzlrVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzlr zzlrVar = zzlrVarArr[i];
            if (zzaf(zzlrVar)) {
                zzlrVar.zzH(this.zzJ);
            }
        }
        for (zzku zzd2 = this.zzq.zzd(); zzd2 != null; zzd2 = zzd2.zzg()) {
            for (zzxk zzxkVar : zzd2.zzi().zzc) {
            }
        }
    }

    private final void zzP(zzcv zzcvVar, zzcv zzcvVar2) {
        if (zzcvVar.zzo() && zzcvVar2.zzo()) {
            return;
        }
        int size = this.zzo.size() - 1;
        if (size < 0) {
            Collections.sort(this.zzo);
        } else {
            Object obj = ((zzki) this.zzo.get(size)).zzb;
            int i = zzfk.zza;
            throw null;
        }
    }

    private final void zzQ(long j, long j2) {
        this.zzh.zzj(2, j + j2);
    }

    private final void zzR(boolean z) throws zzil {
        zztw zztwVar = this.zzq.zzd().zzf.zza;
        long zzw = zzw(zztwVar, this.zzu.zzr, true, false);
        if (zzw != this.zzu.zzr) {
            zzlk zzlkVar = this.zzu;
            this.zzu = zzz(zztwVar, zzw, zzlkVar.zzc, zzlkVar.zzd, z, 5);
        }
    }

    private final void zzS(zzcg zzcgVar) {
        this.zzh.zzf(16);
        this.zzn.zzg(zzcgVar);
    }

    private final void zzT(boolean z, int i, boolean z2, int i2) throws zzil {
        this.zzv.zza(z2 ? 1 : 0);
        this.zzv.zzb(i2);
        this.zzu = this.zzu.zze(z, i);
        zzac(false, false);
        for (zzku zzd = this.zzq.zzd(); zzd != null; zzd = zzd.zzg()) {
            for (zzxk zzxkVar : zzd.zzi().zzc) {
            }
        }
        if (!zzai()) {
            zzX();
            zzaa();
            return;
        }
        int i3 = this.zzu.zze;
        if (i3 == 3) {
            zzV();
            this.zzh.zzi(2);
        } else if (i3 == 2) {
            this.zzh.zzi(2);
        }
    }

    private final void zzU(int i) {
        zzlk zzlkVar = this.zzu;
        if (zzlkVar.zze != i) {
            if (i != 2) {
                this.zzN = -9223372036854775807L;
            }
            this.zzu = zzlkVar.zzg(i);
        }
    }

    private final void zzV() throws zzil {
        zzac(false, false);
        this.zzn.zzh();
        zzlr[] zzlrVarArr = this.zza;
        int length = zzlrVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzlr zzlrVar = zzlrVarArr[i];
            if (zzaf(zzlrVar)) {
                zzlrVar.zzL();
            }
        }
    }

    private final void zzW(boolean z, boolean z2) {
        boolean z3;
        if (!z && this.zzE) {
            z3 = false;
        } else {
            z3 = true;
        }
        zzM(z3, false, true, false);
        this.zzv.zza(z2 ? 1 : 0);
        this.zzf.zzd();
        zzU(1);
    }

    private final void zzX() throws zzil {
        this.zzn.zzi();
        zzlr[] zzlrVarArr = this.zza;
        int length = zzlrVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzlr zzlrVar = zzlrVarArr[i];
            if (zzaf(zzlrVar)) {
                zzam(zzlrVar);
            }
        }
    }

    private final void zzY() {
        boolean z;
        zzku zzc = this.zzq.zzc();
        if (!this.zzB && (zzc == null || !zzc.zza.zzp())) {
            z = false;
        } else {
            z = true;
        }
        zzlk zzlkVar = this.zzu;
        if (z != zzlkVar.zzg) {
            this.zzu = new zzlk(zzlkVar.zza, zzlkVar.zzb, zzlkVar.zzc, zzlkVar.zzd, zzlkVar.zze, zzlkVar.zzf, z, zzlkVar.zzh, zzlkVar.zzi, zzlkVar.zzj, zzlkVar.zzk, zzlkVar.zzl, zzlkVar.zzm, zzlkVar.zzn, zzlkVar.zzp, zzlkVar.zzq, zzlkVar.zzr, zzlkVar.zzs, zzlkVar.zzo);
        }
    }

    private final void zzZ(zztw zztwVar, zzvx zzvxVar, zzxr zzxrVar) {
        zzcv zzcvVar = this.zzu.zza;
        zzxk[] zzxkVarArr = zzxrVar.zzc;
        this.zzf.zze(zzcvVar, zztwVar, this.zza, zzvxVar, zzxkVarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ab, code lost:            r7 = null;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzaa() throws com.google.android.gms.internal.ads.zzil {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkl.zzaa():void");
    }

    private final void zzab(zzcv zzcvVar, zztw zztwVar, zzcv zzcvVar2, zztw zztwVar2, long j, boolean z) throws zzil {
        Object obj;
        zzcg zzcgVar;
        if (!zzaj(zzcvVar, zztwVar)) {
            if (zztwVar.zzb()) {
                zzcgVar = zzcg.zza;
            } else {
                zzcgVar = this.zzu.zzn;
            }
            if (!this.zzn.zzc().equals(zzcgVar)) {
                zzS(zzcgVar);
                zzH(this.zzu.zzn, zzcgVar.zzc, false, false);
                return;
            }
            return;
        }
        zzcvVar.zze(zzcvVar.zzn(zztwVar.zza, this.zzl).zzd, this.zzk, 0L);
        zzig zzigVar = this.zzP;
        zzbf zzbfVar = this.zzk.zzl;
        int i = zzfk.zza;
        zzigVar.zzd(zzbfVar);
        if (j != -9223372036854775807L) {
            this.zzP.zze(zzs(zzcvVar, zztwVar.zza, j));
            return;
        }
        Object obj2 = this.zzk.zzc;
        if (!zzcvVar2.zzo()) {
            obj = zzcvVar2.zze(zzcvVar2.zzn(zztwVar2.zza, this.zzl).zzd, this.zzk, 0L).zzc;
        } else {
            obj = null;
        }
        if (zzfk.zzE(obj, obj2) && !z) {
            return;
        }
        this.zzP.zze(-9223372036854775807L);
    }

    private final void zzac(boolean z, boolean z2) {
        long elapsedRealtime;
        this.zzz = z;
        if (z2) {
            elapsedRealtime = -9223372036854775807L;
        } else {
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.zzA = elapsedRealtime;
    }

    private final synchronized void zzad(zzftm zzftmVar, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!Boolean.valueOf(((zzkc) zzftmVar).zza.zzw).booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean zzae() {
        zzku zzc = this.zzq.zzc();
        if (zzc == null || zzc.zzd() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    private static boolean zzaf(zzlr zzlrVar) {
        if (zzlrVar.zzbc() != 0) {
            return true;
        }
        return false;
    }

    private final boolean zzag() {
        zzku zzd = this.zzq.zzd();
        long j = zzd.zzf.zze;
        if (!zzd.zzd) {
            return false;
        }
        if (j != -9223372036854775807L && this.zzu.zzr >= j && zzai()) {
            return false;
        }
        return true;
    }

    private static boolean zzah(zzlk zzlkVar, zzcs zzcsVar) {
        zztw zztwVar = zzlkVar.zzb;
        zzcv zzcvVar = zzlkVar.zza;
        if (!zzcvVar.zzo() && !zzcvVar.zzn(zztwVar.zza, zzcsVar).zzg) {
            return false;
        }
        return true;
    }

    private final boolean zzai() {
        zzlk zzlkVar = this.zzu;
        if (zzlkVar.zzl && zzlkVar.zzm == 0) {
            return true;
        }
        return false;
    }

    private final boolean zzaj(zzcv zzcvVar, zztw zztwVar) {
        if (!zztwVar.zzb() && !zzcvVar.zzo()) {
            zzcvVar.zze(zzcvVar.zzn(zztwVar.zza, this.zzl).zzd, this.zzk, 0L);
            if (this.zzk.zzb()) {
                zzcu zzcuVar = this.zzk;
                if (zzcuVar.zzj && zzcuVar.zzg != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static zzam[] zzak(zzxk zzxkVar) {
        int i;
        if (zzxkVar != null) {
            i = zzxkVar.zzc();
        } else {
            i = 0;
        }
        zzam[] zzamVarArr = new zzam[i];
        for (int i2 = 0; i2 < i; i2++) {
            zzamVarArr[i2] = zzxkVar.zzd(i2);
        }
        return zzamVarArr;
    }

    private static final void zzal(zzln zzlnVar) throws zzil {
        zzlnVar.zzj();
        try {
            zzlnVar.zzc().zzt(zzlnVar.zza(), zzlnVar.zzg());
        } finally {
            zzlnVar.zzh(true);
        }
    }

    private static final void zzam(zzlr zzlrVar) {
        if (zzlrVar.zzbc() == 2) {
            zzlrVar.zzM();
        }
    }

    private static final void zzan(zzlr zzlrVar, long j) {
        zzlrVar.zzI();
        if (!(zzlrVar instanceof zzwb)) {
            return;
        }
        throw null;
    }

    public static Object zze(zzcu zzcuVar, zzcs zzcsVar, int i, boolean z, Object obj, zzcv zzcvVar, zzcv zzcvVar2) {
        int zza = zzcvVar.zza(obj);
        int zzb = zzcvVar.zzb();
        int i2 = 0;
        int i3 = zza;
        int i4 = -1;
        while (true) {
            if (i2 >= zzb || i4 != -1) {
                break;
            }
            i3 = zzcvVar.zzi(i3, zzcsVar, zzcuVar, i, z);
            if (i3 == -1) {
                i4 = -1;
                break;
            }
            i4 = zzcvVar2.zza(zzcvVar.zzf(i3));
            i2++;
        }
        if (i4 == -1) {
            return null;
        }
        return zzcvVar2.zzf(i4);
    }

    public static final /* synthetic */ void zzr(zzln zzlnVar) {
        try {
            zzal(zzlnVar);
        } catch (zzil e) {
            zzer.zzd("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private final long zzs(zzcv zzcvVar, Object obj, long j) {
        long elapsedRealtime;
        zzcvVar.zze(zzcvVar.zzn(obj, this.zzl).zzd, this.zzk, 0L);
        zzcu zzcuVar = this.zzk;
        if (zzcuVar.zzg != -9223372036854775807L && zzcuVar.zzb()) {
            zzcu zzcuVar2 = this.zzk;
            if (zzcuVar2.zzj) {
                long j2 = zzcuVar2.zzh;
                if (j2 == -9223372036854775807L) {
                    elapsedRealtime = System.currentTimeMillis();
                } else {
                    elapsedRealtime = j2 + SystemClock.elapsedRealtime();
                }
                return zzfk.zzq(elapsedRealtime - this.zzk.zzg) - j;
            }
        }
        return -9223372036854775807L;
    }

    private final long zzt() {
        return zzu(this.zzu.zzp);
    }

    private final long zzu(long j) {
        zzku zzc = this.zzq.zzc();
        if (zzc == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzJ - zzc.zze()));
    }

    private final long zzv(zztw zztwVar, long j, boolean z) throws zzil {
        boolean z2;
        zzkx zzkxVar = this.zzq;
        if (zzkxVar.zzd() != zzkxVar.zze()) {
            z2 = true;
        } else {
            z2 = false;
        }
        return zzw(zztwVar, j, z2, z);
    }

    private final long zzw(zztw zztwVar, long j, boolean z, boolean z2) throws zzil {
        zzX();
        zzac(false, true);
        if (z2 || this.zzu.zze == 3) {
            zzU(2);
        }
        zzku zzd = this.zzq.zzd();
        zzku zzkuVar = zzd;
        while (zzkuVar != null && !zztwVar.equals(zzkuVar.zzf.zza)) {
            zzkuVar = zzkuVar.zzg();
        }
        if (z || zzd != zzkuVar || (zzkuVar != null && zzkuVar.zze() + j < 0)) {
            zzlr[] zzlrVarArr = this.zza;
            int length = zzlrVarArr.length;
            for (int i = 0; i < 2; i++) {
                zzA(zzlrVarArr[i]);
            }
            if (zzkuVar != null) {
                while (this.zzq.zzd() != zzkuVar) {
                    this.zzq.zza();
                }
                this.zzq.zzm(zzkuVar);
                zzkuVar.zzp(1000000000000L);
                zzB();
            }
        }
        if (zzkuVar != null) {
            this.zzq.zzm(zzkuVar);
            if (!zzkuVar.zzd) {
                zzkuVar.zzf = zzkuVar.zzf.zzb(j);
            } else if (zzkuVar.zze) {
                j = zzkuVar.zza.zze(j);
                zzkuVar.zza.zzj(j - this.zzm, false);
            }
            zzO(j);
            zzI();
        } else {
            this.zzq.zzi();
            zzO(j);
        }
        zzE(false);
        this.zzh.zzi(2);
        return j;
    }

    private final Pair zzx(zzcv zzcvVar) {
        long j = 0;
        if (zzcvVar.zzo()) {
            return Pair.create(zzlk.zzj(), 0L);
        }
        Pair zzl = zzcvVar.zzl(this.zzk, this.zzl, zzcvVar.zzg(this.zzD), -9223372036854775807L);
        zztw zzh = this.zzq.zzh(zzcvVar, zzl.first, 0L);
        long longValue = ((Long) zzl.second).longValue();
        if (zzh.zzb()) {
            zzcvVar.zzn(zzh.zza, this.zzl);
            if (zzh.zzc == this.zzl.zze(zzh.zzb)) {
                this.zzl.zzj();
            }
        } else {
            j = longValue;
        }
        return Pair.create(zzh, Long.valueOf(j));
    }

    private static Pair zzy(zzcv zzcvVar, zzkk zzkkVar, boolean z, int i, boolean z2, zzcu zzcuVar, zzcs zzcsVar) {
        zzcv zzcvVar2;
        Pair zzl;
        zzcv zzcvVar3 = zzkkVar.zza;
        if (zzcvVar.zzo()) {
            return null;
        }
        if (true == zzcvVar3.zzo()) {
            zzcvVar2 = zzcvVar;
        } else {
            zzcvVar2 = zzcvVar3;
        }
        try {
            zzl = zzcvVar2.zzl(zzcuVar, zzcsVar, zzkkVar.zzb, zzkkVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzcvVar.equals(zzcvVar2)) {
            return zzl;
        }
        if (zzcvVar.zza(zzl.first) != -1) {
            if (zzcvVar2.zzn(zzl.first, zzcsVar).zzg && zzcvVar2.zze(zzcsVar.zzd, zzcuVar, 0L).zzp == zzcvVar2.zza(zzl.first)) {
                return zzcvVar.zzl(zzcuVar, zzcsVar, zzcvVar.zzn(zzl.first, zzcsVar).zzd, zzkkVar.zzc);
            }
            return zzl;
        }
        Object zze = zze(zzcuVar, zzcsVar, i, z2, zzl.first, zzcvVar2, zzcvVar);
        if (zze != null) {
            return zzcvVar.zzl(zzcuVar, zzcsVar, zzcvVar.zzn(zze, zzcsVar).zzd, -9223372036854775807L);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.internal.ads.zzlk zzz(com.google.android.gms.internal.ads.zztw r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkl.zzz(com.google.android.gms.internal.ads.zztw, long, long, long, boolean, int):com.google.android.gms.internal.ads.zzlk");
    }

    /* JADX WARN: Code restructure failed: missing block: B:529:0x0813, code lost:            if (zzag() != false) goto L416;     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x08b7, code lost:            if (r7 == false) goto L453;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0011. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:243:0x062f A[Catch: RuntimeException -> 0x0a4e, IOException -> 0x0a79, zzsy -> 0x0a81, zzgj -> 0x0a89, zzcc -> 0x0a91, zzqv -> 0x0aa8, zzil -> 0x0ab2, TryCatch #9 {zzcc -> 0x0a91, zzgj -> 0x0a89, zzil -> 0x0ab2, zzqv -> 0x0aa8, zzsy -> 0x0a81, IOException -> 0x0a79, RuntimeException -> 0x0a4e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x002e, B:12:0x0033, B:13:0x0038, B:16:0x003f, B:18:0x0043, B:20:0x0047, B:22:0x004d, B:24:0x0054, B:27:0x005b, B:29:0x0064, B:31:0x0072, B:33:0x007a, B:34:0x0085, B:35:0x0099, B:36:0x00b1, B:37:0x00c7, B:39:0x00d6, B:40:0x00da, B:41:0x00eb, B:43:0x00fa, B:44:0x0116, B:45:0x0129, B:46:0x0132, B:48:0x0144, B:49:0x0150, B:50:0x0160, B:52:0x016c, B:55:0x0177, B:56:0x017e, B:57:0x018b, B:60:0x0192, B:62:0x019a, B:64:0x019e, B:66:0x01a4, B:68:0x01ac, B:70:0x01b4, B:72:0x01b7, B:77:0x01bc, B:86:0x01c9, B:88:0x01ca, B:91:0x01d1, B:93:0x01df, B:94:0x01e2, B:96:0x01e7, B:98:0x01f7, B:99:0x01fa, B:100:0x01ff, B:101:0x0204, B:103:0x0210, B:104:0x021c, B:106:0x0228, B:108:0x0254, B:109:0x0274, B:110:0x0279, B:111:0x027d, B:113:0x0282, B:115:0x0293, B:117:0x029f, B:118:0x02a2, B:127:0x02ad, B:128:0x02ae, B:129:0x02b3, B:130:0x02bb, B:131:0x02cd, B:133:0x02f4, B:141:0x040b, B:142:0x03d8, B:168:0x03d4, B:183:0x041c, B:184:0x0429, B:198:0x0316, B:201:0x0329, B:203:0x0339, B:205:0x0350, B:207:0x035a, B:214:0x042a, B:216:0x043e, B:219:0x0448, B:221:0x0457, B:223:0x0463, B:225:0x0492, B:226:0x0497, B:227:0x049b, B:229:0x049f, B:230:0x04ac, B:233:0x0608, B:235:0x0610, B:237:0x0618, B:240:0x061d, B:241:0x0629, B:243:0x062f, B:245:0x0637, B:250:0x0647, B:252:0x064d, B:254:0x0667, B:256:0x066d, B:249:0x0672, B:263:0x0677, B:265:0x067b, B:267:0x0681, B:269:0x0685, B:271:0x068d, B:273:0x0693, B:275:0x069d, B:278:0x06a3, B:279:0x06a6, B:281:0x06af, B:283:0x06c1, B:285:0x06ca, B:287:0x06d2, B:290:0x06dc, B:291:0x0708, B:293:0x070e, B:295:0x0714, B:297:0x071b, B:310:0x04bb, B:312:0x04c1, B:315:0x04c7, B:318:0x04d2, B:320:0x04d7, B:323:0x04e5, B:326:0x04eb, B:328:0x04f3, B:332:0x04f6, B:334:0x04fe, B:336:0x050c, B:338:0x0548, B:340:0x0552, B:343:0x055d, B:345:0x0565, B:347:0x0568, B:350:0x056b, B:352:0x0571, B:354:0x0580, B:356:0x0586, B:358:0x0592, B:360:0x059c, B:362:0x05ad, B:366:0x05b3, B:365:0x05be, B:371:0x05c3, B:373:0x05ce, B:376:0x05d3, B:378:0x05d9, B:380:0x05e1, B:382:0x05e7, B:384:0x05ed, B:388:0x05fb, B:389:0x0602, B:391:0x0605, B:397:0x04a9, B:398:0x0727, B:402:0x0732, B:404:0x073c, B:405:0x0741, B:407:0x074f, B:408:0x0767, B:410:0x076d, B:412:0x0775, B:414:0x077c, B:417:0x0785, B:421:0x0794, B:426:0x07a1, B:428:0x07a7, B:436:0x07ba, B:439:0x07bf, B:447:0x07cb, B:449:0x07d1, B:453:0x07de, B:455:0x07e6, B:457:0x07ea, B:458:0x07f5, B:460:0x07fb, B:461:0x08ed, B:464:0x08f5, B:466:0x08fa, B:468:0x0902, B:470:0x0910, B:472:0x0917, B:476:0x091b, B:478:0x0921, B:480:0x092a, B:482:0x0930, B:484:0x093b, B:485:0x095f, B:487:0x0965, B:490:0x096e, B:492:0x0972, B:496:0x097b, B:498:0x0981, B:499:0x09e1, B:501:0x09e6, B:510:0x09f7, B:512:0x09fb, B:513:0x0a03, B:514:0x0a0a, B:518:0x0942, B:521:0x0950, B:522:0x0957, B:523:0x0958, B:524:0x0804, B:526:0x080b, B:528:0x080f, B:531:0x0895, B:533:0x08a1, B:536:0x081c, B:538:0x0820, B:540:0x0834, B:541:0x0842, B:543:0x084e, B:546:0x0857, B:548:0x0861, B:553:0x086c, B:559:0x08a5, B:561:0x08ac, B:563:0x08b0, B:566:0x08b9, B:568:0x08c9, B:570:0x08d1, B:572:0x08db, B:574:0x08e0, B:576:0x08e5, B:577:0x08ea, B:579:0x07c4, B:580:0x0a0f, B:583:0x0a16, B:585:0x0a1e, B:588:0x0a3c), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0675 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06a3 A[Catch: RuntimeException -> 0x0a4e, IOException -> 0x0a79, zzsy -> 0x0a81, zzgj -> 0x0a89, zzcc -> 0x0a91, zzqv -> 0x0aa8, zzil -> 0x0ab2, TryCatch #9 {zzcc -> 0x0a91, zzgj -> 0x0a89, zzil -> 0x0ab2, zzqv -> 0x0aa8, zzsy -> 0x0a81, IOException -> 0x0a79, RuntimeException -> 0x0a4e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x002e, B:12:0x0033, B:13:0x0038, B:16:0x003f, B:18:0x0043, B:20:0x0047, B:22:0x004d, B:24:0x0054, B:27:0x005b, B:29:0x0064, B:31:0x0072, B:33:0x007a, B:34:0x0085, B:35:0x0099, B:36:0x00b1, B:37:0x00c7, B:39:0x00d6, B:40:0x00da, B:41:0x00eb, B:43:0x00fa, B:44:0x0116, B:45:0x0129, B:46:0x0132, B:48:0x0144, B:49:0x0150, B:50:0x0160, B:52:0x016c, B:55:0x0177, B:56:0x017e, B:57:0x018b, B:60:0x0192, B:62:0x019a, B:64:0x019e, B:66:0x01a4, B:68:0x01ac, B:70:0x01b4, B:72:0x01b7, B:77:0x01bc, B:86:0x01c9, B:88:0x01ca, B:91:0x01d1, B:93:0x01df, B:94:0x01e2, B:96:0x01e7, B:98:0x01f7, B:99:0x01fa, B:100:0x01ff, B:101:0x0204, B:103:0x0210, B:104:0x021c, B:106:0x0228, B:108:0x0254, B:109:0x0274, B:110:0x0279, B:111:0x027d, B:113:0x0282, B:115:0x0293, B:117:0x029f, B:118:0x02a2, B:127:0x02ad, B:128:0x02ae, B:129:0x02b3, B:130:0x02bb, B:131:0x02cd, B:133:0x02f4, B:141:0x040b, B:142:0x03d8, B:168:0x03d4, B:183:0x041c, B:184:0x0429, B:198:0x0316, B:201:0x0329, B:203:0x0339, B:205:0x0350, B:207:0x035a, B:214:0x042a, B:216:0x043e, B:219:0x0448, B:221:0x0457, B:223:0x0463, B:225:0x0492, B:226:0x0497, B:227:0x049b, B:229:0x049f, B:230:0x04ac, B:233:0x0608, B:235:0x0610, B:237:0x0618, B:240:0x061d, B:241:0x0629, B:243:0x062f, B:245:0x0637, B:250:0x0647, B:252:0x064d, B:254:0x0667, B:256:0x066d, B:249:0x0672, B:263:0x0677, B:265:0x067b, B:267:0x0681, B:269:0x0685, B:271:0x068d, B:273:0x0693, B:275:0x069d, B:278:0x06a3, B:279:0x06a6, B:281:0x06af, B:283:0x06c1, B:285:0x06ca, B:287:0x06d2, B:290:0x06dc, B:291:0x0708, B:293:0x070e, B:295:0x0714, B:297:0x071b, B:310:0x04bb, B:312:0x04c1, B:315:0x04c7, B:318:0x04d2, B:320:0x04d7, B:323:0x04e5, B:326:0x04eb, B:328:0x04f3, B:332:0x04f6, B:334:0x04fe, B:336:0x050c, B:338:0x0548, B:340:0x0552, B:343:0x055d, B:345:0x0565, B:347:0x0568, B:350:0x056b, B:352:0x0571, B:354:0x0580, B:356:0x0586, B:358:0x0592, B:360:0x059c, B:362:0x05ad, B:366:0x05b3, B:365:0x05be, B:371:0x05c3, B:373:0x05ce, B:376:0x05d3, B:378:0x05d9, B:380:0x05e1, B:382:0x05e7, B:384:0x05ed, B:388:0x05fb, B:389:0x0602, B:391:0x0605, B:397:0x04a9, B:398:0x0727, B:402:0x0732, B:404:0x073c, B:405:0x0741, B:407:0x074f, B:408:0x0767, B:410:0x076d, B:412:0x0775, B:414:0x077c, B:417:0x0785, B:421:0x0794, B:426:0x07a1, B:428:0x07a7, B:436:0x07ba, B:439:0x07bf, B:447:0x07cb, B:449:0x07d1, B:453:0x07de, B:455:0x07e6, B:457:0x07ea, B:458:0x07f5, B:460:0x07fb, B:461:0x08ed, B:464:0x08f5, B:466:0x08fa, B:468:0x0902, B:470:0x0910, B:472:0x0917, B:476:0x091b, B:478:0x0921, B:480:0x092a, B:482:0x0930, B:484:0x093b, B:485:0x095f, B:487:0x0965, B:490:0x096e, B:492:0x0972, B:496:0x097b, B:498:0x0981, B:499:0x09e1, B:501:0x09e6, B:510:0x09f7, B:512:0x09fb, B:513:0x0a03, B:514:0x0a0a, B:518:0x0942, B:521:0x0950, B:522:0x0957, B:523:0x0958, B:524:0x0804, B:526:0x080b, B:528:0x080f, B:531:0x0895, B:533:0x08a1, B:536:0x081c, B:538:0x0820, B:540:0x0834, B:541:0x0842, B:543:0x084e, B:546:0x0857, B:548:0x0861, B:553:0x086c, B:559:0x08a5, B:561:0x08ac, B:563:0x08b0, B:566:0x08b9, B:568:0x08c9, B:570:0x08d1, B:572:0x08db, B:574:0x08e0, B:576:0x08e5, B:577:0x08ea, B:579:0x07c4, B:580:0x0a0f, B:583:0x0a16, B:585:0x0a1e, B:588:0x0a3c), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06c1 A[Catch: RuntimeException -> 0x0a4e, IOException -> 0x0a79, zzsy -> 0x0a81, zzgj -> 0x0a89, zzcc -> 0x0a91, zzqv -> 0x0aa8, zzil -> 0x0ab2, TryCatch #9 {zzcc -> 0x0a91, zzgj -> 0x0a89, zzil -> 0x0ab2, zzqv -> 0x0aa8, zzsy -> 0x0a81, IOException -> 0x0a79, RuntimeException -> 0x0a4e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x002e, B:12:0x0033, B:13:0x0038, B:16:0x003f, B:18:0x0043, B:20:0x0047, B:22:0x004d, B:24:0x0054, B:27:0x005b, B:29:0x0064, B:31:0x0072, B:33:0x007a, B:34:0x0085, B:35:0x0099, B:36:0x00b1, B:37:0x00c7, B:39:0x00d6, B:40:0x00da, B:41:0x00eb, B:43:0x00fa, B:44:0x0116, B:45:0x0129, B:46:0x0132, B:48:0x0144, B:49:0x0150, B:50:0x0160, B:52:0x016c, B:55:0x0177, B:56:0x017e, B:57:0x018b, B:60:0x0192, B:62:0x019a, B:64:0x019e, B:66:0x01a4, B:68:0x01ac, B:70:0x01b4, B:72:0x01b7, B:77:0x01bc, B:86:0x01c9, B:88:0x01ca, B:91:0x01d1, B:93:0x01df, B:94:0x01e2, B:96:0x01e7, B:98:0x01f7, B:99:0x01fa, B:100:0x01ff, B:101:0x0204, B:103:0x0210, B:104:0x021c, B:106:0x0228, B:108:0x0254, B:109:0x0274, B:110:0x0279, B:111:0x027d, B:113:0x0282, B:115:0x0293, B:117:0x029f, B:118:0x02a2, B:127:0x02ad, B:128:0x02ae, B:129:0x02b3, B:130:0x02bb, B:131:0x02cd, B:133:0x02f4, B:141:0x040b, B:142:0x03d8, B:168:0x03d4, B:183:0x041c, B:184:0x0429, B:198:0x0316, B:201:0x0329, B:203:0x0339, B:205:0x0350, B:207:0x035a, B:214:0x042a, B:216:0x043e, B:219:0x0448, B:221:0x0457, B:223:0x0463, B:225:0x0492, B:226:0x0497, B:227:0x049b, B:229:0x049f, B:230:0x04ac, B:233:0x0608, B:235:0x0610, B:237:0x0618, B:240:0x061d, B:241:0x0629, B:243:0x062f, B:245:0x0637, B:250:0x0647, B:252:0x064d, B:254:0x0667, B:256:0x066d, B:249:0x0672, B:263:0x0677, B:265:0x067b, B:267:0x0681, B:269:0x0685, B:271:0x068d, B:273:0x0693, B:275:0x069d, B:278:0x06a3, B:279:0x06a6, B:281:0x06af, B:283:0x06c1, B:285:0x06ca, B:287:0x06d2, B:290:0x06dc, B:291:0x0708, B:293:0x070e, B:295:0x0714, B:297:0x071b, B:310:0x04bb, B:312:0x04c1, B:315:0x04c7, B:318:0x04d2, B:320:0x04d7, B:323:0x04e5, B:326:0x04eb, B:328:0x04f3, B:332:0x04f6, B:334:0x04fe, B:336:0x050c, B:338:0x0548, B:340:0x0552, B:343:0x055d, B:345:0x0565, B:347:0x0568, B:350:0x056b, B:352:0x0571, B:354:0x0580, B:356:0x0586, B:358:0x0592, B:360:0x059c, B:362:0x05ad, B:366:0x05b3, B:365:0x05be, B:371:0x05c3, B:373:0x05ce, B:376:0x05d3, B:378:0x05d9, B:380:0x05e1, B:382:0x05e7, B:384:0x05ed, B:388:0x05fb, B:389:0x0602, B:391:0x0605, B:397:0x04a9, B:398:0x0727, B:402:0x0732, B:404:0x073c, B:405:0x0741, B:407:0x074f, B:408:0x0767, B:410:0x076d, B:412:0x0775, B:414:0x077c, B:417:0x0785, B:421:0x0794, B:426:0x07a1, B:428:0x07a7, B:436:0x07ba, B:439:0x07bf, B:447:0x07cb, B:449:0x07d1, B:453:0x07de, B:455:0x07e6, B:457:0x07ea, B:458:0x07f5, B:460:0x07fb, B:461:0x08ed, B:464:0x08f5, B:466:0x08fa, B:468:0x0902, B:470:0x0910, B:472:0x0917, B:476:0x091b, B:478:0x0921, B:480:0x092a, B:482:0x0930, B:484:0x093b, B:485:0x095f, B:487:0x0965, B:490:0x096e, B:492:0x0972, B:496:0x097b, B:498:0x0981, B:499:0x09e1, B:501:0x09e6, B:510:0x09f7, B:512:0x09fb, B:513:0x0a03, B:514:0x0a0a, B:518:0x0942, B:521:0x0950, B:522:0x0957, B:523:0x0958, B:524:0x0804, B:526:0x080b, B:528:0x080f, B:531:0x0895, B:533:0x08a1, B:536:0x081c, B:538:0x0820, B:540:0x0834, B:541:0x0842, B:543:0x084e, B:546:0x0857, B:548:0x0861, B:553:0x086c, B:559:0x08a5, B:561:0x08ac, B:563:0x08b0, B:566:0x08b9, B:568:0x08c9, B:570:0x08d1, B:572:0x08db, B:574:0x08e0, B:576:0x08e5, B:577:0x08ea, B:579:0x07c4, B:580:0x0a0f, B:583:0x0a16, B:585:0x0a1e, B:588:0x0a3c), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x070e A[Catch: RuntimeException -> 0x0a4e, IOException -> 0x0a79, zzsy -> 0x0a81, zzgj -> 0x0a89, zzcc -> 0x0a91, zzqv -> 0x0aa8, zzil -> 0x0ab2, TryCatch #9 {zzcc -> 0x0a91, zzgj -> 0x0a89, zzil -> 0x0ab2, zzqv -> 0x0aa8, zzsy -> 0x0a81, IOException -> 0x0a79, RuntimeException -> 0x0a4e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x002e, B:12:0x0033, B:13:0x0038, B:16:0x003f, B:18:0x0043, B:20:0x0047, B:22:0x004d, B:24:0x0054, B:27:0x005b, B:29:0x0064, B:31:0x0072, B:33:0x007a, B:34:0x0085, B:35:0x0099, B:36:0x00b1, B:37:0x00c7, B:39:0x00d6, B:40:0x00da, B:41:0x00eb, B:43:0x00fa, B:44:0x0116, B:45:0x0129, B:46:0x0132, B:48:0x0144, B:49:0x0150, B:50:0x0160, B:52:0x016c, B:55:0x0177, B:56:0x017e, B:57:0x018b, B:60:0x0192, B:62:0x019a, B:64:0x019e, B:66:0x01a4, B:68:0x01ac, B:70:0x01b4, B:72:0x01b7, B:77:0x01bc, B:86:0x01c9, B:88:0x01ca, B:91:0x01d1, B:93:0x01df, B:94:0x01e2, B:96:0x01e7, B:98:0x01f7, B:99:0x01fa, B:100:0x01ff, B:101:0x0204, B:103:0x0210, B:104:0x021c, B:106:0x0228, B:108:0x0254, B:109:0x0274, B:110:0x0279, B:111:0x027d, B:113:0x0282, B:115:0x0293, B:117:0x029f, B:118:0x02a2, B:127:0x02ad, B:128:0x02ae, B:129:0x02b3, B:130:0x02bb, B:131:0x02cd, B:133:0x02f4, B:141:0x040b, B:142:0x03d8, B:168:0x03d4, B:183:0x041c, B:184:0x0429, B:198:0x0316, B:201:0x0329, B:203:0x0339, B:205:0x0350, B:207:0x035a, B:214:0x042a, B:216:0x043e, B:219:0x0448, B:221:0x0457, B:223:0x0463, B:225:0x0492, B:226:0x0497, B:227:0x049b, B:229:0x049f, B:230:0x04ac, B:233:0x0608, B:235:0x0610, B:237:0x0618, B:240:0x061d, B:241:0x0629, B:243:0x062f, B:245:0x0637, B:250:0x0647, B:252:0x064d, B:254:0x0667, B:256:0x066d, B:249:0x0672, B:263:0x0677, B:265:0x067b, B:267:0x0681, B:269:0x0685, B:271:0x068d, B:273:0x0693, B:275:0x069d, B:278:0x06a3, B:279:0x06a6, B:281:0x06af, B:283:0x06c1, B:285:0x06ca, B:287:0x06d2, B:290:0x06dc, B:291:0x0708, B:293:0x070e, B:295:0x0714, B:297:0x071b, B:310:0x04bb, B:312:0x04c1, B:315:0x04c7, B:318:0x04d2, B:320:0x04d7, B:323:0x04e5, B:326:0x04eb, B:328:0x04f3, B:332:0x04f6, B:334:0x04fe, B:336:0x050c, B:338:0x0548, B:340:0x0552, B:343:0x055d, B:345:0x0565, B:347:0x0568, B:350:0x056b, B:352:0x0571, B:354:0x0580, B:356:0x0586, B:358:0x0592, B:360:0x059c, B:362:0x05ad, B:366:0x05b3, B:365:0x05be, B:371:0x05c3, B:373:0x05ce, B:376:0x05d3, B:378:0x05d9, B:380:0x05e1, B:382:0x05e7, B:384:0x05ed, B:388:0x05fb, B:389:0x0602, B:391:0x0605, B:397:0x04a9, B:398:0x0727, B:402:0x0732, B:404:0x073c, B:405:0x0741, B:407:0x074f, B:408:0x0767, B:410:0x076d, B:412:0x0775, B:414:0x077c, B:417:0x0785, B:421:0x0794, B:426:0x07a1, B:428:0x07a7, B:436:0x07ba, B:439:0x07bf, B:447:0x07cb, B:449:0x07d1, B:453:0x07de, B:455:0x07e6, B:457:0x07ea, B:458:0x07f5, B:460:0x07fb, B:461:0x08ed, B:464:0x08f5, B:466:0x08fa, B:468:0x0902, B:470:0x0910, B:472:0x0917, B:476:0x091b, B:478:0x0921, B:480:0x092a, B:482:0x0930, B:484:0x093b, B:485:0x095f, B:487:0x0965, B:490:0x096e, B:492:0x0972, B:496:0x097b, B:498:0x0981, B:499:0x09e1, B:501:0x09e6, B:510:0x09f7, B:512:0x09fb, B:513:0x0a03, B:514:0x0a0a, B:518:0x0942, B:521:0x0950, B:522:0x0957, B:523:0x0958, B:524:0x0804, B:526:0x080b, B:528:0x080f, B:531:0x0895, B:533:0x08a1, B:536:0x081c, B:538:0x0820, B:540:0x0834, B:541:0x0842, B:543:0x084e, B:546:0x0857, B:548:0x0861, B:553:0x086c, B:559:0x08a5, B:561:0x08ac, B:563:0x08b0, B:566:0x08b9, B:568:0x08c9, B:570:0x08d1, B:572:0x08db, B:574:0x08e0, B:576:0x08e5, B:577:0x08ea, B:579:0x07c4, B:580:0x0a0f, B:583:0x0a16, B:585:0x0a1e, B:588:0x0a3c), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x07ba A[Catch: RuntimeException -> 0x0a4e, IOException -> 0x0a79, zzsy -> 0x0a81, zzgj -> 0x0a89, zzcc -> 0x0a91, zzqv -> 0x0aa8, zzil -> 0x0ab2, TryCatch #9 {zzcc -> 0x0a91, zzgj -> 0x0a89, zzil -> 0x0ab2, zzqv -> 0x0aa8, zzsy -> 0x0a81, IOException -> 0x0a79, RuntimeException -> 0x0a4e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x002e, B:12:0x0033, B:13:0x0038, B:16:0x003f, B:18:0x0043, B:20:0x0047, B:22:0x004d, B:24:0x0054, B:27:0x005b, B:29:0x0064, B:31:0x0072, B:33:0x007a, B:34:0x0085, B:35:0x0099, B:36:0x00b1, B:37:0x00c7, B:39:0x00d6, B:40:0x00da, B:41:0x00eb, B:43:0x00fa, B:44:0x0116, B:45:0x0129, B:46:0x0132, B:48:0x0144, B:49:0x0150, B:50:0x0160, B:52:0x016c, B:55:0x0177, B:56:0x017e, B:57:0x018b, B:60:0x0192, B:62:0x019a, B:64:0x019e, B:66:0x01a4, B:68:0x01ac, B:70:0x01b4, B:72:0x01b7, B:77:0x01bc, B:86:0x01c9, B:88:0x01ca, B:91:0x01d1, B:93:0x01df, B:94:0x01e2, B:96:0x01e7, B:98:0x01f7, B:99:0x01fa, B:100:0x01ff, B:101:0x0204, B:103:0x0210, B:104:0x021c, B:106:0x0228, B:108:0x0254, B:109:0x0274, B:110:0x0279, B:111:0x027d, B:113:0x0282, B:115:0x0293, B:117:0x029f, B:118:0x02a2, B:127:0x02ad, B:128:0x02ae, B:129:0x02b3, B:130:0x02bb, B:131:0x02cd, B:133:0x02f4, B:141:0x040b, B:142:0x03d8, B:168:0x03d4, B:183:0x041c, B:184:0x0429, B:198:0x0316, B:201:0x0329, B:203:0x0339, B:205:0x0350, B:207:0x035a, B:214:0x042a, B:216:0x043e, B:219:0x0448, B:221:0x0457, B:223:0x0463, B:225:0x0492, B:226:0x0497, B:227:0x049b, B:229:0x049f, B:230:0x04ac, B:233:0x0608, B:235:0x0610, B:237:0x0618, B:240:0x061d, B:241:0x0629, B:243:0x062f, B:245:0x0637, B:250:0x0647, B:252:0x064d, B:254:0x0667, B:256:0x066d, B:249:0x0672, B:263:0x0677, B:265:0x067b, B:267:0x0681, B:269:0x0685, B:271:0x068d, B:273:0x0693, B:275:0x069d, B:278:0x06a3, B:279:0x06a6, B:281:0x06af, B:283:0x06c1, B:285:0x06ca, B:287:0x06d2, B:290:0x06dc, B:291:0x0708, B:293:0x070e, B:295:0x0714, B:297:0x071b, B:310:0x04bb, B:312:0x04c1, B:315:0x04c7, B:318:0x04d2, B:320:0x04d7, B:323:0x04e5, B:326:0x04eb, B:328:0x04f3, B:332:0x04f6, B:334:0x04fe, B:336:0x050c, B:338:0x0548, B:340:0x0552, B:343:0x055d, B:345:0x0565, B:347:0x0568, B:350:0x056b, B:352:0x0571, B:354:0x0580, B:356:0x0586, B:358:0x0592, B:360:0x059c, B:362:0x05ad, B:366:0x05b3, B:365:0x05be, B:371:0x05c3, B:373:0x05ce, B:376:0x05d3, B:378:0x05d9, B:380:0x05e1, B:382:0x05e7, B:384:0x05ed, B:388:0x05fb, B:389:0x0602, B:391:0x0605, B:397:0x04a9, B:398:0x0727, B:402:0x0732, B:404:0x073c, B:405:0x0741, B:407:0x074f, B:408:0x0767, B:410:0x076d, B:412:0x0775, B:414:0x077c, B:417:0x0785, B:421:0x0794, B:426:0x07a1, B:428:0x07a7, B:436:0x07ba, B:439:0x07bf, B:447:0x07cb, B:449:0x07d1, B:453:0x07de, B:455:0x07e6, B:457:0x07ea, B:458:0x07f5, B:460:0x07fb, B:461:0x08ed, B:464:0x08f5, B:466:0x08fa, B:468:0x0902, B:470:0x0910, B:472:0x0917, B:476:0x091b, B:478:0x0921, B:480:0x092a, B:482:0x0930, B:484:0x093b, B:485:0x095f, B:487:0x0965, B:490:0x096e, B:492:0x0972, B:496:0x097b, B:498:0x0981, B:499:0x09e1, B:501:0x09e6, B:510:0x09f7, B:512:0x09fb, B:513:0x0a03, B:514:0x0a0a, B:518:0x0942, B:521:0x0950, B:522:0x0957, B:523:0x0958, B:524:0x0804, B:526:0x080b, B:528:0x080f, B:531:0x0895, B:533:0x08a1, B:536:0x081c, B:538:0x0820, B:540:0x0834, B:541:0x0842, B:543:0x084e, B:546:0x0857, B:548:0x0861, B:553:0x086c, B:559:0x08a5, B:561:0x08ac, B:563:0x08b0, B:566:0x08b9, B:568:0x08c9, B:570:0x08d1, B:572:0x08db, B:574:0x08e0, B:576:0x08e5, B:577:0x08ea, B:579:0x07c4, B:580:0x0a0f, B:583:0x0a16, B:585:0x0a1e, B:588:0x0a3c), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0965 A[Catch: RuntimeException -> 0x0a4e, IOException -> 0x0a79, zzsy -> 0x0a81, zzgj -> 0x0a89, zzcc -> 0x0a91, zzqv -> 0x0aa8, zzil -> 0x0ab2, TryCatch #9 {zzcc -> 0x0a91, zzgj -> 0x0a89, zzil -> 0x0ab2, zzqv -> 0x0aa8, zzsy -> 0x0a81, IOException -> 0x0a79, RuntimeException -> 0x0a4e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x002e, B:12:0x0033, B:13:0x0038, B:16:0x003f, B:18:0x0043, B:20:0x0047, B:22:0x004d, B:24:0x0054, B:27:0x005b, B:29:0x0064, B:31:0x0072, B:33:0x007a, B:34:0x0085, B:35:0x0099, B:36:0x00b1, B:37:0x00c7, B:39:0x00d6, B:40:0x00da, B:41:0x00eb, B:43:0x00fa, B:44:0x0116, B:45:0x0129, B:46:0x0132, B:48:0x0144, B:49:0x0150, B:50:0x0160, B:52:0x016c, B:55:0x0177, B:56:0x017e, B:57:0x018b, B:60:0x0192, B:62:0x019a, B:64:0x019e, B:66:0x01a4, B:68:0x01ac, B:70:0x01b4, B:72:0x01b7, B:77:0x01bc, B:86:0x01c9, B:88:0x01ca, B:91:0x01d1, B:93:0x01df, B:94:0x01e2, B:96:0x01e7, B:98:0x01f7, B:99:0x01fa, B:100:0x01ff, B:101:0x0204, B:103:0x0210, B:104:0x021c, B:106:0x0228, B:108:0x0254, B:109:0x0274, B:110:0x0279, B:111:0x027d, B:113:0x0282, B:115:0x0293, B:117:0x029f, B:118:0x02a2, B:127:0x02ad, B:128:0x02ae, B:129:0x02b3, B:130:0x02bb, B:131:0x02cd, B:133:0x02f4, B:141:0x040b, B:142:0x03d8, B:168:0x03d4, B:183:0x041c, B:184:0x0429, B:198:0x0316, B:201:0x0329, B:203:0x0339, B:205:0x0350, B:207:0x035a, B:214:0x042a, B:216:0x043e, B:219:0x0448, B:221:0x0457, B:223:0x0463, B:225:0x0492, B:226:0x0497, B:227:0x049b, B:229:0x049f, B:230:0x04ac, B:233:0x0608, B:235:0x0610, B:237:0x0618, B:240:0x061d, B:241:0x0629, B:243:0x062f, B:245:0x0637, B:250:0x0647, B:252:0x064d, B:254:0x0667, B:256:0x066d, B:249:0x0672, B:263:0x0677, B:265:0x067b, B:267:0x0681, B:269:0x0685, B:271:0x068d, B:273:0x0693, B:275:0x069d, B:278:0x06a3, B:279:0x06a6, B:281:0x06af, B:283:0x06c1, B:285:0x06ca, B:287:0x06d2, B:290:0x06dc, B:291:0x0708, B:293:0x070e, B:295:0x0714, B:297:0x071b, B:310:0x04bb, B:312:0x04c1, B:315:0x04c7, B:318:0x04d2, B:320:0x04d7, B:323:0x04e5, B:326:0x04eb, B:328:0x04f3, B:332:0x04f6, B:334:0x04fe, B:336:0x050c, B:338:0x0548, B:340:0x0552, B:343:0x055d, B:345:0x0565, B:347:0x0568, B:350:0x056b, B:352:0x0571, B:354:0x0580, B:356:0x0586, B:358:0x0592, B:360:0x059c, B:362:0x05ad, B:366:0x05b3, B:365:0x05be, B:371:0x05c3, B:373:0x05ce, B:376:0x05d3, B:378:0x05d9, B:380:0x05e1, B:382:0x05e7, B:384:0x05ed, B:388:0x05fb, B:389:0x0602, B:391:0x0605, B:397:0x04a9, B:398:0x0727, B:402:0x0732, B:404:0x073c, B:405:0x0741, B:407:0x074f, B:408:0x0767, B:410:0x076d, B:412:0x0775, B:414:0x077c, B:417:0x0785, B:421:0x0794, B:426:0x07a1, B:428:0x07a7, B:436:0x07ba, B:439:0x07bf, B:447:0x07cb, B:449:0x07d1, B:453:0x07de, B:455:0x07e6, B:457:0x07ea, B:458:0x07f5, B:460:0x07fb, B:461:0x08ed, B:464:0x08f5, B:466:0x08fa, B:468:0x0902, B:470:0x0910, B:472:0x0917, B:476:0x091b, B:478:0x0921, B:480:0x092a, B:482:0x0930, B:484:0x093b, B:485:0x095f, B:487:0x0965, B:490:0x096e, B:492:0x0972, B:496:0x097b, B:498:0x0981, B:499:0x09e1, B:501:0x09e6, B:510:0x09f7, B:512:0x09fb, B:513:0x0a03, B:514:0x0a0a, B:518:0x0942, B:521:0x0950, B:522:0x0957, B:523:0x0958, B:524:0x0804, B:526:0x080b, B:528:0x080f, B:531:0x0895, B:533:0x08a1, B:536:0x081c, B:538:0x0820, B:540:0x0834, B:541:0x0842, B:543:0x084e, B:546:0x0857, B:548:0x0861, B:553:0x086c, B:559:0x08a5, B:561:0x08ac, B:563:0x08b0, B:566:0x08b9, B:568:0x08c9, B:570:0x08d1, B:572:0x08db, B:574:0x08e0, B:576:0x08e5, B:577:0x08ea, B:579:0x07c4, B:580:0x0a0f, B:583:0x0a16, B:585:0x0a1e, B:588:0x0a3c), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0972 A[Catch: RuntimeException -> 0x0a4e, IOException -> 0x0a79, zzsy -> 0x0a81, zzgj -> 0x0a89, zzcc -> 0x0a91, zzqv -> 0x0aa8, zzil -> 0x0ab2, TryCatch #9 {zzcc -> 0x0a91, zzgj -> 0x0a89, zzil -> 0x0ab2, zzqv -> 0x0aa8, zzsy -> 0x0a81, IOException -> 0x0a79, RuntimeException -> 0x0a4e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x002e, B:12:0x0033, B:13:0x0038, B:16:0x003f, B:18:0x0043, B:20:0x0047, B:22:0x004d, B:24:0x0054, B:27:0x005b, B:29:0x0064, B:31:0x0072, B:33:0x007a, B:34:0x0085, B:35:0x0099, B:36:0x00b1, B:37:0x00c7, B:39:0x00d6, B:40:0x00da, B:41:0x00eb, B:43:0x00fa, B:44:0x0116, B:45:0x0129, B:46:0x0132, B:48:0x0144, B:49:0x0150, B:50:0x0160, B:52:0x016c, B:55:0x0177, B:56:0x017e, B:57:0x018b, B:60:0x0192, B:62:0x019a, B:64:0x019e, B:66:0x01a4, B:68:0x01ac, B:70:0x01b4, B:72:0x01b7, B:77:0x01bc, B:86:0x01c9, B:88:0x01ca, B:91:0x01d1, B:93:0x01df, B:94:0x01e2, B:96:0x01e7, B:98:0x01f7, B:99:0x01fa, B:100:0x01ff, B:101:0x0204, B:103:0x0210, B:104:0x021c, B:106:0x0228, B:108:0x0254, B:109:0x0274, B:110:0x0279, B:111:0x027d, B:113:0x0282, B:115:0x0293, B:117:0x029f, B:118:0x02a2, B:127:0x02ad, B:128:0x02ae, B:129:0x02b3, B:130:0x02bb, B:131:0x02cd, B:133:0x02f4, B:141:0x040b, B:142:0x03d8, B:168:0x03d4, B:183:0x041c, B:184:0x0429, B:198:0x0316, B:201:0x0329, B:203:0x0339, B:205:0x0350, B:207:0x035a, B:214:0x042a, B:216:0x043e, B:219:0x0448, B:221:0x0457, B:223:0x0463, B:225:0x0492, B:226:0x0497, B:227:0x049b, B:229:0x049f, B:230:0x04ac, B:233:0x0608, B:235:0x0610, B:237:0x0618, B:240:0x061d, B:241:0x0629, B:243:0x062f, B:245:0x0637, B:250:0x0647, B:252:0x064d, B:254:0x0667, B:256:0x066d, B:249:0x0672, B:263:0x0677, B:265:0x067b, B:267:0x0681, B:269:0x0685, B:271:0x068d, B:273:0x0693, B:275:0x069d, B:278:0x06a3, B:279:0x06a6, B:281:0x06af, B:283:0x06c1, B:285:0x06ca, B:287:0x06d2, B:290:0x06dc, B:291:0x0708, B:293:0x070e, B:295:0x0714, B:297:0x071b, B:310:0x04bb, B:312:0x04c1, B:315:0x04c7, B:318:0x04d2, B:320:0x04d7, B:323:0x04e5, B:326:0x04eb, B:328:0x04f3, B:332:0x04f6, B:334:0x04fe, B:336:0x050c, B:338:0x0548, B:340:0x0552, B:343:0x055d, B:345:0x0565, B:347:0x0568, B:350:0x056b, B:352:0x0571, B:354:0x0580, B:356:0x0586, B:358:0x0592, B:360:0x059c, B:362:0x05ad, B:366:0x05b3, B:365:0x05be, B:371:0x05c3, B:373:0x05ce, B:376:0x05d3, B:378:0x05d9, B:380:0x05e1, B:382:0x05e7, B:384:0x05ed, B:388:0x05fb, B:389:0x0602, B:391:0x0605, B:397:0x04a9, B:398:0x0727, B:402:0x0732, B:404:0x073c, B:405:0x0741, B:407:0x074f, B:408:0x0767, B:410:0x076d, B:412:0x0775, B:414:0x077c, B:417:0x0785, B:421:0x0794, B:426:0x07a1, B:428:0x07a7, B:436:0x07ba, B:439:0x07bf, B:447:0x07cb, B:449:0x07d1, B:453:0x07de, B:455:0x07e6, B:457:0x07ea, B:458:0x07f5, B:460:0x07fb, B:461:0x08ed, B:464:0x08f5, B:466:0x08fa, B:468:0x0902, B:470:0x0910, B:472:0x0917, B:476:0x091b, B:478:0x0921, B:480:0x092a, B:482:0x0930, B:484:0x093b, B:485:0x095f, B:487:0x0965, B:490:0x096e, B:492:0x0972, B:496:0x097b, B:498:0x0981, B:499:0x09e1, B:501:0x09e6, B:510:0x09f7, B:512:0x09fb, B:513:0x0a03, B:514:0x0a0a, B:518:0x0942, B:521:0x0950, B:522:0x0957, B:523:0x0958, B:524:0x0804, B:526:0x080b, B:528:0x080f, B:531:0x0895, B:533:0x08a1, B:536:0x081c, B:538:0x0820, B:540:0x0834, B:541:0x0842, B:543:0x084e, B:546:0x0857, B:548:0x0861, B:553:0x086c, B:559:0x08a5, B:561:0x08ac, B:563:0x08b0, B:566:0x08b9, B:568:0x08c9, B:570:0x08d1, B:572:0x08db, B:574:0x08e0, B:576:0x08e5, B:577:0x08ea, B:579:0x07c4, B:580:0x0a0f, B:583:0x0a16, B:585:0x0a1e, B:588:0x0a3c), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0981 A[Catch: RuntimeException -> 0x0a4e, IOException -> 0x0a79, zzsy -> 0x0a81, zzgj -> 0x0a89, zzcc -> 0x0a91, zzqv -> 0x0aa8, zzil -> 0x0ab2, TryCatch #9 {zzcc -> 0x0a91, zzgj -> 0x0a89, zzil -> 0x0ab2, zzqv -> 0x0aa8, zzsy -> 0x0a81, IOException -> 0x0a79, RuntimeException -> 0x0a4e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x002e, B:12:0x0033, B:13:0x0038, B:16:0x003f, B:18:0x0043, B:20:0x0047, B:22:0x004d, B:24:0x0054, B:27:0x005b, B:29:0x0064, B:31:0x0072, B:33:0x007a, B:34:0x0085, B:35:0x0099, B:36:0x00b1, B:37:0x00c7, B:39:0x00d6, B:40:0x00da, B:41:0x00eb, B:43:0x00fa, B:44:0x0116, B:45:0x0129, B:46:0x0132, B:48:0x0144, B:49:0x0150, B:50:0x0160, B:52:0x016c, B:55:0x0177, B:56:0x017e, B:57:0x018b, B:60:0x0192, B:62:0x019a, B:64:0x019e, B:66:0x01a4, B:68:0x01ac, B:70:0x01b4, B:72:0x01b7, B:77:0x01bc, B:86:0x01c9, B:88:0x01ca, B:91:0x01d1, B:93:0x01df, B:94:0x01e2, B:96:0x01e7, B:98:0x01f7, B:99:0x01fa, B:100:0x01ff, B:101:0x0204, B:103:0x0210, B:104:0x021c, B:106:0x0228, B:108:0x0254, B:109:0x0274, B:110:0x0279, B:111:0x027d, B:113:0x0282, B:115:0x0293, B:117:0x029f, B:118:0x02a2, B:127:0x02ad, B:128:0x02ae, B:129:0x02b3, B:130:0x02bb, B:131:0x02cd, B:133:0x02f4, B:141:0x040b, B:142:0x03d8, B:168:0x03d4, B:183:0x041c, B:184:0x0429, B:198:0x0316, B:201:0x0329, B:203:0x0339, B:205:0x0350, B:207:0x035a, B:214:0x042a, B:216:0x043e, B:219:0x0448, B:221:0x0457, B:223:0x0463, B:225:0x0492, B:226:0x0497, B:227:0x049b, B:229:0x049f, B:230:0x04ac, B:233:0x0608, B:235:0x0610, B:237:0x0618, B:240:0x061d, B:241:0x0629, B:243:0x062f, B:245:0x0637, B:250:0x0647, B:252:0x064d, B:254:0x0667, B:256:0x066d, B:249:0x0672, B:263:0x0677, B:265:0x067b, B:267:0x0681, B:269:0x0685, B:271:0x068d, B:273:0x0693, B:275:0x069d, B:278:0x06a3, B:279:0x06a6, B:281:0x06af, B:283:0x06c1, B:285:0x06ca, B:287:0x06d2, B:290:0x06dc, B:291:0x0708, B:293:0x070e, B:295:0x0714, B:297:0x071b, B:310:0x04bb, B:312:0x04c1, B:315:0x04c7, B:318:0x04d2, B:320:0x04d7, B:323:0x04e5, B:326:0x04eb, B:328:0x04f3, B:332:0x04f6, B:334:0x04fe, B:336:0x050c, B:338:0x0548, B:340:0x0552, B:343:0x055d, B:345:0x0565, B:347:0x0568, B:350:0x056b, B:352:0x0571, B:354:0x0580, B:356:0x0586, B:358:0x0592, B:360:0x059c, B:362:0x05ad, B:366:0x05b3, B:365:0x05be, B:371:0x05c3, B:373:0x05ce, B:376:0x05d3, B:378:0x05d9, B:380:0x05e1, B:382:0x05e7, B:384:0x05ed, B:388:0x05fb, B:389:0x0602, B:391:0x0605, B:397:0x04a9, B:398:0x0727, B:402:0x0732, B:404:0x073c, B:405:0x0741, B:407:0x074f, B:408:0x0767, B:410:0x076d, B:412:0x0775, B:414:0x077c, B:417:0x0785, B:421:0x0794, B:426:0x07a1, B:428:0x07a7, B:436:0x07ba, B:439:0x07bf, B:447:0x07cb, B:449:0x07d1, B:453:0x07de, B:455:0x07e6, B:457:0x07ea, B:458:0x07f5, B:460:0x07fb, B:461:0x08ed, B:464:0x08f5, B:466:0x08fa, B:468:0x0902, B:470:0x0910, B:472:0x0917, B:476:0x091b, B:478:0x0921, B:480:0x092a, B:482:0x0930, B:484:0x093b, B:485:0x095f, B:487:0x0965, B:490:0x096e, B:492:0x0972, B:496:0x097b, B:498:0x0981, B:499:0x09e1, B:501:0x09e6, B:510:0x09f7, B:512:0x09fb, B:513:0x0a03, B:514:0x0a0a, B:518:0x0942, B:521:0x0950, B:522:0x0957, B:523:0x0958, B:524:0x0804, B:526:0x080b, B:528:0x080f, B:531:0x0895, B:533:0x08a1, B:536:0x081c, B:538:0x0820, B:540:0x0834, B:541:0x0842, B:543:0x084e, B:546:0x0857, B:548:0x0861, B:553:0x086c, B:559:0x08a5, B:561:0x08ac, B:563:0x08b0, B:566:0x08b9, B:568:0x08c9, B:570:0x08d1, B:572:0x08db, B:574:0x08e0, B:576:0x08e5, B:577:0x08ea, B:579:0x07c4, B:580:0x0a0f, B:583:0x0a16, B:585:0x0a1e, B:588:0x0a3c), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x09e6 A[Catch: RuntimeException -> 0x0a4e, IOException -> 0x0a79, zzsy -> 0x0a81, zzgj -> 0x0a89, zzcc -> 0x0a91, zzqv -> 0x0aa8, zzil -> 0x0ab2, TryCatch #9 {zzcc -> 0x0a91, zzgj -> 0x0a89, zzil -> 0x0ab2, zzqv -> 0x0aa8, zzsy -> 0x0a81, IOException -> 0x0a79, RuntimeException -> 0x0a4e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x002e, B:12:0x0033, B:13:0x0038, B:16:0x003f, B:18:0x0043, B:20:0x0047, B:22:0x004d, B:24:0x0054, B:27:0x005b, B:29:0x0064, B:31:0x0072, B:33:0x007a, B:34:0x0085, B:35:0x0099, B:36:0x00b1, B:37:0x00c7, B:39:0x00d6, B:40:0x00da, B:41:0x00eb, B:43:0x00fa, B:44:0x0116, B:45:0x0129, B:46:0x0132, B:48:0x0144, B:49:0x0150, B:50:0x0160, B:52:0x016c, B:55:0x0177, B:56:0x017e, B:57:0x018b, B:60:0x0192, B:62:0x019a, B:64:0x019e, B:66:0x01a4, B:68:0x01ac, B:70:0x01b4, B:72:0x01b7, B:77:0x01bc, B:86:0x01c9, B:88:0x01ca, B:91:0x01d1, B:93:0x01df, B:94:0x01e2, B:96:0x01e7, B:98:0x01f7, B:99:0x01fa, B:100:0x01ff, B:101:0x0204, B:103:0x0210, B:104:0x021c, B:106:0x0228, B:108:0x0254, B:109:0x0274, B:110:0x0279, B:111:0x027d, B:113:0x0282, B:115:0x0293, B:117:0x029f, B:118:0x02a2, B:127:0x02ad, B:128:0x02ae, B:129:0x02b3, B:130:0x02bb, B:131:0x02cd, B:133:0x02f4, B:141:0x040b, B:142:0x03d8, B:168:0x03d4, B:183:0x041c, B:184:0x0429, B:198:0x0316, B:201:0x0329, B:203:0x0339, B:205:0x0350, B:207:0x035a, B:214:0x042a, B:216:0x043e, B:219:0x0448, B:221:0x0457, B:223:0x0463, B:225:0x0492, B:226:0x0497, B:227:0x049b, B:229:0x049f, B:230:0x04ac, B:233:0x0608, B:235:0x0610, B:237:0x0618, B:240:0x061d, B:241:0x0629, B:243:0x062f, B:245:0x0637, B:250:0x0647, B:252:0x064d, B:254:0x0667, B:256:0x066d, B:249:0x0672, B:263:0x0677, B:265:0x067b, B:267:0x0681, B:269:0x0685, B:271:0x068d, B:273:0x0693, B:275:0x069d, B:278:0x06a3, B:279:0x06a6, B:281:0x06af, B:283:0x06c1, B:285:0x06ca, B:287:0x06d2, B:290:0x06dc, B:291:0x0708, B:293:0x070e, B:295:0x0714, B:297:0x071b, B:310:0x04bb, B:312:0x04c1, B:315:0x04c7, B:318:0x04d2, B:320:0x04d7, B:323:0x04e5, B:326:0x04eb, B:328:0x04f3, B:332:0x04f6, B:334:0x04fe, B:336:0x050c, B:338:0x0548, B:340:0x0552, B:343:0x055d, B:345:0x0565, B:347:0x0568, B:350:0x056b, B:352:0x0571, B:354:0x0580, B:356:0x0586, B:358:0x0592, B:360:0x059c, B:362:0x05ad, B:366:0x05b3, B:365:0x05be, B:371:0x05c3, B:373:0x05ce, B:376:0x05d3, B:378:0x05d9, B:380:0x05e1, B:382:0x05e7, B:384:0x05ed, B:388:0x05fb, B:389:0x0602, B:391:0x0605, B:397:0x04a9, B:398:0x0727, B:402:0x0732, B:404:0x073c, B:405:0x0741, B:407:0x074f, B:408:0x0767, B:410:0x076d, B:412:0x0775, B:414:0x077c, B:417:0x0785, B:421:0x0794, B:426:0x07a1, B:428:0x07a7, B:436:0x07ba, B:439:0x07bf, B:447:0x07cb, B:449:0x07d1, B:453:0x07de, B:455:0x07e6, B:457:0x07ea, B:458:0x07f5, B:460:0x07fb, B:461:0x08ed, B:464:0x08f5, B:466:0x08fa, B:468:0x0902, B:470:0x0910, B:472:0x0917, B:476:0x091b, B:478:0x0921, B:480:0x092a, B:482:0x0930, B:484:0x093b, B:485:0x095f, B:487:0x0965, B:490:0x096e, B:492:0x0972, B:496:0x097b, B:498:0x0981, B:499:0x09e1, B:501:0x09e6, B:510:0x09f7, B:512:0x09fb, B:513:0x0a03, B:514:0x0a0a, B:518:0x0942, B:521:0x0950, B:522:0x0957, B:523:0x0958, B:524:0x0804, B:526:0x080b, B:528:0x080f, B:531:0x0895, B:533:0x08a1, B:536:0x081c, B:538:0x0820, B:540:0x0834, B:541:0x0842, B:543:0x084e, B:546:0x0857, B:548:0x0861, B:553:0x086c, B:559:0x08a5, B:561:0x08ac, B:563:0x08b0, B:566:0x08b9, B:568:0x08c9, B:570:0x08d1, B:572:0x08db, B:574:0x08e0, B:576:0x08e5, B:577:0x08ea, B:579:0x07c4, B:580:0x0a0f, B:583:0x0a16, B:585:0x0a1e, B:588:0x0a3c), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:515:0x09db  */
    /* JADX WARN: Type inference failed for: r2v32, types: [com.google.android.gms.internal.ads.zzhk, com.google.android.gms.internal.ads.zzxy] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r54) {
        /*
            Method dump skipped, instructions count: 2970
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkl.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final void zza(zzcg zzcgVar) {
        this.zzh.zzc(16, zzcgVar).zza();
    }

    public final Looper zzb() {
        return this.zzj;
    }

    public final /* synthetic */ Boolean zzd() {
        return Boolean.valueOf(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final /* bridge */ /* synthetic */ void zzg(zzvq zzvqVar) {
        this.zzh.zzc(9, (zztu) zzvqVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final void zzh() {
        this.zzh.zzi(22);
    }

    @Override // com.google.android.gms.internal.ads.zztt
    public final void zzi(zztu zztuVar) {
        this.zzh.zzc(8, zztuVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxp
    public final void zzj() {
        this.zzh.zzi(10);
    }

    public final void zzk() {
        this.zzh.zzb(0).zza();
    }

    public final void zzl(zzcv zzcvVar, int i, long j) {
        this.zzh.zzc(3, new zzkk(zzcvVar, i, j)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final synchronized void zzm(zzln zzlnVar) {
        if (!this.zzw && this.zzj.getThread().isAlive()) {
            this.zzh.zzc(14, zzlnVar).zza();
            return;
        }
        zzer.zzf("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzlnVar.zzh(false);
    }

    public final void zzn(boolean z, int i) {
        this.zzh.zzd(1, z ? 1 : 0, i).zza();
    }

    public final void zzo() {
        this.zzh.zzb(6).zza();
    }

    public final synchronized boolean zzp() {
        if (!this.zzw && this.zzj.getThread().isAlive()) {
            this.zzh.zzi(7);
            zzad(new zzkc(this), this.zzs);
            return this.zzw;
        }
        return true;
    }

    public final void zzq(List list, int i, long j, zzvr zzvrVar) {
        this.zzh.zzc(17, new zzkg(list, zzvrVar, i, j, null)).zza();
    }
}
