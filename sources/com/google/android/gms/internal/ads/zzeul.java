package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ml1;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class zzeul implements zzetw {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzgad zzc;
    private final ScheduledExecutorService zzd;
    private final zzees zze;
    private final zzfdn zzf;

    public zzeul(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzgad zzgadVar, ScheduledExecutorService scheduledExecutorService, zzees zzeesVar, zzfdn zzfdnVar) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzgadVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzeesVar;
        this.zzf = zzfdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:            if (r5.zzf.zzd.zzy != com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.getValue()) goto L10;     */
    @Override // com.google.android.gms.internal.ads.zzetw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ml1 zzb() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzjC
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L74
            com.google.android.gms.ads.internal.util.zzg r0 = r5.zza
            boolean r0 = r0.zzR()
            if (r0 == 0) goto L74
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzjF
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzfdn r0 = r5.zzf
            com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState r1 = com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED
            int r1 = r1.getValue()
            com.google.android.gms.ads.internal.client.zzl r0 = r0.zzd
            int r0 = r0.zzy
            if (r0 == r1) goto L74
        L3a:
            com.google.android.gms.internal.ads.zzees r0 = r5.zze
            r1 = 0
            ml1 r0 = r0.zza(r1)
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzjD
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.util.concurrent.ScheduledExecutorService r3 = r5.zzd
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            ml1 r0 = com.google.android.gms.internal.ads.zzfzt.zzo(r0, r1, r4, r3)
            com.google.android.gms.internal.ads.zzfzk r0 = com.google.android.gms.internal.ads.zzfzk.zzu(r0)
            com.google.android.gms.internal.ads.zzgad r1 = r5.zzc
            com.google.android.gms.internal.ads.zzeuj r2 = new com.google.android.gms.internal.ads.zzfza() { // from class: com.google.android.gms.internal.ads.zzeuj
                static {
                    /*
                        com.google.android.gms.internal.ads.zzeuj r0 = new com.google.android.gms.internal.ads.zzeuj
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.gms.internal.ads.zzeuj) com.google.android.gms.internal.ads.zzeuj.zza com.google.android.gms.internal.ads.zzeuj
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeuj.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeuj.<init>():void");
                }

                @Override // com.google.android.gms.internal.ads.zzfza
                public final defpackage.ml1 zza(java.lang.Object r6) {
                    /*
                        r5 = this;
                        t51 r6 = (defpackage.t51) r6
                        com.google.android.gms.internal.ads.zzgxr r0 = com.google.android.gms.internal.ads.zzgxs.zza()
                        java.util.List r6 = r6.f4451a
                        java.util.Iterator r6 = r6.iterator()
                    Lc:
                        boolean r1 = r6.hasNext()
                        if (r1 == 0) goto L35
                        java.lang.Object r1 = r6.next()
                        ba3 r1 = (defpackage.ba3) r1
                        com.google.android.gms.internal.ads.zzgxp r2 = com.google.android.gms.internal.ads.zzgxq.zza()
                        int r3 = r1.c
                        r2.zzc(r3)
                        long r3 = r1.f433b
                        r2.zza(r3)
                        long r3 = r1.f432a
                        r2.zzb(r3)
                        com.google.android.gms.internal.ads.zzgtz r1 = r2.zzal()
                        com.google.android.gms.internal.ads.zzgxq r1 = (com.google.android.gms.internal.ads.zzgxq) r1
                        r0.zza(r1)
                        goto Lc
                    L35:
                        com.google.android.gms.internal.ads.zzgtz r6 = r0.zzal()
                        com.google.android.gms.internal.ads.zzgxs r6 = (com.google.android.gms.internal.ads.zzgxs) r6
                        byte[] r6 = r6.zzax()
                        r0 = 1
                        java.lang.String r6 = android.util.Base64.encodeToString(r6, r0)
                        com.google.android.gms.internal.ads.zzeun r1 = new com.google.android.gms.internal.ads.zzeun
                        r2 = 0
                        r1.<init>(r6, r0, r2)
                        ml1 r6 = com.google.android.gms.internal.ads.zzfzt.zzh(r1)
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeuj.zza(java.lang.Object):ml1");
                }
            }
            ml1 r0 = com.google.android.gms.internal.ads.zzfzt.zzn(r0, r2, r1)
            com.google.android.gms.internal.ads.zzeuk r1 = new com.google.android.gms.internal.ads.zzeuk
            r1.<init>()
            com.google.android.gms.internal.ads.zzgad r2 = r5.zzc
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            ml1 r0 = com.google.android.gms.internal.ads.zzfzt.zzf(r0, r3, r1, r2)
            return r0
        L74:
            com.google.android.gms.internal.ads.zzeun r0 = new com.google.android.gms.internal.ads.zzeun
            r1 = -1
            r2 = 0
            java.lang.String r3 = ""
            r0.<init>(r3, r1, r2)
            ml1 r0 = com.google.android.gms.internal.ads.zzfzt.zzh(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeul.zzb():ml1");
    }

    public final /* synthetic */ ml1 zzc(Throwable th) throws Exception {
        zzeun zzeunVar;
        zzbty.zza(this.zzb).zzf(th, "TopicsSignal.fetchTopicsSignal");
        if (th instanceof SecurityException) {
            zzeunVar = new zzeun("", 2, null);
        } else if (th instanceof IllegalStateException) {
            zzeunVar = new zzeun("", 3, null);
        } else if (th instanceof IllegalArgumentException) {
            zzeunVar = new zzeun("", 4, null);
        } else if (th instanceof TimeoutException) {
            zzeunVar = new zzeun("", 5, null);
        } else {
            zzeunVar = new zzeun("", 0, null);
        }
        return zzfzt.zzh(zzeunVar);
    }
}
