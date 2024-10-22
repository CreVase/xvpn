package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class t43 implements f10 {
    public final z43 a(Looper looper, Handler.Callback callback) {
        return new z43(new Handler(looper, callback));
    }
}
