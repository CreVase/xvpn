package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;

/* loaded from: classes.dex */
public abstract class dk2 {
    public static int a(Resources resources, int i, Resources.Theme theme) {
        return resources.getColor(i, theme);
    }

    public static ColorStateList b(Resources resources, int i, Resources.Theme theme) {
        return resources.getColorStateList(i, theme);
    }
}
