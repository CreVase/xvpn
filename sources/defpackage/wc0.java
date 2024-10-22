package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class wc0 {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f4980a;

    /* renamed from: b, reason: collision with root package name */
    public final wq2 f4981b;
    public final boolean c;

    public wc0() {
        this.f4980a = new Intent("android.intent.action.VIEW");
        this.f4981b = new wq2(1);
        this.c = true;
    }

    public final x50 a() {
        Intent intent = this.f4980a;
        Object obj = null;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            yr.b(bundle, "android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.c);
        wq2 wq2Var = this.f4981b;
        Integer num = (Integer) wq2Var.f5056a;
        Integer num2 = (Integer) wq2Var.f5057b;
        Integer num3 = (Integer) wq2Var.c;
        Integer num4 = (Integer) wq2Var.d;
        Bundle bundle2 = new Bundle();
        if (num != null) {
            bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        if (num2 != null) {
            bundle2.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        if (num3 != null) {
            bundle2.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        if (num4 != null) {
            bundle2.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        intent.putExtras(bundle2);
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        return new x50(4, intent, obj);
    }

    public wc0(zc0 zc0Var) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f4980a = intent;
        this.f4981b = new wq2(1);
        this.c = true;
        if (zc0Var != null) {
            intent.setPackage(zc0Var.f5462b.getPackageName());
            IBinder asBinder = zc0Var.f5461a.asBinder();
            Bundle bundle = new Bundle();
            yr.b(bundle, "android.support.customtabs.extra.SESSION", asBinder);
            PendingIntent pendingIntent = zc0Var.c;
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            intent.putExtras(bundle);
        }
    }
}
