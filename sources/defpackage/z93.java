package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z93 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static z93 k;
    public static z93 l;

    /* renamed from: a, reason: collision with root package name */
    public final View f5448a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f5449b;
    public final int c;
    public final y93 d;
    public final y93 e;
    public int f;
    public int g;
    public aa3 h;
    public boolean i;
    public boolean j;

    /* JADX WARN: Type inference failed for: r0v0, types: [y93] */
    /* JADX WARN: Type inference failed for: r0v1, types: [y93] */
    public z93(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        final int i = 0;
        this.d = new Runnable(this) { // from class: y93

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z93 f5298b;

            {
                this.f5298b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                z93 z93Var = this.f5298b;
                switch (i2) {
                    case 0:
                        z93Var.c(false);
                        return;
                    default:
                        z93Var.a();
                        return;
                }
            }
        };
        final int i2 = 1;
        this.e = new Runnable(this) { // from class: y93

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z93 f5298b;

            {
                this.f5298b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                z93 z93Var = this.f5298b;
                switch (i22) {
                    case 0:
                        z93Var.c(false);
                        return;
                    default:
                        z93Var.a();
                        return;
                }
            }
        };
        this.f5448a = view;
        this.f5449b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = ol3.f3691a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = nl3.a(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.c = scaledTouchSlop;
        this.j = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(z93 z93Var) {
        z93 z93Var2 = k;
        if (z93Var2 != null) {
            z93Var2.f5448a.removeCallbacks(z93Var2.d);
        }
        k = z93Var;
        if (z93Var != null) {
            z93Var.f5448a.postDelayed(z93Var.d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        boolean z;
        z93 z93Var = l;
        View view = this.f5448a;
        if (z93Var == this) {
            l = null;
            aa3 aa3Var = this.h;
            if (aa3Var != null) {
                if (((View) aa3Var.f45b).getParent() != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ((WindowManager) ((Context) aa3Var.f44a).getSystemService("window")).removeView((View) aa3Var.f45b);
                }
                this.h = null;
                this.j = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (k == this) {
            b(null);
        }
        view.removeCallbacks(this.e);
    }

    public final void c(boolean z) {
        boolean z2;
        int height;
        int i;
        int i2;
        int i3;
        long longPressTimeout;
        long j;
        long j2;
        boolean z3;
        WeakHashMap weakHashMap = ll3.f3151a;
        View view = this.f5448a;
        if (!xk3.b(view)) {
            return;
        }
        b(null);
        z93 z93Var = l;
        if (z93Var != null) {
            z93Var.a();
        }
        l = this;
        this.i = z;
        aa3 aa3Var = new aa3(view.getContext());
        this.h = aa3Var;
        int i4 = this.f;
        int i5 = this.g;
        boolean z4 = this.i;
        if (((View) aa3Var.f45b).getParent() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (((View) aa3Var.f45b).getParent() != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                ((WindowManager) ((Context) aa3Var.f44a).getSystemService("window")).removeView((View) aa3Var.f45b);
            }
        }
        ((TextView) aa3Var.c).setText(this.f5449b);
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) aa3Var.d;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = ((Context) aa3Var.f44a).getResources().getDimensionPixelOffset(se2.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i4 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = ((Context) aa3Var.f44a).getResources().getDimensionPixelOffset(se2.tooltip_precise_anchor_extra_offset);
            height = i5 + dimensionPixelOffset2;
            i = i5 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = ((Context) aa3Var.f44a).getResources();
        if (z4) {
            i2 = se2.tooltip_y_offset_touch;
        } else {
            i2 = se2.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i2);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof Activity) {
                    rootView = ((Activity) context).getWindow().getDecorView();
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
        } else {
            rootView.getWindowVisibleDisplayFrame((Rect) aa3Var.e);
            Rect rect = (Rect) aa3Var.e;
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = ((Context) aa3Var.f44a).getResources();
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i3 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i3 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                ((Rect) aa3Var.e).set(0, i3, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            rootView.getLocationOnScreen((int[]) aa3Var.g);
            view.getLocationOnScreen((int[]) aa3Var.f);
            int[] iArr = (int[]) aa3Var.f;
            int i6 = iArr[0];
            int[] iArr2 = (int[]) aa3Var.g;
            int i7 = i6 - iArr2[0];
            iArr[0] = i7;
            iArr[1] = iArr[1] - iArr2[1];
            layoutParams.x = (i7 + i4) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            ((View) aa3Var.f45b).measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = ((View) aa3Var.f45b).getMeasuredHeight();
            int i8 = ((int[]) aa3Var.f)[1];
            int i9 = ((i + i8) - dimensionPixelOffset3) - measuredHeight;
            int i10 = i8 + height + dimensionPixelOffset3;
            if (z4) {
                if (i9 >= 0) {
                    layoutParams.y = i9;
                } else {
                    layoutParams.y = i10;
                }
            } else if (measuredHeight + i10 <= ((Rect) aa3Var.e).height()) {
                layoutParams.y = i10;
            } else {
                layoutParams.y = i9;
            }
        }
        ((WindowManager) ((Context) aa3Var.f44a).getSystemService("window")).addView((View) aa3Var.f45b, (WindowManager.LayoutParams) aa3Var.d);
        view.addOnAttachStateChangeListener(this);
        if (this.i) {
            j2 = 2500;
        } else {
            if ((uk3.g(view) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 15000;
            }
            j2 = j - longPressTimeout;
        }
        y93 y93Var = this.e;
        view.removeCallbacks(y93Var);
        view.postDelayed(y93Var, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHover(android.view.View r5, android.view.MotionEvent r6) {
        /*
            r4 = this;
            aa3 r5 = r4.h
            r0 = 0
            if (r5 == 0) goto La
            boolean r5 = r4.i
            if (r5 == 0) goto La
            return r0
        La:
            android.view.View r5 = r4.f5448a
            android.content.Context r1 = r5.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            return r0
        L25:
            int r1 = r6.getAction()
            r2 = 7
            r3 = 1
            if (r1 == r2) goto L38
            r5 = 10
            if (r1 == r5) goto L32
            goto L74
        L32:
            r4.j = r3
            r4.a()
            goto L74
        L38:
            boolean r5 = r5.isEnabled()
            if (r5 == 0) goto L74
            aa3 r5 = r4.h
            if (r5 != 0) goto L74
            float r5 = r6.getX()
            int r5 = (int) r5
            float r6 = r6.getY()
            int r6 = (int) r6
            boolean r1 = r4.j
            if (r1 != 0) goto L69
            int r1 = r4.f
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r4.c
            if (r1 > r2) goto L69
            int r1 = r4.g
            int r1 = r6 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L67
            goto L69
        L67:
            r3 = 0
            goto L6f
        L69:
            r4.f = r5
            r4.g = r6
            r4.j = r0
        L6f:
            if (r3 == 0) goto L74
            b(r4)
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z93.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f = view.getWidth() / 2;
        this.g = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
