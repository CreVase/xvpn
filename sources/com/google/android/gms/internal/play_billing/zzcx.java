package com.google.android.gms.internal.play_billing;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcx implements zzdq {
    private static final zzdd zza = new zzcv();
    private final zzdd zzb;

    public zzcx() {
        zzdd zzddVar;
        zzdd[] zzddVarArr = new zzdd[2];
        zzddVarArr[0] = zzbw.zza();
        try {
            zzddVar = (zzdd) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzddVar = zza;
        }
        zzddVarArr[1] = zzddVar;
        zzcw zzcwVar = new zzcw(zzddVarArr);
        byte[] bArr = zzcg.zzd;
        this.zzb = zzcwVar;
    }

    private static boolean zzb(zzdc zzdcVar) {
        if (zzdcVar.zzc() - 1 != 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdq
    public final zzdp zza(Class cls) {
        zzdr.zzC(cls);
        zzdc zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zzcb.class.isAssignableFrom(cls)) {
                return zzdj.zzc(zzdr.zzz(), zzbq.zzb(), zzb.zza());
            }
            return zzdj.zzc(zzdr.zzy(), zzbq.zza(), zzb.zza());
        }
        if (zzcb.class.isAssignableFrom(cls)) {
            if (zzb(zzb)) {
                return zzdi.zzl(cls, zzb, zzdl.zzb(), zzct.zzd(), zzdr.zzz(), zzbq.zzb(), zzdb.zzb());
            }
            return zzdi.zzl(cls, zzb, zzdl.zzb(), zzct.zzd(), zzdr.zzz(), null, zzdb.zzb());
        }
        if (zzb(zzb)) {
            return zzdi.zzl(cls, zzb, zzdl.zza(), zzct.zzc(), zzdr.zzy(), zzbq.zza(), zzdb.zza());
        }
        return zzdi.zzl(cls, zzb, zzdl.zza(), zzct.zzc(), zzdr.zzy(), null, zzdb.zza());
    }
}
