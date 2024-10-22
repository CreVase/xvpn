package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final /* synthetic */ class f60 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2047b;

    public /* synthetic */ f60(RecyclerView recyclerView, int i) {
        this.f2046a = i;
        this.f2047b = recyclerView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ic icVar;
        int i = this.f2046a;
        ViewGroup viewGroup = this.f2047b;
        switch (i) {
            case 0:
                Context context = viewGroup.getContext();
                if (context instanceof ic) {
                    icVar = (ic) context;
                } else {
                    icVar = null;
                }
                if (icVar != null) {
                    t9.w0(icVar.getSupportFragmentManager(), y62.C);
                    return;
                }
                return;
            case 1:
                Activity activity = (Activity) viewGroup.getContext();
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:support@xvpn.io"));
                activity.startActivity(Intent.createChooser(intent, "Send Email"));
                return;
            default:
                bx3.a(viewGroup.getContext());
                return;
        }
    }
}
