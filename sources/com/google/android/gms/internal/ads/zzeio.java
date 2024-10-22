package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import defpackage.ml1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzeio {
    private final Clock zza;
    private final zzeip zzb;
    private final zzfjx zzc;
    private final LinkedHashMap zzd = new LinkedHashMap();
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgO)).booleanValue();
    private final zzeez zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzeio(Clock clock, zzeip zzeipVar, zzeez zzeezVar, zzfjx zzfjxVar) {
        this.zza = clock;
        this.zzb = zzeipVar;
        this.zzf = zzeezVar;
        this.zzc = zzfjxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean zzq(zzfcr zzfcrVar) {
        zzein zzeinVar = (zzein) this.zzd.get(zzfcrVar);
        if (zzeinVar == null) {
            return false;
        }
        if (zzeinVar.zzc != 8) {
            return false;
        }
        return true;
    }

    public final synchronized long zza() {
        return this.zzh;
    }

    public final synchronized ml1 zzf(zzfde zzfdeVar, zzfcr zzfcrVar, ml1 ml1Var, zzfjt zzfjtVar) {
        zzfcv zzfcvVar = zzfdeVar.zzb.zzb;
        long elapsedRealtime = this.zza.elapsedRealtime();
        String str = zzfcrVar.zzy;
        if (str != null) {
            this.zzd.put(zzfcrVar, new zzein(str, zzfcrVar.zzah, 7, 0L, null));
            zzfzt.zzr(ml1Var, new zzeim(this, elapsedRealtime, zzfcvVar, zzfcrVar, str, zzfjtVar, zzfdeVar), zzcbg.zzf);
        }
        return ml1Var;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.zzd.entrySet().iterator();
        while (it.hasNext()) {
            zzein zzeinVar = (zzein) ((Map.Entry) it.next()).getValue();
            if (zzeinVar.zzc != Integer.MAX_VALUE) {
                arrayList.add(zzeinVar.toString());
            }
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void zzi(zzfcr zzfcrVar) {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
        if (zzfcrVar != null) {
            this.zzf.zze(zzfcrVar);
        }
        this.zzg = true;
    }

    public final synchronized void zzj() {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
    }

    public final synchronized void zzk(List list) {
        this.zzi = this.zza.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfcr zzfcrVar = (zzfcr) it.next();
            if (!TextUtils.isEmpty(zzfcrVar.zzy)) {
                this.zzd.put(zzfcrVar, new zzein(zzfcrVar.zzy, zzfcrVar.zzah, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void zzl() {
        this.zzi = this.zza.elapsedRealtime();
    }

    public final synchronized void zzm(zzfcr zzfcrVar) {
        zzein zzeinVar = (zzein) this.zzd.get(zzfcrVar);
        if (zzeinVar != null && !this.zzg) {
            zzeinVar.zzc = 8;
        }
    }
}
