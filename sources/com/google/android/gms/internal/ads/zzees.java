package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.MobileAds;
import defpackage.da3;
import defpackage.ea3;
import defpackage.ga3;
import defpackage.ia3;
import defpackage.ml1;
import defpackage.s51;
import defpackage.s7;

/* loaded from: classes.dex */
public final class zzees {
    private final Context zza;

    public zzees(Context context) {
        this.zza = context;
    }

    public final ml1 zza(boolean z) {
        int i;
        ia3 ia3Var;
        s51 s51Var = new s51(MobileAds.ERROR_DOMAIN, z);
        Context context = this.zza;
        int i2 = Build.VERSION.SDK_INT;
        s7 s7Var = s7.f4283a;
        int i3 = 0;
        if (i2 >= 30) {
            i = s7Var.a();
        } else {
            i = 0;
        }
        ga3 ga3Var = null;
        if (i >= 5) {
            ia3Var = new ea3(context);
        } else {
            if (i2 >= 30) {
                i3 = s7Var.a();
            }
            if (i3 == 4) {
                ia3Var = new da3(context);
            } else {
                ia3Var = null;
            }
        }
        if (ia3Var != null) {
            ga3Var = new ga3(ia3Var);
        }
        if (ga3Var != null) {
            return ga3Var.a(s51Var);
        }
        return zzfzt.zzg(new IllegalStateException());
    }
}
