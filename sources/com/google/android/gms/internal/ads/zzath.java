package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes.dex */
public final class zzath extends zzaud {
    public zzath(zzasp zzaspVar, String str, String str2, zzaom zzaomVar, int i, int i2) {
        super(zzaspVar, "9mv9Ihk+HlE8P3WJWSjhrxWrdB7cEu1gaxdteA5kBJ6DKumpWYk1Q5Vf8aocVg4i", "s7rU1m4XsqJ83s2reIjdkboWJYkg+gYouDrDcn3Ghpw=", zzaomVar, i, 24);
    }

    private final void zzc() {
        AdvertisingIdClient zzh = this.zzb.zzh();
        if (zzh == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = zzh.getInfo();
            String id = info.getId();
            int i = zzass.zza;
            if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID fromString = UUID.fromString(id);
                byte[] bArr = new byte[16];
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                wrap.putLong(fromString.getMostSignificantBits());
                wrap.putLong(fromString.getLeastSignificantBits());
                id = zzapz.zza(bArr, true);
            }
            if (id != null) {
                synchronized (this.zze) {
                    this.zze.zzs(id);
                    this.zze.zzr(info.isLimitAdTrackingEnabled());
                    this.zze.zzab(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaud, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzl();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (!this.zzb.zzq()) {
            synchronized (this.zze) {
                this.zze.zzs((String) this.zzf.invoke(null, this.zzb.zzb()));
            }
            return;
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final Void zzl() throws Exception {
        if (this.zzb.zzr()) {
            super.zzl();
            return null;
        }
        if (this.zzb.zzq()) {
            zzc();
        }
        return null;
    }
}
