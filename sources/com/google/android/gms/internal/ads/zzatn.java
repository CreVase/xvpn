package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzatn extends zzaud {
    private final zzash zzi;

    public zzatn(zzasp zzaspVar, String str, String str2, zzaom zzaomVar, int i, int i2, zzash zzashVar) {
        super(zzaspVar, "tfuuP59pzWN+H8zv1geT3jADiBKBGMQRjmCPoIvL5f45Lvl5qgJ0PgBqZF4WPnQj", "MIrDuKB7N0O22daoYjLtFOJg5TtVRHK1+0ktwmGNtdU=", zzaomVar, i, 94);
        this.zzi = zzashVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int intValue = ((Integer) this.zzf.invoke(null, this.zzi.zza())).intValue();
        synchronized (this.zze) {
            this.zze.zzae(zzapa.zza(intValue));
        }
    }
}
