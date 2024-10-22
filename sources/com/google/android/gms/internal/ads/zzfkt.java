package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzfkt extends zzfkw {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzfkt zzb = new zzfkt();

    private zzfkt() {
    }

    public static zzfkt zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final void zzb(boolean z) {
        String str;
        Iterator it = zzfku.zza().zzc().iterator();
        while (it.hasNext()) {
            zzflh zzg = ((zzfkg) it.next()).zzg();
            if (zzg.zzl()) {
                if (true != z) {
                    str = "backgrounded";
                } else {
                    str = "foregrounded";
                }
                zzfla.zza().zzb(zzg.zza(), "setState", str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final boolean zzc() {
        Iterator it = zzfku.zza().zzb().iterator();
        while (it.hasNext()) {
            View zzf = ((zzfkg) it.next()).zzf();
            if (zzf != null && zzf.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
