package com.security.xvpn.z35kb.livechat;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.livechat.ImageShowActivity;
import defpackage.bx3;
import defpackage.ic;
import defpackage.m20;
import defpackage.qm1;
import defpackage.x30;
import defpackage.xa1;
import java.io.File;
import java.net.URLEncoder;

/* loaded from: classes2.dex */
public class ImageShowActivity extends ic {
    public static final /* synthetic */ int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public x30 f1603a;

    /* renamed from: b, reason: collision with root package name */
    public String f1604b;
    public qm1 c;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    @Override // androidx.fragment.app.l, androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    public final void onCreate(Bundle bundle) {
        File file;
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(4);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        getWindow().addFlags(UserVerificationMethods.USER_VERIFY_ALL);
        getWindow().addFlags(134217728);
        final int i = 0;
        View inflate = getLayoutInflater().inflate(R.layout.image_show_activity, (ViewGroup) null, false);
        int i2 = R.id.image_view;
        SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) m20.g0(inflate, R.id.image_view);
        if (subsamplingScaleImageView != null) {
            i2 = R.id.iv_close;
            AppCompatImageView appCompatImageView = (AppCompatImageView) m20.g0(inflate, R.id.iv_close);
            if (appCompatImageView != null) {
                i2 = R.id.status_bar_mask;
                Space space = (Space) m20.g0(inflate, R.id.status_bar_mask);
                if (space != null) {
                    x30 x30Var = new x30((ConstraintLayout) inflate, subsamplingScaleImageView, appCompatImageView, space, 2);
                    this.f1603a = x30Var;
                    setContentView(x30Var.c());
                    String stringExtra = getIntent().getStringExtra(ImagesContract.URL);
                    this.f1604b = stringExtra;
                    if (TextUtils.isEmpty(stringExtra)) {
                        onBackPressed();
                        return;
                    }
                    ((Space) this.f1603a.e).getLayoutParams().height = bx3.A(this);
                    ((AppCompatImageView) this.f1603a.d).setOnClickListener(new View.OnClickListener(this) { // from class: va1

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ ImageShowActivity f4803b;

                        {
                            this.f4803b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i3 = i;
                            ImageShowActivity imageShowActivity = this.f4803b;
                            switch (i3) {
                                case 0:
                                    int i4 = ImageShowActivity.d;
                                    imageShowActivity.onBackPressed();
                                    return;
                                default:
                                    int i5 = ImageShowActivity.d;
                                    imageShowActivity.onBackPressed();
                                    return;
                            }
                        }
                    });
                    final int i3 = 1;
                    ((SubsamplingScaleImageView) this.f1603a.c).setOnClickListener(new View.OnClickListener(this) { // from class: va1

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ ImageShowActivity f4803b;

                        {
                            this.f4803b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i32 = i3;
                            ImageShowActivity imageShowActivity = this.f4803b;
                            switch (i32) {
                                case 0:
                                    int i4 = ImageShowActivity.d;
                                    imageShowActivity.onBackPressed();
                                    return;
                                default:
                                    int i5 = ImageShowActivity.d;
                                    imageShowActivity.onBackPressed();
                                    return;
                            }
                        }
                    });
                    if (this.f1604b.startsWith("/")) {
                        file = new File(this.f1604b);
                    } else {
                        file = new File(new File(getExternalCacheDir(), "livechat/image").getAbsolutePath(), URLEncoder.encode(this.f1604b));
                    }
                    ((SubsamplingScaleImageView) this.f1603a.c).setOnImageEventListener(new xa1(this, file));
                    qm1 qm1Var = this.c;
                    if (qm1Var == null || !qm1Var.isShowing()) {
                        qm1 qm1Var2 = new qm1(this);
                        this.c = qm1Var2;
                        qm1Var2.setCancelable(true);
                        this.c.show();
                    }
                    ((SubsamplingScaleImageView) this.f1603a.c).setImage(ImageSource.uri(file.getAbsolutePath()));
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
