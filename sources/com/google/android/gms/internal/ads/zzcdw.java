package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class zzcdw implements zzgi {
    private final Context zza;
    private final zzgi zzb;
    private final String zzc;
    private final int zzd;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzaxh zzi;
    private zzgn zzm;
    private boolean zzj = false;
    private boolean zzk = false;
    private final AtomicLong zzl = new AtomicLong(-1);
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbO)).booleanValue();

    public zzcdw(Context context, zzgi zzgiVar, String str, int i, zzhk zzhkVar, zzcdv zzcdvVar) {
        this.zza = context;
        this.zzb = zzgiVar;
        this.zzc = str;
        this.zzd = i;
    }

    private final boolean zzg() {
        if (!this.zze) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzei)).booleanValue() && !this.zzj) {
            return true;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzej)).booleanValue() || this.zzk) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (this.zzg) {
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                return inputStream.read(bArr, i, i2);
            }
            return this.zzb.zza(bArr, i, i2);
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgnVar) throws IOException {
        Long l;
        if (!this.zzg) {
            this.zzg = true;
            Uri uri = zzgnVar.zza;
            this.zzh = uri;
            this.zzm = zzgnVar;
            this.zzi = zzaxh.zza(uri);
            zzaxe zzaxeVar = null;
            byte b2 = 0;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzef)).booleanValue()) {
                if (this.zzi != null) {
                    this.zzi.zzh = zzgnVar.zzf;
                    this.zzi.zzi = zzftl.zzc(this.zzc);
                    this.zzi.zzj = this.zzd;
                    if (this.zzi.zzg) {
                        l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeh);
                    } else {
                        l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeg);
                    }
                    long longValue = l.longValue();
                    com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                    com.google.android.gms.ads.internal.zzt.zzd();
                    Future zza = zzaxs.zza(this.zza, this.zzi);
                    try {
                        zzaxt zzaxtVar = (zzaxt) zza.get(longValue, TimeUnit.MILLISECONDS);
                        zzaxtVar.zzd();
                        this.zzj = zzaxtVar.zzf();
                        this.zzk = zzaxtVar.zze();
                        zzaxtVar.zza();
                        if (!zzg()) {
                            this.zzf = zzaxtVar.zzc();
                            com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                            throw null;
                        }
                        com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                        throw null;
                    } catch (InterruptedException unused) {
                        zza.cancel(false);
                        Thread.currentThread().interrupt();
                        com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                        throw null;
                    } catch (ExecutionException | TimeoutException unused2) {
                        zza.cancel(false);
                        com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                        throw null;
                    }
                }
            } else {
                if (this.zzi != null) {
                    this.zzi.zzh = zzgnVar.zzf;
                    this.zzi.zzi = zzftl.zzc(this.zzc);
                    this.zzi.zzj = this.zzd;
                    zzaxeVar = com.google.android.gms.ads.internal.zzt.zzc().zzb(this.zzi);
                }
                if (zzaxeVar != null && zzaxeVar.zze()) {
                    this.zzj = zzaxeVar.zzg();
                    this.zzk = zzaxeVar.zzf();
                    if (!zzg()) {
                        this.zzf = zzaxeVar.zzc();
                        return -1L;
                    }
                }
            }
            if (this.zzi != null) {
                this.zzm = new zzgn(Uri.parse(this.zzi.zza), null, zzgnVar.zze, zzgnVar.zzf, zzgnVar.zzg, null, zzgnVar.zzi);
            }
            return this.zzb.zzb(this.zzm);
        }
        throw new IOException("Attempt to open an already open CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzd() throws IOException {
        if (this.zzg) {
            this.zzg = false;
            this.zzh = null;
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                IOUtils.closeQuietly(inputStream);
                this.zzf = null;
                return;
            } else {
                this.zzb.zzd();
                return;
            }
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzf(zzhk zzhkVar) {
    }
}
