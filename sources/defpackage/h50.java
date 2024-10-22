package defpackage;

import android.app.Activity;
import android.app.Dialog;
import androidx.fragment.app.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class h50 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f2367a = true;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f2368b = true;
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final ArrayList d = new ArrayList();

    public static void a(dn dnVar, Object obj) {
        ConcurrentHashMap concurrentHashMap = c;
        ArrayList arrayList = (ArrayList) concurrentHashMap.get(dnVar.getClass().getName());
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(new WeakReference(obj));
        concurrentHashMap.put(dnVar.getClass().getName(), arrayList);
    }

    public static final void b(dn dnVar) {
        boolean z;
        boolean z2;
        f2368b = false;
        rt3.e().g = "";
        String name = dnVar.getClass().getName();
        ConcurrentHashMap concurrentHashMap = c;
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (m20.L(entry.getKey(), name)) {
                ArrayList arrayList = (ArrayList) entry.getValue();
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    Object obj = ((WeakReference) arrayList.get(size)).get();
                    if (obj instanceof Dialog) {
                        Activity ownerActivity = ((Dialog) obj).getOwnerActivity();
                        if (ownerActivity != null && ownerActivity.isDestroyed()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            ((Dialog) obj).dismiss();
                        }
                        arrayList.remove(size);
                    } else if (obj instanceof f) {
                        f fVar = (f) obj;
                        if (!fVar.isAdded()) {
                            fVar.dismiss();
                            arrayList.remove(size);
                        }
                    }
                    concurrentHashMap.put(entry.getKey(), arrayList);
                }
            } else {
                ArrayList arrayList2 = (ArrayList) entry.getValue();
                for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                    Object obj2 = ((WeakReference) arrayList2.get(size2)).get();
                    if (obj2 instanceof Dialog) {
                        Dialog dialog = (Dialog) obj2;
                        Activity ownerActivity2 = dialog.getOwnerActivity();
                        if (ownerActivity2 != null && ownerActivity2.isDestroyed()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            dialog.dismiss();
                        }
                    } else if (obj2 instanceof f) {
                        ((f) obj2).dismiss();
                    }
                }
                concurrentHashMap.remove(entry.getKey());
            }
        }
    }

    public static void c() {
        boolean z;
        f2367a = false;
        ArrayList arrayList = d;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            q50 q50Var = (q50) ((WeakReference) arrayList.get(size)).get();
            if (q50Var != null) {
                Activity ownerActivity = q50Var.getOwnerActivity();
                if (ownerActivity != null && ownerActivity.isDestroyed()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    q50Var.dismiss();
                }
            }
            arrayList.remove(size);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:            if (r1 != false) goto L16;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(defpackage.dn r2, int r3, java.lang.String r4) {
        /*
            boolean r0 = defpackage.ew3.U()
            r1 = 8
            if (r0 == 0) goto L1f
            boolean r0 = defpackage.m20.A0()
            if (r0 == 0) goto L1f
            r3 = 0
            r9 r3 = defpackage.ya0.g0(r2, r3)
            e50 r4 = new e50
            r4.<init>(r2, r1)
            r3.z(r4)
            a(r2, r3)
            return
        L1f:
            if (r3 == 0) goto L25
            r0 = 7
            if (r3 == r0) goto L25
            goto L6a
        L25:
            r0 = 477(0x1dd, float:6.68E-43)
            a.bx r0 = defpackage.hx2.i(r0)
            boolean r1 = r0.q()
            r0.h()
            if (r1 != 0) goto L43
            r0 = 478(0x1de, float:6.7E-43)
            a.bx r0 = defpackage.hx2.i(r0)
            boolean r1 = r0.q()
            r0.h()
            if (r1 == 0) goto L4a
        L43:
            boolean r0 = defpackage.ew3.X()
            if (r0 != 0) goto L4a
            r3 = 6
        L4a:
            r0 = 564(0x234, float:7.9E-43)
            a.bx r0 = defpackage.hx2.j(r4, r0)
            boolean r1 = r0.q()
            r0.h()
            if (r1 == 0) goto L6a
            r0 = 78
            a.bx r0 = defpackage.hx2.i(r0)
            boolean r1 = r0.q()
            r0.h()
            if (r1 == 0) goto L6a
            r3 = 8
        L6a:
            boolean r0 = defpackage.ew3.B()
            if (r0 != 0) goto L89
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L89
            com.security.xvpn.z35kb.view.a r3 = com.security.xvpn.z35kb.view.a.m(r2, r3, r4)
            r3.show()
            e50 r4 = new e50
            r0 = 5
            r4.<init>(r2, r0)
            r3.setOnDismissListener(r4)
            a(r2, r3)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h50.d(dn, int, java.lang.String):void");
    }
}
