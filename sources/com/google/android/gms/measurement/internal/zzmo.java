package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzmo extends zzml {
    private boolean zza;

    public zzmo(zzmp zzmpVar) {
        super(zzmpVar);
        this.zzf.zzu();
    }

    public final void zzak() {
        if (zzam()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzal() {
        if (!this.zza) {
            zzc();
            this.zzf.zzt();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final boolean zzam() {
        if (this.zza) {
            return true;
        }
        return false;
    }

    public abstract boolean zzc();
}
