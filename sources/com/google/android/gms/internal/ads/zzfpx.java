package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzfpx extends zzfpu {
    private static zzfpx zzc;

    private zzfpx(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzfpx zzi(Context context) {
        zzfpx zzfpxVar;
        synchronized (zzfpx.class) {
            if (zzc == null) {
                zzc = new zzfpx(context);
            }
            zzfpxVar = zzc;
        }
        return zzfpxVar;
    }

    public final zzfpt zzh(long j, boolean z) throws IOException {
        synchronized (zzfpx.class) {
            if (!zzo()) {
                return new zzfpt();
            }
            return zzb(null, null, j, z);
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzfpx.class) {
            if (zzg(false)) {
                zzf(false);
            }
        }
    }

    public final void zzk() throws IOException {
        this.zzb.zze("paidv2_publisher_option");
    }

    public final void zzl() throws IOException {
        this.zzb.zze("paidv2_user_option");
    }

    public final void zzm(boolean z) throws IOException {
        this.zzb.zzd("paidv2_user_option", Boolean.valueOf(z));
    }

    public final void zzn(boolean z) throws IOException {
        this.zzb.zzd("paidv2_publisher_option", Boolean.valueOf(z));
        if (!z) {
            zzj();
        }
    }

    public final boolean zzo() {
        return this.zzb.zzf("paidv2_publisher_option", true);
    }

    public final boolean zzp() {
        return this.zzb.zzf("paidv2_user_option", true);
    }
}
