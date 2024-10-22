package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.p71;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* loaded from: classes.dex */
class zzfpu {
    static final String zza = new UUID(0, 0).toString();
    final zzfpv zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;

    public zzfpu(Context context, String str, String str2, String str3) {
        this.zzb = zzfpv.zzb(context);
        this.zzc = str;
        this.zzd = str.concat("_3p");
        this.zze = str2;
        this.zzf = str2.concat("_3p");
        this.zzg = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        String str4;
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes(p71.m(str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        StringBuilder p = p71.p(this.zzg, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        String str5 = "null";
        if (str2 == null) {
            str4 = "null";
        } else {
            str4 = "not null";
        }
        p.append(str4);
        p.append(", hashKey is ");
        if (str3 != null) {
            str5 = "not null";
        }
        p.append(str5);
        throw new IllegalArgumentException(p.toString());
    }

    public final long zza(boolean z) {
        String str;
        if (z) {
            str = this.zzf;
        } else {
            str = this.zze;
        }
        return this.zzb.zza(str, -1L);
    }

    public final zzfpt zzb(String str, String str2, long j, boolean z) throws IOException {
        String str3;
        boolean z2 = true;
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String zze = zze(true);
                    String zzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (zze != null && zzc != null && !zze.equals(zzh(str, str2, zzc))) {
                        return zzc(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzfpt();
        }
        if (str == null) {
            z2 = false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            long zza2 = zza(z2);
            if (zza2 != -1) {
                if (currentTimeMillis < zza2) {
                    zzfpv zzfpvVar = this.zzb;
                    if (z2) {
                        str3 = this.zzf;
                    } else {
                        str3 = this.zze;
                    }
                    zzfpvVar.zzd(str3, Long.valueOf(currentTimeMillis));
                } else if (currentTimeMillis >= zza2 + j) {
                    return zzc(str, str2);
                }
            }
            String zze2 = zze(z2);
            if (zze2 == null && !z) {
                return zzc(str, str2);
            }
            return new zzfpt(zze2, zza(z2));
        }
        throw new IllegalStateException(this.zzg.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    public final zzfpt zzc(String str, String str2) throws IOException {
        if (str == null) {
            return zzd(UUID.randomUUID().toString(), false);
        }
        String uuid = UUID.randomUUID().toString();
        this.zzb.zzd("paid_3p_hash_key", uuid);
        return zzd(zzh(str, str2, uuid), true);
    }

    public final zzfpt zzd(String str, boolean z) throws IOException {
        String str2;
        String str3;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            zzfpv zzfpvVar = this.zzb;
            if (z) {
                str2 = this.zzf;
            } else {
                str2 = this.zze;
            }
            zzfpvVar.zzd(str2, Long.valueOf(currentTimeMillis));
            zzfpv zzfpvVar2 = this.zzb;
            if (z) {
                str3 = this.zzd;
            } else {
                str3 = this.zzc;
            }
            zzfpvVar2.zzd(str3, str);
            return new zzfpt(str, currentTimeMillis);
        }
        throw new IllegalStateException(this.zzg.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    public final String zze(boolean z) {
        String str;
        if (z) {
            str = this.zzd;
        } else {
            str = this.zzc;
        }
        return this.zzb.zzc(str, null);
    }

    public final void zzf(boolean z) throws IOException {
        String str;
        String str2;
        if (z) {
            str = this.zzf;
        } else {
            str = this.zze;
        }
        this.zzb.zze(str);
        zzfpv zzfpvVar = this.zzb;
        if (z) {
            str2 = this.zzd;
        } else {
            str2 = this.zzc;
        }
        zzfpvVar.zze(str2);
    }

    public final boolean zzg(boolean z) {
        return this.zzb.zzg(this.zzc);
    }
}
