package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.p;
import defpackage.ao1;
import defpackage.b32;
import defpackage.b7;
import defpackage.bk1;
import defpackage.bn2;
import defpackage.c21;
import defpackage.cl0;
import defpackage.df2;
import defpackage.e7;
import defpackage.hx2;
import defpackage.i21;
import defpackage.j21;
import defpackage.j30;
import defpackage.k21;
import defpackage.l21;
import defpackage.lm3;
import defpackage.lu1;
import defpackage.m21;
import defpackage.p11;
import defpackage.p22;
import defpackage.p71;
import defpackage.q22;
import defpackage.r11;
import defpackage.s11;
import defpackage.t11;
import defpackage.t22;
import defpackage.tu;
import defpackage.u11;
import defpackage.uj1;
import defpackage.v11;
import defpackage.v31;
import defpackage.w11;
import defpackage.x11;
import defpackage.x22;
import defpackage.y11;
import defpackage.y22;
import defpackage.y33;
import defpackage.y6;
import defpackage.y70;
import defpackage.z11;
import defpackage.z6;
import defpackage.zm2;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class p {
    public b7 A;
    public b7 B;
    public ArrayDeque C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public q L;
    public final cl0 M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f238b;
    public ArrayList d;
    public ArrayList e;
    public androidx.activity.b g;
    public final s11 l;
    public final CopyOnWriteArrayList m;
    public final t11 n;
    public final t11 o;
    public final t11 p;
    public final t11 q;
    public final u11 r;
    public int s;
    public r11 t;
    public p11 u;
    public Fragment v;
    public Fragment w;
    public final v11 x;
    public final o y;
    public b7 z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f237a = new ArrayList();
    public final s c = new s();
    public final n f = new n(this);
    public final p22 h = new p22(this);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = Collections.synchronizedMap(new HashMap());
    public final Map k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [t11] */
    /* JADX WARN: Type inference failed for: r0v13, types: [t11] */
    /* JADX WARN: Type inference failed for: r0v14, types: [t11] */
    /* JADX WARN: Type inference failed for: r0v15, types: [t11] */
    public p() {
        Collections.synchronizedMap(new HashMap());
        this.l = new s11(this);
        this.m = new CopyOnWriteArrayList();
        final int i = 0;
        this.n = new y70(this) { // from class: t11

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f4439b;

            {
                this.f4439b = this;
            }

            @Override // defpackage.y70
            public final void accept(Object obj) {
                int i2 = i;
                p pVar = this.f4439b;
                switch (i2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (pVar.K()) {
                            pVar.h(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (pVar.K() && num.intValue() == 80) {
                            pVar.l(false);
                            return;
                        }
                        return;
                    case 2:
                        vx1 vx1Var = (vx1) obj;
                        if (pVar.K()) {
                            pVar.m(vx1Var.f4910a, false);
                            return;
                        }
                        return;
                    default:
                        h52 h52Var = (h52) obj;
                        if (pVar.K()) {
                            pVar.r(h52Var.f2369a, false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i2 = 1;
        this.o = new y70(this) { // from class: t11

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f4439b;

            {
                this.f4439b = this;
            }

            @Override // defpackage.y70
            public final void accept(Object obj) {
                int i22 = i2;
                p pVar = this.f4439b;
                switch (i22) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (pVar.K()) {
                            pVar.h(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (pVar.K() && num.intValue() == 80) {
                            pVar.l(false);
                            return;
                        }
                        return;
                    case 2:
                        vx1 vx1Var = (vx1) obj;
                        if (pVar.K()) {
                            pVar.m(vx1Var.f4910a, false);
                            return;
                        }
                        return;
                    default:
                        h52 h52Var = (h52) obj;
                        if (pVar.K()) {
                            pVar.r(h52Var.f2369a, false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i3 = 2;
        this.p = new y70(this) { // from class: t11

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f4439b;

            {
                this.f4439b = this;
            }

            @Override // defpackage.y70
            public final void accept(Object obj) {
                int i22 = i3;
                p pVar = this.f4439b;
                switch (i22) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (pVar.K()) {
                            pVar.h(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (pVar.K() && num.intValue() == 80) {
                            pVar.l(false);
                            return;
                        }
                        return;
                    case 2:
                        vx1 vx1Var = (vx1) obj;
                        if (pVar.K()) {
                            pVar.m(vx1Var.f4910a, false);
                            return;
                        }
                        return;
                    default:
                        h52 h52Var = (h52) obj;
                        if (pVar.K()) {
                            pVar.r(h52Var.f2369a, false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i4 = 3;
        this.q = new y70(this) { // from class: t11

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f4439b;

            {
                this.f4439b = this;
            }

            @Override // defpackage.y70
            public final void accept(Object obj) {
                int i22 = i4;
                p pVar = this.f4439b;
                switch (i22) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (pVar.K()) {
                            pVar.h(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (pVar.K() && num.intValue() == 80) {
                            pVar.l(false);
                            return;
                        }
                        return;
                    case 2:
                        vx1 vx1Var = (vx1) obj;
                        if (pVar.K()) {
                            pVar.m(vx1Var.f4910a, false);
                            return;
                        }
                        return;
                    default:
                        h52 h52Var = (h52) obj;
                        if (pVar.K()) {
                            pVar.r(h52Var.f2369a, false);
                            return;
                        }
                        return;
                }
            }
        };
        this.r = new u11(this);
        this.s = -1;
        this.x = new v11(this);
        this.y = new o(this, i4);
        this.C = new ArrayDeque();
        this.M = new cl0(this, 1);
    }

    public static boolean I(int i) {
        if (Log.isLoggable("FragmentManager", i)) {
            return true;
        }
        return false;
    }

    public static boolean J(Fragment fragment) {
        boolean z;
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        Iterator it = fragment.mChildFragmentManager.c.e().iterator();
        boolean z2 = false;
        while (true) {
            if (it.hasNext()) {
                Fragment fragment2 = (Fragment) it.next();
                if (fragment2 != null) {
                    z2 = J(fragment2);
                }
                if (z2) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return true;
        }
        return false;
    }

    public static boolean L(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        p pVar = fragment.mFragmentManager;
        if (fragment.equals(pVar.w) && L(pVar.v)) {
            return true;
        }
        return false;
    }

    public final Fragment A(String str) {
        return this.c.b(str);
    }

    public final Fragment B(int i) {
        s sVar = this.c;
        ArrayList arrayList = sVar.f241a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = (Fragment) arrayList.get(size);
                if (fragment != null && fragment.mFragmentId == i) {
                    return fragment;
                }
            } else {
                for (r rVar : sVar.f242b.values()) {
                    if (rVar != null) {
                        Fragment fragment2 = rVar.c;
                        if (fragment2.mFragmentId == i) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final Fragment C(String str) {
        s sVar = this.c;
        if (str != null) {
            ArrayList arrayList = sVar.f241a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Fragment fragment = (Fragment) arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (r rVar : sVar.f242b.values()) {
                if (rVar != null) {
                    Fragment fragment2 = rVar.c;
                    if (str.equals(fragment2.mTag)) {
                        return fragment2;
                    }
                }
            }
        } else {
            sVar.getClass();
        }
        return null;
    }

    public final void D() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.e) {
                eVar.e = false;
                eVar.e();
            }
        }
    }

    public final int E() {
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final ViewGroup F(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.u.c()) {
            View b2 = this.u.b(fragment.mContainerId);
            if (b2 instanceof ViewGroup) {
                return (ViewGroup) b2;
            }
        }
        return null;
    }

    public final v11 G() {
        Fragment fragment = this.v;
        if (fragment != null) {
            return fragment.mFragmentManager.G();
        }
        return this.x;
    }

    public final o H() {
        Fragment fragment = this.v;
        if (fragment != null) {
            return fragment.mFragmentManager.H();
        }
        return this.y;
    }

    public final boolean K() {
        Fragment fragment = this.v;
        if (fragment == null) {
            return true;
        }
        if (fragment.isAdded() && this.v.getParentFragmentManager().K()) {
            return true;
        }
        return false;
    }

    public final boolean M() {
        if (!this.E && !this.F) {
            return false;
        }
        return true;
    }

    public final void N(int i, boolean z) {
        HashMap hashMap;
        r11 r11Var;
        if (this.t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!z && i == this.s) {
            return;
        }
        this.s = i;
        s sVar = this.c;
        Iterator it = sVar.f241a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = sVar.f242b;
            if (!hasNext) {
                break;
            }
            r rVar = (r) hashMap.get(((Fragment) it.next()).mWho);
            if (rVar != null) {
                rVar.i();
            }
        }
        Iterator it2 = hashMap.values().iterator();
        while (true) {
            boolean z2 = false;
            if (!it2.hasNext()) {
                break;
            }
            r rVar2 = (r) it2.next();
            if (rVar2 != null) {
                rVar2.i();
                Fragment fragment = rVar2.c;
                if (fragment.mRemoving && !fragment.isInBackStack()) {
                    z2 = true;
                }
                if (z2) {
                    if (fragment.mBeingSaved && !sVar.c.containsKey(fragment.mWho)) {
                        sVar.i(rVar2.l(), fragment.mWho);
                    }
                    sVar.h(rVar2);
                }
            }
        }
        c0();
        if (this.D && (r11Var = this.t) != null && this.s == 7) {
            ((k) r11Var).e.invalidateMenu();
            this.D = false;
        }
    }

    public final void O() {
        if (this.t == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.L.i = false;
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final void P() {
        v(new z11(this, null, -1, 0), false);
    }

    public final boolean Q() {
        return R(-1, 0);
    }

    public final boolean R(int i, int i2) {
        x(false);
        w(true);
        Fragment fragment = this.w;
        if (fragment != null && i < 0 && fragment.getChildFragmentManager().Q()) {
            return true;
        }
        boolean S = S(this.I, this.J, null, i, i2);
        if (S) {
            this.f238b = true;
            try {
                U(this.I, this.J);
            } finally {
                d();
            }
        }
        e0();
        if (this.H) {
            this.H = false;
            c0();
        }
        this.c.f242b.values().removeAll(Collections.singleton(null));
        return S;
    }

    public final boolean S(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        boolean z;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList3 = this.d;
        int i3 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (str == null && i < 0) {
                i3 = z ? 0 : (-1) + this.d.size();
            } else {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    a aVar = (a) this.d.get(size);
                    if ((str != null && str.equals(aVar.i)) || (i >= 0 && i == aVar.s)) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z) {
                        while (size > 0) {
                            int i4 = size - 1;
                            a aVar2 = (a) this.d.get(i4);
                            if ((str == null || !str.equals(aVar2.i)) && (i < 0 || i != aVar2.s)) {
                                break;
                            }
                            size = i4;
                        }
                    } else if (size != this.d.size() - 1) {
                        size++;
                    }
                }
                i3 = size;
            }
        }
        if (i3 < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= i3; size2--) {
            arrayList.add((a) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void T(Fragment fragment) {
        if (I(2)) {
            Objects.toString(fragment);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            s sVar = this.c;
            synchronized (sVar.f241a) {
                sVar.f241a.remove(fragment);
            }
            fragment.mAdded = false;
            if (J(fragment)) {
                this.D = true;
            }
            fragment.mRemoving = true;
            b0(fragment);
        }
    }

    public final void U(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!((a) arrayList.get(i)).p) {
                    if (i2 != i) {
                        z(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
                        while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((a) arrayList.get(i2)).p) {
                            i2++;
                        }
                    }
                    z(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                z(arrayList, arrayList2, i2, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    public final void V(Bundle bundle) {
        s11 s11Var;
        int i;
        boolean z;
        r rVar;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.t.f4088b.getClassLoader());
                this.k.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.t.f4088b.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        s sVar = this.c;
        HashMap hashMap2 = sVar.c;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        HashMap hashMap3 = sVar.f242b;
        hashMap3.clear();
        Iterator it = fragmentManagerState.f217a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            s11Var = this.l;
            if (!hasNext) {
                break;
            }
            Bundle i2 = sVar.i(null, (String) it.next());
            if (i2 != null) {
                FragmentState fragmentState = (FragmentState) i2.getParcelable("state");
                Fragment fragment = (Fragment) this.L.d.get(fragmentState.f220b);
                if (fragment != null) {
                    if (I(2)) {
                        fragment.toString();
                    }
                    rVar = new r(s11Var, sVar, fragment, i2);
                } else {
                    rVar = new r(this.l, this.c, this.t.f4088b.getClassLoader(), G(), i2);
                }
                Fragment fragment2 = rVar.c;
                fragment2.mSavedFragmentState = i2;
                fragment2.mFragmentManager = this;
                if (I(2)) {
                    fragment2.toString();
                }
                rVar.j(this.t.f4088b.getClassLoader());
                sVar.g(rVar);
                rVar.e = this.s;
            }
        }
        q qVar = this.L;
        qVar.getClass();
        Iterator it2 = new ArrayList(qVar.d.values()).iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            Fragment fragment3 = (Fragment) it2.next();
            if (hashMap3.get(fragment3.mWho) != null) {
                i = 1;
            }
            if (i == 0) {
                if (I(2)) {
                    fragment3.toString();
                    Objects.toString(fragmentManagerState.f217a);
                }
                this.L.m(fragment3);
                fragment3.mFragmentManager = this;
                r rVar2 = new r(s11Var, sVar, fragment3);
                rVar2.e = 1;
                rVar2.i();
                fragment3.mRemoving = true;
                rVar2.i();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.f218b;
        sVar.f241a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment b2 = sVar.b(str3);
                if (b2 != null) {
                    if (I(2)) {
                        b2.toString();
                    }
                    sVar.a(b2);
                } else {
                    throw new IllegalStateException(hx2.q("No instantiated fragment for (", str3, ")"));
                }
            }
        }
        if (fragmentManagerState.c != null) {
            this.d = new ArrayList(fragmentManagerState.c.length);
            int i3 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.c;
                if (i3 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i3];
                backStackRecordState.getClass();
                a aVar = new a(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = backStackRecordState.f207a;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    m21 m21Var = new m21();
                    int i6 = i4 + 1;
                    m21Var.f3223a = iArr[i4];
                    if (I(2)) {
                        Objects.toString(aVar);
                        int i7 = iArr[i6];
                    }
                    m21Var.h = uj1.values()[backStackRecordState.c[i5]];
                    m21Var.i = uj1.values()[backStackRecordState.d[i5]];
                    int i8 = i6 + 1;
                    if (iArr[i6] != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m21Var.c = z;
                    int i9 = i8 + 1;
                    int i10 = iArr[i8];
                    m21Var.d = i10;
                    int i11 = i9 + 1;
                    int i12 = iArr[i9];
                    m21Var.e = i12;
                    int i13 = i11 + 1;
                    int i14 = iArr[i11];
                    m21Var.f = i14;
                    int i15 = iArr[i13];
                    m21Var.g = i15;
                    aVar.f3389b = i10;
                    aVar.c = i12;
                    aVar.d = i14;
                    aVar.e = i15;
                    aVar.b(m21Var);
                    i5++;
                    i4 = i13 + 1;
                }
                aVar.f = backStackRecordState.e;
                aVar.i = backStackRecordState.f;
                aVar.g = true;
                aVar.j = backStackRecordState.h;
                aVar.k = backStackRecordState.i;
                aVar.l = backStackRecordState.j;
                aVar.m = backStackRecordState.k;
                aVar.n = backStackRecordState.l;
                aVar.o = backStackRecordState.m;
                aVar.p = backStackRecordState.n;
                aVar.s = backStackRecordState.g;
                int i16 = 0;
                while (true) {
                    ArrayList arrayList2 = backStackRecordState.f208b;
                    if (i16 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i16);
                    if (str4 != null) {
                        ((m21) aVar.f3388a.get(i16)).f3224b = A(str4);
                    }
                    i16++;
                }
                aVar.f(1);
                if (I(2)) {
                    aVar.toString();
                    PrintWriter printWriter = new PrintWriter(new ao1());
                    aVar.j("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVar);
                i3++;
            }
        } else {
            this.d = null;
        }
        this.i.set(fragmentManagerState.d);
        String str5 = fragmentManagerState.e;
        if (str5 != null) {
            Fragment A = A(str5);
            this.w = A;
            q(A);
        }
        ArrayList arrayList3 = fragmentManagerState.f;
        if (arrayList3 != null) {
            while (i < arrayList3.size()) {
                this.j.put((String) arrayList3.get(i), (BackStackState) fragmentManagerState.g.get(i));
                i++;
            }
        }
        this.C = new ArrayDeque(fragmentManagerState.h);
    }

    public final Bundle W() {
        BackStackRecordState[] backStackRecordStateArr;
        ArrayList arrayList;
        int size;
        Bundle bundle = new Bundle();
        D();
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((e) it.next()).h();
        }
        x(true);
        this.E = true;
        this.L.i = true;
        s sVar = this.c;
        sVar.getClass();
        HashMap hashMap = sVar.f242b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (r rVar : hashMap.values()) {
            if (rVar != null) {
                Fragment fragment = rVar.c;
                sVar.i(rVar.l(), fragment.mWho);
                arrayList2.add(fragment.mWho);
                if (I(2)) {
                    fragment.toString();
                    Objects.toString(fragment.mSavedFragmentState);
                }
            }
        }
        HashMap hashMap2 = this.c.c;
        if (!hashMap2.isEmpty()) {
            s sVar2 = this.c;
            synchronized (sVar2.f241a) {
                backStackRecordStateArr = null;
                if (sVar2.f241a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(sVar2.f241a.size());
                    Iterator it2 = sVar2.f241a.iterator();
                    while (it2.hasNext()) {
                        Fragment fragment2 = (Fragment) it2.next();
                        arrayList.add(fragment2.mWho);
                        if (I(2)) {
                            fragment2.toString();
                        }
                    }
                }
            }
            ArrayList arrayList3 = this.d;
            if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState((a) this.d.get(i));
                    if (I(2)) {
                        Objects.toString(this.d.get(i));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f217a = arrayList2;
            fragmentManagerState.f218b = arrayList;
            fragmentManagerState.c = backStackRecordStateArr;
            fragmentManagerState.d = this.i.get();
            Fragment fragment3 = this.w;
            if (fragment3 != null) {
                fragmentManagerState.e = fragment3.mWho;
            }
            fragmentManagerState.f.addAll(this.j.keySet());
            fragmentManagerState.g.addAll(this.j.values());
            fragmentManagerState.h = new ArrayList(this.C);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.k.keySet()) {
                bundle.putBundle(hx2.p("result_", str), (Bundle) this.k.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(hx2.p("fragment_", str2), (Bundle) hashMap2.get(str2));
            }
        }
        return bundle;
    }

    public final void X() {
        synchronized (this.f237a) {
            boolean z = true;
            if (this.f237a.size() != 1) {
                z = false;
            }
            if (z) {
                this.t.c.removeCallbacks(this.M);
                this.t.c.post(this.M);
                e0();
            }
        }
    }

    public final void Y(Fragment fragment, boolean z) {
        ViewGroup F = F(fragment);
        if (F != null && (F instanceof FragmentContainerView)) {
            ((FragmentContainerView) F).setDrawDisappearingViewsLast(!z);
        }
    }

    public final void Z(Fragment fragment, uj1 uj1Var) {
        if (fragment.equals(A(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = uj1Var;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final r a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            j21 j21Var = k21.f2874a;
            k21.b(new l21(fragment, str));
            k21.a(fragment).getClass();
            Object obj = i21.DETECT_FRAGMENT_REUSE;
            if (obj instanceof Void) {
            }
        }
        if (I(2)) {
            fragment.toString();
        }
        r f = f(fragment);
        fragment.mFragmentManager = this;
        s sVar = this.c;
        sVar.g(f);
        if (!fragment.mDetached) {
            sVar.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (J(fragment)) {
                this.D = true;
            }
        }
        return f;
    }

    public final void a0(Fragment fragment) {
        if (fragment != null && (!fragment.equals(A(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.w;
        this.w = fragment;
        q(fragment2);
        q(this.w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(r11 r11Var, p11 p11Var, Fragment fragment) {
        String str;
        if (this.t == null) {
            this.t = r11Var;
            this.u = p11Var;
            this.v = fragment;
            CopyOnWriteArrayList copyOnWriteArrayList = this.m;
            if (fragment != null) {
                copyOnWriteArrayList.add(new w11(fragment));
            } else if (r11Var instanceof c21) {
                copyOnWriteArrayList.add((c21) r11Var);
            }
            if (this.v != null) {
                e0();
            }
            if (r11Var instanceof q22) {
                q22 q22Var = (q22) r11Var;
                androidx.activity.b onBackPressedDispatcher = q22Var.getOnBackPressedDispatcher();
                this.g = onBackPressedDispatcher;
                bk1 bk1Var = q22Var;
                if (fragment != null) {
                    bk1Var = fragment;
                }
                onBackPressedDispatcher.a(bk1Var, this.h);
            }
            int i = 0;
            if (fragment != null) {
                q qVar = fragment.mFragmentManager.L;
                HashMap hashMap = qVar.e;
                q qVar2 = (q) hashMap.get(fragment.mWho);
                if (qVar2 == null) {
                    qVar2 = new q(qVar.g);
                    hashMap.put(fragment.mWho, qVar2);
                }
                this.L = qVar2;
            } else if (r11Var instanceof lm3) {
                this.L = (q) new y33(((lm3) r11Var).getViewModelStore(), q.j).s(q.class);
            } else {
                this.L = new q(false);
            }
            this.L.i = M();
            this.c.d = this.L;
            Object obj = this.t;
            int i2 = 2;
            if ((obj instanceof bn2) && fragment == null) {
                zm2 savedStateRegistry = ((bn2) obj).getSavedStateRegistry();
                savedStateRegistry.c("android:support:fragments", new j30(this, 2));
                Bundle a2 = savedStateRegistry.a("android:support:fragments");
                if (a2 != null) {
                    V(a2);
                }
            }
            Object obj2 = this.t;
            if (obj2 instanceof e7) {
                androidx.activity.result.a activityResultRegistry = ((e7) obj2).getActivityResultRegistry();
                if (fragment != null) {
                    str = hx2.s(new StringBuilder(), fragment.mWho, ":");
                } else {
                    str = "";
                }
                String p = hx2.p("FragmentManager:", str);
                this.z = activityResultRegistry.c(p71.l(p, "StartActivityForResult"), new z6(), new o(this, 1));
                this.A = activityResultRegistry.c(p71.l(p, "StartIntentSenderForResult"), new x11(), new o(this, i2));
                this.B = activityResultRegistry.c(p71.l(p, "RequestPermissions"), new y6(), new o(this, i));
            }
            Object obj3 = this.t;
            if (obj3 instanceof t22) {
                ((t22) obj3).addOnConfigurationChangedListener(this.n);
            }
            Object obj4 = this.t;
            if (obj4 instanceof b32) {
                ((b32) obj4).addOnTrimMemoryListener(this.o);
            }
            Object obj5 = this.t;
            if (obj5 instanceof x22) {
                ((x22) obj5).addOnMultiWindowModeChangedListener(this.p);
            }
            Object obj6 = this.t;
            if (obj6 instanceof y22) {
                ((y22) obj6).addOnPictureInPictureModeChangedListener(this.q);
            }
            Object obj7 = this.t;
            if ((obj7 instanceof lu1) && fragment == null) {
                ((lu1) obj7).addMenuProvider(this.r);
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final void b0(Fragment fragment) {
        ViewGroup F = F(fragment);
        if (F != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                int i = df2.visible_removing_fragment_view_tag;
                if (F.getTag(i) == null) {
                    F.setTag(i, fragment);
                }
                ((Fragment) F.getTag(i)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void c(Fragment fragment) {
        if (I(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.c.a(fragment);
                if (I(2)) {
                    fragment.toString();
                }
                if (J(fragment)) {
                    this.D = true;
                }
            }
        }
    }

    public final void c0() {
        Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            Fragment fragment = rVar.c;
            if (fragment.mDeferStart) {
                if (this.f238b) {
                    this.H = true;
                } else {
                    fragment.mDeferStart = false;
                    rVar.i();
                }
            }
        }
    }

    public final void d() {
        this.f238b = false;
        this.J.clear();
        this.I.clear();
    }

    public final void d0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new ao1());
        r11 r11Var = this.t;
        if (r11Var != null) {
            try {
                ((k) r11Var).e.dump("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            u("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final HashSet e() {
        e eVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((r) it.next()).c.mContainer;
            if (viewGroup != null) {
                H();
                int i = df2.special_effects_controller_view_tag;
                Object tag = viewGroup.getTag(i);
                if (tag instanceof e) {
                    eVar = (e) tag;
                } else {
                    eVar = new e(viewGroup);
                    viewGroup.setTag(i, eVar);
                }
                hashSet.add(eVar);
            }
        }
        return hashSet;
    }

    public final void e0() {
        synchronized (this.f237a) {
            try {
                boolean z = true;
                if (!this.f237a.isEmpty()) {
                    p22 p22Var = this.h;
                    p22Var.f2193a = true;
                    v31 v31Var = p22Var.c;
                    if (v31Var != null) {
                        v31Var.invoke();
                    }
                    return;
                }
                p22 p22Var2 = this.h;
                if (E() <= 0 || !L(this.v)) {
                    z = false;
                }
                p22Var2.f2193a = z;
                v31 v31Var2 = p22Var2.c;
                if (v31Var2 != null) {
                    v31Var2.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final r f(Fragment fragment) {
        String str = fragment.mWho;
        s sVar = this.c;
        r rVar = (r) sVar.f242b.get(str);
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(this.l, sVar, fragment);
        rVar2.j(this.t.f4088b.getClassLoader());
        rVar2.e = this.s;
        return rVar2;
    }

    public final void g(Fragment fragment) {
        if (I(2)) {
            Objects.toString(fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (I(2)) {
                    fragment.toString();
                }
                s sVar = this.c;
                synchronized (sVar.f241a) {
                    sVar.f241a.remove(fragment);
                }
                fragment.mAdded = false;
                if (J(fragment)) {
                    this.D = true;
                }
                b0(fragment);
            }
        }
    }

    public final void h(boolean z, Configuration configuration) {
        if (z && (this.t instanceof t22)) {
            d0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.h(true, configuration);
                }
            }
        }
    }

    public final boolean i(MenuItem menuItem) {
        if (this.s < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(Menu menu, MenuInflater menuInflater) {
        if (this.s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                Fragment fragment2 = (Fragment) this.e.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void k() {
        boolean z = true;
        this.G = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((e) it.next()).h();
        }
        r11 r11Var = this.t;
        boolean z2 = r11Var instanceof lm3;
        s sVar = this.c;
        if (z2) {
            z = sVar.d.h;
        } else {
            Context context = r11Var.f4088b;
            if (context instanceof Activity) {
                z = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z) {
            Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((BackStackState) it2.next()).f209a.iterator();
                while (it3.hasNext()) {
                    sVar.d.l((String) it3.next(), false);
                }
            }
        }
        t(-1);
        Object obj = this.t;
        if (obj instanceof b32) {
            ((b32) obj).removeOnTrimMemoryListener(this.o);
        }
        Object obj2 = this.t;
        if (obj2 instanceof t22) {
            ((t22) obj2).removeOnConfigurationChangedListener(this.n);
        }
        Object obj3 = this.t;
        if (obj3 instanceof x22) {
            ((x22) obj3).removeOnMultiWindowModeChangedListener(this.p);
        }
        Object obj4 = this.t;
        if (obj4 instanceof y22) {
            ((y22) obj4).removeOnPictureInPictureModeChangedListener(this.q);
        }
        Object obj5 = this.t;
        if ((obj5 instanceof lu1) && this.v == null) {
            ((lu1) obj5).removeMenuProvider(this.r);
        }
        this.t = null;
        this.u = null;
        this.v = null;
        if (this.g != null) {
            Iterator it4 = this.h.f2194b.iterator();
            while (it4.hasNext()) {
                ((tu) it4.next()).cancel();
            }
            this.g = null;
        }
        b7 b7Var = this.z;
        if (b7Var != null) {
            b7Var.b();
            this.A.b();
            this.B.b();
        }
    }

    public final void l(boolean z) {
        if (z && (this.t instanceof b32)) {
            d0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.l(true);
                }
            }
        }
    }

    public final void m(boolean z, boolean z2) {
        if (z2 && (this.t instanceof x22)) {
            d0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.m(z, true);
                }
            }
        }
    }

    public final void n() {
        Iterator it = this.c.e().iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.n();
            }
        }
    }

    public final boolean o(MenuItem menuItem) {
        if (this.s < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void p(Menu menu) {
        if (this.s < 1) {
            return;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void q(Fragment fragment) {
        if (fragment != null && fragment.equals(A(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    public final void r(boolean z, boolean z2) {
        if (z2 && (this.t instanceof y22)) {
            d0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.r(z, true);
                }
            }
        }
    }

    public final boolean s(Menu menu) {
        boolean z = false;
        if (this.s < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void t(int i) {
        try {
            this.f238b = true;
            for (r rVar : this.c.f242b.values()) {
                if (rVar != null) {
                    rVar.e = i;
                }
            }
            N(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((e) it.next()).h();
            }
            this.f238b = false;
            x(true);
        } catch (Throwable th) {
            this.f238b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.v;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.v)));
            sb.append("}");
        } else {
            r11 r11Var = this.t;
            if (r11Var != null) {
                sb.append(r11Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String l = p71.l(str, "    ");
        s sVar = this.c;
        sVar.getClass();
        String str2 = str + "    ";
        HashMap hashMap = sVar.f242b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (r rVar : hashMap.values()) {
                printWriter.print(str);
                if (rVar != null) {
                    Fragment fragment = rVar.c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = sVar.f241a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                Fragment fragment2 = (Fragment) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment3 = (Fragment) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = (a) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.j(l, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f237a) {
            int size4 = this.f237a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj = (y11) this.f237a.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.u);
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public final void v(y11 y11Var, boolean z) {
        if (!z) {
            if (this.t == null) {
                if (this.G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (M()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f237a) {
            if (this.t == null) {
                if (z) {
                } else {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f237a.add(y11Var);
                X();
            }
        }
    }

    public final void w(boolean z) {
        if (!this.f238b) {
            if (this.t == null) {
                if (this.G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (Looper.myLooper() == this.t.c.getLooper()) {
                if (!z && M()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if (this.I == null) {
                    this.I = new ArrayList();
                    this.J = new ArrayList();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public final boolean x(boolean z) {
        boolean z2;
        w(z);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.I;
            ArrayList arrayList2 = this.J;
            synchronized (this.f237a) {
                if (this.f237a.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.f237a.size();
                        z2 = false;
                        for (int i = 0; i < size; i++) {
                            z2 |= ((y11) this.f237a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z2) {
                break;
            }
            z3 = true;
            this.f238b = true;
            try {
                U(this.I, this.J);
            } finally {
                d();
            }
        }
        e0();
        if (this.H) {
            this.H = false;
            c0();
        }
        this.c.f242b.values().removeAll(Collections.singleton(null));
        return z3;
    }

    public final void y(y11 y11Var, boolean z) {
        if (z && (this.t == null || this.G)) {
            return;
        }
        w(z);
        if (y11Var.a(this.I, this.J)) {
            this.f238b = true;
            try {
                U(this.I, this.J);
            } finally {
                d();
            }
        }
        e0();
        if (this.H) {
            this.H = false;
            c0();
        }
        this.c.f242b.values().removeAll(Collections.singleton(null));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:175:0x031b. Please report as an issue. */
    public final void z(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ArrayList arrayList3;
        int i3;
        ViewGroup viewGroup;
        s sVar;
        s sVar2;
        s sVar3;
        int i4;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        int i5 = i2;
        boolean z = ((a) arrayList4.get(i)).p;
        ArrayList arrayList6 = this.K;
        if (arrayList6 == null) {
            this.K = new ArrayList();
        } else {
            arrayList6.clear();
        }
        ArrayList arrayList7 = this.K;
        s sVar4 = this.c;
        arrayList7.addAll(sVar4.f());
        Fragment fragment = this.w;
        int i6 = i;
        boolean z2 = false;
        while (true) {
            int i7 = 1;
            if (i6 < i5) {
                a aVar = (a) arrayList4.get(i6);
                if (!((Boolean) arrayList5.get(i6)).booleanValue()) {
                    ArrayList arrayList8 = this.K;
                    int i8 = 0;
                    while (true) {
                        ArrayList arrayList9 = aVar.f3388a;
                        if (i8 < arrayList9.size()) {
                            m21 m21Var = (m21) arrayList9.get(i8);
                            int i9 = m21Var.f3223a;
                            if (i9 != i7) {
                                if (i9 != 2) {
                                    if (i9 != 3 && i9 != 6) {
                                        if (i9 != 7) {
                                            if (i9 == 8) {
                                                arrayList9.add(i8, new m21(9, fragment));
                                                m21Var.c = true;
                                                i8++;
                                                fragment = m21Var.f3224b;
                                            }
                                        }
                                    } else {
                                        arrayList8.remove(m21Var.f3224b);
                                        Fragment fragment2 = m21Var.f3224b;
                                        if (fragment2 == fragment) {
                                            arrayList9.add(i8, new m21(fragment2, 9));
                                            i8++;
                                            sVar3 = sVar4;
                                            i4 = 1;
                                            fragment = null;
                                        }
                                    }
                                    sVar3 = sVar4;
                                    i4 = 1;
                                } else {
                                    Fragment fragment3 = m21Var.f3224b;
                                    int i10 = fragment3.mContainerId;
                                    Fragment fragment4 = fragment;
                                    boolean z3 = false;
                                    sVar3 = sVar4;
                                    for (int size = arrayList8.size() - 1; size >= 0; size--) {
                                        Fragment fragment5 = (Fragment) arrayList8.get(size);
                                        if (fragment5.mContainerId == i10) {
                                            if (fragment5 == fragment3) {
                                                z3 = true;
                                            } else {
                                                if (fragment5 == fragment4) {
                                                    arrayList9.add(i8, new m21(9, fragment5));
                                                    i8++;
                                                    fragment4 = null;
                                                }
                                                m21 m21Var2 = new m21(3, fragment5);
                                                m21Var2.d = m21Var.d;
                                                m21Var2.f = m21Var.f;
                                                m21Var2.e = m21Var.e;
                                                m21Var2.g = m21Var.g;
                                                arrayList9.add(i8, m21Var2);
                                                arrayList8.remove(fragment5);
                                                i8++;
                                                fragment4 = fragment4;
                                            }
                                        }
                                    }
                                    i4 = 1;
                                    if (z3) {
                                        arrayList9.remove(i8);
                                        i8--;
                                    } else {
                                        m21Var.f3223a = 1;
                                        m21Var.c = true;
                                        arrayList8.add(fragment3);
                                    }
                                    fragment = fragment4;
                                }
                                i8 += i4;
                                sVar4 = sVar3;
                                i7 = 1;
                            }
                            sVar3 = sVar4;
                            i4 = 1;
                            arrayList8.add(m21Var.f3224b);
                            i8 += i4;
                            sVar4 = sVar3;
                            i7 = 1;
                        } else {
                            sVar2 = sVar4;
                        }
                    }
                } else {
                    sVar2 = sVar4;
                    int i11 = 1;
                    ArrayList arrayList10 = this.K;
                    ArrayList arrayList11 = aVar.f3388a;
                    int size2 = arrayList11.size() - 1;
                    while (size2 >= 0) {
                        m21 m21Var3 = (m21) arrayList11.get(size2);
                        int i12 = m21Var3.f3223a;
                        if (i12 != i11) {
                            if (i12 != 3) {
                                switch (i12) {
                                    case 8:
                                        fragment = null;
                                        break;
                                    case 9:
                                        fragment = m21Var3.f3224b;
                                        break;
                                    case 10:
                                        m21Var3.i = m21Var3.h;
                                        break;
                                }
                                size2--;
                                i11 = 1;
                            }
                            arrayList10.add(m21Var3.f3224b);
                            size2--;
                            i11 = 1;
                        }
                        arrayList10.remove(m21Var3.f3224b);
                        size2--;
                        i11 = 1;
                    }
                }
                if (!z2 && !aVar.g) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                i6++;
                arrayList4 = arrayList;
                arrayList5 = arrayList2;
                i5 = i2;
                sVar4 = sVar2;
            } else {
                s sVar5 = sVar4;
                this.K.clear();
                if (!z && this.s >= 1) {
                    int i13 = i;
                    i3 = i2;
                    while (true) {
                        arrayList3 = arrayList;
                        if (i13 < i3) {
                            Iterator it = ((a) arrayList3.get(i13)).f3388a.iterator();
                            while (it.hasNext()) {
                                Fragment fragment6 = ((m21) it.next()).f3224b;
                                if (fragment6 != null && fragment6.mFragmentManager != null) {
                                    sVar = sVar5;
                                    sVar.g(f(fragment6));
                                } else {
                                    sVar = sVar5;
                                }
                                sVar5 = sVar;
                            }
                            i13++;
                        }
                    }
                } else {
                    arrayList3 = arrayList;
                    i3 = i2;
                }
                for (int i14 = i; i14 < i3; i14++) {
                    a aVar2 = (a) arrayList3.get(i14);
                    if (((Boolean) arrayList2.get(i14)).booleanValue()) {
                        aVar2.f(-1);
                        ArrayList arrayList12 = aVar2.f3388a;
                        boolean z4 = true;
                        int size3 = arrayList12.size() - 1;
                        while (size3 >= 0) {
                            m21 m21Var4 = (m21) arrayList12.get(size3);
                            Fragment fragment7 = m21Var4.f3224b;
                            if (fragment7 != null) {
                                fragment7.mBeingSaved = false;
                                fragment7.setPopDirection(z4);
                                int i15 = aVar2.f;
                                int i16 = 8194;
                                if (i15 != 4097) {
                                    if (i15 != 8194) {
                                        i16 = 4100;
                                        if (i15 != 8197) {
                                            if (i15 != 4099) {
                                                if (i15 != 4100) {
                                                    i16 = 0;
                                                } else {
                                                    i16 = 8197;
                                                }
                                            } else {
                                                i16 = 4099;
                                            }
                                        }
                                    } else {
                                        i16 = 4097;
                                    }
                                }
                                fragment7.setNextTransition(i16);
                                fragment7.setSharedElementNames(aVar2.o, aVar2.n);
                            }
                            int i17 = m21Var4.f3223a;
                            p pVar = aVar2.q;
                            switch (i17) {
                                case 1:
                                    fragment7.setAnimations(m21Var4.d, m21Var4.e, m21Var4.f, m21Var4.g);
                                    pVar.Y(fragment7, true);
                                    pVar.T(fragment7);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + m21Var4.f3223a);
                                case 3:
                                    fragment7.setAnimations(m21Var4.d, m21Var4.e, m21Var4.f, m21Var4.g);
                                    pVar.a(fragment7);
                                    break;
                                case 4:
                                    fragment7.setAnimations(m21Var4.d, m21Var4.e, m21Var4.f, m21Var4.g);
                                    pVar.getClass();
                                    if (I(2)) {
                                        Objects.toString(fragment7);
                                    }
                                    if (fragment7.mHidden) {
                                        fragment7.mHidden = false;
                                        fragment7.mHiddenChanged = !fragment7.mHiddenChanged;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 5:
                                    fragment7.setAnimations(m21Var4.d, m21Var4.e, m21Var4.f, m21Var4.g);
                                    pVar.Y(fragment7, true);
                                    if (I(2)) {
                                        Objects.toString(fragment7);
                                    }
                                    if (fragment7.mHidden) {
                                        break;
                                    } else {
                                        fragment7.mHidden = true;
                                        fragment7.mHiddenChanged = !fragment7.mHiddenChanged;
                                        pVar.b0(fragment7);
                                        break;
                                    }
                                case 6:
                                    fragment7.setAnimations(m21Var4.d, m21Var4.e, m21Var4.f, m21Var4.g);
                                    pVar.c(fragment7);
                                    break;
                                case 7:
                                    fragment7.setAnimations(m21Var4.d, m21Var4.e, m21Var4.f, m21Var4.g);
                                    pVar.Y(fragment7, true);
                                    pVar.g(fragment7);
                                    break;
                                case 8:
                                    pVar.a0(null);
                                    break;
                                case 9:
                                    pVar.a0(fragment7);
                                    break;
                                case 10:
                                    pVar.Z(fragment7, m21Var4.h);
                                    break;
                            }
                            size3--;
                            z4 = true;
                        }
                    } else {
                        aVar2.f(1);
                        ArrayList arrayList13 = aVar2.f3388a;
                        int size4 = arrayList13.size();
                        for (int i18 = 0; i18 < size4; i18++) {
                            m21 m21Var5 = (m21) arrayList13.get(i18);
                            Fragment fragment8 = m21Var5.f3224b;
                            if (fragment8 != null) {
                                fragment8.mBeingSaved = false;
                                fragment8.setPopDirection(false);
                                fragment8.setNextTransition(aVar2.f);
                                fragment8.setSharedElementNames(aVar2.n, aVar2.o);
                            }
                            int i19 = m21Var5.f3223a;
                            p pVar2 = aVar2.q;
                            switch (i19) {
                                case 1:
                                    fragment8.setAnimations(m21Var5.d, m21Var5.e, m21Var5.f, m21Var5.g);
                                    pVar2.Y(fragment8, false);
                                    pVar2.a(fragment8);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + m21Var5.f3223a);
                                case 3:
                                    fragment8.setAnimations(m21Var5.d, m21Var5.e, m21Var5.f, m21Var5.g);
                                    pVar2.T(fragment8);
                                case 4:
                                    fragment8.setAnimations(m21Var5.d, m21Var5.e, m21Var5.f, m21Var5.g);
                                    pVar2.getClass();
                                    if (I(2)) {
                                        Objects.toString(fragment8);
                                    }
                                    if (!fragment8.mHidden) {
                                        fragment8.mHidden = true;
                                        fragment8.mHiddenChanged = !fragment8.mHiddenChanged;
                                        pVar2.b0(fragment8);
                                    }
                                case 5:
                                    fragment8.setAnimations(m21Var5.d, m21Var5.e, m21Var5.f, m21Var5.g);
                                    pVar2.Y(fragment8, false);
                                    if (I(2)) {
                                        Objects.toString(fragment8);
                                    }
                                    if (fragment8.mHidden) {
                                        fragment8.mHidden = false;
                                        fragment8.mHiddenChanged = !fragment8.mHiddenChanged;
                                    }
                                case 6:
                                    fragment8.setAnimations(m21Var5.d, m21Var5.e, m21Var5.f, m21Var5.g);
                                    pVar2.g(fragment8);
                                case 7:
                                    fragment8.setAnimations(m21Var5.d, m21Var5.e, m21Var5.f, m21Var5.g);
                                    pVar2.Y(fragment8, false);
                                    pVar2.c(fragment8);
                                case 8:
                                    pVar2.a0(fragment8);
                                case 9:
                                    pVar2.a0(null);
                                case 10:
                                    pVar2.Z(fragment8, m21Var5.i);
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i3 - 1)).booleanValue();
                for (int i20 = i; i20 < i3; i20++) {
                    a aVar3 = (a) arrayList3.get(i20);
                    if (booleanValue) {
                        for (int size5 = aVar3.f3388a.size() - 1; size5 >= 0; size5--) {
                            Fragment fragment9 = ((m21) aVar3.f3388a.get(size5)).f3224b;
                            if (fragment9 != null) {
                                f(fragment9).i();
                            }
                        }
                    } else {
                        Iterator it2 = aVar3.f3388a.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment10 = ((m21) it2.next()).f3224b;
                            if (fragment10 != null) {
                                f(fragment10).i();
                            }
                        }
                    }
                }
                N(this.s, true);
                HashSet hashSet = new HashSet();
                for (int i21 = i; i21 < i3; i21++) {
                    Iterator it3 = ((a) arrayList3.get(i21)).f3388a.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment11 = ((m21) it3.next()).f3224b;
                        if (fragment11 != null && (viewGroup = fragment11.mContainer) != null) {
                            hashSet.add(e.i(viewGroup, this));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    e eVar = (e) it4.next();
                    eVar.d = booleanValue;
                    eVar.j();
                    eVar.e();
                }
                for (int i22 = i; i22 < i3; i22++) {
                    a aVar4 = (a) arrayList3.get(i22);
                    if (((Boolean) arrayList2.get(i22)).booleanValue() && aVar4.s >= 0) {
                        aVar4.s = -1;
                    }
                    aVar4.getClass();
                }
                return;
            }
        }
    }
}
