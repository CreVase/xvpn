package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.security.xvpn.z35kb.XTextViewNew;

/* loaded from: classes2.dex */
public abstract class g6 extends tl3 {
    public static final /* synthetic */ int A = 0;
    public final AppCompatImageView o;
    public final FrameLayout p;
    public final EditText q;
    public final EditText r;
    public final LinearLayout s;
    public final Button t;
    public final XTextViewNew u;
    public final XTextViewNew v;
    public final TextView w;
    public final LinearLayout x;
    public String y;
    public String z;

    public g6(View view, AppCompatImageView appCompatImageView, FrameLayout frameLayout, EditText editText, EditText editText2, LinearLayout linearLayout, Button button, XTextViewNew xTextViewNew, XTextViewNew xTextViewNew2, TextView textView, LinearLayout linearLayout2) {
        super(null, view, 0);
        this.o = appCompatImageView;
        this.p = frameLayout;
        this.q = editText;
        this.r = editText2;
        this.s = linearLayout;
        this.t = button;
        this.u = xTextViewNew;
        this.v = xTextViewNew2;
        this.w = textView;
        this.x = linearLayout2;
    }

    public abstract void o(String str);

    public abstract void p(String str);
}
