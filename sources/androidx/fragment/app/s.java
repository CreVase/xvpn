package androidx.fragment.app;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f241a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f242b = new HashMap();
    public final HashMap c = new HashMap();
    public q d;

    public final void a(Fragment fragment) {
        if (!this.f241a.contains(fragment)) {
            synchronized (this.f241a) {
                this.f241a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public final Fragment b(String str) {
        r rVar = (r) this.f242b.get(str);
        if (rVar != null) {
            return rVar.c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment findFragmentByWho;
        for (r rVar : this.f242b.values()) {
            if (rVar != null && (findFragmentByWho = rVar.c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (r rVar : this.f242b.values()) {
            if (rVar != null) {
                arrayList.add(rVar);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (r rVar : this.f242b.values()) {
            if (rVar != null) {
                arrayList.add(rVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f241a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f241a) {
            arrayList = new ArrayList(this.f241a);
        }
        return arrayList;
    }

    public final void g(r rVar) {
        boolean z;
        Fragment fragment = rVar.c;
        String str = fragment.mWho;
        HashMap hashMap = this.f242b;
        if (hashMap.get(str) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        hashMap.put(fragment.mWho, rVar);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.d.i(fragment);
            } else {
                this.d.m(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (p.I(2)) {
            fragment.toString();
        }
    }

    public final void h(r rVar) {
        Fragment fragment = rVar.c;
        if (fragment.mRetainInstance) {
            this.d.m(fragment);
        }
        HashMap hashMap = this.f242b;
        if (hashMap.get(fragment.mWho) == rVar && ((r) hashMap.put(fragment.mWho, null)) != null && p.I(2)) {
            fragment.toString();
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap hashMap = this.c;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }
}
