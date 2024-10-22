package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzayq extends zzgtz implements zzgvk {
    private static final zzayq zzb;
    private zzgui zzd = zzgtz.zzaN();

    static {
        zzayq zzayqVar = new zzayq();
        zzb = zzayqVar;
        zzgtz.zzaU(zzayq.class, zzayqVar);
    }

    private zzayq() {
    }

    public static zzayk zza() {
        return (zzayk) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzayq zzayqVar, zzayj zzayjVar) {
        zzayjVar.getClass();
        zzgui zzguiVar = zzayqVar.zzd;
        if (!zzguiVar.zzc()) {
            zzayqVar.zzd = zzgtz.zzaO(zzguiVar);
        }
        zzayqVar.zzd.add(zzayjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    zzayc zzaycVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzayk(zzaycVar);
                }
                return new zzayq();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzayj.class});
        }
        return (byte) 1;
    }
}
