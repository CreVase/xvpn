package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ml1;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzeiu implements zzfza {
    private final zzfhr zza;
    private final zzcxn zzb;
    private final zzfjt zzc;
    private final zzfjx zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcta zzg;
    private final zzeio zzh;
    private final zzeez zzi;
    private final Context zzj;
    private final zzfje zzk;
    private final zzehy zzl;

    public zzeiu(Context context, zzfhr zzfhrVar, zzeio zzeioVar, zzcxn zzcxnVar, zzfjt zzfjtVar, zzfjx zzfjxVar, zzcta zzctaVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzeez zzeezVar, zzfje zzfjeVar, zzehy zzehyVar) {
        this.zzj = context;
        this.zza = zzfhrVar;
        this.zzh = zzeioVar;
        this.zzb = zzcxnVar;
        this.zzc = zzfjtVar;
        this.zzd = zzfjxVar;
        this.zzg = zzctaVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzeezVar;
        this.zzk = zzfjeVar;
        this.zzl = zzehyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbci.zzfq)).booleanValue() == false) goto L20;     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String zzc(com.google.android.gms.internal.ads.zzfde r5) {
        /*
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzfr
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "No fill."
            r2 = 1
            if (r2 == r0) goto L18
            java.lang.String r0 = "No ad config."
            goto L19
        L18:
            r0 = r1
        L19:
            com.google.android.gms.internal.ads.zzfdd r2 = r5.zzb
            com.google.android.gms.internal.ads.zzfcv r2 = r2.zzb
            int r2 = r2.zze
            if (r2 == 0) goto L4c
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L3c
            if (r2 >= r4) goto L3c
            com.google.android.gms.internal.ads.zzbca r2 = com.google.android.gms.internal.ads.zzbci.zzfq
            com.google.android.gms.internal.ads.zzbcg r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L4c
            goto L4d
        L3c:
            if (r2 < r4) goto L45
            r0 = 400(0x190, float:5.6E-43)
            if (r2 >= r0) goto L45
            java.lang.String r1 = "No location header to follow redirect or too many redirects."
            goto L4d
        L45:
            java.lang.String r0 = "Received error HTTP response code: "
            java.lang.String r1 = defpackage.hx2.m(r0, r2)
            goto L4d
        L4c:
            r1 = r0
        L4d:
            com.google.android.gms.internal.ads.zzfdd r5 = r5.zzb
            com.google.android.gms.internal.ads.zzfcv r5 = r5.zzb
            com.google.android.gms.internal.ads.zzfct r5 = r5.zzi
            if (r5 == 0) goto L5a
            java.lang.String r5 = r5.zza()
            return r5
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeiu.zzc(com.google.android.gms.internal.ads.zzfde):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cf  */
    @Override // com.google.android.gms.internal.ads.zzfza
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ defpackage.ml1 zza(java.lang.Object r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeiu.zza(java.lang.Object):ml1");
    }

    public final /* synthetic */ ml1 zzb(zzfcr zzfcrVar, zzfde zzfdeVar, zzeeu zzeeuVar, Throwable th) throws Exception {
        zzfit zza = zzfis.zza(this.zzj, 12);
        zza.zzd(zzfcrVar.zzG);
        zza.zzh();
        ml1 zzo = zzfzt.zzo(zzeeuVar.zza(zzfdeVar, zzfcrVar), zzfcrVar.zzT, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zzf(zzfdeVar, zzfcrVar, zzo, this.zzc);
        zzfjd.zza(zzo, this.zzk, zza);
        return zzo;
    }
}
