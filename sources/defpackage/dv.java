package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import java.util.UUID;

/* loaded from: classes.dex */
public final class dv implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1843b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dv(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f1842a = i;
        this.e = obj;
        this.f1843b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rs3 h;
        int i = this.f1842a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.f1843b;
        switch (i) {
            case 0:
                ev evVar = (ev) obj4;
                if (evVar != null) {
                    v51 v51Var = (v51) obj;
                    ((fv) v51Var.f4780b).A = true;
                    evVar.f2000b.c(false);
                    ((fv) v51Var.f4780b).A = false;
                }
                MenuItem menuItem = (MenuItem) obj3;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    ((ju1) obj2).q(menuItem, null, 4);
                    return;
                }
                return;
            case 1:
                try {
                    boolean booleanExtra = ((Intent) obj4).getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = ((Intent) obj4).getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = ((Intent) obj4).getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = ((Intent) obj4).getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    bo1 c = bo1.c();
                    int i2 = ConstraintProxyUpdateReceiver.f292a;
                    String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4));
                    c.a(new Throwable[0]);
                    h42.a((Context) obj3, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    h42.a((Context) obj3, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    h42.a((Context) obj3, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    h42.a((Context) obj3, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    ((BroadcastReceiver.PendingResult) obj2).finish();
                }
            default:
                UUID uuid = (UUID) obj4;
                String uuid2 = uuid.toString();
                bo1 c2 = bo1.c();
                String str = ls3.c;
                String.format("Updating progress for %s (%s)", uuid, (jd0) obj3);
                c2.a(new Throwable[0]);
                ls3 ls3Var = (ls3) obj;
                WorkDatabase workDatabase = ls3Var.f3182a;
                WorkDatabase workDatabase2 = ls3Var.f3182a;
                workDatabase.c();
                try {
                    h = ((ls3) obj).f3182a.n().h(uuid2);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                if (h != null) {
                    if (h.f4207b == fs3.RUNNING) {
                        ((ls3) obj).f3182a.m().A(new js3(uuid2, (jd0) obj3));
                    } else {
                        bo1 c3 = bo1.c();
                        String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid2);
                        c3.f(new Throwable[0]);
                    }
                    ((rr2) obj2).h(null);
                    ((ls3) obj).f3182a.h();
                    return;
                }
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
    }
}
