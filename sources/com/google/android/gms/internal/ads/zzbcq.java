package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

@Deprecated
/* loaded from: classes.dex */
public final class zzbcq {
    String zzd;
    Context zze;
    String zzf;
    private AtomicBoolean zzh;
    private File zzi;
    final BlockingQueue zza = new ArrayBlockingQueue(100);
    final LinkedHashMap zzb = new LinkedHashMap();
    final Map zzc = new HashMap();
    private final HashSet zzg = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void zzc(zzbcq zzbcqVar) {
        while (true) {
            try {
                zzbda zzbdaVar = (zzbda) zzbcqVar.zza.take();
                zzbcz zza = zzbdaVar.zza();
                if (!TextUtils.isEmpty(zza.zzb())) {
                    zzbcqVar.zzg(zzbcqVar.zzb(zzbcqVar.zzb, zzbdaVar.zzb()), zza);
                }
            } catch (InterruptedException e) {
                zzcat.zzk("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    private final void zzg(Map map, zzbcz zzbczVar) {
        Uri.Builder buildUpon = Uri.parse(this.zzd).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (zzbczVar != null) {
            StringBuilder sb = new StringBuilder(uri);
            if (!TextUtils.isEmpty(zzbczVar.zzb())) {
                sb.append("&it=");
                sb.append(zzbczVar.zzb());
            }
            if (!TextUtils.isEmpty(zzbczVar.zza())) {
                sb.append("&blat=");
                sb.append(zzbczVar.zza());
            }
            uri = sb.toString();
        }
        if (this.zzh.get()) {
            File file = this.zzi;
            if (file != null) {
                FileOutputStream fileOutputStream = null;
                try {
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                        try {
                            fileOutputStream2.write(uri.getBytes());
                            fileOutputStream2.write(10);
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e) {
                                zzcat.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e);
                            }
                        } catch (IOException e2) {
                            e = e2;
                            fileOutputStream = fileOutputStream2;
                            zzcat.zzk("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e3) {
                                    zzcat.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e3);
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e4) {
                                    zzcat.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e5) {
                    e = e5;
                }
            } else {
                zzcat.zzj("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            }
        } else {
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzK(this.zze, this.zzf, uri);
        }
    }

    public final zzbcw zza(String str) {
        zzbcw zzbcwVar = (zzbcw) this.zzc.get(str);
        if (zzbcwVar != null) {
            return zzbcwVar;
        }
        return zzbcw.zza;
    }

    public final Map zzb(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(str, zza(str).zza((String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    public final void zzd(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.zze = context;
        this.zzf = str;
        this.zzd = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzh = atomicBoolean;
        atomicBoolean.set(((Boolean) zzbdw.zzc.zze()).booleanValue());
        if (this.zzh.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.zzi = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry entry : map.entrySet()) {
            this.zzb.put((String) entry.getKey(), (String) entry.getValue());
        }
        zzcbg.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbcp
            @Override // java.lang.Runnable
            public final void run() {
                zzbcq.zzc(zzbcq.this);
            }
        });
        Map map2 = this.zzc;
        zzbcw zzbcwVar = zzbcw.zzb;
        map2.put("action", zzbcwVar);
        this.zzc.put("ad_format", zzbcwVar);
        this.zzc.put("e", zzbcw.zzc);
    }

    public final void zze(String str) {
        if (this.zzg.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.zzf);
        linkedHashMap.put("ue", str);
        zzg(zzb(this.zzb, linkedHashMap), null);
    }

    public final boolean zzf(zzbda zzbdaVar) {
        return this.zza.offer(zzbdaVar);
    }
}
