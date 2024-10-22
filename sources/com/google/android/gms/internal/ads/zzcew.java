package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzcew extends zzcen implements zzccs {
    public static final /* synthetic */ int zzd = 0;
    private zzcct zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcef zzi;
    private long zzj;
    private long zzk;

    public zzcew(zzcdc zzcdcVar, zzcdb zzcdbVar) {
        super(zzcdcVar);
        zzcfo zzcfoVar = new zzcfo(zzcdcVar.getContext(), zzcdbVar, (zzcdc) this.zzc.get(), null);
        zzcat.zzi("ExoPlayerAdapter initialized.");
        this.zze = zzcfoVar;
        zzcfoVar.zzL(this);
    }

    public static final String zzc(String str) {
        return "cache:".concat(String.valueOf(zzcam.zze(str)));
    }

    private static String zzd(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzx(long j) {
        com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcev
            @Override // java.lang.Runnable
            public final void run() {
                zzcew.this.zzb();
            }
        }, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcen, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcct zzcctVar = this.zze;
        if (zzcctVar != null) {
            zzcctVar.zzL(null);
            this.zze.zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzD(int i, int i2) {
    }

    public final zzcct zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzL(null);
        zzcct zzcctVar = this.zze;
        this.zze = null;
        return zzcctVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [long] */
    /* JADX WARN: Type inference failed for: r3v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [com.google.android.gms.internal.ads.zzcew, com.google.android.gms.internal.ads.zzcen] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [com.google.android.gms.internal.ads.zzcew] */
    /* JADX WARN: Type inference failed for: r3v31 */
    public final /* synthetic */ void zzb() {
        String str;
        zzcew zzcewVar;
        zzcew zzcewVar2;
        ?? longValue;
        long intValue;
        zzcew zzcewVar3;
        long j;
        long j2;
        String str2;
        long j3;
        boolean z;
        String str3;
        long j4;
        long j5;
        long j6;
        long j7;
        String zzc = zzc(this.zzf);
        String str4 = MRAIDPresenter.ERROR;
        try {
            longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzx)).longValue() * 1000;
            intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzw)).intValue();
            zzcewVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbO)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            str = zzc;
            zzcewVar = this;
        }
        synchronized (this) {
            try {
                int i = ((com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zzj) > longValue ? 1 : ((com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zzj) == longValue ? 0 : -1));
                if (i <= 0) {
                    try {
                        if (!this.zzg) {
                            if (this.zzh) {
                                zzcewVar2 = this;
                            } else {
                                if (this.zze.zzV()) {
                                    long zzz = this.zze.zzz();
                                    if (zzz > 0) {
                                        long zzv = this.zze.zzv();
                                        if (zzv != this.zzk) {
                                            if (zzv > 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            try {
                                                str3 = this.zzf;
                                                j4 = -1;
                                                if (zzcewVar != 0) {
                                                    j5 = this.zze.zzA();
                                                } else {
                                                    j5 = -1;
                                                }
                                                if (zzcewVar != 0) {
                                                    j6 = this.zze.zzx();
                                                } else {
                                                    j6 = -1;
                                                }
                                                if (zzcewVar != 0) {
                                                    j4 = this.zze.zzB();
                                                }
                                                j7 = j5;
                                                j2 = intValue;
                                                str2 = zzc;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                str2 = zzc;
                                                zzcewVar = this;
                                            }
                                            try {
                                                zzo(str3, zzc, zzv, zzz, z, j7, j6, j4, zzcct.zzs(), zzcct.zzu());
                                                zzcewVar = this;
                                                j = zzv;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                zzcewVar = this;
                                                str = str2;
                                                throw th;
                                            }
                                            try {
                                                zzcewVar.zzk = j;
                                                j3 = zzz;
                                                zzcewVar = zzcewVar;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                str = str2;
                                                throw th;
                                            }
                                        } else {
                                            j = zzv;
                                            j2 = intValue;
                                            str2 = zzc;
                                            zzcewVar = this;
                                            j3 = zzz;
                                        }
                                        if (j >= j3) {
                                            zzcewVar.zzj(zzcewVar.zzf, str2, j3);
                                            zzcewVar2 = zzcewVar;
                                        } else {
                                            long zzw = zzcewVar.zze.zzw();
                                            zzcewVar3 = zzcewVar;
                                            if (zzw >= j2) {
                                                zzcewVar3 = zzcewVar;
                                                if (j > 0) {
                                                    zzcewVar2 = zzcewVar;
                                                }
                                            }
                                        }
                                    } else {
                                        zzcewVar3 = this;
                                    }
                                    zzcewVar3.zzx(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzy)).longValue());
                                    return;
                                }
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            com.google.android.gms.ads.internal.zzt.zzy().zzc(zzcewVar2.zzi);
                        }
                        throw new IOException("Abort requested before buffering finished. ");
                    } catch (Throwable th5) {
                        th = th5;
                        str4 = longValue;
                        str = i;
                    }
                } else {
                    str = zzc;
                    zzcewVar = this;
                    try {
                        throw new IOException("Timeout reached. Limit: " + ((long) longValue) + " ms");
                    } catch (Throwable th6) {
                        th = th6;
                        str4 = "downloadTimeout";
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                str = zzc;
                zzcewVar = this;
            }
            try {
                throw th;
            } catch (Exception e2) {
                e = e2;
                String str5 = str4;
                zzcat.zzj("Failed to preload url " + zzcewVar.zzf + " Exception: " + e.getMessage());
                com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "VideoStreamExoPlayerCache.preload");
                release();
                zzcewVar.zzg(zzcewVar.zzf, str, str5, zzd(str5, e));
                zzcewVar2 = zzcewVar;
                com.google.android.gms.ads.internal.zzt.zzy().zzc(zzcewVar2.zzi);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcen
    public final void zzf() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzg(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzi(final boolean z, final long j) {
        final zzcdc zzcdcVar = (zzcdc) this.zzc.get();
        if (zzcdcVar != null) {
            zzcbg.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceu
                @Override // java.lang.Runnable
                public final void run() {
                    zzcdc.this.zzv(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzk(String str, Exception exc) {
        zzcat.zzk("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzl(String str, Exception exc) {
        zzcat.zzk("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzm(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcen
    public final void zzp(int i) {
        this.zze.zzJ(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcen
    public final void zzq(int i) {
        this.zze.zzK(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcen
    public final void zzr(int i) {
        this.zze.zzM(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcen
    public final void zzs(int i) {
        this.zze.zzN(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcen
    public final boolean zzt(String str) {
        return zzu(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzcen] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.google.android.gms.internal.ads.zzcen
    public final boolean zzu(String str, String[] strArr) {
        ?? r6;
        String str2;
        ?? r5;
        long j;
        long j2;
        long j3;
        ?? r1;
        long j4;
        String str3;
        long j5;
        long j6;
        boolean z;
        long j7;
        long j8;
        long j9;
        long j10;
        zzcew zzcewVar = this;
        String str4 = str;
        zzcewVar.zzf = str4;
        String str5 = MRAIDPresenter.ERROR;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            zzcewVar.zze.zzF(uriArr, zzcewVar.zzb);
            zzcdc zzcdcVar = (zzcdc) zzcewVar.zzc.get();
            if (zzcdcVar != null) {
                zzcdcVar.zzt(zzc, zzcewVar);
            }
            Clock zzB = com.google.android.gms.ads.internal.zzt.zzB();
            long currentTimeMillis = zzB.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzy)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzx)).longValue() * 1000;
            long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzw)).intValue();
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbO)).booleanValue();
            long j11 = -1;
            long j12 = intValue;
            while (true) {
                synchronized (this) {
                    try {
                        if (zzB.currentTimeMillis() - currentTimeMillis <= longValue2) {
                            if (!zzcewVar.zzg) {
                                if (zzcewVar.zzh) {
                                    break;
                                }
                                if (zzcewVar.zze.zzV()) {
                                    long zzz = zzcewVar.zze.zzz();
                                    if (zzz > 0) {
                                        long zzv = zzcewVar.zze.zzv();
                                        if (zzv != j11) {
                                            if (zzv > 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (booleanValue) {
                                                j7 = zzcewVar.zze.zzA();
                                            } else {
                                                j7 = -1;
                                            }
                                            if (booleanValue) {
                                                j8 = zzcewVar.zze.zzx();
                                            } else {
                                                j8 = -1;
                                            }
                                            if (booleanValue) {
                                                j9 = zzcewVar.zze.zzB();
                                            } else {
                                                j9 = -1;
                                            }
                                            try {
                                                j = j12;
                                                j10 = zzz;
                                                j2 = longValue2;
                                                j4 = longValue;
                                                str3 = zzc;
                                            } catch (Throwable th) {
                                                th = th;
                                                str3 = zzc;
                                            }
                                            try {
                                                zzo(str, zzc, zzv, j10, z, j7, j8, j9, zzcct.zzs(), zzcct.zzu());
                                                j6 = zzv;
                                                j5 = zzz;
                                                r6 = j10;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r5 = this;
                                                r6 = str;
                                                str2 = str3;
                                                try {
                                                    throw th;
                                                } catch (Exception e) {
                                                    e = e;
                                                    String str6 = str5;
                                                    zzcat.zzj("Failed to preload url " + r6 + " Exception: " + e.getMessage());
                                                    com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "VideoStreamExoPlayerCache.preload");
                                                    release();
                                                    r5.zzg(r6, str2, str6, zzd(str6, e));
                                                    return false;
                                                }
                                            }
                                        } else {
                                            j = j12;
                                            j2 = longValue2;
                                            j4 = longValue;
                                            str3 = zzc;
                                            j5 = zzz;
                                            j6 = j11;
                                            r6 = j12;
                                        }
                                        r5 = (zzv > j5 ? 1 : (zzv == j5 ? 0 : -1));
                                        if (r5 >= 0) {
                                            zzj(str, str3, j5);
                                        } else {
                                            try {
                                                zzcew zzcewVar2 = this;
                                                r6 = str;
                                                str2 = str3;
                                                if (zzcewVar2.zze.zzw() < j || zzv <= 0) {
                                                    j3 = j4;
                                                    r1 = j6;
                                                    r5 = zzcewVar2;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                throw th;
                                            }
                                        }
                                    } else {
                                        j = j12;
                                        j2 = longValue2;
                                        r6 = str4;
                                        str2 = zzc;
                                        r5 = zzcewVar;
                                        j3 = longValue;
                                        r1 = j11;
                                    }
                                    try {
                                        try {
                                            r5.wait(j3);
                                        } catch (InterruptedException unused) {
                                            throw new IOException("Wait interrupted.");
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        str5 = r1;
                                        throw th;
                                    }
                                } else {
                                    throw new IOException("ExoPlayer was released during preloading.");
                                }
                            } else {
                                throw new IOException("Abort requested before buffering finished. ");
                            }
                        } else {
                            throw new IOException("Timeout reached. Limit: " + longValue2 + " ms");
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r6 = str4;
                        str2 = zzc;
                        r5 = zzcewVar;
                    }
                }
                longValue = j3;
                zzcewVar = r5;
                str4 = r6;
                zzc = str2;
                j12 = j;
                longValue2 = j2;
                j11 = r1;
            }
            return true;
        } catch (Exception e2) {
            e = e2;
            r6 = str4;
            str2 = zzc;
            r5 = zzcewVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzv() {
        zzcat.zzj("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzcen
    public final boolean zzw(String str, String[] strArr, zzcef zzcefVar) {
        this.zzf = str;
        this.zzi = zzcefVar;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzcdc zzcdcVar = (zzcdc) this.zzc.get();
            if (zzcdcVar != null) {
                zzcdcVar.zzt(zzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e) {
            zzcat.zzj("Failed to preload url " + str + " Exception: " + e.getMessage());
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, zzc, MRAIDPresenter.ERROR, zzd(MRAIDPresenter.ERROR, e));
            return false;
        }
    }
}
