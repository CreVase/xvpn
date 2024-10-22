package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.security.xvpn.z35kb.connlog.ConnectionLogActivity;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class gb2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2224a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2225b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gb2(Context context, boolean z, TaskCompletionSource taskCompletionSource) {
        this.c = context;
        this.f2225b = z;
        this.d = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z;
        Object systemService;
        String notificationDelegate;
        int i2 = this.f2224a;
        boolean z2 = this.f2225b;
        int i3 = 0;
        Object obj = this.d;
        Context context = this.c;
        switch (i2) {
            case 0:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                    } else {
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context;
                        }
                        SharedPreferences.Editor edit = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                        edit.putBoolean("proxy_notification_initialized", true);
                        edit.apply();
                        systemService = context.getSystemService((Class<Object>) NotificationManager.class);
                        NotificationManager notificationManager = (NotificationManager) systemService;
                        if (z2) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else {
                            notificationDelegate = notificationManager.getNotificationDelegate();
                            if ("com.google.android.gms".equals(notificationDelegate)) {
                                notificationManager.setNotificationDelegate(null);
                            }
                        }
                    }
                    return;
                } finally {
                    taskCompletionSource.trySetResult(null);
                }
            default:
                ConnectionLogActivity connectionLogActivity = (ConnectionLogActivity) context;
                String str = (String) obj;
                Iterator it = connectionLogActivity.n.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        w50 w50Var = (w50) next;
                        if (m20.L(str, w50Var.f4943b)) {
                            if (z2) {
                                i = 4;
                            } else {
                                i = 2;
                            }
                            w50Var.j = i;
                            connectionLogActivity.p.put(w50Var.f4943b, Integer.valueOf(i));
                            connectionLogActivity.o.i(i3, "ping");
                        }
                        i3 = i4;
                    } else {
                        tf3.y0();
                        throw null;
                    }
                }
                return;
        }
    }

    public /* synthetic */ gb2(ConnectionLogActivity connectionLogActivity, String str, boolean z) {
        this.c = connectionLogActivity;
        this.d = str;
        this.f2225b = z;
    }
}
