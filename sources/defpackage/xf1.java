package defpackage;

import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class xf1 implements u12 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5152a;

    public /* synthetic */ xf1(int i) {
        this.f5152a = i;
    }

    @Override // defpackage.jr0
    public final void a(Object obj, Object obj2) {
        switch (this.f5152a) {
            case 0:
                throw new mr0("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                v12 v12Var = (v12) obj2;
                Charset charset = na2.f;
                v12Var.a(na2.g, entry.getKey());
                v12Var.a(na2.h, entry.getValue());
                return;
            default:
                throw new mr0("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
