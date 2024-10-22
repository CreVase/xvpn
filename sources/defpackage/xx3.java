package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class xx3 {

    /* renamed from: a, reason: collision with root package name */
    public final uy3 f5243a;

    /* renamed from: b, reason: collision with root package name */
    public final ix3 f5244b;
    public final Context c;

    public xx3(uy3 uy3Var, ix3 ix3Var, Context context) {
        new Handler(Looper.getMainLooper());
        this.f5243a = uy3Var;
        this.f5244b = ix3Var;
        this.c = context;
    }

    public static boolean a(sf sfVar, int i, lt3 lt3Var) {
        boolean z;
        byte b2 = (byte) (((byte) 1) | 2);
        if (b2 != 3) {
            StringBuilder sb = new StringBuilder();
            if ((b2 & 1) == 0) {
                sb.append(" appUpdateType");
            }
            if ((b2 & 2) == 0) {
                sb.append(" allowAssetPackDeletion");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        bz3 bz3Var = new bz3(i, false);
        if (lt3Var != null && sfVar != null) {
            if (sfVar.a(bz3Var) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && !sfVar.h) {
                sfVar.h = true;
                lt3Var.startIntentSenderForResult(sfVar.a(bz3Var).getIntentSender(), 61697, null, 0, 0, 0, null);
                return true;
            }
        }
        return false;
    }
}
