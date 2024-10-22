package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzmm extends zzaw {
    private final /* synthetic */ zzmj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmm(zzmj zzmjVar, zzif zzifVar) {
        super(zzifVar);
        this.zza = zzmjVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaw
    public final void zzb() {
        this.zza.zzu();
        this.zza.zzj().zzp().zza("Starting upload from DelayedRunnable");
        this.zza.zzf.zzw();
    }
}
