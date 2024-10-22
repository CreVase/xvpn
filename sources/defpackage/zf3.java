package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.util.TypedValue;
import android.view.InputEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public abstract class zf3 {

    /* renamed from: a, reason: collision with root package name */
    public static Context f5472a;

    /* renamed from: b, reason: collision with root package name */
    public static WeakReference f5473b;
    public static Handler c;
    public static final int[] d = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final pw e = new pw();
    public static final mp2[] f = new mp2[0];
    public static final pq0 g = new pq0("NO_THREAD_ELEMENTS", 6, 0);
    public static final /* synthetic */ int h = 0;

    public static final Drawable A(int i) {
        Context context = f5472a;
        if (context != null) {
            return context.getResources().getDrawable(i, context.getTheme());
        }
        return new ColorDrawable(0);
    }

    public static final wg1 B(eg1 eg1Var) {
        wg1 wg1Var;
        if (eg1Var instanceof wg1) {
            wg1Var = (wg1) eg1Var;
        } else {
            wg1Var = null;
        }
        if (wg1Var != null) {
            return wg1Var;
        }
        q("JsonPrimitive", eg1Var);
        throw null;
    }

    public static float C(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static final vu E(c90 c90Var) {
        vu vuVar;
        vu vuVar2;
        boolean z;
        boolean z2 = true;
        if (!(c90Var instanceof sl0)) {
            return new vu(1, c90Var);
        }
        sl0 sl0Var = (sl0) c90Var;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sl0.h;
            Object obj = atomicReferenceFieldUpdater.get(sl0Var);
            pq0 pq0Var = tf3.q;
            vuVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(sl0Var, pq0Var);
                vuVar2 = null;
                break;
            }
            if (obj instanceof vu) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(sl0Var, obj, pq0Var)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(sl0Var) != obj) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    vuVar2 = (vu) obj;
                    break;
                }
            } else if (obj != pq0Var && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (vuVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = vu.g;
            Object obj2 = atomicReferenceFieldUpdater2.get(vuVar2);
            if ((obj2 instanceof b30) && ((b30) obj2).d != null) {
                vuVar2.o();
                z2 = false;
            } else {
                vu.f.set(vuVar2, 536870911);
                atomicReferenceFieldUpdater2.set(vuVar2, i5.f2538a);
            }
            if (z2) {
                vuVar = vuVar2;
            }
            if (vuVar != null) {
                return vuVar;
            }
        }
        return new vu(2, c90Var);
    }

    public static final to2 F(Object obj) {
        if (obj != t9.f) {
            return (to2) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final ic G() {
        WeakReference weakReference = f5473b;
        if (weakReference != null) {
            return (ic) weakReference.get();
        }
        return null;
    }

    public static final void H(t90 t90Var, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) t90Var.get(w90.f4963a);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(t90Var, th);
            } else {
                I(t90Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                bx3.h(runtimeException, th);
                th = runtimeException;
            }
            I(t90Var, th);
        }
    }

    public static final void I(t90 t90Var, Throwable th) {
        Throwable runtimeException;
        Iterator it = x90.f5131a.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).handleException(t90Var, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    bx3.h(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            bx3.h(th, new zk0(t90Var));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static int J(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01c0, code lost:            if (r0.equals("video/mp2t") == false) goto L145;     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01df A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e1 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01e4 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e6 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e9 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ec A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ee A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f0 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f3 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f6 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f9 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01fc A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01fe A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0200 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0203 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int K(java.util.Map r23) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zf3.K(java.util.Map):int");
    }

    public static int L(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
            if (lastPathSegment.endsWith(".ac4")) {
                return 1;
            }
            if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                if (lastPathSegment.endsWith(".amr")) {
                    return 3;
                }
                if (lastPathSegment.endsWith(".flac")) {
                    return 4;
                }
                if (lastPathSegment.endsWith(".flv")) {
                    return 5;
                }
                if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                    if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                        if (lastPathSegment.endsWith(".mp3")) {
                            return 7;
                        }
                        if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                            if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                    if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                        if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                            if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                    if (!lastPathSegment.endsWith(".avi")) {
                                                        return -1;
                                                    }
                                                    return 16;
                                                }
                                                return 14;
                                            }
                                            return 13;
                                        }
                                        return 12;
                                    }
                                    return 11;
                                }
                                return 10;
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 6;
                }
                return 15;
            }
            return 2;
        }
        return 0;
    }

    public static final void M(Context context) {
        if (f5472a == null && context != null) {
            synchronized (zf3.class) {
                if (f5472a == null) {
                    f5472a = context;
                    c = new Handler(context.getMainLooper());
                }
            }
        }
    }

    public static boolean N(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        int i2 = rect.top;
                        int i3 = rect2.top;
                        if ((i2 >= i3 && rect.bottom > i3) || rect.bottom >= rect2.bottom) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                int i4 = rect.left;
                int i5 = rect2.left;
                if ((i4 >= i5 && rect.right > i5) || rect.right >= rect2.right) {
                    return false;
                }
                return true;
            }
            int i6 = rect.bottom;
            int i7 = rect2.bottom;
            if ((i6 <= i7 && rect.top < i7) || rect.top <= rect2.top) {
                return false;
            }
            return true;
        }
        int i8 = rect.right;
        int i9 = rect2.right;
        if ((i8 <= i9 && rect.left < i9) || rect.left <= rect2.left) {
            return false;
        }
        return true;
    }

    public static final boolean O(Object obj) {
        if (obj == t9.f) {
            return true;
        }
        return false;
    }

    public static boolean P(int i) {
        double pow;
        double pow2;
        double pow3;
        if (i != 0) {
            ThreadLocal threadLocal = h20.f2355a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            if (dArr.length == 3) {
                double d2 = red / 255.0d;
                if (d2 < 0.04045d) {
                    pow = d2 / 12.92d;
                } else {
                    pow = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
                }
                double d3 = green / 255.0d;
                if (d3 < 0.04045d) {
                    pow2 = d3 / 12.92d;
                } else {
                    pow2 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
                }
                double d4 = blue / 255.0d;
                if (d4 < 0.04045d) {
                    pow3 = d4 / 12.92d;
                } else {
                    pow3 = Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
                }
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d5 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[1] = d5;
                dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (d5 / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        }
        return false;
    }

    public static boolean Q(String str, String str2) {
        if (str.startsWith(str2.concat("(")) && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    public static final boolean R() {
        Resources resources;
        Context z = z();
        if (z != null && (resources = z.getResources()) != null) {
            return resources.getBoolean(R.bool.is_rtl);
        }
        return false;
    }

    public static final mh1 S(vh1 vh1Var) {
        nh1 nh1Var = ((if3) vh1Var).f2582a;
        if (nh1Var instanceof mh1) {
            return (mh1) nh1Var;
        }
        throw new IllegalStateException(("Only KClass supported as classifier, got " + nh1Var).toString());
    }

    public static o03 T(aa0 aa0Var, w wVar, l41 l41Var, int i) {
        int i2;
        o03 o03Var;
        t90 t90Var = wVar;
        if ((i & 1) != 0) {
            t90Var = zq0.f5530a;
        }
        boolean z = false;
        if ((i & 2) != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        t90 V = t9.V(aa0Var, t90Var);
        if (i2 == 2) {
            z = true;
        }
        if (z) {
            o03Var = new dj1(V, l41Var);
        } else {
            o03Var = new o03(V, true);
        }
        o03Var.Y(i2, o03Var, l41Var);
        return o03Var;
    }

    public static int U(float f2, int i, int i2) {
        return h20.b(h20.d(i2, Math.round(Color.alpha(i2) * f2)), i);
    }

    public static String V(String str, Object... objArr) {
        int indexOf;
        String str2;
        String sb;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e2) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String sb3 = sb2.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb3);
                    if (valueOf.length() != 0) {
                        str2 = "Exception during lenientFormat for ".concat(valueOf);
                    } else {
                        str2 = new String("Exception during lenientFormat for ");
                    }
                    logger.log(level, str2, (Throwable) e2);
                    String name2 = e2.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(name2.length() + String.valueOf(sb3).length() + 9);
                    sb4.append("<");
                    sb4.append(sb3);
                    sb4.append(" threw ");
                    sb4.append(name2);
                    sb4.append(">");
                    sb = sb4.toString();
                }
            }
            objArr[i2] = sb;
        }
        StringBuilder sb5 = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i3)) != -1) {
            sb5.append((CharSequence) str, i3, indexOf);
            sb5.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb5.append((CharSequence) str, i3, str.length());
        if (i < objArr.length) {
            sb5.append(" [");
            sb5.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb5.append(", ");
                sb5.append(objArr[i4]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }

    public static int W(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        i2 = rect2.top;
                        i3 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i2 = rect2.left;
                    i3 = rect.right;
                }
            } else {
                i2 = rect.top;
                i3 = rect2.bottom;
            }
        } else {
            i2 = rect.left;
            i3 = rect2.right;
        }
        return Math.max(0, i2 - i3);
    }

    public static int X(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:            if (r11 != 11) goto L50;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0095, code lost:            if (r11 != 11) goto L50;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009a, code lost:            if (r11 != 8) goto L50;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.yz2 Y(defpackage.nn3 r11) {
        /*
            r0 = 16
            int r1 = r11.i(r0)
            int r0 = r11.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.i(r0)
            r2 = 7
            goto L19
        L18:
            r2 = 4
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r11.i(r1)
            r4 = 0
            r5 = 3
            if (r2 != r5) goto L3d
            r6 = 0
        L2b:
            int r7 = r11.i(r1)
            int r7 = r7 + r6
            boolean r6 = r11.h()
            if (r6 != 0) goto L38
            int r2 = r2 + r7
            goto L3d
        L38:
            int r7 = r7 + 1
            int r6 = r7 << 2
            goto L2b
        L3d:
            r6 = 10
            int r6 = r11.i(r6)
            boolean r7 = r11.h()
            if (r7 == 0) goto L52
            int r7 = r11.i(r5)
            if (r7 <= 0) goto L52
            r11.r(r1)
        L52:
            boolean r7 = r11.h()
            r8 = 44100(0xac44, float:6.1797E-41)
            r9 = 48000(0xbb80, float:6.7262E-41)
            if (r7 == 0) goto L62
            r7 = 48000(0xbb80, float:6.7262E-41)
            goto L65
        L62:
            r7 = 44100(0xac44, float:6.1797E-41)
        L65:
            int r11 = r11.i(r3)
            int[] r10 = defpackage.zf3.d
            if (r7 != r8) goto L74
            r8 = 13
            if (r11 != r8) goto L74
            r4 = r10[r11]
            goto L9e
        L74:
            if (r7 != r9) goto L9e
            r8 = 14
            if (r11 >= r8) goto L9e
            r4 = r10[r11]
            int r6 = r6 % 5
            r8 = 1
            r9 = 8
            if (r6 == r8) goto L98
            r8 = 11
            if (r6 == r1) goto L93
            if (r6 == r5) goto L98
            if (r6 == r3) goto L8c
            goto L9e
        L8c:
            if (r11 == r5) goto L9c
            if (r11 == r9) goto L9c
            if (r11 != r8) goto L9e
            goto L9c
        L93:
            if (r11 == r9) goto L9c
            if (r11 != r8) goto L9e
            goto L9c
        L98:
            if (r11 == r5) goto L9c
            if (r11 != r9) goto L9e
        L9c:
            int r4 = r4 + 1
        L9e:
            yz2 r11 = new yz2
            r11.<init>(r2, r7, r0, r4)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zf3.Y(nn3):yz2");
    }

    public static or a(int i, int i2, int i3) {
        or x40Var;
        boolean z = false;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != Integer.MAX_VALUE) {
                        if (i2 == 1) {
                            return new or(i, null);
                        }
                        return new x40(i, i2, null);
                    }
                    return new or(Integer.MAX_VALUE, null);
                }
                if (i2 == 1) {
                    x40Var = new or(0, null);
                } else {
                    x40Var = new x40(1, i2, null);
                }
            } else {
                if (i2 == 1) {
                    z = true;
                }
                if (z) {
                    return new x40(1, 2, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
        } else if (i2 == 1) {
            jw.T.getClass();
            x40Var = new or(iw.f2658b, null);
        } else {
            x40Var = new x40(1, i2, null);
        }
        return x40Var;
    }

    public static final wg1 b(Number number) {
        if (number == null) {
            return rg1.f4151a;
        }
        return new lg1(number, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:            r9 = r6 & r11;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:            if (r5 != (-1)) goto L16;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:            k0(r1, r9, r12);     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:            return r2;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:            r13[r5] = (r9 & r11) | (r13[r5] & r4);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b0(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        /*
            int r0 = defpackage.cp3.P(r9)
            r1 = r0 & r11
            int r2 = j0(r1, r12)
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            int r4 = ~r11
            r0 = r0 & r4
            r5 = -1
        L11:
            int r2 = r2 + r3
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L3a
            r7 = r14[r2]
            boolean r7 = p(r9, r7)
            if (r7 == 0) goto L3a
            if (r15 == 0) goto L2a
            r7 = r15[r2]
            boolean r7 = p(r10, r7)
            if (r7 == 0) goto L3a
        L2a:
            r9 = r6 & r11
            if (r5 != r3) goto L32
            k0(r1, r9, r12)
            goto L39
        L32:
            r10 = r13[r5]
            r10 = r10 & r4
            r9 = r9 & r11
            r9 = r9 | r10
            r13[r5] = r9
        L39:
            return r2
        L3a:
            r5 = r6 & r11
            if (r5 != 0) goto L3f
            return r3
        L3f:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zf3.b0(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static final wg1 c(String str) {
        if (str == null) {
            return rg1.f4151a;
        }
        return new lg1(str, true);
    }

    public static int c0(Context context, int i, int i2) {
        TypedValue J = cp3.J(context, i);
        if (J != null && J.type == 16) {
            return J.data;
        }
        return i2;
    }

    public static tj0 d(aa0 aa0Var, sh0 sh0Var, l41 l41Var, int i) {
        int i2;
        tj0 tj0Var;
        t90 t90Var = sh0Var;
        if ((i & 1) != 0) {
            t90Var = zq0.f5530a;
        }
        boolean z = false;
        if ((i & 2) != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        t90 V = t9.V(aa0Var, t90Var);
        if (i2 == 2) {
            z = true;
        }
        if (z) {
            tj0Var = new wi1(V, l41Var);
        } else {
            tj0Var = new tj0(V, true);
        }
        tj0Var.Y(i2, tj0Var, l41Var);
        return tj0Var;
    }

    public static TimeInterpolator d0(Context context, int i, Interpolator interpolator) {
        boolean z;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!Q(valueOf, "cubic-bezier") && !Q(valueOf, "path")) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (Q(valueOf, "cubic-bezier")) {
                    String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                    if (split.length == 4) {
                        return x42.b(C(split, 0), C(split, 1), C(split, 2), C(split, 3));
                    }
                    throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
                }
                if (Q(valueOf, "path")) {
                    return x42.c(ew3.J0(valueOf.substring(5, valueOf.length() - 1)));
                }
                throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
            }
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:            if (r10.bottom <= r12.top) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:            r7 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0043, code lost:            r7 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0033, code lost:            if (r10.right <= r12.left) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x003a, code lost:            if (r10.top >= r12.bottom) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0041, code lost:            if (r10.left >= r12.right) goto L24;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = f(r9, r10, r11)
            boolean r1 = f(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L7d
            if (r0 != 0) goto Lf
            goto L7d
        Lf:
            r0 = 1
            java.lang.String r1 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r3 = 130(0x82, float:1.82E-43)
            r4 = 33
            r5 = 66
            r6 = 17
            if (r9 == r6) goto L3d
            if (r9 == r4) goto L36
            if (r9 == r5) goto L2f
            if (r9 != r3) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L45
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r1)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L45
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L45
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L45
        L43:
            r7 = 1
            goto L46
        L45:
            r7 = 0
        L46:
            if (r7 != 0) goto L49
            return r0
        L49:
            if (r9 == r6) goto L7c
            if (r9 != r5) goto L4e
            goto L7c
        L4e:
            int r11 = W(r9, r10, r11)
            if (r9 == r6) goto L6f
            if (r9 == r4) goto L6a
            if (r9 == r5) goto L65
            if (r9 != r3) goto L5f
            int r9 = r12.bottom
            int r10 = r10.bottom
            goto L73
        L5f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r1)
            throw r9
        L65:
            int r9 = r12.right
            int r10 = r10.right
            goto L73
        L6a:
            int r9 = r10.top
            int r10 = r12.top
            goto L73
        L6f:
            int r9 = r10.left
            int r10 = r12.left
        L73:
            int r9 = r9 - r10
            int r9 = java.lang.Math.max(r0, r9)
            if (r11 >= r9) goto L7b
            r2 = 1
        L7b:
            return r2
        L7c:
            return r0
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zf3.e(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static final void e0(t90 t90Var, Object obj) {
        if (obj == g) {
            return;
        }
        if (obj instanceof p83) {
            p83 p83Var = (p83) obj;
            m83[] m83VarArr = p83Var.f3797b;
            int length = m83VarArr.length - 1;
            if (length < 0) {
                return;
            }
            m83 m83Var = m83VarArr[length];
            Object obj2 = p83Var.f3796a[length];
            throw null;
        }
        p71.C(t90Var.fold(null, gv2.v));
        throw null;
    }

    public static boolean f(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    public static final Object f0(t90 t90Var, l41 l41Var) {
        ms0 ms0Var;
        t90 G;
        long j;
        d30 d30Var;
        Thread currentThread = Thread.currentThread();
        s90 s90Var = d5.f1730b;
        e90 e90Var = (e90) t90Var.get(s90Var);
        zq0 zq0Var = zq0.f5530a;
        if (e90Var == null) {
            ms0Var = n83.a();
            G = t9.G(zq0Var, t90Var.plus(ms0Var), true);
            qi0 qi0Var = vl0.f4854a;
            if (G != qi0Var && G.get(s90Var) == null) {
                G = G.plus(qi0Var);
            }
        } else {
            if (e90Var instanceof ms0) {
            }
            ms0Var = (ms0) n83.f3412a.get();
            G = t9.G(zq0Var, t90Var, true);
            qi0 qi0Var2 = vl0.f4854a;
            if (G != qi0Var2 && G.get(s90Var) == null) {
                G = G.plus(qi0Var2);
            }
        }
        jq jqVar = new jq(G, currentThread, ms0Var);
        jqVar.Y(1, jqVar, l41Var);
        ms0 ms0Var2 = jqVar.e;
        if (ms0Var2 != null) {
            int i = ms0.e;
            ms0Var2.O(false);
        }
        while (!Thread.interrupted()) {
            try {
                if (ms0Var2 != null) {
                    j = ms0Var2.P();
                } else {
                    j = Long.MAX_VALUE;
                }
                if (!(!(jqVar.F() instanceof vb1))) {
                    LockSupport.parkNanos(jqVar, j);
                } else {
                    Object f0 = fl.f0(jqVar.F());
                    if (f0 instanceof d30) {
                        d30Var = (d30) f0;
                    } else {
                        d30Var = null;
                    }
                    if (d30Var == null) {
                        return f0;
                    }
                    throw d30Var.f1723a;
                }
            } finally {
                if (ms0Var2 != null) {
                    int i2 = ms0.e;
                    ms0Var2.M(false);
                }
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        jqVar.r(interruptedException);
        throw interruptedException;
    }

    public static final Set g(mp2 mp2Var) {
        if (mp2Var instanceof au) {
            return ((au) mp2Var).b();
        }
        HashSet hashSet = new HashSet(mp2Var.e());
        int e2 = mp2Var.e();
        for (int i = 0; i < e2; i++) {
            hashSet.add(mp2Var.f(i));
        }
        return hashSet;
    }

    public static final void g0(ic icVar) {
        pd0.S(icVar);
        f5473b = new WeakReference(icVar);
        View decorView = icVar.getWindow().getDecorView();
        WeakHashMap weakHashMap = ll3.f3151a;
        vk3.d(decorView);
        if (f5472a == null) {
            M(icVar.getApplicationContext());
        }
    }

    public static final void h(t90 t90Var, CancellationException cancellationException) {
        int i = df1.b0;
        df1 df1Var = (df1) t90Var.get(d5.g);
        if (df1Var != null) {
            df1Var.c(cancellationException);
        }
    }

    public static void h0(View view, fr1 fr1Var) {
        boolean z;
        rp0 rp0Var = fr1Var.f2139a.f1979b;
        if (rp0Var != null && rp0Var.f4197a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float f2 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap weakHashMap = ll3.f3151a;
                f2 += al3.i((View) parent);
            }
            er1 er1Var = fr1Var.f2139a;
            if (er1Var.m != f2) {
                er1Var.m = f2;
                fr1Var.m();
            }
        }
    }

    public static final mp2 i(mp2 mp2Var, d5 d5Var) {
        if (m20.L(mp2Var.getKind(), sp2.f4394a)) {
            if (u(mp2Var) != null) {
                d5Var.getClass();
                return mp2Var;
            }
            return mp2Var;
        }
        if (mp2Var.isInline()) {
            return i(mp2Var.h(0), d5Var);
        }
        return mp2Var;
    }

    public static final int i0(mp2 mp2Var, qf1 qf1Var) {
        tp2 kind = mp2Var.getKind();
        if (kind instanceof i62) {
            return 4;
        }
        if (!m20.L(kind, o23.f3590b)) {
            if (m20.L(kind, o23.c)) {
                mp2 i = i(mp2Var.h(0), qf1Var.f3990b);
                tp2 kind2 = i.getKind();
                if (!(kind2 instanceof t72) && !m20.L(kind2, sp2.f4395b)) {
                    if (!qf1Var.f3989a.d) {
                        throw t9.c(i);
                    }
                } else {
                    return 3;
                }
            } else {
                return 1;
            }
        }
        return 2;
    }

    public static final byte j(char c2) {
        if (c2 < '~') {
            return uw.f4745b[c2];
        }
        return (byte) 0;
    }

    public static int j0(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & 65535;
        }
        return ((int[]) obj)[i];
    }

    public static final mp2[] k(List list) {
        boolean z;
        mp2[] mp2VarArr;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            list = null;
        }
        if (list == null || (mp2VarArr = (mp2[]) list.toArray(new mp2[0])) == null) {
            return f;
        }
        return mp2VarArr;
    }

    public static void k0(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0160, code lost:            if (r12 == false) goto L96;     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x011b, code lost:            if (r12 == false) goto L74;     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x019c, code lost:            if (r7 == false) goto L116;     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b3 A[Catch: NoSuchFieldException -> 0x01b6, TRY_LEAVE, TryCatch #5 {NoSuchFieldException -> 0x01b6, blocks: (B:68:0x01a8, B:69:0x01af, B:71:0x01b3), top: B:67:0x01a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.uh1 l(defpackage.mh1 r16, defpackage.uh1... r17) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zf3.l(mh1, uh1[]):uh1");
    }

    public static final void l0(String str, mh1 mh1Var) {
        String str2;
        String str3 = "in the scope of '" + ((j00) mh1Var).b() + '\'';
        if (str == null) {
            str2 = hx2.p("Class discriminator was missing and no default polymorphic serializers were registered ", str3);
        } else {
            str2 = "Class '" + str + "' is not registered for polymorphic serialization " + str3 + ".\nMark the base class as 'sealed' or register the serializer explicitly.";
        }
        throw new wp2(str2);
    }

    public static tf3 m(int i) {
        if (i != 0) {
            if (i != 1) {
                return new ql2();
            }
            return new bd0();
        }
        return new ql2();
    }

    public static String m0(String str) {
        boolean z;
        boolean z2;
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c2 = charArray[i];
                    if (c2 >= 'A' && c2 <= 'Z') {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        charArray[i] = (char) (c2 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static mp0 n() {
        return new mp0(0);
    }

    public static String n0(String str) {
        boolean z;
        boolean z2;
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c2 = charArray[i];
                    if (c2 >= 'a' && c2 <= 'z') {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        charArray[i] = (char) (c2 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static Object o(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final Object o0(t90 t90Var, Object obj) {
        if (obj == null) {
            obj = t90Var.fold(0, gv2.u);
        }
        if (obj == 0) {
            return g;
        }
        if (obj instanceof Integer) {
            return t90Var.fold(new p83(t90Var, ((Number) obj).intValue()), gv2.w);
        }
        p71.C(obj);
        throw null;
    }

    public static boolean p(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static final Object p0(c90 c90Var, t90 t90Var, l41 l41Var) {
        t90 G;
        Object f0;
        t90 context = c90Var.getContext();
        boolean z = false;
        if (!((Boolean) t90Var.fold(Boolean.FALSE, gv2.s)).booleanValue()) {
            G = context.plus(t90Var);
        } else {
            G = t9.G(context, t90Var, false);
        }
        df1 df1Var = (df1) G.get(d5.g);
        if (df1Var != null && !df1Var.a()) {
            throw ((nf1) df1Var).A();
        }
        if (G == context) {
            tn2 tn2Var = new tn2(c90Var, G);
            f0 = pd0.N(tn2Var, tn2Var, l41Var);
        } else {
            d5 d5Var = d5.f1730b;
            if (m20.L(G.get(d5Var), context.get(d5Var))) {
                zg3 zg3Var = new zg3(c90Var, G);
                t90 t90Var2 = zg3Var.c;
                Object o0 = o0(t90Var2, null);
                try {
                    Object N = pd0.N(zg3Var, zg3Var, l41Var);
                    e0(t90Var2, o0);
                    f0 = N;
                } catch (Throwable th) {
                    e0(t90Var2, o0);
                    throw th;
                }
            } else {
                tl0 tl0Var = new tl0(c90Var, G);
                try {
                    tf3.r0(t9.P(t9.z(tl0Var, tl0Var, l41Var)), ch3.f636a, null);
                    while (true) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = tl0.e;
                        int i = atomicIntegerFieldUpdater.get(tl0Var);
                        if (i != 0) {
                            if (i != 2) {
                                throw new IllegalStateException("Already suspended".toString());
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(tl0Var, 0, 1)) {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        f0 = ba0.f430a;
                    } else {
                        f0 = fl.f0(tl0Var.F());
                        if (f0 instanceof d30) {
                            throw ((d30) f0).f1723a;
                        }
                    }
                } catch (Throwable th2) {
                    tl0Var.resumeWith(new pk2(th2));
                    throw th2;
                }
            }
        }
        ba0 ba0Var = ba0.f430a;
        return f0;
    }

    public static final void q(String str, eg1 eg1Var) {
        throw new IllegalArgumentException("Element " + gi2.a(eg1Var.getClass()) + " is not a " + str);
    }

    public static final void r(o1 o1Var, ir0 ir0Var, Object obj) {
        ir0Var.b().getClass();
        mh1 mh1Var = ((j62) o1Var).f2709a;
        if (fl.E(mh1Var).isInstance(obj)) {
            fl.J(1, null);
        }
        j00 a2 = gi2.a(obj.getClass());
        String b2 = a2.b();
        if (b2 == null) {
            b2 = String.valueOf(a2);
        }
        l0(b2, mh1Var);
        throw null;
    }

    public static void s(int i, r42 r42Var) {
        r42Var.D(7);
        byte[] bArr = r42Var.f4098a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static final Boolean t(wg1 wg1Var) {
        String c2 = wg1Var.c();
        String[] strArr = a23.f16a;
        if (i23.U0(c2, "true")) {
            return Boolean.TRUE;
        }
        if (i23.U0(c2, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final mh1 u(mp2 mp2Var) {
        if (mp2Var instanceof y80) {
            return ((y80) mp2Var).f5292b;
        }
        if (mp2Var instanceof np2) {
            return u(((np2) mp2Var).f3511a);
        }
        return null;
    }

    public static int v(int i) {
        int color;
        Context z = z();
        if (z == null) {
            return -16777216;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            Resources resources = z.getResources();
            if (resources != null) {
                color = resources.getColor(i, z.getTheme());
                return color;
            }
            return -16777216;
        }
        Resources resources2 = z.getResources();
        if (resources2 == null) {
            return -16777216;
        }
        return resources2.getColor(i);
    }

    public static int w(Context context, int i, int i2) {
        TypedValue J = cp3.J(context, i);
        if (J != null) {
            int i3 = J.resourceId;
            if (i3 != 0) {
                return x80.getColor(context, i3);
            }
            return J.data;
        }
        return i2;
    }

    public static int x(View view, int i) {
        Context context = view.getContext();
        TypedValue L = cp3.L(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = L.resourceId;
        if (i2 != 0) {
            return x80.getColor(context, i2);
        }
        return L.data;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:            r4 = r2.getColorStateList(r4, r0.getTheme());     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList y(int r4) {
        /*
            android.content.Context r0 = z()
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r0 == 0) goto L34
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 < r3) goto L23
            android.content.res.Resources r2 = r0.getResources()
            if (r2 == 0) goto L1e
            android.content.res.Resources$Theme r0 = r0.getTheme()
            android.content.res.ColorStateList r4 = defpackage.g13.h(r2, r4, r0)
            if (r4 != 0) goto L22
        L1e:
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r1)
        L22:
            return r4
        L23:
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L2f
            android.content.res.ColorStateList r4 = r0.getColorStateList(r4)
            if (r4 != 0) goto L33
        L2f:
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r1)
        L33:
            return r4
        L34:
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zf3.y(int):android.content.res.ColorStateList");
    }

    public static final Context z() {
        if (XApplication.c) {
            return f5472a;
        }
        ic G = G();
        if (G == null) {
            return f5472a;
        }
        return G;
    }

    public abstract Object D(c90 c90Var);

    public abstract Object Z(Uri uri, InputEvent inputEvent, c90 c90Var);

    public abstract Object a0(Uri uri, c90 c90Var);
}
