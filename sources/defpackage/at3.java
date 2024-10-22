package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Provider;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class at3 implements mv0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f337a;

    /* renamed from: b, reason: collision with root package name */
    public Object f338b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public at3(Provider provider, Provider provider2, Provider provider3, eb3 eb3Var, Provider provider4, Provider provider5, Provider provider6) {
        s71 s71Var = cp3.k;
        c02 c02Var = ew3.v;
        this.f337a = provider;
        this.f338b = provider2;
        this.c = provider3;
        this.d = eb3Var;
        this.e = provider4;
        this.f = provider5;
        this.g = s71Var;
        this.h = c02Var;
        this.i = provider6;
    }

    public final rk a() {
        String str;
        if (((Integer) this.f337a) == null) {
            str = " pid";
        } else {
            str = "";
        }
        if (((String) this.g) == null) {
            str = str.concat(" processName");
        }
        if (((Integer) this.f338b) == null) {
            str = p71.l(str, " reasonCode");
        }
        if (((Integer) this.c) == null) {
            str = p71.l(str, " importance");
        }
        if (((Long) this.d) == null) {
            str = p71.l(str, " pss");
        }
        if (((Long) this.e) == null) {
            str = p71.l(str, " rss");
        }
        if (((Long) this.f) == null) {
            str = p71.l(str, " timestamp");
        }
        if (str.isEmpty()) {
            return new rk(((Integer) this.f337a).intValue(), (String) this.g, ((Integer) this.f338b).intValue(), ((Integer) this.c).intValue(), ((Long) this.d).longValue(), ((Long) this.e).longValue(), ((Long) this.f).longValue(), (String) this.h, (gb1) this.i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final zk b() {
        String str;
        if (((Integer) this.f337a) == null) {
            str = " arch";
        } else {
            str = "";
        }
        if (((String) this.g) == null) {
            str = str.concat(" model");
        }
        if (((Integer) this.f338b) == null) {
            str = p71.l(str, " cores");
        }
        if (((Long) this.c) == null) {
            str = p71.l(str, " ram");
        }
        if (((Long) this.d) == null) {
            str = p71.l(str, " diskSpace");
        }
        if (((Boolean) this.e) == null) {
            str = p71.l(str, " simulator");
        }
        if (((Integer) this.f) == null) {
            str = p71.l(str, " state");
        }
        if (((String) this.h) == null) {
            str = p71.l(str, " manufacturer");
        }
        if (((String) this.i) == null) {
            str = p71.l(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new zk(((Integer) this.f337a).intValue(), (String) this.g, ((Integer) this.f338b).intValue(), ((Long) this.c).longValue(), ((Long) this.d).longValue(), ((Boolean) this.e).booleanValue(), ((Integer) this.f).intValue(), (String) this.h, (String) this.i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final vr2 c(int i) {
        JSONObject b2;
        boolean z;
        vr2 vr2Var = null;
        try {
            if (!hx2.a(2, i) && (b2 = ((as2) this.e).b()) != null) {
                vr2 a2 = ((as2) this.c).a(b2);
                if (a2 != null) {
                    b2.toString();
                    ((mp0) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!hx2.a(3, i)) {
                        if (a2.c < currentTimeMillis) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                        }
                    }
                    vr2Var = a2;
                } else {
                    Log.e("FirebaseCrashlytics", "Failed to parse cached settings data.", null);
                }
            }
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
        }
        return vr2Var;
    }

    public final vr2 d() {
        return (vr2) ((AtomicReference) this.h).get();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new fi3((Context) ((Provider) this.f337a).get(), (jw1) ((Provider) this.f338b).get(), (os0) ((Provider) this.c).get(), (ps3) ((Provider) this.d).get(), (Executor) ((Provider) this.e).get(), (j43) ((Provider) this.f).get(), (g10) ((Provider) this.g).get(), (g10) ((Provider) this.h).get(), (w00) ((Provider) this.i).get());
    }

    public at3(Context context, ds2 ds2Var, mp0 mp0Var, as2 as2Var, as2 as2Var2, y33 y33Var, nd0 nd0Var) {
        this.h = new AtomicReference();
        this.i = new AtomicReference(new TaskCompletionSource());
        this.f337a = context;
        this.f338b = ds2Var;
        this.d = mp0Var;
        this.c = as2Var;
        this.e = as2Var2;
        this.f = y33Var;
        this.g = nd0Var;
        ((AtomicReference) this.h).set(mp0.i(mp0Var));
    }

    public at3(Context context, u40 u40Var, g63 g63Var, r01 r01Var, WorkDatabase workDatabase, String str) {
        this.i = new y33(9);
        this.f337a = context.getApplicationContext();
        this.d = g63Var;
        this.c = r01Var;
        this.e = u40Var;
        this.f = workDatabase;
        this.g = str;
    }
}
