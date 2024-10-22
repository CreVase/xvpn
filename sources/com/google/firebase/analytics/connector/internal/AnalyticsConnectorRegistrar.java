package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.bx3;
import defpackage.ct1;
import defpackage.es0;
import defpackage.h30;
import defpackage.kk0;
import defpackage.px0;
import defpackage.qa;
import defpackage.ra;
import defpackage.s30;
import defpackage.u23;
import defpackage.uw3;
import defpackage.v73;
import java.util.Arrays;
import java.util.List;

@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static qa lambda$getComponents$0(s30 s30Var) {
        px0 px0Var = (px0) s30Var.a(px0.class);
        Context context = (Context) s30Var.a(Context.class);
        u23 u23Var = (u23) s30Var.a(u23.class);
        Preconditions.checkNotNull(px0Var);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(u23Var);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (ra.c == null) {
            synchronized (ra.class) {
                if (ra.c == null) {
                    Bundle bundle = new Bundle(1);
                    px0Var.a();
                    if ("[DEFAULT]".equals(px0Var.f3932b)) {
                        ((es0) u23Var).a(uw3.f4748a, v73.f);
                        bundle.putBoolean("dataCollectionDefaultEnabled", px0Var.f());
                    }
                    ra.c = new ra(zzdf.zza(context, (String) null, (String) null, (String) null, bundle).zzb());
                }
            }
        }
        return ra.c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @KeepForSdk
    @SuppressLint({"MissingPermission"})
    public List<h30> getComponents() {
        ct1 b2 = h30.b(qa.class);
        b2.b(kk0.a(px0.class));
        b2.b(kk0.a(Context.class));
        b2.b(kk0.a(u23.class));
        b2.f = v73.g;
        b2.d(2);
        return Arrays.asList(b2.c(), bx3.p("fire-analytics", "21.5.0"));
    }
}
