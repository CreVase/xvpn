package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzarn extends zzarm {
    public zzarn(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static zzarn zzt(String str, Context context, boolean z) {
        zzarm.zzr(context, false);
        return new zzarn(context, str, false);
    }

    @Deprecated
    public static zzarn zzu(String str, Context context, boolean z, int i) {
        zzarm.zzr(context, z);
        return new zzarn(context, str, z);
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final List zzp(zzasp zzaspVar, Context context, zzaom zzaomVar, zzaof zzaofVar) {
        if (zzaspVar.zzk() != null && ((zzarm) this).zzu) {
            int zza = zzaspVar.zza();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(super.zzp(zzaspVar, context, zzaomVar, null));
            arrayList.add(new zzath(zzaspVar, "9mv9Ihk+HlE8P3WJWSjhrxWrdB7cEu1gaxdteA5kBJ6DKumpWYk1Q5Vf8aocVg4i", "s7rU1m4XsqJ83s2reIjdkboWJYkg+gYouDrDcn3Ghpw=", zzaomVar, zza, 24));
            return arrayList;
        }
        return super.zzp(zzaspVar, context, zzaomVar, null);
    }
}
