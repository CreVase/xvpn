package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.security.xvpn.z35kb.XTextViewNew;
import com.security.xvpn.z35kb.widget.XButton;
import com.security.xvpn.z35kb.widget.XEditText;

/* loaded from: classes2.dex */
public abstract class t6 extends tl3 {
    public static final /* synthetic */ int C = 0;
    public String A;
    public boolean B;
    public final AppCompatImageView o;
    public final XButton p;
    public final XTextViewNew q;
    public final FrameLayout r;
    public final XEditText s;
    public final LinearLayout t;
    public final XButton u;
    public final LinearLayout v;
    public final XTextViewNew w;
    public final XTextViewNew x;
    public final XTextViewNew y;
    public final LinearLayout z;

    public t6(View view, AppCompatImageView appCompatImageView, XButton xButton, XTextViewNew xTextViewNew, FrameLayout frameLayout, XEditText xEditText, LinearLayout linearLayout, XButton xButton2, LinearLayout linearLayout2, XTextViewNew xTextViewNew2, XTextViewNew xTextViewNew3, XTextViewNew xTextViewNew4, LinearLayout linearLayout3) {
        super(null, view, 0);
        this.o = appCompatImageView;
        this.p = xButton;
        this.q = xTextViewNew;
        this.r = frameLayout;
        this.s = xEditText;
        this.t = linearLayout;
        this.u = xButton2;
        this.v = linearLayout2;
        this.w = xTextViewNew2;
        this.x = xTextViewNew3;
        this.y = xTextViewNew4;
        this.z = linearLayout3;
    }

    public abstract void o(String str);
}
