package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class u80 {
    public static String a(Context context) {
        return context.getAttributionTag();
    }

    public static Display b(Context context) {
        try {
            return context.getDisplay();
        } catch (UnsupportedOperationException unused) {
            Objects.toString(context);
            return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
        }
    }
}
