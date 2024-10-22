package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class zzfom {
    private static final Object zza = new Object();
    private final Context zzb;
    private final SharedPreferences zzc;
    private final String zzd;
    private final zzfnt zze;
    private boolean zzf;

    public zzfom(Context context, int i, zzfnt zzfntVar, boolean z) {
        this.zzf = false;
        this.zzb = context;
        this.zzd = Integer.toString(i - 1);
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        this.zze = zzfntVar;
        this.zzf = z;
    }

    private final File zze(String str) {
        return new File(new File(this.zzb.getDir("pccache", 0), this.zzd), str);
    }

    private static String zzf(zzaui zzauiVar) {
        zzauk zze = zzaul.zze();
        zze.zze(zzauiVar.zzd().zzk());
        zze.zza(zzauiVar.zzd().zzj());
        zze.zzb(zzauiVar.zzd().zza());
        zze.zzd(zzauiVar.zzd().zzd());
        zze.zzc(zzauiVar.zzd().zzc());
        return Hex.bytesToStringLowercase(((zzaul) zze.zzal()).zzax());
    }

    private final String zzg() {
        return "FBAMTD".concat(String.valueOf(this.zzd));
    }

    private final String zzh() {
        return "LATMTD".concat(String.valueOf(this.zzd));
    }

    private final void zzi(int i, long j) {
        this.zze.zza(i, j);
    }

    private final void zzj(int i, long j, String str) {
        this.zze.zzb(i, j, str);
    }

    private final zzaul zzk(int i) {
        String string;
        zzgtl zzb;
        if (i == 1) {
            string = this.zzc.getString(zzh(), null);
        } else {
            string = this.zzc.getString(zzg(), null);
        }
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] stringToBytes = Hex.stringToBytes(string);
            zzgsr zzgsrVar = zzgsr.zzb;
            zzgsr zzv = zzgsr.zzv(stringToBytes, 0, stringToBytes.length);
            if (this.zzf) {
                zzb = zzgtl.zza();
            } else {
                zzb = zzgtl.zzb();
            }
            return zzaul.zzi(zzv, zzb);
        } catch (zzgul unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, currentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzaui zzauiVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            if (!zzfog.zze(new File(zze(zzauiVar.zzd().zzk()), "pcbc"), zzauiVar.zze().zzA())) {
                zzi(4020, currentTimeMillis);
                return false;
            }
            String zzf = zzf(zzauiVar);
            SharedPreferences.Editor edit = this.zzc.edit();
            edit.putString(zzh(), zzf);
            boolean commit = edit.commit();
            if (commit) {
                zzi(5015, currentTimeMillis);
            } else {
                zzi(4021, currentTimeMillis);
            }
            return commit;
        }
    }

    public final boolean zzb(zzaui zzauiVar, zzfol zzfolVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzaul zzk = zzk(1);
            String zzk2 = zzauiVar.zzd().zzk();
            if (zzk != null && zzk.zzk().equals(zzk2)) {
                zzi(4014, currentTimeMillis);
                return false;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            File zze = zze(zzk2);
            if (zze.exists()) {
                String str = "1";
                if (true != zze.isDirectory()) {
                    str = "0";
                }
                String str2 = "1";
                if (true != zze.isFile()) {
                    str2 = "0";
                }
                zzj(4023, currentTimeMillis2, "d:" + str + ",f:" + str2);
                zzi(4015, currentTimeMillis2);
            } else if (!zze.mkdirs()) {
                String str3 = "1";
                if (true != zze.canWrite()) {
                    str3 = "0";
                }
                zzj(4024, currentTimeMillis2, "cw:".concat(str3));
                zzi(4015, currentTimeMillis2);
                return false;
            }
            File zze2 = zze(zzk2);
            File file = new File(zze2, "pcam.jar");
            File file2 = new File(zze2, "pcbc");
            if (!zzfog.zze(file, zzauiVar.zzf().zzA())) {
                zzi(4016, currentTimeMillis);
                return false;
            }
            if (!zzfog.zze(file2, zzauiVar.zze().zzA())) {
                zzi(4017, currentTimeMillis);
                return false;
            }
            if (zzfolVar != null && !zzfolVar.zza(file)) {
                zzi(4018, currentTimeMillis);
                zzfog.zzd(zze2);
                return false;
            }
            String zzf = zzf(zzauiVar);
            long currentTimeMillis3 = System.currentTimeMillis();
            String string = this.zzc.getString(zzh(), null);
            SharedPreferences.Editor edit = this.zzc.edit();
            edit.putString(zzh(), zzf);
            if (string != null) {
                edit.putString(zzg(), string);
            }
            if (!edit.commit()) {
                zzi(4019, currentTimeMillis3);
                return false;
            }
            HashSet hashSet = new HashSet();
            zzaul zzk3 = zzk(1);
            if (zzk3 != null) {
                hashSet.add(zzk3.zzk());
            }
            zzaul zzk4 = zzk(2);
            if (zzk4 != null) {
                hashSet.add(zzk4.zzk());
            }
            for (File file3 : new File(this.zzb.getDir("pccache", 0), this.zzd).listFiles()) {
                if (!hashSet.contains(file3.getName())) {
                    zzfog.zzd(file3);
                }
            }
            zzi(5014, currentTimeMillis);
            return true;
        }
    }

    public final zzfoe zzc(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzaul zzk = zzk(1);
            if (zzk == null) {
                zzi(4022, currentTimeMillis);
                return null;
            }
            File zze = zze(zzk.zzk());
            File file = new File(zze, "pcam.jar");
            if (!file.exists()) {
                file = new File(zze, "pcam");
            }
            File file2 = new File(zze, "pcbc");
            File file3 = new File(zze, "pcopt");
            zzi(5016, currentTimeMillis);
            return new zzfoe(zzk, file, file2, file3);
        }
    }

    public final boolean zzd(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzaul zzk = zzk(1);
            if (zzk == null) {
                zzi(4025, currentTimeMillis);
                return false;
            }
            File zze = zze(zzk.zzk());
            if (!new File(zze, "pcam.jar").exists()) {
                zzi(4026, currentTimeMillis);
                return false;
            }
            if (!new File(zze, "pcbc").exists()) {
                zzi(4027, currentTimeMillis);
                return false;
            }
            zzi(5019, currentTimeMillis);
            return true;
        }
    }
}
