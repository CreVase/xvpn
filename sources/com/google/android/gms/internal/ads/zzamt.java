package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
final class zzamt implements zzamf {
    private final Map zza = new HashMap();
    private final zzals zzb;
    private final BlockingQueue zzc;
    private final zzalx zzd;

    public zzamt(zzals zzalsVar, BlockingQueue blockingQueue, zzalx zzalxVar) {
        this.zzd = zzalxVar;
        this.zzb = zzalsVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final synchronized void zza(zzamg zzamgVar) {
        Map map = this.zza;
        String zzj = zzamgVar.zzj();
        List list = (List) map.remove(zzj);
        if (list != null && !list.isEmpty()) {
            if (zzams.zzb) {
                zzams.zzd("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), zzj);
            }
            zzamg zzamgVar2 = (zzamg) list.remove(0);
            this.zza.put(zzj, list);
            zzamgVar2.zzu(this);
            try {
                this.zzc.put(zzamgVar2);
            } catch (InterruptedException e) {
                zzams.zzb("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.zzb.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzb(zzamg zzamgVar, zzamm zzammVar) {
        List list;
        zzalp zzalpVar = zzammVar.zzb;
        if (zzalpVar != null && !zzalpVar.zza(System.currentTimeMillis())) {
            String zzj = zzamgVar.zzj();
            synchronized (this) {
                list = (List) this.zza.remove(zzj);
            }
            if (list != null) {
                if (zzams.zzb) {
                    zzams.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), zzj);
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.zzd.zzb((zzamg) it.next(), zzammVar, null);
                }
                return;
            }
            return;
        }
        zza(zzamgVar);
    }

    public final synchronized boolean zzc(zzamg zzamgVar) {
        Map map = this.zza;
        String zzj = zzamgVar.zzj();
        if (map.containsKey(zzj)) {
            List list = (List) this.zza.get(zzj);
            if (list == null) {
                list = new ArrayList();
            }
            zzamgVar.zzm("waiting-for-response");
            list.add(zzamgVar);
            this.zza.put(zzj, list);
            if (zzams.zzb) {
                zzams.zza("Request for cacheKey=%s is in flight, putting on hold.", zzj);
            }
            return true;
        }
        this.zza.put(zzj, null);
        zzamgVar.zzu(this);
        if (zzams.zzb) {
            zzams.zza("new request, sending to network %s", zzj);
        }
        return false;
    }
}
