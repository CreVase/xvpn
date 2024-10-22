package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgvb implements zzgwd {
    private static final zzgvh zza = new zzguz();
    private final zzgvh zzb;

    public zzgvb() {
        zzgvh zzgvhVar;
        zzgvh[] zzgvhVarArr = new zzgvh[2];
        zzgvhVarArr[0] = zzgtu.zza();
        try {
            zzgvhVar = (zzgvh) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzgvhVar = zza;
        }
        zzgvhVarArr[1] = zzgvhVar;
        zzgva zzgvaVar = new zzgva(zzgvhVarArr);
        byte[] bArr = zzguj.zzd;
        this.zzb = zzgvaVar;
    }

    private static boolean zzb(zzgvg zzgvgVar) {
        if (zzgvgVar.zzc() - 1 != 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgwd
    public final zzgwc zza(Class cls) {
        zzgwe.zzr(cls);
        zzgvg zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zzgtz.class.isAssignableFrom(cls)) {
                return zzgvn.zzc(zzgwe.zzn(), zzgto.zzb(), zzb.zza());
            }
            return zzgvn.zzc(zzgwe.zzm(), zzgto.zza(), zzb.zza());
        }
        if (zzgtz.class.isAssignableFrom(cls)) {
            if (zzb(zzb)) {
                return zzgvm.zzl(cls, zzb, zzgvp.zzb(), zzgux.zze(), zzgwe.zzn(), zzgto.zzb(), zzgvf.zzb());
            }
            return zzgvm.zzl(cls, zzb, zzgvp.zzb(), zzgux.zze(), zzgwe.zzn(), null, zzgvf.zzb());
        }
        if (zzb(zzb)) {
            return zzgvm.zzl(cls, zzb, zzgvp.zza(), zzgux.zzd(), zzgwe.zzm(), zzgto.zza(), zzgvf.zza());
        }
        return zzgvm.zzl(cls, zzb, zzgvp.zza(), zzgux.zzd(), zzgwe.zzm(), null, zzgvf.zza());
    }
}
