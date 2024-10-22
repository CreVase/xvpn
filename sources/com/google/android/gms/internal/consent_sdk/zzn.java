package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import defpackage.m60;
import defpackage.s60;
import defpackage.yq;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzn {
    private final Application zza;
    private final zza zzb;
    private final zzas zzc;

    public zzn(Application application, zza zzaVar, zzas zzasVar) {
        this.zza = application;
        this.zzb = zzaVar;
        this.zzc = zzasVar;
    }

    public final zzck zzd(Activity activity, s60 s60Var) throws zzi {
        m60 m60Var;
        boolean z;
        m60 m60Var2 = s60Var.c;
        if (m60Var2 == null) {
            yq yqVar = new yq(this.zza);
            Context context = (Context) yqVar.e;
            List list = (List) yqVar.d;
            if (!zzcn.zzb() && !list.contains(zzcn.zza(context)) && !yqVar.c) {
                z = false;
            } else {
                z = true;
            }
            m60Var = new m60(z, yqVar);
        } else {
            m60Var = m60Var2;
        }
        return zzp.zza(new zzp(this, activity, m60Var, s60Var, null));
    }
}
