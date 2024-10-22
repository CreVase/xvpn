package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzcgx extends com.google.android.gms.ads.internal.client.zzdp {
    private final zzcdc zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private com.google.android.gms.ads.internal.client.zzdt zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbgw zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzcgx(zzcdc zzcdcVar, float f, boolean z, boolean z2) {
        this.zza = zzcdcVar;
        this.zzi = f;
        this.zzc = z;
        this.zzd = z2;
    }

    private final void zzw(final int i, final int i2, final boolean z, final boolean z2) {
        zzcbg.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgw
            @Override // java.lang.Runnable
            public final void run() {
                zzcgx.this.zzd(i, i2, z, z2);
            }
        });
    }

    private final void zzx(String str, Map map) {
        final HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put("action", str);
        zzcbg.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgv
            @Override // java.lang.Runnable
            public final void run() {
                zzcgx.this.zzr(hashMap);
            }
        });
    }

    public final void zzc(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.zzb) {
            z2 = true;
            if (f2 == this.zzi && f3 == this.zzk) {
                z2 = false;
            }
            this.zzi = f2;
            this.zzj = f;
            z3 = this.zzh;
            this.zzh = z;
            i2 = this.zze;
            this.zze = i;
            float f4 = this.zzk;
            this.zzk = f3;
            if (Math.abs(f3 - f4) > 1.0E-4f) {
                this.zza.zzF().invalidate();
            }
        }
        if (z2) {
            try {
                zzbgw zzbgwVar = this.zzn;
                if (zzbgwVar != null) {
                    zzbgwVar.zze();
                }
            } catch (RemoteException e) {
                zzcat.zzl("#007 Could not call remote method.", e);
            }
        }
        zzw(i2, i, z3, z);
    }

    public final /* synthetic */ void zzd(int i, int i2, boolean z, boolean z2) {
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        com.google.android.gms.ads.internal.client.zzdt zzdtVar;
        com.google.android.gms.ads.internal.client.zzdt zzdtVar2;
        com.google.android.gms.ads.internal.client.zzdt zzdtVar3;
        synchronized (this.zzb) {
            boolean z8 = this.zzg;
            boolean z9 = false;
            if (!z8 && i2 == 1) {
                i2 = 1;
                i3 = 1;
                z3 = true;
            } else {
                i3 = i2;
                z3 = false;
            }
            if (i != i2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 && i3 == 1) {
                z5 = true;
                i3 = 1;
            } else {
                z5 = false;
            }
            if (z4 && i3 == 2) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z4 && i3 == 3) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z8 || z3) {
                z9 = true;
            }
            this.zzg = z9;
            if (z3) {
                try {
                    com.google.android.gms.ads.internal.client.zzdt zzdtVar4 = this.zzf;
                    if (zzdtVar4 != null) {
                        zzdtVar4.zzi();
                    }
                } catch (RemoteException e) {
                    zzcat.zzl("#007 Could not call remote method.", e);
                }
            }
            if (z5 && (zzdtVar3 = this.zzf) != null) {
                zzdtVar3.zzh();
            }
            if (z6 && (zzdtVar2 = this.zzf) != null) {
                zzdtVar2.zzg();
            }
            if (z7) {
                com.google.android.gms.ads.internal.client.zzdt zzdtVar5 = this.zzf;
                if (zzdtVar5 != null) {
                    zzdtVar5.zze();
                }
                this.zza.zzw();
            }
            if (z != z2 && (zzdtVar = this.zzf) != null) {
                zzdtVar.zzf(z2);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() {
        float f;
        synchronized (this.zzb) {
            f = this.zzk;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() {
        float f;
        synchronized (this.zzb) {
            f = this.zzj;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() {
        float f;
        synchronized (this.zzb) {
            f = this.zzi;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() {
        int i;
        synchronized (this.zzb) {
            i = this.zze;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final com.google.android.gms.ads.internal.client.zzdt zzi() throws RemoteException {
        com.google.android.gms.ads.internal.client.zzdt zzdtVar;
        synchronized (this.zzb) {
            zzdtVar = this.zzf;
        }
        return zzdtVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z) {
        String str;
        if (true != z) {
            str = "unmute";
        } else {
            str = "mute";
        }
        zzx(str, null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() {
        zzx("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() {
        zzx("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        synchronized (this.zzb) {
            this.zzf = zzdtVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() {
        zzx("stop", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() {
        boolean z;
        Object obj = this.zzb;
        boolean zzp = zzp();
        synchronized (obj) {
            z = false;
            if (!zzp) {
                try {
                    if (this.zzm && this.zzd) {
                        z = true;
                    }
                } finally {
                }
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzp() {
        boolean z;
        synchronized (this.zzb) {
            z = false;
            if (this.zzc && this.zzl) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zzh;
        }
        return z;
    }

    public final /* synthetic */ void zzr(Map map) {
        this.zza.zzd("pubVideoCmd", map);
    }

    public final void zzs(com.google.android.gms.ads.internal.client.zzfl zzflVar) {
        String str;
        String str2;
        String str3;
        Object obj = this.zzb;
        boolean z = zzflVar.zza;
        boolean z2 = zzflVar.zzb;
        boolean z3 = zzflVar.zzc;
        synchronized (obj) {
            this.zzl = z2;
            this.zzm = z3;
        }
        if (true != z) {
            str = "0";
        } else {
            str = "1";
        }
        String str4 = str;
        if (true != z2) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        String str5 = str2;
        if (true != z3) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        zzx("initialState", CollectionUtils.mapOf("muteStart", str4, "customControlsRequested", str5, "clickToExpandRequested", str3));
    }

    public final void zzt(float f) {
        synchronized (this.zzb) {
            this.zzj = f;
        }
    }

    public final void zzu() {
        boolean z;
        int i;
        synchronized (this.zzb) {
            z = this.zzh;
            i = this.zze;
            this.zze = 3;
        }
        zzw(i, 3, z, z);
    }

    public final void zzv(zzbgw zzbgwVar) {
        synchronized (this.zzb) {
            this.zzn = zzbgwVar;
        }
    }
}
