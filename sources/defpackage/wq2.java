package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class wq2 implements mv0 {
    public static wq2 e;

    /* renamed from: a, reason: collision with root package name */
    public Object f5056a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5057b;
    public Object c;
    public Object d;

    public wq2(aa0 aa0Var, fv2 fv2Var, hv2 hv2Var) {
        gv2 gv2Var = gv2.g;
        this.f5056a = aa0Var;
        this.f5057b = hv2Var;
        int i = 0;
        this.c = zf3.a(Integer.MAX_VALUE, 0, 6);
        this.d = new AtomicInteger(0);
        df1 df1Var = (df1) ((aa0) this.f5056a).w().get(d5.g);
        if (df1Var == null) {
            return;
        }
        ((nf1) df1Var).J(false, true, new su2(i, fv2Var, this, gv2Var));
    }

    public static synchronized wq2 b() {
        wq2 wq2Var;
        synchronized (wq2.class) {
            if (e == null) {
                e = new wq2(0);
            }
            wq2Var = e;
        }
        return wq2Var;
    }

    public final dl a() {
        String str;
        if (((Long) this.f5057b) == null) {
            str = " baseAddress";
        } else {
            str = "";
        }
        if (((Long) this.c) == null) {
            str = str.concat(" size");
        }
        if (((String) this.f5056a) == null) {
            str = p71.l(str, " name");
        }
        if (str.isEmpty()) {
            return new dl(((Long) this.f5057b).longValue(), ((Long) this.c).longValue(), (String) this.f5056a, (String) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final boolean c(Context context) {
        boolean z;
        if (((Boolean) this.c) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.c = Boolean.valueOf(z);
        }
        ((Boolean) this.f5057b).booleanValue();
        return ((Boolean) this.c).booleanValue();
    }

    public final boolean d(Context context) {
        boolean z;
        if (((Boolean) this.f5057b) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f5057b = Boolean.valueOf(z);
        }
        ((Boolean) this.f5057b).booleanValue();
        return ((Boolean) this.f5057b).booleanValue();
    }

    public final void e(dv2 dv2Var) {
        ow owVar;
        Object j = ((jw) this.c).j(dv2Var);
        boolean z = j instanceof ow;
        Throwable th = null;
        if (z) {
            if (z) {
                owVar = (ow) j;
            } else {
                owVar = null;
            }
            if (owVar != null) {
                th = owVar.f3739a;
            }
            if (th == null) {
                throw new k10("Channel was closed normally");
            }
            throw th;
        }
        if (!(j instanceof pw)) {
            if (((AtomicInteger) this.d).getAndIncrement() == 0) {
                zf3.T((aa0) this.f5056a, null, new tu2(this, null), 3);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new gs3((Executor) ((Provider) this.f5056a).get(), (os0) ((Provider) this.f5057b).get(), (ps3) ((Provider) this.c).get(), (j43) ((Provider) this.d).get());
    }

    public /* synthetic */ wq2(Object obj, Object obj2, Object obj3, Provider provider) {
        this.f5056a = obj;
        this.f5057b = obj2;
        this.c = obj3;
        this.d = provider;
    }

    public wq2(Typeface typeface, nw1 nw1Var) {
        int i;
        int i2;
        this.d = typeface;
        this.f5056a = nw1Var;
        this.c = new ow1(UserVerificationMethods.USER_VERIFY_ALL);
        nw1 nw1Var2 = (nw1) this.f5056a;
        int a2 = nw1Var2.a(6);
        if (a2 != 0) {
            int i3 = a2 + nw1Var2.f5118a;
            i = ((ByteBuffer) nw1Var2.d).getInt(((ByteBuffer) nw1Var2.d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f5057b = new char[i * 2];
        nw1 nw1Var3 = (nw1) this.f5056a;
        int a3 = nw1Var3.a(6);
        if (a3 != 0) {
            int i4 = a3 + nw1Var3.f5118a;
            i2 = ((ByteBuffer) nw1Var3.d).getInt(((ByteBuffer) nw1Var3.d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            rf3 rf3Var = new rf3(this, i5);
            mw1 c = rf3Var.c();
            int a4 = c.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) c.d).getInt(a4 + c.f5118a) : 0, (char[]) this.f5057b, i5 * 2);
            tf3.u(rf3Var.b() > 0, "invalid metadata codepoint length");
            ((ow1) this.c).a(rf3Var, 0, rf3Var.b() - 1);
        }
    }

    public wq2(int i) {
        if (i != 1) {
            if (i == 2) {
                this.f5056a = new m62(UserVerificationMethods.USER_VERIFY_HANDPRINT, 0);
                this.f5057b = new m62(UserVerificationMethods.USER_VERIFY_HANDPRINT, 0);
                this.c = new m62(UserVerificationMethods.USER_VERIFY_HANDPRINT, 0);
                this.d = new ix2[32];
                return;
            }
            if (i == 5) {
                this.f5056a = new kg();
                this.f5057b = new SparseArray();
                this.c = new ko1();
                this.d = new kg();
                return;
            }
            if (i == 6) {
                this.f5057b = null;
                this.c = new ArrayList();
                this.d = null;
                this.f5056a = "";
                return;
            }
            if (i != 9) {
                this.f5056a = null;
                this.f5057b = null;
                this.c = null;
                this.d = new ArrayDeque();
            }
        }
    }
}
