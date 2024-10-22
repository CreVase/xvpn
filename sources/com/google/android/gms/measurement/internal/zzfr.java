package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzoc;
import defpackage.p71;

/* loaded from: classes2.dex */
public final class zzfr extends zzic {
    private char zza;
    private long zzb;
    private String zzc;
    private final zzft zzd;
    private final zzft zze;
    private final zzft zzf;
    private final zzft zzg;
    private final zzft zzh;
    private final zzft zzi;
    private final zzft zzj;
    private final zzft zzk;
    private final zzft zzl;

    public zzfr(zzhf zzhfVar) {
        super(zzhfVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzft(this, 6, false, false);
        this.zze = new zzft(this, 6, true, false);
        this.zzf = new zzft(this, 6, false, true);
        this.zzg = new zzft(this, 5, false, false);
        this.zzh = new zzft(this, 5, true, false);
        this.zzi = new zzft(this, 5, false, true);
        this.zzj = new zzft(this, 4, false, false);
        this.zzk = new zzft(this, 3, false, false);
        this.zzl = new zzft(this, 2, false, false);
    }

    private final String zzy() {
        String str;
        String str2;
        synchronized (this) {
            if (this.zzc == null) {
                if (this.zzu.zzw() != null) {
                    str2 = this.zzu.zzw();
                } else {
                    str2 = "FA";
                }
                this.zzc = str2;
            }
            Preconditions.checkNotNull(this.zzc);
            str = this.zzc;
        }
        return str;
    }

    public final zzft zzc() {
        return this.zzk;
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final /* bridge */ /* synthetic */ zzae zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ zzaf zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ zzba zzf() {
        return super.zzf();
    }

    public final zzft zzg() {
        return this.zzd;
    }

    public final zzft zzh() {
        return this.zzf;
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ zzfq zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final /* bridge */ /* synthetic */ zzfr zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ zzgd zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final /* bridge */ /* synthetic */ zzgy zzl() {
        return super.zzl();
    }

    public final zzft zzm() {
        return this.zze;
    }

    public final zzft zzn() {
        return this.zzj;
    }

    @Override // com.google.android.gms.measurement.internal.zzic
    public final boolean zzo() {
        return false;
    }

    public final zzft zzp() {
        return this.zzl;
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ zznd zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    public final zzft zzu() {
        return this.zzg;
    }

    public final zzft zzv() {
        return this.zzi;
    }

    public final zzft zzw() {
        return this.zzh;
    }

    public final String zzx() {
        Pair<String, Long> zza;
        if (zzk().zzb == null || (zza = zzk().zzb.zza()) == null || zza == zzgd.zza) {
            return null;
        }
        return p71.m(String.valueOf(zza.second), ":", (String) zza.first);
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    private static String zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return (zzoc.zza() && zzbi.zzcb.zza(null).booleanValue()) ? "" : str;
        }
        return str.substring(0, lastIndexOf);
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public static Object zza(String str) {
        if (str == null) {
            return null;
        }
        return new zzfw(str);
    }

    public static String zza(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String zza = zza(z, obj);
        String zza2 = zza(z, obj2);
        String zza3 = zza(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(zza)) {
            sb.append(str2);
            sb.append(zza);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(zza2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(zza2);
        }
        if (!TextUtils.isEmpty(zza3)) {
            sb.append(str3);
            sb.append(zza3);
        }
        return sb.toString();
    }

    private static String zza(boolean z, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str2 = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            return str2 + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + "..." + str2 + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String zzb = zzb(zzhf.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzb(className).equals(zzb)) {
                    sb.append(": ");
                    sb.append(stackTraceElement);
                    break;
                }
                i++;
            }
            return sb.toString();
        }
        if (!(obj instanceof zzfw)) {
            return z ? "-" : String.valueOf(obj);
        }
        str = ((zzfw) obj).zza;
        return str;
    }

    public final void zza(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && zza(i)) {
            zza(i, zza(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzgy zzo = this.zzu.zzo();
        if (zzo == null) {
            zza(6, "Scheduler not set. Not logging error/warn");
        } else {
            if (!zzo.zzae()) {
                zza(6, "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i < 0) {
                i = 0;
            }
            zzo.zzb(new zzfu(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
        }
    }

    public final void zza(int i, String str) {
        Log.println(i, zzy(), str);
    }

    public final boolean zza(int i) {
        return Log.isLoggable(zzy(), i);
    }
}
