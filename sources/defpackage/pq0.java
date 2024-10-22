package defpackage;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class pq0 implements oq0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3896a;

    /* renamed from: b, reason: collision with root package name */
    public String f3897b;

    public static String h(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return p71.m(str, " : ", str2);
    }

    @Override // defpackage.oq0
    public final Object a() {
        return this;
    }

    @Override // defpackage.oq0
    public final boolean b(CharSequence charSequence, int i, int i2, rf3 rf3Var) {
        if (TextUtils.equals(charSequence.subSequence(i, i2), this.f3897b)) {
            rf3Var.c = (rf3Var.c & 3) | 4;
            return false;
        }
        return true;
    }

    public final void c(StringBuilder sb, AbstractCollection abstractCollection) {
        CharSequence obj;
        CharSequence obj2;
        Iterator it = abstractCollection.iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    obj = (CharSequence) next;
                } else {
                    obj = next.toString();
                }
                sb.append(obj);
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f3897b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        obj2 = (CharSequence) next2;
                    } else {
                        obj2 = next2.toString();
                    }
                    sb.append(obj2);
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final i4 d() {
        if (this.f3897b != null) {
            return new i4(this);
        }
        throw new IllegalArgumentException("Product type must be set");
    }

    public final void e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            h(this.f3897b, str, objArr);
        }
    }

    public final void f(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", h(this.f3897b, str, objArr), remoteException);
        }
    }

    public final void g(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", h(this.f3897b, str, objArr));
        }
    }

    public final String toString() {
        switch (this.f3896a) {
            case 6:
                return "<" + this.f3897b + '>';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ pq0(String str, int i, int i2) {
        this.f3896a = i;
        this.f3897b = str;
    }

    public pq0(String str, int i) {
        this.f3896a = i;
        if (i == 4) {
            str.getClass();
            this.f3897b = str;
            return;
        }
        this.f3897b = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }
}
