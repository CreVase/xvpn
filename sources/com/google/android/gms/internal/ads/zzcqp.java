package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzcqp extends zzcsx {
    private final zzcgb zzc;
    private final int zzd;
    private final Context zze;
    private final zzcqe zzf;
    private final zzdhf zzg;
    private final zzdel zzh;
    private final zzcxy zzi;
    private final boolean zzj;
    private final zzcag zzk;
    private boolean zzl;

    public zzcqp(zzcsw zzcswVar, Context context, zzcgb zzcgbVar, int i, zzcqe zzcqeVar, zzdhf zzdhfVar, zzdel zzdelVar, zzcxy zzcxyVar, zzcag zzcagVar) {
        super(zzcswVar);
        this.zzl = false;
        this.zzc = zzcgbVar;
        this.zze = context;
        this.zzd = i;
        this.zzf = zzcqeVar;
        this.zzg = zzdhfVar;
        this.zzh = zzdelVar;
        this.zzi = zzcxyVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfh)).booleanValue();
        this.zzk = zzcagVar;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcsx
    public final void zzb() {
        super.zzb();
        zzcgb zzcgbVar = this.zzc;
        if (zzcgbVar != null) {
            zzcgbVar.destroy();
        }
    }

    public final void zzc(zzawj zzawjVar) {
        zzcgb zzcgbVar = this.zzc;
        if (zzcgbVar != null) {
            zzcgbVar.zzah(zzawjVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:            r3 = r3;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(android.app.Activity r3, com.google.android.gms.internal.ads.zzaww r4, boolean r5) throws android.os.RemoteException {
        /*
            r2 = this;
            if (r3 != 0) goto L4
            android.content.Context r3 = r2.zze
        L4:
            boolean r4 = r2.zzj
            if (r4 == 0) goto Ld
            com.google.android.gms.internal.ads.zzdel r4 = r2.zzh
            r4.zzb()
        Ld:
            com.google.android.gms.internal.ads.zzbca r4 = com.google.android.gms.internal.ads.zzbci.zzaA
            com.google.android.gms.internal.ads.zzbcg r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r0.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L61
            com.google.android.gms.ads.internal.zzt.zzp()
            boolean r4 = com.google.android.gms.ads.internal.util.zzt.zzF(r3)
            if (r4 == 0) goto L61
            java.lang.String r4 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.zzcat.zzj(r4)
            com.google.android.gms.internal.ads.zzcxy r4 = r2.zzi
            r4.zzb()
            com.google.android.gms.internal.ads.zzbca r4 = com.google.android.gms.internal.ads.zzbci.zzaB
            com.google.android.gms.internal.ads.zzbcg r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Ld2
            com.google.android.gms.internal.ads.zzfnb r4 = new com.google.android.gms.internal.ads.zzfnb
            android.content.Context r3 = r3.getApplicationContext()
            com.google.android.gms.ads.internal.util.zzbx r5 = com.google.android.gms.ads.internal.zzt.zzt()
            android.os.Looper r5 = r5.zzb()
            r4.<init>(r3, r5)
            com.google.android.gms.internal.ads.zzfde r3 = r2.zza
            com.google.android.gms.internal.ads.zzfdd r3 = r3.zzb
            com.google.android.gms.internal.ads.zzfcv r3 = r3.zzb
            java.lang.String r3 = r3.zzb
            r4.zza(r3)
            return
        L61:
            com.google.android.gms.internal.ads.zzbca r4 = com.google.android.gms.internal.ads.zzbci.zzkP
            com.google.android.gms.internal.ads.zzbcg r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r0.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto La0
            com.google.android.gms.internal.ads.zzcgb r4 = r2.zzc
            if (r4 == 0) goto La0
            com.google.android.gms.internal.ads.zzfcr r4 = r4.zzD()
            if (r4 == 0) goto La0
            boolean r1 = r4.zzas
            if (r1 == 0) goto La0
            int r4 = r4.zzat
            com.google.android.gms.internal.ads.zzcag r1 = r2.zzk
            int r1 = r1.zzb()
            if (r4 != r1) goto L8d
            goto La0
        L8d:
            java.lang.String r3 = "The app open consent form has been shown."
            com.google.android.gms.internal.ads.zzcat.zzj(r3)
            com.google.android.gms.internal.ads.zzcxy r3 = r2.zzi
            r4 = 12
            java.lang.String r5 = "The consent form has already been shown."
            com.google.android.gms.ads.internal.client.zze r4 = com.google.android.gms.internal.ads.zzfeo.zzd(r4, r5, r0)
            r3.zza(r4)
            return
        La0:
            boolean r4 = r2.zzl
            if (r4 == 0) goto Lb4
            java.lang.String r4 = "App open interstitial ad is already visible."
            com.google.android.gms.internal.ads.zzcat.zzj(r4)
            com.google.android.gms.internal.ads.zzcxy r4 = r2.zzi
            r1 = 10
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfeo.zzd(r1, r0, r0)
            r4.zza(r0)
        Lb4:
            boolean r4 = r2.zzl
            if (r4 != 0) goto Ld2
            com.google.android.gms.internal.ads.zzdhf r4 = r2.zzg     // Catch: com.google.android.gms.internal.ads.zzdhe -> Lcc
            com.google.android.gms.internal.ads.zzcxy r0 = r2.zzi     // Catch: com.google.android.gms.internal.ads.zzdhe -> Lcc
            r4.zza(r5, r3, r0)     // Catch: com.google.android.gms.internal.ads.zzdhe -> Lcc
            boolean r3 = r2.zzj     // Catch: com.google.android.gms.internal.ads.zzdhe -> Lcc
            if (r3 == 0) goto Lc8
            com.google.android.gms.internal.ads.zzdel r3 = r2.zzh     // Catch: com.google.android.gms.internal.ads.zzdhe -> Lcc
            r3.zza()     // Catch: com.google.android.gms.internal.ads.zzdhe -> Lcc
        Lc8:
            r3 = 1
            r2.zzl = r3
            return
        Lcc:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzcxy r4 = r2.zzi
            r4.zzc(r3)
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcqp.zzd(android.app.Activity, com.google.android.gms.internal.ads.zzaww, boolean):void");
    }

    public final void zze(long j, int i) {
        this.zzf.zza(j, i);
    }
}
