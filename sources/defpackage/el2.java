package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;

/* loaded from: classes2.dex */
public abstract class el2 {
    public static /* synthetic */ Drawable a(Context context, int i) {
        return b(context, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Drawable b(Context context, int i) {
        ColorStateList colorStateList;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setShape(1);
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable, i, i, i, i);
        int i2 = he2.colorControlHighlight;
        ColorStateList valueOf = ColorStateList.valueOf(0);
        TypedValue J = cp3.J(context, i2);
        if (J != null) {
            int i3 = J.resourceId;
            if (i3 != 0) {
                colorStateList = x80.getColorStateList(context, i3);
            } else {
                colorStateList = ColorStateList.valueOf(J.data);
            }
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            valueOf = colorStateList;
        }
        return new RippleDrawable(valueOf, null, insetDrawable);
    }
}
