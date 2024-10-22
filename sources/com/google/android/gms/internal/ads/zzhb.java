package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class zzhb extends zzgj {
    public final zzgn zzb;
    public final int zzc;

    public zzhb(zzgn zzgnVar, int i, int i2) {
        super(zzb(2008, 1));
        this.zzb = zzgnVar;
        this.zzc = 1;
    }

    public static zzhb zza(IOException iOException, zzgn zzgnVar, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && zzfsc.zza(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        } else {
            i2 = 2001;
        }
        if (i2 == 2007) {
            return new zzha(iOException, zzgnVar);
        }
        return new zzhb(iOException, zzgnVar, i2, i);
    }

    private static int zzb(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }

    public zzhb(IOException iOException, zzgn zzgnVar, int i, int i2) {
        super(iOException, zzb(i, i2));
        this.zzb = zzgnVar;
        this.zzc = i2;
    }

    public zzhb(String str, zzgn zzgnVar, int i, int i2) {
        super(str, zzb(i, i2));
        this.zzb = zzgnVar;
        this.zzc = i2;
    }

    public zzhb(String str, IOException iOException, zzgn zzgnVar, int i, int i2) {
        super(str, iOException, zzb(i, i2));
        this.zzb = zzgnVar;
        this.zzc = i2;
    }
}
