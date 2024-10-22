package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzcdu extends zzcci implements TextureView.SurfaceTextureListener, zzccs {
    private final zzcdc zzc;
    private final zzcdd zzd;
    private final zzcdb zze;
    private zzcch zzf;
    private Surface zzg;
    private zzcct zzh;
    private String zzi;
    private String[] zzj;
    private boolean zzk;
    private int zzl;
    private zzcda zzm;
    private final boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private float zzs;

    public zzcdu(Context context, zzcdd zzcddVar, zzcdc zzcdcVar, boolean z, boolean z2, zzcdb zzcdbVar) {
        super(context);
        this.zzl = 1;
        this.zzc = zzcdcVar;
        this.zzd = zzcddVar;
        this.zzn = z;
        this.zze = zzcdbVar;
        setSurfaceTextureListener(this);
        zzcddVar.zza(this);
    }

    private static String zzT(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzU() {
        zzcct zzcctVar = this.zzh;
        if (zzcctVar != null) {
            zzcctVar.zzQ(true);
        }
    }

    private final void zzV() {
        if (this.zzo) {
            return;
        }
        this.zzo = true;
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdt
            @Override // java.lang.Runnable
            public final void run() {
                zzcdu.this.zzI();
            }
        });
        zzn();
        this.zzd.zzb();
        if (this.zzp) {
            zzp();
        }
    }

    private final void zzW(boolean z, Integer num) {
        zzcct zzcctVar = this.zzh;
        if (zzcctVar != null && !z) {
            zzcctVar.zzP(num);
            return;
        }
        if (this.zzi != null && this.zzg != null) {
            if (z) {
                if (zzad()) {
                    zzcctVar.zzU();
                    zzY();
                } else {
                    zzcat.zzj("No valid ExoPlayerAdapter exists when switch source.");
                    return;
                }
            }
            if (this.zzi.startsWith("cache:")) {
                zzcen zzp = this.zzc.zzp(this.zzi);
                if (zzp instanceof zzcew) {
                    zzcct zza = ((zzcew) zzp).zza();
                    this.zzh = zza;
                    zza.zzP(num);
                    if (!this.zzh.zzV()) {
                        zzcat.zzj("Precached video player has been released.");
                        return;
                    }
                } else if (zzp instanceof zzcet) {
                    zzcet zzcetVar = (zzcet) zzp;
                    String zzF = zzF();
                    ByteBuffer zzk = zzcetVar.zzk();
                    boolean zzl = zzcetVar.zzl();
                    String zzi = zzcetVar.zzi();
                    if (zzi == null) {
                        zzcat.zzj("Stream cache URL is null.");
                        return;
                    } else {
                        zzcct zzE = zzE(num);
                        this.zzh = zzE;
                        zzE.zzG(new Uri[]{Uri.parse(zzi)}, zzF, zzk, zzl);
                    }
                } else {
                    zzcat.zzj("Stream cache miss: ".concat(String.valueOf(this.zzi)));
                    return;
                }
            } else {
                this.zzh = zzE(num);
                String zzF2 = zzF();
                Uri[] uriArr = new Uri[this.zzj.length];
                int i = 0;
                while (true) {
                    String[] strArr = this.zzj;
                    if (i >= strArr.length) {
                        break;
                    }
                    uriArr[i] = Uri.parse(strArr[i]);
                    i++;
                }
                this.zzh.zzF(uriArr, zzF2);
            }
            this.zzh.zzL(this);
            zzZ(this.zzg, false);
            if (this.zzh.zzV()) {
                int zzt = this.zzh.zzt();
                this.zzl = zzt;
                if (zzt == 3) {
                    zzV();
                }
            }
        }
    }

    private final void zzX() {
        zzcct zzcctVar = this.zzh;
        if (zzcctVar != null) {
            zzcctVar.zzQ(false);
        }
    }

    private final void zzY() {
        if (this.zzh != null) {
            zzZ(null, true);
            zzcct zzcctVar = this.zzh;
            if (zzcctVar != null) {
                zzcctVar.zzL(null);
                this.zzh.zzH();
                this.zzh = null;
            }
            this.zzl = 1;
            this.zzk = false;
            this.zzo = false;
            this.zzp = false;
        }
    }

    private final void zzZ(Surface surface, boolean z) {
        zzcct zzcctVar = this.zzh;
        if (zzcctVar != null) {
            try {
                zzcctVar.zzS(surface, z);
                return;
            } catch (IOException e) {
                zzcat.zzk("", e);
                return;
            }
        }
        zzcat.zzj("Trying to set surface before player is initialized.");
    }

    private final void zzaa() {
        zzab(this.zzq, this.zzr);
    }

    private final void zzab(int i, int i2) {
        float f;
        if (i2 > 0) {
            f = i / i2;
        } else {
            f = 1.0f;
        }
        if (this.zzs != f) {
            this.zzs = f;
            requestLayout();
        }
    }

    private final boolean zzac() {
        return zzad() && this.zzl != 1;
    }

    private final boolean zzad() {
        zzcct zzcctVar = this.zzh;
        return (zzcctVar == null || !zzcctVar.zzV() || this.zzk) ? false : true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.zzs;
        if (f != 0.0f && this.zzm == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcda zzcdaVar = this.zzm;
        if (zzcdaVar != null) {
            zzcdaVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.zzn) {
            zzcda zzcdaVar = new zzcda(getContext());
            this.zzm = zzcdaVar;
            zzcdaVar.zzd(surfaceTexture, i, i2);
            this.zzm.start();
            SurfaceTexture zzb = this.zzm.zzb();
            if (zzb != null) {
                surfaceTexture = zzb;
            } else {
                this.zzm.zze();
                this.zzm = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzg = surface;
        if (this.zzh == null) {
            zzW(false, null);
        } else {
            zzZ(surface, true);
            if (!this.zze.zza) {
                zzU();
            }
        }
        if (this.zzq != 0 && this.zzr != 0) {
            zzaa();
        } else {
            zzab(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdq
            @Override // java.lang.Runnable
            public final void run() {
                zzcdu.this.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzcda zzcdaVar = this.zzm;
        if (zzcdaVar != null) {
            zzcdaVar.zze();
            this.zzm = null;
        }
        if (this.zzh != null) {
            zzX();
            Surface surface = this.zzg;
            if (surface != null) {
                surface.release();
            }
            this.zzg = null;
            zzZ(null, true);
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdm
            @Override // java.lang.Runnable
            public final void run() {
                zzcdu.this.zzN();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        zzcda zzcdaVar = this.zzm;
        if (zzcdaVar != null) {
            zzcdaVar.zzc(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdl
            @Override // java.lang.Runnable
            public final void run() {
                zzcdu.this.zzO(i, i2);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzf(this);
        this.zza.zza(surfaceTexture, this.zzf);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        com.google.android.gms.ads.internal.util.zze.zza("AdExoPlayerView3 window visibility changed to " + i);
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdk
            @Override // java.lang.Runnable
            public final void run() {
                zzcdu.this.zzQ(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzA(int i) {
        zzcct zzcctVar = this.zzh;
        if (zzcctVar != null) {
            zzcctVar.zzN(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzB(int i) {
        zzcct zzcctVar = this.zzh;
        if (zzcctVar != null) {
            zzcctVar.zzR(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzC(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzj = new String[]{str};
        } else {
            this.zzj = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzi;
        boolean z = false;
        if (this.zze.zzl && str2 != null && !str.equals(str2) && this.zzl == 4) {
            z = true;
        }
        this.zzi = str;
        zzW(z, num);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzD(int i, int i2) {
        this.zzq = i;
        this.zzr = i2;
        zzaa();
    }

    public final zzcct zzE(Integer num) {
        zzcdb zzcdbVar = this.zze;
        zzcdc zzcdcVar = this.zzc;
        zzcfo zzcfoVar = new zzcfo(zzcdcVar.getContext(), zzcdbVar, zzcdcVar, num);
        zzcat.zzi("ExoPlayerAdapter initialized.");
        return zzcfoVar;
    }

    public final String zzF() {
        zzcdc zzcdcVar = this.zzc;
        return com.google.android.gms.ads.internal.zzt.zzp().zzc(zzcdcVar.getContext(), zzcdcVar.zzn().zza);
    }

    public final /* synthetic */ void zzG(String str) {
        zzcch zzcchVar = this.zzf;
        if (zzcchVar != null) {
            zzcchVar.zzb("ExoPlayerAdapter error", str);
        }
    }

    public final /* synthetic */ void zzH() {
        zzcch zzcchVar = this.zzf;
        if (zzcchVar != null) {
            zzcchVar.zza();
        }
    }

    public final /* synthetic */ void zzI() {
        zzcch zzcchVar = this.zzf;
        if (zzcchVar != null) {
            zzcchVar.zzf();
        }
    }

    public final /* synthetic */ void zzJ(boolean z, long j) {
        this.zzc.zzv(z, j);
    }

    public final /* synthetic */ void zzK(String str) {
        zzcch zzcchVar = this.zzf;
        if (zzcchVar != null) {
            zzcchVar.zzc("ExoPlayerAdapter exception", str);
        }
    }

    public final /* synthetic */ void zzL() {
        zzcch zzcchVar = this.zzf;
        if (zzcchVar != null) {
            zzcchVar.zzg();
        }
    }

    public final /* synthetic */ void zzM() {
        zzcch zzcchVar = this.zzf;
        if (zzcchVar != null) {
            zzcchVar.zzh();
        }
    }

    public final /* synthetic */ void zzN() {
        zzcch zzcchVar = this.zzf;
        if (zzcchVar != null) {
            zzcchVar.zzi();
        }
    }

    public final /* synthetic */ void zzO(int i, int i2) {
        zzcch zzcchVar = this.zzf;
        if (zzcchVar != null) {
            zzcchVar.zzj(i, i2);
        }
    }

    public final /* synthetic */ void zzP() {
        float zza = this.zzb.zza();
        zzcct zzcctVar = this.zzh;
        if (zzcctVar != null) {
            try {
                zzcctVar.zzT(zza, false);
                return;
            } catch (IOException e) {
                zzcat.zzk("", e);
                return;
            }
        }
        zzcat.zzj("Trying to set volume before player is initialized.");
    }

    public final /* synthetic */ void zzQ(int i) {
        zzcch zzcchVar = this.zzf;
        if (zzcchVar != null) {
            zzcchVar.onWindowVisibilityChanged(i);
        }
    }

    public final /* synthetic */ void zzR() {
        zzcch zzcchVar = this.zzf;
        if (zzcchVar != null) {
            zzcchVar.zzd();
        }
    }

    public final /* synthetic */ void zzS() {
        zzcch zzcchVar = this.zzf;
        if (zzcchVar != null) {
            zzcchVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final int zza() {
        if (zzac()) {
            return (int) this.zzh.zzy();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final int zzb() {
        zzcct zzcctVar = this.zzh;
        if (zzcctVar != null) {
            return zzcctVar.zzr();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final int zzc() {
        if (zzac()) {
            return (int) this.zzh.zzz();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final int zzd() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final int zze() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final long zzf() {
        zzcct zzcctVar = this.zzh;
        if (zzcctVar != null) {
            return zzcctVar.zzx();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final long zzg() {
        zzcct zzcctVar = this.zzh;
        if (zzcctVar != null) {
            return zzcctVar.zzA();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final long zzh() {
        zzcct zzcctVar = this.zzh;
        if (zzcctVar != null) {
            return zzcctVar.zzB();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzi(final boolean z, final long j) {
        if (this.zzc != null) {
            zzcbg.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdn
                @Override // java.lang.Runnable
                public final void run() {
                    zzcdu.this.zzJ(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final String zzj() {
        return "ExoPlayer/2".concat(true != this.zzn ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzk(String str, Exception exc) {
        final String zzT = zzT(str, exc);
        zzcat.zzj("ExoPlayerAdapter error: ".concat(zzT));
        this.zzk = true;
        if (this.zze.zza) {
            zzX();
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdr
            @Override // java.lang.Runnable
            public final void run() {
                zzcdu.this.zzG(zzT);
            }
        });
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzl(String str, Exception exc) {
        final String zzT = zzT("onLoadException", exc);
        zzcat.zzj("ExoPlayerAdapter exception: ".concat(zzT));
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdo
            @Override // java.lang.Runnable
            public final void run() {
                zzcdu.this.zzK(zzT);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzm(int i) {
        if (this.zzl != i) {
            this.zzl = i;
            if (i != 3) {
                if (i == 4) {
                    if (this.zze.zza) {
                        zzX();
                    }
                    this.zzd.zze();
                    this.zzb.zzc();
                    com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcds
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcdu.this.zzH();
                        }
                    });
                    return;
                }
                return;
            }
            zzV();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcci, com.google.android.gms.internal.ads.zzcdf
    public final void zzn() {
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdj
            @Override // java.lang.Runnable
            public final void run() {
                zzcdu.this.zzP();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzo() {
        if (zzac()) {
            if (this.zze.zza) {
                zzX();
            }
            this.zzh.zzO(false);
            this.zzd.zze();
            this.zzb.zzc();
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdp
                @Override // java.lang.Runnable
                public final void run() {
                    zzcdu.this.zzR();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzp() {
        if (zzac()) {
            if (this.zze.zza) {
                zzU();
            }
            this.zzh.zzO(true);
            this.zzd.zzc();
            this.zzb.zzb();
            this.zza.zzb();
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdi
                @Override // java.lang.Runnable
                public final void run() {
                    zzcdu.this.zzS();
                }
            });
            return;
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzq(int i) {
        if (zzac()) {
            this.zzh.zzI(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzr(zzcch zzcchVar) {
        this.zzf = zzcchVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzs(String str) {
        if (str != null) {
            zzC(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzt() {
        if (zzad()) {
            this.zzh.zzU();
            zzY();
        }
        this.zzd.zze();
        this.zzb.zzc();
        this.zzd.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzu(float f, float f2) {
        zzcda zzcdaVar = this.zzm;
        if (zzcdaVar != null) {
            zzcdaVar.zzf(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzv() {
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdh
            @Override // java.lang.Runnable
            public final void run() {
                zzcdu.this.zzL();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final Integer zzw() {
        zzcct zzcctVar = this.zzh;
        if (zzcctVar != null) {
            return zzcctVar.zzC();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzx(int i) {
        zzcct zzcctVar = this.zzh;
        if (zzcctVar != null) {
            zzcctVar.zzJ(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzy(int i) {
        zzcct zzcctVar = this.zzh;
        if (zzcctVar != null) {
            zzcctVar.zzK(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzz(int i) {
        zzcct zzcctVar = this.zzh;
        if (zzcctVar != null) {
            zzcctVar.zzM(i);
        }
    }
}
