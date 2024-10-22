package defpackage;

import android.app.job.JobInfo;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.exoplayer2.scheduler.Requirements;
import java.util.List;

/* loaded from: classes.dex */
public final class um0 implements om0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4695a;

    /* renamed from: b, reason: collision with root package name */
    public final qm0 f4696b;
    public final boolean c;
    public final gn2 d;
    public final Class e;
    public wm0 f;
    public Requirements g;

    public um0(Context context, qm0 qm0Var, boolean z, gn2 gn2Var, Class cls) {
        this.f4695a = context;
        this.f4696b = qm0Var;
        this.c = z;
        this.d = gn2Var;
        this.e = cls;
        qm0Var.e.add(this);
        c();
    }

    public final void a() {
        Requirements requirements = new Requirements(0);
        if (!wi3.a(this.g, requirements)) {
            m52 m52Var = (m52) this.d;
            m52Var.c.cancel(m52Var.f3235a);
            this.g = requirements;
        }
    }

    public final void b() {
        boolean z = this.c;
        Class cls = this.e;
        Context context = this.f4695a;
        if (z) {
            try {
                Intent access$900 = wm0.access$900(context, cls, "com.google.android.exoplayer.downloadService.action.RESTART");
                if (wi3.f5017a >= 26) {
                    context.startForegroundService(access$900);
                } else {
                    context.startService(access$900);
                }
                return;
            } catch (IllegalStateException unused) {
                sn1.f();
                return;
            }
        }
        try {
            context.startService(wm0.access$900(context, cls, wm0.ACTION_INIT));
        } catch (IllegalStateException unused2) {
            sn1.f();
        }
    }

    public final boolean c() {
        Requirements requirements;
        Requirements requirements2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        qm0 qm0Var = this.f4696b;
        boolean z7 = qm0Var.l;
        gn2 gn2Var = this.d;
        if (gn2Var == null) {
            return !z7;
        }
        if (!z7) {
            a();
            return true;
        }
        Requirements requirements3 = qm0Var.n.c;
        m52 m52Var = (m52) gn2Var;
        int i = m52.d;
        int i2 = requirements3.f1513a;
        int i3 = i & i2;
        if (i3 == i2) {
            requirements = requirements3;
        } else {
            requirements = new Requirements(i3);
        }
        if (!requirements.equals(requirements3)) {
            a();
            return false;
        }
        if (!(!wi3.a(this.g, requirements3))) {
            return true;
        }
        String packageName = this.f4695a.getPackageName();
        int i4 = requirements3.f1513a;
        int i5 = i & i4;
        if (i5 == i4) {
            requirements2 = requirements3;
        } else {
            requirements2 = new Requirements(i5);
        }
        if (!requirements2.equals(requirements3)) {
            sn1.f();
        }
        JobInfo.Builder builder = new JobInfo.Builder(m52Var.f3235a, m52Var.f3236b);
        if ((i4 & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            builder.setRequiredNetworkType(2);
        } else {
            if ((i4 & 1) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                builder.setRequiredNetworkType(1);
            }
        }
        if ((i4 & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        builder.setRequiresDeviceIdle(z3);
        if ((i4 & 8) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        builder.setRequiresCharging(z4);
        if (wi3.f5017a >= 26) {
            if ((i4 & 16) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                builder.setRequiresStorageNotLow(true);
            }
        }
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("service_action", "com.google.android.exoplayer.downloadService.action.RESTART");
        persistableBundle.putString("service_package", packageName);
        persistableBundle.putInt(wm0.KEY_REQUIREMENTS, i4);
        builder.setExtras(persistableBundle);
        if (m52Var.c.schedule(builder.build()) == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            this.g = requirements3;
            return true;
        }
        sn1.f();
        a();
        return false;
    }

    @Override // defpackage.om0
    public final void onDownloadChanged(qm0 qm0Var, jm0 jm0Var, Exception exc) {
        boolean z;
        wm0 wm0Var = this.f;
        if (wm0Var != null) {
            wm0.access$400(wm0Var, jm0Var);
        }
        wm0 wm0Var2 = this.f;
        if (wm0Var2 != null && !wm0.access$800(wm0Var2)) {
            z = false;
        } else {
            z = true;
        }
        if (z && wm0.access$500(jm0Var.f2791b)) {
            sn1.f();
            b();
        }
    }

    @Override // defpackage.om0
    public final void onDownloadRemoved(qm0 qm0Var, jm0 jm0Var) {
        wm0 wm0Var = this.f;
        if (wm0Var != null) {
            wm0.access$600(wm0Var);
        }
    }

    @Override // defpackage.om0
    public final /* synthetic */ void onDownloadsPausedChanged(qm0 qm0Var, boolean z) {
    }

    @Override // defpackage.om0
    public final void onIdle(qm0 qm0Var) {
        wm0 wm0Var = this.f;
        if (wm0Var != null) {
            wm0.access$700(wm0Var);
        }
    }

    @Override // defpackage.om0
    public final void onInitialized(qm0 qm0Var) {
        wm0 wm0Var = this.f;
        if (wm0Var != null) {
            wm0.access$300(wm0Var, qm0Var.m);
        }
    }

    @Override // defpackage.om0
    public final void onRequirementsStateChanged(qm0 qm0Var, Requirements requirements, int i) {
        c();
    }

    @Override // defpackage.om0
    public final void onWaitingForRequirementsChanged(qm0 qm0Var, boolean z) {
        boolean z2;
        if (!z && !qm0Var.i) {
            wm0 wm0Var = this.f;
            if (wm0Var != null && !wm0.access$800(wm0Var)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                List list = qm0Var.m;
                for (int i = 0; i < list.size(); i++) {
                    if (((jm0) list.get(i)).f2791b == 0) {
                        b();
                        return;
                    }
                }
            }
        }
    }
}
