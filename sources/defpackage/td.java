package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class td extends PopupWindow {
    public td(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cg2.PopupWindow, i, i2);
        int i3 = cg2.PopupWindow_overlapAnchor;
        if (obtainStyledAttributes.hasValue(i3)) {
            tf3.s0(this, obtainStyledAttributes.getBoolean(i3, false));
        }
        int i4 = cg2.PopupWindow_android_popupBackground;
        if (obtainStyledAttributes.hasValue(i4) && (resourceId = obtainStyledAttributes.getResourceId(i4, 0)) != 0) {
            drawable = ew3.P0(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(i4);
        }
        setBackgroundDrawable(drawable);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2) {
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
    }
}
