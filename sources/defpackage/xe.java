package defpackage;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* loaded from: classes.dex */
public class xe extends ze {
    @Override // defpackage.ze
    public void a(StaticLayout.Builder builder, TextView textView) {
        Object obj = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        try {
            obj = af.d("getTextDirectionHeuristic").invoke(textView, new Object[0]);
        } catch (Exception unused) {
        }
        builder.setTextDirection((TextDirectionHeuristic) obj);
    }
}
