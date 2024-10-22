package com.google.android.gms.internal.ads;

import defpackage.kg;
import defpackage.ml1;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdli implements zzcyf {
    private final zzdjj zza;
    private final zzdjo zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdli(zzdjj zzdjjVar, zzdjo zzdjoVar, Executor executor, Executor executor2) {
        this.zza = zzdjjVar;
        this.zzb = zzdjoVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(final zzcgb zzcgbVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdlg
            @Override // java.lang.Runnable
            public final void run() {
                zzcgb.this.zzd("onSdkImpression", new kg());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyf
    public final void zzq() {
        if (!this.zzb.zzd()) {
            return;
        }
        zzdjj zzdjjVar = this.zza;
        zzfkc zzu = zzdjjVar.zzu();
        if (zzu == null && zzdjjVar.zzw() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeY)).booleanValue()) {
            zzdjj zzdjjVar2 = this.zza;
            ml1 zzw = zzdjjVar2.zzw();
            zzcbl zzp = zzdjjVar2.zzp();
            if (zzw != null && zzp != null) {
                zzfzt.zzr(zzfzt.zzl(zzw, zzp), new zzdlh(this), this.zzd);
                return;
            }
            return;
        }
        if (zzu == null) {
            return;
        }
        zzdjj zzdjjVar3 = this.zza;
        zzcgb zzr = zzdjjVar3.zzr();
        zzcgb zzs = zzdjjVar3.zzs();
        if (zzr == null) {
            if (zzs != null) {
                zzr = zzs;
            } else {
                zzr = null;
            }
        }
        if (zzr != null) {
            zzb(zzr);
        }
    }
}
