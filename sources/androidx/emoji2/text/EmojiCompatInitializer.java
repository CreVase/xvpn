package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.ai0;
import defpackage.aq0;
import defpackage.bk1;
import defpackage.bq0;
import defpackage.gc1;
import defpackage.hf;
import defpackage.pw3;
import defpackage.q40;
import defpackage.vj1;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements gc1 {
    @Override // defpackage.gc1
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.gc1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Boolean b(Context context) {
        bq0 bq0Var = new bq0(context);
        if (aq0.k == null) {
            synchronized (aq0.j) {
                if (aq0.k == null) {
                    aq0.k = new aq0(bq0Var);
                }
            }
        }
        d(context);
        return Boolean.TRUE;
    }

    public final void d(Context context) {
        Object obj;
        hf c = hf.c(context);
        c.getClass();
        synchronized (hf.e) {
            try {
                obj = c.f2408a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        final vj1 lifecycle = ((bk1) obj).getLifecycle();
        lifecycle.a(new ai0() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // defpackage.ai0
            public final /* synthetic */ void a() {
            }

            @Override // defpackage.ai0
            public final /* synthetic */ void b() {
            }

            @Override // defpackage.ai0
            public final void n(bk1 bk1Var) {
                Handler handler;
                EmojiCompatInitializer.this.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = q40.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new pw3(2), 500L);
                lifecycle.b(this);
            }

            @Override // defpackage.ai0
            public final /* synthetic */ void onDestroy(bk1 bk1Var) {
            }

            @Override // defpackage.ai0
            public final /* synthetic */ void onStart(bk1 bk1Var) {
            }

            @Override // defpackage.ai0
            public final /* synthetic */ void onStop(bk1 bk1Var) {
            }
        });
    }
}
