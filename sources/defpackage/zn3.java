package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.NativeAd;

/* loaded from: classes.dex */
public final class zn3 extends NativeAd.Image {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f5519a;

    public zn3(Uri uri) {
        this.f5519a = uri;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return null;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return 1.0d;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.f5519a;
    }
}
