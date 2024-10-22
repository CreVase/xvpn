package defpackage;

import android.content.Intent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.television.HomeActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class dx2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1858b;

    public /* synthetic */ dx2(View view, int i) {
        this.f1857a = i;
        this.f1858b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1857a;
        View view = this.f1858b;
        switch (i) {
            case 0:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 1:
                int i2 = ki1.w;
                Intent intent = new Intent(view.getContext(), (Class<?>) MainActivity.class);
                intent.setFlags(335577088);
                view.getContext().startActivity(intent);
                return;
            default:
                Intent intent2 = new Intent(view.getContext(), (Class<?>) HomeActivity.class);
                intent2.setFlags(335577088);
                view.getContext().startActivity(intent2);
                return;
        }
    }
}
