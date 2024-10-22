package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;

/* loaded from: classes2.dex */
public final /* synthetic */ class c82 implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f599b;

    public /* synthetic */ c82(Context context, int i) {
        this.f598a = i;
        this.f599b = context;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.f598a;
        Context context = this.f599b;
        switch (i) {
            case 0:
                Activity S = ya0.S(context);
                if (S != null) {
                    S.onBackPressed();
                    return;
                }
                return;
            case 1:
                int i2 = re3.h;
                Activity S2 = ya0.S(context);
                if (S2 != null) {
                    S2.onBackPressed();
                    return;
                }
                return;
            default:
                int i3 = f82.n;
                Activity S3 = ya0.S(context);
                if (S3 != null) {
                    S3.onBackPressed();
                    return;
                }
                return;
        }
    }
}
