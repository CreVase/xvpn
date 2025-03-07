package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjx implements zzle {
    private static final zzkk zza = new zzka();
    private final zzkk zzb;

    public zzjx() {
        this(new zzkc(zziy.zza(), zza()));
    }

    private static zzkk zza() {
        try {
            return (zzkk) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return zza;
        }
    }

    private zzjx(zzkk zzkkVar) {
        this.zzb = (zzkk) zziz.zza(zzkkVar, "messageInfoFactory");
    }

    @Override // com.google.android.gms.internal.measurement.zzle
    public final <T> zzlb<T> zza(Class<T> cls) {
        zzld.zza((Class<?>) cls);
        zzkh zza2 = this.zzb.zza(cls);
        if (zza2.zzc()) {
            if (zzix.class.isAssignableFrom(cls)) {
                return zzkp.zza(zzld.zzb(), zzin.zzb(), zza2.zza());
            }
            return zzkp.zza(zzld.zza(), zzin.zza(), zza2.zza());
        }
        if (zzix.class.isAssignableFrom(cls)) {
            if (zza(zza2)) {
                return zzkn.zza(cls, zza2, zzkt.zzb(), zzjs.zzb(), zzld.zzb(), zzin.zzb(), zzki.zzb());
            }
            return zzkn.zza(cls, zza2, zzkt.zzb(), zzjs.zzb(), zzld.zzb(), (zzim<?>) null, zzki.zzb());
        }
        if (zza(zza2)) {
            return zzkn.zza(cls, zza2, zzkt.zza(), zzjs.zza(), zzld.zza(), zzin.zza(), zzki.zza());
        }
        return zzkn.zza(cls, zza2, zzkt.zza(), zzjs.zza(), zzld.zza(), (zzim<?>) null, zzki.zza());
    }

    private static boolean zza(zzkh zzkhVar) {
        return zzjz.zza[zzkhVar.zzb().ordinal()] != 1;
    }
}
