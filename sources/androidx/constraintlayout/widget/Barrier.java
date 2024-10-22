package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.cn;
import defpackage.d70;
import defpackage.r70;
import defpackage.vf2;

/* loaded from: classes.dex */
public class Barrier extends d70 {
    public int h;
    public int i;
    public cn j;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.j.t0;
    }

    public int getMargin() {
        return this.j.u0;
    }

    public int getType() {
        return this.h;
    }

    @Override // defpackage.d70
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.j = new cn();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, vf2.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == vf2.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == vf2.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.j.t0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == vf2.ConstraintLayout_Layout_barrierMargin) {
                    this.j.u0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.d = this.j;
        k();
    }

    @Override // defpackage.d70
    public final void i(r70 r70Var, boolean z) {
        int i = this.h;
        this.i = i;
        if (z) {
            if (i == 5) {
                this.i = 1;
            } else if (i == 6) {
                this.i = 0;
            }
        } else if (i == 5) {
            this.i = 0;
        } else if (i == 6) {
            this.i = 1;
        }
        if (r70Var instanceof cn) {
            ((cn) r70Var).s0 = this.i;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.j.t0 = z;
    }

    public void setDpMargin(int i) {
        this.j.u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.j.u0 = i;
    }

    public void setType(int i) {
        this.h = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
