package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import java.lang.reflect.GenericDeclaration;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class aa3 implements s30 {

    /* renamed from: a, reason: collision with root package name */
    public Object f44a;

    /* renamed from: b, reason: collision with root package name */
    public Object f45b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public aa3(int i) {
    }

    @Override // defpackage.s30
    public final Object a(Class cls) {
        if (((Set) this.f44a).contains(rd2.a(cls))) {
            Object a2 = ((s30) this.g).a(cls);
            if (!cls.equals(hc2.class)) {
                return a2;
            }
            return new mk2();
        }
        throw new j11(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // defpackage.s30
    public final Set b(rd2 rd2Var) {
        if (((Set) this.d).contains(rd2Var)) {
            return ((s30) this.g).b(rd2Var);
        }
        throw new j11(String.format("Attempting to request an undeclared dependency Set<%s>.", rd2Var));
    }

    @Override // defpackage.s30
    public final fb2 c(Class cls) {
        return e(rd2.a(cls));
    }

    @Override // defpackage.s30
    public final sj0 d(rd2 rd2Var) {
        if (((Set) this.c).contains(rd2Var)) {
            return ((s30) this.g).d(rd2Var);
        }
        throw new j11(String.format("Attempting to request an undeclared dependency Deferred<%s>.", rd2Var));
    }

    @Override // defpackage.s30
    public final fb2 e(rd2 rd2Var) {
        if (((Set) this.f45b).contains(rd2Var)) {
            return ((s30) this.g).e(rd2Var);
        }
        throw new j11(String.format("Attempting to request an undeclared dependency Provider<%s>.", rd2Var));
    }

    @Override // defpackage.s30
    public final Object f(rd2 rd2Var) {
        if (((Set) this.f44a).contains(rd2Var)) {
            return ((s30) this.g).f(rd2Var);
        }
        throw new j11(String.format("Attempting to request an undeclared dependency %s.", rd2Var));
    }

    public final bm g() {
        String str;
        if (((c52) this.f45b) == null) {
            str = " registrationStatus";
        } else {
            str = "";
        }
        if (((Long) this.e) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.f) == null) {
            str = p71.l(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new bm((String) this.f44a, (c52) this.f45b, (String) this.c, (String) this.d, ((Long) this.e).longValue(), ((Long) this.f).longValue(), (String) this.g);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final sj0 h(Class cls) {
        return d(rd2.a(cls));
    }

    public final g33 i(int i) {
        g33 g33Var;
        g33 kt0Var;
        if (((Map) this.f45b).containsKey(Integer.valueOf(i))) {
            return (g33) ((Map) this.f45b).get(Integer.valueOf(i));
        }
        final yd0 yd0Var = (yd0) this.e;
        yd0Var.getClass();
        g33 g33Var2 = null;
        try {
            if (i != 0) {
                final int i2 = 1;
                if (i != 1) {
                    final int i3 = 2;
                    if (i != 2) {
                        final int i4 = 3;
                        if (i != 3) {
                            if (i == 4) {
                                kt0Var = new g33() { // from class: gi0
                                    @Override // defpackage.g33
                                    public final Object get() {
                                        int i5 = i4;
                                        yd0 yd0Var2 = yd0Var;
                                        Object obj = this;
                                        switch (i5) {
                                            case 0:
                                                return ii0.d((Class) obj, yd0Var2);
                                            case 1:
                                                return ii0.d((Class) obj, yd0Var2);
                                            case 2:
                                                return ii0.d((Class) obj, yd0Var2);
                                            default:
                                                return new w92(yd0Var2, (gv0) ((aa3) obj).f44a);
                                        }
                                    }
                                };
                            }
                        } else {
                            kt0Var = new kt0(Class.forName("com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(qt1.class), i4);
                        }
                        g33Var2 = kt0Var;
                    } else {
                        final GenericDeclaration asSubclass = Class.forName("com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(qt1.class);
                        g33Var = new g33() { // from class: gi0
                            @Override // defpackage.g33
                            public final Object get() {
                                int i5 = i3;
                                yd0 yd0Var2 = yd0Var;
                                Object obj = asSubclass;
                                switch (i5) {
                                    case 0:
                                        return ii0.d((Class) obj, yd0Var2);
                                    case 1:
                                        return ii0.d((Class) obj, yd0Var2);
                                    case 2:
                                        return ii0.d((Class) obj, yd0Var2);
                                    default:
                                        return new w92(yd0Var2, (gv0) ((aa3) obj).f44a);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration asSubclass2 = Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(qt1.class);
                    g33Var = new g33() { // from class: gi0
                        @Override // defpackage.g33
                        public final Object get() {
                            int i5 = i2;
                            yd0 yd0Var2 = yd0Var;
                            Object obj = asSubclass2;
                            switch (i5) {
                                case 0:
                                    return ii0.d((Class) obj, yd0Var2);
                                case 1:
                                    return ii0.d((Class) obj, yd0Var2);
                                case 2:
                                    return ii0.d((Class) obj, yd0Var2);
                                default:
                                    return new w92(yd0Var2, (gv0) ((aa3) obj).f44a);
                            }
                        }
                    };
                }
                g33Var2 = g33Var;
            } else {
                final GenericDeclaration asSubclass3 = Class.forName("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(qt1.class);
                final int i5 = 0;
                g33Var2 = new g33() { // from class: gi0
                    @Override // defpackage.g33
                    public final Object get() {
                        int i52 = i5;
                        yd0 yd0Var2 = yd0Var;
                        Object obj = asSubclass3;
                        switch (i52) {
                            case 0:
                                return ii0.d((Class) obj, yd0Var2);
                            case 1:
                                return ii0.d((Class) obj, yd0Var2);
                            case 2:
                                return ii0.d((Class) obj, yd0Var2);
                            default:
                                return new w92(yd0Var2, (gv0) ((aa3) obj).f44a);
                        }
                    }
                };
            }
        } catch (ClassNotFoundException unused) {
        }
        ((Map) this.f45b).put(Integer.valueOf(i), g33Var2);
        if (g33Var2 != null) {
            ((Set) this.c).add(Integer.valueOf(i));
        }
        return g33Var2;
    }

    public final Set j(Class cls) {
        return b(rd2.a(cls));
    }

    public final void k(c52 c52Var) {
        if (c52Var != null) {
            this.f45b = c52Var;
            return;
        }
        throw new NullPointerException("Null registrationStatus");
    }

    public aa3(bm bmVar) {
        this.f44a = bmVar.f486a;
        this.f45b = bmVar.f487b;
        this.c = bmVar.c;
        this.d = bmVar.d;
        this.e = Long.valueOf(bmVar.e);
        this.f = Long.valueOf(bmVar.f);
        this.g = bmVar.g;
    }

    public /* synthetic */ aa3(s4 s4Var) {
        this.f44a = this;
        iy3 iy3Var = new iy3(s4Var);
        this.f45b = iy3Var;
        yw3 a2 = xw3.a(new jx3(iy3Var, 1));
        this.c = a2;
        this.d = xw3.a(new uy0(14, (yw3) this.f45b, a2));
        yw3 a3 = xw3.a(new jx3((yw3) this.f45b, 0));
        this.e = a3;
        yw3 a4 = xw3.a(new y33((yw3) this.d, a3, (yw3) this.f45b, 20));
        this.f = a4;
        this.g = xw3.a(new uo(a4));
    }

    public aa3(h30 h30Var, b40 b40Var) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (kk0 kk0Var : h30Var.c) {
            int i = kk0Var.c;
            boolean z = i == 0;
            int i2 = kk0Var.f2961b;
            rd2 rd2Var = kk0Var.f2960a;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(rd2Var);
                } else {
                    hashSet.add(rd2Var);
                }
            } else if (i == 2) {
                hashSet3.add(rd2Var);
            } else if (i2 == 2) {
                hashSet5.add(rd2Var);
            } else {
                hashSet2.add(rd2Var);
            }
        }
        Set set = h30Var.g;
        if (!set.isEmpty()) {
            hashSet.add(rd2.a(hc2.class));
        }
        this.f44a = Collections.unmodifiableSet(hashSet);
        this.f45b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = Collections.unmodifiableSet(hashSet5);
        this.f = set;
        this.g = b40Var;
    }

    public aa3(Context context) {
        this.d = new WindowManager.LayoutParams();
        this.e = new Rect();
        this.f = new int[2];
        this.g = new int[2];
        this.f44a = context;
        View inflate = LayoutInflater.from(context).inflate(kf2.abc_tooltip, (ViewGroup) null);
        this.f45b = inflate;
        this.c = (TextView) inflate.findViewById(ye2.message);
        ((WindowManager.LayoutParams) this.d).setTitle(aa3.class.getSimpleName());
        ((WindowManager.LayoutParams) this.d).packageName = ((Context) this.f44a).getPackageName();
        Object obj = this.d;
        ((WindowManager.LayoutParams) obj).type = 1002;
        ((WindowManager.LayoutParams) obj).width = -2;
        ((WindowManager.LayoutParams) obj).height = -2;
        ((WindowManager.LayoutParams) obj).format = -3;
        ((WindowManager.LayoutParams) obj).windowAnimations = rf2.Animation_AppCompat_Tooltip;
        ((WindowManager.LayoutParams) obj).flags = 24;
    }

    public aa3(kh0 kh0Var) {
        this.f44a = kh0Var;
        this.f45b = new HashMap();
        this.c = new HashSet();
        this.d = new HashMap();
    }
}
