package defpackage;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class z63 {
    public static final Pattern d = Pattern.compile("\\s+");
    public static final ob1 e = ob1.k(2, "auto", DevicePublicKeyStringDef.NONE);
    public static final ob1 f = ob1.n("dot", "sesame", "circle");
    public static final ob1 g = ob1.k(2, "filled", MRAIDPresenter.OPEN);
    public static final ob1 h = ob1.n("after", "before", "outside");

    /* renamed from: a, reason: collision with root package name */
    public final int f5436a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5437b;
    public final int c;

    public z63(int i, int i2, int i3) {
        this.f5436a = i;
        this.f5437b = i2;
        this.c = i3;
    }
}
