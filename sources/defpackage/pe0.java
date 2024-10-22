package defpackage;

import a.bx;
import a.du;
import a.wcyybbcujkCs;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.VpnService;
import android.os.Build;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Pair;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1;
import androidx.lifecycle.SavedStateHandleAttacher;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.quickconn.QuickConnectService;
import com.security.xvpn.z35kb.quickconn.QuickToggleShortcut;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public abstract class pe0 {

    /* renamed from: a, reason: collision with root package name */
    public static kb2 f3833a;

    /* renamed from: b, reason: collision with root package name */
    public static Field f3834b;
    public static boolean c;
    public static Class d;
    public static boolean e;
    public static Field f;
    public static boolean g;
    public static Field h;
    public static boolean i;
    public static int j;
    public static long k;
    public static final c02 l = new c02(18);
    public static final qn3 m = new qn3();
    public static final d5 n = new d5();
    public static final d5 o = new d5();
    public static final d5 p = new d5();

    public /* synthetic */ pe0(int i2) {
    }

    public static final vm2 A(lm3 lm3Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fm3(fl.D(gi2.a(vm2.class))));
        fm3[] fm3VarArr = (fm3[]) arrayList.toArray(new fm3[0]);
        return (vm2) new y33(lm3Var, new hc1((fm3[]) Arrays.copyOf(fm3VarArr, fm3VarArr.length))).t(vm2.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static Pair B(String str, String str2) {
        int i2;
        int i3;
        if (!TextUtils.isEmpty(str) && str2 != null) {
            Matcher matcher = Pattern.compile(str2).matcher(str);
            if (matcher.find()) {
                i2 = matcher.start();
                i3 = matcher.end();
                return new Pair(Integer.valueOf(i2), Integer.valueOf(i3));
            }
        }
        i2 = -1;
        i3 = -1;
        return new Pair(Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String C(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            String concat = "TRuntime.".concat(str);
            if (concat.length() > 23) {
                return concat.substring(0, 23);
            }
            return concat;
        }
        return "TRuntime.".concat(str);
    }

    public static boolean D(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static final void E(View view) {
        try {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static boolean F(int i2) {
        return i2 >= 28 && i2 <= 31;
    }

    public static final void G(bx bxVar) {
        String str;
        wcyybbcujkCs wcyybbcujkcs = wcyybbcujkCs.f4a;
        uo uoVar = new uo();
        uoVar.f4707a = new Semaphore(0, false);
        wcyybbcujkCs.f5b = uoVar;
        wcyybbcujkCs.c = false;
        ew3.d0(new pw3(0));
        ((Semaphore) wcyybbcujkCs.f5b.f4707a).acquireUninterruptibly();
        if (wcyybbcujkCs.d) {
            str = "VpnPrepareNullPointerError";
        } else if (wcyybbcujkCs.f) {
            str = "VpnPrepareRuntimeException";
        } else if (!wcyybbcujkCs.c) {
            str = "NoVpnConnectPermission";
        } else if (wcyybbcujkCs.e) {
            str = "VpnDialogNotFoundRuntimeException";
        } else {
            str = "";
        }
        bxVar.b();
        bxVar.z(str);
    }

    public static final void H(bx bxVar) {
        gw3 gw3Var;
        long t = bxVar.t();
        int t2 = (int) bxVar.t();
        String[] strArr = new String[t2];
        for (int i2 = 0; i2 < t2; i2++) {
            strArr[i2] = bxVar.u();
        }
        int t3 = (int) bxVar.t();
        long[] jArr = new long[t3];
        for (int i3 = 0; i3 < t3; i3++) {
            jArr[i3] = bxVar.t();
        }
        try {
            long a2 = wcyybbcujkCs.f4a.a(t, strArr, jArr);
            gw3Var = new gw3(0);
            gw3Var.f2337b = a2;
        } catch (Exception e2) {
            gw3Var = new gw3(0);
            gw3Var.c = e2.getMessage();
        }
        bxVar.b();
        bxVar.y(gw3Var.f2337b);
        bxVar.z((String) gw3Var.c);
    }

    public static final void I() {
        fw3 fw3Var = wcyybbcujkCs.h;
        if (fw3Var != null) {
            ((rt3) ((ia0) fw3Var).f2559a).getClass();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 || i2 == 26 || i2 == 27) {
                try {
                    if (VpnService.prepare(zf3.f5472a) != null) {
                        return;
                    }
                } catch (Throwable unused) {
                }
                try {
                    zf3.f5472a.startService(new Intent(zf3.G(), (Class<?>) QuickConnectService.class));
                } catch (Exception unused2) {
                    Intent intent = new Intent(zf3.f5472a, (Class<?>) QuickToggleShortcut.class);
                    intent.setAction("x-vpn:quick_conn:bootService");
                    intent.addFlags(268435456);
                    zf3.f5472a.startActivity(intent);
                }
            }
        }
    }

    public static final void J(bx bxVar) {
        gw3 gw3Var;
        try {
            long b2 = wcyybbcujkCs.f4a.b(bxVar.u(), bxVar.r(), bxVar.r(), bxVar.t(), (int) bxVar.t());
            gw3Var = new gw3(0);
            gw3Var.f2337b = b2;
        } catch (Exception e2) {
            gw3Var = new gw3(0);
            gw3Var.c = e2.getMessage();
        }
        bxVar.b();
        bxVar.y(gw3Var.f2337b);
        bxVar.z((String) gw3Var.c);
    }

    public static ValueAnimator K(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        TypedArray L = L(resources, theme, attributeSet, ew3.i);
        TypedArray L2 = L(resources, theme, attributeSet, ew3.m);
        if (objectAnimator == null) {
            valueAnimator = new ValueAnimator();
        } else {
            valueAnimator = objectAnimator;
        }
        long x = x(L, xmlResourceParser, "duration", 1, 300);
        int i4 = 0;
        long x2 = x(L, xmlResourceParser, "startOffset", 2, 0);
        int x3 = x(L, xmlResourceParser, "valueType", 7, 4);
        if (D(xmlResourceParser, "valueFrom") && D(xmlResourceParser, "valueTo")) {
            if (x3 == 4) {
                TypedValue peekValue = L.peekValue(5);
                if (peekValue != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i2 = peekValue.type;
                } else {
                    i2 = 0;
                }
                TypedValue peekValue2 = L.peekValue(6);
                if (peekValue2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i3 = peekValue2.type;
                } else {
                    i3 = 0;
                }
                if ((z && F(i2)) || (z2 && F(i3))) {
                    x3 = 3;
                } else {
                    x3 = 0;
                }
            }
            PropertyValuesHolder z3 = z(L, x3, 5, 6, "");
            if (z3 != null) {
                valueAnimator.setValues(z3);
            }
        }
        valueAnimator.setDuration(x);
        valueAnimator.setStartDelay(x2);
        valueAnimator.setRepeatCount(x(L, xmlResourceParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(x(L, xmlResourceParser, "repeatMode", 4, 1));
        if (L2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator;
            String y = y(L2, xmlResourceParser, "pathData", 1);
            if (y != null) {
                String y2 = y(L2, xmlResourceParser, "propertyXName", 2);
                String y3 = y(L2, xmlResourceParser, "propertyYName", 3);
                if (y2 == null && y3 == null) {
                    throw new InflateException(L2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path J0 = ew3.J0(y);
                PathMeasure pathMeasure = new PathMeasure(J0, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f2 = 0.0f;
                do {
                    f2 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f2));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(J0, false);
                int min = Math.min(100, ((int) (f2 / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f3 = f2 / (min - 1);
                valueAnimator2 = valueAnimator;
                typedArray = L;
                int i5 = 0;
                float f4 = 0.0f;
                while (true) {
                    propertyValuesHolder = null;
                    if (i4 >= min) {
                        break;
                    }
                    int i6 = min;
                    pathMeasure2.getPosTan(f4 - ((Float) arrayList.get(i5)).floatValue(), fArr3, null);
                    fArr[i4] = fArr3[0];
                    fArr2[i4] = fArr3[1];
                    f4 += f3;
                    int i7 = i5 + 1;
                    if (i7 < arrayList.size() && f4 > ((Float) arrayList.get(i7)).floatValue()) {
                        pathMeasure2.nextContour();
                        i5 = i7;
                    }
                    i4++;
                    min = i6;
                }
                if (y2 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(y2, fArr);
                } else {
                    propertyValuesHolder2 = null;
                }
                if (y3 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(y3, fArr2);
                }
                if (propertyValuesHolder2 == null) {
                    i4 = 0;
                    objectAnimator2.setValues(propertyValuesHolder);
                } else {
                    i4 = 0;
                    if (propertyValuesHolder == null) {
                        objectAnimator2.setValues(propertyValuesHolder2);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolder2, propertyValuesHolder);
                    }
                }
            } else {
                valueAnimator2 = valueAnimator;
                typedArray = L;
                objectAnimator2.setPropertyName(y(L2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator;
            typedArray = L;
        }
        if (!D(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
        } else {
            typedArray2 = typedArray;
            i4 = typedArray2.getResourceId(i4, i4);
        }
        if (i4 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, i4));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (L2 != null) {
            L2.recycle();
        }
        return valueAnimator3;
    }

    public static TypedArray L(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static long O(int i2, int i3, r42 r42Var) {
        boolean z;
        boolean z2;
        r42Var.G(i2);
        if (r42Var.c - r42Var.f4099b < 5) {
            return -9223372036854775807L;
        }
        int f2 = r42Var.f();
        if ((8388608 & f2) != 0 || ((2096896 & f2) >> 8) != i3) {
            return -9223372036854775807L;
        }
        if ((f2 & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && r42Var.v() >= 7 && r42Var.c - r42Var.f4099b >= 7) {
            if ((r42Var.v() & 16) == 16) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                r42Var.d(0, new byte[6], 6);
                return ((r1[0] & 255) << 25) | ((r1[1] & 255) << 17) | ((r1[2] & 255) << 9) | ((r1[3] & 255) << 1) | ((r1[4] & 255) >> 7);
            }
        }
        return -9223372036854775807L;
    }

    public static uy0 P(r42 r42Var) {
        r42Var.H(1);
        int x = r42Var.x();
        long j2 = r42Var.f4099b + x;
        int i2 = x / 18;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                break;
            }
            long o2 = r42Var.o();
            if (o2 == -1) {
                jArr = Arrays.copyOf(jArr, i4);
                jArr2 = Arrays.copyOf(jArr2, i4);
                break;
            }
            jArr[i4] = o2;
            jArr2[i4] = r42Var.o();
            r42Var.H(2);
            i4++;
        }
        r42Var.H((int) (j2 - r42Var.f4099b));
        return new uy0(i3, jArr, jArr2);
    }

    public static void Q(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        int i2 = Build.VERSION.SDK_INT;
        ya1.c(imageView, colorStateList);
        if (i2 == 21 && (drawable = imageView.getDrawable()) != null && ya1.a(imageView) != null) {
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        }
    }

    public static void R(TextView textView, CharSequence charSequence) {
        boolean z;
        boolean z2;
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence != null || text.length() != 0) {
                if (charSequence instanceof Spanned) {
                    if (charSequence.equals(text)) {
                        return;
                    }
                } else {
                    boolean z3 = true;
                    if (charSequence == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (text == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z == z2) {
                        if (charSequence != null) {
                            int length = charSequence.length();
                            if (length == text.length()) {
                                for (int i2 = 0; i2 < length; i2++) {
                                    if (charSequence.charAt(i2) != text.charAt(i2)) {
                                        break;
                                    }
                                }
                            }
                        }
                        z3 = false;
                    }
                    if (!z3) {
                        return;
                    }
                }
                textView.setText(charSequence);
            }
        }
    }

    public static final Bitmap S(Drawable drawable, int i2, int i3, Bitmap.Config config) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                if (config == null || bitmapDrawable.getBitmap().getConfig() == config) {
                    if (i2 == bitmapDrawable.getBitmap().getWidth() && i3 == bitmapDrawable.getBitmap().getHeight()) {
                        return bitmapDrawable.getBitmap();
                    }
                    return Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i2, i3, true);
                }
            } else {
                throw new IllegalArgumentException("bitmap is null");
            }
        }
        Rect bounds = drawable.getBounds();
        int i4 = bounds.left;
        int i5 = bounds.top;
        int i6 = bounds.right;
        int i7 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, config);
        drawable.setBounds(0, 0, i2, i3);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i4, i5, i6, i7);
        return createBitmap;
    }

    public static final String T(c90 c90Var) {
        Object pk2Var;
        if (c90Var instanceof sl0) {
            return c90Var.toString();
        }
        try {
            pk2Var = c90Var + '@' + u(c90Var);
        } catch (Throwable th) {
            pk2Var = new pk2(th);
        }
        if (qk2.a(pk2Var) != null) {
            pk2Var = c90Var.getClass().getName() + '@' + u(c90Var);
        }
        return (String) pk2Var;
    }

    public static String U(String str) {
        if (str.contains("already bound")) {
            return pd0.z(R.string.ChooseSubscribeAlreadBoundError, str.substring(str.indexOf("account") + 7));
        }
        return str;
    }

    public static void V(vj1 vj1Var, zm2 zm2Var) {
        uj1 uj1Var = ((ck1) vj1Var).d;
        if (uj1Var != uj1.INITIALIZED && !uj1Var.a(uj1.STARTED)) {
            vj1Var.a(new LegacySavedStateHandleController$tryToAddRecreator$1(vj1Var, zm2Var));
        } else {
            zm2Var.d();
        }
    }

    public static boolean W(int i2, int i3, int i4, int i5) {
        return (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2)) || (i5 == 1 || i5 == 2 || (i5 == 4 && i3 != 2));
    }

    public static void a(String str, Object... objArr) {
        if (ew3.T()) {
            StringBuilder p2 = p71.p(str, " ");
            p2.append(Arrays.toString(objArr));
            Log.i("===DebugLog===", p2.toString());
        }
    }

    public static String b() {
        bx i2 = hx2.i(672);
        String u = i2.u();
        i2.h();
        return u;
    }

    public static void c() {
        du.d(678, null);
    }

    public static void d(String str) {
        p71.x(str, 662);
    }

    public static void e() {
        du.d(677, null);
    }

    public static void f(Context context) {
        qn3 qn3Var = m;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            if (!qn3Var.f4027a) {
                qn3Var.f4027a = true;
                hs2 b2 = hs2.b();
                ((c02) b2.c).getClass();
                s71 s71Var = new s71(29);
                v73 v73Var = (v73) b2.f2480b;
                Handler handler = new Handler();
                v73Var.getClass();
                b2.d = new kv3(handler, applicationContext, s71Var, b2);
                yu3 yu3Var = yu3.d;
                boolean z = applicationContext instanceof Application;
                if (z) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(yu3Var);
                }
                fl.q = (UiModeManager) applicationContext.getSystemService("uimode");
                WindowManager windowManager = ev3.f2002a;
                ev3.c = applicationContext.getResources().getDisplayMetrics().density;
                ev3.f2002a = (WindowManager) applicationContext.getSystemService("window");
                applicationContext.registerReceiver(new lv3(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
                s4.f4267b.f4268a = applicationContext.getApplicationContext();
                nu3 nu3Var = nu3.f;
                if (!nu3Var.c) {
                    iv3 iv3Var = nu3Var.d;
                    iv3Var.getClass();
                    if (z) {
                        ((Application) applicationContext).registerActivityLifecycleCallbacks(iv3Var);
                    }
                    iv3Var.c = nu3Var;
                    iv3Var.f2655a = true;
                    boolean a2 = iv3Var.a();
                    iv3Var.f2656b = a2;
                    iv3Var.b(a2);
                    nu3Var.e = iv3Var.f2656b;
                    nu3Var.c = true;
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Application Context cannot be null");
    }

    public static void g(StringBuilder sb, Object obj) {
        int lastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0338, code lost:            r1 = new android.animation.Animator[r13.size()];        r2 = r13.iterator();        r14 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0347, code lost:            if (r2.hasNext() == false) goto L185;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0349, code lost:            r1[r14] = (android.animation.Animator) r2.next();        r14 = r14 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0355, code lost:            if (r33 != 0) goto L176;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0357, code lost:            r32.playTogether(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x035b, code lost:            r32.playSequentially(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x035e, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0334, code lost:            if (r32 == null) goto L177;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0336, code lost:            if (r13 == null) goto L177;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x030d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator k(android.content.Context r27, android.content.res.Resources r28, android.content.res.Resources.Theme r29, android.content.res.XmlResourceParser r30, android.util.AttributeSet r31, android.animation.AnimatorSet r32, int r33) {
        /*
            Method dump skipped, instructions count: 863
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pe0.k(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static Keyframe l(Keyframe keyframe, float f2) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f2);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f2);
        }
        return Keyframe.ofObject(f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:            if (r5.isEmpty() == true) goto L28;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.tm2 m(defpackage.dy1 r7) {
        /*
            d5 r0 = defpackage.pe0.n
            java.lang.Object r0 = r7.a(r0)
            bn2 r0 = (defpackage.bn2) r0
            if (r0 == 0) goto L90
            d5 r1 = defpackage.pe0.o
            java.lang.Object r1 = r7.a(r1)
            lm3 r1 = (defpackage.lm3) r1
            if (r1 == 0) goto L88
            d5 r2 = defpackage.pe0.p
            java.lang.Object r2 = r7.a(r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            v73 r3 = defpackage.v73.c
            java.lang.Object r7 = r7.a(r3)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L80
            zm2 r0 = r0.getSavedStateRegistry()
            ym2 r0 = r0.b()
            boolean r3 = r0 instanceof defpackage.um2
            r4 = 0
            if (r3 == 0) goto L36
            um2 r0 = (defpackage.um2) r0
            goto L37
        L36:
            r0 = r4
        L37:
            if (r0 == 0) goto L78
            vm2 r1 = A(r1)
            java.util.LinkedHashMap r3 = r1.d
            java.lang.Object r3 = r3.get(r7)
            tm2 r3 = (defpackage.tm2) r3
            if (r3 != 0) goto L77
            java.lang.Class[] r3 = defpackage.tm2.f
            r0.b()
            android.os.Bundle r3 = r0.c
            if (r3 == 0) goto L55
            android.os.Bundle r3 = r3.getBundle(r7)
            goto L56
        L55:
            r3 = r4
        L56:
            android.os.Bundle r5 = r0.c
            if (r5 == 0) goto L5d
            r5.remove(r7)
        L5d:
            android.os.Bundle r5 = r0.c
            if (r5 == 0) goto L69
            boolean r5 = r5.isEmpty()
            r6 = 1
            if (r5 != r6) goto L69
            goto L6a
        L69:
            r6 = 0
        L6a:
            if (r6 == 0) goto L6e
            r0.c = r4
        L6e:
            tm2 r3 = defpackage.s71.k(r3, r2)
            java.util.LinkedHashMap r0 = r1.d
            r0.put(r7, r3)
        L77:
            return r3
        L78:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call"
            r7.<init>(r0)
            throw r7
        L80:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CreationExtras must have a value by `VIEW_MODEL_KEY`"
            r7.<init>(r0)
            throw r7
        L88:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"
            r7.<init>(r0)
            throw r7
        L90:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pe0.m(dy1):tm2");
    }

    public static void n(String str, String str2, Object obj) {
        if (Log.isLoggable(C(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static void o(String str, String str2, Exception exc) {
        String C = C(str);
        if (Log.isLoggable(C, 6)) {
            Log.e(C, str2, exc);
        }
    }

    public static final void p(bn2 bn2Var) {
        boolean z;
        uj1 uj1Var = ((ck1) bn2Var.getLifecycle()).d;
        if (uj1Var != uj1.INITIALIZED && uj1Var != uj1.CREATED) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (bn2Var.getSavedStateRegistry().b() == null) {
                um2 um2Var = new um2(bn2Var.getSavedStateRegistry(), (lm3) bn2Var);
                bn2Var.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", um2Var);
                bn2Var.getLifecycle().a(new SavedStateHandleAttacher(um2Var));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static int q(int i2, int i3) {
        if (i3 >= 0) {
            int i4 = i2 + (i2 >> 1) + 1;
            if (i4 < i3) {
                i4 = Integer.highestOneBit(i3 - 1) << 1;
            }
            if (i4 < 0) {
                return Integer.MAX_VALUE;
            }
            return i4;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }

    public static np3 r(r70 r70Var, int i2, ArrayList arrayList, np3 np3Var) {
        int i3;
        boolean z;
        int i4;
        if (i2 == 0) {
            i3 = r70Var.n0;
        } else {
            i3 = r70Var.o0;
        }
        int i5 = 0;
        if (i3 != -1 && (np3Var == null || i3 != np3Var.f3514b)) {
            int i6 = 0;
            while (true) {
                if (i6 >= arrayList.size()) {
                    break;
                }
                np3 np3Var2 = (np3) arrayList.get(i6);
                if (np3Var2.f3514b == i3) {
                    if (np3Var != null) {
                        np3Var.c(i2, np3Var2);
                        arrayList.remove(np3Var);
                    }
                    np3Var = np3Var2;
                } else {
                    i6++;
                }
            }
        } else if (i3 != -1) {
            return np3Var;
        }
        if (np3Var == null) {
            if (r70Var instanceof z71) {
                z71 z71Var = (z71) r70Var;
                int i7 = 0;
                while (true) {
                    if (i7 < z71Var.r0) {
                        r70 r70Var2 = z71Var.q0[i7];
                        if ((i2 == 0 && (i4 = r70Var2.n0) != -1) || (i2 == 1 && (i4 = r70Var2.o0) != -1)) {
                            break;
                        }
                        i7++;
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                if (i4 != -1) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= arrayList.size()) {
                            break;
                        }
                        np3 np3Var3 = (np3) arrayList.get(i8);
                        if (np3Var3.f3514b == i4) {
                            np3Var = np3Var3;
                            break;
                        }
                        i8++;
                    }
                }
            }
            if (np3Var == null) {
                np3Var = new np3(i2);
            }
            arrayList.add(np3Var);
        }
        ArrayList arrayList2 = np3Var.f3513a;
        if (arrayList2.contains(r70Var)) {
            z = false;
        } else {
            arrayList2.add(r70Var);
            z = true;
        }
        if (z) {
            if (r70Var instanceof t61) {
                t61 t61Var = (t61) r70Var;
                z60 z60Var = t61Var.t0;
                if (t61Var.u0 == 0) {
                    i5 = 1;
                }
                z60Var.c(i5, np3Var, arrayList);
            }
            int i9 = np3Var.f3514b;
            if (i2 == 0) {
                r70Var.n0 = i9;
                r70Var.I.c(i2, np3Var, arrayList);
                r70Var.K.c(i2, np3Var, arrayList);
            } else {
                r70Var.o0 = i9;
                r70Var.J.c(i2, np3Var, arrayList);
                r70Var.M.c(i2, np3Var, arrayList);
                r70Var.L.c(i2, np3Var, arrayList);
            }
            r70Var.P.c(i2, np3Var, arrayList);
        }
        return np3Var;
    }

    public static void s(Object obj) {
        LongSparseArray longSparseArray;
        if (!e) {
            try {
                d = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            e = true;
        }
        Class cls = d;
        if (cls == null) {
            return;
        }
        if (!g) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            g = true;
        }
        Field field = f;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            kk2.a(longSparseArray);
        }
    }

    public static final String u(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static f30 v(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2) {
        f30 f30Var;
        boolean D = D(xmlPullParser, str);
        Object obj = null;
        int i3 = 0;
        if (D) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i4 = typedValue.type;
            if (i4 >= 28 && i4 <= 31) {
                return new f30(obj, obj, typedValue.data, i3);
            }
            try {
                f30Var = f30.e(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                f30Var = null;
            }
            if (f30Var != null) {
                return f30Var;
            }
        }
        return new f30(obj, obj, i3, i3);
    }

    public static float w(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, float f2) {
        if (!D(xmlPullParser, str)) {
            return f2;
        }
        return typedArray.getFloat(i2, f2);
    }

    public static int x(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, int i3) {
        if (!D(xmlPullParser, str)) {
            return i3;
        }
        return typedArray.getInt(i2, i3);
    }

    public static String y(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i2) {
        if (!D(xmlResourceParser, str)) {
            return null;
        }
        return typedArray.getString(i2);
    }

    public static PropertyValuesHolder z(TypedArray typedArray, int i2, int i3, int i4, String str) {
        boolean z;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        bg bgVar;
        int i7;
        int i8;
        int i9;
        float f2;
        PropertyValuesHolder ofFloat;
        float f3;
        float f4;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i3);
        int i10 = 1;
        if (peekValue != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i5 = peekValue.type;
        } else {
            i5 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i4);
        if (peekValue2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i6 = peekValue2.type;
        } else {
            i6 = 0;
        }
        if (i2 == 4) {
            if ((z && F(i5)) || (z2 && F(i6))) {
                i2 = 3;
            } else {
                i2 = 0;
            }
        }
        if (i2 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i2 == 2) {
            String string = typedArray.getString(i3);
            String string2 = typedArray.getString(i4);
            z42[] I0 = ew3.I0(string);
            z42[] I02 = ew3.I0(string2);
            if (I0 == null && I02 == null) {
                return null;
            }
            if (I0 != null) {
                ah2 ah2Var = new ah2(i10);
                if (I02 != null) {
                    if (ew3.A0(I0, I02)) {
                        ofObject = PropertyValuesHolder.ofObject(str, ah2Var, I0, I02);
                    } else {
                        throw new InflateException(" Can't morph from " + string + " to " + string2);
                    }
                } else {
                    ofObject = PropertyValuesHolder.ofObject(str, ah2Var, I0);
                }
                return ofObject;
            }
            if (I02 == null) {
                return null;
            }
            return PropertyValuesHolder.ofObject(str, new ah2(i10), I02);
        }
        if (i2 == 3) {
            bgVar = bg.f459a;
        } else {
            bgVar = null;
        }
        if (z3) {
            if (z) {
                if (i5 == 5) {
                    f3 = typedArray.getDimension(i3, 0.0f);
                } else {
                    f3 = typedArray.getFloat(i3, 0.0f);
                }
                if (z2) {
                    if (i6 == 5) {
                        f4 = typedArray.getDimension(i4, 0.0f);
                    } else {
                        f4 = typedArray.getFloat(i4, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f3, f4);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f3);
                }
            } else {
                if (i6 == 5) {
                    f2 = typedArray.getDimension(i4, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i4, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f2);
            }
            propertyValuesHolder = ofFloat;
        } else if (z) {
            if (i5 == 5) {
                i8 = (int) typedArray.getDimension(i3, 0.0f);
            } else if (F(i5)) {
                i8 = typedArray.getColor(i3, 0);
            } else {
                i8 = typedArray.getInt(i3, 0);
            }
            if (z2) {
                if (i6 == 5) {
                    i9 = (int) typedArray.getDimension(i4, 0.0f);
                } else if (F(i6)) {
                    i9 = typedArray.getColor(i4, 0);
                } else {
                    i9 = typedArray.getInt(i4, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i8, i9);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i8);
            }
        } else if (z2) {
            if (i6 == 5) {
                i7 = (int) typedArray.getDimension(i4, 0.0f);
            } else if (F(i6)) {
                i7 = typedArray.getColor(i4, 0);
            } else {
                i7 = typedArray.getInt(i4, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i7);
        }
        if (propertyValuesHolder != null && bgVar != null) {
            propertyValuesHolder.setEvaluator(bgVar);
            return propertyValuesHolder;
        }
        return propertyValuesHolder;
    }

    public abstract void M(x1 x1Var, x1 x1Var2);

    public abstract void N(x1 x1Var, Thread thread);

    public abstract void X(byte[] bArr, int i2, int i3);

    public abstract boolean h(y1 y1Var, u1 u1Var, u1 u1Var2);

    public abstract boolean i(y1 y1Var, Object obj, Object obj2);

    public abstract boolean j(y1 y1Var, x1 x1Var, x1 x1Var2);

    public int t(int i2) {
        String str;
        Resources resources;
        if (i2 == 1000003) {
            return -1;
        }
        fl.p(16);
        String l2 = Long.toString(i2 & 4294967295L, 16);
        Context context = zf3.f5472a;
        if (context == null || (resources = context.getResources()) == null || (str = resources.getResourceEntryName(i2)) == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder("targetColorId == ");
        sb.append(i2);
        sb.append(" / 0x");
        sb.append(l2);
        sb.append(" (");
        throw new IllegalArgumentException(hx2.s(sb, str, ")"));
    }
}
