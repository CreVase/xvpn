package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.widget.NavigationBarContentConstraintLayout;
import com.security.xvpn.z35kb.widget.Toolbar;
import com.security.xvpn.z35kb.widget.XEditText;

/* loaded from: classes2.dex */
public final class k5 implements nk3 {

    /* renamed from: a, reason: collision with root package name */
    public final NavigationBarContentConstraintLayout f2886a;

    /* renamed from: b, reason: collision with root package name */
    public final XEditText f2887b;
    public final RecyclerView c;
    public final SwitchCompat d;
    public final Toolbar e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final ImageView j;
    public final FrameLayout k;
    public final LinearLayout l;
    public final LinearLayout m;
    public final LinearLayout n;

    public k5(NavigationBarContentConstraintLayout navigationBarContentConstraintLayout, XEditText xEditText, RecyclerView recyclerView, SwitchCompat switchCompat, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4, ImageView imageView, FrameLayout frameLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.f2886a = navigationBarContentConstraintLayout;
        this.f2887b = xEditText;
        this.c = recyclerView;
        this.d = switchCompat;
        this.e = toolbar;
        this.f = textView;
        this.g = textView2;
        this.h = textView3;
        this.i = textView4;
        this.j = imageView;
        this.k = frameLayout;
        this.l = linearLayout;
        this.m = linearLayout2;
        this.n = linearLayout3;
    }

    @Override // defpackage.nk3
    public final View getRoot() {
        return this.f2886a;
    }
}
