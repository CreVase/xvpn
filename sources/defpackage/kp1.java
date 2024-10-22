package defpackage;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class kp1 {

    /* renamed from: b, reason: collision with root package name */
    public static final gp1 f2992b = new gp1();

    /* renamed from: a, reason: collision with root package name */
    public final wv1 f2993a;

    public kp1() {
        wv1 wv1Var;
        wv1[] wv1VarArr = new wv1[2];
        wv1VarArr[0] = f51.f2043a;
        try {
            wv1Var = (wv1) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            wv1Var = f2992b;
        }
        wv1VarArr[1] = wv1Var;
        ip1 ip1Var = new ip1(wv1VarArr);
        Charset charset = yd1.f5317a;
        this.f2993a = ip1Var;
    }
}
