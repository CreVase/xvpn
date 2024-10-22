package defpackage;

import a.bx;
import a.du;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.appcompat.widget.AppCompatTextView;
import com.chartboost.sdk.impl.f6;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzer;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class p71 {
    public static void A(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static /* synthetic */ void C(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ String D(int i) {
        return i == 1 ? "RUN_AS_NON_EXPEDITED_WORK_REQUEST" : i == 2 ? "DROP_WORK_REQUEST" : "null";
    }

    public static /* synthetic */ String E(int i) {
        return i == 1 ? "IDLE" : i == 2 ? "QUEUING" : i == 3 ? "QUEUED" : i == 4 ? "RUNNING" : "null";
    }

    public static int[] _values() {
        return hx2.C(8);
    }

    public static int a(int i, int i2, int i3) {
        return i | i2 | i3 | 0 | 128;
    }

    public static /* synthetic */ char b(int i) {
        if (i == 1) {
            return '{';
        }
        if (i == 2) {
            return '[';
        }
        if (i == 3) {
            return '{';
        }
        if (i == 4) {
            return '[';
        }
        throw null;
    }

    public static int c(int i) {
        return i & 384;
    }

    public static /* synthetic */ char d(int i) {
        if (i == 1) {
            return '}';
        }
        if (i == 2) {
            return ']';
        }
        if (i == 3) {
            return '}';
        }
        if (i == 4) {
            return ']';
        }
        throw null;
    }

    public static int e(int i) {
        return i & 64;
    }

    public static int f(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static int g(AppCompatTextView appCompatTextView, int i, String str, AppCompatTextView appCompatTextView2, int i2) {
        appCompatTextView.setId(i);
        appCompatTextView.setText(str);
        tf3.A0(appCompatTextView2);
        return tf3.K(i2);
    }

    public static int h(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    public static RemoteException i(String str, Throwable th) {
        zzcat.zzh(str, th);
        return new RemoteException();
    }

    public static IObjectWrapper j(Parcel parcel) {
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return asInterface;
    }

    public static String k(String str, int i, String str2) {
        return str + i + str2;
    }

    public static String l(String str, String str2) {
        return str + str2;
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static StringBuilder n(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder o(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder p(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder q(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static /* synthetic */ void r() {
    }

    public static void s(int i, HashMap hashMap, String str, int i2, String str2, int i3, String str3, int i4, String str4) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
        hashMap.put(str3, Integer.valueOf(i3));
        hashMap.put(str4, Integer.valueOf(i4));
    }

    public static /* synthetic */ void t(r90 r90Var) {
        if (r90Var != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void u(Parcelable parcelable) {
        if (parcelable != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void w(Object obj) {
        throw new ClassCastException();
    }

    public static void x(String str, int i) {
        bx bxVar = new bx();
        bxVar.z(str);
        du.d(i, bxVar);
        bxVar.h();
    }

    public static void y(String str, int i, String str2) {
        zzer.zzf(str2, str + i);
    }

    public static void z(String str, Exception exc, String str2) {
        f6.b(str2, str + exc);
    }
}
