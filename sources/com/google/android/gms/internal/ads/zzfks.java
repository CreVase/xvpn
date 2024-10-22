package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzfks implements zzfkv {
    private static final zzfks zzb = new zzfks(new zzfkw());
    protected final zzflr zza = new zzflr();
    private Date zzc;
    private boolean zzd;
    private final zzfkw zze;
    private boolean zzf;

    private zzfks(zzfkw zzfkwVar) {
        this.zze = zzfkwVar;
    }

    public static zzfks zza() {
        return zzb;
    }

    public final Date zzb() {
        Date date = this.zzc;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfkv
    public final void zzc(boolean z) {
        if (!this.zzf && z) {
            Date date = new Date();
            Date date2 = this.zzc;
            if (date2 == null || date.after(date2)) {
                this.zzc = date;
                if (this.zzd) {
                    Iterator it = zzfku.zza().zzb().iterator();
                    while (it.hasNext()) {
                        ((zzfkg) it.next()).zzg().zze(zzb());
                    }
                }
            }
        }
        this.zzf = z;
    }

    public final void zzd(Context context) {
        if (!this.zzd) {
            this.zze.zzd(context);
            this.zze.zze(this);
            this.zze.zzf();
            this.zzf = this.zze.zza;
            this.zzd = true;
        }
    }
}
