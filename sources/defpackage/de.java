package defpackage;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;

/* loaded from: classes.dex */
public abstract class de {
    public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (!w12.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }
}
