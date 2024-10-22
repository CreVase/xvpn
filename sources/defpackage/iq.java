package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class iq implements va, ua {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2632a;

    /* renamed from: b, reason: collision with root package name */
    public int f2633b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;

    public iq(boolean z, v73 v73Var) {
        dr2 dr2Var = dr2.f1825b;
        this.f2632a = z;
        this.c = v73Var;
        this.d = dr2Var;
        this.e = a();
        this.f2633b = -1;
    }

    public final String a() {
        return i23.k1(((UUID) ((v31) this.d).invoke()).toString(), "-", "", false).toLowerCase(Locale.ROOT);
    }

    @Override // defpackage.ua
    public final void c(Bundle bundle) {
        synchronized (this.e) {
            Objects.toString(bundle);
            this.f = new CountDownLatch(1);
            this.f2632a = false;
            ((uo) this.c).c(bundle);
            try {
                if (((CountDownLatch) this.f).await(this.f2633b, (TimeUnit) this.d)) {
                    this.f2632a = true;
                }
            } catch (InterruptedException unused) {
                Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
            }
            this.f = null;
        }
    }

    @Override // defpackage.va
    public final void j(Bundle bundle, String str) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    public iq(uo uoVar, TimeUnit timeUnit) {
        this.e = new Object();
        this.f2632a = false;
        this.c = uoVar;
        this.f2633b = 500;
        this.d = timeUnit;
    }
}
