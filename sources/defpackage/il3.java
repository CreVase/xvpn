package defpackage;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class il3 implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final z22 f2620a;

    public il3(z22 z22Var) {
        this.f2620a = z22Var;
    }

    @Override // android.view.OnReceiveContentListener
    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        h80 h80Var = new h80(new ja1(contentInfo));
        h80 a2 = ((t73) this.f2620a).a(view, h80Var);
        if (a2 == null) {
            return null;
        }
        if (a2 == h80Var) {
            return contentInfo;
        }
        ContentInfo s = a2.f2381a.s();
        Objects.requireNonNull(s);
        return vq.o(s);
    }
}
