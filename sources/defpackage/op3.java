package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.security.xvpn.z35kb.quickconn.QuickConnActionReciver;
import com.security.xvpn.z35kb.quickconn.WidgetProvider;

/* loaded from: classes2.dex */
public final class op3 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ WidgetProvider g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ op3(WidgetProvider widgetProvider, int i) {
        super(1);
        this.f = i;
        this.g = widgetProvider;
    }

    public final PendingIntent b(Context context) {
        int i = this.f;
        WidgetProvider widgetProvider = this.g;
        switch (i) {
            case 0:
                int i2 = widgetProvider.f1615a;
                Intent intent = new Intent("334gqdj8wm");
                intent.setPackage(context.getPackageName());
                intent.setClass(context, QuickConnActionReciver.class);
                intent.putExtra("x-vpn:quick_conn", "x-vpn:quick_conn:launchApp");
                return PendingIntent.getBroadcast(context, i2, intent, widgetProvider.c);
            default:
                int i3 = widgetProvider.f1616b;
                Intent intent2 = new Intent("334gqdj8wm");
                intent2.setPackage(context.getPackageName());
                intent2.setClass(context, QuickConnActionReciver.class);
                intent2.putExtra("x-vpn:quick_conn", "x-vpn:quick_conn:launcherWidget");
                return PendingIntent.getBroadcast(context, i3, intent2, widgetProvider.c);
        }
    }

    @Override // defpackage.x31
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f) {
            case 0:
                return b((Context) obj);
            default:
                return b((Context) obj);
        }
    }
}
