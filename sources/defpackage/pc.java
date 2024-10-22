package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final /* synthetic */ class pc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3820b;

    public /* synthetic */ pc(Context context, int i) {
        this.f3819a = i;
        this.f3820b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3819a;
        Context context = this.f3820b;
        switch (i) {
            case 0:
                if (Build.VERSION.SDK_INT >= 33) {
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (sc.d().d()) {
                            String p0 = tf3.p0(context);
                            Object systemService = context.getSystemService("locale");
                            if (systemService != null) {
                                rc.b(systemService, qc.a(p0));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                sc.f = true;
                return;
            default:
                sc.t(context);
                return;
        }
    }
}
