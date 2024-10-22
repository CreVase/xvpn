package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XTextViewNew;
import com.security.xvpn.z35kb.widget.LoadingView;

/* loaded from: classes2.dex */
public final class kg2 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ rn g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kg2(rn rnVar, int i) {
        super(0);
        this.f = i;
        this.g = rnVar;
    }

    public final nk3 b() {
        int i = this.f;
        rn rnVar = this.g;
        switch (i) {
            case 0:
                View inflate = rnVar.getLayoutInflater().inflate(R.layout.dialog_rating_amazon, (ViewGroup) null, false);
                int i2 = R.id.iv_close;
                ImageView imageView = (ImageView) m20.g0(inflate, R.id.iv_close);
                if (imageView != null) {
                    i2 = R.id.iv_rating;
                    ImageView imageView2 = (ImageView) m20.g0(inflate, R.id.iv_rating);
                    if (imageView2 != null) {
                        i2 = R.id.tv_content;
                        XTextViewNew xTextViewNew = (XTextViewNew) m20.g0(inflate, R.id.tv_content);
                        if (xTextViewNew != null) {
                            return new kl0((FrameLayout) inflate, imageView, imageView2, xTextViewNew);
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            default:
                View inflate2 = rnVar.getLayoutInflater().inflate(R.layout.dialog_support_loading, (ViewGroup) null, false);
                int i3 = R.id.ivLoadingView;
                if (((LoadingView) m20.g0(inflate2, R.id.ivLoadingView)) != null) {
                    i3 = R.id.llContainer;
                    RelativeLayout relativeLayout = (RelativeLayout) m20.g0(inflate2, R.id.llContainer);
                    if (relativeLayout != null) {
                        i3 = R.id.tvContent;
                        XTextViewNew xTextViewNew2 = (XTextViewNew) m20.g0(inflate2, R.id.tvContent);
                        if (xTextViewNew2 != null) {
                            return new ll0((FrameLayout) inflate2, relativeLayout, xTextViewNew2);
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
        }
    }

    @Override // defpackage.v31
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f) {
            case 0:
                return b();
            default:
                return b();
        }
    }
}
