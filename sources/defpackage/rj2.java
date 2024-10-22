package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import com.google.android.exoplayer2.scheduler.Requirements;

/* loaded from: classes.dex */
public final class rj2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4162a;

    /* renamed from: b, reason: collision with root package name */
    public final z5 f4163b;
    public final Requirements c;
    public final Handler d = wi3.l(null);
    public fd e;
    public int f;
    public qj2 g;

    public rj2(Context context, z5 z5Var, Requirements requirements) {
        this.f4162a = context.getApplicationContext();
        this.f4163b = z5Var;
        this.c = requirements;
    }

    public final void a() {
        int a2 = this.c.a(this.f4162a);
        if (this.f != a2) {
            this.f = a2;
            qm0 qm0Var = (qm0) this.f4163b.f5428b;
            Requirements requirements = qm0.o;
            qm0Var.b(this, a2);
        }
    }

    public final int b() {
        boolean z;
        boolean z2;
        boolean z3;
        Requirements requirements = this.c;
        Context context = this.f4162a;
        this.f = requirements.a(context);
        IntentFilter intentFilter = new IntentFilter();
        int i = requirements.f1513a;
        boolean z4 = false;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (wi3.f5017a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                connectivityManager.getClass();
                qj2 qj2Var = new qj2(this);
                this.g = qj2Var;
                connectivityManager.registerDefaultNetworkCallback(qj2Var);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((i & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (wi3.f5017a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if ((i & 16) != 0) {
            z4 = true;
        }
        if (z4) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        fd fdVar = new fd(this);
        this.e = fdVar;
        context.registerReceiver(fdVar, intentFilter, null, this.d);
        return this.f;
    }
}
