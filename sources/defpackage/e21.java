package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public abstract class e21 extends tl3 {
    public static final /* synthetic */ int z = 0;
    public final Button o;
    public final AppCompatEditText p;
    public final EditText q;
    public final FrameLayout r;
    public final FrameLayout s;
    public final AppCompatTextView t;
    public final AppCompatTextView u;
    public final AppCompatTextView v;
    public final TextView w;
    public String x;
    public String y;

    public e21(View view, Button button, AppCompatEditText appCompatEditText, EditText editText, FrameLayout frameLayout, FrameLayout frameLayout2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, TextView textView) {
        super(null, view, 0);
        this.o = button;
        this.p = appCompatEditText;
        this.q = editText;
        this.r = frameLayout;
        this.s = frameLayout2;
        this.t = appCompatTextView;
        this.u = appCompatTextView2;
        this.v = appCompatTextView3;
        this.w = textView;
    }

    public abstract void o(String str);

    public abstract void p(String str);
}
