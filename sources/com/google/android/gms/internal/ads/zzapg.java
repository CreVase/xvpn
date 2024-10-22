package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.v;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class zzapg extends zzgtz implements zzgvk {
    private static final zzapg zzb;
    private int zzd;
    private long zzt;
    private long zzu;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private int zzk = 1000;
    private long zzl = -1;
    private long zzm = -1;
    private long zzn = -1;
    private int zzo = 1000;
    private long zzp = -1;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzv = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;

    static {
        zzapg zzapgVar = new zzapg();
        zzb = zzapgVar;
        zzgtz.zzaU(zzapg.class, zzapgVar);
    }

    private zzapg() {
    }

    public static zzapf zza() {
        return (zzapf) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzapg zzapgVar, long j) {
        zzapgVar.zzd |= 1;
        zzapgVar.zze = j;
    }

    public static /* synthetic */ void zze(zzapg zzapgVar, long j) {
        zzapgVar.zzd |= 2;
        zzapgVar.zzf = j;
    }

    public static /* synthetic */ void zzf(zzapg zzapgVar, long j) {
        zzapgVar.zzd |= 4;
        zzapgVar.zzg = j;
    }

    public static /* synthetic */ void zzg(zzapg zzapgVar, long j) {
        zzapgVar.zzd |= 8;
        zzapgVar.zzh = j;
    }

    public static /* synthetic */ void zzh(zzapg zzapgVar) {
        zzapgVar.zzd &= -9;
        zzapgVar.zzh = -1L;
    }

    public static /* synthetic */ void zzi(zzapg zzapgVar, long j) {
        zzapgVar.zzd |= 16;
        zzapgVar.zzi = j;
    }

    public static /* synthetic */ void zzj(zzapg zzapgVar, long j) {
        zzapgVar.zzd |= 32;
        zzapgVar.zzj = j;
    }

    public static /* synthetic */ void zzk(zzapg zzapgVar, long j) {
        zzapgVar.zzd |= 128;
        zzapgVar.zzl = j;
    }

    public static /* synthetic */ void zzl(zzapg zzapgVar, long j) {
        zzapgVar.zzd |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        zzapgVar.zzm = j;
    }

    public static /* synthetic */ void zzm(zzapg zzapgVar, long j) {
        zzapgVar.zzd |= 512;
        zzapgVar.zzn = j;
    }

    public static /* synthetic */ void zzn(zzapg zzapgVar, long j) {
        zzapgVar.zzd |= 2048;
        zzapgVar.zzp = j;
    }

    public static /* synthetic */ void zzo(zzapg zzapgVar, long j) {
        zzapgVar.zzd |= v.DEFAULT_BUFFER_SIZE;
        zzapgVar.zzq = j;
    }

    public static /* synthetic */ void zzp(zzapg zzapgVar, long j) {
        zzapgVar.zzd |= 8192;
        zzapgVar.zzr = j;
    }

    public static /* synthetic */ void zzq(zzapg zzapgVar, long j) {
        zzapgVar.zzd |= Http2.INITIAL_MAX_FRAME_SIZE;
        zzapgVar.zzs = j;
    }

    public static /* synthetic */ void zzr(zzapg zzapgVar, long j) {
        zzapgVar.zzd |= 32768;
        zzapgVar.zzt = j;
    }

    public static /* synthetic */ void zzs(zzapg zzapgVar, long j) {
        zzapgVar.zzd |= 65536;
        zzapgVar.zzu = j;
    }

    public static /* synthetic */ void zzt(zzapg zzapgVar, long j) {
        zzapgVar.zzd |= 131072;
        zzapgVar.zzv = j;
    }

    public static /* synthetic */ void zzu(zzapg zzapgVar, long j) {
        zzapgVar.zzd |= 262144;
        zzapgVar.zzw = j;
    }

    public static /* synthetic */ void zzv(zzapg zzapgVar, int i) {
        zzapgVar.zzk = i - 1;
        zzapgVar.zzd |= 64;
    }

    public static /* synthetic */ void zzw(zzapg zzapgVar, int i) {
        zzapgVar.zzo = i - 1;
        zzapgVar.zzd |= UserVerificationMethods.USER_VERIFY_ALL;
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    zzaol zzaolVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzapf(zzaolVar);
                }
                return new zzapg();
            }
            zzgud zzgudVar = zzapp.zza;
            return zzgtz.zzaR(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzgudVar, "zzl", "zzm", "zzn", "zzo", zzgudVar, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
        }
        return (byte) 1;
    }
}
