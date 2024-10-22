package com.google.android.gms.internal.ads;

import java.util.Arrays;
import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
public final class zzxz {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzxs[] zzd = new zzxs[100];

    public zzxz(boolean z, int i) {
    }

    public final synchronized int zza() {
        return this.zzb * 65536;
    }

    public final synchronized zzxs zzb() {
        zzxs zzxsVar;
        this.zzb++;
        int i = this.zzc;
        if (i > 0) {
            zzxs[] zzxsVarArr = this.zzd;
            int i2 = i - 1;
            this.zzc = i2;
            zzxsVar = zzxsVarArr[i2];
            zzxsVar.getClass();
            zzxsVarArr[i2] = null;
        } else {
            zzxsVar = new zzxs(new byte[65536], 0);
            int i3 = this.zzb;
            zzxs[] zzxsVarArr2 = this.zzd;
            int length = zzxsVarArr2.length;
            if (i3 > length) {
                this.zzd = (zzxs[]) Arrays.copyOf(zzxsVarArr2, length + length);
                return zzxsVar;
            }
        }
        return zzxsVar;
    }

    public final synchronized void zzc(zzxs zzxsVar) {
        zzxs[] zzxsVarArr = this.zzd;
        int i = this.zzc;
        this.zzc = i + 1;
        zzxsVarArr[i] = zzxsVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(zzxt zzxtVar) {
        while (zzxtVar != null) {
            zzxs[] zzxsVarArr = this.zzd;
            int i = this.zzc;
            this.zzc = i + 1;
            zzxsVarArr[i] = zzxtVar.zzc();
            this.zzb--;
            zzxtVar = zzxtVar.zzd();
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i2 = this.zza;
        this.zza = i;
        if (i < i2) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int i = this.zza;
        int i2 = zzfk.zza;
        int max = Math.max(0, ((i + Settings.DEFAULT_INITIAL_WINDOW_SIZE) / 65536) - this.zzb);
        int i3 = this.zzc;
        if (max >= i3) {
            return;
        }
        Arrays.fill(this.zzd, max, i3, (Object) null);
        this.zzc = max;
    }
}
