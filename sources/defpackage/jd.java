package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.b;
import com.google.protobuf.v;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class jd extends sc implements hu1, LayoutInflater.Factory2 {
    public static final uu2 t0 = new uu2();
    public static final int[] u0 = {R.attr.windowBackground};
    public static final boolean v0 = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean w0 = true;
    public ViewGroup A;
    public TextView B;
    public View C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public id[] L;
    public id M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public Configuration R;
    public final int X;
    public int Y;
    public int Z;
    public boolean h0;
    public ed i0;
    public final Object j;
    public ed j0;
    public final Context k;
    public boolean k0;
    public Window l;
    public int l0;
    public dd m;
    public final lc n;
    public boolean n0;
    public k4 o;
    public Rect o0;
    public p33 p;
    public Rect p0;
    public CharSequence q;
    public df q0;
    public ye0 r;
    public OnBackInvokedDispatcher r0;
    public uc s;
    public OnBackInvokedCallback s0;
    public vc t;
    public h5 u;
    public ActionBarContextView v;
    public PopupWindow w;
    public tc x;
    public boolean z;
    public rm3 y = null;
    public final tc m0 = new tc(this, 0);

    public jd(Context context, Window window, lc lcVar, Object obj) {
        ic icVar;
        this.X = -100;
        this.k = context;
        this.n = lcVar;
        this.j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (context instanceof ic) {
                    icVar = (ic) context;
                    break;
                } else if (!(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            icVar = null;
            if (icVar != null) {
                this.X = ((jd) icVar.getDelegate()).X;
            }
        }
        if (this.X == -100) {
            uu2 uu2Var = t0;
            Integer num = (Integer) uu2Var.getOrDefault(this.j.getClass().getName(), null);
            if (num != null) {
                this.X = num.intValue();
                uu2Var.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            w(window);
        }
        nd.d();
    }

    public static Configuration B(Context context, int i, wm1 wm1Var, Configuration configuration, boolean z) {
        int i2;
        if (i != 1) {
            if (i != 2) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i2 = 32;
            }
        } else {
            i2 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (wm1Var != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                ad.d(configuration2, wm1Var);
            } else {
                yc.b(configuration2, wm1Var.c(0));
                yc.a(configuration2, wm1Var.c(0));
            }
        }
        return configuration2;
    }

    public static wm1 H(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ad.b(configuration);
        }
        return wm1.b(zc.a(configuration.locale));
    }

    public static wm1 x(Context context) {
        wm1 wm1Var;
        wm1 b2;
        Locale c;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (wm1Var = sc.c) == null) {
            return null;
        }
        wm1 H = H(context.getApplicationContext().getResources().getConfiguration());
        int i2 = 0;
        if (i >= 24) {
            if (wm1Var.d()) {
                b2 = wm1.f5037b;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                while (true) {
                    ym1 ym1Var = wm1Var.f5038a;
                    if (i2 >= H.f5038a.size() + ym1Var.size()) {
                        break;
                    }
                    if (i2 < ym1Var.size()) {
                        c = wm1Var.c(i2);
                    } else {
                        c = H.c(i2 - ym1Var.size());
                    }
                    if (c != null) {
                        linkedHashSet.add(c);
                    }
                    i2++;
                }
                b2 = wm1.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        } else if (wm1Var.d()) {
            b2 = wm1.f5037b;
        } else {
            b2 = wm1.b(wm1Var.c(0).toString());
        }
        if (!b2.d()) {
            return b2;
        }
        return H;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(defpackage.id r6, boolean r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L35
            int r2 = r6.f2568a
            if (r2 != 0) goto L35
            ye0 r2 = r5.r
            if (r2 == 0) goto L35
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.h()
            ze0 r2 = r2.e
            w93 r2 = (defpackage.w93) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f4966a
            androidx.appcompat.widget.ActionMenuView r2 = r2.f170a
            if (r2 == 0) goto L2c
            b5 r2 = r2.t
            if (r2 == 0) goto L27
            boolean r2 = r2.k()
            if (r2 == 0) goto L27
            r2 = 1
            goto L28
        L27:
            r2 = 0
        L28:
            if (r2 == 0) goto L2c
            r2 = 1
            goto L2d
        L2c:
            r2 = 0
        L2d:
            if (r2 == 0) goto L35
            ju1 r6 = r6.h
            r5.z(r6)
            return
        L35:
            android.content.Context r2 = r5.k
            java.lang.String r3 = "window"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            r3 = 0
            if (r2 == 0) goto L54
            boolean r4 = r6.m
            if (r4 == 0) goto L54
            hd r4 = r6.e
            if (r4 == 0) goto L54
            r2.removeView(r4)
            if (r7 == 0) goto L54
            int r7 = r6.f2568a
            r5.y(r7, r6, r3)
        L54:
            r6.k = r1
            r6.l = r1
            r6.m = r1
            r6.f = r3
            r6.n = r0
            id r7 = r5.M
            if (r7 != r6) goto L64
            r5.M = r3
        L64:
            int r6 = r6.f2568a
            if (r6 != 0) goto L6b
            r5.R()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd.A(id, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ff, code lost:            if (r7 != false) goto L108;     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0120, code lost:            if (r7 != false) goto L108;     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean C(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd.C(android.view.KeyEvent):boolean");
    }

    public final void D(int i) {
        id I = I(i);
        if (I.h != null) {
            Bundle bundle = new Bundle();
            I.h.t(bundle);
            if (bundle.size() > 0) {
                I.p = bundle;
            }
            I.h.w();
            I.h.clear();
        }
        I.o = true;
        I.n = true;
        if ((i == 108 || i == 0) && this.r != null) {
            id I2 = I(0);
            I2.k = false;
            P(I2, null);
        }
    }

    public final void E() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.z) {
            int[] iArr = cg2.AppCompatTheme;
            Context context2 = this.k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            int i = cg2.AppCompatTheme_windowActionBar;
            if (obtainStyledAttributes.hasValue(i)) {
                if (obtainStyledAttributes.getBoolean(cg2.AppCompatTheme_windowNoTitle, false)) {
                    l(1);
                } else if (obtainStyledAttributes.getBoolean(i, false)) {
                    l(108);
                }
                if (obtainStyledAttributes.getBoolean(cg2.AppCompatTheme_windowActionBarOverlay, false)) {
                    l(109);
                }
                if (obtainStyledAttributes.getBoolean(cg2.AppCompatTheme_windowActionModeOverlay, false)) {
                    l(10);
                }
                this.I = obtainStyledAttributes.getBoolean(cg2.AppCompatTheme_android_windowIsFloating, false);
                obtainStyledAttributes.recycle();
                F();
                this.l.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.J) {
                    if (this.I) {
                        viewGroup = (ViewGroup) from.inflate(kf2.abc_dialog_title_material, (ViewGroup) null);
                        this.G = false;
                        this.F = false;
                    } else if (this.F) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(ie2.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new b90(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(kf2.abc_screen_toolbar, (ViewGroup) null);
                        ye0 ye0Var = (ye0) viewGroup.findViewById(ye2.decor_content_parent);
                        this.r = ye0Var;
                        ye0Var.setWindowCallback(J());
                        if (this.G) {
                            ((ActionBarOverlayLayout) this.r).e(109);
                        }
                        if (this.D) {
                            ((ActionBarOverlayLayout) this.r).e(2);
                        }
                        if (this.E) {
                            ((ActionBarOverlayLayout) this.r).e(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.H ? (ViewGroup) from.inflate(kf2.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(kf2.abc_screen_simple, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    uc ucVar = new uc(this);
                    WeakHashMap weakHashMap = ll3.f3151a;
                    al3.u(viewGroup, ucVar);
                    if (this.r == null) {
                        this.B = (TextView) viewGroup.findViewById(ye2.title);
                    }
                    Method method = bn3.f494a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(ye2.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.content);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(R.id.content);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.l.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new uc(this));
                    this.A = viewGroup;
                    Object obj = this.j;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.q;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        ye0 ye0Var2 = this.r;
                        if (ye0Var2 != null) {
                            ye0Var2.setWindowTitle(charSequence);
                        } else {
                            k4 k4Var = this.o;
                            if (k4Var != null) {
                                k4Var.r(charSequence);
                            } else {
                                TextView textView = this.B;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.A.findViewById(R.id.content);
                    View decorView = this.l.getDecorView();
                    contentFrameLayout2.g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap weakHashMap2 = ll3.f3151a;
                    if (xk3.c(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(cg2.AppCompatTheme);
                    obtainStyledAttributes2.getValue(cg2.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(cg2.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
                    int i2 = cg2.AppCompatTheme_windowFixedWidthMajor;
                    if (obtainStyledAttributes2.hasValue(i2)) {
                        obtainStyledAttributes2.getValue(i2, contentFrameLayout2.getFixedWidthMajor());
                    }
                    int i3 = cg2.AppCompatTheme_windowFixedWidthMinor;
                    if (obtainStyledAttributes2.hasValue(i3)) {
                        obtainStyledAttributes2.getValue(i3, contentFrameLayout2.getFixedWidthMinor());
                    }
                    int i4 = cg2.AppCompatTheme_windowFixedHeightMajor;
                    if (obtainStyledAttributes2.hasValue(i4)) {
                        obtainStyledAttributes2.getValue(i4, contentFrameLayout2.getFixedHeightMajor());
                    }
                    int i5 = cg2.AppCompatTheme_windowFixedHeightMinor;
                    if (obtainStyledAttributes2.hasValue(i5)) {
                        obtainStyledAttributes2.getValue(i5, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.z = true;
                    id I = I(0);
                    if (!this.Q && I.h == null) {
                        this.l0 |= v.DEFAULT_BUFFER_SIZE;
                        if (!this.k0) {
                            uk3.m(this.l.getDecorView(), this.m0);
                            this.k0 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.F + ", windowActionBarOverlay: " + this.G + ", android:windowIsFloating: " + this.I + ", windowActionModeOverlay: " + this.H + ", windowNoTitle: " + this.J + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void F() {
        if (this.l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                w(((Activity) obj).getWindow());
            }
        }
        if (this.l != null) {
        } else {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final gd G(Context context) {
        if (this.i0 == null) {
            if (y33.f == null) {
                Context applicationContext = context.getApplicationContext();
                y33.f = new y33(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.i0 = new ed(this, y33.f);
        }
        return this.i0;
    }

    public final id I(int i) {
        id[] idVarArr = this.L;
        if (idVarArr == null || idVarArr.length <= i) {
            id[] idVarArr2 = new id[i + 1];
            if (idVarArr != null) {
                System.arraycopy(idVarArr, 0, idVarArr2, 0, idVarArr.length);
            }
            this.L = idVarArr2;
            idVarArr = idVarArr2;
        }
        id idVar = idVarArr[i];
        if (idVar == null) {
            id idVar2 = new id(i);
            idVarArr[i] = idVar2;
            return idVar2;
        }
        return idVar;
    }

    public final Window.Callback J() {
        return this.l.getCallback();
    }

    public final void K() {
        E();
        if (this.F && this.o == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                this.o = new xp3(this.G, (Activity) obj);
            } else if (obj instanceof Dialog) {
                this.o = new xp3((Dialog) obj);
            }
            k4 k4Var = this.o;
            if (k4Var != null) {
                k4Var.l(this.n0);
            }
        }
    }

    public final int L(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        if (this.j0 == null) {
                            this.j0 = new ed(this, context);
                        }
                        return this.j0.b();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else {
                if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return G(context).b();
            }
        }
        return i;
    }

    public final boolean M() {
        boolean z = this.N;
        this.N = false;
        id I = I(0);
        if (I.m) {
            if (!z) {
                A(I, true);
            }
            return true;
        }
        h5 h5Var = this.u;
        if (h5Var != null) {
            h5Var.a();
            return true;
        }
        K();
        k4 k4Var = this.o;
        if (k4Var == null || !k4Var.b()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0178, code lost:            if (r2.g.getCount() > 0) goto L94;     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0154, code lost:            if (r2 != null) goto L80;     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N(defpackage.id r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd.N(id, android.view.KeyEvent):void");
    }

    public final boolean O(id idVar, int i, KeyEvent keyEvent) {
        ju1 ju1Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!idVar.k && !P(idVar, keyEvent)) || (ju1Var = idVar.h) == null) {
            return false;
        }
        return ju1Var.performShortcut(i, keyEvent, 1);
    }

    public final boolean P(id idVar, KeyEvent keyEvent) {
        boolean z;
        ye0 ye0Var;
        ye0 ye0Var2;
        Resources.Theme theme;
        int i;
        boolean z2;
        ye0 ye0Var3;
        ye0 ye0Var4;
        if (this.Q) {
            return false;
        }
        if (idVar.k) {
            return true;
        }
        id idVar2 = this.M;
        if (idVar2 != null && idVar2 != idVar) {
            A(idVar2, false);
        }
        Window.Callback J = J();
        int i2 = idVar.f2568a;
        if (J != null) {
            idVar.g = J.onCreatePanelView(i2);
        }
        if (i2 != 0 && i2 != 108) {
            z = false;
        } else {
            z = true;
        }
        if (z && (ye0Var4 = this.r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) ye0Var4;
            actionBarOverlayLayout.h();
            ((w93) actionBarOverlayLayout.e).l = true;
        }
        if (idVar.g == null && (!z || !(this.o instanceof v93))) {
            ju1 ju1Var = idVar.h;
            if (ju1Var == null || idVar.o) {
                if (ju1Var == null) {
                    Context context = this.k;
                    if ((i2 == 0 || i2 == 108) && this.r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(ie2.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(ie2.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(ie2.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            b90 b90Var = new b90(context, 0);
                            b90Var.getTheme().setTo(theme);
                            context = b90Var;
                        }
                    }
                    ju1 ju1Var2 = new ju1(context);
                    ju1Var2.e = this;
                    ju1 ju1Var3 = idVar.h;
                    if (ju1Var2 != ju1Var3) {
                        if (ju1Var3 != null) {
                            ju1Var3.r(idVar.i);
                        }
                        idVar.h = ju1Var2;
                        zk1 zk1Var = idVar.i;
                        if (zk1Var != null) {
                            ju1Var2.b(zk1Var, ju1Var2.f2830a);
                        }
                    }
                    if (idVar.h == null) {
                        return false;
                    }
                }
                if (z && (ye0Var2 = this.r) != null) {
                    if (this.s == null) {
                        this.s = new uc(this);
                    }
                    ((ActionBarOverlayLayout) ye0Var2).j(idVar.h, this.s);
                }
                idVar.h.w();
                if (!J.onCreatePanelMenu(i2, idVar.h)) {
                    ju1 ju1Var4 = idVar.h;
                    if (ju1Var4 != null) {
                        if (ju1Var4 != null) {
                            ju1Var4.r(idVar.i);
                        }
                        idVar.h = null;
                    }
                    if (z && (ye0Var = this.r) != null) {
                        ((ActionBarOverlayLayout) ye0Var).j(null, this.s);
                    }
                    return false;
                }
                idVar.o = false;
            }
            idVar.h.w();
            Bundle bundle = idVar.p;
            if (bundle != null) {
                idVar.h.s(bundle);
                idVar.p = null;
            }
            if (!J.onPreparePanel(0, idVar.g, idVar.h)) {
                if (z && (ye0Var3 = this.r) != null) {
                    ((ActionBarOverlayLayout) ye0Var3).j(null, this.s);
                }
                idVar.h.v();
                return false;
            }
            if (keyEvent != null) {
                i = keyEvent.getDeviceId();
            } else {
                i = -1;
            }
            if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            idVar.h.setQwertyMode(z2);
            idVar.h.v();
        }
        idVar.k = true;
        idVar.l = false;
        this.M = idVar;
        return true;
    }

    public final void Q() {
        if (!this.z) {
        } else {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void R() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.r0 != null && (I(0).m || this.u != null)) {
                z = true;
            }
            if (z && this.s0 == null) {
                this.s0 = cd.b(this.r0, this);
            } else if (!z && (onBackInvokedCallback = this.s0) != null) {
                cd.c(this.r0, onBackInvokedCallback);
            }
        }
    }

    public final int S(wq3 wq3Var, Rect rect) {
        int i;
        boolean z;
        boolean z2;
        int c;
        int d;
        int color;
        int i2 = 0;
        if (wq3Var != null) {
            i = wq3Var.e();
        } else if (rect != null) {
            i = rect.top;
        } else {
            i = 0;
        }
        ActionBarContextView actionBarContextView = this.v;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.v.getLayoutParams();
            boolean z3 = true;
            if (this.v.isShown()) {
                if (this.o0 == null) {
                    this.o0 = new Rect();
                    this.p0 = new Rect();
                }
                Rect rect2 = this.o0;
                Rect rect3 = this.p0;
                if (wq3Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(wq3Var.c(), wq3Var.e(), wq3Var.d(), wq3Var.b());
                }
                ViewGroup viewGroup = this.A;
                Method method = bn3.f494a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect2, rect3);
                    } catch (Exception unused) {
                    }
                }
                int i3 = rect2.top;
                int i4 = rect2.left;
                int i5 = rect2.right;
                wq3 h = ll3.h(this.A);
                if (h == null) {
                    c = 0;
                } else {
                    c = h.c();
                }
                if (h == null) {
                    d = 0;
                } else {
                    d = h.d();
                }
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z2 = true;
                }
                Context context = this.k;
                if (i3 > 0 && this.C == null) {
                    View view = new View(context);
                    this.C = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = c;
                    layoutParams.rightMargin = d;
                    this.A.addView(this.C, -1, layoutParams);
                } else {
                    View view2 = this.C;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != c || marginLayoutParams2.rightMargin != d) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = c;
                            marginLayoutParams2.rightMargin = d;
                            this.C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.C;
                if (view3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && view3.getVisibility() != 0) {
                    View view4 = this.C;
                    if ((uk3.g(view4) & 8192) == 0) {
                        z3 = false;
                    }
                    if (z3) {
                        color = x80.getColor(context, ne2.abc_decor_view_status_guard_light);
                    } else {
                        color = x80.getColor(context, ne2.abc_decor_view_status_guard);
                    }
                    view4.setBackgroundColor(color);
                }
                if (!this.H && z) {
                    i = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                } else {
                    z3 = false;
                }
                z2 = z3;
                z = false;
            }
            if (z2) {
                this.v.setLayoutParams(marginLayoutParams);
            }
        } else {
            z = false;
        }
        View view5 = this.C;
        if (view5 != null) {
            if (!z) {
                i2 = 8;
            }
            view5.setVisibility(i2);
        }
        return i;
    }

    @Override // defpackage.sc
    public final void a(View view, ViewGroup.LayoutParams layoutParams) {
        E();
        ((ViewGroup) this.A.findViewById(R.id.content)).addView(view, layoutParams);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.hu1
    public final boolean c(ju1 ju1Var, MenuItem menuItem) {
        int i;
        id idVar;
        Window.Callback J = J();
        if (J != null && !this.Q) {
            ju1 k = ju1Var.k();
            id[] idVarArr = this.L;
            if (idVarArr != null) {
                i = idVarArr.length;
            } else {
                i = 0;
            }
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    idVar = idVarArr[i2];
                    if (idVar != null && idVar.h == k) {
                        break;
                    }
                    i2++;
                } else {
                    idVar = null;
                    break;
                }
            }
            if (idVar != null) {
                return J.onMenuItemSelected(idVar.f2568a, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.sc
    public final void f() {
        LayoutInflater from = LayoutInflater.from(this.k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof jd)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.sc
    public final void g() {
        if (this.o != null) {
            K();
            if (!this.o.f()) {
                this.l0 |= 1;
                if (!this.k0) {
                    View decorView = this.l.getDecorView();
                    WeakHashMap weakHashMap = ll3.f3151a;
                    uk3.m(decorView, this.m0);
                    this.k0 = true;
                }
            }
        }
    }

    @Override // defpackage.sc
    public final void i(Bundle bundle) {
        String str;
        this.O = true;
        v(false, true);
        F();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = tf3.Q(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                k4 k4Var = this.o;
                if (k4Var == null) {
                    this.n0 = true;
                } else {
                    k4Var.l(true);
                }
            }
            synchronized (sc.h) {
                sc.k(this);
                sc.g.add(new WeakReference(this));
            }
        }
        this.R = new Configuration(this.k.getResources().getConfiguration());
        this.P = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.sc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.sc.h
            monitor-enter(r0)
            defpackage.sc.k(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.k0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.l
            android.view.View r0 = r0.getDecorView()
            tc r1 = r3.m0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.Q = r0
            int r0 = r3.X
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            uu2 r0 = defpackage.jd.t0
            java.lang.Object r1 = r3.j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.X
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            uu2 r0 = defpackage.jd.t0
            java.lang.Object r1 = r3.j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            k4 r0 = r3.o
            if (r0 == 0) goto L63
            r0.h()
        L63:
            ed r0 = r3.i0
            if (r0 == 0) goto L6a
            r0.a()
        L6a:
            ed r0 = r3.j0
            if (r0 == 0) goto L71
            r0.a()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd.j():void");
    }

    @Override // defpackage.sc
    public final boolean l(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.J && i == 108) {
            return false;
        }
        if (this.F && i == 1) {
            this.F = false;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 5) {
                    if (i != 10) {
                        if (i != 108) {
                            if (i != 109) {
                                return this.l.requestFeature(i);
                            }
                            Q();
                            this.G = true;
                            return true;
                        }
                        Q();
                        this.F = true;
                        return true;
                    }
                    Q();
                    this.H = true;
                    return true;
                }
                Q();
                this.E = true;
                return true;
            }
            Q();
            this.D = true;
            return true;
        }
        Q();
        this.J = true;
        return true;
    }

    @Override // defpackage.sc
    public final void n(int i) {
        E();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i, viewGroup);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.sc
    public final void o(View view) {
        E();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.m.a(this.l.getCallback());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        char c;
        View view2;
        if (this.q0 == null) {
            int[] iArr = cg2.AppCompatTheme;
            Context context2 = this.k;
            String string = context2.obtainStyledAttributes(iArr).getString(cg2.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                this.q0 = new df();
            } else {
                try {
                    this.q0 = (df) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.q0 = new df();
                }
            }
        }
        df dfVar = this.q0;
        int i = uj3.f4684a;
        dfVar.getClass();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cg2.View, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(cg2.View_theme, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        Context b90Var = (resourceId == 0 || ((context instanceof b90) && ((b90) context).f426a == resourceId)) ? context : new b90(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        View view3 = null;
        switch (c) {
            case 0:
                view2 = new xd(b90Var, attributeSet);
                break;
            case 1:
                view2 = new nc(b90Var, attributeSet);
                break;
            case 2:
                view2 = new sd(b90Var, attributeSet);
                break;
            case 3:
                AppCompatTextView e = dfVar.e(b90Var, attributeSet);
                dfVar.g(e, str);
                view2 = e;
                break;
            case 4:
                view2 = new qd(b90Var, attributeSet, ie2.imageButtonStyle);
                break;
            case 5:
                view2 = new zd(b90Var, attributeSet);
                break;
            case 6:
                view2 = new b(b90Var, attributeSet);
                break;
            case 7:
                wd d = dfVar.d(b90Var, attributeSet);
                dfVar.g(d, str);
                view2 = d;
                break;
            case '\b':
                view2 = new bf(b90Var, attributeSet);
                break;
            case '\t':
                view2 = new AppCompatImageView(b90Var, attributeSet);
                break;
            case '\n':
                jc a2 = dfVar.a(b90Var, attributeSet);
                dfVar.g(a2, str);
                view2 = a2;
                break;
            case 11:
                mc c2 = dfVar.c(b90Var, attributeSet);
                dfVar.g(c2, str);
                view2 = c2;
                break;
            case '\f':
                view2 = new AppCompatEditText(b90Var, attributeSet);
                break;
            case '\r':
                AppCompatButton b2 = dfVar.b(b90Var, attributeSet);
                dfVar.g(b2, str);
                view2 = b2;
                break;
            default:
                view2 = null;
                break;
        }
        if (view2 == null && context != b90Var) {
            Object[] objArr = dfVar.f1768a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = b90Var;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = df.g;
                        if (i2 < 3) {
                            View f = dfVar.f(b90Var, str, strArr[i2]);
                            if (f != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view3 = f;
                            } else {
                                i2++;
                            }
                        }
                    }
                } else {
                    View f2 = dfVar.f(b90Var, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view3 = f2;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            view2 = view3;
        }
        if (view2 != null) {
            Context context3 = view2.getContext();
            if (context3 instanceof ContextWrapper) {
                WeakHashMap weakHashMap = ll3.f3151a;
                if (tk3.a(view2)) {
                    TypedArray obtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, df.c);
                    String string2 = obtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        view2.setOnClickListener(new cf(view2, string2));
                    }
                    obtainStyledAttributes2.recycle();
                }
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes3 = b90Var.obtainStyledAttributes(attributeSet, df.d);
                if (obtainStyledAttributes3.hasValue(0)) {
                    boolean z = obtainStyledAttributes3.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = ll3.f3151a;
                    new qk3(af2.tag_accessibility_heading, 3).c(view2, Boolean.valueOf(z));
                }
                obtainStyledAttributes3.recycle();
                TypedArray obtainStyledAttributes4 = b90Var.obtainStyledAttributes(attributeSet, df.e);
                if (obtainStyledAttributes4.hasValue(0)) {
                    ll3.q(view2, obtainStyledAttributes4.getString(0));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = b90Var.obtainStyledAttributes(attributeSet, df.f);
                if (obtainStyledAttributes5.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes5.getBoolean(0, false);
                    WeakHashMap weakHashMap3 = ll3.f3151a;
                    new qk3(af2.tag_screen_reader_focusable, 0).c(view2, Boolean.valueOf(z2));
                }
                obtainStyledAttributes5.recycle();
            }
        }
        return view2;
    }

    @Override // defpackage.sc
    public final void p(View view, ViewGroup.LayoutParams layoutParams) {
        E();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.sc
    public final void r(CharSequence charSequence) {
        this.q = charSequence;
        ye0 ye0Var = this.r;
        if (ye0Var != null) {
            ye0Var.setWindowTitle(charSequence);
            return;
        }
        k4 k4Var = this.o;
        if (k4Var != null) {
            k4Var.r(charSequence);
            return;
        }
        TextView textView = this.B;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015c  */
    @Override // defpackage.sc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.h5 s(defpackage.g5 r9) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd.s(g5):h5");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:            if (r6 == false) goto L76;     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b5  */
    @Override // defpackage.hu1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(defpackage.ju1 r6) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd.u(ju1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0270 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd.v(boolean, boolean):boolean");
    }

    public final void w(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.l == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof dd)) {
                dd ddVar = new dd(this, callback);
                this.m = ddVar;
                window.setCallback(ddVar);
                int[] iArr = u0;
                Context context = this.k;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    nd a2 = nd.a();
                    synchronized (a2) {
                        drawable = a2.f3439a.g(context, resourceId, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.l = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.r0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.s0) != null) {
                        cd.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.s0 = null;
                    }
                    Object obj = this.j;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.r0 = cd.a(activity);
                            R();
                            return;
                        }
                    }
                    this.r0 = null;
                    R();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void y(int i, id idVar, ju1 ju1Var) {
        if (ju1Var == null) {
            if (idVar == null && i >= 0) {
                id[] idVarArr = this.L;
                if (i < idVarArr.length) {
                    idVar = idVarArr[i];
                }
            }
            if (idVar != null) {
                ju1Var = idVar.h;
            }
        }
        if ((idVar == null || idVar.m) && !this.Q) {
            dd ddVar = this.m;
            Window.Callback callback = this.l.getCallback();
            ddVar.getClass();
            try {
                ddVar.e = true;
                callback.onPanelClosed(i, ju1Var);
            } finally {
                ddVar.e = false;
            }
        }
    }

    public final void z(ju1 ju1Var) {
        b5 b5Var;
        if (this.K) {
            return;
        }
        this.K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.r;
        actionBarOverlayLayout.h();
        ActionMenuView actionMenuView = ((w93) actionBarOverlayLayout.e).f4966a.f170a;
        if (actionMenuView != null && (b5Var = actionMenuView.t) != null) {
            b5Var.i();
            w4 w4Var = b5Var.t;
            if (w4Var != null && w4Var.b()) {
                w4Var.j.dismiss();
            }
        }
        Window.Callback J = J();
        if (J != null && !this.Q) {
            J.onPanelClosed(108, ju1Var);
        }
        this.K = false;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
