package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlb extends zzaw {
    private final /* synthetic */ zzkp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlb(zzkp zzkpVar, zzif zzifVar) {
        super(zzifVar);
        this.zza = zzkpVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaw
    public final void zzb() {
        this.zza.zzj().zzu().zza("Tasks have been queued for a long time");
    }
}
