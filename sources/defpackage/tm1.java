package defpackage;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class tm1 implements cs2 {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f4535a;

    public tm1(Context context) {
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f4535a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // defpackage.cs2
    public final Object a(c90 c90Var) {
        return ch3.f636a;
    }

    @Override // defpackage.cs2
    public final Boolean b() {
        Bundle bundle = this.f4535a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // defpackage.cs2
    public final po0 c() {
        Bundle bundle = this.f4535a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new po0(fl.c0(bundle.getInt("firebase_sessions_sessions_restart_timeout"), to0.d));
        }
        return null;
    }

    @Override // defpackage.cs2
    public final Double d() {
        Bundle bundle = this.f4535a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }
}
