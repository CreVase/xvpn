package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class oq2 extends fh2 {
    public final f83 d;
    public final int e;

    public oq2(f83 f83Var, int i) {
        this.d = f83Var;
        this.e = i;
    }

    @Override // defpackage.fh2
    public final int c() {
        return 1;
    }

    @Override // defpackage.fh2
    public final void n(h hVar, int i) {
    }

    @Override // defpackage.fh2
    public final h s(RecyclerView recyclerView, int i) {
        nq2 nq2Var = new nq2(this, LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.item_server_list_footer, (ViewGroup) recyclerView, false), this.e);
        nq2Var.u.setOnClickListener(new f60(recyclerView, 1));
        nq2Var.v.setOnClickListener(new f60(recyclerView, 2));
        this.d.q(nq2Var);
        return nq2Var;
    }
}
