package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzamr {
    public static final boolean zza = zzams.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    public final void finalize() throws Throwable {
        if (!this.zzc) {
            zzb("Request on the loose");
            zzams.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    public final synchronized void zza(String str, long j) {
        if (!this.zzc) {
            this.zzb.add(new zzamq(str, j, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    public final synchronized void zzb(String str) {
        long j;
        this.zzc = true;
        if (this.zzb.size() == 0) {
            j = 0;
        } else {
            j = ((zzamq) this.zzb.get(r1.size() - 1)).zzc - ((zzamq) this.zzb.get(0)).zzc;
        }
        if (j <= 0) {
            return;
        }
        long j2 = ((zzamq) this.zzb.get(0)).zzc;
        zzams.zza("(%-4d ms) %s", Long.valueOf(j), str);
        for (zzamq zzamqVar : this.zzb) {
            long j3 = zzamqVar.zzc;
            zzams.zza("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(zzamqVar.zzb), zzamqVar.zza);
            j2 = j3;
        }
    }
}
