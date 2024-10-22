package defpackage;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.security.xvpn.z35kb.livechat.ImageShowActivity;
import java.io.File;

/* loaded from: classes2.dex */
public final class xa1 extends SubsamplingScaleImageView.DefaultOnImageEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f5133a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageShowActivity f5134b;

    public xa1(ImageShowActivity imageShowActivity, File file) {
        this.f5134b = imageShowActivity;
        this.f5133a = file;
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.DefaultOnImageEventListener, com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public final void onImageLoadError(Exception exc) {
        ImageShowActivity imageShowActivity = this.f5134b;
        qm1 qm1Var = imageShowActivity.c;
        if (qm1Var != null) {
            qm1Var.dismiss();
            imageShowActivity.c = null;
        }
        t9.w0(imageShowActivity.getSupportFragmentManager(), new ew(1, this, this.f5133a));
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.DefaultOnImageEventListener, com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public final void onImageLoaded() {
        ImageShowActivity imageShowActivity = this.f5134b;
        qm1 qm1Var = imageShowActivity.c;
        if (qm1Var != null) {
            qm1Var.dismiss();
            imageShowActivity.c = null;
        }
    }
}
