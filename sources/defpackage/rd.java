package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.io.File;

/* loaded from: classes.dex */
public final class rd {

    /* renamed from: a, reason: collision with root package name */
    public int f4132a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4133b;
    public final q9 c;
    public Object d;
    public Object e;

    public rd(ImageView imageView) {
        this.f4132a = 0;
        this.f4133b = imageView;
    }

    public static void b(String str) {
        if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception unused) {
            }
        }
    }

    public final void a() {
        boolean z;
        Drawable drawable = ((ImageView) this.f4133b).getDrawable();
        if (drawable != null) {
            in0.a(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z2 = true;
            Object obj = this.c;
            if (i <= 21 ? i == 21 : ((j93) obj) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (((j93) this.e) == null) {
                    this.e = new j93(0);
                }
                j93 j93Var = (j93) this.e;
                j93Var.d = null;
                j93Var.c = false;
                j93Var.e = null;
                j93Var.f2730b = false;
                ColorStateList a2 = ya1.a((ImageView) this.f4133b);
                if (a2 != null) {
                    j93Var.c = true;
                    j93Var.d = a2;
                }
                PorterDuff.Mode b2 = ya1.b((ImageView) this.f4133b);
                if (b2 != null) {
                    j93Var.f2730b = true;
                    j93Var.e = b2;
                }
                if (!j93Var.c && !j93Var.f2730b) {
                    z2 = false;
                } else {
                    nd.e(drawable, j93Var, ((ImageView) this.f4133b).getDrawableState());
                }
                if (z2) {
                    return;
                }
            }
            j93 j93Var2 = (j93) this.d;
            if (j93Var2 != null) {
                nd.e(drawable, j93Var2, ((ImageView) this.f4133b).getDrawableState());
                return;
            }
            j93 j93Var3 = (j93) obj;
            if (j93Var3 != null) {
                nd.e(drawable, j93Var3, ((ImageView) this.f4133b).getDrawableState());
            }
        }
    }

    public final void c(AttributeSet attributeSet, int i) {
        Drawable drawable;
        int i2;
        Context context = ((ImageView) this.f4133b).getContext();
        int[] iArr = cg2.AppCompatImageView;
        go2 m = go2.m(context, attributeSet, iArr, i);
        ImageView imageView = (ImageView) this.f4133b;
        ll3.o(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) m.f2294b, i);
        try {
            Drawable drawable2 = ((ImageView) this.f4133b).getDrawable();
            if (drawable2 == null && (i2 = m.i(cg2.AppCompatImageView_srcCompat, -1)) != -1 && (drawable2 = ew3.P0(((ImageView) this.f4133b).getContext(), i2)) != null) {
                ((ImageView) this.f4133b).setImageDrawable(drawable2);
            }
            if (drawable2 != null) {
                in0.a(drawable2);
            }
            int i3 = cg2.AppCompatImageView_tint;
            if (m.l(i3)) {
                pe0.Q((ImageView) this.f4133b, m.b(i3));
            }
            int i4 = cg2.AppCompatImageView_tintMode;
            if (m.l(i4)) {
                ImageView imageView2 = (ImageView) this.f4133b;
                PorterDuff.Mode c = in0.c(m.h(i4, -1), null);
                int i5 = Build.VERSION.SDK_INT;
                ya1.d(imageView2, c);
                if (i5 == 21 && (drawable = imageView2.getDrawable()) != null && ya1.a(imageView2) != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView2.getDrawableState());
                    }
                    imageView2.setImageDrawable(drawable);
                }
            }
        } finally {
            m.o();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0182 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x007a A[EDGE_INSN: B:90:0x007a->B:79:0x007a BREAK  A[LOOP:4: B:58:0x0022->B:80:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.j31 r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd.d(j31, int, int):void");
    }

    public final void e(int i) {
        if (i != 0) {
            Drawable P0 = ew3.P0(((ImageView) this.f4133b).getContext(), i);
            if (P0 != null) {
                in0.a(P0);
            }
            ((ImageView) this.f4133b).setImageDrawable(P0);
        } else {
            ((ImageView) this.f4133b).setImageDrawable(null);
        }
        a();
    }

    public final void f(ColorStateList colorStateList) {
        if (((j93) this.d) == null) {
            this.d = new j93(0);
        }
        j93 j93Var = (j93) this.d;
        j93Var.d = colorStateList;
        j93Var.c = true;
        a();
    }

    public final void g(PorterDuff.Mode mode) {
        if (((j93) this.d) == null) {
            this.d = new j93(0);
        }
        j93 j93Var = (j93) this.d;
        j93Var.e = mode;
        j93Var.f2730b = true;
        a();
    }

    public final void h(j31 j31Var) {
        j31Var.d("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        j31Var.d("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) this.d) + "')");
    }

    public rd(fe0 fe0Var, q9 q9Var) {
        this.f4132a = q9Var.f3969a;
        this.f4133b = fe0Var;
        this.c = q9Var;
        this.d = "c103703e120ae8cc73c9248622f3cd1e";
        this.e = "49f946663a8deb7054212b8adda248c6";
    }
}
