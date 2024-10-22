package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class eg2 extends ConstraintLayout {
    public final dg2 q;
    public int r;
    public fr1 s;

    /* JADX WARN: Type inference failed for: r6v3, types: [dg2] */
    public eg2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(jf2.material_radial_view_group, this);
        fr1 fr1Var = new fr1();
        this.s = fr1Var;
        ri2 ri2Var = new ri2(0.5f);
        fs2 fs2Var = fr1Var.f2139a.f1978a;
        fs2Var.getClass();
        jk jkVar = new jk(fs2Var);
        jkVar.e = ri2Var;
        jkVar.f = ri2Var;
        jkVar.g = ri2Var;
        jkVar.h = ri2Var;
        fr1Var.setShapeAppearanceModel(new fs2(jkVar));
        this.s.j(ColorStateList.valueOf(-1));
        fr1 fr1Var2 = this.s;
        WeakHashMap weakHashMap = ll3.f3151a;
        uk3.q(this, fr1Var2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bg2.RadialViewGroup, i, 0);
        this.r = obtainStyledAttributes.getDimensionPixelSize(bg2.RadialViewGroup_materialCircleRadius, 0);
        this.q = new Runnable() { // from class: dg2
            @Override // java.lang.Runnable
            public final void run() {
                eg2.this.y();
            }
        };
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = ll3.f3151a;
            view.setId(vk3.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            dg2 dg2Var = this.q;
            handler.removeCallbacks(dg2Var);
            handler.post(dg2Var);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        y();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            dg2 dg2Var = this.q;
            handler.removeCallbacks(dg2Var);
            handler.post(dg2Var);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.s.j(ColorStateList.valueOf(i));
    }

    public abstract void y();
}
