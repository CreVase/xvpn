package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.security.xvpn.z35kb.widget.QuickConnAddItemView;
import com.security.xvpn.z35kb.widget.Toolbar;

/* loaded from: classes2.dex */
public final class l5 implements nk3 {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f3063a;

    /* renamed from: b, reason: collision with root package name */
    public final View f3064b;
    public final View c;
    public final View d;
    public final QuickConnAddItemView e;
    public final QuickConnAddItemView f;
    public final LinearLayout g;
    public final QuickConnAddItemView h;
    public final SwitchCompat i;
    public final Toolbar j;
    public final TextView k;
    public final TextView l;
    public final TextView m;

    public l5(LinearLayout linearLayout, View view, View view2, View view3, QuickConnAddItemView quickConnAddItemView, QuickConnAddItemView quickConnAddItemView2, LinearLayout linearLayout2, QuickConnAddItemView quickConnAddItemView3, SwitchCompat switchCompat, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3) {
        this.f3063a = linearLayout;
        this.f3064b = view;
        this.c = view2;
        this.d = view3;
        this.e = quickConnAddItemView;
        this.f = quickConnAddItemView2;
        this.g = linearLayout2;
        this.h = quickConnAddItemView3;
        this.i = switchCompat;
        this.j = toolbar;
        this.k = textView;
        this.l = textView2;
        this.m = textView3;
    }

    @Override // defpackage.nk3
    public final View getRoot() {
        return this.f3063a;
    }
}
