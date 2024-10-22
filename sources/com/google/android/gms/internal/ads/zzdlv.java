package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import defpackage.hx2;
import defpackage.ml1;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdlv {
    private final com.google.android.gms.ads.internal.util.zzbq zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdlv(com.google.android.gms.ads.internal.util.zzbq zzbqVar, Clock clock, Executor executor) {
        this.zza = zzbqVar;
        this.zzb = clock;
        this.zzc = executor;
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        long elapsedRealtime = this.zzb.elapsedRealtime();
        boolean z = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long elapsedRealtime2 = this.zzb.elapsedRealtime();
        if (decodeByteArray != null) {
            long j = elapsedRealtime2 - elapsedRealtime;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            }
            StringBuilder t = hx2.t("Decoded image w: ", width, " h:", height, " bytes: ");
            t.append(allocationByteCount);
            t.append(" time: ");
            t.append(j);
            t.append(" on ui thread: ");
            t.append(z);
            com.google.android.gms.ads.internal.util.zze.zza(t.toString());
        }
        return decodeByteArray;
    }

    public final /* synthetic */ Bitmap zza(double d, boolean z, zzamc zzamcVar) {
        byte[] bArr = zzamcVar.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgc)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgd)).intValue())) / 2);
            }
        }
        return zzc(bArr, options);
    }

    public final ml1 zzb(String str, final double d, final boolean z) {
        return zzfzt.zzm(this.zza.zza(str), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzdlu
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                return zzdlv.this.zza(d, z, (zzamc) obj);
            }
        }, this.zzc);
    }
}
