package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzuv implements zzyi, zztl {
    final /* synthetic */ zzva zza;
    private final Uri zzc;
    private final zzhj zzd;
    private final zzup zze;
    private final zzabp zzf;
    private final zzea zzg;
    private volatile boolean zzi;
    private long zzk;
    private zzacs zzm;
    private boolean zzn;
    private final zzacj zzh = new zzacj();
    private boolean zzj = true;
    private final long zzb = zztn.zza();
    private zzgn zzl = zzi(0);

    public zzuv(zzva zzvaVar, Uri uri, zzgi zzgiVar, zzup zzupVar, zzabp zzabpVar, zzea zzeaVar) {
        this.zza = zzvaVar;
        this.zzc = uri;
        this.zzd = new zzhj(zzgiVar);
        this.zze = zzupVar;
        this.zzf = zzabpVar;
        this.zzg = zzeaVar;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzuv zzuvVar, long j, long j2) {
        zzuvVar.zzh.zza = j;
        zzuvVar.zzk = j2;
        zzuvVar.zzj = true;
        zzuvVar.zzn = false;
    }

    private final zzgn zzi(long j) {
        Map map;
        zzgl zzglVar = new zzgl();
        zzglVar.zzd(this.zzc);
        zzglVar.zzc(j);
        zzglVar.zza(6);
        map = zzva.zzb;
        zzglVar.zzb(map);
        return zzglVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zztl
    public final void zza(zzfb zzfbVar) {
        long zzR;
        long max;
        if (!this.zzn) {
            max = this.zzk;
        } else {
            zzR = this.zza.zzR(true);
            max = Math.max(zzR, this.zzk);
        }
        int zza = zzfbVar.zza();
        zzacs zzacsVar = this.zzm;
        zzacsVar.getClass();
        zzacq.zzb(zzacsVar, zzfbVar, zza);
        zzacsVar.zzt(max, 1, zza, 0, null);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzyi
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:14:0x0041, B:18:0x0077, B:20:0x0082, B:21:0x008e, B:23:0x0098, B:24:0x00a4, B:26:0x00ae, B:27:0x00ba, B:29:0x00c4, B:30:0x00d6, B:32:0x00e0, B:34:0x00e6, B:38:0x0116, B:39:0x011d, B:41:0x012a, B:43:0x0132, B:44:0x014f, B:46:0x016a, B:47:0x016f, B:49:0x0173, B:101:0x00f0, B:104:0x0104, B:113:0x004d, B:116:0x0063), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:14:0x0041, B:18:0x0077, B:20:0x0082, B:21:0x008e, B:23:0x0098, B:24:0x00a4, B:26:0x00ae, B:27:0x00ba, B:29:0x00c4, B:30:0x00d6, B:32:0x00e0, B:34:0x00e6, B:38:0x0116, B:39:0x011d, B:41:0x012a, B:43:0x0132, B:44:0x014f, B:46:0x016a, B:47:0x016f, B:49:0x0173, B:101:0x00f0, B:104:0x0104, B:113:0x004d, B:116:0x0063), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:14:0x0041, B:18:0x0077, B:20:0x0082, B:21:0x008e, B:23:0x0098, B:24:0x00a4, B:26:0x00ae, B:27:0x00ba, B:29:0x00c4, B:30:0x00d6, B:32:0x00e0, B:34:0x00e6, B:38:0x0116, B:39:0x011d, B:41:0x012a, B:43:0x0132, B:44:0x014f, B:46:0x016a, B:47:0x016f, B:49:0x0173, B:101:0x00f0, B:104:0x0104, B:113:0x004d, B:116:0x0063), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:14:0x0041, B:18:0x0077, B:20:0x0082, B:21:0x008e, B:23:0x0098, B:24:0x00a4, B:26:0x00ae, B:27:0x00ba, B:29:0x00c4, B:30:0x00d6, B:32:0x00e0, B:34:0x00e6, B:38:0x0116, B:39:0x011d, B:41:0x012a, B:43:0x0132, B:44:0x014f, B:46:0x016a, B:47:0x016f, B:49:0x0173, B:101:0x00f0, B:104:0x0104, B:113:0x004d, B:116:0x0063), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0 A[Catch: all -> 0x01eb, TRY_LEAVE, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:14:0x0041, B:18:0x0077, B:20:0x0082, B:21:0x008e, B:23:0x0098, B:24:0x00a4, B:26:0x00ae, B:27:0x00ba, B:29:0x00c4, B:30:0x00d6, B:32:0x00e0, B:34:0x00e6, B:38:0x0116, B:39:0x011d, B:41:0x012a, B:43:0x0132, B:44:0x014f, B:46:0x016a, B:47:0x016f, B:49:0x0173, B:101:0x00f0, B:104:0x0104, B:113:0x004d, B:116:0x0063), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0116 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:14:0x0041, B:18:0x0077, B:20:0x0082, B:21:0x008e, B:23:0x0098, B:24:0x00a4, B:26:0x00ae, B:27:0x00ba, B:29:0x00c4, B:30:0x00d6, B:32:0x00e0, B:34:0x00e6, B:38:0x0116, B:39:0x011d, B:41:0x012a, B:43:0x0132, B:44:0x014f, B:46:0x016a, B:47:0x016f, B:49:0x0173, B:101:0x00f0, B:104:0x0104, B:113:0x004d, B:116:0x0063), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012a A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:14:0x0041, B:18:0x0077, B:20:0x0082, B:21:0x008e, B:23:0x0098, B:24:0x00a4, B:26:0x00ae, B:27:0x00ba, B:29:0x00c4, B:30:0x00d6, B:32:0x00e0, B:34:0x00e6, B:38:0x0116, B:39:0x011d, B:41:0x012a, B:43:0x0132, B:44:0x014f, B:46:0x016a, B:47:0x016f, B:49:0x0173, B:101:0x00f0, B:104:0x0104, B:113:0x004d, B:116:0x0063), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016a A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:14:0x0041, B:18:0x0077, B:20:0x0082, B:21:0x008e, B:23:0x0098, B:24:0x00a4, B:26:0x00ae, B:27:0x00ba, B:29:0x00c4, B:30:0x00d6, B:32:0x00e0, B:34:0x00e6, B:38:0x0116, B:39:0x011d, B:41:0x012a, B:43:0x0132, B:44:0x014f, B:46:0x016a, B:47:0x016f, B:49:0x0173, B:101:0x00f0, B:104:0x0104, B:113:0x004d, B:116:0x0063), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0173 A[Catch: all -> 0x01eb, TRY_LEAVE, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:14:0x0041, B:18:0x0077, B:20:0x0082, B:21:0x008e, B:23:0x0098, B:24:0x00a4, B:26:0x00ae, B:27:0x00ba, B:29:0x00c4, B:30:0x00d6, B:32:0x00e0, B:34:0x00e6, B:38:0x0116, B:39:0x011d, B:41:0x012a, B:43:0x0132, B:44:0x014f, B:46:0x016a, B:47:0x016f, B:49:0x0173, B:101:0x00f0, B:104:0x0104, B:113:0x004d, B:116:0x0063), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[LOOP:0: B:2:0x0004->B:80:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0181  */
    @Override // com.google.android.gms.internal.ads.zzyi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuv.zzh():void");
    }
}
