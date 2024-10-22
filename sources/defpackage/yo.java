package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class yo {

    /* renamed from: a, reason: collision with root package name */
    public final int f5366a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5367b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final ViewGroup g;
    public final Context h;
    public final xo i;
    public final k80 j;
    public int k;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public final AccessibilityManager s;
    public static final uv0 u = pb.f3812b;
    public static final LinearInterpolator v = pb.f3811a;
    public static final mk1 w = pb.d;
    public static final int[] y = {he2.snackbarStyle};
    public static final Handler x = new Handler(Looper.getMainLooper(), new so());
    public final to l = new to(this, 0);
    public final vo t = new vo(this);

    public yo(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        boolean z;
        int i;
        if (snackbarContentLayout != null) {
            if (snackbarContentLayout2 != null) {
                this.g = viewGroup;
                this.j = snackbarContentLayout2;
                this.h = context;
                y73.c(context, y73.f5287a, "Theme.AppCompat");
                LayoutInflater from = LayoutInflater.from(context);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(y);
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                obtainStyledAttributes.recycle();
                if (resourceId != -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i = jf2.mtrl_layout_snackbar;
                } else {
                    i = jf2.design_layout_snackbar;
                }
                xo xoVar = (xo) from.inflate(i, viewGroup, false);
                this.i = xoVar;
                xo.a(xoVar, this);
                float actionTextColorAlpha = xoVar.getActionTextColorAlpha();
                if (actionTextColorAlpha != 1.0f) {
                    snackbarContentLayout.f1559b.setTextColor(zf3.U(actionTextColorAlpha, zf3.x(snackbarContentLayout, he2.colorSurface), snackbarContentLayout.f1559b.getCurrentTextColor()));
                }
                snackbarContentLayout.setMaxInlineActionWidth(xoVar.getMaxInlineActionWidth());
                xoVar.addView(snackbarContentLayout);
                WeakHashMap weakHashMap = ll3.f3151a;
                xk3.f(xoVar, 1);
                uk3.s(xoVar, 1);
                xoVar.setFitsSystemWindows(true);
                al3.u(xoVar, new uo(this));
                ll3.p(xoVar, new tq1(this, 3));
                this.s = (AccessibilityManager) context.getSystemService("accessibility");
                int i2 = he2.motionDurationLong2;
                this.c = zf3.c0(context, i2, 250);
                this.f5366a = zf3.c0(context, i2, 150);
                this.f5367b = zf3.c0(context, he2.motionDurationMedium1, 75);
                int i3 = he2.motionEasingEmphasizedInterpolator;
                this.d = zf3.d0(context, i3, v);
                this.f = zf3.d0(context, i3, w);
                this.e = zf3.d0(context, i3, u);
                return;
            }
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null content");
    }

    public final void a(int i) {
        boolean z;
        ax2 b2 = ax2.b();
        vo voVar = this.t;
        synchronized (b2.f359a) {
            if (b2.c(voVar)) {
                b2.a(b2.c, i);
            } else {
                zw2 zw2Var = b2.d;
                boolean z2 = false;
                if (zw2Var != null) {
                    if (voVar != null && zw2Var.f5563a.get() == voVar) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        z2 = true;
                    }
                }
                if (z2) {
                    b2.a(b2.d, i);
                }
            }
        }
    }

    public final void b() {
        ax2 b2 = ax2.b();
        vo voVar = this.t;
        synchronized (b2.f359a) {
            if (b2.c(voVar)) {
                b2.c = null;
                if (b2.d != null) {
                    b2.g();
                }
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void c() {
        ax2 b2 = ax2.b();
        vo voVar = this.t;
        synchronized (b2.f359a) {
            if (b2.c(voVar)) {
                b2.f(b2.c);
            }
        }
    }

    public final void d() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z = true;
        AccessibilityManager accessibilityManager = this.s;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z = false;
        }
        xo xoVar = this.i;
        if (z) {
            xoVar.post(new to(this, 2));
            return;
        }
        if (xoVar.getParent() != null) {
            xoVar.setVisibility(0);
        }
        c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:            if (r1 != false) goto L40;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r9 = this;
            xo r0 = r9.i
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 != 0) goto Lb
            return
        Lb:
            android.graphics.Rect r2 = r0.j
            if (r2 != 0) goto L10
            return
        L10:
            android.view.ViewParent r2 = r0.getParent()
            if (r2 != 0) goto L17
            return
        L17:
            int r2 = r9.m
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            android.graphics.Rect r3 = r0.j
            int r4 = r3.bottom
            int r4 = r4 + r2
            int r2 = r3.left
            int r5 = r9.n
            int r2 = r2 + r5
            int r5 = r3.right
            int r6 = r9.o
            int r5 = r5 + r6
            int r3 = r3.top
            int r6 = r1.bottomMargin
            r7 = 1
            r8 = 0
            if (r6 != r4) goto L41
            int r6 = r1.leftMargin
            if (r6 != r2) goto L41
            int r6 = r1.rightMargin
            if (r6 != r5) goto L41
            int r6 = r1.topMargin
            if (r6 == r3) goto L3f
            goto L41
        L3f:
            r6 = 0
            goto L42
        L41:
            r6 = 1
        L42:
            if (r6 == 0) goto L4f
            r1.bottomMargin = r4
            r1.leftMargin = r2
            r1.rightMargin = r5
            r1.topMargin = r3
            r0.requestLayout()
        L4f:
            if (r6 != 0) goto L57
            int r1 = r9.q
            int r2 = r9.p
            if (r1 == r2) goto L82
        L57:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L82
            int r1 = r9.p
            if (r1 <= 0) goto L77
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r2 = r1 instanceof defpackage.k90
            if (r2 == 0) goto L73
            k90 r1 = (defpackage.k90) r1
            h90 r1 = r1.f2909a
            boolean r1 = r1 instanceof com.google.android.material.behavior.SwipeDismissBehavior
            if (r1 == 0) goto L73
            r1 = 1
            goto L74
        L73:
            r1 = 0
        L74:
            if (r1 == 0) goto L77
            goto L78
        L77:
            r7 = 0
        L78:
            if (r7 == 0) goto L82
            to r1 = r9.l
            r0.removeCallbacks(r1)
            r0.post(r1)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yo.e():void");
    }
}
