package defpackage;

import a.bx;
import a.du;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.text.style.LeadingMarginSpan;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.Task;
import com.security.xvpn.z35kb.livechat.ChatActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public abstract class t9 {

    /* renamed from: a, reason: collision with root package name */
    public static ky f4466a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f4467b;
    public static boolean c;
    public static Method d;
    public static boolean e;
    public static final pq0 f = new pq0("CLOSED", 6, 0);
    public static final String[] g = {"standard", "accelerate", "decelerate", "linear"};
    public static final String[] h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] i = {44100, 48000, 32000};
    public static final int[] j = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] k = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] l = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] m = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] n = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static final byte[] o = {48, 49, 53, 0};
    public static final byte[] p = {48, 49, 48, 0};
    public static final byte[] q = {48, 48, 57, 0};
    public static final byte[] r = {48, 48, 53, 0};
    public static final byte[] s = {48, 48, 49, 0};
    public static final byte[] t = {48, 48, 49, 0};
    public static final byte[] u = {48, 48, 50, 0};
    public static final jr v = new jr();

    public static final mx2 A0(Socket socket) {
        Logger logger = e22.f1877a;
        cx2 cx2Var = new cx2(socket);
        return cx2Var.source(new wg(socket.getInputStream(), cx2Var));
    }

    public static final id1 B0(kd1 kd1Var, int i2) {
        boolean z;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        Integer valueOf = Integer.valueOf(i2);
        if (z) {
            if (kd1Var.c <= 0) {
                i2 = -i2;
            }
            return new id1(kd1Var.f2571a, kd1Var.f2572b, i2);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static final Object C(long j2, c90 c90Var) {
        vj0 vj0Var;
        ch3 ch3Var = ch3.f636a;
        if (j2 <= 0) {
            return ch3Var;
        }
        vu vuVar = new vu(1, P(c90Var));
        vuVar.s();
        if (j2 < Long.MAX_VALUE) {
            r90 r90Var = vuVar.e.get(d5.f1730b);
            if (r90Var instanceof vj0) {
                vj0Var = (vj0) r90Var;
            } else {
                vj0Var = null;
            }
            if (vj0Var == null) {
                vj0Var = hh0.f2423a;
            }
            vj0Var.w(j2, vuVar);
        }
        Object r2 = vuVar.r();
        if (r2 == ba0.f430a) {
            return r2;
        }
        return ch3Var;
    }

    public static final void C0(z13 z13Var, Number number) {
        z13.n(z13Var, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0093, TryCatch #1 {all -> 0x0093, blocks: (B:12:0x002f, B:14:0x0054, B:19:0x0069, B:21:0x0071, B:25:0x007c, B:27:0x0082, B:30:0x0095, B:31:0x009d, B:32:0x009e, B:33:0x00a9, B:42:0x0045, B:45:0x0050), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r10v4, types: [yg2] */
    /* JADX WARN: Type inference failed for: r10v6, types: [yg2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0090 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object D(defpackage.iz0 r9, defpackage.x82 r10, boolean r11, defpackage.c90 r12) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t9.D(iz0, x82, boolean, c90):java.lang.Object");
    }

    public static final eg3 D0(String str) {
        int i2;
        int i3;
        fl.p(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        if (m20.W(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int i5 = 119304647;
        int i6 = 119304647;
        while (i2 < length) {
            int digit = Character.digit((int) str.charAt(i2), 10);
            if (digit < 0) {
                return null;
            }
            int i7 = i4 ^ Integer.MIN_VALUE;
            if (Integer.compare(i7, i6 ^ Integer.MIN_VALUE) > 0) {
                if (i6 == i5) {
                    i3 = i2;
                    i6 = (int) (((-1) & 4294967295L) / (10 & 4294967295L));
                    if (Integer.compare(i7, i6 ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            i3 = i2;
            int i8 = i4 * 10;
            int i9 = i8 + digit;
            if (Integer.compare(i9 ^ Integer.MIN_VALUE, i8 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i2 = i3 + 1;
            i4 = i9;
            i5 = 119304647;
        }
        return new eg3(i4);
    }

    public static String E(vs vsVar) {
        StringBuilder sb = new StringBuilder(vsVar.size());
        for (int i2 = 0; i2 < vsVar.size(); i2++) {
            byte b2 = vsVar.b(i2);
            if (b2 != 34) {
                if (b2 != 39) {
                    if (b2 != 92) {
                        switch (b2) {
                            case 7:
                                sb.append("\\a");
                                break;
                            case 8:
                                sb.append("\\b");
                                break;
                            case 9:
                                sb.append("\\t");
                                break;
                            case 10:
                                sb.append("\\n");
                                break;
                            case 11:
                                sb.append("\\v");
                                break;
                            case 12:
                                sb.append("\\f");
                                break;
                            case 13:
                                sb.append("\\r");
                                break;
                            default:
                                if (b2 >= 32 && b2 <= 126) {
                                    sb.append((char) b2);
                                    break;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((b2 >>> 6) & 3) + 48));
                                    sb.append((char) (((b2 >>> 3) & 7) + 48));
                                    sb.append((char) ((b2 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.jg3 E0(java.lang.String r24) {
        /*
            r0 = r24
            r1 = 10
            defpackage.fl.p(r1)
            int r2 = r24.length()
            if (r2 != 0) goto Lf
            goto L9a
        Lf:
            r3 = 0
            char r4 = r0.charAt(r3)
            r5 = 48
            int r5 = defpackage.m20.W(r4, r5)
            r6 = 1
            if (r5 >= 0) goto L27
            if (r2 == r6) goto L9a
            r5 = 43
            if (r4 == r5) goto L25
            goto L9a
        L25:
            r4 = 1
            goto L28
        L27:
            r4 = 0
        L28:
            long r7 = (long) r1
            r9 = 0
            r11 = 512409557603043100(0x71c71c71c71c71c, double:2.0539100454284282E-274)
            r13 = r9
            r15 = r11
        L32:
            if (r4 >= r2) goto La7
            char r5 = r0.charAt(r4)
            int r5 = java.lang.Character.digit(r5, r1)
            if (r5 >= 0) goto L3f
            goto L9a
        L3f:
            r17 = -9223372036854775808
            r19 = r2
            long r1 = r13 ^ r17
            r20 = r4
            long r3 = r15 ^ r17
            int r3 = java.lang.Long.compare(r1, r3)
            if (r3 <= 0) goto L86
            int r3 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r3 != 0) goto L9a
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r15 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r15 >= 0) goto L67
            long r15 = r7 ^ r17
            int r21 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r21 >= 0) goto L64
            r15 = r9
            goto L7d
        L64:
            r3 = 1
            goto L7c
        L67:
            long r3 = r3 / r7
            long r3 = r3 << r6
            long r15 = r3 * r7
            r21 = -1
            long r21 = r21 - r15
            long r15 = r21 ^ r17
            long r21 = r7 ^ r17
            int r23 = (r15 > r21 ? 1 : (r15 == r21 ? 0 : -1))
            if (r23 < 0) goto L79
            r15 = 1
            goto L7a
        L79:
            r15 = 0
        L7a:
            long r9 = (long) r15
            long r3 = r3 + r9
        L7c:
            r15 = r3
        L7d:
            long r3 = r15 ^ r17
            int r1 = java.lang.Long.compare(r1, r3)
            if (r1 <= 0) goto L86
            goto L9a
        L86:
            long r13 = r13 * r7
            long r1 = (long) r5
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            long r1 = r1 + r13
            long r3 = r1 ^ r17
            long r9 = r13 ^ r17
            int r3 = java.lang.Long.compare(r3, r9)
            if (r3 >= 0) goto L9c
        L9a:
            r0 = 0
            goto Lac
        L9c:
            int r4 = r20 + 1
            r13 = r1
            r2 = r19
            r1 = 10
            r3 = 0
            r9 = 0
            goto L32
        La7:
            jg3 r0 = new jg3
            r0.<init>(r13)
        Lac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t9.E0(java.lang.String):jg3");
    }

    public static final Object F(to2 to2Var, long j2, l41 l41Var) {
        boolean z;
        while (true) {
            if (to2Var.c >= j2 && !to2Var.c()) {
                return to2Var;
            }
            Object obj = s40.f4269a.get(to2Var);
            pq0 pq0Var = f;
            if (obj == pq0Var) {
                return pq0Var;
            }
            to2 to2Var2 = (to2) ((s40) obj);
            if (to2Var2 == null) {
                to2Var2 = (to2) l41Var.invoke(Long.valueOf(to2Var.c + 1), to2Var);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s40.f4269a;
                    if (atomicReferenceFieldUpdater.compareAndSet(to2Var, null, to2Var2)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(to2Var) != null) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    if (to2Var.c()) {
                        to2Var.d();
                    }
                }
            }
            to2Var = to2Var2;
        }
    }

    public static final String F0(String str) {
        int i2;
        Comparable comparable;
        int i3;
        List e1 = i23.e1(str);
        List list = e1;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!i23.b1((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(a20.C0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i2 < length) {
                    if (!fl.K(str2.charAt(i2))) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 == -1) {
                i2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(i2));
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = 0;
        }
        int size = (e1.size() * 0) + str.length();
        md3 md3Var = md3.u;
        int N = tf3.N(e1);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            int i4 = i2 + 1;
            if (i2 >= 0) {
                String str3 = (String) obj2;
                if ((i2 == 0 || i2 == N) && i23.b1(str3)) {
                    str3 = null;
                } else {
                    String str4 = (String) md3Var.invoke(j23.v1(i3, str3));
                    if (str4 != null) {
                        str3 = str4;
                    }
                }
                if (str3 != null) {
                    arrayList3.add(str3);
                }
                i2 = i4;
            } else {
                tf3.y0();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(size);
        d20.J0(arrayList3, sb);
        return sb.toString();
    }

    public static final t90 G(t90 t90Var, t90 t90Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        gv2 gv2Var = gv2.s;
        boolean booleanValue = ((Boolean) t90Var.fold(bool, gv2Var)).booleanValue();
        boolean booleanValue2 = ((Boolean) t90Var2.fold(bool, gv2Var)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return t90Var.plus(t90Var2);
        }
        ei2 ei2Var = new ei2();
        ei2Var.f1938a = t90Var2;
        zq0 zq0Var = zq0.f5530a;
        t90 t90Var3 = (t90) t90Var.fold(zq0Var, new h23(2, ei2Var, z));
        if (booleanValue2) {
            ei2Var.f1938a = ((t90) ei2Var.f1938a).fold(zq0Var, gv2.r);
        }
        return t90Var3.plus((t90) ei2Var.f1938a);
    }

    public static String G0(String str) {
        if (!i23.b1("|")) {
            List e1 = i23.e1(str);
            int size = (e1.size() * 0) + str.length();
            md3 md3Var = md3.u;
            int N = tf3.N(e1);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj : e1) {
                int i3 = i2 + 1;
                String str2 = null;
                if (i2 >= 0) {
                    String str3 = (String) obj;
                    if ((i2 != 0 && i2 != N) || !i23.b1(str3)) {
                        int length = str3.length();
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                if (!fl.K(str3.charAt(i4))) {
                                    break;
                                }
                                i4++;
                            } else {
                                i4 = -1;
                                break;
                            }
                        }
                        if (i4 != -1 && i23.p1(str3, i4, "|", false)) {
                            str2 = str3.substring("|".length() + i4);
                        }
                        if (str2 == null || (str2 = (String) md3Var.invoke(str2)) == null) {
                            str2 = str3;
                        }
                    }
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                    i2 = i3;
                } else {
                    tf3.y0();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(size);
            d20.J0(arrayList, sb);
            return sb.toString();
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    public static float H(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return lp0.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final String H0(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) U(-1, str2));
    }

    public static int I(int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if ((i2 & (-2097152)) == -2097152) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i9 = i[i6];
        if (i3 == 2) {
            i9 /= 2;
        } else if (i3 == 0) {
            i9 /= 4;
        }
        int i10 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            if (i3 == 3) {
                i8 = j[i5 - 1];
            } else {
                i8 = k[i5 - 1];
            }
            return (((i8 * 12) / i9) + i10) * 4;
        }
        if (i3 == 3) {
            if (i4 == 2) {
                i7 = l[i5 - 1];
            } else {
                i7 = m[i5 - 1];
            }
        } else {
            i7 = n[i5 - 1];
        }
        int i11 = 144;
        if (i3 == 3) {
            return p71.f(i7, 144, i9, i10);
        }
        if (i4 == 1) {
            i11 = 72;
        }
        return p71.f(i11, i7, i9, i10);
    }

    public static final kd1 I0(int i2, int i3) {
        if (i3 <= Integer.MIN_VALUE) {
            kd1 kd1Var = kd1.d;
            return kd1.d;
        }
        return new kd1(i2, i3 - 1);
    }

    public static int J(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return cn0.a(drawable);
        }
        if (!e) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e2);
            }
            e = true;
        }
        Method method = d;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e3);
                d = null;
            }
        }
        return 0;
    }

    public static ActionMode.Callback J0(ActionMode.Callback callback) {
        if ((callback instanceof s73) && Build.VERSION.SDK_INT >= 26) {
            return ((s73) callback).f4288a;
        }
        return callback;
    }

    public static final uh1 K(uh1 uh1Var) {
        if (!uh1Var.getDescriptor().c()) {
            return new s12(uh1Var);
        }
        return uh1Var;
    }

    public static final zg3 K0(c90 c90Var, t90 t90Var, Object obj) {
        boolean z;
        zg3 zg3Var = null;
        if (!(c90Var instanceof ca0)) {
            return null;
        }
        if (t90Var.get(ah3.f90a) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        ca0 ca0Var = (ca0) c90Var;
        while (true) {
            if ((ca0Var instanceof tl0) || (ca0Var = ca0Var.getCallerFrame()) == null) {
                break;
            }
            if (ca0Var instanceof zg3) {
                zg3Var = (zg3) ca0Var;
                break;
            }
        }
        if (zg3Var != null) {
            zg3Var.a0(t90Var, obj);
        }
        return zg3Var;
    }

    public static r62 L(TextView textView) {
        int i2;
        int i3;
        TextDirectionHeuristic textDirectionHeuristic;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            return new r62(r73.c(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 1;
            i3 = 1;
        } else {
            i2 = 0;
            i3 = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i4 >= 23) {
            i2 = o73.a(textView);
            i3 = o73.d(textView);
        }
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i4 >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(r73.b(p73.a(n73.d(textView)))[0].codePointAt(0));
            if (directionality != 1 && directionality != 2) {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            }
        } else {
            if (n73.b(textView) == 1) {
                z = true;
            }
            switch (n73.c(textView)) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    } else {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    }
            }
        }
        return new r62(textPaint, textDirectionHeuristic, i2, i3);
    }

    public static Drawable L0(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable;
        }
        if (!(drawable instanceof h93)) {
            return new et3(drawable);
        }
        return drawable;
    }

    public static ActionMode.Callback M0(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && i2 <= 27 && !(callback instanceof s73) && callback != null) {
            return new s73(callback, textView);
        }
        return callback;
    }

    public static final aa0 N(em3 em3Var) {
        Object obj;
        HashMap hashMap = em3Var.f1960a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = em3Var.f1960a.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
            }
        }
        aa0 aa0Var = (aa0) obj;
        if (aa0Var != null) {
            return aa0Var;
        }
        f33 f33Var = new f33(null);
        qi0 qi0Var = vl0.f4854a;
        return (aa0) em3Var.g(new i10(fl.V(f33Var, ((h71) zo1.f5522a).e)), "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
    }

    public static final int O(mp2 mp2Var, mp2[] mp2VarArr) {
        boolean z;
        boolean z2;
        int i2;
        int hashCode = (mp2Var.a().hashCode() * 31) + Arrays.hashCode(mp2VarArr);
        int e2 = mp2Var.e();
        int i3 = 1;
        while (true) {
            int i4 = 0;
            if (e2 > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                break;
            }
            int i5 = e2 - 1;
            int i6 = i3 * 31;
            String a2 = mp2Var.h(mp2Var.e() - e2).a();
            if (a2 != null) {
                i4 = a2.hashCode();
            }
            i3 = i6 + i4;
            e2 = i5;
        }
        int e3 = mp2Var.e();
        int i7 = 1;
        while (true) {
            if (e3 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i8 = e3 - 1;
                int i9 = i7 * 31;
                tp2 kind = mp2Var.h(mp2Var.e() - e3).getKind();
                if (kind != null) {
                    i2 = kind.hashCode();
                } else {
                    i2 = 0;
                }
                i7 = i9 + i2;
                e3 = i8;
            } else {
                return (((hashCode * 31) + i3) * 31) + i7;
            }
        }
    }

    public static final c90 P(c90 c90Var) {
        d90 d90Var;
        c90 intercepted;
        if (c90Var instanceof d90) {
            d90Var = (d90) c90Var;
        } else {
            d90Var = null;
        }
        if (d90Var != null && (intercepted = d90Var.intercepted()) != null) {
            return intercepted;
        }
        return c90Var;
    }

    public static /* synthetic */ yl0 Q(df1 df1Var, boolean z, if1 if1Var, int i2) {
        boolean z2 = false;
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return ((nf1) df1Var).J(z, z2, if1Var);
    }

    public static final boolean R(AssertionError assertionError) {
        boolean R0;
        Logger logger = e22.f1877a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message == null) {
            R0 = false;
        } else {
            R0 = i23.R0(message, "getsockname failed", false);
        }
        if (!R0) {
            return false;
        }
        return true;
    }

    public static boolean S(byte b2) {
        return b2 > -65;
    }

    public static boolean T(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ii3.a(context);
        }
        return true;
    }

    public static final CharSequence U(int i2, CharSequence charSequence) {
        String str;
        if (charSequence.length() < 200) {
            return charSequence;
        }
        String str2 = ".....";
        if (i2 == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i3 = i2 - 30;
        int i4 = i2 + 30;
        if (i3 > 0) {
            str = ".....";
        } else {
            str = "";
        }
        if (i4 >= charSequence.length()) {
            str2 = "";
        }
        StringBuilder n2 = p71.n(str);
        if (i3 < 0) {
            i3 = 0;
        }
        int length2 = charSequence.length();
        if (i4 > length2) {
            i4 = length2;
        }
        n2.append(charSequence.subSequence(i3, i4).toString());
        n2.append(str2);
        return n2.toString();
    }

    public static final t90 V(aa0 aa0Var, t90 t90Var) {
        t90 G = G(aa0Var.w(), t90Var, true);
        qi0 qi0Var = vl0.f4854a;
        if (G != qi0Var && G.get(d5.f1730b) == null) {
            return G.plus(qi0Var);
        }
        return G;
    }

    public static void W(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    public static float X(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return lp0.c(edgeEffect, f2, f3);
        }
        kp0.a(edgeEffect, f2, f3);
        return f2;
    }

    public static g01 Y(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        boolean z;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), xf2.FontFamily);
                String string = obtainAttributes.getString(xf2.FontFamily_fontProviderAuthority);
                String string2 = obtainAttributes.getString(xf2.FontFamily_fontProviderPackage);
                String string3 = obtainAttributes.getString(xf2.FontFamily_fontProviderQuery);
                int resourceId = obtainAttributes.getResourceId(xf2.FontFamily_fontProviderCerts, 0);
                int integer = obtainAttributes.getInteger(xf2.FontFamily_fontProviderFetchStrategy, 1);
                int integer2 = obtainAttributes.getInteger(xf2.FontFamily_fontProviderFetchTimeout, 500);
                String string4 = obtainAttributes.getString(xf2.FontFamily_fontProviderSystemFontFamily);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlResourceParser.next() != 3) {
                        z0(xmlResourceParser);
                    }
                    return new j01(new kc(string, string2, string3, d0(resourceId, resources)), integer, integer2, string4);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlResourceParser.next() != 3) {
                    if (xmlResourceParser.getEventType() == 2) {
                        if (xmlResourceParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), xf2.FontFamilyFont);
                            int i2 = xf2.FontFamilyFont_fontWeight;
                            if (!obtainAttributes2.hasValue(i2)) {
                                i2 = xf2.FontFamilyFont_android_fontWeight;
                            }
                            int i3 = obtainAttributes2.getInt(i2, 400);
                            int i4 = xf2.FontFamilyFont_fontStyle;
                            if (!obtainAttributes2.hasValue(i4)) {
                                i4 = xf2.FontFamilyFont_android_fontStyle;
                            }
                            if (1 == obtainAttributes2.getInt(i4, 0)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            int i5 = xf2.FontFamilyFont_ttcIndex;
                            if (!obtainAttributes2.hasValue(i5)) {
                                i5 = xf2.FontFamilyFont_android_ttcIndex;
                            }
                            int i6 = xf2.FontFamilyFont_fontVariationSettings;
                            if (!obtainAttributes2.hasValue(i6)) {
                                i6 = xf2.FontFamilyFont_android_fontVariationSettings;
                            }
                            String string5 = obtainAttributes2.getString(i6);
                            int i7 = obtainAttributes2.getInt(i5, 0);
                            int i8 = xf2.FontFamilyFont_font;
                            if (!obtainAttributes2.hasValue(i8)) {
                                i8 = xf2.FontFamilyFont_android_font;
                            }
                            int resourceId2 = obtainAttributes2.getResourceId(i8, 0);
                            String string6 = obtainAttributes2.getString(i8);
                            obtainAttributes2.recycle();
                            while (xmlResourceParser.next() != 3) {
                                z0(xmlResourceParser);
                            }
                            arrayList.add(new i01(i3, i7, resourceId2, string6, string5, z));
                        } else {
                            z0(xmlResourceParser);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new h01((i01[]) arrayList.toArray(new i01[0]));
            }
            z0(xmlResourceParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static int Z(int i2) {
        boolean z;
        int i3;
        int i4;
        if ((i2 & (-2097152)) == -2097152) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0) {
            return -1;
        }
        int i5 = (i2 >>> 12) & 15;
        int i6 = (i2 >>> 10) & 3;
        if (i5 == 0 || i5 == 15 || i6 == 3) {
            return -1;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                return 1152;
            }
            if (i4 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        }
        if (i3 == 3) {
            return 1152;
        }
        return 576;
    }

    public static void a() {
        du.d(676, null);
    }

    public static final void a0(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a0(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a0(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            xs xsVar = vs.f4885b;
            sb.append(E(new xs(((String) obj).getBytes(yd1.f5317a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof vs) {
            sb.append(": \"");
            sb.append(E((vs) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof m51) {
            sb.append(" {");
            f0((m51) obj, sb, i2 + 2);
            sb.append("\n");
            while (i3 < i2) {
                sb.append(' ');
                i3++;
            }
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i5 = i2 + 2;
            a0(sb, i5, "key", entry.getKey());
            a0(sb, i5, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
            sb.append("\n");
            while (i3 < i2) {
                sb.append(' ');
                i3++;
            }
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj.toString());
    }

    public static final dg1 b(Number number, String str) {
        return new dg1("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) U(-1, str)), 1);
    }

    public static final void b0(rw1 rw1Var, String str, Boolean bool) {
        eg1 lg1Var;
        if (bool == null) {
            lg1Var = rg1.f4151a;
        } else {
            lg1Var = new lg1(bool, false);
        }
        rw1Var.a(str, lg1Var);
    }

    public static final dg1 c(mp2 mp2Var) {
        return new dg1("Value of type '" + mp2Var.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + mp2Var.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.", 1);
    }

    public static final void c0(rw1 rw1Var, String str, String str2) {
        rw1Var.a(str, zf3.c(str2));
    }

    public static kg1 d(x31 x31Var) {
        uf1 uf1Var = new uf1(qf1.d);
        x31Var.invoke(uf1Var);
        if (uf1Var.i && !m20.L(uf1Var.j, "type")) {
            throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
        }
        boolean z = uf1Var.f;
        String str = uf1Var.g;
        if (!z) {
            if (!m20.L(str, "    ")) {
                throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
            }
        } else if (!m20.L(str, "    ")) {
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                boolean z3 = true;
                if (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                        z3 = false;
                    }
                    if (!z3) {
                        break;
                    }
                    i2++;
                } else {
                    z2 = true;
                    break;
                }
            }
            if (!z2) {
                throw new IllegalArgumentException("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str).toString());
            }
        }
        return new kg1(new wf1(uf1Var.f4661a, uf1Var.c, uf1Var.d, uf1Var.e, uf1Var.f, uf1Var.f4662b, uf1Var.g, uf1Var.h, uf1Var.i, uf1Var.j, uf1Var.k, uf1Var.l), uf1Var.m);
    }

    public static List d0(int i2, Resources resources) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (f01.a(obtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static final dg1 e(int i2, String str) {
        if (i2 >= 0) {
            str = "Unexpected JSON token at offset " + i2 + ": " + str;
        }
        return new dg1(str, 0);
    }

    public static final Object e0(Object obj) {
        if (obj instanceof d30) {
            return new pk2(((d30) obj).f1723a);
        }
        return obj;
    }

    public static final dg1 f(int i2, String str, String str2) {
        StringBuilder p2 = p71.p(str, "\nJSON input: ");
        p2.append((Object) U(i2, str2));
        return e(i2, p2.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ad, code lost:            if (((java.lang.Integer) r11).intValue() == 0) goto L83;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0208, code lost:            r7 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01be, code lost:            if (((java.lang.Float) r11).floatValue() == 0.0f) goto L83;     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d0, code lost:            if (((java.lang.Double) r11).doubleValue() == 0.0d) goto L83;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f0(defpackage.i1 r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t9.f0(i1, java.lang.StringBuilder, int):void");
    }

    public static void g() {
        tt3 tt3Var;
        ky kyVar = f4466a;
        if (kyVar != null) {
            ChatActivity chatActivity = kyVar.f3033a;
            if (!chatActivity.K) {
                chatActivity.K = !ew3.x();
            }
            ChatActivity chatActivity2 = kyVar.f3033a;
            synchronized (chatActivity2.n) {
                bx bxVar = new bx();
                du.d(18, bxVar);
                int t2 = (int) bxVar.t();
                tt3[] tt3VarArr = new tt3[t2];
                for (int i2 = 0; i2 < t2; i2++) {
                    if (bxVar.q()) {
                        tt3Var = new tt3();
                        tf3.o(bxVar, tt3Var);
                    } else {
                        tt3Var = null;
                    }
                    tt3VarArr[i2] = tt3Var;
                }
                bxVar.h();
                chatActivity2.runOnUiThread(new to1(10, chatActivity2, new ArrayList(new dg(tt3VarArr, false))));
            }
        }
    }

    public static final void g0(ul0 ul0Var, c90 c90Var, boolean z) {
        Object g2;
        zg3 zg3Var;
        boolean Z;
        Object j2 = ul0Var.j();
        Throwable d2 = ul0Var.d(j2);
        if (d2 != null) {
            g2 = new pk2(d2);
        } else {
            g2 = ul0Var.g(j2);
        }
        if (z) {
            sl0 sl0Var = (sl0) c90Var;
            c90 c90Var2 = sl0Var.e;
            t90 context = c90Var2.getContext();
            Object o0 = zf3.o0(context, sl0Var.g);
            if (o0 != zf3.g) {
                zg3Var = K0(c90Var2, context, o0);
            } else {
                zg3Var = null;
            }
            try {
                sl0Var.e.resumeWith(g2);
                if (zg3Var != null) {
                    if (!Z) {
                        return;
                    }
                }
                return;
            } finally {
                if (zg3Var == null || zg3Var.Z()) {
                    zf3.e0(context, o0);
                }
            }
        }
        c90Var.resumeWith(g2);
    }

    public static void h(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) {
        if (!S(b3)) {
            if ((((b3 + 112) + (b2 << 28)) >> 30) == 0 && !S(b4) && !S(b5)) {
                int i3 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
                cArr[i2] = (char) ((i3 >>> 10) + 55232);
                cArr[i2 + 1] = (char) ((i3 & 1023) + 56320);
                return;
            }
        }
        throw ie1.a();
    }

    public static final int h0(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static void i(byte b2, byte b3, byte b4, char[] cArr, int i2) {
        if (!S(b3) && ((b2 != -32 || b3 >= -96) && ((b2 != -19 || b3 < -96) && !S(b4)))) {
            cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
            return;
        }
        throw ie1.a();
    }

    public static final int i0(vo2 vo2Var, int i2) {
        int i3;
        int i4 = i2 + 1;
        int length = vo2Var.e.length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= length) {
                i3 = (i5 + length) >>> 1;
                int i6 = vo2Var.f[i3];
                if (i6 < i4) {
                    i5 = i3 + 1;
                } else {
                    if (i6 <= i4) {
                        break;
                    }
                    length = i3 - 1;
                }
            } else {
                i3 = (-i5) - 1;
                break;
            }
        }
        if (i3 < 0) {
            return ~i3;
        }
        return i3;
    }

    public static final void j(StringBuilder sb, Object obj, x31 x31Var) {
        boolean z;
        if (x31Var != null) {
            sb.append((CharSequence) x31Var.invoke(obj));
            return;
        }
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof CharSequence;
        }
        if (z) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.uh1 j0(defpackage.d5 r5, defpackage.vh1 r6, boolean r7) {
        /*
            mh1 r0 = defpackage.zf3.S(r6)
            if3 r6 = (defpackage.if3) r6
            int r1 = r6.c
            r2 = 1
            r1 = r1 & r2
            if (r1 == 0) goto Ld
            goto Le
        Ld:
            r2 = 0
        Le:
            java.util.List r6 = r6.f2583b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.a20.C0(r6, r3)
            r1.<init>(r3)
            java.util.Iterator r6 = r6.iterator()
            boolean r3 = r6.hasNext()
            r4 = 0
            if (r3 != 0) goto L8c
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L42
            if (r2 != 0) goto L3b
            m00 r6 = defpackage.yp2.f5372a
            uh1 r6 = r6.a(r0)
            if (r6 == 0) goto L39
            goto L63
        L39:
            r6 = r4
            goto L63
        L3b:
            m00 r6 = defpackage.yp2.f5373b
            uh1 r6 = r6.a(r0)
            goto L63
        L42:
            if (r2 != 0) goto L4b
            o00 r6 = defpackage.yp2.c
            java.lang.Object r6 = r6.a(r0, r1)
            goto L51
        L4b:
            o00 r6 = defpackage.yp2.d
            java.lang.Object r6 = r6.a(r0, r1)
        L51:
            if (r7 == 0) goto L5b
            boolean r3 = r6 instanceof defpackage.pk2
            if (r3 == 0) goto L58
            r6 = r4
        L58:
            uh1 r6 = (defpackage.uh1) r6
            goto L63
        L5b:
            java.lang.Throwable r3 = defpackage.qk2.a(r6)
            if (r3 != 0) goto L8b
            uh1 r6 = (defpackage.uh1) r6
        L63:
            if (r6 == 0) goto L66
            return r6
        L66:
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L70
            r5.getClass()
            goto L80
        L70:
            java.util.ArrayList r6 = defpackage.pd0.L(r5, r1, r7)
            if (r6 != 0) goto L77
            return r4
        L77:
            uh1 r6 = defpackage.pd0.G(r0, r1, r6)
            if (r6 != 0) goto L81
            r5.getClass()
        L80:
            r6 = r4
        L81:
            if (r6 == 0) goto L8b
            if (r2 == 0) goto L8a
            uh1 r4 = K(r6)
            goto L8b
        L8a:
            r4 = r6
        L8b:
            return r4
        L8c:
            java.lang.Object r5 = r6.next()
            defpackage.p71.C(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t9.j0(d5, vh1, boolean):uh1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0270, code lost:            if (r2.d == r8) goto L173;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f1, code lost:            if (r4.d == r13) goto L61;     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x041c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x06a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x06e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0700 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0481 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0570 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x068e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void k(defpackage.s70 r36, defpackage.ok1 r37, java.util.ArrayList r38, int r39) {
        /*
            Method dump skipped, instructions count: 1806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t9.k(s70, ok1, java.util.ArrayList, int):void");
    }

    public static void k0(AppCompatTextView appCompatTextView, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 27) {
            q73.f(appCompatTextView, i2, i3, i4, 0);
        } else {
            appCompatTextView.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, 0);
        }
    }

    public static final byte[] l(String str) {
        return str.getBytes(dx.f1853a);
    }

    public static void l0(AppCompatTextView appCompatTextView) {
        if (Build.VERSION.SDK_INT >= 27) {
            q73.h(appCompatTextView, 1);
        } else {
            appCompatTextView.setAutoSizeTextTypeWithDefaults(1);
        }
    }

    public static final Object m(Task task, d90 d90Var) {
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception == null) {
                if (!task.isCanceled()) {
                    return task.getResult();
                }
                throw new CancellationException("Task " + task + " was cancelled normally.");
            }
            throw exception;
        }
        vu vuVar = new vu(1, P(d90Var));
        vuVar.s();
        task.addOnCompleteListener(nl0.f3481a, new k63(vuVar));
        Object r2 = vuVar.r();
        ba0 ba0Var = ba0.f430a;
        return r2;
    }

    public static void m0(TextView textView, int i2) {
        int i3;
        tf3.v(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            r73.d(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (m73.a(textView)) {
            i3 = fontMetricsInt.top;
        } else {
            i3 = fontMetricsInt.ascent;
        }
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v6, types: [v31] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object n(defpackage.y82 r4, defpackage.yy2 r5, defpackage.c90 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.w82
            if (r0 == 0) goto L13
            r0 = r6
            w82 r0 = (defpackage.w82) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            w82 r0 = new w82
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f
            ba0 r1 = defpackage.ba0.f430a
            int r2 = r0.g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            v31 r5 = r0.e
            defpackage.fl.a0(r6)     // Catch: java.lang.Throwable -> L29
            goto L6d
        L29:
            r4 = move-exception
            goto L73
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.fl.a0(r6)
            t90 r6 = r0.getContext()
            d5 r2 = defpackage.d5.g
            r90 r6 = r6.get(r2)
            if (r6 != r4) goto L44
            r6 = 1
            goto L45
        L44:
            r6 = 0
        L45:
            if (r6 == 0) goto L77
            r0.getClass()     // Catch: java.lang.Throwable -> L29
            r0.e = r5     // Catch: java.lang.Throwable -> L29
            r0.g = r3     // Catch: java.lang.Throwable -> L29
            vu r6 = new vu     // Catch: java.lang.Throwable -> L29
            c90 r0 = P(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L29
            r6.s()     // Catch: java.lang.Throwable -> L29
            fv2 r0 = new fv2     // Catch: java.lang.Throwable -> L29
            r2 = 27
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L29
            x82 r4 = (defpackage.x82) r4     // Catch: java.lang.Throwable -> L29
            r4.h(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.r()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L6d
            return r1
        L6d:
            r5.invoke()
            ch3 r4 = defpackage.ch3.f636a
            return r4
        L73:
            r5.invoke()
            throw r4
        L77:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t9.n(y82, yy2, c90):java.lang.Object");
    }

    public static void n0(TextView textView, int i2) {
        int i3;
        tf3.v(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (m73.a(textView)) {
            i3 = fontMetricsInt.bottom;
        } else {
            i3 = fontMetricsInt.descent;
        }
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static final su2 o(x31 x31Var, Object obj, t90 t90Var) {
        return new su2(3, x31Var, obj, t90Var);
    }

    public static boolean o0(Drawable drawable, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return cn0.b(drawable, i2);
        }
        if (!c) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f4467b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e2);
            }
            c = true;
        }
        Method method = f4467b;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i2));
                return true;
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e3);
                f4467b = null;
            }
        }
        return false;
    }

    public static final op2 p(String str, mp2[] mp2VarArr, x31 x31Var) {
        if (!i23.b1(str)) {
            k00 k00Var = new k00();
            x31Var.invoke(k00Var);
            return new op2(str, o23.f3589a, k00Var.f2865b.size(), og.m1(mp2VarArr), k00Var);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static void p0(TextView textView, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i2);
        } else {
            textView.setTextAppearance(textView.getContext(), i2);
        }
    }

    public static final op2 q(String str, tp2 tp2Var, mp2[] mp2VarArr, x31 x31Var) {
        if (!i23.b1(str)) {
            if (!m20.L(tp2Var, o23.f3589a)) {
                k00 k00Var = new k00();
                x31Var.invoke(k00Var);
                return new op2(str, tp2Var, k00Var.f2865b.size(), og.m1(mp2VarArr), k00Var);
            }
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.text.SpannableString, android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final CharSequence q0(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        int i2 = 0;
        ?? r7 = charSequence;
        for (String str : i23.o1(charSequence, new String[]{"\n"})) {
            if (Pattern.compile("^([1-9]|[১-৯]). ").matcher(str).find()) {
                r7 = SpannableString.valueOf(r7);
                r7.setSpan(new LeadingMarginSpan.Standard(0, tf3.S(16)), i2, str.length() + i2, 33);
            }
            i2 += str.length() + 1;
            r7 = r7;
        }
        return r7;
    }

    public static String r(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    public static void r0(Drawable drawable, int i2) {
        bn0.g(drawable, i2);
    }

    public static final j11 s(x31 x31Var, Object obj, j11 j11Var) {
        try {
            x31Var.invoke(obj);
        } catch (Throwable th) {
            if (j11Var != null && j11Var.getCause() != th) {
                bx3.h(j11Var, th);
            } else {
                return new j11("Exception in undelivered element handler for " + obj, th);
            }
        }
        return j11Var;
    }

    public static void s0(Drawable drawable, ColorStateList colorStateList) {
        bn0.h(drawable, colorStateList);
    }

    public static final String t(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static void t0(Drawable drawable, PorterDuff.Mode mode) {
        bn0.i(drawable, mode);
    }

    public static final void u(long j2, long j3, long j4) {
        if ((j3 | j4) >= 0 && j3 <= j2 && j2 - j3 >= j4) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
    }

    public static final r9 u0(ic icVar, x31 x31Var) {
        r9 r9Var = new r9();
        x31Var.invoke(r9Var.e);
        r9Var.show(icVar.getSupportFragmentManager(), r9Var.d);
        return r9Var;
    }

    public static final void v(int i2) {
        boolean z = true;
        if (i2 < 1) {
            z = false;
        }
        if (z) {
        } else {
            throw new IllegalArgumentException(hx2.m("Expected positive parallelism level, but got ", i2).toString());
        }
    }

    public static final synchronized r9 v0(lt3 lt3Var, String str, x31 x31Var) {
        synchronized (t9.class) {
            Fragment C = lt3Var.getSupportFragmentManager().C(str);
            if (C != null && (C instanceof r9) && ((r9) C).t()) {
                return (r9) C;
            }
            r9 r9Var = new r9();
            x31Var.invoke(r9Var.e);
            r9Var.showNow(lt3Var.getSupportFragmentManager(), str);
            return r9Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void w(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            w(an0.c((InsetDrawable) drawable));
            return;
        }
        if (drawable instanceof ct3) {
            w(((dt3) ((ct3) drawable)).f);
            return;
        }
        if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                Drawable b2 = an0.b(drawableContainerState, i2);
                if (b2 != null) {
                    w(b2);
                }
            }
        }
    }

    public static final r9 w0(p pVar, x31 x31Var) {
        r9 r9Var = new r9();
        x31Var.invoke(r9Var.e);
        r9Var.show(pVar, r9Var.d);
        return r9Var;
    }

    public static final long x(long j2) {
        if (j2 < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j2 > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j2;
    }

    public static final dw2 x0(Socket socket) {
        Logger logger = e22.f1877a;
        cx2 cx2Var = new cx2(socket);
        return cx2Var.sink(new vg(socket.getOutputStream(), cx2Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] y(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = iArr[i2];
            }
            return jArr;
        }
        if (serializable instanceof long[]) {
            return (long[]) serializable;
        }
        return null;
    }

    public static vg y0(File file) {
        Logger logger = e22.f1877a;
        return new vg(new FileOutputStream(file, false), new d93());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final c90 z(Object obj, c90 c90Var, l41 l41Var) {
        if (l41Var instanceof mn) {
            return ((mn) l41Var).create(obj, c90Var);
        }
        t90 context = c90Var.getContext();
        if (context == zq0.f5530a) {
            return new ae1(obj, c90Var, l41Var);
        }
        return new be1(c90Var, context, l41Var, obj);
    }

    public static void z0(XmlResourceParser xmlResourceParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlResourceParser.next();
            if (next != 2) {
                if (next == 3) {
                    i2--;
                }
            } else {
                i2++;
            }
        }
    }

    public Metadata A(lw1 lw1Var) {
        boolean z;
        ByteBuffer byteBuffer = lw1Var.d;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        } else {
            z = false;
        }
        cp3.e(z);
        if (lw1Var.h()) {
            return null;
        }
        return B(lw1Var, byteBuffer);
    }

    public abstract Metadata B(lw1 lw1Var, ByteBuffer byteBuffer);

    public abstract Object M(s51 s51Var, c90 c90Var);
}
