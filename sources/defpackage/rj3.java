package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class rj3 extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f4164a;

    /* renamed from: b, reason: collision with root package name */
    public qj3 f4165b;
    public ColorStateList c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public int i;
    public boolean j;
    public boolean k;
    public Paint l;

    public rj3(rj3 rj3Var) {
        this.c = null;
        this.d = tj3.j;
        if (rj3Var != null) {
            this.f4164a = rj3Var.f4164a;
            qj3 qj3Var = new qj3(rj3Var.f4165b);
            this.f4165b = qj3Var;
            if (rj3Var.f4165b.e != null) {
                qj3Var.e = new Paint(rj3Var.f4165b.e);
            }
            if (rj3Var.f4165b.d != null) {
                this.f4165b.d = new Paint(rj3Var.f4165b.d);
            }
            this.c = rj3Var.c;
            this.d = rj3Var.d;
            this.e = rj3Var.e;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f4164a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new tj3(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new tj3(this);
    }

    public rj3() {
        this.c = null;
        this.d = tj3.j;
        this.f4165b = new qj3();
    }
}
