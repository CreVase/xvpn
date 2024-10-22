package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.cr0;
import defpackage.gc1;
import defpackage.hf;
import defpackage.r82;
import defpackage.t82;
import defpackage.tj1;
import defpackage.xj1;
import defpackage.yj1;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements gc1 {
    @Override // defpackage.gc1
    public final List a() {
        return cr0.f1659a;
    }

    @Override // defpackage.gc1
    public final Object b(Context context) {
        if (hf.c(context).f2409b.contains(ProcessLifecycleInitializer.class)) {
            if (!yj1.f5348a.getAndSet(true)) {
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new xj1());
            }
            t82 t82Var = t82.i;
            t82Var.getClass();
            t82Var.e = new Handler();
            t82Var.f.e(tj1.ON_CREATE);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new r82(t82Var));
            return t82Var;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}
