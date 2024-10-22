package defpackage;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class fc0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f2071a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f2072b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final ec0 j;

    public fc0() {
        ec0 ec0Var;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        if (wi3.f5017a >= 24) {
            ec0Var = new ec0(cryptoInfo);
        } else {
            ec0Var = null;
        }
        this.j = ec0Var;
    }
}
