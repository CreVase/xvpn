package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import defpackage.ml1;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzeur implements zzetw {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzbzt zzg;

    public zzeur(zzbzt zzbztVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        this.zzg = zzbztVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
        this.zze = z;
        this.zzf = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzaT)).booleanValue()) {
            return zzfzt.zze((zzfzk) zzfzt.zzo(zzfzt.zzm(zzfzk.zzu(this.zzg.zza(this.zza, this.zzd)), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzeup
                @Override // com.google.android.gms.internal.ads.zzfsk
                public final Object apply(Object obj) {
                    return zzeur.this.zzc((AdvertisingIdClient.Info) obj);
                }
            }, this.zzc), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzaU)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzeuq
                @Override // com.google.android.gms.internal.ads.zzfsk
                public final Object apply(Object obj) {
                    return zzeur.this.zzd((Throwable) obj);
                }
            }, this.zzc);
        }
        return zzfzt.zzg(new Exception("Did not ad Ad ID into query param."));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:            com.google.android.gms.ads.internal.zzt.zzo().zzu(r0, "AdIdInfoSignalSource.getPaidV1");        r0 = new com.google.android.gms.internal.ads.zzfpt();     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbci.zzcP)).booleanValue() != false) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbci.zzcO)).booleanValue() == false) goto L6;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:            r1 = com.google.android.gms.internal.ads.zzfpw.zzj(r7.zza);        r8.getClass();        r2 = r8.getId();        r2.getClass();        r0 = r1.zzi(r2, r7.zza.getPackageName(), ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbci.zzcV)).longValue(), r7.zzf);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzeus zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzfpt r0 = new com.google.android.gms.internal.ads.zzfpt
            r0.<init>()
            boolean r1 = r7.zze
            if (r1 != 0) goto L1b
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzcO
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L31
        L1b:
            boolean r1 = r7.zze
            if (r1 == 0) goto L6f
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzcP
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L6f
        L31:
            android.content.Context r0 = r7.zza     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.zzfpw r1 = com.google.android.gms.internal.ads.zzfpw.zzj(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            r8.getClass()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r2 = r8.getId()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            android.content.Context r0 = r7.zza     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r3 = r0.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzcV     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.zzbcg r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Object r0 = r4.zzb(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            long r4 = r0.longValue()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            boolean r6 = r7.zzf     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.zzfpt r0 = r1.zzi(r2, r3, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            goto L6f
        L5e:
            r0 = move-exception
            goto L61
        L60:
            r0 = move-exception
        L61:
            java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
            com.google.android.gms.internal.ads.zzcac r2 = com.google.android.gms.ads.internal.zzt.zzo()
            r2.zzu(r0, r1)
            com.google.android.gms.internal.ads.zzfpt r0 = new com.google.android.gms.internal.ads.zzfpt
            r0.<init>()
        L6f:
            com.google.android.gms.internal.ads.zzeus r1 = new com.google.android.gms.internal.ads.zzeus
            r2 = 0
            r1.<init>(r8, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeur.zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient$Info):com.google.android.gms.internal.ads.zzeus");
    }

    public final /* synthetic */ zzeus zzd(Throwable th) {
        String string;
        com.google.android.gms.ads.internal.client.zzay.zzb();
        ContentResolver contentResolver = this.zza.getContentResolver();
        if (contentResolver == null) {
            string = null;
        } else {
            string = Settings.Secure.getString(contentResolver, "android_id");
        }
        return new zzeus(null, string, new zzfpt());
    }
}
