package defpackage;

import android.net.Uri;
import com.chartboost.sdk.impl.x2;
import java.net.URL;

/* loaded from: classes2.dex */
public final class aj2 implements ub0 {

    /* renamed from: a, reason: collision with root package name */
    public final vf f97a;

    /* renamed from: b, reason: collision with root package name */
    public final t90 f98b;
    public final String c = "firebase-settings.crashlytics.com";

    public aj2(vf vfVar, t90 t90Var) {
        this.f97a = vfVar;
        this.f98b = t90Var;
    }

    public static final URL a(aj2 aj2Var) {
        aj2Var.getClass();
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority(aj2Var.c).appendPath("spi").appendPath(x2.f1288a).appendPath("platforms").appendPath("android").appendPath("gmp");
        vf vfVar = aj2Var.f97a;
        Uri.Builder appendPath2 = appendPath.appendPath(vfVar.f4823a).appendPath("settings");
        ab abVar = vfVar.d;
        return new URL(appendPath2.appendQueryParameter("build_version", abVar.c).appendQueryParameter("display_version", abVar.f47b).build().toString());
    }
}
