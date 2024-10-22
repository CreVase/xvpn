package defpackage;

import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.google.android.gms.common.internal.ImagesContract;
import com.security.xvpn.z35kb.livechat.ImageShowActivity;
import com.security.xvpn.z35kb.livechat.a;

/* loaded from: classes.dex */
public final class m4 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3228a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3229b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m4(KeyEvent.Callback callback, Object obj, int i) {
        this.f3228a = i;
        this.c = callback;
        this.f3229b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f3228a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((h5) this.f3229b).a();
                return;
            case 1:
                w93 w93Var = (w93) obj;
                Window.Callback callback = w93Var.k;
                if (callback != null && w93Var.l) {
                    callback.onMenuItemSelected(0, (t4) this.f3229b);
                    return;
                }
                return;
            case 2:
                p71.x((String) this.f3229b, 75);
                return;
            default:
                a aVar = (a) obj;
                Intent intent = new Intent(aVar.getContext(), (Class<?>) ImageShowActivity.class);
                String str = (String) this.f3229b;
                if (str == null) {
                    str = aVar.u;
                }
                intent.putExtra(ImagesContract.URL, str);
                aVar.getContext().startActivity(intent);
                return;
        }
    }

    public m4(w93 w93Var) {
        this.f3228a = 1;
        this.c = w93Var;
        this.f3229b = new t4(w93Var.f4966a.getContext(), w93Var.h);
    }

    public m4(a aVar) {
        this.f3228a = 3;
        this.c = aVar;
    }
}
