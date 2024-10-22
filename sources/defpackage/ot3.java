package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.television.HomeActivity;

/* loaded from: classes2.dex */
public final class ot3 {
    public static final ot3 c = new ot3();

    /* renamed from: a, reason: collision with root package name */
    public Class f3727a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3728b = false;

    public final void a(Activity activity) {
        Class cls;
        boolean z = this.f3728b;
        if (z) {
            this.f3728b = false;
            z = true;
        }
        if (z) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("KEY_NEED_BIND", true);
            if (XApplication.c) {
                cls = HomeActivity.class;
            } else {
                cls = MainActivity.class;
            }
            Intent intent = new Intent(activity, (Class<?>) cls);
            intent.putExtra("KEY_CMD_NAME", "CMD_ACCOUNT_OR_BIND");
            intent.putExtra("KEY_EXTRAS", bundle);
            intent.setFlags(335544320);
            activity.startActivity(intent);
            return;
        }
        ot3 ot3Var = c;
        if (ot3Var.f3727a != null) {
            if (!activity.isFinishing()) {
                ya0.I(activity, ot3Var.f3727a);
            }
            ot3Var.f3727a = null;
        }
    }
}
