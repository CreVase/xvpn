package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.ml1;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class zzexz implements zzena {
    protected final zzchw zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzeyp zzd;
    private final zzfai zze;
    private final zzcaz zzf;
    private final ViewGroup zzg;
    private final zzfjh zzh;
    private final zzfdl zzi;
    private ml1 zzj;

    public zzexz(Context context, Executor executor, zzchw zzchwVar, zzfai zzfaiVar, zzeyp zzeypVar, zzfdl zzfdlVar, zzcaz zzcazVar) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzchwVar;
        this.zze = zzfaiVar;
        this.zzd = zzeypVar;
        this.zzi = zzfdlVar;
        this.zzf = zzcazVar;
        this.zzg = new FrameLayout(context);
        this.zzh = zzchwVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzcwr zzm(zzfag zzfagVar) {
        zzexy zzexyVar = (zzexy) zzfagVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhV)).booleanValue()) {
            zzcqs zzcqsVar = new zzcqs(this.zzg);
            zzcwt zzcwtVar = new zzcwt();
            zzcwtVar.zze(this.zzb);
            zzcwtVar.zzi(zzexyVar.zza);
            zzcwv zzj = zzcwtVar.zzj();
            zzdda zzddaVar = new zzdda();
            zzddaVar.zzc(this.zzd, this.zzc);
            zzddaVar.zzl(this.zzd, this.zzc);
            return zze(zzcqsVar, zzj, zzddaVar.zzn());
        }
        zzeyp zzi = zzeyp.zzi(this.zzd);
        zzdda zzddaVar2 = new zzdda();
        zzddaVar2.zzb(zzi, this.zzc);
        zzddaVar2.zzg(zzi, this.zzc);
        zzddaVar2.zzh(zzi, this.zzc);
        zzddaVar2.zzi(zzi, this.zzc);
        zzddaVar2.zzc(zzi, this.zzc);
        zzddaVar2.zzl(zzi, this.zzc);
        zzddaVar2.zzm(zzi);
        zzcqs zzcqsVar2 = new zzcqs(this.zzg);
        zzcwt zzcwtVar2 = new zzcwt();
        zzcwtVar2.zze(this.zzb);
        zzcwtVar2.zzi(zzexyVar.zza);
        return zze(zzcqsVar2, zzcwtVar2.zzj(), zzddaVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzena
    public final boolean zza() {
        ml1 ml1Var = this.zzj;
        if (ml1Var != null && !ml1Var.isDone()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[Catch: all -> 0x00f4, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:8:0x0026, B:12:0x0045, B:16:0x0056, B:20:0x005c, B:22:0x006c, B:24:0x0074, B:25:0x0089, B:27:0x00a2, B:29:0x00a6, B:30:0x00af, B:34:0x003e), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[Catch: all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:8:0x0026, B:12:0x0045, B:16:0x0056, B:20:0x005c, B:22:0x006c, B:24:0x0074, B:25:0x0089, B:27:0x00a2, B:29:0x00a6, B:30:0x00af, B:34:0x003e), top: B:2:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzena
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzl r8, java.lang.String r9, com.google.android.gms.internal.ads.zzemy r10, com.google.android.gms.internal.ads.zzemz r11) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzexz.zzb(com.google.android.gms.ads.internal.client.zzl, java.lang.String, com.google.android.gms.internal.ads.zzemy, com.google.android.gms.internal.ads.zzemz):boolean");
    }

    public abstract zzcwr zze(zzcqs zzcqsVar, zzcwv zzcwvVar, zzddc zzddcVar);

    public final /* synthetic */ void zzk() {
        this.zzd.zzbF(zzfeo.zzd(6, null, null));
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi.zzt(zzwVar);
    }
}
