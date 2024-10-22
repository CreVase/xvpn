package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* loaded from: classes.dex */
public final class s43 implements hn2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4271a;

    static {
        bo1.e("SystemAlarmScheduler");
    }

    public s43(Context context) {
        this.f4271a = context.getApplicationContext();
    }

    @Override // defpackage.hn2
    public final boolean a() {
        return true;
    }

    @Override // defpackage.hn2
    public final void c(String str) {
        String str2 = j20.d;
        Context context = this.f4271a;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        context.startService(intent);
    }

    @Override // defpackage.hn2
    public final void e(rs3... rs3VarArr) {
        for (rs3 rs3Var : rs3VarArr) {
            bo1 c = bo1.c();
            String.format("Scheduling work with workSpecId %s", rs3Var.f4206a);
            c.a(new Throwable[0]);
            String str = rs3Var.f4206a;
            Context context = this.f4271a;
            context.startService(j20.c(context, str));
        }
    }
}
