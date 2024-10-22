package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import defpackage.bo1;
import defpackage.dk1;
import defpackage.hs3;
import defpackage.ku;
import defpackage.pu;
import defpackage.u43;
import defpackage.v43;
import defpackage.y33;
import java.util.UUID;

/* loaded from: classes.dex */
public class SystemForegroundService extends dk1 implements u43 {
    public static final String f = bo1.e("SystemFgService");

    /* renamed from: b, reason: collision with root package name */
    public Handler f298b;
    public boolean c;
    public v43 d;
    public NotificationManager e;

    public final void a() {
        this.f298b = new Handler(Looper.getMainLooper());
        this.e = (NotificationManager) getApplicationContext().getSystemService("notification");
        v43 v43Var = new v43(getApplicationContext());
        this.d = v43Var;
        if (v43Var.i != null) {
            bo1.c().b(v43.j, "A callback already exists.", new Throwable[0]);
        } else {
            v43Var.i = this;
        }
    }

    @Override // defpackage.dk1, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // defpackage.dk1, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        v43 v43Var = this.d;
        v43Var.i = null;
        synchronized (v43Var.c) {
            v43Var.h.d();
        }
        v43Var.f4777a.v.f(v43Var);
    }

    @Override // defpackage.dk1, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.c;
        String str = f;
        int i3 = 0;
        if (z) {
            bo1.c().d(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            v43 v43Var = this.d;
            v43Var.i = null;
            synchronized (v43Var.c) {
                v43Var.h.d();
            }
            v43Var.f4777a.v.f(v43Var);
            a();
            this.c = false;
        }
        if (intent != null) {
            v43 v43Var2 = this.d;
            v43Var2.getClass();
            String action = intent.getAction();
            boolean equals = "ACTION_START_FOREGROUND".equals(action);
            String str2 = v43.j;
            hs3 hs3Var = v43Var2.f4777a;
            if (equals) {
                bo1.c().d(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
                ((y33) v43Var2.f4778b).r(new ku(6, v43Var2, hs3Var.s, intent.getStringExtra("KEY_WORKSPEC_ID")));
                v43Var2.e(intent);
                return 3;
            }
            if ("ACTION_NOTIFY".equals(action)) {
                v43Var2.e(intent);
                return 3;
            }
            if ("ACTION_CANCEL_WORK".equals(action)) {
                bo1.c().d(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                    UUID fromString = UUID.fromString(stringExtra);
                    hs3Var.getClass();
                    ((y33) hs3Var.t).r(new pu(hs3Var, fromString, i3));
                    return 3;
                }
                return 3;
            }
            if ("ACTION_STOP_FOREGROUND".equals(action)) {
                bo1.c().d(str2, "Stopping foreground service", new Throwable[0]);
                u43 u43Var = v43Var2.i;
                if (u43Var != null) {
                    SystemForegroundService systemForegroundService = (SystemForegroundService) u43Var;
                    systemForegroundService.c = true;
                    bo1.c().a(new Throwable[0]);
                    if (Build.VERSION.SDK_INT >= 26) {
                        systemForegroundService.stopForeground(true);
                    }
                    systemForegroundService.stopSelf();
                    return 3;
                }
                return 3;
            }
            return 3;
        }
        return 3;
    }
}
