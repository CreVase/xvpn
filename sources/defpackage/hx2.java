package defpackage;

import a.bx;
import a.du;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.p;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract /* synthetic */ class hx2 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f2498a = {1, 2, 3, 4, 5, 6, 7, 8};

    public static /* synthetic */ String A(int i) {
        return i == 1 ? "SUSPEND" : i == 2 ? "DROP_OLDEST" : i == 3 ? "DROP_LATEST" : "null";
    }

    public static /* synthetic */ String B(int i) {
        return i == 1 ? "UNKNOWN" : i == 2 ? "HORIZONTAL_DIMENSION" : i == 3 ? "VERTICAL_DIMENSION" : i == 4 ? "LEFT" : i == 5 ? "RIGHT" : i == 6 ? "TOP" : i == 7 ? "BOTTOM" : i == 8 ? "BASELINE" : "null";
    }

    public static /* synthetic */ int[] C(int i) {
        int[] iArr = new int[i];
        System.arraycopy(f2498a, 0, iArr, 0, i);
        return iArr;
    }

    public static /* synthetic */ boolean a(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static long b(og0 og0Var) {
        byte[] bArr = (byte[]) og0Var.f3656b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "ctv";
        }
        if (i == 2) {
            return "mobile";
        }
        if (i == 3) {
            return "other";
        }
        throw null;
    }

    public static /* synthetic */ int d(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 4) {
            return 4;
        }
        throw null;
    }

    public static /* synthetic */ long e(int i) {
        if (i == 1) {
            return 0L;
        }
        if (i == 2) {
            return 1L;
        }
        if (i == 3) {
            return 2L;
        }
        if (i == 4) {
            return 3L;
        }
        if (i == 5) {
            return 4L;
        }
        throw null;
    }

    public static float f(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static mw0 g(q9 q9Var, uy0 uy0Var) {
        uy0Var.s(q9Var.j());
        return uy0Var.g();
    }

    public static eu3 h(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        eu3 eu3Var = new eu3(context, attributeSet, i, i2);
        eu3Var.setOrientation(i3);
        return eu3Var;
    }

    public static bx i(int i) {
        bx bxVar = new bx();
        du.d(i, bxVar);
        return bxVar;
    }

    public static bx j(String str, int i) {
        bx bxVar = new bx();
        bxVar.z(str);
        du.d(i, bxVar);
        return bxVar;
    }

    public static a k(p pVar, p pVar2) {
        pVar.getClass();
        return new a(pVar2);
    }

    public static String l(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.B());
        return sb.toString();
    }

    public static String m(String str, int i) {
        return str + i;
    }

    public static String n(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    public static String o(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String p(String str, String str2) {
        return str + str2;
    }

    public static String q(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String r(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String s(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder t(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder u(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void v(int i, int i2, Space space) {
        space.setLayoutParams(new LinearLayout.LayoutParams(i, i2));
    }

    public static /* synthetic */ void w(View view) {
        if (view != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ int x(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String y(int i) {
        return i == 1 ? "OK" : i == 2 ? "TRANSIENT_ERROR" : i == 3 ? "FATAL_ERROR" : i == 4 ? "INVALID_PAYLOAD" : "null";
    }

    public static /* synthetic */ String z(int i) {
        return i == 1 ? "EXPONENTIAL" : i == 2 ? "LINEAR" : "null";
    }
}
