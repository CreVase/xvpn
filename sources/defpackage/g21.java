package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.security.xvpn.z35kb.XTextViewNew;
import com.security.xvpn.z35kb.widget.XEditText;

/* loaded from: classes2.dex */
public abstract class g21 extends tl3 {
    public static final /* synthetic */ int B = 0;
    public String A;
    public final Button o;
    public final AppCompatEditText p;
    public final XEditText q;
    public final FrameLayout r;
    public final FrameLayout s;
    public final LinearLayout t;
    public final TextView u;
    public final TextView v;
    public final XTextViewNew w;
    public final XTextViewNew x;
    public final TextView y;
    public String z;

    public g21(View view, Button button, AppCompatEditText appCompatEditText, XEditText xEditText, FrameLayout frameLayout, FrameLayout frameLayout2, LinearLayout linearLayout, TextView textView, TextView textView2, XTextViewNew xTextViewNew, XTextViewNew xTextViewNew2, TextView textView3) {
        super(null, view, 0);
        this.o = button;
        this.p = appCompatEditText;
        this.q = xEditText;
        this.r = frameLayout;
        this.s = frameLayout2;
        this.t = linearLayout;
        this.u = textView;
        this.v = textView2;
        this.w = xTextViewNew;
        this.x = xTextViewNew2;
        this.y = textView3;
    }

    public abstract void o(String str);

    public abstract void p(String str);
}
