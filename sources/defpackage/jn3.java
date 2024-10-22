package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class jn3 extends d70 {
    public boolean h;
    public boolean i;

    @Override // defpackage.d70
    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // defpackage.d70
    public void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, vf2.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == vf2.ConstraintLayout_Layout_android_visibility) {
                    this.h = true;
                } else if (index == vf2.ConstraintLayout_Layout_android_elevation) {
                    this.i = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void l(hz0 hz0Var, int i, int i2);

    @Override // defpackage.d70, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h || this.i) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f1742b; i++) {
                    View view = (View) constraintLayout.f185a.get(this.f1741a[i]);
                    if (view != null) {
                        if (this.h) {
                            view.setVisibility(visibility);
                        }
                        if (this.i && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        d();
    }
}
