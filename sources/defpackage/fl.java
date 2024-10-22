package defpackage;

import a.bx;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.security.xvpn.z35kb.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class fl implements kr0 {
    public static final pq0 g;
    public static final pq0 h;
    public static final pq0 i;
    public static final pq0 j;
    public static final pq0 k;
    public static UiModeManager q;

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2107a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f2108b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final pq0 c = new pq0("NO_DECISION", 6, 0);
    public static final int[] d = new int[0];
    public static final Object[] e = new Object[0];
    public static final String[] f = new String[0];
    public static final xq0 l = new xq0(false);
    public static final xq0 m = new xq0(true);
    public static final xf1 n = new xf1(2);
    public static final mw2 o = new mw2();
    public static final ow2 p = new ow2();

    static {
        int i2 = 6;
        int i3 = 0;
        g = new pq0("COMPLETING_ALREADY", i2, i3);
        h = new pq0("COMPLETING_WAITING_CHILDREN", i2, i3);
        i = new pq0("COMPLETING_RETRY", i2, i3);
        j = new pq0("TOO_LATE_TO_CANCEL", i2, i3);
        k = new pq0("SEALED", i2, i3);
    }

    public static zp2 A(rb2 rb2Var, String str, String str2, boolean z) {
        String str3;
        if (rb2Var != null) {
            zp2 zp2Var = new zp2();
            zp2Var.f5528a = rb2Var.f4125a;
            String str4 = rb2Var.f4126b;
            zp2Var.f5529b = str4;
            String str5 = rb2Var.d;
            if (str5 == null) {
                str5 = "";
            }
            zp2Var.d = str5;
            String str6 = rb2Var.e;
            if (!TextUtils.isEmpty(str6)) {
                try {
                    Color.parseColor("#" + str6);
                } catch (Exception unused) {
                }
            }
            zp2Var.h = rb2Var.h;
            zp2Var.n = (int) rb2Var.m;
            long j2 = rb2Var.i;
            zp2Var.k = (int) j2;
            if (rb2Var.g) {
                str3 = "Premium";
            } else {
                str3 = "Free";
            }
            zp2Var.e = str3;
            zp2Var.c = rb2Var.f;
            zp2Var.j = 0;
            zp2Var.m = (int) rb2Var.r;
            zp2Var.f = str;
            zp2Var.g = str2;
            rb2[] rb2VarArr = rb2Var.j;
            if (rb2VarArr != null) {
                if (rb2VarArr.length > 0 && z && j2 < 3) {
                    str4 = hx2.r(p71.p(str4, " ("), zp2Var.m, ")");
                }
                zp2Var.f5529b = str4;
                for (rb2 rb2Var2 : rb2Var.j) {
                    zp2 A = A(rb2Var2, str, str2, z);
                    if (A != null) {
                        if (zp2Var.l == null) {
                            zp2Var.l = new ArrayList();
                        }
                        zp2Var.l.add(A);
                    }
                }
            }
            return zp2Var;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:            if (r8 == null) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:            if (r8 != null) goto L20;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004f, code lost:            return null;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004c, code lost:            r8.close();     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String B(defpackage.lt3 r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L2c java.lang.IllegalArgumentException -> L2e
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2c java.lang.IllegalArgumentException -> L2e
            if (r8 == 0) goto L29
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.IllegalArgumentException -> L27 java.lang.Throwable -> L50
            if (r9 == 0) goto L29
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.IllegalArgumentException -> L27 java.lang.Throwable -> L50
            java.lang.String r9 = r8.getString(r9)     // Catch: java.lang.IllegalArgumentException -> L27 java.lang.Throwable -> L50
            r8.close()
            return r9
        L27:
            r9 = move-exception
            goto L31
        L29:
            if (r8 == 0) goto L4f
            goto L4c
        L2c:
            r8 = move-exception
            goto L53
        L2e:
            r8 = move-exception
            r9 = r8
            r8 = r7
        L31:
            java.lang.String r10 = "FileUtils"
            java.util.Locale r11 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "getDataColumn: _data - [%s]"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L50
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L50
            r2 = 0
            r1[r2] = r9     // Catch: java.lang.Throwable -> L50
            java.lang.String r9 = java.lang.String.format(r11, r0, r1)     // Catch: java.lang.Throwable -> L50
            android.util.Log.i(r10, r9)     // Catch: java.lang.Throwable -> L50
            if (r8 == 0) goto L4f
        L4c:
            r8.close()
        L4f:
            return r7
        L50:
            r9 = move-exception
            r7 = r8
            r8 = r9
        L53:
            if (r7 == 0) goto L58
            r7.close()
        L58:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl.B(lt3, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static int C(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return 0;
        }
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf > 0) {
            str = str.substring(0, lastIndexOf);
        }
        return context.getResources().getIdentifier(str, "drawable", context.getPackageName());
    }

    public static final Class D(mh1 mh1Var) {
        return ((i00) mh1Var).a();
    }

    public static final Class E(mh1 mh1Var) {
        Class a2 = ((i00) mh1Var).a();
        if (!a2.isPrimitive()) {
            return a2;
        }
        String name = a2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.class;
                }
                return a2;
            case 104431:
                if (name.equals("int")) {
                    return Integer.class;
                }
                return a2;
            case 3039496:
                if (name.equals("byte")) {
                    return Byte.class;
                }
                return a2;
            case 3052374:
                if (name.equals("char")) {
                    return Character.class;
                }
                return a2;
            case 3327612:
                if (name.equals("long")) {
                    return Long.class;
                }
                return a2;
            case 3625364:
                if (name.equals("void")) {
                    return Void.class;
                }
                return a2;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.class;
                }
                return a2;
            case 97526364:
                if (name.equals("float")) {
                    return Float.class;
                }
                return a2;
            case 109413500:
                if (name.equals("short")) {
                    return Short.class;
                }
                return a2;
            default:
                return a2;
        }
    }

    public static int F(nn3 nn3Var) {
        int i2 = nn3Var.i(4);
        if (i2 == 15) {
            if (nn3Var.b() >= 24) {
                return nn3Var.i(24);
            }
            throw u42.a("AAC header insufficient data", null);
        }
        if (i2 < 13) {
            return f2107a[i2];
        }
        throw u42.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static boolean I() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) tf3.d().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public static boolean J(int i2, Object obj) {
        int i3;
        if (!(obj instanceof m41)) {
            return false;
        }
        if (obj instanceof w41) {
            i3 = ((w41) obj).getArity();
        } else if (obj instanceof v31) {
            i3 = 0;
        } else if (obj instanceof x31) {
            i3 = 1;
        } else if (obj instanceof l41) {
            i3 = 2;
        } else if (obj instanceof n41) {
            i3 = 3;
        } else if (obj instanceof o41) {
            i3 = 4;
        } else if (obj instanceof p41) {
            i3 = 5;
        } else if (obj instanceof s41) {
            i3 = 8;
        } else {
            i3 = -1;
        }
        if (i3 != i2) {
            return false;
        }
        return true;
    }

    public static final boolean K(char c2) {
        if (!Character.isWhitespace(c2) && !Character.isSpaceChar(c2)) {
            return false;
        }
        return true;
    }

    public static void L(ArrayList arrayList) {
        if (arrayList != null && arrayList.size() != 0) {
            String y = pd0.y(R.string.History);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((zp2) arrayList.get(i2)).f = y;
                ((zp2) arrayList.get(i2)).i = true;
                L(((zp2) arrayList.get(i2)).l);
            }
        }
    }

    public static a S(nn3 nn3Var, boolean z) {
        int i2 = nn3Var.i(5);
        if (i2 == 31) {
            i2 = nn3Var.i(6) + 32;
        }
        int F = F(nn3Var);
        int i3 = nn3Var.i(4);
        String m2 = hx2.m("mp4a.40.", i2);
        if (i2 == 5 || i2 == 29) {
            F = F(nn3Var);
            int i4 = nn3Var.i(5);
            if (i4 == 31) {
                i4 = nn3Var.i(6) + 32;
            }
            i2 = i4;
            if (i2 == 22) {
                i3 = nn3Var.i(4);
            }
        }
        if (z) {
            if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 6 && i2 != 7 && i2 != 17) {
                switch (i2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw u42.b("Unsupported audio object type: " + i2);
                }
            }
            if (nn3Var.h()) {
                sn1.f();
            }
            if (nn3Var.h()) {
                nn3Var.r(14);
            }
            boolean h2 = nn3Var.h();
            if (i3 != 0) {
                if (i2 == 6 || i2 == 20) {
                    nn3Var.r(3);
                }
                if (h2) {
                    if (i2 == 22) {
                        nn3Var.r(16);
                    }
                    if (i2 == 17 || i2 == 19 || i2 == 20 || i2 == 23) {
                        nn3Var.r(3);
                    }
                    nn3Var.r(1);
                }
                switch (i2) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int i5 = nn3Var.i(2);
                        if (i5 == 2 || i5 == 3) {
                            throw u42.b("Unsupported epConfig: " + i5);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i6 = f2108b[i3];
        if (i6 != -1) {
            return new a(F, i6, m2);
        }
        throw u42.a(null, null);
    }

    public static a T(byte[] bArr) {
        return S(new nn3(bArr, 2, (Object) null), false);
    }

    public static final long U(String str) {
        int i2;
        boolean z;
        int length = str.length();
        if (length > 0 && i23.S0("+-", str.charAt(0))) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (length - i2 > 16) {
            Iterable kd1Var = new kd1(i2, i23.V0(str));
            if (!(kd1Var instanceof Collection) || !((Collection) kd1Var).isEmpty()) {
                Iterator it = kd1Var.iterator();
                while (((jd1) it).c) {
                    if (!new bx('0', '9').c(str.charAt(((jd1) it).c()))) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                if (str.charAt(0) == '-') {
                    return Long.MIN_VALUE;
                }
                return Long.MAX_VALUE;
            }
        }
        if (i23.q1(str, "+", false)) {
            str = j23.v1(1, str);
        }
        return Long.parseLong(str);
    }

    public static t90 V(t90 t90Var, t90 t90Var2) {
        if (t90Var2 != zq0.f5530a) {
            return (t90) t90Var2.fold(t90Var, gv2.q);
        }
        return t90Var;
    }

    public static ArrayList W(rb2[] rb2VarArr, boolean z) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        if (rb2VarArr != null) {
            for (rb2 rb2Var : rb2VarArr) {
                if (rb2Var.i == 1) {
                    str = pd0.A(rb2Var.f4126b);
                    str2 = rb2Var.f4126b;
                    if (z && !"Game".equals(str2)) {
                        StringBuilder p2 = p71.p(str, " (");
                        p2.append(rb2Var.r);
                        p2.append(")");
                        str = p2.toString();
                    }
                } else {
                    str = "";
                    str2 = "";
                }
                zp2 A = A(rb2Var, str, str2, z);
                if (A != null) {
                    if (rb2Var.i == 1) {
                        ArrayList arrayList2 = A.l;
                        if (arrayList2 != null) {
                            arrayList.addAll(arrayList2);
                        }
                    } else {
                        arrayList.add(A);
                    }
                }
            }
        }
        return arrayList;
    }

    public static ArrayList X(String str) {
        bx j2 = hx2.j(str, 471);
        int t = (int) j2.t();
        rb2[] rb2VarArr = new rb2[t];
        for (int i2 = 0; i2 < t; i2++) {
            rb2 rb2Var = new rb2();
            ew3.s0(j2, rb2Var);
            rb2VarArr[i2] = rb2Var;
        }
        j2.h();
        return W(rb2VarArr, false);
    }

    public static void Y(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    public static void Z(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(p71.m(name, " cannot be cast to ", str));
        m20.S0(fl.class.getName(), classCastException);
        throw classCastException;
    }

    public static String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static final void a0(Object obj) {
        if (!(obj instanceof pk2)) {
        } else {
            throw ((pk2) obj).f3863a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long b(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl.b(java.lang.String):long");
    }

    public static final long b0(double d2, to0 to0Var) {
        double convert;
        double convert2;
        TimeUnit timeUnit = to0.f4550b.f4551a;
        TimeUnit timeUnit2 = to0Var.f4551a;
        long convert3 = timeUnit.convert(1L, timeUnit2);
        if (convert3 > 0) {
            convert = convert3 * d2;
        } else {
            convert = d2 / timeUnit2.convert(1L, timeUnit);
        }
        if (!Double.isNaN(convert)) {
            if (!Double.isNaN(convert)) {
                long round = Math.round(convert);
                if (new io1(-4611686018426999999L, 4611686018426999999L).c(round)) {
                    return y(round);
                }
                long convert4 = to0.c.f4551a.convert(1L, timeUnit2);
                if (convert4 > 0) {
                    convert2 = d2 * convert4;
                } else {
                    convert2 = d2 / timeUnit2.convert(1L, r0);
                }
                if (!Double.isNaN(convert2)) {
                    return x(Math.round(convert2));
                }
                throw new IllegalArgumentException("Cannot round NaN value.");
            }
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }

    public static List c(Object obj) {
        if ((obj instanceof qh1) && !(obj instanceof rh1)) {
            Z(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e2) {
            m20.S0(fl.class.getName(), e2);
            throw e2;
        }
    }

    public static final long c0(int i2, to0 to0Var) {
        if (to0Var.compareTo(to0.d) <= 0) {
            return y(to0.f4550b.f4551a.convert(i2, to0Var.f4551a));
        }
        return d0(i2, to0Var);
    }

    public static void d(int i2, Object obj) {
        if (obj != null && !J(i2, obj)) {
            Z(obj, "kotlin.jvm.functions.Function" + i2);
            throw null;
        }
    }

    public static final long d0(long j2, to0 to0Var) {
        to0 to0Var2 = to0.f4550b;
        long convert = to0Var.f4551a.convert(4611686018426999999L, to0Var2.f4551a);
        boolean c2 = new io1(-convert, convert).c(j2);
        TimeUnit timeUnit = to0Var.f4551a;
        if (c2) {
            return y(to0Var2.f4551a.convert(j2, timeUnit));
        }
        return w(t9.x(to0.c.f4551a.convert(j2, timeUnit)));
    }

    public static int e(int i2, int i3, int[] iArr) {
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else if (i7 > i3) {
                i4 = i6 - 1;
            } else {
                return i6;
            }
        }
        return ~i5;
    }

    public static int f(long[] jArr, int i2, long j2) {
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else if (j3 > j2) {
                i3 = i5 - 1;
            } else {
                return i5;
            }
        }
        return ~i4;
    }

    public static final Object f0(Object obj) {
        wb1 wb1Var;
        vb1 vb1Var;
        if (obj instanceof wb1) {
            wb1Var = (wb1) obj;
        } else {
            wb1Var = null;
        }
        if (wb1Var != null && (vb1Var = wb1Var.f4975a) != null) {
            return vb1Var;
        }
        return obj;
    }

    public static void g(f83 f83Var, View view, int i2) {
        if (view == null) {
            return;
        }
        view.setBackgroundColor(v73.j(i2));
        f83Var.getThemeListeners().a(new z73(1, i2, view));
    }

    public static final void g0(View view, boolean z) {
        int i2;
        if (z) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        view.setVisibility(i2);
    }

    public static void h(f83 f83Var, AppCompatImageView appCompatImageView, int i2) {
        if (appCompatImageView == null) {
            return;
        }
        pe0.Q(appCompatImageView, ColorStateList.valueOf(v73.j(i2)));
        f83Var.getThemeListeners().a(new z73(8, i2, appCompatImageView));
    }

    public static void i(f83 f83Var, View view, boolean z) {
        if (view == null) {
            return;
        }
        f83Var.getThemeListeners().a(new z73(0, 0, view, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void j(View view, f83 f83Var) {
        if (view instanceof ke1) {
            ((ke1) view).a();
        } else if (view != 0) {
            view.invalidate();
        }
        f83Var.r(view, false);
    }

    public static void k(f83 f83Var, ke1 ke1Var) {
        if (ke1Var == null) {
            return;
        }
        f83Var.getThemeListeners().a(new z73(0, 0, ke1Var));
    }

    public static void l(f83 f83Var, ke1 ke1Var, boolean z) {
        if (ke1Var == null) {
            return;
        }
        f83Var.getThemeListeners().a(new z73(0, 0, ke1Var, z));
    }

    public static void m(f83 f83Var, TextView textView, int i2) {
        if (textView == null) {
            return;
        }
        textView.setLinkTextColor(v73.j(i2));
        f83Var.getThemeListeners().a(new z73(6, i2, textView));
    }

    public static void n(f83 f83Var, TextView textView, int i2) {
        if (textView == null) {
            return;
        }
        textView.setTextColor(v73.j(i2));
        f83Var.getThemeListeners().a(new z73(2, i2, textView));
    }

    public static void o(f83 f83Var, Drawable drawable, int i2) {
        if (drawable == null) {
            return;
        }
        bn0.g(drawable, v73.j(i2));
        f83Var.getThemeListeners().a(new z73(8, i2, drawable));
    }

    public static final void p(int i2) {
        if (new kd1(2, 36).c(i2)) {
            return;
        }
        StringBuilder o2 = p71.o("radix ", i2, " was not in valid range ");
        o2.append(new kd1(2, 36));
        throw new IllegalArgumentException(o2.toString());
    }

    public static final void s(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gc3 gc3Var = (gc3) it.next();
            if (!gc3Var.a() && gc3Var.c) {
                gc3Var.c = false;
                if (!gc3Var.a()) {
                    s(gc3Var.f2235b);
                }
            }
        }
    }

    public static final int t(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static rb2 u(zp2 zp2Var) {
        int i2;
        int i3;
        zp2 zp2Var2;
        if (zp2Var == null) {
            return null;
        }
        rb2 rb2Var = new rb2();
        rb2Var.f4125a = zp2Var.a();
        rb2Var.f4126b = zp2Var.c();
        rb2Var.d = zp2Var.d;
        rb2Var.h = zp2Var.h;
        rb2Var.m = zp2Var.n;
        rb2Var.i = zp2Var.k;
        rb2Var.g = zp2Var.e.equals("Premium");
        rb2Var.f = zp2Var.c;
        ArrayList arrayList = zp2Var.l;
        if (arrayList != null) {
            i2 = arrayList.size();
        } else {
            i2 = 0;
        }
        rb2Var.j = new rb2[i2];
        rb2Var.r = zp2Var.m;
        int i4 = 0;
        while (true) {
            ArrayList arrayList2 = zp2Var.l;
            if (arrayList2 != null) {
                i3 = arrayList2.size();
            } else {
                i3 = 0;
            }
            if (i4 < i3) {
                rb2[] rb2VarArr = rb2Var.j;
                ArrayList arrayList3 = zp2Var.l;
                if (arrayList3 != null) {
                    zp2Var2 = (zp2) arrayList3.get(i4);
                } else {
                    zp2Var2 = null;
                }
                rb2VarArr[i4] = u(zp2Var2);
                i4++;
            } else {
                return rb2Var;
            }
        }
    }

    public static void v(lt3 lt3Var, Uri uri, String str) {
        Throwable th;
        FileChannel fileChannel;
        FileChannel fileChannel2 = null;
        try {
            FileChannel channel = new FileInputStream(lt3Var.getContentResolver().openFileDescriptor(uri, "r").getFileDescriptor()).getChannel();
            try {
                FileChannel channel2 = new FileOutputStream(new File(str)).getChannel();
                try {
                    channel.transferTo(0L, channel.size(), channel2);
                    channel.close();
                    channel.close();
                    if (channel2 != null) {
                        channel2.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel2 = channel2;
                    FileChannel fileChannel3 = fileChannel2;
                    fileChannel2 = channel;
                    fileChannel = fileChannel3;
                    if (fileChannel2 != null) {
                        fileChannel2.close();
                    }
                    if (fileChannel != null) {
                        fileChannel.close();
                        throw th;
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            fileChannel = null;
        }
    }

    public static final long w(long j2) {
        long j3 = (j2 << 1) + 1;
        int i2 = po0.d;
        int i3 = qo0.f4029a;
        return j3;
    }

    public static final long x(long j2) {
        if (new io1(-4611686018426L, 4611686018426L).c(j2)) {
            return y(j2 * 1000000);
        }
        return w(t9.x(j2));
    }

    public static final long y(long j2) {
        long j3 = j2 << 1;
        int i2 = po0.d;
        int i3 = qo0.f4029a;
        return j3;
    }

    public static final boolean z(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public int G(View view) {
        return 0;
    }

    public int H() {
        return 0;
    }

    public void M(int i2, int i3) {
    }

    public void N() {
    }

    public void O(View view, int i2) {
    }

    public abstract void P(int i2);

    public abstract void Q(View view, int i2, int i3);

    public abstract void R(View view, float f2, float f3);

    public abstract boolean e0(View view, int i2);

    public abstract int q(View view, int i2);

    public abstract int r(View view, int i2);
}
