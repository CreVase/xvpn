package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class zzgup {
    private static final zzgtl zzb = zzgtl.zza;
    protected volatile zzgvj zza;
    private volatile zzgsr zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgup)) {
            return false;
        }
        zzgup zzgupVar = (zzgup) obj;
        zzgvj zzgvjVar = this.zza;
        zzgvj zzgvjVar2 = zzgupVar.zza;
        if (zzgvjVar == null && zzgvjVar2 == null) {
            return zzb().equals(zzgupVar.zzb());
        }
        if (zzgvjVar != null && zzgvjVar2 != null) {
            return zzgvjVar.equals(zzgvjVar2);
        }
        if (zzgvjVar != null) {
            zzgupVar.zzc(zzgvjVar.zzbf());
            return zzgvjVar.equals(zzgupVar.zza);
        }
        zzc(zzgvjVar2.zzbf());
        return this.zza.equals(zzgvjVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzgsn) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzaz();
        }
        return 0;
    }

    public final zzgsr zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            if (this.zza == null) {
                this.zzc = zzgsr.zzb;
            } else {
                this.zzc = this.zza.zzau();
            }
            return this.zzc;
        }
    }

    public final void zzc(zzgvj zzgvjVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzgvjVar;
                    this.zzc = zzgsr.zzb;
                } catch (zzgul unused) {
                    this.zza = zzgvjVar;
                    this.zzc = zzgsr.zzb;
                }
            }
        }
    }
}
