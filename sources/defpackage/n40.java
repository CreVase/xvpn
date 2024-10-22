package defpackage;

import a.bx;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.security.xvpn.z35kb.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class n40 extends fh2 {
    public final /* synthetic */ int d;
    public final Object e;

    public n40(pi1 pi1Var) {
        this.d = 2;
        this.e = pi1Var;
    }

    @Override // defpackage.fh2
    public final int b(fh2 fh2Var, h hVar, int i) {
        switch (this.d) {
            case 0:
                o40 o40Var = (o40) this.e;
                cz1 cz1Var = (cz1) ((IdentityHashMap) o40Var.e).get(hVar);
                if (cz1Var == null) {
                    return -1;
                }
                int b2 = i - o40Var.b(cz1Var);
                fh2 fh2Var2 = cz1Var.c;
                int c = fh2Var2.c();
                if (b2 >= 0 && b2 < c) {
                    return fh2Var2.b(fh2Var, hVar, b2);
                }
                StringBuilder t = hx2.t("Detected inconsistent adapter updates. The local position of the view holder maps to ", b2, " which is out of bounds for the adapter with size ", c, ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
                t.append(hVar);
                t.append("adapter:");
                t.append(fh2Var);
                throw new IllegalStateException(t.toString());
            default:
                if (fh2Var != this) {
                    return -1;
                }
                return i;
        }
    }

    @Override // defpackage.fh2
    public final int c() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                Iterator it = ((List) ((o40) obj).d).iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    i2 += ((cz1) it.next()).e;
                }
                return i2;
            case 1:
                return ((yz) obj).e.size();
            default:
                return ((pi1) obj).f3846a.length;
        }
    }

    @Override // defpackage.fh2
    public final long d(int i) {
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                o40 o40Var = (o40) obj;
                mp c = o40Var.c(i);
                cz1 cz1Var = (cz1) c.c;
                long b2 = cz1Var.f1707b.b(cz1Var.c.d(c.f3329a));
                c.f3330b = false;
                c.c = null;
                c.f3329a = -1;
                o40Var.f = c;
                return b2;
            case 1:
                return ((pb2) ((yz) obj).e.get(i)).hashCode();
            default:
                return -1L;
        }
    }

    @Override // defpackage.fh2
    public final int e(int i) {
        switch (this.d) {
            case 0:
                o40 o40Var = (o40) this.e;
                mp c = o40Var.c(i);
                cz1 cz1Var = (cz1) c.c;
                int o = cz1Var.f1706a.o(cz1Var.c.e(c.f3329a));
                c.f3330b = false;
                c.c = null;
                c.f3329a = -1;
                o40Var.f = c;
                return o;
            default:
                return 0;
        }
    }

    @Override // defpackage.fh2
    public final void m(RecyclerView recyclerView) {
        boolean z;
        switch (this.d) {
            case 0:
                o40 o40Var = (o40) this.e;
                List list = (List) o40Var.c;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((WeakReference) it.next()).get() == recyclerView) {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                    list.add(new WeakReference(recyclerView));
                    Iterator it2 = ((List) o40Var.d).iterator();
                    while (it2.hasNext()) {
                        ((cz1) it2.next()).c.m(recyclerView);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.fh2
    public final void n(h hVar, final int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                o40 o40Var = (o40) obj;
                mp c = o40Var.c(i);
                ((IdentityHashMap) o40Var.e).put(hVar, (cz1) c.c);
                ((cz1) c.c).c.a(hVar, c.f3329a);
                c.f3330b = false;
                c.c = null;
                c.f3329a = -1;
                o40Var.f = c;
                return;
            case 1:
                yz yzVar = (yz) obj;
                pb2 pb2Var = (pb2) yzVar.e.get(i);
                pb2Var.getClass();
                bx j = hx2.j(pb2Var.f3816b, 240);
                String u = j.u();
                j.h();
                w30 w30Var = ((xz) hVar).u;
                w30Var.c.setText(pd0.A(u));
                LinearLayout linearLayout = (LinearLayout) w30Var.d;
                String str = pb2Var.c;
                if (str != null && str.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                m20.g1(linearLayout, !z);
                if (linearLayout.getVisibility() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    w30Var.f4933b.setText(pe0.U(pb2Var.c));
                }
                LinearLayout linearLayout2 = (LinearLayout) w30Var.e;
                String str2 = pb2Var.c;
                if (str2 != null && str2.length() != 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                linearLayout2.setEnabled(z3);
                if (i == yzVar.d) {
                    z4 = true;
                }
                linearLayout2.setSelected(z4);
                linearLayout2.setOnClickListener(new t53(yzVar, i, this, 2));
                return;
            default:
                final TextView textView = (TextView) hVar.f281a;
                final pi1 pi1Var = (pi1) obj;
                final sb2 sb2Var = pi1Var.f3846a[i];
                textView.setText(sb2Var.f4307a);
                textView.setSelected(m20.L(sb2Var.f4308b, pi1Var.f3847b));
                textView.setOnClickListener(new View.OnClickListener() { // from class: ni1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        wm1 b2;
                        if (!textView.isSelected()) {
                            sb2 sb2Var2 = sb2Var;
                            ew3.l0(sb2Var2.f4308b);
                            if (Build.VERSION.SDK_INT >= 33) {
                                if (m20.L(sb2Var2.f4308b, "auto")) {
                                    b2 = wm1.f5037b;
                                } else {
                                    b2 = wm1.b(sb2Var2.f4308b);
                                }
                                sc.m(b2);
                            }
                            pi1 pi1Var2 = pi1Var;
                            Context context = pi1Var2.getContext();
                            int i3 = ly1.f3206a;
                            ly1.a(context.getApplicationContext());
                            pi1Var2.f3847b = ew3.P();
                            this.f();
                            view.post(new dx2(view, 2));
                        }
                    }
                });
                textView.setOnKeyListener(new View.OnKeyListener() { // from class: oi1
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
                        Context context;
                        Activity activity;
                        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
                            View view2 = null;
                            if (view != null) {
                                context = view.getContext();
                            } else {
                                context = null;
                            }
                            if (context instanceof Activity) {
                                activity = (Activity) context;
                            } else {
                                activity = null;
                            }
                            if (activity != null) {
                                view2 = activity.findViewById(R.id.tabBar);
                            }
                            if (view2 != null && view2.requestFocus()) {
                                return true;
                            }
                        } else if (keyEvent.getAction() == 0) {
                            int i4 = i;
                            if ((i3 == 19 && i4 == 0) || (i3 == 20 && i4 == this.c() - 1)) {
                                return textView.isFocused();
                            }
                        }
                        return false;
                    }
                });
                return;
        }
    }

    @Override // defpackage.fh2
    public final h s(RecyclerView recyclerView, int i) {
        switch (this.d) {
            case 0:
                cz1 a2 = ((zm3) ((o40) this.e).f3597b).a(i);
                return a2.c.s(recyclerView, a2.f1706a.n(i));
            case 1:
                View inflate = LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.tv_item_choose_bind, (ViewGroup) recyclerView, false);
                int i2 = R.id.ivCheck;
                ImageView imageView = (ImageView) m20.g0(inflate, R.id.ivCheck);
                if (imageView != null) {
                    i2 = R.id.tvError;
                    TextView textView = (TextView) m20.g0(inflate, R.id.tvError);
                    if (textView != null) {
                        i2 = R.id.tvName;
                        TextView textView2 = (TextView) m20.g0(inflate, R.id.tvName);
                        if (textView2 != null) {
                            i2 = R.id.vError;
                            LinearLayout linearLayout = (LinearLayout) m20.g0(inflate, R.id.vError);
                            if (linearLayout != null) {
                                return new xz(new w30((LinearLayout) inflate, imageView, textView, textView2, linearLayout, 2));
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            default:
                AppCompatTextView appCompatTextView = new AppCompatTextView(recyclerView.getContext(), null);
                xm3.e(appCompatTextView);
                return new qx(appCompatTextView);
        }
    }

    @Override // defpackage.fh2
    public final void t(RecyclerView recyclerView) {
        switch (this.d) {
            case 0:
                o40 o40Var = (o40) this.e;
                List list = (List) o40Var.c;
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        WeakReference weakReference = (WeakReference) list.get(size);
                        if (weakReference.get() == null) {
                            list.remove(size);
                        } else if (weakReference.get() == recyclerView) {
                            list.remove(size);
                        }
                    }
                }
                Iterator it = ((List) o40Var.d).iterator();
                while (it.hasNext()) {
                    ((cz1) it.next()).c.t(recyclerView);
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.fh2
    public final boolean v(h hVar) {
        switch (this.d) {
            case 0:
                o40 o40Var = (o40) this.e;
                IdentityHashMap identityHashMap = (IdentityHashMap) o40Var.e;
                cz1 cz1Var = (cz1) identityHashMap.get(hVar);
                if (cz1Var != null) {
                    boolean v = cz1Var.c.v(hVar);
                    identityHashMap.remove(hVar);
                    return v;
                }
                throw new IllegalStateException("Cannot find wrapper for " + hVar + ", seems like it is not bound by this adapter: " + o40Var);
            default:
                return false;
        }
    }

    @Override // defpackage.fh2
    public final void w(h hVar) {
        switch (this.d) {
            case 0:
                ((o40) this.e).d(hVar).c.w(hVar);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.fh2
    public final void y(h hVar) {
        switch (this.d) {
            case 0:
                ((o40) this.e).d(hVar).c.y(hVar);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.fh2
    public final void z(h hVar) {
        switch (this.d) {
            case 0:
                o40 o40Var = (o40) this.e;
                IdentityHashMap identityHashMap = (IdentityHashMap) o40Var.e;
                cz1 cz1Var = (cz1) identityHashMap.get(hVar);
                if (cz1Var != null) {
                    cz1Var.c.z(hVar);
                    identityHashMap.remove(hVar);
                    return;
                } else {
                    throw new IllegalStateException("Cannot find wrapper for " + hVar + ", seems like it is not bound by this adapter: " + o40Var);
                }
            default:
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n40(fh2[] fh2VarArr) {
        this(fh2VarArr, 0);
        this.d = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n40(fh2[] fh2VarArr, int i) {
        this(Arrays.asList(fh2VarArr));
        this.d = 0;
    }

    public n40(yz yzVar) {
        this.d = 1;
        this.e = yzVar;
        A(true);
    }

    public n40(List list) {
        List list2;
        int size;
        this.d = 0;
        this.e = new o40(this);
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            Object obj = this.e;
            m40 m40Var = m40.NO_STABLE_IDS;
            if (hasNext) {
                fh2 fh2Var = (fh2) it.next();
                o40 o40Var = (o40) obj;
                list2 = (List) o40Var.d;
                size = list2.size();
                if (size < 0 || size > list2.size()) {
                    break;
                }
                if (((m40) o40Var.g) != m40Var) {
                    tf3.u(fh2Var.f2092b, "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
                } else {
                    boolean z = fh2Var.f2092b;
                }
                int size2 = list2.size();
                int i = 0;
                while (true) {
                    if (i >= size2) {
                        i = -1;
                        break;
                    } else if (((cz1) list2.get(i)).c == fh2Var) {
                        break;
                    } else {
                        i++;
                    }
                }
                if ((i == -1 ? null : (cz1) list2.get(i)) == null) {
                    cz1 cz1Var = new cz1(fh2Var, o40Var, (zm3) o40Var.f3597b, ((h03) o40Var.h).a());
                    list2.add(size, cz1Var);
                    Iterator it2 = ((List) o40Var.c).iterator();
                    while (it2.hasNext()) {
                        RecyclerView recyclerView = (RecyclerView) ((WeakReference) it2.next()).get();
                        if (recyclerView != null) {
                            fh2Var.m(recyclerView);
                        }
                    }
                    if (cz1Var.e > 0) {
                        ((n40) o40Var.f3596a).l(o40Var.b(cz1Var), cz1Var.e);
                    }
                    o40Var.a();
                }
            } else {
                A(((m40) ((o40) obj).g) != m40Var);
                return;
            }
        }
        throw new IndexOutOfBoundsException("Index must be between 0 and " + list2.size() + ". Given:" + size);
    }
}
