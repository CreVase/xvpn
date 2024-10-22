package defpackage;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.security.xvpn.z35kb.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class hy2 extends fh2 implements w73 {
    public final List d;
    public boolean e = false;
    public final f83 f;

    public hy2(f83 f83Var, ArrayList arrayList) {
        this.d = arrayList;
        this.f = f83Var;
    }

    @Override // defpackage.fh2
    public final int c() {
        return this.d.size();
    }

    @Override // defpackage.fh2
    public final long d(int i) {
        List list = this.d;
        if (list.size() > i && ((rb2) list.get(i)).f4125a != null) {
            return ((rb2) list.get(i)).f4125a.hashCode();
        }
        return -1L;
    }

    @Override // defpackage.w73
    public final boolean h() {
        return true;
    }

    @Override // defpackage.fh2
    public final void n(h hVar, int i) {
        gy2 gy2Var = (gy2) hVar;
        List list = this.d;
        if (i < list.size() && i >= 0) {
            rb2 rb2Var = (rb2) list.get(i);
            View view = gy2Var.f281a;
            gy2Var.u.setImageResource(fl.C(view.getContext(), rb2Var.f));
            gy2Var.v.setText(rb2Var.f4126b);
            boolean equals = "Time out".equals((String) rb2Var.q.c);
            String str = "-";
            TextView textView = gy2Var.z;
            View view2 = gy2Var.A;
            TextView textView2 = gy2Var.w;
            if (equals) {
                textView.setVisibility(0);
                textView2.setVisibility(8);
                view2.setVisibility(8);
                view2.clearAnimation();
            } else {
                if (this.e && TextUtils.isEmpty((String) rb2Var.q.e)) {
                    view2.setVisibility(0);
                    view2.startAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.ping_loading_anim));
                    textView2.setVisibility(8);
                } else {
                    view2.setVisibility(8);
                    view2.clearAnimation();
                    textView2.setVisibility(0);
                    String str2 = (String) rb2Var.q.c;
                    int i2 = bw3.f543a;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "-";
                    }
                    textView2.setText(str2);
                    if (((String) rb2Var.q.d).isEmpty()) {
                        textView2.setTextColor(v73.y());
                    } else {
                        textView2.setTextColor(Color.parseColor("#" + ((String) rb2Var.q.d)));
                    }
                }
                textView.setVisibility(8);
            }
            boolean equals2 = "Failed".equals((String) rb2Var.q.e);
            TextView textView3 = gy2Var.y;
            AppCompatTextView appCompatTextView = gy2Var.x;
            View view3 = gy2Var.B;
            if (equals2) {
                appCompatTextView.setVisibility(8);
                view3.setVisibility(8);
                textView3.setVisibility(0);
                view3.clearAnimation();
                return;
            }
            if (this.e && TextUtils.isEmpty((String) rb2Var.q.e)) {
                view3.setVisibility(0);
                view3.startAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.ping_loading_anim));
                appCompatTextView.setVisibility(8);
            } else {
                view3.clearAnimation();
                view3.setVisibility(8);
                appCompatTextView.setVisibility(0);
                String str3 = (String) rb2Var.q.e;
                int i3 = bw3.f543a;
                if (!TextUtils.isEmpty(str3)) {
                    str = str3;
                }
                appCompatTextView.setText(str);
            }
            textView3.setVisibility(8);
        }
    }

    @Override // defpackage.w73
    public final void p(boolean z) {
    }

    @Override // defpackage.fh2
    public final h s(RecyclerView recyclerView, int i) {
        return new gy2(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.item_speedtest_result, (ViewGroup) recyclerView, false), this.f);
    }
}
