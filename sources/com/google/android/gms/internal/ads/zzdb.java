package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public class zzdb {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private final zzfvs zzh;
    private final zzfvs zzi;
    private final int zzj;
    private final int zzk;
    private final zzfvs zzl;
    private zzfvs zzm;
    private int zzn;
    private final HashMap zzo;
    private final HashSet zzp;

    @Deprecated
    public zzdb() {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = Integer.MAX_VALUE;
        this.zzf = Integer.MAX_VALUE;
        this.zzg = true;
        this.zzh = zzfvs.zzl();
        this.zzi = zzfvs.zzl();
        this.zzj = Integer.MAX_VALUE;
        this.zzk = Integer.MAX_VALUE;
        this.zzl = zzfvs.zzl();
        this.zzm = zzfvs.zzl();
        this.zzn = 0;
        this.zzo = new HashMap();
        this.zzp = new HashSet();
    }

    public final zzdb zzd(Context context) {
        CaptioningManager captioningManager;
        if ((zzfk.zza >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.zzn = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.zzm = zzfvs.zzm(zzfk.zzz(locale));
            }
        }
        return this;
    }

    public zzdb zze(int i, int i2, boolean z) {
        this.zze = i;
        this.zzf = i2;
        this.zzg = true;
        return this;
    }

    public zzdb(zzdc zzdcVar) {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = zzdcVar.zzl;
        this.zzf = zzdcVar.zzm;
        this.zzg = zzdcVar.zzn;
        this.zzh = zzdcVar.zzo;
        this.zzi = zzdcVar.zzq;
        this.zzj = Integer.MAX_VALUE;
        this.zzk = Integer.MAX_VALUE;
        this.zzl = zzdcVar.zzu;
        this.zzm = zzdcVar.zzw;
        this.zzn = zzdcVar.zzx;
        this.zzp = new HashSet(zzdcVar.zzD);
        this.zzo = new HashMap(zzdcVar.zzC);
    }
}
