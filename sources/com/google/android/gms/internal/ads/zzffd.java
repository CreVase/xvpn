package com.google.android.gms.internal.ads;

import defpackage.hx2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzffd {
    private final zzffc zza = new zzffc();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    public final zzffc zza() {
        zzffc zzffcVar = this.zza;
        zzffc clone = zzffcVar.clone();
        zzffcVar.zza = false;
        zzffcVar.zzb = false;
        return clone;
    }

    public final String zzb() {
        StringBuilder sb = new StringBuilder("\n\tPool does not exist: ");
        sb.append(this.zzd);
        sb.append("\n\tNew pools created: ");
        sb.append(this.zzb);
        sb.append("\n\tPools removed: ");
        sb.append(this.zzc);
        sb.append("\n\tEntries added: ");
        sb.append(this.zzf);
        sb.append("\n\tNo entries retrieved: ");
        return hx2.r(sb, this.zze, "\n");
    }

    public final void zzc() {
        this.zzf++;
    }

    public final void zzd() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zze() {
        this.zze++;
    }

    public final void zzf() {
        this.zzd++;
    }

    public final void zzg() {
        this.zzc++;
        this.zza.zzb = true;
    }
}
