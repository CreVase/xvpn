package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class zzgb extends zzgc {
    private final AssetManager zza;
    private Uri zzb;
    private InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzgb(Context context) {
        super(false);
        this.zza = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws zzga {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zzd;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzga(e, 2000);
            }
        }
        InputStream inputStream = this.zzc;
        int i3 = zzfk.zza;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.zzd;
        if (j2 != -1) {
            this.zzd = j2 - read;
        }
        zzg(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgnVar) throws zzga {
        int i;
        try {
            Uri uri = zzgnVar.zza;
            this.zzb = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            zzi(zzgnVar);
            InputStream open = this.zza.open(path, 1);
            this.zzc = open;
            if (open.skip(zzgnVar.zzf) >= zzgnVar.zzf) {
                long j = zzgnVar.zzg;
                if (j != -1) {
                    this.zzd = j;
                } else {
                    long available = this.zzc.available();
                    this.zzd = available;
                    if (available == 2147483647L) {
                        this.zzd = -1L;
                    }
                }
                this.zze = true;
                zzj(zzgnVar);
                return this.zzd;
            }
            throw new zzga(null, 2008);
        } catch (zzga e) {
            throw e;
        } catch (IOException e2) {
            if (true != (e2 instanceof FileNotFoundException)) {
                i = 2000;
            } else {
                i = 2005;
            }
            throw new zzga(e2, i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzd() throws zzga {
        this.zzb = null;
        try {
            try {
                InputStream inputStream = this.zzc;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zzc = null;
                if (this.zze) {
                    this.zze = false;
                    zzh();
                }
            } catch (IOException e) {
                throw new zzga(e, 2000);
            }
        } catch (Throwable th) {
            this.zzc = null;
            if (this.zze) {
                this.zze = false;
                zzh();
            }
            throw th;
        }
    }
}
