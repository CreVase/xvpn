package defpackage;

import android.app.Activity;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.security.xvpn.z35kb.widget.Toolbar;

/* loaded from: classes2.dex */
public final /* synthetic */ class o93 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppCompatImageView f3626b;

    public /* synthetic */ o93(AppCompatImageView appCompatImageView, int i) {
        this.f3625a = i;
        this.f3626b = appCompatImageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f3625a;
        AppCompatImageView appCompatImageView = this.f3626b;
        switch (i) {
            case 0:
                int i2 = Toolbar.j;
                Activity S = ya0.S(appCompatImageView.getContext());
                if (S != null) {
                    S.onBackPressed();
                    return;
                }
                return;
            default:
                int i3 = Toolbar.j;
                Activity S2 = ya0.S(appCompatImageView.getContext());
                if (S2 != null) {
                    S2.onBackPressed();
                    return;
                }
                return;
        }
    }
}
