package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ze {
    public void a(StaticLayout.Builder builder, TextView textView) {
    }

    public boolean b(TextView textView) {
        Object obj = Boolean.FALSE;
        try {
            obj = af.d("getHorizontallyScrolling").invoke(textView, new Object[0]);
        } catch (Exception unused) {
        }
        return ((Boolean) obj).booleanValue();
    }
}
