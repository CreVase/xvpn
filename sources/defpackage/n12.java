package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.security.xvpn.z35kb.quickconn.QuickConnActionReciver;

/* loaded from: classes2.dex */
public final class n12 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ di2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n12(di2 di2Var, int i) {
        super(1);
        this.f = i;
        this.g = di2Var;
    }

    public final PendingIntent b(Context context) {
        int i = this.f;
        di2 di2Var = this.g;
        switch (i) {
            case 0:
                Intent intent = new Intent("334gqdj8wm");
                intent.setPackage(context.getPackageName());
                intent.setClass(context, QuickConnActionReciver.class);
                intent.putExtra("x-vpn:quick_conn", "x-vpn:quick_conn:launchApp");
                return PendingIntent.getBroadcast(context, 65281, intent, di2Var.f1790a);
            case 1:
                Intent intent2 = new Intent("334gqdj8wm");
                intent2.setPackage(context.getPackageName());
                intent2.setClass(context, QuickConnActionReciver.class);
                intent2.putExtra("x-vpn:quick_conn", "x-vpn:quick_conn:notification");
                return PendingIntent.getBroadcast(context, 65283, intent2, di2Var.f1790a);
            default:
                Intent intent3 = new Intent("334gqdj8wm");
                intent3.setPackage(context.getPackageName());
                intent3.setClass(context, QuickConnActionReciver.class);
                intent3.putExtra("x-vpn:quick_conn", "x-vpn:quick_conn:notification");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, 65284, intent3, di2Var.f1790a);
                if (broadcast == null) {
                    Intent intent4 = new Intent("334gqdj8wm");
                    intent4.setPackage(context.getPackageName());
                    intent4.setClass(context, QuickConnActionReciver.class);
                    intent4.putExtra("x-vpn:quick_conn", "x-vpn:quick_conn:notification");
                    PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 65284, intent4, di2Var.f1790a);
                    if (broadcast2 == null) {
                        Intent intent5 = new Intent("334gqdj8wm");
                        intent5.setPackage(context.getPackageName());
                        intent5.setClass(context, QuickConnActionReciver.class);
                        intent5.putExtra("x-vpn:quick_conn", "x-vpn:quick_conn:notification");
                        return PendingIntent.getBroadcast(context, 65284, intent5, di2Var.f1790a);
                    }
                    return broadcast2;
                }
                return broadcast;
        }
    }

    @Override // defpackage.x31
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f) {
            case 0:
                return b((Context) obj);
            case 1:
                return b((Context) obj);
            default:
                return b((Context) obj);
        }
    }
}
