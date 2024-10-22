package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzic extends zzid {
    private boolean zza;

    public zzic(zzhf zzhfVar) {
        super(zzhfVar);
        this.zzu.zzaa();
    }

    public final void zzab() {
        if (zzae()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzac() {
        if (!this.zza) {
            if (!zzo()) {
                this.zzu.zzz();
                this.zza = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void zzad() {
        if (!this.zza) {
            zzz();
            this.zzu.zzz();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final boolean zzae() {
        if (this.zza) {
            return true;
        }
        return false;
    }

    public abstract boolean zzo();

    public void zzz() {
    }
}
