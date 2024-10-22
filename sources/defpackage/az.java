package defpackage;

import a.bx;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.VpnService;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.TestConsoleActivity;
import com.security.xvpn.z35kb.protocol.ProtocolSettingsActivity;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import com.security.xvpn.z35kb.television.GuideActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class az implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f365a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f366b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ az(int i, Object obj, Object obj2, Object obj3) {
        this.f365a = i;
        this.f366b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i = this.f365a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.f366b;
        switch (i) {
            case 0:
                bz bzVar = (bz) obj3;
                AppCompatTextView appCompatTextView = (AppCompatTextView) obj2;
                Context context = (Context) obj;
                if (bzVar.j) {
                    Intent intent = new Intent(appCompatTextView.getContext(), (Class<?>) TestConsoleActivity.class);
                    intent.putExtra("from", "chat");
                    appCompatTextView.getContext().startActivity(intent);
                    return;
                }
                bzVar.B("d859vpyq59fya6jbzrsgzvnz6848vxrgkfasbfk9");
                VpnService.prepare(context);
                ne0.a(bzVar);
                tt3 tt3Var = bzVar.k;
                String str2 = null;
                if (tt3Var != null) {
                    str = tt3Var.f4577a;
                } else {
                    str = null;
                }
                cz.M = str;
                bzVar.j = true;
                k13.c.g(1);
                cz.E = bzVar.k;
                tf3.v0(bzVar.f);
                tt3 tt3Var2 = bzVar.k;
                if (tt3Var2 != null) {
                    str2 = tt3Var2.c;
                }
                ew3.b(str2);
                TextView textView = bzVar.g;
                if (textView != null) {
                    textView.setText(pd0.y(R.string.CheckTestProcess));
                    return;
                }
                return;
            case 1:
                final String[] strArr = (String[]) obj3;
                final o6 o6Var = (o6) obj2;
                int i2 = ProtocolSettingsActivity.p;
                int l1 = og.l1(strArr, o6Var.j.getText().toString());
                q9 q9Var = new q9((Context) obj, 2131821095);
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: bb2
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        int i4 = ProtocolSettingsActivity.p;
                        dialogInterface.dismiss();
                        String[] strArr2 = strArr;
                        p71.x(strArr2[i3], 553);
                        o6Var.j.setText(strArr2[i3]);
                    }
                };
                j9 j9Var = (j9) q9Var.f3970b;
                j9Var.g = strArr;
                j9Var.i = onClickListener;
                j9Var.k = l1;
                j9Var.j = true;
                q9Var.l().show();
                return;
            default:
                GuideActivity guideActivity = (GuideActivity) obj3;
                AppCompatButton appCompatButton = (AppCompatButton) obj2;
                zb2 zb2Var = (zb2) obj;
                int i3 = GuideActivity.g;
                bx i4 = hx2.i(444);
                boolean q = i4.q();
                i4.h();
                if (q) {
                    m20.a1(guideActivity, d42.v);
                    return;
                }
                u3.f4616b.getClass();
                if (u3.a()) {
                    yc2.f5315b.g(oc2.f3642a);
                    return;
                }
                fv2 fv2Var = new fv2(zb2Var, 10);
                yc2.a();
                fv2Var.invoke(GoogleIABHelper.g);
                return;
        }
    }
}
