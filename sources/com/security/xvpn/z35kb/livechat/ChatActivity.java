package com.security.xvpn.z35kb.livechat;

import a.bx;
import a.du;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentUris;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XTextViewNew;
import com.security.xvpn.z35kb.livechat.ChatActivity;
import com.security.xvpn.z35kb.util.WrapContentLinearLayoutManager;
import defpackage.a22;
import defpackage.a6;
import defpackage.bx3;
import defpackage.c20;
import defpackage.cy;
import defpackage.cz;
import defpackage.ew3;
import defpackage.ey;
import defpackage.ey1;
import defpackage.f70;
import defpackage.fl;
import defpackage.fy;
import defpackage.gq2;
import defpackage.hx2;
import defpackage.j12;
import defpackage.jo0;
import defpackage.jy;
import defpackage.kj1;
import defpackage.ky;
import defpackage.l12;
import defpackage.lt3;
import defpackage.m20;
import defpackage.mx;
import defpackage.ny;
import defpackage.pd0;
import defpackage.px1;
import defpackage.qy;
import defpackage.rv0;
import defpackage.rx;
import defpackage.sh0;
import defpackage.sp0;
import defpackage.sv0;
import defpackage.sx;
import defpackage.t9;
import defpackage.tc0;
import defpackage.tf3;
import defpackage.tp0;
import defpackage.tt3;
import defpackage.tx;
import defpackage.ui1;
import defpackage.ut3;
import defpackage.ux;
import defpackage.uy;
import defpackage.v73;
import defpackage.vl0;
import defpackage.vx;
import defpackage.wt3;
import defpackage.wx;
import defpackage.wx2;
import defpackage.xn2;
import defpackage.xv0;
import defpackage.xx;
import defpackage.ya0;
import defpackage.yx;
import defpackage.zf3;
import defpackage.zo;
import defpackage.zx;
import defpackage.zy;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class ChatActivity extends zo implements a22 {
    public static final /* synthetic */ int L = 0;
    public final ui1 A;
    public final ky B;
    public PopupWindow C;
    public wt3 D;
    public mx E;
    public final Handler F;
    public boolean G;
    public wt3 H;
    public final ky I;
    public boolean J;
    public boolean K;
    public WrapContentLinearLayoutManager l;
    public boolean p;
    public boolean r;
    public boolean s;
    public int t;
    public final ArrayList v;
    public final rv0 w;
    public ut3 x;
    public boolean y;
    public long z;
    public final rx m = new rx(this);
    public final ArrayList n = new ArrayList();
    public final ey1 o = new ey1();
    public final String q = "clientSendMsg_";
    public final ArrayList u = new ArrayList();

    public ChatActivity() {
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.w = new rv0(arrayList, this, 0);
        this.A = m20.D0(kj1.f2953a, new tc0(this, 7));
        this.B = new ky(this);
        this.F = new Handler(Looper.getMainLooper());
        this.I = new ky(this);
        this.J = true;
        this.K = true ^ ew3.x();
    }

    public static final boolean b0(ChatActivity chatActivity, tt3 tt3Var) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        Object obj;
        boolean z3 = false;
        if (!chatActivity.J) {
            return false;
        }
        boolean z4 = chatActivity.K;
        ArrayList arrayList = chatActivity.v;
        rv0 rv0Var = chatActivity.w;
        if (!z4) {
            if (tt3Var.c.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                ut3 i = tf3.i(tt3Var.c);
                if (i.g.length == 0) {
                    z3 = true;
                }
                if (!z3) {
                    arrayList.clear();
                    c20.E0(arrayList, i.g);
                    rv0Var.f();
                    chatActivity.n0();
                    tt3Var.l = true;
                    sh0 sh0Var = vl0.c;
                    zf3.d(chatActivity, sh0Var, new sx(tt3Var, null), 2);
                    chatActivity.m0(i);
                    tt3 tt3Var2 = new tt3();
                    tt3Var2.c = pd0.y(R.string.FaqChooseOne);
                    tt3Var2.d = "Text";
                    tt3Var2.m = tf3.j();
                    tt3Var2.h = cz.x;
                    tt3Var2.j = true;
                    tt3Var2.f4578b = true;
                    zf3.d(chatActivity, sh0Var, new tx(tt3Var2, null), 2);
                } else {
                    zf3.d(chatActivity, vl0.c, new ux(tt3Var, null), 2);
                    chatActivity.m0(i);
                }
            } else {
                Iterator it = chatActivity.u.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (m20.L(((ut3) obj).f, tf3.a())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ut3 ut3Var = (ut3) obj;
                if (ut3Var != null) {
                    arrayList.clear();
                    c20.E0(arrayList, ut3Var.g);
                    rv0Var.f();
                    chatActivity.n0();
                    tt3Var.l = true;
                    zf3.d(chatActivity, vl0.c, new vx(tt3Var, null), 2);
                    ut3 ut3Var2 = new ut3();
                    ut3Var2.f4738a = ut3Var.f4738a;
                    ut3Var2.c = ut3Var.c;
                    ut3Var2.d = ut3Var.d;
                    ut3Var2.e = ut3Var.e;
                    ut3Var2.f = ut3Var.f;
                    ut3Var2.g = ut3Var.g;
                    chatActivity.m0(ut3Var2);
                }
            }
            return true;
        }
        ut3 ut3Var3 = chatActivity.x;
        if (ut3Var3 != null) {
            str = ut3Var3.f;
        } else {
            str = null;
        }
        if (m20.L(str, tf3.b())) {
            chatActivity.J = false;
            zf3.d(chatActivity, vl0.c, new wx(tt3Var, null), 2);
        } else {
            ut3 ut3Var4 = chatActivity.x;
            if (ut3Var4 != null) {
                str2 = ut3Var4.f;
            } else {
                str2 = null;
            }
            bx i2 = hx2.i(37);
            String u = i2.u();
            i2.h();
            if (!m20.L(str2, u)) {
                return false;
            }
            chatActivity.J = false;
            if (tt3Var.c.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ut3 i3 = tf3.i(tt3Var.c);
                if (i3.g.length == 0) {
                    z3 = true;
                }
                if (!z3) {
                    arrayList.clear();
                    c20.E0(arrayList, i3.g);
                    rv0Var.f();
                    chatActivity.n0();
                    tt3Var.l = true;
                    zf3.d(chatActivity, vl0.c, new xx(tt3Var, null), 2);
                    chatActivity.m0(i3);
                } else {
                    zf3.d(chatActivity, vl0.c, new yx(tt3Var, null), 2);
                    chatActivity.m0(i3);
                }
            } else {
                zf3.d(chatActivity, vl0.c, new zx(tt3Var, null), 2);
            }
        }
        return true;
    }

    public static final void c0(final ChatActivity chatActivity, a aVar, final tt3 tt3Var) {
        int J;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        if (!chatActivity.isFinishing() && !chatActivity.d && tt3Var.h != cz.x) {
            boolean L2 = m20.L("Text", tt3Var.d);
            final boolean A = ew3.A();
            int[] iArr = new int[2];
            aVar.getLocationOnScreen(iArr);
            if (L2) {
                J = tf3.K(111);
            } else {
                J = tf3.J(73.5f);
            }
            final int i2 = 1;
            final int i3 = 0;
            if (iArr[1] - chatActivity.Z().n.getTop() >= J) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = R.layout.pop_msg_mark;
            } else {
                i = R.layout.pop_msg_mark2;
            }
            View inflate = LayoutInflater.from(chatActivity.c).inflate(i, (ViewGroup) null);
            PopupWindow popupWindow = new PopupWindow(inflate, -2, -2);
            chatActivity.C = popupWindow;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
            popupWindow.setOutsideTouchable(true);
            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: nx
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    int i4 = ChatActivity.L;
                    cz.D = null;
                    ChatActivity chatActivity2 = ChatActivity.this;
                    chatActivity2.m.f();
                    if (!A) {
                        cz.B = false;
                        chatActivity2.m.f();
                    }
                }
            });
            final TextView textView = (TextView) inflate.findViewById(R.id.vUpgrade);
            final TextView textView2 = (TextView) inflate.findViewById(R.id.vDownGrade);
            TextView textView3 = (TextView) inflate.findViewById(R.id.vCopy);
            TextView textView4 = (TextView) inflate.findViewById(R.id.tvDelete);
            textView.setText(pd0.y(R.string.Nice));
            textView2.setText(pd0.y(R.string.Bad));
            textView3.setText(pd0.y(R.string.Copy));
            textView4.setText(pd0.y(R.string.Delete));
            if (!L2) {
                textView3.setVisibility(8);
            }
            if (tt3Var.f4578b) {
                m20.u0(textView4);
            } else {
                m20.u0(textView);
                m20.u0(textView2);
            }
            textView2.setBackground(v73.A(tt3Var.o, false, false));
            textView.setSelected(tt3Var.n);
            textView2.setSelected(tt3Var.o);
            textView2.setOnClickListener(new View.OnClickListener(chatActivity) { // from class: ox

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ChatActivity f3744b;

                {
                    this.f3744b = chatActivity;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = i3;
                    tt3 tt3Var2 = tt3Var;
                    TextView textView5 = textView2;
                    ChatActivity chatActivity2 = this.f3744b;
                    switch (i4) {
                        case 0:
                            PopupWindow popupWindow2 = chatActivity2.C;
                            if (popupWindow2 != null) {
                                popupWindow2.dismiss();
                            }
                            if (!textView5.isSelected()) {
                                uu3.a(tt3Var2, false);
                                chatActivity2.getWindow().getDecorView().performHapticFeedback(0, 2);
                            }
                            String str = tt3Var2.f4577a;
                            String str2 = tt3Var2.m;
                            bx bxVar = new bx();
                            bxVar.z(str);
                            bxVar.z(str2);
                            bxVar.v(false);
                            du.d(50, bxVar);
                            bxVar.h();
                            return;
                        default:
                            PopupWindow popupWindow3 = chatActivity2.C;
                            if (popupWindow3 != null) {
                                popupWindow3.dismiss();
                            }
                            if (!textView5.isSelected()) {
                                uu3.a(tt3Var2, true);
                                chatActivity2.getWindow().getDecorView().performHapticFeedback(0, 2);
                            }
                            String str3 = tt3Var2.f4577a;
                            String str4 = tt3Var2.m;
                            bx bxVar2 = new bx();
                            bxVar2.z(str3);
                            bxVar2.z(str4);
                            bxVar2.v(true);
                            du.d(50, bxVar2);
                            bxVar2.h();
                            return;
                    }
                }
            });
            textView.setOnClickListener(new View.OnClickListener(chatActivity) { // from class: ox

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ChatActivity f3744b;

                {
                    this.f3744b = chatActivity;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = i2;
                    tt3 tt3Var2 = tt3Var;
                    TextView textView5 = textView;
                    ChatActivity chatActivity2 = this.f3744b;
                    switch (i4) {
                        case 0:
                            PopupWindow popupWindow2 = chatActivity2.C;
                            if (popupWindow2 != null) {
                                popupWindow2.dismiss();
                            }
                            if (!textView5.isSelected()) {
                                uu3.a(tt3Var2, false);
                                chatActivity2.getWindow().getDecorView().performHapticFeedback(0, 2);
                            }
                            String str = tt3Var2.f4577a;
                            String str2 = tt3Var2.m;
                            bx bxVar = new bx();
                            bxVar.z(str);
                            bxVar.z(str2);
                            bxVar.v(false);
                            du.d(50, bxVar);
                            bxVar.h();
                            return;
                        default:
                            PopupWindow popupWindow3 = chatActivity2.C;
                            if (popupWindow3 != null) {
                                popupWindow3.dismiss();
                            }
                            if (!textView5.isSelected()) {
                                uu3.a(tt3Var2, true);
                                chatActivity2.getWindow().getDecorView().performHapticFeedback(0, 2);
                            }
                            String str3 = tt3Var2.f4577a;
                            String str4 = tt3Var2.m;
                            bx bxVar2 = new bx();
                            bxVar2.z(str3);
                            bxVar2.z(str4);
                            bxVar2.v(true);
                            du.d(50, bxVar2);
                            bxVar2.h();
                            return;
                    }
                }
            });
            textView3.setOnClickListener(new View.OnClickListener(chatActivity) { // from class: px

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ChatActivity f3930b;

                {
                    this.f3930b = chatActivity;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = i3;
                    int i5 = 0;
                    ChatActivity chatActivity2 = this.f3930b;
                    tt3 tt3Var2 = tt3Var;
                    switch (i4) {
                        case 0:
                            PopupWindow popupWindow2 = chatActivity2.C;
                            if (popupWindow2 != null) {
                                popupWindow2.dismiss();
                            }
                            try {
                                ((ClipboardManager) chatActivity2.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(pd0.y(R.string.app_name), tt3Var2.c));
                                Toast.makeText(chatActivity2.c, pd0.y(R.string.CopySuccess), 0).show();
                                return;
                            } catch (Throwable unused) {
                                Toast.makeText(chatActivity2.c, pd0.y(R.string.CopyFailed), 0).show();
                                return;
                            }
                        default:
                            PopupWindow popupWindow3 = chatActivity2.C;
                            if (popupWindow3 != null) {
                                popupWindow3.dismiss();
                            }
                            t9.u0(chatActivity2, new yy(tt3Var2.m, i5));
                            return;
                    }
                }
            });
            textView4.setOnClickListener(new View.OnClickListener(chatActivity) { // from class: px

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ChatActivity f3930b;

                {
                    this.f3930b = chatActivity;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = i2;
                    int i5 = 0;
                    ChatActivity chatActivity2 = this.f3930b;
                    tt3 tt3Var2 = tt3Var;
                    switch (i4) {
                        case 0:
                            PopupWindow popupWindow2 = chatActivity2.C;
                            if (popupWindow2 != null) {
                                popupWindow2.dismiss();
                            }
                            try {
                                ((ClipboardManager) chatActivity2.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(pd0.y(R.string.app_name), tt3Var2.c));
                                Toast.makeText(chatActivity2.c, pd0.y(R.string.CopySuccess), 0).show();
                                return;
                            } catch (Throwable unused) {
                                Toast.makeText(chatActivity2.c, pd0.y(R.string.CopyFailed), 0).show();
                                return;
                            }
                        default:
                            PopupWindow popupWindow3 = chatActivity2.C;
                            if (popupWindow3 != null) {
                                popupWindow3.dismiss();
                            }
                            t9.u0(chatActivity2, new yy(tt3Var2.m, i5));
                            return;
                    }
                }
            });
            inflate.measure(View.MeasureSpec.makeMeasureSpec(chatActivity.getWindow().getDecorView().getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(chatActivity.getWindow().getDecorView().getHeight(), Integer.MIN_VALUE));
            cz.G = inflate.getMeasuredWidth();
            if (z) {
                int measuredHeight = iArr[1] - inflate.getMeasuredHeight();
                if (tt3Var.f4578b) {
                    int i4 = cz.c + cz.d + cz.f1702a;
                    PopupWindow popupWindow2 = chatActivity.C;
                    if (popupWindow2 != null) {
                        popupWindow2.showAtLocation(chatActivity.Z().n, 51, i4, measuredHeight);
                    }
                    z3 = false;
                } else {
                    PopupWindow popupWindow3 = chatActivity.C;
                    if (popupWindow3 != null) {
                        popupWindow3.showAtLocation(chatActivity.Z().n, 53, cz.c, measuredHeight);
                    }
                    if (L2) {
                        z3 = false;
                        textView4.setBackground(v73.A(false, false, false));
                    } else {
                        z3 = false;
                        textView4.setBackground(v73.A(false, true, false));
                    }
                }
                textView3.setBackground(v73.A(z3, !tt3Var.f4578b, z3));
                textView.setBackground(v73.A(tt3Var.n, true, z3));
            } else {
                if (tt3Var.f4578b) {
                    int i5 = cz.c + cz.d + cz.f1702a;
                    PopupWindow popupWindow4 = chatActivity.C;
                    if (popupWindow4 != null) {
                        popupWindow4.showAtLocation(chatActivity.Z().n, 51, i5, (aVar.getHeight() + iArr[1]) - (cz.f1703b * 2));
                    }
                    z2 = false;
                } else {
                    PopupWindow popupWindow5 = chatActivity.C;
                    if (popupWindow5 != null) {
                        popupWindow5.showAtLocation(chatActivity.Z().n, 53, cz.c, (aVar.getHeight() + iArr[1]) - (cz.f1703b * 2));
                    }
                    z2 = false;
                    textView4.setBackground(v73.A(false, false, true));
                }
                textView3.setBackground(v73.A(z2, z2, z2));
                textView.setBackground(v73.A(tt3Var.n, z2, true));
            }
            chatActivity.bindInvalidate(textView);
            chatActivity.bindInvalidate(textView3);
            chatActivity.bindInvalidate(textView2);
            chatActivity.bindInvalidate(textView4);
            chatActivity.e0();
            cz.D = tt3Var;
            cz.F = z;
            chatActivity.getWindow().getDecorView().performHapticFeedback(0, 2);
            if (!A) {
                cz.B = true;
            }
            du.d(84, null);
            cz.A = ew3.A();
            chatActivity.m.f();
        }
    }

    public static String k0(long j) {
        if (j < 0) {
            return pd0.z(R.string.FormatDays, 3);
        }
        long j2 = 86400;
        long j3 = j / j2;
        if (j3 > 0) {
            long j4 = j3 + 1;
            if (j4 > 1) {
                return pd0.z(R.string.FormatDays, Long.valueOf(j4));
            }
            return pd0.y(R.string.OneDay);
        }
        long j5 = j % j2;
        long j6 = 3600;
        long j7 = j5 / j6;
        if (j7 > 0) {
            long j8 = j7 + 1;
            if (j8 > 1) {
                return pd0.z(R.string.FormatHours, Long.valueOf(j8));
            }
            return pd0.y(R.string.OneHour);
        }
        long j9 = (j5 % j6) / 60;
        if (j9 > 0) {
            return pd0.z(R.string.FormatMinutes, Long.valueOf(j9 + 1));
        }
        return pd0.y(R.string.OneMinute);
    }

    @Override // defpackage.lt3
    public final String M() {
        return "LiveChat";
    }

    @Override // defpackage.zo
    public final void a0(Bundle bundle) {
        new l12(this.c).f3046b.cancelAll();
    }

    public final void d0() {
        Class cls;
        if (this.p && (cls = ya0.g) != null) {
            ya0.H(this.c, cls);
        }
        super.onBackPressed();
        m20.v0(getWindow().getDecorView());
    }

    public final void e0() {
        View contentView;
        TextView textView;
        PopupWindow popupWindow = this.C;
        if (popupWindow == null || (contentView = popupWindow.getContentView()) == null || (textView = (TextView) contentView.findViewById(R.id.vUpgrade)) == null) {
            return;
        }
        TextView textView2 = (TextView) contentView.findViewById(R.id.vDownGrade);
        TextView textView3 = (TextView) contentView.findViewById(R.id.vCopy);
        TextView textView4 = (TextView) contentView.findViewById(R.id.tvDelete);
        if (v73.l()) {
            textView3.setTextColor(-2500135);
            textView.setTextColor(-2500135);
            textView2.setTextColor(-2500135);
            textView4.setTextColor(-2500135);
            return;
        }
        textView3.setTextColor(zf3.v(R.color.livechat_msg_menu_text));
        textView.setTextColor(zf3.v(R.color.livechat_msg_menu_text));
        textView2.setTextColor(zf3.v(R.color.livechat_msg_menu_text));
        textView4.setTextColor(zf3.v(R.color.livechat_msg_menu_text));
    }

    public final void f0(boolean z) {
        boolean z2;
        String str;
        Object obj;
        ArrayList arrayList = this.n;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            z2 = true;
            str = null;
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (!((tt3) obj).f4578b) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        tt3 tt3Var = (tt3) obj;
        boolean z3 = this.G;
        wt3 wt3Var = this.H;
        if (wt3Var == null || !TextUtils.isEmpty(wt3Var.d) || this.H.f5072b || tt3Var == null || ew3.x()) {
            z2 = false;
        }
        this.G = z2;
        cz.I = z2;
        if (z2) {
            if (tt3Var != null) {
                str = tt3Var.m;
            }
            cz.K = str;
            cz.J = this.H;
        }
        if (z && z3 != z2) {
            this.m.f();
        }
    }

    @Override // defpackage.dn, defpackage.lt3, android.app.Activity
    public final void finish() {
        super.finish();
        m20.v0(getWindow().getDecorView());
    }

    public final void g0() {
        int i;
        View q;
        int c = this.m.c() - 1;
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager = this.l;
        if (wrapContentLinearLayoutManager != null && (q = wrapContentLinearLayoutManager.q(c)) != null) {
            i = q.getMeasuredHeight();
        } else {
            i = 0;
        }
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager2 = this.l;
        if (wrapContentLinearLayoutManager2 != null) {
            wrapContentLinearLayoutManager2.a1(c, -i);
        }
    }

    public final void h0() {
        Intent addCategory = new Intent("android.intent.action.GET_CONTENT").setType("image/*").addCategory("android.intent.category.OPENABLE");
        addCategory.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/jpeg", "image/png"});
        startActivityForResult(Intent.createChooser(addCategory, pd0.y(R.string.SelectPicture)), 3841);
    }

    @Override // defpackage.zo
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final zy Z() {
        return (zy) this.A.getValue();
    }

    public final void j0() {
        Z().k.setFocusable(true);
        Z().k.setFocusableInTouchMode(true);
        Z().k.requestFocus();
        Z().k.requestFocusFromTouch();
        this.s = true;
        m20.J0(Z().k);
        Z().e.setImageResource(R.drawable.ic_bot_command);
        Z().o.postDelayed(new mx(this, 2), 200L);
        m20.u0(Z().f5569b);
    }

    @Override // defpackage.a22
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final void F(wt3 wt3Var) {
        String z;
        View view;
        int i;
        String str;
        boolean z2;
        this.D = wt3Var;
        int i2 = 0;
        int i3 = 1;
        if (wt3Var == null) {
            XTextViewNew xTextViewNew = new XTextViewNew(this.c);
            xTextViewNew.setText(pd0.y(R.string.StatusConnecting));
            xTextViewNew.setPadding(bx3.t(this.c, 20), bx3.t(this.c, 10), bx3.t(this.c, 20), bx3.t(this.c, 10));
            xTextViewNew.setTextColor(-1);
            xTextViewNew.setBackgroundColor(v73.j(1000076));
            xTextViewNew.setTypeface(Typeface.DEFAULT_BOLD);
            xTextViewNew.setTextSize(2, 18.0f);
            xTextViewNew.setGravity(17);
            view = xTextViewNew;
        } else if (!TextUtils.isEmpty(wt3Var.d)) {
            XTextViewNew xTextViewNew2 = new XTextViewNew(this.c);
            xTextViewNew2.setText(pd0.y(R.string.ChatNoConnection));
            xTextViewNew2.setPadding(bx3.t(this.c, 20), bx3.t(this.c, 10), bx3.t(this.c, 20), bx3.t(this.c, 10));
            xTextViewNew2.setTextColor(-1);
            xTextViewNew2.setBackgroundColor(v73.j(1000076));
            xTextViewNew2.setGravity(17);
            view = xTextViewNew2;
        } else if (wt3Var.f5072b) {
            XTextViewNew xTextViewNew3 = new XTextViewNew(this.c);
            wx2.f5083a = wt3Var.f5071a;
            if (ew3.X()) {
                xTextViewNew3.setText(pd0.z(R.string.ChatOnlineVIP, wt3Var.f5071a));
            } else {
                xTextViewNew3.setText(pd0.y(R.string.ChatOnline));
            }
            xTextViewNew3.setPadding(bx3.t(this.c, 20), bx3.t(this.c, 10), bx3.t(this.c, 20), bx3.t(this.c, 10));
            xTextViewNew3.setTextColor(-1);
            xTextViewNew3.setBackgroundColor(v73.j(1000074));
            xTextViewNew3.setGravity(17);
            xTextViewNew3.setTypeface(Typeface.DEFAULT_BOLD);
            du.d(17, null);
            view = xTextViewNew3;
        } else {
            View inflate = LayoutInflater.from(this.c).inflate(R.layout.layout_livechat_offline, (ViewGroup) null);
            if (ew3.X()) {
                ((XTextViewNew) inflate.findViewById(R.id.tvSubTitle)).setText(pd0.y(R.string.ChatOfflineSubTitle));
                z = pd0.z(R.string.ChatOnlineCountdownVIP, wt3Var.f5071a, k0(wt3Var.c));
            } else {
                z = pd0.z(R.string.ChatOnlineCountdown, k0(wt3Var.c));
            }
            fl.g(this, inflate, 1000075);
            ((XTextViewNew) inflate.findViewById(R.id.tvTitle)).setText(z);
            du.d(17, null);
            mx mxVar = this.E;
            Handler handler = this.F;
            if (mxVar != null) {
                handler.removeCallbacks(mxVar);
            }
            long j = wt3Var.c;
            if (j > 0 && !this.d) {
                if (j / 3600 > 0) {
                    i = 3600000;
                } else {
                    i = 60000;
                }
                mx mxVar2 = new mx(this, i2);
                this.E = mxVar2;
                handler.postDelayed(mxVar2, i);
            }
            view = inflate;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(Z().n.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Z().n.getMeasuredHeight(), Integer.MIN_VALUE));
        view.setId(R.id.llStatusTip);
        View findViewById = Z().p.findViewById(R.id.llStatusTip);
        if (findViewById != null) {
            Z().p.removeView(findViewById);
        }
        if (Z().p.findViewById(R.id.notificationDisableTip) != null) {
            Z().p.addView(view, 0);
        } else {
            Z().p.addView(view);
        }
        Z().n.post(new mx(this, i3));
        if (wt3Var != null && (str = wt3Var.d) != null) {
            if (str.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                i2 = 1;
            }
        }
        if (i2 != 0) {
            ArrayList arrayList = this.u;
            arrayList.clear();
            c20.E0(arrayList, wt3Var.e);
        }
        this.H = wt3Var;
        f0(true);
    }

    public final void m0(ut3 ut3Var) {
        zf3.d(this, vl0.c, new qy(ut3Var, null), 2);
    }

    public final void n0() {
        int i;
        RecyclerView recyclerView = Z().o;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            f70 f70Var = (f70) layoutParams;
            if (this.t <= bx3.y(this.c)) {
                getWindow().getDecorView().getGlobalVisibleRect(new Rect());
                this.t = getWindow().getDecorView().getHeight() - Z().l.getBottom();
            }
            if (this.t <= bx3.y(this.c)) {
                i = tf3.K(300);
            } else {
                i = this.t;
            }
            f70Var.Q = i;
            recyclerView.setLayoutParams(f70Var);
            m20.v0(Z().k);
            m20.Y0(Z().o);
            Z().e.setImageResource(R.drawable.ic_keyboard);
            this.s = true;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    @Override // defpackage.lt3, androidx.fragment.app.l, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        String path;
        Uri uri;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 3841) {
            lt3 lt3Var = this.c;
            Uri data = intent.getData();
            if (DocumentsContract.isDocumentUri(lt3Var, data)) {
                if ("com.android.externalstorage.documents".equals(data.getAuthority())) {
                    String[] split = DocumentsContract.getDocumentId(data).split(":");
                    if ("primary".equalsIgnoreCase(split[0])) {
                        path = Environment.getExternalStorageDirectory() + "/" + split[1];
                    }
                    path = null;
                } else if ("com.android.providers.downloads.documents".equals(data.getAuthority())) {
                    String documentId = DocumentsContract.getDocumentId(data);
                    if (!TextUtils.isEmpty(documentId)) {
                        try {
                            path = fl.B(lt3Var, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                        } catch (NumberFormatException e) {
                            Log.i("FileUtils", e.getMessage());
                        }
                    }
                    path = null;
                } else {
                    if ("com.android.providers.media.documents".equals(data.getAuthority())) {
                        String[] split2 = DocumentsContract.getDocumentId(data).split(":");
                        String str = split2[0];
                        if ("image".equals(str)) {
                            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        } else if ("video".equals(str)) {
                            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                        } else if ("audio".equals(str)) {
                            uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                        } else {
                            uri = null;
                        }
                        path = fl.B(lt3Var, uri, "_id=?", new String[]{split2[1]});
                    }
                    path = null;
                }
            } else if ("content".equalsIgnoreCase(data.getScheme())) {
                if ("com.google.android.apps.photos.content".equals(data.getAuthority())) {
                    path = data.getLastPathSegment();
                } else {
                    path = fl.B(lt3Var, data, null, null);
                }
            } else {
                if ("file".equalsIgnoreCase(data.getScheme())) {
                    path = data.getPath();
                }
                path = null;
            }
            if (path == null || !new File(path).canRead()) {
                File file = new File(lt3Var.getExternalCacheDir(), UUID.randomUUID().toString());
                try {
                    fl.v(lt3Var, data, file.getAbsolutePath());
                    path = file.getAbsolutePath();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            intent.getData();
            zf3.T(this, null, new uy(this, path, null), 3);
        }
    }

    @Override // defpackage.lt3, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        boolean z;
        PopupWindow popupWindow = this.C;
        boolean z2 = true;
        if (popupWindow != null && popupWindow.isShowing()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            PopupWindow popupWindow2 = this.C;
            if (popupWindow2 != null) {
                popupWindow2.dismiss();
                return;
            }
            return;
        }
        if (cz.M.length() <= 0) {
            z2 = false;
        }
        if (z2) {
            t9.w0(getSupportFragmentManager(), new cy(this, 2));
            return;
        }
        if (!new l12(this.c).a()) {
            bx i = hx2.i(58);
            boolean q = i.q();
            i.h();
            if (!q) {
                du.d(57, null);
                t9.u0(this, new cy(this, 3));
                return;
            }
        }
        d0();
    }

    @Override // defpackage.zo, defpackage.dn, defpackage.lt3, androidx.fragment.app.l, androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.p = getIntent().hasExtra("google.message_id");
        final int i = 3;
        if (Z().n == null) {
            finish();
        } else {
            if (ew3.X()) {
                Z().q.setText(pd0.y(R.string.VIPSupport));
            }
            fl.n(this, Z().q, 1000023);
            fl.g(this, Z().c, 1000003);
            fl.g(this, Z().l, 1000008);
            fl.n(this, Z().k, 1000013);
            fl.h(this, Z().d, 1000024);
            fl.h(this, Z().g, 1000024);
            fl.h(this, Z().f, 1000024);
            fl.h(this, Z().e, 1000024);
            fl.g(this, Z().j, 1000010);
            this.l = new WrapContentLinearLayoutManager();
            Z().n.setLayoutManager(this.l);
            final int i2 = 1;
            Z().n.setVerticalScrollBarEnabled(true);
            Z().n.setAdapter(this.m);
            Z().k.addTextChangedListener(new xn2(this, i));
            final int i3 = 0;
            Z().h.setEnabled(false);
            Z().h.setOnClickListener(new View.OnClickListener(this) { // from class: kx

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ChatActivity f3027b;

                {
                    this.f3027b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str;
                    int i4 = i3;
                    ChatActivity chatActivity = this.f3027b;
                    switch (i4) {
                        case 0:
                            int i5 = ChatActivity.L;
                            zf3.T(chatActivity, null, new wy(chatActivity, String.valueOf(chatActivity.Z().k.getText()), null), 3);
                            return;
                        case 1:
                            int i6 = ChatActivity.L;
                            chatActivity.getClass();
                            if (Build.VERSION.SDK_INT >= 33) {
                                str = "android.permission.READ_MEDIA_IMAGES";
                            } else {
                                str = "android.permission.READ_EXTERNAL_STORAGE";
                            }
                            if (x80.checkSelfPermission(chatActivity.c, str) == -1) {
                                if (a6.b(chatActivity, str)) {
                                    a6.a(chatActivity, new String[]{str}, 3842);
                                    return;
                                } else {
                                    a6.a(chatActivity, new String[]{str}, 3842);
                                    return;
                                }
                            }
                            chatActivity.h0();
                            return;
                        case 2:
                            int i7 = ChatActivity.L;
                            chatActivity.onBackPressed();
                            return;
                        case 3:
                            int i8 = ChatActivity.L;
                            chatActivity.getClass();
                            t9.u0(chatActivity, new cy(chatActivity, 0));
                            return;
                        case 4:
                            int i9 = ChatActivity.L;
                            chatActivity.Z().m.setVisibility(8);
                            chatActivity.Z().n.setPadding(0, 0, 0, 0);
                            return;
                        case 5:
                            int i10 = ChatActivity.L;
                            if (System.currentTimeMillis() - chatActivity.z >= 500) {
                                chatActivity.z = System.currentTimeMillis();
                                if (chatActivity.Z().o.isShown()) {
                                    chatActivity.j0();
                                    return;
                                }
                                ArrayList arrayList = chatActivity.v;
                                arrayList.clear();
                                arrayList.addAll(chatActivity.u);
                                chatActivity.w.f();
                                chatActivity.Z().o.f0(0);
                                chatActivity.n0();
                                return;
                            }
                            return;
                        default:
                            int i11 = ChatActivity.L;
                            chatActivity.Z().k.setFocusable(true);
                            chatActivity.Z().k.setFocusableInTouchMode(true);
                            chatActivity.j0();
                            return;
                    }
                }
            });
            Z().f.setOnClickListener(new View.OnClickListener(this) { // from class: kx

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ChatActivity f3027b;

                {
                    this.f3027b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str;
                    int i4 = i2;
                    ChatActivity chatActivity = this.f3027b;
                    switch (i4) {
                        case 0:
                            int i5 = ChatActivity.L;
                            zf3.T(chatActivity, null, new wy(chatActivity, String.valueOf(chatActivity.Z().k.getText()), null), 3);
                            return;
                        case 1:
                            int i6 = ChatActivity.L;
                            chatActivity.getClass();
                            if (Build.VERSION.SDK_INT >= 33) {
                                str = "android.permission.READ_MEDIA_IMAGES";
                            } else {
                                str = "android.permission.READ_EXTERNAL_STORAGE";
                            }
                            if (x80.checkSelfPermission(chatActivity.c, str) == -1) {
                                if (a6.b(chatActivity, str)) {
                                    a6.a(chatActivity, new String[]{str}, 3842);
                                    return;
                                } else {
                                    a6.a(chatActivity, new String[]{str}, 3842);
                                    return;
                                }
                            }
                            chatActivity.h0();
                            return;
                        case 2:
                            int i7 = ChatActivity.L;
                            chatActivity.onBackPressed();
                            return;
                        case 3:
                            int i8 = ChatActivity.L;
                            chatActivity.getClass();
                            t9.u0(chatActivity, new cy(chatActivity, 0));
                            return;
                        case 4:
                            int i9 = ChatActivity.L;
                            chatActivity.Z().m.setVisibility(8);
                            chatActivity.Z().n.setPadding(0, 0, 0, 0);
                            return;
                        case 5:
                            int i10 = ChatActivity.L;
                            if (System.currentTimeMillis() - chatActivity.z >= 500) {
                                chatActivity.z = System.currentTimeMillis();
                                if (chatActivity.Z().o.isShown()) {
                                    chatActivity.j0();
                                    return;
                                }
                                ArrayList arrayList = chatActivity.v;
                                arrayList.clear();
                                arrayList.addAll(chatActivity.u);
                                chatActivity.w.f();
                                chatActivity.Z().o.f0(0);
                                chatActivity.n0();
                                return;
                            }
                            return;
                        default:
                            int i11 = ChatActivity.L;
                            chatActivity.Z().k.setFocusable(true);
                            chatActivity.Z().k.setFocusableInTouchMode(true);
                            chatActivity.j0();
                            return;
                    }
                }
            });
            final int i4 = 2;
            Z().d.setOnClickListener(new View.OnClickListener(this) { // from class: kx

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ChatActivity f3027b;

                {
                    this.f3027b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str;
                    int i42 = i4;
                    ChatActivity chatActivity = this.f3027b;
                    switch (i42) {
                        case 0:
                            int i5 = ChatActivity.L;
                            zf3.T(chatActivity, null, new wy(chatActivity, String.valueOf(chatActivity.Z().k.getText()), null), 3);
                            return;
                        case 1:
                            int i6 = ChatActivity.L;
                            chatActivity.getClass();
                            if (Build.VERSION.SDK_INT >= 33) {
                                str = "android.permission.READ_MEDIA_IMAGES";
                            } else {
                                str = "android.permission.READ_EXTERNAL_STORAGE";
                            }
                            if (x80.checkSelfPermission(chatActivity.c, str) == -1) {
                                if (a6.b(chatActivity, str)) {
                                    a6.a(chatActivity, new String[]{str}, 3842);
                                    return;
                                } else {
                                    a6.a(chatActivity, new String[]{str}, 3842);
                                    return;
                                }
                            }
                            chatActivity.h0();
                            return;
                        case 2:
                            int i7 = ChatActivity.L;
                            chatActivity.onBackPressed();
                            return;
                        case 3:
                            int i8 = ChatActivity.L;
                            chatActivity.getClass();
                            t9.u0(chatActivity, new cy(chatActivity, 0));
                            return;
                        case 4:
                            int i9 = ChatActivity.L;
                            chatActivity.Z().m.setVisibility(8);
                            chatActivity.Z().n.setPadding(0, 0, 0, 0);
                            return;
                        case 5:
                            int i10 = ChatActivity.L;
                            if (System.currentTimeMillis() - chatActivity.z >= 500) {
                                chatActivity.z = System.currentTimeMillis();
                                if (chatActivity.Z().o.isShown()) {
                                    chatActivity.j0();
                                    return;
                                }
                                ArrayList arrayList = chatActivity.v;
                                arrayList.clear();
                                arrayList.addAll(chatActivity.u);
                                chatActivity.w.f();
                                chatActivity.Z().o.f0(0);
                                chatActivity.n0();
                                return;
                            }
                            return;
                        default:
                            int i11 = ChatActivity.L;
                            chatActivity.Z().k.setFocusable(true);
                            chatActivity.Z().k.setFocusableInTouchMode(true);
                            chatActivity.j0();
                            return;
                    }
                }
            });
            Z().g.setOnClickListener(new View.OnClickListener(this) { // from class: kx

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ChatActivity f3027b;

                {
                    this.f3027b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str;
                    int i42 = i;
                    ChatActivity chatActivity = this.f3027b;
                    switch (i42) {
                        case 0:
                            int i5 = ChatActivity.L;
                            zf3.T(chatActivity, null, new wy(chatActivity, String.valueOf(chatActivity.Z().k.getText()), null), 3);
                            return;
                        case 1:
                            int i6 = ChatActivity.L;
                            chatActivity.getClass();
                            if (Build.VERSION.SDK_INT >= 33) {
                                str = "android.permission.READ_MEDIA_IMAGES";
                            } else {
                                str = "android.permission.READ_EXTERNAL_STORAGE";
                            }
                            if (x80.checkSelfPermission(chatActivity.c, str) == -1) {
                                if (a6.b(chatActivity, str)) {
                                    a6.a(chatActivity, new String[]{str}, 3842);
                                    return;
                                } else {
                                    a6.a(chatActivity, new String[]{str}, 3842);
                                    return;
                                }
                            }
                            chatActivity.h0();
                            return;
                        case 2:
                            int i7 = ChatActivity.L;
                            chatActivity.onBackPressed();
                            return;
                        case 3:
                            int i8 = ChatActivity.L;
                            chatActivity.getClass();
                            t9.u0(chatActivity, new cy(chatActivity, 0));
                            return;
                        case 4:
                            int i9 = ChatActivity.L;
                            chatActivity.Z().m.setVisibility(8);
                            chatActivity.Z().n.setPadding(0, 0, 0, 0);
                            return;
                        case 5:
                            int i10 = ChatActivity.L;
                            if (System.currentTimeMillis() - chatActivity.z >= 500) {
                                chatActivity.z = System.currentTimeMillis();
                                if (chatActivity.Z().o.isShown()) {
                                    chatActivity.j0();
                                    return;
                                }
                                ArrayList arrayList = chatActivity.v;
                                arrayList.clear();
                                arrayList.addAll(chatActivity.u);
                                chatActivity.w.f();
                                chatActivity.Z().o.f0(0);
                                chatActivity.n0();
                                return;
                            }
                            return;
                        default:
                            int i11 = ChatActivity.L;
                            chatActivity.Z().k.setFocusable(true);
                            chatActivity.Z().k.setFocusableInTouchMode(true);
                            chatActivity.j0();
                            return;
                    }
                }
            });
            final int i5 = 4;
            Z().i.setOnClickListener(new View.OnClickListener(this) { // from class: kx

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ChatActivity f3027b;

                {
                    this.f3027b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str;
                    int i42 = i5;
                    ChatActivity chatActivity = this.f3027b;
                    switch (i42) {
                        case 0:
                            int i52 = ChatActivity.L;
                            zf3.T(chatActivity, null, new wy(chatActivity, String.valueOf(chatActivity.Z().k.getText()), null), 3);
                            return;
                        case 1:
                            int i6 = ChatActivity.L;
                            chatActivity.getClass();
                            if (Build.VERSION.SDK_INT >= 33) {
                                str = "android.permission.READ_MEDIA_IMAGES";
                            } else {
                                str = "android.permission.READ_EXTERNAL_STORAGE";
                            }
                            if (x80.checkSelfPermission(chatActivity.c, str) == -1) {
                                if (a6.b(chatActivity, str)) {
                                    a6.a(chatActivity, new String[]{str}, 3842);
                                    return;
                                } else {
                                    a6.a(chatActivity, new String[]{str}, 3842);
                                    return;
                                }
                            }
                            chatActivity.h0();
                            return;
                        case 2:
                            int i7 = ChatActivity.L;
                            chatActivity.onBackPressed();
                            return;
                        case 3:
                            int i8 = ChatActivity.L;
                            chatActivity.getClass();
                            t9.u0(chatActivity, new cy(chatActivity, 0));
                            return;
                        case 4:
                            int i9 = ChatActivity.L;
                            chatActivity.Z().m.setVisibility(8);
                            chatActivity.Z().n.setPadding(0, 0, 0, 0);
                            return;
                        case 5:
                            int i10 = ChatActivity.L;
                            if (System.currentTimeMillis() - chatActivity.z >= 500) {
                                chatActivity.z = System.currentTimeMillis();
                                if (chatActivity.Z().o.isShown()) {
                                    chatActivity.j0();
                                    return;
                                }
                                ArrayList arrayList = chatActivity.v;
                                arrayList.clear();
                                arrayList.addAll(chatActivity.u);
                                chatActivity.w.f();
                                chatActivity.Z().o.f0(0);
                                chatActivity.n0();
                                return;
                            }
                            return;
                        default:
                            int i11 = ChatActivity.L;
                            chatActivity.Z().k.setFocusable(true);
                            chatActivity.Z().k.setFocusableInTouchMode(true);
                            chatActivity.j0();
                            return;
                    }
                }
            });
            final int i6 = 5;
            Z().e.setOnClickListener(new View.OnClickListener(this) { // from class: kx

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ChatActivity f3027b;

                {
                    this.f3027b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str;
                    int i42 = i6;
                    ChatActivity chatActivity = this.f3027b;
                    switch (i42) {
                        case 0:
                            int i52 = ChatActivity.L;
                            zf3.T(chatActivity, null, new wy(chatActivity, String.valueOf(chatActivity.Z().k.getText()), null), 3);
                            return;
                        case 1:
                            int i62 = ChatActivity.L;
                            chatActivity.getClass();
                            if (Build.VERSION.SDK_INT >= 33) {
                                str = "android.permission.READ_MEDIA_IMAGES";
                            } else {
                                str = "android.permission.READ_EXTERNAL_STORAGE";
                            }
                            if (x80.checkSelfPermission(chatActivity.c, str) == -1) {
                                if (a6.b(chatActivity, str)) {
                                    a6.a(chatActivity, new String[]{str}, 3842);
                                    return;
                                } else {
                                    a6.a(chatActivity, new String[]{str}, 3842);
                                    return;
                                }
                            }
                            chatActivity.h0();
                            return;
                        case 2:
                            int i7 = ChatActivity.L;
                            chatActivity.onBackPressed();
                            return;
                        case 3:
                            int i8 = ChatActivity.L;
                            chatActivity.getClass();
                            t9.u0(chatActivity, new cy(chatActivity, 0));
                            return;
                        case 4:
                            int i9 = ChatActivity.L;
                            chatActivity.Z().m.setVisibility(8);
                            chatActivity.Z().n.setPadding(0, 0, 0, 0);
                            return;
                        case 5:
                            int i10 = ChatActivity.L;
                            if (System.currentTimeMillis() - chatActivity.z >= 500) {
                                chatActivity.z = System.currentTimeMillis();
                                if (chatActivity.Z().o.isShown()) {
                                    chatActivity.j0();
                                    return;
                                }
                                ArrayList arrayList = chatActivity.v;
                                arrayList.clear();
                                arrayList.addAll(chatActivity.u);
                                chatActivity.w.f();
                                chatActivity.Z().o.f0(0);
                                chatActivity.n0();
                                return;
                            }
                            return;
                        default:
                            int i11 = ChatActivity.L;
                            chatActivity.Z().k.setFocusable(true);
                            chatActivity.Z().k.setFocusableInTouchMode(true);
                            chatActivity.j0();
                            return;
                    }
                }
            });
            Z().k.setHint(pd0.y(R.string.SupportInputHint));
            Z().k.setFocusable(false);
            Z().k.setFocusableInTouchMode(false);
            final int i7 = 6;
            Z().k.setOnClickListener(new View.OnClickListener(this) { // from class: kx

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ChatActivity f3027b;

                {
                    this.f3027b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str;
                    int i42 = i7;
                    ChatActivity chatActivity = this.f3027b;
                    switch (i42) {
                        case 0:
                            int i52 = ChatActivity.L;
                            zf3.T(chatActivity, null, new wy(chatActivity, String.valueOf(chatActivity.Z().k.getText()), null), 3);
                            return;
                        case 1:
                            int i62 = ChatActivity.L;
                            chatActivity.getClass();
                            if (Build.VERSION.SDK_INT >= 33) {
                                str = "android.permission.READ_MEDIA_IMAGES";
                            } else {
                                str = "android.permission.READ_EXTERNAL_STORAGE";
                            }
                            if (x80.checkSelfPermission(chatActivity.c, str) == -1) {
                                if (a6.b(chatActivity, str)) {
                                    a6.a(chatActivity, new String[]{str}, 3842);
                                    return;
                                } else {
                                    a6.a(chatActivity, new String[]{str}, 3842);
                                    return;
                                }
                            }
                            chatActivity.h0();
                            return;
                        case 2:
                            int i72 = ChatActivity.L;
                            chatActivity.onBackPressed();
                            return;
                        case 3:
                            int i8 = ChatActivity.L;
                            chatActivity.getClass();
                            t9.u0(chatActivity, new cy(chatActivity, 0));
                            return;
                        case 4:
                            int i9 = ChatActivity.L;
                            chatActivity.Z().m.setVisibility(8);
                            chatActivity.Z().n.setPadding(0, 0, 0, 0);
                            return;
                        case 5:
                            int i10 = ChatActivity.L;
                            if (System.currentTimeMillis() - chatActivity.z >= 500) {
                                chatActivity.z = System.currentTimeMillis();
                                if (chatActivity.Z().o.isShown()) {
                                    chatActivity.j0();
                                    return;
                                }
                                ArrayList arrayList = chatActivity.v;
                                arrayList.clear();
                                arrayList.addAll(chatActivity.u);
                                chatActivity.w.f();
                                chatActivity.Z().o.f0(0);
                                chatActivity.n0();
                                return;
                            }
                            return;
                        default:
                            int i11 = ChatActivity.L;
                            chatActivity.Z().k.setFocusable(true);
                            chatActivity.Z().k.setFocusableInTouchMode(true);
                            chatActivity.j0();
                            return;
                    }
                }
            });
            Z().i.getPaint().setFlags(8);
            this.o.d(this, this);
            RecyclerView recyclerView = Z().n;
            recyclerView.q.add(new jy(this, this.c, 1));
            Z().n.setOnTouchListener(new jo0(this, 2));
            Z().n.j(new xv0(this, i2));
            Z().n.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: lx
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                    ChatActivity chatActivity = ChatActivity.this;
                    if (chatActivity.s) {
                        chatActivity.g0();
                        chatActivity.s = false;
                    }
                }
            });
            Z().n.i(new px1(i3));
            n0();
            Z().o.setLayoutManager(new WrapContentLinearLayoutManager());
            RecyclerView recyclerView2 = Z().o;
            rv0 rv0Var = this.w;
            recyclerView2.setAdapter(rv0Var);
            Z().o.i(new sv0());
            RecyclerView recyclerView3 = Z().o;
            recyclerView3.q.add(new jy(this, this.c, 0));
            ArrayList arrayList = this.u;
            bx i8 = hx2.i(40);
            int t = (int) i8.t();
            ut3[] ut3VarArr = new ut3[t];
            while (i3 < t) {
                ut3 ut3Var = new ut3();
                tf3.p(i8, ut3Var);
                ut3VarArr[i3] = ut3Var;
                i3++;
            }
            i8.h();
            c20.E0(arrayList, ut3VarArr);
            this.v.addAll(arrayList);
            rv0Var.f();
            rv0Var.f2091a.registerObserver(new gq2(this, i2));
        }
        zf3.T(this, null, new fy(this, null), 3);
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        wx2.f5083a = "";
        ((HashMap) wx2.f5084b.getValue()).clear();
        du.d(15, null);
        mx mxVar = this.E;
        if (mxVar != null) {
            this.F.removeCallbacks(mxVar);
        }
    }

    @Override // defpackage.lt3, androidx.fragment.app.l, android.app.Activity
    public final void onPause() {
        super.onPause();
        cz.v.i(0);
        getSharedPreferences("message", 0).edit().putInt("unread_message", 0).apply();
    }

    @Override // androidx.fragment.app.l, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        boolean z;
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 3842) {
            if (strArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && iArr[0] != -1) {
                h0();
            } else if (!a6.b(this, "android.permission.READ_EXTERNAL_STORAGE")) {
                t9.u0(this, new cy(this, 4));
            }
        }
    }

    @Override // defpackage.lt3, androidx.fragment.app.l, android.app.Activity
    public final void onResume() {
        super.onResume();
        cz.v.i(0);
        getSharedPreferences("message", 0).edit().putInt("unread_message", 0).apply();
        if (new l12(this.c).a()) {
            View findViewById = Z().p.findViewById(R.id.notificationDisableTip);
            if (findViewById != null) {
                Z().p.removeView(findViewById);
            }
        } else if (Z().p.findViewById(R.id.notificationDisableTip) == null) {
            FrameLayout frameLayout = Z().p;
            j12 j12Var = new j12(this.c, this);
            fl.g(this, j12Var, 1000075);
            frameLayout.addView(j12Var);
        }
        du.d(17, null);
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onStart() {
        super.onStart();
        int i = cz.f1702a;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        cz.f1702a = (int) ((30.0f * f) + 0.5d);
        float f2 = 10.0f * f;
        int i2 = (int) (f2 + 0.5d);
        cz.f1703b = i2;
        cz.c = (int) ((15.0f * f) + 0.5d);
        cz.d = i2;
        cz.i = f2 + 0.5f;
        cz.e = (int) ((16.0f * f) + 0.5d);
        cz.g = i2;
        int i3 = (int) ((12.0f * f) + 0.5d);
        cz.h = i3;
        float f3 = displayMetrics.widthPixels;
        int i4 = (int) (0.7f * f3);
        cz.f = i4 - (i3 * 2);
        cz.p = i4;
        cz.o = (int) (displayMetrics.heightPixels * 0.5f);
        cz.j = (int) ((20.0f * f) + 0.5d);
        cz.k = (int) ((2.0f * f) + 0.5d);
        cz.l = (int) ((f * 5.0f) + 0.5d);
        cz.m = (int) (f3 * 0.82f);
        cz.n = i2;
        Drawable drawable = getResources().getDrawable(R.drawable.ic_livechat_avatar);
        cz.q = drawable;
        int i5 = cz.f1702a;
        drawable.setBounds(0, 0, i5, i5);
        Drawable drawable2 = getResources().getDrawable(R.drawable.ic_avatar_robot);
        cz.r = drawable2;
        int i6 = cz.f1702a;
        drawable2.setBounds(0, 0, i6, i6);
        cz.s = getResources().getDrawable(R.drawable.ic_message_resend);
        cz.t = getResources().getDrawable(R.drawable.ic_message_sending);
        sp0 sp0Var = new sp0();
        cz.u = sp0Var;
        sp0Var.setCallback(new tp0());
        cz.N = Pattern.compile("<a href=\"(\\w+)://\">((\\w+))</a>");
        cz.O = new ky(this);
        zf3.T(this, null, new ey(this, null), 3);
        t9.f4466a = this.I;
        t9.g();
        zf3.T(this, vl0.f4855b, new ny(null), 2);
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onStop() {
        Z().n.l0();
        super.onStop();
        cz.q = null;
        cz.s = null;
        cz.t = null;
        cz.u = null;
        cz.N = null;
        cz.O = null;
        if (t9.f4466a == this.I) {
            t9.f4466a = null;
        }
        cz.L.clear();
    }

    @Override // defpackage.dn, defpackage.w73
    public final void p(boolean z) {
        e0();
        super.p(z);
    }
}
