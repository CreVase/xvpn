package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class ph0 implements t62 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3841a;

    @Override // defpackage.t62
    public final boolean apply(Object obj) {
        switch (this.f3841a) {
            case 0:
                if (((String) obj) == null) {
                    return false;
                }
                return true;
            default:
                if (((Map.Entry) obj).getKey() == null) {
                    return false;
                }
                return true;
        }
    }
}
