package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class zzfiv implements zzfit {
    private final Context zza;
    private final int zzo;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzp = 2;
    private int zzq = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private boolean zzm = false;
    private boolean zzn = false;

    public zzfiv(Context context, int i) {
        this.zza = context;
        this.zzo = i;
    }

    public final synchronized zzfiv zzH(int i) {
        this.zzp = i;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfit
    public final /* bridge */ /* synthetic */ zzfit zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfit
    public final /* bridge */ /* synthetic */ zzfit zzb(zzfdd zzfddVar) {
        zzr(zzfddVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfit
    public final /* bridge */ /* synthetic */ zzfit zzc(String str) {
        zzs(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfit
    public final /* bridge */ /* synthetic */ zzfit zzd(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfit
    public final /* bridge */ /* synthetic */ zzfit zze(String str) {
        zzu(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfit
    public final /* bridge */ /* synthetic */ zzfit zzf(boolean z) {
        zzv(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfit
    public final /* bridge */ /* synthetic */ zzfit zzg(Throwable th) {
        zzw(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfit
    public final /* bridge */ /* synthetic */ zzfit zzh() {
        zzx();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfit
    public final /* bridge */ /* synthetic */ zzfit zzi() {
        zzy();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfit
    public final synchronized boolean zzj() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzfit
    public final boolean zzk() {
        if (!TextUtils.isEmpty(this.zzh)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfit
    public final synchronized zzfix zzl() {
        if (this.zzm) {
            return null;
        }
        this.zzm = true;
        if (!this.zzn) {
            zzx();
        }
        if (this.zzc < 0) {
            zzy();
        }
        return new zzfix(this, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfit
    public final /* bridge */ /* synthetic */ zzfit zzm(int i) {
        zzH(i);
        return this;
    }

    public final synchronized zzfiv zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        IBinder iBinder = zzeVar.zze;
        if (iBinder == null) {
            return this;
        }
        zzcxe zzcxeVar = (zzcxe) iBinder;
        String zzk = zzcxeVar.zzk();
        if (!TextUtils.isEmpty(zzk)) {
            this.zzf = zzk;
        }
        String zzi = zzcxeVar.zzi();
        if (!TextUtils.isEmpty(zzi)) {
            this.zzg = zzi;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:            r2.zzg = r0.zzad;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.zzfiv zzr(com.google.android.gms.internal.ads.zzfdd r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzfcv r0 = r3.zzb     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L31
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L11
            com.google.android.gms.internal.ads.zzfcv r0 = r3.zzb     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L31
            r2.zzf = r0     // Catch: java.lang.Throwable -> L31
        L11:
            java.util.List r3 = r3.zza     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L31
        L17:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzfcr r0 = (com.google.android.gms.internal.ads.zzfcr) r0     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r0.zzad     // Catch: java.lang.Throwable -> L31
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L17
            java.lang.String r3 = r0.zzad     // Catch: java.lang.Throwable -> L31
            r2.zzg = r3     // Catch: java.lang.Throwable -> L31
        L2f:
            monitor-exit(r2)
            return r2
        L31:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfiv.zzr(com.google.android.gms.internal.ads.zzfdd):com.google.android.gms.internal.ads.zzfiv");
    }

    public final synchronized zzfiv zzs(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziA)).booleanValue()) {
            this.zzl = str;
        }
        return this;
    }

    public final synchronized zzfiv zzt(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfiv zzu(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfiv zzv(boolean z) {
        this.zzd = z;
        return this;
    }

    public final synchronized zzfiv zzw(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziA)).booleanValue()) {
            this.zzk = zzbty.zzd(th);
            this.zzj = (String) zzftj.zzc(zzfsh.zzc('\n')).zzd(zzbty.zzc(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfiv zzx() {
        Configuration configuration;
        this.zze = com.google.android.gms.ads.internal.zzt.zzq().zzn(this.zza);
        Resources resources = this.zza.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzq = i;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        this.zzn = true;
        return this;
    }

    public final synchronized zzfiv zzy() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        return this;
    }
}
