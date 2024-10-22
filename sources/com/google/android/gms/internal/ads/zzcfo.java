package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzcfo extends zzcct implements zzhk, zzme {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcez zzc;
    private final zzxi zzd;
    private final zzcdb zze;
    private final WeakReference zzf;
    private final zzvd zzg;
    private zziw zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzccs zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcfb zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e3, code lost:            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbci.zzbO)).booleanValue() == false) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e9, code lost:            r7 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ec, code lost:            if (r5.zzm == false) goto L27;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ee, code lost:            r6 = new com.google.android.gms.internal.ads.zzcff(r3, r4, r7);     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0105, code lost:            if (r5.zzj == false) goto L34;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0107, code lost:            r5 = new com.google.android.gms.internal.ads.zzcfi(r3, r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010f, code lost:            r4 = r3.zzi;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0111, code lost:            if (r4 == null) goto L40;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0117, code lost:            if (r4.limit() <= 0) goto L40;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0119, code lost:            r4 = new byte[r3.zzi.limit()];        r3.zzi.get(r4);        r5 = new com.google.android.gms.internal.ads.zzcfj(r5, r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010e, code lost:            r5 = r6;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f6, code lost:            if (r5.zzi <= 0) goto L30;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f8, code lost:            r6 = new com.google.android.gms.internal.ads.zzcfg(r3, r4, r7);     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fe, code lost:            r6 = new com.google.android.gms.internal.ads.zzcfh(r3, r4, r7);     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:            if (r5.zzj == false) goto L23;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzcfo(android.content.Context r4, com.google.android.gms.internal.ads.zzcdb r5, com.google.android.gms.internal.ads.zzcdc r6, java.lang.Integer r7) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfo.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcdb, com.google.android.gms.internal.ads.zzcdc, java.lang.Integer):void");
    }

    private final boolean zzad() {
        if (this.zzt != null && this.zzt.zzq()) {
            return true;
        }
        return false;
    }

    public final void finalize() {
        zzcct.zzD().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final long zzA() {
        if (!zzad()) {
            return this.zzl;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final long zzB() {
        if (!zzad()) {
            synchronized (this.zzq) {
                while (!this.zzs.isEmpty()) {
                    long j = this.zzn;
                    Map zze = ((zzhf) this.zzs.remove(0)).zze();
                    long j2 = 0;
                    if (zze != null) {
                        Iterator it = zze.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzfsc.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzn = j + j2;
                }
            }
            return this.zzn;
        }
        return this.zzt.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final Integer zzC() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzF(Uri[] uriArr, String str) {
        zzG(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzty zzuoVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z;
            int length = uriArr.length;
            if (length == 1) {
                zzuoVar = zzaa(uriArr[0]);
            } else {
                zzty[] zztyVarArr = new zzty[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zztyVarArr[i] = zzaa(uriArr[i]);
                }
                zzuoVar = new zzuo(false, false, zztyVarArr);
            }
            this.zzh.zzB(zzuoVar);
            this.zzh.zzp();
            zzcct.zzE().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzH() {
        zziw zziwVar = this.zzh;
        if (zziwVar != null) {
            zziwVar.zzA(this);
            this.zzh.zzq();
            this.zzh = null;
            zzcct.zzE().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzI(long j) {
        zzm zzmVar = (zzm) this.zzh;
        zzmVar.zza(zzmVar.zzd(), j, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzJ(int i) {
        this.zzc.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzK(int i) {
        this.zzc.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzL(zzccs zzccsVar) {
        this.zzk = zzccsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzM(int i) {
        this.zzc.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzN(int i) {
        this.zzc.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzO(boolean z) {
        this.zzh.zzr(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzP(Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzQ(boolean z) {
        if (this.zzh != null) {
            int i = 0;
            while (true) {
                this.zzh.zzy();
                if (i < 2) {
                    zzxi zzxiVar = this.zzd;
                    zzwu zzc = zzxiVar.zzd().zzc();
                    zzc.zzo(i, !z);
                    zzxiVar.zzk(zzc);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzR(int i) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzcey zzceyVar = (zzcey) ((WeakReference) it.next()).get();
            if (zzceyVar != null) {
                zzceyVar.zzm(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzS(Surface surface, boolean z) {
        zziw zziwVar = this.zzh;
        if (zziwVar != null) {
            zziwVar.zzs(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzT(float f, boolean z) {
        zziw zziwVar = this.zzh;
        if (zziwVar != null) {
            zziwVar.zzt(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzU() {
        this.zzh.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final boolean zzV() {
        return this.zzh != null;
    }

    public final /* synthetic */ zzgi zzW(String str, boolean z) {
        zzcfo zzcfoVar;
        if (true != z) {
            zzcfoVar = null;
        } else {
            zzcfoVar = this;
        }
        zzcdb zzcdbVar = this.zze;
        return new zzcfr(str, zzcfoVar, zzcdbVar.zzd, zzcdbVar.zzf, zzcdbVar.zzn, zzcdbVar.zzo);
    }

    public final /* synthetic */ zzgi zzX(String str, boolean z) {
        zzcfo zzcfoVar;
        if (true != z) {
            zzcfoVar = null;
        } else {
            zzcfoVar = this;
        }
        zzcdb zzcdbVar = this.zze;
        zzcey zzceyVar = new zzcey(str, zzcfoVar, zzcdbVar.zzd, zzcdbVar.zzf, zzcdbVar.zzi);
        this.zzu.add(new WeakReference(zzceyVar));
        return zzceyVar;
    }

    public final /* synthetic */ zzgi zzY(String str, boolean z) {
        zzcfo zzcfoVar;
        zzgq zzgqVar = new zzgq();
        zzgqVar.zzf(str);
        if (true != z) {
            zzcfoVar = null;
        } else {
            zzcfoVar = this;
        }
        zzgqVar.zze(zzcfoVar);
        zzgqVar.zzc(this.zze.zzd);
        zzgqVar.zzd(this.zze.zzf);
        zzgqVar.zzb(true);
        return zzgqVar.zza();
    }

    public final /* synthetic */ zzgi zzZ(zzgh zzghVar) {
        zzgi zza2 = zzghVar.zza();
        zzcfm zzcfmVar = new zzcfm(this);
        return new zzcfb(this.zzb, zza2, this.zzo, this.zzp, this, zzcfmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zza(zzgi zzgiVar, zzgn zzgnVar, boolean z, int i) {
        this.zzl += i;
    }

    public final zzty zzaa(Uri uri) {
        zzar zzarVar = new zzar();
        zzarVar.zzb(uri);
        zzbp zzc = zzarVar.zzc();
        zzvd zzvdVar = this.zzg;
        zzvdVar.zza(this.zze.zzg);
        return zzvdVar.zzb(zzc);
    }

    public final /* synthetic */ void zzab(boolean z, long j) {
        zzccs zzccsVar = this.zzk;
        if (zzccsVar != null) {
            zzccsVar.zzi(z, j);
        }
    }

    public final /* synthetic */ zzlr[] zzac(Handler handler, zzaad zzaadVar, zzpc zzpcVar, zzwa zzwaVar, zzsw zzswVar) {
        zzsg zzsgVar = zzsg.zzb;
        zzon zzonVar = zzon.zza;
        zzdq[] zzdqVarArr = new zzdq[0];
        zzpw zzpwVar = new zzpw();
        if (zzonVar != null || zzonVar != null) {
            Context context = this.zzb;
            zzpwVar.zzc(zzonVar);
            zzpwVar.zzd(zzdqVarArr);
            zzqi zze = zzpwVar.zze();
            zzrv zzrvVar = zzrv.zza;
            return new zzlr[]{new zzqo(context, zzrvVar, zzsgVar, false, handler, zzpcVar, zze), new zzzf(this.zzb, zzrvVar, zzsgVar, 0L, false, handler, zzaadVar, -1, 30.0f)};
        }
        throw new NullPointerException("Both parameters are null");
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zzb(zzgi zzgiVar, zzgn zzgnVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zzc(zzgi zzgiVar, zzgn zzgnVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zzd(zzgi zzgiVar, zzgn zzgnVar, boolean z) {
        if (zzgiVar instanceof zzhf) {
            synchronized (this.zzq) {
                this.zzs.add((zzhf) zzgiVar);
            }
        } else if (zzgiVar instanceof zzcfb) {
            this.zzt = (zzcfb) zzgiVar;
            final zzcdc zzcdcVar = (zzcdc) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbO)).booleanValue() && zzcdcVar != null && this.zzt.zzn()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzt.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
                com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfk
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = zzcfo.zza;
                        zzcdc.this.zzd("onGcacheInfoEvent", hashMap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final void zze(zzmc zzmcVar, zzam zzamVar, zzie zzieVar) {
        zzcdc zzcdcVar = (zzcdc) this.zzf.get();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbO)).booleanValue() && zzcdcVar != null) {
            HashMap hashMap = new HashMap();
            String str = zzamVar.zzl;
            if (str != null) {
                hashMap.put("audioMime", str);
            }
            String str2 = zzamVar.zzm;
            if (str2 != null) {
                hashMap.put("audioSampleMime", str2);
            }
            String str3 = zzamVar.zzj;
            if (str3 != null) {
                hashMap.put("audioCodec", str3);
            }
            zzcdcVar.zzd("onMetadataEvent", hashMap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final /* synthetic */ void zzf(zzmc zzmcVar, int i, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final /* synthetic */ void zzg(zzmc zzmcVar, zzts zztsVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final void zzh(zzmc zzmcVar, int i, long j) {
        this.zzm += i;
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final /* synthetic */ void zzi(zzco zzcoVar, zzmd zzmdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final void zzj(zzmc zzmcVar, zztn zztnVar, zzts zztsVar, IOException iOException, boolean z) {
        zzccs zzccsVar = this.zzk;
        if (zzccsVar != null) {
            if (this.zze.zzk) {
                zzccsVar.zzl("onLoadException", iOException);
            } else {
                zzccsVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final void zzk(zzmc zzmcVar, int i) {
        zzccs zzccsVar = this.zzk;
        if (zzccsVar != null) {
            zzccsVar.zzm(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final void zzl(zzmc zzmcVar, zzce zzceVar) {
        zzccs zzccsVar = this.zzk;
        if (zzccsVar != null) {
            zzccsVar.zzk("onPlayerError", zzceVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final /* synthetic */ void zzm(zzmc zzmcVar, zzcn zzcnVar, zzcn zzcnVar2, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final void zzn(zzmc zzmcVar, Object obj, long j) {
        zzccs zzccsVar = this.zzk;
        if (zzccsVar != null) {
            zzccsVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final /* synthetic */ void zzo(zzmc zzmcVar, zzid zzidVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final void zzp(zzmc zzmcVar, zzam zzamVar, zzie zzieVar) {
        zzcdc zzcdcVar = (zzcdc) this.zzf.get();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbO)).booleanValue() && zzcdcVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(zzamVar.zzt));
            hashMap.put("bitRate", String.valueOf(zzamVar.zzi));
            hashMap.put("resolution", zzamVar.zzr + "x" + zzamVar.zzs);
            String str = zzamVar.zzl;
            if (str != null) {
                hashMap.put("videoMime", str);
            }
            String str2 = zzamVar.zzm;
            if (str2 != null) {
                hashMap.put("videoSampleMime", str2);
            }
            String str3 = zzamVar.zzj;
            if (str3 != null) {
                hashMap.put("videoCodec", str3);
            }
            zzcdcVar.zzd("onMetadataEvent", hashMap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final void zzq(zzmc zzmcVar, zzdm zzdmVar) {
        zzccs zzccsVar = this.zzk;
        if (zzccsVar != null) {
            zzccsVar.zzD(zzdmVar.zzc, zzdmVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final int zzr() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final int zzt() {
        return this.zzh.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final long zzv() {
        return this.zzh.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final long zzw() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final long zzx() {
        if (!zzad() || !this.zzt.zzp()) {
            return 0L;
        }
        return Math.min(this.zzl, this.zzt.zzk());
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final long zzy() {
        return this.zzh.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final long zzz() {
        return this.zzh.zzl();
    }
}
