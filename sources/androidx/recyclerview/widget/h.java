package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.fh2;
import defpackage.ll3;
import defpackage.p71;
import defpackage.uk3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class h {
    public static final List t = Collections.emptyList();

    /* renamed from: a, reason: collision with root package name */
    public final View f281a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f282b;
    public int j;
    public RecyclerView r;
    public fh2 s;
    public int c = -1;
    public int d = -1;
    public long e = -1;
    public int f = -1;
    public int g = -1;
    public h h = null;
    public h i = null;
    public ArrayList k = null;
    public List l = null;
    public int m = 0;
    public e n = null;
    public boolean o = false;
    public int p = 0;
    public int q = -1;

    public h(View view) {
        if (view != null) {
            this.f281a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final boolean A() {
        if ((this.j & 32) != 0) {
            return true;
        }
        return false;
    }

    public final void b(Object obj) {
        if (obj == null) {
            c(UserVerificationMethods.USER_VERIFY_ALL);
            return;
        }
        if ((1024 & this.j) == 0) {
            if (this.k == null) {
                ArrayList arrayList = new ArrayList();
                this.k = arrayList;
                this.l = Collections.unmodifiableList(arrayList);
            }
            this.k.add(obj);
        }
    }

    public final void c(int i) {
        this.j = i | this.j;
    }

    public final int d() {
        RecyclerView recyclerView = this.r;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.I(this);
    }

    public final int e() {
        RecyclerView recyclerView;
        fh2 adapter;
        int I;
        if (this.s == null || (recyclerView = this.r) == null || (adapter = recyclerView.getAdapter()) == null || (I = this.r.I(this)) == -1) {
            return -1;
        }
        return adapter.b(this.s, this, I);
    }

    public final int f() {
        int i = this.g;
        if (i == -1) {
            return this.c;
        }
        return i;
    }

    public final List g() {
        ArrayList arrayList;
        if ((this.j & UserVerificationMethods.USER_VERIFY_ALL) == 0 && (arrayList = this.k) != null && arrayList.size() != 0) {
            return this.l;
        }
        return t;
    }

    public final boolean i() {
        View view = this.f281a;
        if (view.getParent() != null && view.getParent() != this.r) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.j & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.j & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if ((this.j & 16) == 0) {
            WeakHashMap weakHashMap = ll3.f3151a;
            if (!uk3.i(this.f281a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean o() {
        if ((this.j & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if (this.n != null) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        if ((this.j & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String simpleName;
        boolean z;
        String str;
        if (getClass().isAnonymousClass()) {
            simpleName = "ViewHolder";
        } else {
            simpleName = getClass().getSimpleName();
        }
        StringBuilder p = p71.p(simpleName, "{");
        p.append(Integer.toHexString(hashCode()));
        p.append(" position=");
        p.append(this.c);
        p.append(" id=");
        p.append(this.e);
        p.append(", oldPos=");
        p.append(this.d);
        p.append(", pLpos:");
        p.append(this.g);
        StringBuilder sb = new StringBuilder(p.toString());
        if (s()) {
            sb.append(" scrap ");
            if (this.o) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb.append(str);
        }
        if (m()) {
            sb.append(" invalid");
        }
        if (!l()) {
            sb.append(" unbound");
        }
        boolean z2 = true;
        if ((this.j & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sb.append(" update");
        }
        if (o()) {
            sb.append(" removed");
        }
        if (z()) {
            sb.append(" ignored");
        }
        if (t()) {
            sb.append(" tmpDetached");
        }
        if (!n()) {
            sb.append(" not recyclable(" + this.m + ")");
        }
        if ((this.j & 512) == 0 && !m()) {
            z2 = false;
        }
        if (z2) {
            sb.append(" undefined adapter position");
        }
        if (this.f281a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final void v(int i, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        if (this.g == -1) {
            this.g = this.c;
        }
        if (z) {
            this.g += i;
        }
        this.c += i;
        View view = this.f281a;
        if (view.getLayoutParams() != null) {
            ((d) view.getLayoutParams()).c = true;
        }
    }

    public final void w() {
        if (RecyclerView.L0 && t()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.g = -1;
        this.m = 0;
        this.h = null;
        this.i = null;
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.j &= -1025;
        this.p = 0;
        this.q = -1;
        RecyclerView.l(this);
    }

    public final void y(boolean z) {
        int i;
        int i2 = this.m;
        if (z) {
            i = i2 - 1;
        } else {
            i = i2 + 1;
        }
        this.m = i;
        if (i < 0) {
            this.m = 0;
            if (!RecyclerView.L0) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
        } else if (!z && i == 1) {
            this.j |= 16;
        } else if (z && i == 0) {
            this.j &= -17;
        }
        if (RecyclerView.M0) {
            toString();
        }
    }

    public final boolean z() {
        if ((this.j & 128) != 0) {
            return true;
        }
        return false;
    }
}
