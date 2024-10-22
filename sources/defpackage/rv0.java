package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.h;
import com.security.xvpn.z35kb.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class rv0 extends fh2 {
    public final /* synthetic */ int d;
    public final Object e;
    public final Object f;

    public rv0(f82 f82Var, lt3 lt3Var) {
        this.d = 2;
        this.e = f82Var;
        this.f = lt3Var;
    }

    @Override // defpackage.fh2
    public final int c() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                return ((List) obj).size();
            case 1:
                return ((List) obj).size();
            default:
                return ((f82) obj).k.size();
        }
    }

    @Override // defpackage.fh2
    public final int e(int i) {
        switch (this.d) {
            case 2:
                return ((d82) ((f82) this.e).k.get(i)).f1747b;
            default:
                return 0;
        }
    }

    @Override // defpackage.fh2
    public final void n(h hVar, int i) {
        View view = hVar.f281a;
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                TextView textView = (TextView) view;
                if (pd0.v(textView.getContext()).getLanguage().equals(new Locale("ar").getLanguage())) {
                    textView.setText(pd0.A(((ut3) ((List) obj).get(i)).f4739b));
                    return;
                } else {
                    textView.setText(((ut3) ((List) obj).get(i)).f4739b);
                    return;
                }
            case 1:
                pn0 pn0Var = (pn0) view;
                nn0 nn0Var = (nn0) ((List) obj).get(i);
                pn0Var.setText(nn0Var.f3495a);
                pn0Var.setItemClick(nn0Var.f);
                pn0Var.setIcon(nn0Var.c);
                pn0Var.setIconRes(nn0Var.f3496b);
                pn0Var.setShowRedPoint(nn0Var.e);
                return;
            default:
                TextView textView2 = (TextView) view;
                f82 f82Var = (f82) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((d82) f82Var.k.get(i)).f1746a);
                List list = f82Var.k;
                Iterator it = ((d82) list.get(i)).c.entrySet().iterator();
                while (true) {
                    boolean z = true;
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        bx3.i(spannableStringBuilder, (String) entry.getKey(), (CharacterStyle) entry.getValue());
                    } else {
                        textView2.setText(spannableStringBuilder);
                        HashMap hashMap = ((d82) list.get(i)).c;
                        if (!hashMap.isEmpty()) {
                            Iterator it2 = hashMap.entrySet().iterator();
                            while (it2.hasNext()) {
                                if (((Map.Entry) it2.next()).getValue() instanceof ClickableSpan) {
                                    textView2.setFocusable(z);
                                    fl.m(f82Var, textView2, 1000092);
                                    return;
                                }
                            }
                        }
                        z = false;
                        textView2.setFocusable(z);
                        fl.m(f82Var, textView2, 1000092);
                        return;
                    }
                }
        }
    }

    @Override // defpackage.fh2
    public final h s(RecyclerView recyclerView, int i) {
        int i2 = this.d;
        Object obj = this.f;
        switch (i2) {
            case 0:
                TextView textView = new TextView(recyclerView.getContext());
                textView.setPadding(tf3.K(20), tf3.K(12), tf3.K(20), tf3.K(12));
                textView.setLineSpacing(20 * tf3.F, 0.0f);
                textView.setGravity(17);
                textView.setLayoutParams(new d(-1, -2));
                return new qx(this, textView);
            case 1:
                pn0 pn0Var = new pn0(recyclerView.getContext());
                ((f83) obj).k(pn0Var);
                return new qx(pn0Var);
            default:
                TextView textView2 = new TextView(recyclerView.getContext());
                textView2.setTextColor(v73.y());
                ((f82) this.e).i.a(new z73(2, 1000013, (Object) textView2, false));
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                textView2.setLinkTextColor(v73.j(1000092));
                d dVar = new d(-1, -2);
                Context context = (Context) obj;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    ((ViewGroup.MarginLayoutParams) dVar).topMargin = bx3.t(context, 10);
                                    textView2.setTextSize(12.0f);
                                    textView2.setTypeface(Typeface.create("sans-serif-light", 0));
                                    textView2.setTextColor(v73.z());
                                    textView2.setLineSpacing((int) (bx3.z(context) * 18), 0.0f);
                                }
                            } else {
                                ((ViewGroup.MarginLayoutParams) dVar).topMargin = bx3.t(context, 10);
                                textView2.setTextSize(12.0f);
                                textView2.setTypeface(Typeface.DEFAULT_BOLD);
                                textView2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.dot_yellow, 0, 0, 0);
                                textView2.setCompoundDrawablePadding((int) (bx3.z(context) * 8));
                            }
                        } else {
                            ((ViewGroup.MarginLayoutParams) dVar).topMargin = bx3.t(context, 20);
                            textView2.setTextSize(14.0f);
                            textView2.setTypeface(Typeface.DEFAULT_BOLD);
                            textView2.setLineSpacing((int) (bx3.z(context) * 24), 0.0f);
                        }
                    } else {
                        ((ViewGroup.MarginLayoutParams) dVar).topMargin = bx3.t(context, 20);
                        textView2.setTextSize(16.0f);
                        textView2.setTypeface(Typeface.DEFAULT_BOLD);
                        textView2.setLineSpacing((int) (bx3.z(context) * 24), 0.0f);
                    }
                } else {
                    ((ViewGroup.MarginLayoutParams) dVar).topMargin = bx3.t(context, 20);
                    textView2.setTextSize(22.0f);
                    textView2.setTypeface(Typeface.DEFAULT_BOLD);
                    textView2.setGravity(17);
                }
                textView2.setLayoutParams(dVar);
                return new qx(textView2);
        }
    }

    @Override // defpackage.fh2
    public final void w(h hVar) {
        switch (this.d) {
            case 0:
                TextView textView = (TextView) hVar.f281a;
                textView.setBackgroundColor(v73.e());
                textView.setTextColor(v73.y());
                return;
            default:
                return;
        }
    }

    @Override // defpackage.fh2
    public final void z(h hVar) {
        switch (this.d) {
            case 0:
                ((f83) this.f).getThemeListeners().c(hVar.f281a);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ rv0(ArrayList arrayList, f83 f83Var, int i) {
        this.d = i;
        this.e = arrayList;
        this.f = f83Var;
    }
}
