package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public final class gy0 {

    /* renamed from: a, reason: collision with root package name */
    public final px0 f2340a;

    /* renamed from: b, reason: collision with root package name */
    public final lr2 f2341b;
    public final iq c;
    public final zq2 d;

    public gy0(px0 px0Var, xx0 xx0Var, v90 v90Var, v90 v90Var2, fb2 fb2Var) {
        boolean z;
        this.f2340a = px0Var;
        vf a2 = cr2.a(px0Var);
        px0Var.a();
        lr2 lr2Var = new lr2(px0Var.f3931a, v90Var2, v90Var, xx0Var, a2);
        this.f2341b = lr2Var;
        v73 v73Var = new v73();
        this.d = new zq2(xx0Var, new fs0(fb2Var));
        if (Math.random() <= lr2Var.a()) {
            z = true;
        } else {
            z = false;
        }
        iq iqVar = new iq(z, v73Var);
        this.c = iqVar;
        gr2 gr2Var = new gr2(v73Var, v90Var, new fy0(this), lr2Var, iqVar);
        px0Var.a();
        Context applicationContext = px0Var.f3931a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(gr2Var.g);
            ti0 ti0Var = new ti0(20, applicationContext, gr2Var);
            px0Var.a();
            Preconditions.checkNotNull(ti0Var);
            px0Var.j.add(ti0Var);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:(1:(4:12|13|14|15)(2:18|19))(6:20|21|(1:23)(2:30|(1:32))|(3:27|(1:29)|13)|14|15))(1:33))(2:60|(1:62))|34|(7:36|(2:39|37)|40|41|(3:51|(3:54|(2:56|57)(1:58)|52)|59)|45|(2:47|(1:50)(4:49|21|(0)(0)|(4:25|27|(0)|13))))|14|15))|64|6|7|(0)(0)|34|(0)|14|15) */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.gy0 r10, defpackage.ar2 r11, defpackage.c90 r12) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gy0.a(gy0, ar2, c90):java.lang.Object");
    }
}
