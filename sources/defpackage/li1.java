package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XTextViewNew;
import com.security.xvpn.z35kb.widget.XRoundCornerImageView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class li1 extends fh2 {
    public final /* synthetic */ int d;
    public final Object e;
    public Object f;
    public Object g;

    public /* synthetic */ li1(int i, Object obj, Serializable serializable, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = serializable;
        this.g = obj2;
    }

    @Override // defpackage.fh2
    public final int c() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                return ((sb2[]) this.f).length;
            case 1:
                return ((List) this.f).size();
            case 2:
                List list = (List) this.g;
                if (list != null) {
                    return list.size();
                }
                return 0;
            case 3:
                return ((List) obj).size();
            default:
                return ((List) obj).size();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013b A[Catch: Exception -> 0x0142, TRY_LEAVE, TryCatch #2 {Exception -> 0x0142, blocks: (B:35:0x00e2, B:37:0x00ec, B:39:0x00f3, B:40:0x00f7, B:42:0x00fb, B:47:0x013b, B:49:0x0108, B:53:0x0115, B:57:0x0122, B:61:0x012b), top: B:34:0x00e2 }] */
    @Override // defpackage.fh2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(androidx.recyclerview.widget.h r12, int r13) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.li1.n(androidx.recyclerview.widget.h, int):void");
    }

    @Override // defpackage.fh2
    public final h s(RecyclerView recyclerView, int i) {
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                View inflate = LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.item_language, (ViewGroup) recyclerView, false);
                int i3 = R.id.iv_selected;
                ImageView imageView = (ImageView) m20.g0(inflate, R.id.iv_selected);
                if (imageView != null) {
                    i3 = R.id.tv_language;
                    TextView textView = (TextView) m20.g0(inflate, R.id.tv_language);
                    if (textView != null) {
                        return new ki1(this, new se1((ConstraintLayout) inflate, imageView, textView), (dn) obj);
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
            case 1:
                dn dnVar = (dn) obj;
                View inflate2 = dnVar.getLayoutInflater().inflate(R.layout.item_app_layout, (ViewGroup) recyclerView, false);
                int i4 = R.id.ivAction;
                ImageView imageView2 = (ImageView) m20.g0(inflate2, R.id.ivAction);
                if (imageView2 != null) {
                    i4 = R.id.ivIcon;
                    XRoundCornerImageView xRoundCornerImageView = (XRoundCornerImageView) m20.g0(inflate2, R.id.ivIcon);
                    if (xRoundCornerImageView != null) {
                        i4 = R.id.tvName;
                        XTextViewNew xTextViewNew = (XTextViewNew) m20.g0(inflate2, R.id.tvName);
                        if (xTextViewNew != null) {
                            return new h2(new x30((LinearLayout) inflate2, imageView2, xRoundCornerImageView, xTextViewNew, 3), dnVar);
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i4)));
            case 2:
                int i5 = u53.B;
                v53 v53Var = (v53) ((v31) this.f).invoke();
                return new u53(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.item_browser_tab_index, (ViewGroup) recyclerView, false), (p53) obj, v53Var);
            case 3:
                LayoutInflater from = LayoutInflater.from(recyclerView.getContext());
                int i6 = qe1.u;
                DataBinderMapperImpl dataBinderMapperImpl = md0.f3279a;
                return new eq((qe1) tl3.i(from, R.layout.item_choose_bind_subscribe, recyclerView, null), (f83) this.g);
            default:
                return new db2(new ye3(recyclerView.getContext()));
        }
    }

    public li1(ArrayList arrayList) {
        this.d = 4;
        this.e = arrayList;
        this.g = ew3.H();
    }

    public li1(dn dnVar) {
        this.d = 0;
        this.e = dnVar;
        this.f = ew3.t();
        this.g = ew3.P();
    }

    public li1(p53 p53Var, yy2 yy2Var) {
        this.d = 2;
        this.e = p53Var;
        this.f = yy2Var;
    }
}
