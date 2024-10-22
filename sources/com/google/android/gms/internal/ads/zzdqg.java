package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdqg {
    private final Map zza = new HashMap();

    public final synchronized zzdqf zza(String str) {
        return (zzdqf) this.zza.get(str);
    }

    public final zzdqf zzb(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzdqf zza = zza((String) it.next());
            if (zza != null) {
                return zza;
            }
        }
        return null;
    }

    public final String zzc(String str) {
        zzbrj zzbrjVar;
        zzdqf zza = zza(str);
        if (zza != null && (zzbrjVar = zza.zzb) != null) {
            return zzbrjVar.toString();
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzd(java.lang.String r6, com.google.android.gms.internal.ads.zzfej r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.Map r0 = r5.zza     // Catch: java.lang.Throwable -> L46
            boolean r0 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto Lb
            monitor-exit(r5)
            return
        Lb:
            com.google.android.gms.internal.ads.zzdqf r0 = new com.google.android.gms.internal.ads.zzdqf     // Catch: java.lang.Throwable -> L46
            r1 = 0
            if (r7 != 0) goto L12
        L10:
            r2 = r1
            goto L19
        L12:
            com.google.android.gms.internal.ads.zzbrj r2 = r7.zze()     // Catch: com.google.android.gms.internal.ads.zzfds -> L17 java.lang.Throwable -> L46
            goto L19
        L17:
            goto L10
        L19:
            if (r7 != 0) goto L1c
            goto L20
        L1c:
            com.google.android.gms.internal.ads.zzbrj r1 = r7.zzf()     // Catch: com.google.android.gms.internal.ads.zzfds -> L20 java.lang.Throwable -> L46
        L20:
            com.google.android.gms.internal.ads.zzbca r3 = com.google.android.gms.internal.ads.zzbci.zzjc     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.internal.ads.zzbcg r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r3 = r4.zzb(r3)     // Catch: java.lang.Throwable -> L46
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L46
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L46
            r4 = 1
            if (r3 != 0) goto L34
            goto L3c
        L34:
            r3 = 0
            if (r7 != 0) goto L39
        L37:
            r4 = 0
            goto L3c
        L39:
            r7.zzC()     // Catch: com.google.android.gms.internal.ads.zzfds -> L37 java.lang.Throwable -> L46
        L3c:
            r0.<init>(r6, r2, r1, r4)     // Catch: java.lang.Throwable -> L46
            java.util.Map r7 = r5.zza     // Catch: java.lang.Throwable -> L46
            r7.put(r6, r0)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r5)
            return
        L46:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdqg.zzd(java.lang.String, com.google.android.gms.internal.ads.zzfej):void");
    }

    public final synchronized void zze(String str, zzbqv zzbqvVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdqf(str, zzbqvVar.zzf(), zzbqvVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
