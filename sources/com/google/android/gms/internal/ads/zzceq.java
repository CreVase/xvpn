package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzceq extends zzcen {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzceq(zzcdc zzcdcVar) {
        super(zzcdcVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            zzcat.zzj("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            zzcat.zzj("Could not create preload cache directory at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
        } else {
            if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
                return;
            }
            zzcat.zzj("Could not set cache file permissions at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
        }
    }

    private final File zza(File file) {
        return new File(this.zzg, String.valueOf(file.getName()).concat(".done"));
    }

    @Override // com.google.android.gms.internal.ads.zzcen
    public final void zzf() {
        this.zzh = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0346, code lost:            r26 = r4;        r24 = r14;        r21 = r15;     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x034c, code lost:            r26.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0354, code lost:            if (com.google.android.gms.internal.ads.zzcat.zzm(3) == false) goto L132;     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0356, code lost:            com.google.android.gms.internal.ads.zzcat.zze("Preloaded " + com.google.android.gms.internal.ads.zzceq.zzf.format(r13) + " bytes from " + r30);     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0379, code lost:            r12.setReadable(true, false);     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0382, code lost:            if (r0.isFile() == false) goto L185;     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0384, code lost:            r0.setLastModified(java.lang.System.currentTimeMillis());     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x038c, code lost:            r0.createNewFile();     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03ee  */
    @Override // com.google.android.gms.internal.ads.zzcen
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzt(final java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1081
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzceq.zzt(java.lang.String):boolean");
    }
}
