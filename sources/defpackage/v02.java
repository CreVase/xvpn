package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class v02 {

    /* renamed from: a, reason: collision with root package name */
    public u02 f4768a;

    public void a(Bundle bundle) {
        String c = c();
        if (c != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c);
        }
    }

    public abstract void b(h12 h12Var);

    public abstract String c();
}
