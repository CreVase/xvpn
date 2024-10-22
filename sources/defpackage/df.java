package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public class df {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f1767b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final uu2 h = new uu2();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f1768a = new Object[2];

    public jc a(Context context, AttributeSet attributeSet) {
        return new jc(context, attributeSet, ie2.autoCompleteTextViewStyle);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public mc c(Context context, AttributeSet attributeSet) {
        return new mc(context, attributeSet, ie2.checkboxStyle);
    }

    public wd d(Context context, AttributeSet attributeSet) {
        return new wd(context, attributeSet, ie2.radioButtonStyle);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        uu2 uu2Var = h;
        Constructor constructor = (Constructor) uu2Var.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f1767b);
            uu2Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f1768a);
    }

    public final void g(TextView textView, String str) {
        if (textView != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
