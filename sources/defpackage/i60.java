package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.security.xvpn.z35kb.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class i60 extends fh2 {
    public final /* synthetic */ int d;
    public x31 e;
    public v31 f;
    public final List g;
    public Object h;

    public i60(ArrayList arrayList) {
        this.d = 1;
        this.g = arrayList;
        this.h = "";
    }

    @Override // defpackage.fh2
    public final int c() {
        int i = this.d;
        List list = this.g;
        switch (i) {
            case 0:
                return list.size();
            default:
                return ((ArrayList) list).size();
        }
    }

    @Override // defpackage.fh2
    public final long d(int i) {
        switch (this.d) {
            case 0:
                List list = this.g;
                w50 w50Var = (w50) list.get(i);
                p71.n(w50Var.f4943b).append(w50Var.g);
                return r2.toString().hashCode() << ((w50) list.get(i)).f4942a;
            default:
                return -1L;
        }
    }

    @Override // defpackage.fh2
    public final int e(int i) {
        switch (this.d) {
            case 0:
                return ((w50) this.g.get(i)).f4942a;
            default:
                return 0;
        }
    }

    @Override // defpackage.fh2
    public final void n(h hVar, int i) {
        int i2 = this.d;
        List list = this.g;
        switch (i2) {
            case 0:
                int e = e(i);
                View view = hVar.f281a;
                if (e != 2) {
                    if (e != 3) {
                        if (e == 5) {
                            ((h60) hVar).u.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, view.getContext().getDrawable(R.drawable.img_static_ip_empty), (Drawable) null, (Drawable) null);
                            return;
                        }
                        return;
                    }
                    j60 j60Var = (j60) view;
                    j60Var.setLog((w50) list.get(i));
                    j60Var.setOnDeleteAction(this.e);
                    return;
                }
                ((SwitchCompat) view.findViewById(R.id.switchStaticIp)).setChecked(ew3.K());
                return;
            default:
                ArrayList arrayList = (ArrayList) list;
                bc2 bc2Var = (bc2) arrayList.get(i);
                ve3 ve3Var = ((za2) hVar).u;
                ve3Var.setData(bc2Var);
                ve3Var.setSelected(m20.L(((bc2) arrayList.get(i)).f445a, (String) this.h));
                ve3Var.setOnItemClick(this.e);
                ve3Var.setOnBackPress(this.f);
                m20.g1(ve3Var.getTvRecommend(), ((bc2) arrayList.get(i)).d);
                return;
        }
    }

    @Override // defpackage.fh2
    public final void o(h hVar, int i, List list) {
        switch (this.d) {
            case 0:
                if (list.isEmpty()) {
                    n(hVar, i);
                    return;
                } else {
                    if (e(i) == 3) {
                        j60 j60Var = (j60) hVar.f281a;
                        int i2 = ((w50) this.g.get(i)).j;
                        j60Var.F = i2;
                        j60Var.A(i2, j60Var.E);
                        return;
                    }
                    return;
                }
            default:
                n(hVar, i);
                return;
        }
    }

    @Override // defpackage.fh2
    public final h s(RecyclerView recyclerView, int i) {
        switch (this.d) {
            case 0:
                if (i != 2) {
                    if (i != 3) {
                        return new h60(recyclerView, (f83) this.h);
                    }
                    return new e60(recyclerView, (f83) this.h);
                }
                return new e60(recyclerView, (f83) this.h, this.f);
            default:
                return new za2(new ve3(recyclerView.getContext()));
        }
    }

    public i60(f83 f83Var, ArrayList arrayList) {
        this.d = 0;
        this.g = arrayList;
        this.h = f83Var;
    }
}
