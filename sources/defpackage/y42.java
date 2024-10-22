package defpackage;

import android.media.MediaCodec;
import java.io.IOException;

/* loaded from: classes.dex */
public final class y42 implements tr1 {

    /* renamed from: a, reason: collision with root package name */
    public int f5268a = 0;

    @Override // defpackage.tr1
    public final ur1 a(sr1 sr1Var) {
        int i;
        int i2 = wi3.f5017a;
        if (i2 >= 23 && ((i = this.f5268a) == 1 || (i == 0 && i2 >= 31))) {
            int f = vw1.f(sr1Var.c.l);
            sn1.e("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + wi3.w(f));
            return new ob2(f, false).a(sr1Var);
        }
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = c02.b(sr1Var);
            m20.N("configureCodec");
            mediaCodec.configure(sr1Var.f4401b, sr1Var.d, sr1Var.e, 0);
            m20.e0();
            m20.N("startCodec");
            mediaCodec.start();
            m20.e0();
            return new l43(mediaCodec);
        } catch (IOException | RuntimeException e) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }
}
