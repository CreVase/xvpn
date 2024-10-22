package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class zzanc implements zzalq {
    private final zzanb zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzanc(zzanb zzanbVar, int i) {
        this.zzc = zzanbVar;
    }

    public static int zze(InputStream inputStream) throws IOException {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    public static long zzf(InputStream inputStream) throws IOException {
        return (zzn(inputStream) & 255) | ((zzn(inputStream) & 255) << 8) | ((zzn(inputStream) & 255) << 16) | ((zzn(inputStream) & 255) << 24) | ((zzn(inputStream) & 255) << 32) | ((zzn(inputStream) & 255) << 40) | ((zzn(inputStream) & 255) << 48) | ((zzn(inputStream) & 255) << 56);
    }

    public static String zzh(zzana zzanaVar) throws IOException {
        return new String(zzm(zzanaVar, zzf(zzanaVar)), "UTF-8");
    }

    public static void zzj(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    public static void zzk(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    public static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzk(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    public static byte[] zzm(zzana zzanaVar, long j) throws IOException {
        long zza = zzanaVar.zza();
        if (j >= 0 && j <= zza) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzanaVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + zza);
    }

    private static int zzn(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzamz zzamzVar) {
        if (!this.zza.containsKey(str)) {
            this.zzb += zzamzVar.zza;
        } else {
            this.zzb = (zzamzVar.zza - ((zzamz) this.zza.get(str)).zza) + this.zzb;
        }
        this.zza.put(str, zzamzVar);
    }

    private final void zzp(String str) {
        zzamz zzamzVar = (zzamz) this.zza.remove(str);
        if (zzamzVar != null) {
            this.zzb -= zzamzVar.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final synchronized zzalp zza(String str) {
        zzamz zzamzVar = (zzamz) this.zza.get(str);
        if (zzamzVar == null) {
            return null;
        }
        File zzg = zzg(str);
        try {
            zzana zzanaVar = new zzana(new BufferedInputStream(new FileInputStream(zzg)), zzg.length());
            try {
                zzamz zza = zzamz.zza(zzanaVar);
                if (!TextUtils.equals(str, zza.zzb)) {
                    zzams.zza("%s: key=%s, found=%s", zzg.getAbsolutePath(), str, zza.zzb);
                    zzp(str);
                    return null;
                }
                byte[] zzm = zzm(zzanaVar, zzanaVar.zza());
                zzalp zzalpVar = new zzalp();
                zzalpVar.zza = zzm;
                zzalpVar.zzb = zzamzVar.zzc;
                zzalpVar.zzc = zzamzVar.zzd;
                zzalpVar.zzd = zzamzVar.zze;
                zzalpVar.zze = zzamzVar.zzf;
                zzalpVar.zzf = zzamzVar.zzg;
                List<zzaly> list = zzamzVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzaly zzalyVar : list) {
                    treeMap.put(zzalyVar.zza(), zzalyVar.zzb());
                }
                zzalpVar.zzg = treeMap;
                zzalpVar.zzh = Collections.unmodifiableList(zzamzVar.zzh);
                return zzalpVar;
            } finally {
                zzanaVar.close();
            }
        } catch (IOException e) {
            zzams.zza("%s: %s", zzg.getAbsolutePath(), e.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final synchronized void zzb() {
        long length;
        zzana zzanaVar;
        File zza = this.zzc.zza();
        if (!zza.exists()) {
            if (!zza.mkdirs()) {
                zzams.zzb("Unable to create cache dir %s", zza.getAbsolutePath());
                return;
            }
            return;
        }
        File[] listFiles = zza.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                try {
                    length = file.length();
                    zzanaVar = new zzana(new BufferedInputStream(new FileInputStream(file)), length);
                } catch (IOException unused) {
                    file.delete();
                }
                try {
                    zzamz zza2 = zzamz.zza(zzanaVar);
                    zza2.zza = length;
                    zzo(zza2.zzb, zza2);
                    zzanaVar.close();
                } catch (Throwable th) {
                    zzanaVar.close();
                    throw th;
                    break;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final synchronized void zzc(String str, boolean z) {
        zzalp zza = zza(str);
        if (zza != null) {
            zza.zzf = 0L;
            zza.zze = 0L;
            zzd(str, zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final synchronized void zzd(String str, zzalp zzalpVar) {
        BufferedOutputStream bufferedOutputStream;
        zzamz zzamzVar;
        long j;
        long j2 = this.zzb;
        int length = zzalpVar.zza.length;
        long j3 = j2 + length;
        int i = this.zzd;
        if (j3 > i && length > i * 0.9f) {
            return;
        }
        File zzg = zzg(str);
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(zzg));
            zzamzVar = new zzamz(str, zzalpVar);
        } catch (IOException unused) {
            if (!zzg.delete()) {
                zzams.zza("Could not clean up file %s", zzg.getAbsolutePath());
            }
            if (!this.zzc.zza().exists()) {
                zzams.zza("Re-initializing cache after external clearing.", new Object[0]);
                this.zza.clear();
                this.zzb = 0L;
                zzb();
                return;
            }
        }
        try {
            zzj(bufferedOutputStream, 538247942);
            zzl(bufferedOutputStream, zzamzVar.zzb);
            String str2 = zzamzVar.zzc;
            if (str2 == null) {
                str2 = "";
            }
            zzl(bufferedOutputStream, str2);
            zzk(bufferedOutputStream, zzamzVar.zzd);
            zzk(bufferedOutputStream, zzamzVar.zze);
            zzk(bufferedOutputStream, zzamzVar.zzf);
            zzk(bufferedOutputStream, zzamzVar.zzg);
            List<zzaly> list = zzamzVar.zzh;
            if (list != null) {
                zzj(bufferedOutputStream, list.size());
                for (zzaly zzalyVar : list) {
                    zzl(bufferedOutputStream, zzalyVar.zza());
                    zzl(bufferedOutputStream, zzalyVar.zzb());
                }
            } else {
                zzj(bufferedOutputStream, 0);
            }
            bufferedOutputStream.flush();
            bufferedOutputStream.write(zzalpVar.zza);
            bufferedOutputStream.close();
            zzamzVar.zza = zzg.length();
            zzo(str, zzamzVar);
            if (this.zzb >= this.zzd) {
                if (zzams.zzb) {
                    zzams.zzd("Pruning old cache entries.", new Object[0]);
                }
                long j4 = this.zzb;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Iterator it = this.zza.entrySet().iterator();
                int i2 = 0;
                while (true) {
                    if (it.hasNext()) {
                        zzamz zzamzVar2 = (zzamz) ((Map.Entry) it.next()).getValue();
                        if (zzg(zzamzVar2.zzb).delete()) {
                            j = elapsedRealtime;
                            this.zzb -= zzamzVar2.zza;
                        } else {
                            j = elapsedRealtime;
                            String str3 = zzamzVar2.zzb;
                            zzams.zza("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                        }
                        it.remove();
                        i2++;
                        if (((float) this.zzb) < this.zzd * 0.9f) {
                            break;
                        } else {
                            elapsedRealtime = j;
                        }
                    } else {
                        j = elapsedRealtime;
                        break;
                    }
                }
                if (zzams.zzb) {
                    zzams.zzd("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.zzb - j4), Long.valueOf(SystemClock.elapsedRealtime() - j));
                }
            }
        } catch (IOException e) {
            zzams.zza("%s", e.toString());
            bufferedOutputStream.close();
            zzams.zza("Failed to write header for %s", zzg.getAbsolutePath());
            throw new IOException();
        }
    }

    public final File zzg(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public final synchronized void zzi(String str) {
        boolean delete = zzg(str).delete();
        zzp(str);
        if (!delete) {
            zzams.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
        }
    }

    public zzanc(File file, int i) {
        this.zzc = new zzamy(this, file);
    }
}
