package defpackage;

import android.app.Activity;
import android.os.Build;

/* loaded from: classes.dex */
public final class xy2 {

    /* renamed from: a, reason: collision with root package name */
    public final vy2 f5248a;

    public xy2(boolean z, Activity activity) {
        vy2 vy2Var;
        if (z) {
            vy2Var = new vy2(z, activity);
        } else if (Build.VERSION.SDK_INT >= 31) {
            vy2Var = new uy2(activity);
        } else {
            vy2Var = new vy2(false, activity);
        }
        this.f5248a = vy2Var;
    }
}
