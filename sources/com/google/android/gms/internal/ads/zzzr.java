package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;

/* loaded from: classes.dex */
public final class zzzr {
    private final zzyx zza = new zzyx();
    private final zzzn zzb;
    private final zzzq zzc;
    private boolean zzd;
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzzr(Context context) {
        zzzn zzznVar;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i = zzfk.zza;
            zzznVar = zzzp.zzc(applicationContext);
            if (zzznVar == null) {
                zzznVar = zzzo.zzc(applicationContext);
            }
        } else {
            zzznVar = null;
        }
        this.zzb = zzznVar;
        this.zzc = zzznVar != null ? zzzq.zza() : null;
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    public static /* synthetic */ void zzb(zzzr zzzrVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            zzzrVar.zzk = refreshRate;
            zzzrVar.zzl = (refreshRate * 80) / 100;
        } else {
            zzer.zzf("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            zzzrVar.zzk = -9223372036854775807L;
            zzzrVar.zzl = -9223372036854775807L;
        }
    }

    private final void zzk() {
        Surface surface;
        if (zzfk.zza >= 30 && (surface = this.zze) != null && this.zzj != Integer.MIN_VALUE && this.zzh != 0.0f) {
            this.zzh = 0.0f;
            zzzm.zza(surface, 0.0f);
        }
    }

    private final void zzl() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:            if (java.lang.Math.abs(r0 - r10.zzg) >= r2) goto L31;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:            r3 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:            if (r3 == false) goto L33;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:            if (r10.zza.zzb() >= 30) goto L31;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzm() {
        /*
            r10 = this;
            int r0 = com.google.android.gms.internal.ads.zzfk.zza
            r1 = 30
            if (r0 < r1) goto L6d
            android.view.Surface r0 = r10.zze
            if (r0 != 0) goto Lb
            goto L6d
        Lb:
            com.google.android.gms.internal.ads.zzyx r0 = r10.zza
            boolean r0 = r0.zzg()
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzyx r0 = r10.zza
            float r0 = r0.zza()
            goto L1c
        L1a:
            float r0 = r10.zzf
        L1c:
            float r2 = r10.zzg
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L23
            return
        L23:
            r3 = 1
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L58
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L58
            com.google.android.gms.internal.ads.zzyx r1 = r10.zza
            boolean r1 = r1.zzg()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.zzyx r1 = r10.zza
            long r6 = r1.zzd()
            r8 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L4b
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L4b:
            float r1 = r10.zzg
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L63
            goto L64
        L58:
            if (r6 != 0) goto L68
            com.google.android.gms.internal.ads.zzyx r2 = r10.zza
            int r2 = r2.zzb()
            if (r2 < r1) goto L63
            goto L64
        L63:
            r3 = 0
        L64:
            if (r3 == 0) goto L67
            goto L68
        L67:
            return
        L68:
            r10.zzg = r0
            r10.zzn(r5)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzr.zzm():void");
    }

    private final void zzn(boolean z) {
        Surface surface;
        if (zzfk.zza >= 30 && (surface = this.zze) != null && this.zzj != Integer.MIN_VALUE) {
            float f = 0.0f;
            if (this.zzd) {
                float f2 = this.zzg;
                if (f2 != -1.0f) {
                    f = this.zzi * f2;
                }
            }
            if (!z && this.zzh == f) {
                return;
            }
            this.zzh = f;
            zzzm.zza(surface, f);
        }
    }

    public final long zza(long j) {
        long j2;
        if (this.zzp != -1 && this.zza.zzg()) {
            long zzc = this.zza.zzc();
            long j3 = this.zzq + (((float) ((this.zzm - this.zzp) * zzc)) / this.zzi);
            if (Math.abs(j - j3) > 20000000) {
                zzl();
            } else {
                j = j3;
            }
        }
        this.zzn = this.zzm;
        this.zzo = j;
        zzzq zzzqVar = this.zzc;
        if (zzzqVar != null && this.zzk != -9223372036854775807L) {
            long j4 = zzzqVar.zza;
            if (j4 == -9223372036854775807L) {
                return j;
            }
            long j5 = this.zzk;
            long j6 = (((j - j4) / j5) * j5) + j4;
            if (j <= j6) {
                j2 = j6 - j5;
            } else {
                j2 = j6;
                j6 = j5 + j6;
            }
            long j7 = this.zzl;
            if (j6 - j >= j - j2) {
                j6 = j2;
            }
            return j6 - j7;
        }
        return j;
    }

    public final void zzc(float f) {
        this.zzf = f;
        this.zza.zzf();
        zzm();
    }

    public final void zzd(long j) {
        long j2 = this.zzn;
        if (j2 != -1) {
            this.zzp = j2;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zze(j * 1000);
        zzm();
    }

    public final void zze(float f) {
        this.zzi = f;
        zzl();
        zzn(false);
    }

    public final void zzf() {
        zzl();
    }

    public final void zzg() {
        this.zzd = true;
        zzl();
        if (this.zzb != null) {
            zzzq zzzqVar = this.zzc;
            zzzqVar.getClass();
            zzzqVar.zzb();
            this.zzb.zzb(new zzzk(this));
        }
        zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzzn zzznVar = this.zzb;
        if (zzznVar != null) {
            zzznVar.zza();
            zzzq zzzqVar = this.zzc;
            zzzqVar.getClass();
            zzzqVar.zzc();
        }
        zzk();
    }

    public final void zzi(Surface surface) {
        int i = zzfk.zza;
        boolean zza = zzzl.zza(surface);
        Surface surface2 = this.zze;
        if (true == zza) {
            surface = null;
        }
        if (surface2 == surface) {
            return;
        }
        zzk();
        this.zze = surface;
        zzn(true);
    }

    public final void zzj(int i) {
        if (this.zzj == i) {
            return;
        }
        this.zzj = i;
        zzn(true);
    }
}
