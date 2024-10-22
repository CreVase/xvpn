package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class bk2 {
    public static bk2 i;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f480a;

    /* renamed from: b, reason: collision with root package name */
    public uu2 f481b;
    public rx2 c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue e;
    public boolean f;
    public jx0 g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final zj2 j = new zj2(6, 0);

    public static synchronized bk2 d() {
        bk2 bk2Var;
        synchronized (bk2.class) {
            if (i == null) {
                bk2 bk2Var2 = new bk2();
                i = bk2Var2;
                j(bk2Var2);
            }
            bk2Var = i;
        }
        return bk2Var;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (bk2.class) {
            zj2 zj2Var = j;
            zj2Var.getClass();
            int i3 = (i2 + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) zj2Var.get(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(bk2 bk2Var) {
        if (Build.VERSION.SDK_INT < 24) {
            bk2Var.a("vector", new yj2(3));
            bk2Var.a("animated-vector", new yj2(1));
            bk2Var.a("animated-selector", new yj2(0));
            bk2Var.a("drawable", new yj2(2));
        }
    }

    public final void a(String str, yj2 yj2Var) {
        if (this.f481b == null) {
            this.f481b = new uu2();
        }
        this.f481b.put(str, yj2Var);
    }

    public final synchronized void b(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            ko1 ko1Var = (ko1) this.d.get(context);
            if (ko1Var == null) {
                ko1Var = new ko1();
                this.d.put(context, ko1Var);
            }
            ko1Var.f(j2, new WeakReference(constantState));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable c(android.content.Context r8, int r9) {
        /*
            r7 = this;
            android.util.TypedValue r0 = r7.e
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r7.e = r0
        Lb:
            android.util.TypedValue r0 = r7.e
            android.content.res.Resources r1 = r8.getResources()
            r2 = 1
            r1.getValue(r9, r0, r2)
            int r1 = r0.assetCookie
            long r3 = (long) r1
            r1 = 32
            long r3 = r3 << r1
            int r1 = r0.data
            long r5 = (long) r1
            long r3 = r3 | r5
            android.graphics.drawable.Drawable r1 = r7.e(r8, r3)
            if (r1 == 0) goto L26
            return r1
        L26:
            jx0 r1 = r7.g
            if (r1 != 0) goto L2b
            goto L6a
        L2b:
            int r1 = defpackage.ve2.abc_cab_background_top_material
            if (r9 != r1) goto L49
            android.graphics.drawable.LayerDrawable r9 = new android.graphics.drawable.LayerDrawable
            r1 = 2
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
            int r5 = defpackage.ve2.abc_cab_background_internal_bg
            android.graphics.drawable.Drawable r5 = r7.f(r8, r5)
            r6 = 0
            r1[r6] = r5
            int r5 = defpackage.ve2.abc_cab_background_top_mtrl_alpha
            android.graphics.drawable.Drawable r5 = r7.f(r8, r5)
            r1[r2] = r5
            r9.<init>(r1)
            goto L6b
        L49:
            int r1 = defpackage.ve2.abc_ratingbar_material
            if (r9 != r1) goto L54
            int r9 = defpackage.se2.abc_star_big
            android.graphics.drawable.LayerDrawable r9 = defpackage.jx0.n(r7, r8, r9)
            goto L6b
        L54:
            int r1 = defpackage.ve2.abc_ratingbar_indicator_material
            if (r9 != r1) goto L5f
            int r9 = defpackage.se2.abc_star_medium
            android.graphics.drawable.LayerDrawable r9 = defpackage.jx0.n(r7, r8, r9)
            goto L6b
        L5f:
            int r1 = defpackage.ve2.abc_ratingbar_small_material
            if (r9 != r1) goto L6a
            int r9 = defpackage.se2.abc_star_small
            android.graphics.drawable.LayerDrawable r9 = defpackage.jx0.n(r7, r8, r9)
            goto L6b
        L6a:
            r9 = 0
        L6b:
            if (r9 == 0) goto L75
            int r0 = r0.changingConfigurations
            r9.setChangingConfigurations(r0)
            r7.b(r8, r3, r9)
        L75:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bk2.c(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable e(Context context, long j2) {
        ko1 ko1Var = (ko1) this.d.get(context);
        if (ko1Var == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) ko1Var.e(j2, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int f = fl.f(ko1Var.f2987b, ko1Var.d, j2);
            if (f >= 0) {
                Object[] objArr = ko1Var.c;
                Object obj = objArr[f];
                Object obj2 = ko1.e;
                if (obj != obj2) {
                    objArr[f] = obj2;
                    ko1Var.f2986a = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i2) {
        return g(context, i2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x002a, code lost:            if (r0 == false) goto L100;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0117, code lost:            defpackage.bn0.i(r13, r3);     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb A[Catch: all -> 0x00cd, TryCatch #1 {all -> 0x00cd, blocks: (B:3:0x0001, B:6:0x002c, B:8:0x0031, B:10:0x0037, B:12:0x003d, B:15:0x004b, B:18:0x005c, B:20:0x0060, B:21:0x0067, B:25:0x00eb, B:27:0x00f1, B:29:0x00f7, B:31:0x00fd, B:35:0x0117, B:38:0x010f, B:40:0x0113, B:41:0x011d, B:43:0x0121, B:45:0x012d, B:50:0x0158, B:52:0x015c, B:54:0x0160, B:56:0x0164, B:57:0x0192, B:62:0x019f, B:66:0x0081, B:68:0x0085, B:71:0x0091, B:72:0x0099, B:78:0x00a5, B:80:0x00b8, B:82:0x00c4, B:83:0x00d0, B:84:0x00d7, B:87:0x00d9, B:89:0x00e2, B:90:0x0055, B:92:0x0008, B:94:0x0012, B:96:0x0016, B:102:0x01a4, B:103:0x01ad), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f1 A[Catch: all -> 0x00cd, TryCatch #1 {all -> 0x00cd, blocks: (B:3:0x0001, B:6:0x002c, B:8:0x0031, B:10:0x0037, B:12:0x003d, B:15:0x004b, B:18:0x005c, B:20:0x0060, B:21:0x0067, B:25:0x00eb, B:27:0x00f1, B:29:0x00f7, B:31:0x00fd, B:35:0x0117, B:38:0x010f, B:40:0x0113, B:41:0x011d, B:43:0x0121, B:45:0x012d, B:50:0x0158, B:52:0x015c, B:54:0x0160, B:56:0x0164, B:57:0x0192, B:62:0x019f, B:66:0x0081, B:68:0x0085, B:71:0x0091, B:72:0x0099, B:78:0x00a5, B:80:0x00b8, B:82:0x00c4, B:83:0x00d0, B:84:0x00d7, B:87:0x00d9, B:89:0x00e2, B:90:0x0055, B:92:0x0008, B:94:0x0012, B:96:0x0016, B:102:0x01a4, B:103:0x01ad), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f7 A[Catch: all -> 0x00cd, TryCatch #1 {all -> 0x00cd, blocks: (B:3:0x0001, B:6:0x002c, B:8:0x0031, B:10:0x0037, B:12:0x003d, B:15:0x004b, B:18:0x005c, B:20:0x0060, B:21:0x0067, B:25:0x00eb, B:27:0x00f1, B:29:0x00f7, B:31:0x00fd, B:35:0x0117, B:38:0x010f, B:40:0x0113, B:41:0x011d, B:43:0x0121, B:45:0x012d, B:50:0x0158, B:52:0x015c, B:54:0x0160, B:56:0x0164, B:57:0x0192, B:62:0x019f, B:66:0x0081, B:68:0x0085, B:71:0x0091, B:72:0x0099, B:78:0x00a5, B:80:0x00b8, B:82:0x00c4, B:83:0x00d0, B:84:0x00d7, B:87:0x00d9, B:89:0x00e2, B:90:0x0055, B:92:0x0008, B:94:0x0012, B:96:0x0016, B:102:0x01a4, B:103:0x01ad), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019f A[Catch: all -> 0x00cd, TRY_LEAVE, TryCatch #1 {all -> 0x00cd, blocks: (B:3:0x0001, B:6:0x002c, B:8:0x0031, B:10:0x0037, B:12:0x003d, B:15:0x004b, B:18:0x005c, B:20:0x0060, B:21:0x0067, B:25:0x00eb, B:27:0x00f1, B:29:0x00f7, B:31:0x00fd, B:35:0x0117, B:38:0x010f, B:40:0x0113, B:41:0x011d, B:43:0x0121, B:45:0x012d, B:50:0x0158, B:52:0x015c, B:54:0x0160, B:56:0x0164, B:57:0x0192, B:62:0x019f, B:66:0x0081, B:68:0x0085, B:71:0x0091, B:72:0x0099, B:78:0x00a5, B:80:0x00b8, B:82:0x00c4, B:83:0x00d0, B:84:0x00d7, B:87:0x00d9, B:89:0x00e2, B:90:0x0055, B:92:0x0008, B:94:0x0012, B:96:0x0016, B:102:0x01a4, B:103:0x01ad), top: B:2:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.drawable.Drawable g(android.content.Context r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bk2.g(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized ColorStateList i(Context context, int i2) {
        ColorStateList colorStateList;
        rx2 rx2Var;
        try {
            WeakHashMap weakHashMap = this.f480a;
            ColorStateList colorStateList2 = null;
            if (weakHashMap != null && (rx2Var = (rx2) weakHashMap.get(context)) != null) {
                colorStateList = (ColorStateList) rx2Var.d(i2, null);
            } else {
                colorStateList = null;
            }
            if (colorStateList == null) {
                jx0 jx0Var = this.g;
                if (jx0Var != null) {
                    colorStateList2 = jx0Var.q(context, i2);
                }
                if (colorStateList2 != null) {
                    if (this.f480a == null) {
                        this.f480a = new WeakHashMap();
                    }
                    rx2 rx2Var2 = (rx2) this.f480a.get(context);
                    if (rx2Var2 == null) {
                        rx2Var2 = new rx2();
                        this.f480a.put(context, rx2Var2);
                    }
                    rx2Var2.a(i2, colorStateList2);
                }
                colorStateList = colorStateList2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return colorStateList;
    }

    public final synchronized void k(Context context) {
        ko1 ko1Var = (ko1) this.d.get(context);
        if (ko1Var != null) {
            ko1Var.b();
        }
    }

    public final synchronized void l(jx0 jx0Var) {
        this.g = jx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            jx0 r0 = r6.g
            r1 = 0
            if (r0 == 0) goto L72
            android.graphics.PorterDuff$Mode r2 = defpackage.nd.f3438b
            java.lang.Object r3 = r0.f2845a
            int[] r3 = (int[]) r3
            boolean r3 = defpackage.jx0.e(r3, r8)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L16
            int r8 = defpackage.ie2.colorControlNormal
            goto L46
        L16:
            java.lang.Object r3 = r0.c
            int[] r3 = (int[]) r3
            boolean r3 = defpackage.jx0.e(r3, r8)
            if (r3 == 0) goto L23
            int r8 = defpackage.ie2.colorControlActivated
            goto L46
        L23:
            java.lang.Object r0 = r0.d
            int[] r0 = (int[]) r0
            boolean r0 = defpackage.jx0.e(r0, r8)
            if (r0 == 0) goto L30
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L43
        L30:
            int r0 = defpackage.ve2.abc_list_divider_mtrl_alpha
            if (r8 != r0) goto L3f
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            goto L48
        L3f:
            int r0 = defpackage.ve2.abc_dialog_material_background
            if (r8 != r0) goto L4a
        L43:
            r8 = 16842801(0x1010031, float:2.3693695E-38)
        L46:
            r0 = r8
            r8 = -1
        L48:
            r3 = 1
            goto L4d
        L4a:
            r8 = -1
            r0 = 0
            r3 = 0
        L4d:
            if (r3 == 0) goto L6e
            int[] r3 = defpackage.in0.f2623a
            android.graphics.drawable.Drawable r9 = r9.mutate()
            int r7 = defpackage.h83.c(r7, r0)
            java.lang.Class<nd> r0 = defpackage.nd.class
            monitor-enter(r0)
            android.graphics.PorterDuffColorFilter r7 = h(r7, r2)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r0)
            r9.setColorFilter(r7)
            if (r8 == r5) goto L69
            r9.setAlpha(r8)
        L69:
            r7 = 1
            goto L6f
        L6b:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L6e:
            r7 = 0
        L6f:
            if (r7 == 0) goto L72
            r1 = 1
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bk2.m(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
