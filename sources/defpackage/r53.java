package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import android.widget.Toast;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.browser.PrivateBrowserActivity;

/* loaded from: classes2.dex */
public final class r53 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public long f4102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s53 f4103b;
    public final /* synthetic */ o11 c;

    public r53(s53 s53Var, o11 o11Var) {
        this.f4103b = s53Var;
        this.c = o11Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        s53 s53Var = this.f4103b;
        if (s53Var.m || elapsedRealtime - this.f4102a < 500) {
            return;
        }
        this.f4102a = elapsedRealtime;
        s53Var.f.getClass();
        if (br.d.size() >= 20) {
            Toast.makeText(s53Var.requireContext(), pd0.y(R.string.BrowserMaxTabsReached), 0).show();
            return;
        }
        o11 o11Var = this.c;
        o11Var.g.setVisibility(8);
        br.h = false;
        o11Var.c.setEnabled(!s53Var.g.isEmpty());
        v31 v31Var = s53Var.n;
        if (v31Var != null) {
            v31Var.invoke();
        }
        s53Var.requireActivity().finish();
        Context requireContext = s53Var.requireContext();
        Intent intent = new Intent(requireContext, (Class<?>) PrivateBrowserActivity.class);
        intent.putExtra("newTab", true);
        requireContext.startActivity(intent);
        s53Var.requireActivity().overridePendingTransition(R.anim.none, R.anim.none);
    }
}
