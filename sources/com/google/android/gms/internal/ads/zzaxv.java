package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzaxv {
    private final zzayb zza;
    private final zzazk zzb;
    private final boolean zzc;

    private zzaxv() {
        this.zzb = zzazl.zzd();
        this.zzc = false;
        this.zza = new zzayb();
    }

    public static zzaxv zza() {
        return new zzaxv();
    }

    private final synchronized String zzd(int i) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.zzb.zzk(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime()), Integer.valueOf(i - 1), Base64.encodeToString(((zzazl) this.zzb.zzal()).zzax(), 3));
    }

    private final synchronized void zze(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(zzd(i).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized void zzf(int i) {
        zzazk zzazkVar = this.zzb;
        zzazkVar.zzd();
        zzazkVar.zzc(com.google.android.gms.ads.internal.util.zzt.zzd());
        zzaya zzayaVar = new zzaya(this.zza, ((zzazl) this.zzb.zzal()).zzax(), null);
        int i2 = i - 1;
        zzayaVar.zza(i2);
        zzayaVar.zzc();
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }

    public final synchronized void zzb(zzaxu zzaxuVar) {
        if (this.zzc) {
            try {
                zzaxuVar.zza(this.zzb);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i) {
        if (!this.zzc) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeN)).booleanValue()) {
            zze(i);
        } else {
            zzf(i);
        }
    }

    public zzaxv(zzayb zzaybVar) {
        this.zzb = zzazl.zzd();
        this.zza = zzaybVar;
        this.zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeM)).booleanValue();
    }
}
