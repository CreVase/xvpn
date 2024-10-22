package defpackage;

import android.media.MediaCodec;
import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract /* synthetic */ class q2 {
    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern e() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern f(int i, int i2) {
        return new MediaCodec.CryptoInfo.Pattern(i, i2);
    }

    public static /* bridge */ /* synthetic */ LocaleList h(Object obj) {
        return (LocaleList) obj;
    }

    public static /* synthetic */ LocaleList j(Locale[] localeArr) {
        return new LocaleList(localeArr);
    }

    public static /* synthetic */ void p() {
    }
}
