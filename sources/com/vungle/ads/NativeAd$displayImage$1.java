package com.vungle.ads;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.vungle.ads.internal.util.ThreadUtil;
import defpackage.ch3;
import defpackage.ji1;
import defpackage.x31;

/* loaded from: classes2.dex */
public final class NativeAd$displayImage$1 extends ji1 implements x31 {
    final /* synthetic */ ImageView $imageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAd$displayImage$1(ImageView imageView) {
        super(1);
        this.$imageView = imageView;
    }

    @Override // defpackage.x31
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Bitmap) obj);
        return ch3.f636a;
    }

    public final void invoke(Bitmap bitmap) {
        ImageView imageView = this.$imageView;
        if (imageView != null) {
            ThreadUtil.INSTANCE.runOnUiThread(new a(0, imageView, bitmap));
        }
    }
}
