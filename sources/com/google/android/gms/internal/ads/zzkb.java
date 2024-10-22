package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import defpackage.p71;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class zzkb extends zzm implements zziw {
    public static final /* synthetic */ int zzd = 0;
    private final zzma zzA;
    private final long zzB;
    private int zzC;
    private int zzD;
    private boolean zzE;
    private int zzF;
    private zzlv zzG;
    private zzck zzH;
    private zzbv zzI;
    private zzbv zzJ;
    private zzam zzK;
    private zzam zzL;
    private AudioTrack zzM;
    private Object zzN;
    private Surface zzO;
    private int zzP;
    private zzfc zzQ;
    private zzid zzR;
    private zzid zzS;
    private int zzT;
    private zzk zzU;
    private float zzV;
    private boolean zzW;
    private zzdw zzX;
    private boolean zzY;
    private boolean zzZ;
    private zzz zzaa;
    private zzdm zzab;
    private zzbv zzac;
    private zzlk zzad;
    private int zzae;
    private long zzaf;
    private final zzix zzag;
    private zzvr zzah;
    final zzxr zzb;
    final zzck zzc;
    private final zzea zze;
    private final Context zzf;
    private final zzco zzg;
    private final zzlr[] zzh;
    private final zzxq zzi;
    private final zzei zzj;
    private final zzkl zzk;
    private final zzeo zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzcs zzn;
    private final List zzo;
    private final boolean zzp;
    private final zztv zzq;
    private final zzmb zzr;
    private final Looper zzs;
    private final zzxy zzt;
    private final zzdy zzu;
    private final zzjx zzv;
    private final zzjz zzw;
    private final zzhx zzx;
    private final zzib zzy;
    private final zzlz zzz;

    static {
        zzbq.zzb("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.gms.internal.ads.zzxx, java.lang.Object, com.google.android.gms.internal.ads.zzmb] */
    @SuppressLint({"HandlerLeak"})
    public zzkb(zziv zzivVar, zzco zzcoVar) {
        zzol zza;
        Object obj;
        zzea zzeaVar = new zzea(zzdy.zza);
        this.zze = zzeaVar;
        try {
            zzer.zze("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.2.0-alpha01] [" + zzfk.zze + "]");
            Context applicationContext = zzivVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            ?? apply = zzivVar.zzh.apply(zzivVar.zzb);
            this.zzr = apply;
            this.zzU = zzivVar.zzj;
            this.zzP = zzivVar.zzk;
            this.zzW = false;
            this.zzB = zzivVar.zzo;
            zzjx zzjxVar = new zzjx(this, null);
            this.zzv = zzjxVar;
            zzjz zzjzVar = new zzjz(null);
            this.zzw = zzjzVar;
            Handler handler = new Handler(zzivVar.zzi);
            zzlr[] zza2 = ((zzio) zzivVar.zzc).zza.zza(handler, zzjxVar, zzjxVar, zzjxVar, zzjxVar);
            this.zzh = zza2;
            int length = zza2.length;
            zzxq zzxqVar = (zzxq) zzivVar.zze.zza();
            this.zzi = zzxqVar;
            this.zzq = zziv.zza(((zzip) zzivVar.zzd).zza);
            zzyc zzg = zzyc.zzg(((zzis) zzivVar.zzg).zza);
            this.zzt = zzg;
            this.zzp = zzivVar.zzl;
            this.zzG = zzivVar.zzm;
            Looper looper = zzivVar.zzi;
            this.zzs = looper;
            zzdy zzdyVar = zzivVar.zzb;
            this.zzu = zzdyVar;
            this.zzg = zzcoVar;
            zzeo zzeoVar = new zzeo(looper, zzdyVar, new zzem() { // from class: com.google.android.gms.internal.ads.zzjr
                @Override // com.google.android.gms.internal.ads.zzem
                public final void zza(Object obj2, zzah zzahVar) {
                }
            });
            this.zzl = zzeoVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzah = new zzvr(0);
            int length2 = zza2.length;
            zzxr zzxrVar = new zzxr(new zzlu[2], new zzxk[2], zzdg.zza, null);
            this.zzb = zzxrVar;
            this.zzn = new zzcs();
            zzci zzciVar = new zzci();
            zzciVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32);
            zzxqVar.zzm();
            zzciVar.zzd(29, true);
            zzciVar.zzd(23, false);
            zzciVar.zzd(25, false);
            zzciVar.zzd(33, false);
            zzciVar.zzd(26, false);
            zzciVar.zzd(34, false);
            zzck zze = zzciVar.zze();
            this.zzc = zze;
            zzci zzciVar2 = new zzci();
            zzciVar2.zzb(zze);
            zzciVar2.zza(4);
            zzciVar2.zza(10);
            this.zzH = zzciVar2.zze();
            this.zzj = zzdyVar.zzb(looper, null);
            zzix zzixVar = new zzix(this);
            this.zzag = zzixVar;
            this.zzad = zzlk.zzi(zzxrVar);
            apply.zzP(zzcoVar, looper);
            int i = zzfk.zza;
            if (i < 31) {
                zza = new zzol();
            } else {
                zza = zzjs.zza(applicationContext, this, zzivVar.zzp);
            }
            this.zzk = new zzkl(zza2, zzxqVar, zzxrVar, (zzko) zzivVar.zzf.zza(), zzg, 0, false, apply, this.zzG, zzivVar.zzr, zzivVar.zzn, false, looper, zzdyVar, zzixVar, zza, null);
            this.zzV = 1.0f;
            zzbv zzbvVar = zzbv.zza;
            this.zzI = zzbvVar;
            this.zzJ = zzbvVar;
            this.zzac = zzbvVar;
            int i2 = -1;
            this.zzae = -1;
            if (i >= 21) {
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                if (audioManager != null) {
                    i2 = audioManager.generateAudioSessionId();
                }
                this.zzT = i2;
                obj = null;
            } else {
                AudioTrack audioTrack = this.zzM;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.zzM.release();
                    obj = null;
                    this.zzM = null;
                } else {
                    obj = null;
                }
                if (this.zzM == null) {
                    this.zzM = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.zzT = this.zzM.getAudioSessionId();
            }
            this.zzX = zzdw.zza;
            this.zzY = true;
            apply.getClass();
            zzeoVar.zzb(apply);
            zzg.zze(new Handler(looper), apply);
            copyOnWriteArraySet.add(zzjxVar);
            this.zzx = new zzhx(zzivVar.zza, handler, zzjxVar);
            this.zzy = new zzib(zzivVar.zza, handler, zzjxVar);
            zzfk.zzE(obj, obj);
            this.zzz = new zzlz(zzivVar.zza);
            this.zzA = new zzma(zzivVar.zza);
            this.zzaa = new zzx(0).zza();
            this.zzab = zzdm.zza;
            this.zzQ = zzfc.zza;
            zzxqVar.zzj(this.zzU);
            zzah(1, 10, Integer.valueOf(this.zzT));
            zzah(2, 10, Integer.valueOf(this.zzT));
            zzah(1, 3, this.zzU);
            zzah(2, 4, Integer.valueOf(this.zzP));
            zzah(2, 5, 0);
            zzah(1, 9, Boolean.valueOf(this.zzW));
            zzah(2, 7, zzjzVar);
            zzah(6, 8, zzjzVar);
            zzeaVar.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    public static /* bridge */ /* synthetic */ void zzP(zzkb zzkbVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzkbVar.zzaj(surface);
        zzkbVar.zzO = surface;
    }

    private final int zzX(zzlk zzlkVar) {
        if (zzlkVar.zza.zzo()) {
            return this.zzae;
        }
        return zzlkVar.zza.zzn(zzlkVar.zzb.zza, this.zzn).zzd;
    }

    public static int zzY(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    private final long zzZ(zzlk zzlkVar) {
        if (zzlkVar.zzb.zzb()) {
            zzlkVar.zza.zzn(zzlkVar.zzb.zza, this.zzn);
            long j = zzlkVar.zzc;
            if (j == -9223372036854775807L) {
                long j2 = zzlkVar.zza.zze(zzX(zzlkVar), this.zza, 0L).zzn;
                return zzfk.zzs(0L);
            }
            return zzfk.zzs(j) + zzfk.zzs(0L);
        }
        return zzfk.zzs(zzaa(zzlkVar));
    }

    private final long zzaa(zzlk zzlkVar) {
        long j;
        if (zzlkVar.zza.zzo()) {
            return zzfk.zzq(this.zzaf);
        }
        if (zzlkVar.zzo) {
            j = zzlkVar.zza();
        } else {
            j = zzlkVar.zzr;
        }
        if (zzlkVar.zzb.zzb()) {
            return j;
        }
        zzac(zzlkVar.zza, zzlkVar.zzb, j);
        return j;
    }

    private static long zzab(zzlk zzlkVar) {
        zzcu zzcuVar = new zzcu();
        zzcs zzcsVar = new zzcs();
        zzlkVar.zza.zzn(zzlkVar.zzb.zza, zzcsVar);
        long j = zzlkVar.zzc;
        if (j == -9223372036854775807L) {
            long j2 = zzlkVar.zza.zze(zzcsVar.zzd, zzcuVar, 0L).zzn;
            return 0L;
        }
        return j;
    }

    private final long zzac(zzcv zzcvVar, zztw zztwVar, long j) {
        zzcvVar.zzn(zztwVar.zza, this.zzn);
        return j;
    }

    private final Pair zzad(zzcv zzcvVar, int i, long j) {
        if (zzcvVar.zzo()) {
            this.zzae = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzaf = j;
            return null;
        }
        if (i == -1 || i >= zzcvVar.zzc()) {
            i = zzcvVar.zzg(false);
            long j2 = zzcvVar.zze(i, this.zza, 0L).zzn;
            j = zzfk.zzs(0L);
        }
        return zzcvVar.zzl(this.zza, this.zzn, i, zzfk.zzq(j));
    }

    private final zzlk zzae(zzlk zzlkVar, zzcv zzcvVar, Pair pair) {
        boolean z;
        zztw zztwVar;
        zzvx zzvxVar;
        zzxr zzxrVar;
        List list;
        long j;
        if (!zzcvVar.zzo() && pair == null) {
            z = false;
        } else {
            z = true;
        }
        zzdx.zzd(z);
        zzcv zzcvVar2 = zzlkVar.zza;
        long zzZ = zzZ(zzlkVar);
        zzlk zzh = zzlkVar.zzh(zzcvVar);
        if (zzcvVar.zzo()) {
            zztw zzj = zzlk.zzj();
            long zzq = zzfk.zzq(this.zzaf);
            zzlk zzc = zzh.zzd(zzj, zzq, zzq, zzq, 0L, zzvx.zza, this.zzb, zzfvs.zzl()).zzc(zzj);
            zzc.zzp = zzc.zzr;
            return zzc;
        }
        Object obj = zzh.zzb.zza;
        int i = zzfk.zza;
        boolean z2 = !obj.equals(pair.first);
        if (z2) {
            zztwVar = new zztw(pair.first, -1L);
        } else {
            zztwVar = zzh.zzb;
        }
        zztw zztwVar2 = zztwVar;
        long longValue = ((Long) pair.second).longValue();
        long zzq2 = zzfk.zzq(zzZ);
        if (!zzcvVar2.zzo()) {
            zzcvVar2.zzn(obj, this.zzn);
        }
        if (!z2 && longValue >= zzq2) {
            if (longValue == zzq2) {
                int zza = zzcvVar.zza(zzh.zzk.zza);
                if (zza == -1 || zzcvVar.zzd(zza, this.zzn, false).zzd != zzcvVar.zzn(zztwVar2.zza, this.zzn).zzd) {
                    zzcvVar.zzn(zztwVar2.zza, this.zzn);
                    if (zztwVar2.zzb()) {
                        j = this.zzn.zzh(zztwVar2.zzb, zztwVar2.zzc);
                    } else {
                        j = this.zzn.zze;
                    }
                    zzlk zzc2 = zzh.zzd(zztwVar2, zzh.zzr, zzh.zzr, zzh.zzd, j - zzh.zzr, zzh.zzh, zzh.zzi, zzh.zzj).zzc(zztwVar2);
                    zzc2.zzp = j;
                    return zzc2;
                }
                return zzh;
            }
            zzdx.zzf(!zztwVar2.zzb());
            long max = Math.max(0L, zzh.zzq - (longValue - zzq2));
            long j2 = zzh.zzp;
            if (zzh.zzk.equals(zzh.zzb)) {
                j2 = longValue + max;
            }
            zzlk zzd2 = zzh.zzd(zztwVar2, longValue, longValue, longValue, max, zzh.zzh, zzh.zzi, zzh.zzj);
            zzd2.zzp = j2;
            return zzd2;
        }
        zzdx.zzf(!zztwVar2.zzb());
        if (z2) {
            zzvxVar = zzvx.zza;
        } else {
            zzvxVar = zzh.zzh;
        }
        zzvx zzvxVar2 = zzvxVar;
        if (z2) {
            zzxrVar = this.zzb;
        } else {
            zzxrVar = zzh.zzi;
        }
        zzxr zzxrVar2 = zzxrVar;
        if (z2) {
            list = zzfvs.zzl();
        } else {
            list = zzh.zzj;
        }
        zzlk zzc3 = zzh.zzd(zztwVar2, longValue, longValue, longValue, 0L, zzvxVar2, zzxrVar2, list).zzc(zztwVar2);
        zzc3.zzp = longValue;
        return zzc3;
    }

    private final zzln zzaf(zzlm zzlmVar) {
        int i;
        int zzX = zzX(this.zzad);
        zzcv zzcvVar = this.zzad.zza;
        if (zzX == -1) {
            i = 0;
        } else {
            i = zzX;
        }
        zzdy zzdyVar = this.zzu;
        zzkl zzklVar = this.zzk;
        return new zzln(zzklVar, zzlmVar, zzcvVar, i, zzdyVar, zzklVar.zzb());
    }

    public final void zzag(final int i, final int i2) {
        if (i == this.zzQ.zzb() && i2 == this.zzQ.zza()) {
            return;
        }
        this.zzQ = new zzfc(i, i2);
        zzeo zzeoVar = this.zzl;
        zzeoVar.zzd(24, new zzel() { // from class: com.google.android.gms.internal.ads.zzjo
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                int i3 = zzkb.zzd;
                ((zzcl) obj).zzo(i, i2);
            }
        });
        zzeoVar.zzc();
        zzah(2, 14, new zzfc(i, i2));
    }

    private final void zzah(int i, int i2, Object obj) {
        zzlr[] zzlrVarArr = this.zzh;
        int length = zzlrVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzlr zzlrVar = zzlrVarArr[i3];
            if (zzlrVar.zzb() == i) {
                zzln zzaf = zzaf(zzlrVar);
                zzaf.zzf(i2);
                zzaf.zze(obj);
                zzaf.zzd();
            }
        }
    }

    public final void zzai() {
        zzah(1, 2, Float.valueOf(this.zzV * this.zzy.zza()));
    }

    public final void zzaj(Object obj) {
        ArrayList arrayList = new ArrayList();
        zzlr[] zzlrVarArr = this.zzh;
        int length = zzlrVarArr.length;
        boolean z = false;
        for (int i = 0; i < 2; i++) {
            zzlr zzlrVar = zzlrVarArr[i];
            if (zzlrVar.zzb() == 2) {
                zzln zzaf = zzaf(zzlrVar);
                zzaf.zzf(1);
                zzaf.zze(obj);
                zzaf.zzd();
                arrayList.add(zzaf);
            }
        }
        Object obj2 = this.zzN;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zzln) it.next()).zzi(this.zzB);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.zzN;
            Surface surface = this.zzO;
            if (obj3 == surface) {
                surface.release();
                this.zzO = null;
            }
        }
        this.zzN = obj;
        if (z) {
            zzak(zzil.zzd(new zzkm(3), 1003));
        }
    }

    private final void zzak(zzil zzilVar) {
        zzlk zzlkVar = this.zzad;
        zzlk zzc = zzlkVar.zzc(zzlkVar.zzb);
        zzc.zzp = zzc.zzr;
        zzc.zzq = 0L;
        zzlk zzg = zzc.zzg(1);
        if (zzilVar != null) {
            zzg = zzg.zzf(zzilVar);
        }
        this.zzC++;
        this.zzk.zzo();
        zzam(zzg, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void zzal(boolean z, int i, int i2) {
        boolean z2;
        int i3 = 0;
        if (z && i != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && i != 1) {
            i3 = 1;
        }
        zzlk zzlkVar = this.zzad;
        if (zzlkVar.zzl == z2 && zzlkVar.zzm == i3) {
            return;
        }
        this.zzC++;
        if (zzlkVar.zzo) {
            zzlkVar = zzlkVar.zzb();
        }
        zzlk zze = zzlkVar.zze(z2, i3);
        this.zzk.zzn(z2, i3);
        zzam(zze, 0, i2, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0475 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x047f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x048a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x049b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x050f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ec  */
    /* JADX WARN: Type inference failed for: r9v10, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzam(final com.google.android.gms.internal.ads.zzlk r44, final int r45, final int r46, boolean r47, int r48, long r49, int r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkb.zzam(com.google.android.gms.internal.ads.zzlk, int, int, boolean, int, long, int, boolean):void");
    }

    public final void zzan() {
        int zzf = zzf();
        if (zzf != 2 && zzf != 3) {
            return;
        }
        zzao();
        boolean z = this.zzad.zzo;
        zzv();
        zzv();
    }

    private final void zzao() {
        IllegalStateException illegalStateException;
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzs.getThread().getName());
            if (!this.zzY) {
                if (this.zzZ) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                zzer.zzg("ExoPlayerImpl", format, illegalStateException);
                this.zzZ = true;
                return;
            }
            throw new IllegalStateException(format);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zzA(zzme zzmeVar) {
        zzao();
        this.zzr.zzO(zzmeVar);
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zzB(zzty zztyVar) {
        boolean z;
        zzao();
        List singletonList = Collections.singletonList(zztyVar);
        zzao();
        zzao();
        zzX(this.zzad);
        zzk();
        this.zzC++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i = size - 1; i >= 0; i--) {
                this.zzo.remove(i);
            }
            this.zzah = this.zzah.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            zzlh zzlhVar = new zzlh((zzty) singletonList.get(i2), this.zzp);
            arrayList.add(zzlhVar);
            this.zzo.add(i2, new zzka(zzlhVar.zzb, zzlhVar.zza));
        }
        this.zzah = this.zzah.zzg(0, arrayList.size());
        zzlp zzlpVar = new zzlp(this.zzo, this.zzah);
        if (!zzlpVar.zzo() && zzlpVar.zzc() < 0) {
            throw new zzan(zzlpVar, -1, -9223372036854775807L);
        }
        int zzg = zzlpVar.zzg(false);
        zzlk zzae = zzae(this.zzad, zzlpVar, zzad(zzlpVar, zzg, -9223372036854775807L));
        int i3 = zzae.zze;
        if (zzg != -1 && i3 != 1) {
            i3 = 4;
            if (!zzlpVar.zzo() && zzg < zzlpVar.zzc()) {
                i3 = 2;
            }
        }
        zzlk zzg2 = zzae.zzg(i3);
        this.zzk.zzq(arrayList, zzg, zzfk.zzq(-9223372036854775807L), this.zzah);
        if (!this.zzad.zzb.zza.equals(zzg2.zzb.zza) && !this.zzad.zza.zzo()) {
            z = true;
        } else {
            z = false;
        }
        zzam(zzg2, 0, 1, z, 4, zzaa(zzg2), -1, false);
    }

    public final zzil zzE() {
        zzao();
        return this.zzad.zzf;
    }

    public final /* synthetic */ void zzT(zzkj zzkjVar) {
        long j;
        boolean z;
        boolean z2;
        int i = this.zzC - zzkjVar.zzb;
        this.zzC = i;
        boolean z3 = true;
        if (zzkjVar.zzc) {
            this.zzD = zzkjVar.zzd;
            this.zzE = true;
        }
        if (zzkjVar.zze) {
            this.zzF = zzkjVar.zzf;
        }
        if (i == 0) {
            zzcv zzcvVar = zzkjVar.zza.zza;
            if (!this.zzad.zza.zzo() && zzcvVar.zzo()) {
                this.zzae = -1;
                this.zzaf = 0L;
            }
            if (!zzcvVar.zzo()) {
                List zzw = ((zzlp) zzcvVar).zzw();
                if (zzw.size() == this.zzo.size()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zzdx.zzf(z2);
                for (int i2 = 0; i2 < zzw.size(); i2++) {
                    ((zzka) this.zzo.get(i2)).zzc((zzcv) zzw.get(i2));
                }
            }
            if (this.zzE) {
                if (zzkjVar.zza.zzb.equals(this.zzad.zzb) && zzkjVar.zza.zzd == this.zzad.zzr) {
                    z3 = false;
                }
                if (z3) {
                    if (!zzcvVar.zzo() && !zzkjVar.zza.zzb.zzb()) {
                        zzlk zzlkVar = zzkjVar.zza;
                        zztw zztwVar = zzlkVar.zzb;
                        j = zzlkVar.zzd;
                        zzac(zzcvVar, zztwVar, j);
                    } else {
                        j = zzkjVar.zza.zzd;
                    }
                } else {
                    j = -9223372036854775807L;
                }
                z = z3;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.zzE = false;
            zzam(zzkjVar.zza, 1, this.zzF, z, this.zzD, j, -1, false);
        }
    }

    public final /* synthetic */ void zzU(final zzkj zzkjVar) {
        this.zzj.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjq
            @Override // java.lang.Runnable
            public final void run() {
                zzkb.this.zzT(zzkjVar);
            }
        });
    }

    public final /* synthetic */ void zzV(zzcl zzclVar) {
        zzclVar.zza(this.zzH);
    }

    @Override // com.google.android.gms.internal.ads.zzm
    public final void zza(int i, long j, int i2, boolean z) {
        boolean z2;
        zzao();
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzdx.zzd(z2);
        this.zzr.zzu();
        zzcv zzcvVar = this.zzad.zza;
        if (!zzcvVar.zzo() && i >= zzcvVar.zzc()) {
            return;
        }
        this.zzC++;
        if (zzx()) {
            zzer.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            zzkj zzkjVar = new zzkj(this.zzad);
            zzkjVar.zza(1);
            this.zzag.zza.zzU(zzkjVar);
            return;
        }
        zzlk zzlkVar = this.zzad;
        int i3 = zzlkVar.zze;
        if (i3 == 3 || (i3 == 4 && !zzcvVar.zzo())) {
            zzlkVar = this.zzad.zzg(2);
        }
        int zzd2 = zzd();
        zzlk zzae = zzae(zzlkVar, zzcvVar, zzad(zzcvVar, i, j));
        this.zzk.zzl(zzcvVar, i, zzfk.zzq(j));
        zzam(zzae, 0, 1, true, 1, zzaa(zzae), zzd2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzb() {
        zzao();
        if (zzx()) {
            return this.zzad.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzc() {
        zzao();
        if (zzx()) {
            return this.zzad.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzd() {
        zzao();
        int zzX = zzX(this.zzad);
        if (zzX == -1) {
            return 0;
        }
        return zzX;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zze() {
        zzao();
        if (this.zzad.zza.zzo()) {
            return 0;
        }
        zzlk zzlkVar = this.zzad;
        return zzlkVar.zza.zza(zzlkVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzf() {
        zzao();
        return this.zzad.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzg() {
        zzao();
        return this.zzad.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzh() {
        zzao();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzi() {
        zzao();
        if (zzx()) {
            zzlk zzlkVar = this.zzad;
            if (zzlkVar.zzk.equals(zzlkVar.zzb)) {
                return zzfk.zzs(this.zzad.zzp);
            }
            return zzl();
        }
        zzao();
        if (this.zzad.zza.zzo()) {
            return this.zzaf;
        }
        zzlk zzlkVar2 = this.zzad;
        long j = 0;
        if (zzlkVar2.zzk.zzd != zzlkVar2.zzb.zzd) {
            return zzfk.zzs(zzlkVar2.zza.zze(zzd(), this.zza, 0L).zzo);
        }
        long j2 = zzlkVar2.zzp;
        if (this.zzad.zzk.zzb()) {
            zzlk zzlkVar3 = this.zzad;
            zzlkVar3.zza.zzn(zzlkVar3.zzk.zza, this.zzn).zzi(this.zzad.zzk.zzb);
        } else {
            j = j2;
        }
        zzlk zzlkVar4 = this.zzad;
        zzac(zzlkVar4.zza, zzlkVar4.zzk, j);
        return zzfk.zzs(j);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzj() {
        zzao();
        return zzZ(this.zzad);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzk() {
        zzao();
        return zzfk.zzs(zzaa(this.zzad));
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzl() {
        zzao();
        if (!zzx()) {
            zzcv zzn = zzn();
            if (zzn.zzo()) {
                return -9223372036854775807L;
            }
            return zzfk.zzs(zzn.zze(zzd(), this.zza, 0L).zzo);
        }
        zzlk zzlkVar = this.zzad;
        zztw zztwVar = zzlkVar.zzb;
        zzlkVar.zza.zzn(zztwVar.zza, this.zzn);
        return zzfk.zzs(this.zzn.zzh(zztwVar.zzb, zztwVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzm() {
        zzao();
        return zzfk.zzs(this.zzad.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final zzcv zzn() {
        zzao();
        return this.zzad.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final zzdg zzo() {
        zzao();
        return this.zzad.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzp() {
        zzao();
        zzib zzibVar = this.zzy;
        boolean zzv = zzv();
        int i = 2;
        int zzb = zzibVar.zzb(zzv, 2);
        zzal(zzv, zzb, zzY(zzv, zzb));
        zzlk zzlkVar = this.zzad;
        if (zzlkVar.zze != 1) {
            return;
        }
        zzlk zzf = zzlkVar.zzf(null);
        if (true == zzf.zza.zzo()) {
            i = 4;
        }
        zzlk zzg = zzf.zzg(i);
        this.zzC++;
        this.zzk.zzk();
        zzam(zzg, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzq() {
        AudioTrack audioTrack;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzfk.zze;
        String zza = zzbq.zza();
        StringBuilder q = p71.q("Release ", hexString, " [AndroidXMedia3/1.2.0-alpha01] [", str, "] [");
        q.append(zza);
        q.append("]");
        zzer.zze("ExoPlayerImpl", q.toString());
        zzao();
        if (zzfk.zza < 21 && (audioTrack = this.zzM) != null) {
            audioTrack.release();
            this.zzM = null;
        }
        this.zzy.zzd();
        if (!this.zzk.zzp()) {
            zzeo zzeoVar = this.zzl;
            zzeoVar.zzd(10, new zzel() { // from class: com.google.android.gms.internal.ads.zzjp
                @Override // com.google.android.gms.internal.ads.zzel
                public final void zza(Object obj) {
                    ((zzcl) obj).zzj(zzil.zzd(new zzkm(1), 1003));
                }
            });
            zzeoVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zze(null);
        this.zzt.zzf(this.zzr);
        zzlk zzlkVar = this.zzad;
        if (zzlkVar.zzo) {
            this.zzad = zzlkVar.zzb();
        }
        zzlk zzg = this.zzad.zzg(1);
        this.zzad = zzg;
        zzlk zzc = zzg.zzc(zzg.zzb);
        this.zzad = zzc;
        zzc.zzp = zzc.zzr;
        this.zzad.zzq = 0L;
        this.zzr.zzN();
        this.zzi.zzi();
        Surface surface = this.zzO;
        if (surface != null) {
            surface.release();
            this.zzO = null;
        }
        this.zzX = zzdw.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzr(boolean z) {
        zzao();
        int zzb = this.zzy.zzb(z, zzf());
        zzal(z, zzb, zzY(z, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzs(Surface surface) {
        int i;
        zzao();
        zzaj(surface);
        if (surface == null) {
            i = 0;
        } else {
            i = -1;
        }
        zzag(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzt(float f) {
        zzao();
        final float max = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.zzV == max) {
            return;
        }
        this.zzV = max;
        zzai();
        zzeo zzeoVar = this.zzl;
        zzeoVar.zzd(22, new zzel() { // from class: com.google.android.gms.internal.ads.zzjf
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                int i = zzkb.zzd;
                ((zzcl) obj).zzs(max);
            }
        });
        zzeoVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzu() {
        zzao();
        this.zzy.zzb(zzv(), 1);
        zzak(null);
        this.zzX = new zzdw(zzfvs.zzl(), this.zzad.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzv() {
        zzao();
        return this.zzad.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzw() {
        zzao();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzx() {
        zzao();
        return this.zzad.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final int zzy() {
        zzao();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zzz(zzme zzmeVar) {
        this.zzr.zzt(zzmeVar);
    }
}
