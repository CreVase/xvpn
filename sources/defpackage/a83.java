package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class a83 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f40a = new ArrayList();

    public final void a(z73 z73Var) {
        synchronized (this.f40a) {
            this.f40a.add(z73Var);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void b(boolean z) {
        int size;
        boolean z2;
        ArrayList arrayList = this.f40a;
        if (arrayList.isEmpty() || arrayList.size() - 1 < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            z73 z73Var = (z73) arrayList.get(size);
            Object obj = z73Var.c.get();
            if (obj == null) {
                z2 = false;
            } else {
                boolean z3 = obj instanceof View;
                if (!z3 || ((View) obj).getParent() != null || !z73Var.d) {
                    ColorStateList colorStateList = null;
                    int i2 = z73Var.f5440a;
                    int i3 = z73Var.f5441b;
                    switch (i2) {
                        case 0:
                            if (obj instanceof ke1) {
                                ((ke1) obj).a();
                                break;
                            } else if (z3) {
                                ((View) obj).invalidate();
                                break;
                            }
                            break;
                        case 1:
                            if (z3) {
                                ((View) obj).setBackgroundColor(v73.j(i3));
                                break;
                            }
                            break;
                        case 2:
                            if (obj instanceof TextView) {
                                ((TextView) obj).setTextColor(v73.j(i3));
                                break;
                            }
                            break;
                        case 3:
                            if (obj instanceof TextView) {
                                ((TextView) obj).setHintTextColor(v73.j(i3));
                                break;
                            }
                            break;
                        case 4:
                            if (obj instanceof TextView) {
                                ((TextView) obj).setHighlightColor(v73.j(i3));
                                break;
                            }
                            break;
                        case 5:
                            if (obj instanceof Paint) {
                                ((Paint) obj).setColor(v73.j(i3));
                                break;
                            }
                            break;
                        case 6:
                            if (obj instanceof TextView) {
                                ((TextView) obj).setLinkTextColor(v73.j(i3));
                                break;
                            }
                            break;
                        case 7:
                            if (z3) {
                                ((ColorDrawable) ((FrameLayout) obj).getForeground()).setColor(v73.j(i3));
                                break;
                            }
                            break;
                        case 8:
                        case 10:
                            if (obj instanceof ImageView) {
                                if (z || v73.l() || i2 != 10) {
                                    colorStateList = ColorStateList.valueOf(v73.j(i3));
                                }
                                pe0.Q((ImageView) obj, colorStateList);
                                break;
                            } else if (obj instanceof Drawable) {
                                if (z || v73.l() || i2 != 10) {
                                    colorStateList = ColorStateList.valueOf(v73.j(i3));
                                }
                                bn0.h((Drawable) obj, colorStateList);
                                break;
                            }
                            break;
                        case 9:
                        case 11:
                            if (z3) {
                                if (z || v73.l() || i2 != 11) {
                                    colorStateList = ColorStateList.valueOf(v73.j(i3));
                                }
                                ll3.r((View) obj, colorStateList);
                                break;
                            }
                            break;
                        case 12:
                            if (obj instanceof CardView) {
                                ((CardView) obj).setCardBackgroundColor(v73.j(i3));
                                break;
                            }
                            break;
                    }
                }
                z2 = true;
            }
            if (!z2) {
                arrayList.remove(size);
            }
            if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:            if (r6 != false) goto L20;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.view.View r8) {
        /*
            r7 = this;
            java.util.ArrayList r0 = r7.f40a
            monitor-enter(r0)
            java.util.ArrayList r1 = r7.f40a     // Catch: java.lang.Throwable -> L4e
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4e
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L4c
            java.util.ArrayList r1 = r7.f40a     // Catch: java.lang.Throwable -> L4e
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L4e
            int r1 = r1 + (-1)
            if (r1 < 0) goto L4c
        L17:
            int r3 = r1 + (-1)
            java.util.ArrayList r4 = r7.f40a     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L4e
            z73 r4 = (defpackage.z73) r4     // Catch: java.lang.Throwable -> L4e
            java.lang.ref.WeakReference r5 = r4.c     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L4e
            r6 = 0
            if (r5 != 0) goto L2c
            r5 = 1
            goto L2d
        L2c:
            r5 = 0
        L2d:
            if (r5 != 0) goto L42
            java.lang.ref.WeakReference r4 = r4.c     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L4e
            if (r8 == 0) goto L40
            if (r4 == 0) goto L40
            boolean r4 = defpackage.m20.L(r8, r4)     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L40
            r6 = 1
        L40:
            if (r6 == 0) goto L47
        L42:
            java.util.ArrayList r4 = r7.f40a     // Catch: java.lang.Throwable -> L4e
            r4.remove(r1)     // Catch: java.lang.Throwable -> L4e
        L47:
            if (r3 >= 0) goto L4a
            goto L4c
        L4a:
            r1 = r3
            goto L17
        L4c:
            monitor-exit(r0)
            return
        L4e:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a83.c(android.view.View):void");
    }
}
