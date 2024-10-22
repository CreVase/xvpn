package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzato extends zzaud {
    private final zzars zzi;
    private final long zzj;
    private final long zzk;

    public zzato(zzasp zzaspVar, String str, String str2, zzaom zzaomVar, int i, int i2, zzars zzarsVar, long j, long j2) {
        super(zzaspVar, "KHu8Xbxzr2mu9S25CNgKE5zXBf18Zj2waiAPYoFRjyhOXCyg+mYLv2x/JjCH7GjX", "NOrE2caDXO4nkFR2Fjy7NgGPKtPlIg1WAorknI/US68=", zzaomVar, i, 11);
        this.zzi = zzarsVar;
        this.zzj = j;
        this.zzk = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzars zzarsVar = this.zzi;
        if (zzarsVar != null) {
            zzarq zzarqVar = new zzarq((String) this.zzf.invoke(null, zzarsVar.zzb(), Long.valueOf(this.zzj), Long.valueOf(this.zzk)));
            synchronized (this.zze) {
                this.zze.zzz(zzarqVar.zza.longValue());
                if (zzarqVar.zzb.longValue() >= 0) {
                    this.zze.zzQ(zzarqVar.zzb.longValue());
                }
                if (zzarqVar.zzc.longValue() >= 0) {
                    this.zze.zzf(zzarqVar.zzc.longValue());
                }
            }
        }
    }
}
