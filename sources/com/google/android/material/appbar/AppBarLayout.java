package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import defpackage.a3;
import defpackage.bc;
import defpackage.bg2;
import defpackage.cc;
import defpackage.dc;
import defpackage.ec;
import defpackage.ew3;
import defpackage.fc;
import defpackage.fr1;
import defpackage.g90;
import defpackage.gz1;
import defpackage.h90;
import defpackage.he2;
import defpackage.k90;
import defpackage.ll3;
import defpackage.n71;
import defpackage.nm3;
import defpackage.o71;
import defpackage.pb;
import defpackage.pg1;
import defpackage.qf2;
import defpackage.t9;
import defpackage.uk3;
import defpackage.vk3;
import defpackage.wq3;
import defpackage.xk3;
import defpackage.zf3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements g90 {
    public static final int y = qf2.Widget_Design_AppBarLayout;

    /* renamed from: a, reason: collision with root package name */
    public int f1516a;

    /* renamed from: b, reason: collision with root package name */
    public int f1517b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public wq3 g;
    public ArrayList h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public WeakReference n;
    public final ColorStateList o;
    public ValueAnimator p;
    public bc q;
    public final ArrayList r;
    public final long s;
    public final TimeInterpolator t;
    public int[] u;
    public Drawable v;
    public final float w;
    public Behavior x;

    /* loaded from: classes2.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends n71 {
        public int j;
        public int k;
        public ValueAnimator l;
        public SavedState m;
        public WeakReference n;
        public e o;
        public boolean p;

        /* loaded from: classes2.dex */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new f();
            public boolean c;
            public boolean d;
            public int e;
            public float f;
            public boolean g;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z;
                boolean z2;
                if (parcel.readByte() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.c = z;
                if (parcel.readByte() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.d = z2;
                this.e = parcel.readInt();
                this.f = parcel.readFloat();
                this.g = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.f200a, i);
                parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.e);
                parcel.writeFloat(this.f);
                parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void E(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = 0
            La:
                r4 = 0
                if (r3 >= r1) goto L21
                android.view.View r5 = r8.getChildAt(r3)
                int r6 = r5.getTop()
                if (r0 < r6) goto L1e
                int r6 = r5.getBottom()
                if (r0 > r6) goto L1e
                goto L22
            L1e:
                int r3 = r3 + 1
                goto La
            L21:
                r5 = r4
            L22:
                r0 = 1
                if (r5 == 0) goto L5e
                android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
                ec r1 = (defpackage.ec) r1
                int r1 = r1.f1909a
                r3 = r1 & 1
                if (r3 == 0) goto L5e
                java.util.WeakHashMap r3 = defpackage.ll3.f3151a
                int r3 = defpackage.uk3.d(r5)
                if (r10 <= 0) goto L4b
                r10 = r1 & 12
                if (r10 == 0) goto L4b
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5e
                goto L5c
            L4b:
                r10 = r1 & 2
                if (r10 == 0) goto L5e
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5e
            L5c:
                r9 = 1
                goto L5f
            L5e:
                r9 = 0
            L5f:
                boolean r10 = r8.l
                if (r10 == 0) goto L6b
                android.view.View r9 = z(r7)
                boolean r9 = r8.g(r9)
            L6b:
                boolean r9 = r8.f(r9)
                if (r11 != 0) goto Laf
                if (r9 == 0) goto Ldc
                eb3 r9 = r7.f189b
                java.lang.Object r9 = r9.f1908b
                uu2 r9 = (defpackage.uu2) r9
                java.lang.Object r9 = r9.getOrDefault(r8, r4)
                java.util.List r9 = (java.util.List) r9
                java.util.ArrayList r7 = r7.d
                r7.clear()
                if (r9 == 0) goto L89
                r7.addAll(r9)
            L89:
                int r9 = r7.size()
                r10 = 0
            L8e:
                if (r10 >= r9) goto Lad
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                k90 r11 = (defpackage.k90) r11
                h90 r11 = r11.f2909a
                boolean r1 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 == 0) goto Laa
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f
                if (r7 == 0) goto Lad
                r2 = 1
                goto Lad
            Laa:
                int r10 = r10 + 1
                goto L8e
            Lad:
                if (r2 == 0) goto Ldc
            Laf:
                android.graphics.drawable.Drawable r7 = r8.getBackground()
                if (r7 == 0) goto Lbc
                android.graphics.drawable.Drawable r7 = r8.getBackground()
                r7.jumpToCurrentState()
            Lbc:
                int r7 = android.os.Build.VERSION.SDK_INT
                r9 = 23
                if (r7 < r9) goto Lcf
                android.graphics.drawable.Drawable r7 = defpackage.u2.c(r8)
                if (r7 == 0) goto Lcf
                android.graphics.drawable.Drawable r7 = defpackage.u2.c(r8)
                r7.jumpToCurrentState()
            Lcf:
                android.animation.StateListAnimator r7 = r8.getStateListAnimator()
                if (r7 == 0) goto Ldc
                android.animation.StateListAnimator r7 = r8.getStateListAnimator()
                r7.jumpToCurrentState()
            Ldc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.E(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public static View z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof gz1) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final void A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    int i4 = -appBarLayout.getTotalScrollRange();
                    i2 = i4;
                    i3 = appBarLayout.getDownNestedPreScrollRange() + i4;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    i3 = 0;
                }
                if (i2 != i3) {
                    iArr[1] = w(coordinatorLayout, appBarLayout, v() - i, i2, i3);
                }
            }
            if (appBarLayout.l) {
                appBarLayout.f(appBarLayout.g(view));
            }
        }

        public final SavedState B(Parcelable parcelable, AppBarLayout appBarLayout) {
            boolean z;
            boolean z2;
            int t = t();
            int childCount = appBarLayout.getChildCount();
            boolean z3 = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + t;
                if (childAt.getTop() + t <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f199b;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    if (t == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    savedState.d = z;
                    if (!z && (-t) >= appBarLayout.getTotalScrollRange()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    savedState.c = z2;
                    savedState.e = i;
                    WeakHashMap weakHashMap = ll3.f3151a;
                    if (bottom == appBarLayout.getTopInset() + uk3.d(childAt)) {
                        z3 = true;
                    }
                    savedState.g = z3;
                    savedState.f = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public final void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int v = v() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                z = true;
                if (i < childCount) {
                    View childAt = appBarLayout.getChildAt(i);
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    ec ecVar = (ec) childAt.getLayoutParams();
                    if ((ecVar.f1909a & 32) == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        top -= ((LinearLayout.LayoutParams) ecVar).topMargin;
                        bottom += ((LinearLayout.LayoutParams) ecVar).bottomMargin;
                    }
                    int i2 = -v;
                    if (top <= i2 && bottom >= i2) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                ec ecVar2 = (ec) childAt2.getLayoutParams();
                int i3 = ecVar2.f1909a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == 0) {
                        WeakHashMap weakHashMap = ll3.f3151a;
                        if (uk3.b(appBarLayout) && uk3.b(childAt2)) {
                            i4 -= appBarLayout.getTopInset();
                        }
                    }
                    if ((i3 & 2) == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        WeakHashMap weakHashMap2 = ll3.f3151a;
                        i5 += uk3.d(childAt2);
                    } else {
                        if ((i3 & 5) == 5) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            WeakHashMap weakHashMap3 = ll3.f3151a;
                            int d = uk3.d(childAt2) + i5;
                            if (v < d) {
                                i4 = d;
                            } else {
                                i5 = d;
                            }
                        }
                    }
                    if ((i3 & 32) != 32) {
                        z = false;
                    }
                    if (z) {
                        i4 += ((LinearLayout.LayoutParams) ecVar2).topMargin;
                        i5 -= ((LinearLayout.LayoutParams) ecVar2).bottomMargin;
                    }
                    if (v < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    y(coordinatorLayout, appBarLayout, ew3.E0(i4 + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        public final void D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            View view;
            boolean z;
            boolean z2;
            boolean z3;
            ll3.m(coordinatorLayout, a3.h.a());
            boolean z4 = false;
            ll3.i(coordinatorLayout, 0);
            ll3.m(coordinatorLayout, a3.i.a());
            ll3.i(coordinatorLayout, 0);
            if (appBarLayout.getTotalScrollRange() == 0) {
                return;
            }
            int childCount = coordinatorLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i < childCount) {
                    view = coordinatorLayout.getChildAt(i);
                    if (((k90) view.getLayoutParams()).f2909a instanceof ScrollingViewBehavior) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    view = null;
                    break;
                }
            }
            View view2 = view;
            if (view2 == null) {
                return;
            }
            int childCount2 = appBarLayout.getChildCount();
            int i2 = 0;
            while (true) {
                z = true;
                if (i2 < childCount2) {
                    if (((ec) appBarLayout.getChildAt(i2).getLayoutParams()).f1909a != 0) {
                        z2 = true;
                        break;
                    }
                    i2++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                return;
            }
            if (ll3.c(coordinatorLayout) != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                ll3.p(coordinatorLayout, new b(this));
            }
            if (v() != (-appBarLayout.getTotalScrollRange())) {
                ll3.n(coordinatorLayout, a3.h, new d(appBarLayout, false));
                z4 = true;
            }
            if (v() != 0) {
                if (view2.canScrollVertically(-1)) {
                    int i3 = -appBarLayout.getDownNestedPreScrollRange();
                    if (i3 != 0) {
                        ll3.n(coordinatorLayout, a3.i, new c(this, coordinatorLayout, appBarLayout, view2, i3));
                    }
                } else {
                    ll3.n(coordinatorLayout, a3.i, new d(appBarLayout, true));
                }
                this.p = z;
            }
            z = z4;
            this.p = z;
        }

        @Override // defpackage.mm3, defpackage.h90
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            boolean z;
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.m;
            if (savedState != null && (pendingAction & 8) == 0) {
                if (savedState.c) {
                    x(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
                } else if (savedState.d) {
                    x(coordinatorLayout, appBarLayout, 0);
                } else {
                    View childAt = appBarLayout.getChildAt(savedState.e);
                    int i2 = -childAt.getBottom();
                    if (this.m.g) {
                        round = appBarLayout.getTopInset() + uk3.d(childAt) + i2;
                    } else {
                        round = Math.round(childAt.getHeight() * this.m.f) + i2;
                    }
                    x(coordinatorLayout, appBarLayout, round);
                }
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((pendingAction & 2) != 0) {
                    int i3 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        y(coordinatorLayout, appBarLayout, i3);
                    } else {
                        x(coordinatorLayout, appBarLayout, i3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        y(coordinatorLayout, appBarLayout, 0);
                    } else {
                        x(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f = 0;
            this.m = null;
            int E0 = ew3.E0(t(), -appBarLayout.getTotalScrollRange(), 0);
            nm3 nm3Var = this.f3317a;
            if (nm3Var != null) {
                if (nm3Var.d != E0) {
                    nm3Var.d = E0;
                    nm3Var.a();
                }
            } else {
                this.f3318b = E0;
            }
            E(coordinatorLayout, appBarLayout, t(), 0, true);
            appBarLayout.d(t());
            D(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // defpackage.h90
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((k90) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.r(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // defpackage.h90
        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            A(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // defpackage.h90
        public final void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i4 < 0) {
                iArr[1] = w(coordinatorLayout, appBarLayout, v() - i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                D(coordinatorLayout, appBarLayout);
            }
        }

        @Override // defpackage.h90
        public final void o(View view, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = this.m;
                this.m = (SavedState) parcelable;
            } else {
                this.m = null;
            }
        }

        @Override // defpackage.h90
        public final Parcelable p(View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState B = B(absSavedState, (AppBarLayout) view);
            if (B != null) {
                return B;
            }
            return absSavedState;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:            if (r3 != false) goto L16;     */
        @Override // defpackage.h90
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean q(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r2 = this;
                com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
                r6 = r6 & 2
                r0 = 0
                if (r6 == 0) goto L2c
                boolean r6 = r4.l
                r1 = 1
                if (r6 != 0) goto L2b
                int r6 = r4.getTotalScrollRange()
                if (r6 == 0) goto L14
                r6 = 1
                goto L15
            L14:
                r6 = 0
            L15:
                if (r6 == 0) goto L28
                int r3 = r3.getHeight()
                int r5 = r5.getHeight()
                int r3 = r3 - r5
                int r4 = r4.getHeight()
                if (r3 > r4) goto L28
                r3 = 1
                goto L29
            L28:
                r3 = 0
            L29:
                if (r3 == 0) goto L2c
            L2b:
                r0 = 1
            L2c:
                if (r0 == 0) goto L35
                android.animation.ValueAnimator r3 = r2.l
                if (r3 == 0) goto L35
                r3.cancel()
            L35:
                r3 = 0
                r2.n = r3
                r2.k = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int, int):boolean");
        }

        @Override // defpackage.h90
        public final void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.k == 0 || i == 1) {
                C(coordinatorLayout, appBarLayout);
                if (appBarLayout.l) {
                    appBarLayout.f(appBarLayout.g(view2));
                }
            }
            this.n = new WeakReference(view2);
        }

        @Override // defpackage.n71
        public final int v() {
            return t() + this.j;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0179  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0198  */
        @Override // defpackage.n71
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int w(androidx.coordinatorlayout.widget.CoordinatorLayout r19, android.view.View r20, int r21, int r22, int r23) {
            /*
                Method dump skipped, instructions count: 420
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.w(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        public final void y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int height;
            int abs = Math.abs(v() - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            int v = v();
            if (v == i) {
                ValueAnimator valueAnimator = this.l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.l = valueAnimator3;
                valueAnimator3.setInterpolator(pb.e);
                this.l.addUpdateListener(new a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.l.setDuration(Math.min(height, 600));
            this.l.setIntValues(v, i);
            this.l.start();
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
        }
    }

    /* loaded from: classes2.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes2.dex */
    public static class ScrollingViewBehavior extends o71 {
        public ScrollingViewBehavior() {
        }

        public static AppBarLayout w(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.h90
        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // defpackage.h90
        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            h90 h90Var = ((k90) view2.getLayoutParams()).f2909a;
            if (h90Var instanceof BaseBehavior) {
                ll3.k(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) h90Var).j) + this.e) - v(view2));
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.l) {
                    appBarLayout.f(appBarLayout.g(view));
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // defpackage.h90
        public final void e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                ll3.m(coordinatorLayout, a3.h.a());
                ll3.i(coordinatorLayout, 0);
                ll3.m(coordinatorLayout, a3.i.a());
                ll3.i(coordinatorLayout, 0);
                ll3.p(coordinatorLayout, null);
            }
        }

        @Override // defpackage.h90
        public final boolean n(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout w = w(coordinatorLayout.e(view));
            if (w != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    w.e(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bg2.ScrollingViewBehavior_Layout);
            this.f = obtainStyledAttributes.getDimensionPixelSize(bg2.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppBarLayout(android.content.Context r14, android.util.AttributeSet r15) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static ec b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new ec((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new ec((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new ec(layoutParams);
    }

    private ColorStateList getBackgroundCSL() {
        ColorStateList b2;
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) background).getColor());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            b2 = dc.b(background);
            return b2;
        }
        return null;
    }

    public final void a(fc fcVar) {
        if (this.h == null) {
            this.h = new ArrayList();
        }
        if (fcVar != null && !this.h.contains(fcVar)) {
            this.h.add(fcVar);
        }
    }

    public final void c() {
        BaseBehavior.SavedState savedState;
        Behavior behavior = this.x;
        if (behavior != null && this.f1517b != -1 && this.f == 0) {
            savedState = behavior.B(AbsSavedState.f199b, this);
        } else {
            savedState = null;
        }
        this.f1517b = -1;
        this.c = -1;
        this.d = -1;
        if (savedState != null) {
            Behavior behavior2 = this.x;
            if (behavior2.m == null) {
                behavior2.m = savedState;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ec;
    }

    public final void d(int i) {
        this.f1516a = i;
        if (!willNotDraw()) {
            WeakHashMap weakHashMap = ll3.f3151a;
            uk3.k(this);
        }
        ArrayList arrayList = this.h;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                cc ccVar = (cc) this.h.get(i2);
                if (ccVar != null) {
                    ccVar.a(i);
                }
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        if (this.v != null && getTopInset() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f1516a);
            this.v.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        int i3 = 0;
        if (z2) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        int i4 = i | i2;
        if (z3) {
            i3 = 8;
        }
        this.f = i4 | i3;
        requestLayout();
    }

    public final boolean f(boolean z) {
        float f;
        float f2;
        if ((!this.i) && this.k != z) {
            this.k = z;
            refreshDrawableState();
            if (!this.l || !(getBackground() instanceof fr1)) {
                return true;
            }
            float f3 = 0.0f;
            if (this.o != null) {
                if (z) {
                    f2 = 0.0f;
                } else {
                    f2 = 255.0f;
                }
                if (z) {
                    f3 = 255.0f;
                }
                i(f2, f3);
                return true;
            }
            float f4 = this.w;
            if (z) {
                f = 0.0f;
            } else {
                f = f4;
            }
            if (z) {
                f3 = f4;
            }
            i(f, f3);
            return true;
        }
        return false;
    }

    public final boolean g(View view) {
        int i;
        View view2;
        View view3 = null;
        if (this.n == null && (i = this.m) != -1) {
            if (view != null) {
                view2 = view.findViewById(i);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.m);
            }
            if (view2 != null) {
                this.n = new WeakReference(view2);
            }
        }
        WeakReference weakReference = this.n;
        if (weakReference != null) {
            view3 = (View) weakReference.get();
        }
        if (view3 != null) {
            view = view3;
        }
        if (view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ec();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // defpackage.g90
    public h90 getBehavior() {
        Behavior behavior = new Behavior();
        this.x = behavior;
        return behavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getDownNestedPreScrollRange() {
        /*
            r9 = this;
            int r0 = r9.c
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = 0
        Le:
            if (r0 < 0) goto L69
            android.view.View r3 = r9.getChildAt(r0)
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1d
            goto L66
        L1d:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            ec r4 = (defpackage.ec) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.f1909a
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L63
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L3f
            java.util.WeakHashMap r4 = defpackage.ll3.f3151a
            int r4 = defpackage.uk3.d(r3)
        L3d:
            int r4 = r4 + r7
            goto L4e
        L3f:
            r4 = r6 & 2
            if (r4 == 0) goto L4c
            java.util.WeakHashMap r4 = defpackage.ll3.f3151a
            int r4 = defpackage.uk3.d(r3)
            int r4 = r5 - r4
            goto L3d
        L4c:
            int r4 = r7 + r5
        L4e:
            if (r0 != 0) goto L61
            java.util.WeakHashMap r6 = defpackage.ll3.f3151a
            boolean r3 = defpackage.uk3.b(r3)
            if (r3 == 0) goto L61
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L61:
            int r2 = r2 + r4
            goto L66
        L63:
            if (r2 <= 0) goto L66
            goto L69
        L66:
            int r0 = r0 + (-1)
            goto Le
        L69:
            int r0 = java.lang.Math.max(r1, r2)
            r9.c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ec ecVar = (ec) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) ecVar).topMargin + ((LinearLayout.LayoutParams) ecVar).bottomMargin + childAt.getMeasuredHeight();
                int i4 = ecVar.f1909a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    WeakHashMap weakHashMap = ll3.f3151a;
                    i3 -= uk3.d(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.m;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = ll3.f3151a;
        int d = uk3.d(this);
        if (d == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                d = uk3.d(getChildAt(childCount - 1));
            } else {
                d = 0;
            }
            if (d == 0) {
                return getHeight() / 3;
            }
        }
        return (d * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f;
    }

    public Drawable getStatusBarForeground() {
        return this.v;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        wq3 wq3Var = this.g;
        if (wq3Var != null) {
            return wq3Var.e();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f1517b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ec ecVar = (ec) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = ecVar.f1909a;
                if ((i4 & 1) == 0) {
                    break;
                }
                int i5 = measuredHeight + ((LinearLayout.LayoutParams) ecVar).topMargin + ((LinearLayout.LayoutParams) ecVar).bottomMargin + i3;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = ll3.f3151a;
                    if (uk3.b(childAt)) {
                        i5 -= getTopInset();
                    }
                }
                i3 = i5;
                if ((i4 & 2) != 0) {
                    WeakHashMap weakHashMap2 = ll3.f3151a;
                    i3 -= uk3.d(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f1517b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final boolean h() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap weakHashMap = ll3.f3151a;
        if (uk3.b(childAt)) {
            return false;
        }
        return true;
    }

    public final void i(float f, float f2) {
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        this.p = ofFloat;
        ofFloat.setDuration(this.s);
        this.p.setInterpolator(this.t);
        bc bcVar = this.q;
        if (bcVar != null) {
            this.p.addUpdateListener(bcVar);
        }
        this.p.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof fr1) {
            zf3.h0(this, (fr1) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int i2;
        int i3;
        if (this.u == null) {
            this.u = new int[4];
        }
        int[] iArr = this.u;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.j;
        int i4 = he2.state_liftable;
        if (!z) {
            i4 = -i4;
        }
        iArr[0] = i4;
        if (z && this.k) {
            i2 = he2.state_lifted;
        } else {
            i2 = -he2.state_lifted;
        }
        iArr[1] = i2;
        int i5 = he2.state_collapsible;
        if (!z) {
            i5 = -i5;
        }
        iArr[2] = i5;
        if (z && this.k) {
            i3 = he2.state_collapsed;
        } else {
            i3 = -he2.state_collapsed;
        }
        iArr[3] = i3;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.n = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap weakHashMap = ll3.f3151a;
        boolean z4 = true;
        if (uk3.b(this) && h()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                ll3.k(getChildAt(childCount), topInset);
            }
        }
        c();
        this.e = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((ec) getChildAt(i5).getLayoutParams()).c != null) {
                this.e = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.i) {
            if (!this.l) {
                int childCount3 = getChildCount();
                int i6 = 0;
                while (true) {
                    if (i6 < childCount3) {
                        int i7 = ((ec) getChildAt(i6).getLayoutParams()).f1909a;
                        if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            z2 = true;
                            break;
                        }
                        i6++;
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (!z2) {
                    z4 = false;
                }
            }
            if (this.j != z4) {
                this.j = z4;
                refreshDrawableState();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = ll3.f3151a;
            if (uk3.b(this) && h()) {
                int measuredHeight = getMeasuredHeight();
                if (mode != Integer.MIN_VALUE) {
                    if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                } else {
                    measuredHeight = ew3.E0(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        c();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof fr1) {
            ((fr1) background).i(f);
        }
    }

    public void setExpanded(boolean z) {
        WeakHashMap weakHashMap = ll3.f3151a;
        e(z, xk3.c(this), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.l = z;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.m = -1;
        if (view == null) {
            WeakReference weakReference = this.n;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.n = null;
            return;
        }
        this.n = new WeakReference(view);
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.m = i;
        WeakReference weakReference = this.n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.n = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.i = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.v;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.v = drawable3;
            boolean z2 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.v.setState(getDrawableState());
                }
                Drawable drawable4 = this.v;
                WeakHashMap weakHashMap = ll3.f3151a;
                t9.o0(drawable4, vk3.d(this));
                Drawable drawable5 = this.v;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable5.setVisible(z, false);
                this.v.setCallback(this);
            }
            if (this.v != null && getTopInset() > 0) {
                z2 = true;
            }
            setWillNotDraw(!z2);
            WeakHashMap weakHashMap2 = ll3.f3151a;
            uk3.k(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(ew3.P0(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        pg1.k(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.v) {
            return false;
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new ec();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ec(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ec(getContext(), attributeSet);
    }
}
