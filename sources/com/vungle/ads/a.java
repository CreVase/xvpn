package com.vungle.ads;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1642b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f1641a = i;
        this.f1642b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1641a;
        Object obj = this.c;
        Object obj2 = this.f1642b;
        switch (i) {
            case 0:
                ((ImageView) obj2).setImageBitmap((Bitmap) obj);
                return;
            case 1:
                BaseAd.m23onLoadFailure$lambda2((BaseAd) obj2, (VungleError) obj);
                return;
            case 2:
                BaseFullscreenAd$play$1.a((BaseFullscreenAd) obj2, (VungleError) obj);
                return;
            default:
                NativeAd$adPlayCallback$1.b((NativeAd) obj2, (VungleError) obj);
                return;
        }
    }
}
