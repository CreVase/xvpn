package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Base64;
import android.view.View;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class kc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2927a;

    /* renamed from: b, reason: collision with root package name */
    public int f2928b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;

    public kc(View view) {
        this.f2927a = 0;
        this.f2928b = -1;
        this.c = view;
        this.d = nd.a();
    }

    public static kc b(Context context, int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        tf3.u(z, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, bg2.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(bg2.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(bg2.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(bg2.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(bg2.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList j0 = m20.j0(context, obtainStyledAttributes, bg2.MaterialCalendarItem_itemFillColor);
        ColorStateList j02 = m20.j0(context, obtainStyledAttributes, bg2.MaterialCalendarItem_itemTextColor);
        ColorStateList j03 = m20.j0(context, obtainStyledAttributes, bg2.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(bg2.MaterialCalendarItem_itemStrokeWidth, 0);
        fs2 fs2Var = new fs2(fs2.a(context, obtainStyledAttributes.getResourceId(bg2.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(bg2.MaterialCalendarItem_itemShapeAppearanceOverlay, 0), new s(0)));
        obtainStyledAttributes.recycle();
        return new kc(j0, j02, j03, dimensionPixelSize, fs2Var, rect);
    }

    public final void a() {
        boolean z;
        View view = (View) this.c;
        Drawable background = view.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z2 = true;
            if (i <= 21 ? i == 21 : ((j93) this.e) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (((j93) this.g) == null) {
                    this.g = new j93(0);
                }
                j93 j93Var = (j93) this.g;
                j93Var.d = null;
                j93Var.c = false;
                j93Var.e = null;
                j93Var.f2730b = false;
                WeakHashMap weakHashMap = ll3.f3151a;
                ColorStateList g = al3.g(view);
                if (g != null) {
                    j93Var.c = true;
                    j93Var.d = g;
                }
                PorterDuff.Mode h = al3.h(view);
                if (h != null) {
                    j93Var.f2730b = true;
                    j93Var.e = h;
                }
                if (!j93Var.c && !j93Var.f2730b) {
                    z2 = false;
                } else {
                    nd.e(background, j93Var, view.getDrawableState());
                }
                if (z2) {
                    return;
                }
            }
            j93 j93Var2 = (j93) this.f;
            if (j93Var2 != null) {
                nd.e(background, j93Var2, view.getDrawableState());
                return;
            }
            j93 j93Var3 = (j93) this.e;
            if (j93Var3 != null) {
                nd.e(background, j93Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList c() {
        Object obj = this.f;
        if (((j93) obj) != null) {
            return (ColorStateList) ((j93) obj).d;
        }
        return null;
    }

    public final PorterDuff.Mode d() {
        Object obj = this.f;
        if (((j93) obj) != null) {
            return (PorterDuff.Mode) ((j93) obj).e;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0096 A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:3:0x001d, B:5:0x0026, B:6:0x0039, B:9:0x0040, B:11:0x0043, B:14:0x0048, B:15:0x0049, B:17:0x004a, B:19:0x0052, B:20:0x005c, B:22:0x0064, B:24:0x0078, B:26:0x0082, B:32:0x0090, B:34:0x0096, B:35:0x009d, B:8:0x003a), top: B:2:0x001d, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.c
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            android.content.Context r2 = r1.getContext()
            int[] r3 = defpackage.cg2.ViewBackgroundHelper
            go2 r7 = defpackage.go2.m(r2, r9, r3, r10)
            android.content.Context r2 = r1.getContext()
            java.lang.Object r4 = r7.f2294b
            r5 = r4
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r4 = r9
            r6 = r10
            defpackage.ll3.o(r1, r2, r3, r4, r5, r6)
            int r9 = defpackage.cg2.ViewBackgroundHelper_android_background     // Catch: java.lang.Throwable -> La4
            boolean r10 = r7.l(r9)     // Catch: java.lang.Throwable -> La4
            r1 = -1
            if (r10 == 0) goto L4a
            int r9 = r7.i(r9, r1)     // Catch: java.lang.Throwable -> La4
            r8.f2928b = r9     // Catch: java.lang.Throwable -> La4
            java.lang.Object r9 = r8.d     // Catch: java.lang.Throwable -> La4
            nd r9 = (defpackage.nd) r9     // Catch: java.lang.Throwable -> La4
            r10 = r0
            android.view.View r10 = (android.view.View) r10     // Catch: java.lang.Throwable -> La4
            android.content.Context r10 = r10.getContext()     // Catch: java.lang.Throwable -> La4
            int r2 = r8.f2928b     // Catch: java.lang.Throwable -> La4
            monitor-enter(r9)     // Catch: java.lang.Throwable -> La4
            bk2 r3 = r9.f3439a     // Catch: java.lang.Throwable -> L47
            android.content.res.ColorStateList r10 = r3.i(r10, r2)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r9)     // Catch: java.lang.Throwable -> La4
            if (r10 == 0) goto L4a
            r8.h(r10)     // Catch: java.lang.Throwable -> La4
            goto L4a
        L47:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> La4
            throw r10     // Catch: java.lang.Throwable -> La4
        L4a:
            int r9 = defpackage.cg2.ViewBackgroundHelper_backgroundTint     // Catch: java.lang.Throwable -> La4
            boolean r10 = r7.l(r9)     // Catch: java.lang.Throwable -> La4
            if (r10 == 0) goto L5c
            r10 = r0
            android.view.View r10 = (android.view.View) r10     // Catch: java.lang.Throwable -> La4
            android.content.res.ColorStateList r9 = r7.b(r9)     // Catch: java.lang.Throwable -> La4
            defpackage.ll3.r(r10, r9)     // Catch: java.lang.Throwable -> La4
        L5c:
            int r9 = defpackage.cg2.ViewBackgroundHelper_backgroundTintMode     // Catch: java.lang.Throwable -> La4
            boolean r10 = r7.l(r9)     // Catch: java.lang.Throwable -> La4
            if (r10 == 0) goto La0
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> La4
            int r9 = r7.h(r9, r1)     // Catch: java.lang.Throwable -> La4
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = defpackage.in0.c(r9, r10)     // Catch: java.lang.Throwable -> La4
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> La4
            defpackage.al3.r(r0, r9)     // Catch: java.lang.Throwable -> La4
            r9 = 21
            if (r10 != r9) goto La0
            android.graphics.drawable.Drawable r9 = r0.getBackground()     // Catch: java.lang.Throwable -> La4
            android.content.res.ColorStateList r10 = defpackage.al3.g(r0)     // Catch: java.lang.Throwable -> La4
            if (r10 != 0) goto L8b
            android.graphics.PorterDuff$Mode r10 = defpackage.al3.h(r0)     // Catch: java.lang.Throwable -> La4
            if (r10 == 0) goto L89
            goto L8b
        L89:
            r10 = 0
            goto L8c
        L8b:
            r10 = 1
        L8c:
            if (r9 == 0) goto La0
            if (r10 == 0) goto La0
            boolean r10 = r9.isStateful()     // Catch: java.lang.Throwable -> La4
            if (r10 == 0) goto L9d
            int[] r10 = r0.getDrawableState()     // Catch: java.lang.Throwable -> La4
            r9.setState(r10)     // Catch: java.lang.Throwable -> La4
        L9d:
            defpackage.uk3.q(r0, r9)     // Catch: java.lang.Throwable -> La4
        La0:
            r7.o()
            return
        La4:
            r9 = move-exception
            r7.o()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc.e(android.util.AttributeSet, int):void");
    }

    public final void f() {
        this.f2928b = -1;
        h(null);
        a();
    }

    public final void g(int i) {
        ColorStateList colorStateList;
        this.f2928b = i;
        nd ndVar = (nd) this.d;
        if (ndVar != null) {
            Context context = ((View) this.c).getContext();
            synchronized (ndVar) {
                colorStateList = ndVar.f3439a.i(context, i);
            }
        } else {
            colorStateList = null;
        }
        h(colorStateList);
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((j93) this.e) == null) {
                this.e = new j93(0);
            }
            Object obj = this.e;
            ((j93) obj).d = colorStateList;
            ((j93) obj).c = true;
        } else {
            this.e = null;
        }
        a();
    }

    public final void i(ColorStateList colorStateList) {
        if (((j93) this.f) == null) {
            this.f = new j93(0);
        }
        j93 j93Var = (j93) this.f;
        j93Var.d = colorStateList;
        j93Var.c = true;
        a();
    }

    public final void j(PorterDuff.Mode mode) {
        if (((j93) this.f) == null) {
            this.f = new j93(0);
        }
        j93 j93Var = (j93) this.f;
        j93Var.e = mode;
        j93Var.f2730b = true;
        a();
    }

    public final String toString() {
        switch (this.f2927a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.c) + ", mProviderPackage: " + ((String) this.d) + ", mQuery: " + ((String) this.e) + ", mCertificates:");
                for (int i = 0; i < ((List) this.f).size(); i++) {
                    sb.append(" [");
                    List list = (List) ((List) this.f).get(i);
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                }
                sb.append("}");
                sb.append("mCertificatesArray: " + this.f2928b);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public kc(String str, String str2, String str3, List list) {
        this.f2927a = 1;
        str.getClass();
        this.c = str;
        str2.getClass();
        this.d = str2;
        this.e = str3;
        list.getClass();
        this.f = list;
        this.f2928b = 0;
        this.g = str + "-" + str2 + "-" + str3;
    }

    public kc(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, fs2 fs2Var, Rect rect) {
        this.f2927a = 2;
        tf3.v(rect.left);
        tf3.v(rect.top);
        tf3.v(rect.right);
        tf3.v(rect.bottom);
        this.c = rect;
        this.d = colorStateList2;
        this.e = colorStateList;
        this.f = colorStateList3;
        this.f2928b = i;
        this.g = fs2Var;
    }
}
