package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j20 implements ss0 {
    public static final String d = bo1.e("CommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f2690a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2691b = new HashMap();
    public final Object c = new Object();

    public j20(Context context) {
        this.f2690a = context;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // defpackage.ss0
    public final void b(String str, boolean z) {
        synchronized (this.c) {
            ss0 ss0Var = (ss0) this.f2691b.remove(str);
            if (ss0Var != null) {
                ss0Var.b(str, z);
            }
        }
    }

    public final boolean d() {
        boolean z;
        synchronized (this.c) {
            if (!this.f2691b.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void e(Intent intent, int i, r43 r43Var) {
        boolean z;
        boolean z2;
        String action = intent.getAction();
        int i2 = 6;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            bo1 c = bo1.c();
            String.format("Handling constraints changed %s", intent);
            c.a(new Throwable[0]);
            w70 w70Var = new w70(this.f2690a, i, r43Var);
            ArrayList d2 = r43Var.e.s.n().d();
            int i3 = i70.f2547a;
            Iterator it = d2.iterator();
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            while (it.hasNext()) {
                u70 u70Var = ((rs3) it.next()).j;
                z3 |= u70Var.d;
                z4 |= u70Var.f4634b;
                z5 |= u70Var.e;
                if (u70Var.f4633a != uz1.NOT_REQUIRED) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z6 |= z2;
                if (z3 && z4 && z5 && z6) {
                    break;
                }
            }
            int i4 = ConstraintProxyUpdateReceiver.f292a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = w70Var.f4954a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z4).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z5).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z6);
            context.sendBroadcast(intent2);
            wr3 wr3Var = w70Var.c;
            wr3Var.c(d2);
            ArrayList arrayList = new ArrayList(d2.size());
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = d2.iterator();
            while (it2.hasNext()) {
                rs3 rs3Var = (rs3) it2.next();
                String str = rs3Var.f4206a;
                if (currentTimeMillis >= rs3Var.a() && (!rs3Var.b() || wr3Var.a(str))) {
                    arrayList.add(rs3Var);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String str2 = ((rs3) it3.next()).f4206a;
                Intent a2 = a(context, str2);
                bo1 c2 = bo1.c();
                String.format("Creating a delay_met command for workSpec with id (%s)", str2);
                int i5 = w70.d;
                c2.a(new Throwable[0]);
                r43Var.f(new l30(r43Var, a2, w70Var.f4955b, i2));
            }
            wr3Var.d();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            bo1 c3 = bo1.c();
            String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i));
            c3.a(new Throwable[0]);
            r43Var.e.d0();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras != null && !extras.isEmpty() && extras.get(strArr[0]) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            bo1.c().b(d, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
            bo1 c4 = bo1.c();
            String.format("Handling schedule work for %s", string);
            c4.a(new Throwable[0]);
            WorkDatabase workDatabase = r43Var.e.s;
            workDatabase.c();
            try {
                rs3 h = workDatabase.n().h(string);
                if (h == null) {
                    bo1.c().f(new Throwable[0]);
                } else if (h.f4207b.a()) {
                    bo1.c().f(new Throwable[0]);
                } else {
                    long a3 = h.a();
                    boolean b2 = h.b();
                    Context context2 = this.f2690a;
                    hs3 hs3Var = r43Var.e;
                    if (!b2) {
                        bo1 c5 = bo1.c();
                        String.format("Setting up Alarms for %s at %s", string, Long.valueOf(a3));
                        c5.a(new Throwable[0]);
                        e9.b(context2, hs3Var, string, a3);
                    } else {
                        bo1 c6 = bo1.c();
                        String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(a3));
                        c6.a(new Throwable[0]);
                        e9.b(context2, hs3Var, string, a3);
                        Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                        r43Var.f(new l30(r43Var, intent3, i, i2));
                    }
                    workDatabase.h();
                }
                return;
            } finally {
                workDatabase.f();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            Bundle extras2 = intent.getExtras();
            synchronized (this.c) {
                String string2 = extras2.getString("KEY_WORKSPEC_ID");
                bo1 c7 = bo1.c();
                String.format("Handing delay met for %s", string2);
                c7.a(new Throwable[0]);
                if (!this.f2691b.containsKey(string2)) {
                    wj0 wj0Var = new wj0(this.f2690a, i, string2, r43Var);
                    this.f2691b.put(string2, wj0Var);
                    wj0Var.c();
                } else {
                    bo1 c8 = bo1.c();
                    String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string2);
                    c8.a(new Throwable[0]);
                }
            }
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
            bo1 c9 = bo1.c();
            String.format("Handing stopWork work for %s", string3);
            c9.a(new Throwable[0]);
            r43Var.e.f0(string3);
            int i6 = e9.f1899a;
            y33 k = r43Var.e.s.k();
            a53 x = k.x(string3);
            if (x != null) {
                e9.a(this.f2690a, x.f28b, string3);
                bo1 c10 = bo1.c();
                String.format("Removing SystemIdInfo for workSpecId (%s)", string3);
                c10.a(new Throwable[0]);
                k.F(string3);
            }
            r43Var.b(string3, false);
            return;
        }
        if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            Bundle extras3 = intent.getExtras();
            String string4 = extras3.getString("KEY_WORKSPEC_ID");
            boolean z7 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
            bo1 c11 = bo1.c();
            String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i));
            c11.a(new Throwable[0]);
            b(string4, z7);
            return;
        }
        bo1 c12 = bo1.c();
        String.format("Ignoring intent %s", intent);
        c12.f(new Throwable[0]);
    }
}
