package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* loaded from: classes2.dex */
public final class rx0 {

    /* renamed from: a, reason: collision with root package name */
    public final qa0 f4228a;

    public rx0(qa0 qa0Var) {
        this.f4228a = qa0Var;
    }

    public static rx0 a() {
        px0 b2 = px0.b();
        b2.a();
        rx0 rx0Var = (rx0) b2.d.a(rx0.class);
        if (rx0Var != null) {
            return rx0Var;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public final void b() {
        Boolean a2;
        qa0 qa0Var = this.f4228a;
        Boolean bool = Boolean.TRUE;
        nd0 nd0Var = qa0Var.f3975b;
        synchronized (nd0Var) {
            if (bool != null) {
                try {
                    nd0Var.f = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (bool != null) {
                a2 = bool;
            } else {
                px0 px0Var = nd0Var.f3441b;
                px0Var.a();
                a2 = nd0Var.a(px0Var.f3931a);
            }
            nd0Var.g = a2;
            SharedPreferences.Editor edit = nd0Var.f3440a.edit();
            if (bool != null) {
                edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            } else {
                edit.remove("firebase_crashlytics_collection_enabled");
            }
            edit.apply();
            synchronized (nd0Var.c) {
                if (nd0Var.b()) {
                    if (!nd0Var.e) {
                        nd0Var.d.trySetResult(null);
                        nd0Var.e = true;
                    }
                } else if (nd0Var.e) {
                    nd0Var.d = new TaskCompletionSource();
                    nd0Var.e = false;
                }
            }
        }
    }

    public final void c(String str) {
        boolean equals;
        jx0 jx0Var = this.f4228a.g.d;
        jx0Var.getClass();
        String b2 = di1.b(UserVerificationMethods.USER_VERIFY_ALL, str);
        synchronized (((AtomicMarkableReference) jx0Var.f)) {
            String str2 = (String) ((AtomicMarkableReference) jx0Var.f).getReference();
            if (b2 == null) {
                if (str2 == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = b2.equals(str2);
            }
            if (!equals) {
                ((AtomicMarkableReference) jx0Var.f).set(b2, true);
                ((eb3) jx0Var.f2846b).D(new li3(jx0Var, 0));
            }
        }
    }
}
