package defpackage;

/* loaded from: classes.dex */
public final class bs1 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final String f519a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f520b;
    public final zr1 c;
    public final String d;

    public bs1(int i, y01 y01Var, hs1 hs1Var, boolean z) {
        this("Decoder init failed: [" + i + "], " + y01Var, hs1Var, y01Var.l, z, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public bs1(String str, Throwable th, String str2, boolean z, zr1 zr1Var, String str3) {
        super(str, th);
        this.f519a = str2;
        this.f520b = z;
        this.c = zr1Var;
        this.d = str3;
    }
}
