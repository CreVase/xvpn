package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class hl3 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static h80 b(View view, h80 h80Var) {
        ContentInfo s = h80Var.f2381a.s();
        Objects.requireNonNull(s);
        ContentInfo o = vq.o(s);
        ContentInfo performReceiveContent = view.performReceiveContent(o);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == o) {
            return h80Var;
        }
        return new h80(new ja1(performReceiveContent));
    }

    public static void c(View view, String[] strArr, z22 z22Var) {
        if (z22Var == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new il3(z22Var));
        }
    }
}
