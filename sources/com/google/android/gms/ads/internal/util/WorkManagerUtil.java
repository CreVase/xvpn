package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzcat;
import defpackage.d5;
import defpackage.e32;
import defpackage.f32;
import defpackage.hs3;
import defpackage.jd0;
import defpackage.pu;
import defpackage.rs3;
import defpackage.t70;
import defpackage.u40;
import defpackage.u70;
import defpackage.uz1;
import defpackage.y33;
import java.util.Collections;
import java.util.HashMap;

@KeepForSdk
/* loaded from: classes.dex */
public class WorkManagerUtil extends zzbs {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    private static void zzb(Context context) {
        try {
            hs3.b0(context.getApplicationContext(), new u40(new d5()));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbt
    public final void zze(IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        try {
            hs3 a0 = hs3.a0(context);
            ((y33) a0.t).r(new pu(a0, "offline_ping_sender_work", 1));
            t70 t70Var = new t70();
            t70Var.f4458a = uz1.CONNECTED;
            u70 u70Var = new u70(t70Var);
            e32 e32Var = new e32(OfflinePingSender.class);
            e32Var.f3531b.j = u70Var;
            e32Var.c.add("offline_ping_sender_work");
            a0.Y(Collections.singletonList(e32Var.a()));
        } catch (IllegalStateException e) {
            zzcat.zzk("Failed to instantiate WorkManager.", e);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbt
    public final boolean zzf(IObjectWrapper iObjectWrapper, String str, String str2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        t70 t70Var = new t70();
        t70Var.f4458a = uz1.CONNECTED;
        u70 u70Var = new u70(t70Var);
        HashMap hashMap = new HashMap();
        hashMap.put("uri", str);
        hashMap.put("gws_query_id", str2);
        jd0 jd0Var = new jd0(hashMap);
        jd0.b(jd0Var);
        e32 e32Var = new e32(OfflineNotificationPoster.class);
        rs3 rs3Var = e32Var.f3531b;
        rs3Var.j = u70Var;
        rs3Var.e = jd0Var;
        e32Var.c.add("offline_notification_work");
        f32 a2 = e32Var.a();
        try {
            hs3.a0(context).Y(Collections.singletonList(a2));
            return true;
        } catch (IllegalStateException e) {
            zzcat.zzk("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
