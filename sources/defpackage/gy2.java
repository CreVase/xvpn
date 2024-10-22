package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.h;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class gy2 extends h implements ke1 {
    public final View A;
    public final View B;
    public final ImageView u;
    public final TextView v;
    public final TextView w;
    public final AppCompatTextView x;
    public final TextView y;
    public final TextView z;

    public gy2(View view, f83 f83Var) {
        super(view);
        this.u = (ImageView) view.findViewById(R.id.iv_server_addr);
        this.v = (TextView) view.findViewById(R.id.tv_server_name);
        this.w = (TextView) view.findViewById(R.id.tv_ping_speed);
        this.x = (AppCompatTextView) view.findViewById(R.id.tv_download_speed);
        this.y = (TextView) view.findViewById(R.id.tv_status_failed);
        this.z = (TextView) view.findViewById(R.id.tv_ping_failed);
        this.A = view.findViewById(R.id.ivPingLoading);
        this.B = view.findViewById(R.id.ivLossPkgLoading);
        f83Var.u(this);
    }

    @Override // defpackage.ke1
    public final void a() {
        this.v.setTextColor(v73.j(1000014));
        this.w.setTextColor(v73.j(1000013));
        this.x.setTextColor(v73.j(1000013));
        this.f281a.postInvalidate();
    }
}
