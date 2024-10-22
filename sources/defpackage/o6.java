package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.security.xvpn.z35kb.widget.Toolbar;

/* loaded from: classes2.dex */
public final class o6 implements nk3 {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f3608a;

    /* renamed from: b, reason: collision with root package name */
    public final Button f3609b;
    public final EditText c;
    public final ImageView d;
    public final Toolbar e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public final LinearLayout l;
    public final LinearLayout m;
    public final LinearLayout n;

    public o6(LinearLayout linearLayout, Button button, EditText editText, ImageView imageView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4) {
        this.f3608a = linearLayout;
        this.f3609b = button;
        this.c = editText;
        this.d = imageView;
        this.e = toolbar;
        this.f = textView;
        this.g = textView2;
        this.h = textView3;
        this.i = textView4;
        this.j = textView5;
        this.k = textView6;
        this.l = linearLayout2;
        this.m = linearLayout3;
        this.n = linearLayout4;
    }

    @Override // defpackage.nk3
    public final View getRoot() {
        return this.f3608a;
    }
}
