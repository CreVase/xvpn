package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.NativeAd;

/* loaded from: classes.dex */
public final class jv0 extends NativeAd.Image {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f2838a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f2839b;

    public jv0(Uri uri) {
        this.f2839b = uri;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.f2838a;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return 1.0d;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.f2839b;
    }

    public jv0(Drawable drawable) {
        this.f2838a = drawable;
    }
}
