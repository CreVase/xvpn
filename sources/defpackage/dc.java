package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public abstract class dc {
    /* JADX INFO: Access modifiers changed from: private */
    public static ColorStateList b(Drawable drawable) {
        ColorStateList colorStateList;
        if (y2.u(drawable)) {
            colorStateList = y2.d(drawable).getColorStateList();
            return colorStateList;
        }
        return null;
    }
}
