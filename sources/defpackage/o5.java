package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.security.xvpn.z35kb.XTextViewNew;
import com.security.xvpn.z35kb.widget.XButton;
import com.security.xvpn.z35kb.widget.XEditText;

/* loaded from: classes2.dex */
public abstract class o5 extends tl3 {
    public static final /* synthetic */ int H = 0;
    public final XTextViewNew A;
    public final XTextViewNew B;
    public Boolean C;
    public String D;
    public String E;
    public String F;
    public boolean G;
    public final AppCompatImageView o;
    public final XButton p;
    public final FrameLayout q;
    public final XEditText r;
    public final XEditText s;
    public final XEditText t;
    public final LinearLayout u;
    public final XButton v;
    public final LinearLayout w;
    public final TextView x;
    public final XTextViewNew y;
    public final XTextViewNew z;

    public o5(View view, AppCompatImageView appCompatImageView, XButton xButton, FrameLayout frameLayout, XEditText xEditText, XEditText xEditText2, XEditText xEditText3, LinearLayout linearLayout, XButton xButton2, LinearLayout linearLayout2, TextView textView, XTextViewNew xTextViewNew, XTextViewNew xTextViewNew2, XTextViewNew xTextViewNew3, XTextViewNew xTextViewNew4) {
        super(null, view, 0);
        this.o = appCompatImageView;
        this.p = xButton;
        this.q = frameLayout;
        this.r = xEditText;
        this.s = xEditText2;
        this.t = xEditText3;
        this.u = linearLayout;
        this.v = xButton2;
        this.w = linearLayout2;
        this.x = textView;
        this.y = xTextViewNew;
        this.z = xTextViewNew2;
        this.A = xTextViewNew3;
        this.B = xTextViewNew4;
    }

    public abstract void o(String str);

    public abstract void p(String str);

    public abstract void q(String str);
}
