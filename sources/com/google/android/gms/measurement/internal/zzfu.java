package com.google.android.gms.measurement.internal;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.hx2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfu implements Runnable {
    private final /* synthetic */ int zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ Object zzc;
    private final /* synthetic */ Object zzd;
    private final /* synthetic */ Object zze;
    private final /* synthetic */ zzfr zzf;

    public zzfu(zzfr zzfrVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzfrVar;
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        long j;
        char c2;
        long j2;
        zzgd zzn = this.zzf.zzu.zzn();
        if (zzn.zzae()) {
            c = this.zzf.zza;
            if (c == 0) {
                if (this.zzf.zze().zzx()) {
                    this.zzf.zza = 'C';
                } else {
                    this.zzf.zza = 'c';
                }
            }
            j = this.zzf.zzb;
            if (j < 0) {
                this.zzf.zzb = 82001L;
            }
            char charAt = "01VDIWEA?".charAt(this.zza);
            c2 = this.zzf.zza;
            j2 = this.zzf.zzb;
            String zza = zzfr.zza(true, this.zzb, this.zzc, this.zzd, this.zze);
            StringBuilder sb = new StringBuilder("2");
            sb.append(charAt);
            sb.append(c2);
            sb.append(j2);
            String s = hx2.s(sb, ":", zza);
            if (s.length() > 1024) {
                s = this.zzb.substring(0, UserVerificationMethods.USER_VERIFY_ALL);
            }
            zzgh zzghVar = zzn.zzb;
            if (zzghVar != null) {
                zzghVar.zza(s, 1L);
                return;
            }
            return;
        }
        this.zzf.zza(6, "Persisted config not initialized. Not logging error/warn");
    }
}
