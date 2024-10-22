package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class v43 implements vr3, ss0 {
    public static final String j = bo1.e("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final hs3 f4777a;

    /* renamed from: b, reason: collision with root package name */
    public final g63 f4778b;
    public final Object c = new Object();
    public String d;
    public final LinkedHashMap e;
    public final HashMap f;
    public final HashSet g;
    public final wr3 h;
    public u43 i;

    public v43(Context context) {
        hs3 a0 = hs3.a0(context);
        this.f4777a = a0;
        g63 g63Var = a0.t;
        this.f4778b = g63Var;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashSet();
        this.f = new HashMap();
        this.h = new wr3(context, g63Var, this);
        a0.v.a(this);
    }

    public static Intent a(Context context, String str, p01 p01Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", p01Var.f3760a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", p01Var.f3761b);
        intent.putExtra("KEY_NOTIFICATION", p01Var.c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, p01 p01Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", p01Var.f3760a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", p01Var.f3761b);
        intent.putExtra("KEY_NOTIFICATION", p01Var.c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // defpackage.ss0
    public final void b(String str, boolean z) {
        boolean z2;
        Map.Entry entry;
        synchronized (this.c) {
            try {
                rs3 rs3Var = (rs3) this.f.remove(str);
                if (rs3Var != null) {
                    z2 = this.g.remove(rs3Var);
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.h.c(this.g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        p01 p01Var = (p01) this.e.remove(str);
        if (str.equals(this.d) && this.e.size() > 0) {
            Iterator it = this.e.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.d = (String) entry.getKey();
            if (this.i != null) {
                p01 p01Var2 = (p01) entry.getValue();
                u43 u43Var = this.i;
                SystemForegroundService systemForegroundService = (SystemForegroundService) u43Var;
                systemForegroundService.f298b.post(new w43(systemForegroundService, p01Var2.f3760a, p01Var2.c, p01Var2.f3761b));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.i;
                systemForegroundService2.f298b.post(new x43(systemForegroundService2, p01Var2.f3760a));
            }
        }
        u43 u43Var2 = this.i;
        if (p01Var != null && u43Var2 != null) {
            bo1 c = bo1.c();
            String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(p01Var.f3760a), str, Integer.valueOf(p01Var.f3761b));
            c.a(new Throwable[0]);
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) u43Var2;
            systemForegroundService3.f298b.post(new x43(systemForegroundService3, p01Var.f3760a));
        }
    }

    @Override // defpackage.vr3
    public final void d(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                bo1 c = bo1.c();
                String.format("Constraints unmet for WorkSpec %s", str);
                c.a(new Throwable[0]);
                hs3 hs3Var = this.f4777a;
                ((y33) hs3Var.t).r(new l13(hs3Var, str, true));
            }
        }
    }

    public final void e(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        bo1 c = bo1.c();
        String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2));
        c.a(new Throwable[0]);
        if (notification != null && this.i != null) {
            p01 p01Var = new p01(intExtra, intExtra2, notification);
            LinkedHashMap linkedHashMap = this.e;
            linkedHashMap.put(stringExtra, p01Var);
            if (TextUtils.isEmpty(this.d)) {
                this.d = stringExtra;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.i;
                systemForegroundService.f298b.post(new w43(systemForegroundService, intExtra, notification, intExtra2));
                return;
            }
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.i;
            systemForegroundService2.f298b.post(new l30(systemForegroundService2, intExtra, notification, 7));
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((p01) ((Map.Entry) it.next()).getValue()).f3761b;
                }
                p01 p01Var2 = (p01) linkedHashMap.get(this.d);
                if (p01Var2 != null) {
                    SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.i;
                    systemForegroundService3.f298b.post(new w43(systemForegroundService3, p01Var2.f3760a, p01Var2.c, i));
                }
            }
        }
    }

    @Override // defpackage.vr3
    public final void f(List list) {
    }
}
