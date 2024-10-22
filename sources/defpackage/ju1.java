package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class ju1 implements m33 {
    public static final int[] y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f2830a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f2831b;
    public boolean c;
    public boolean d;
    public hu1 e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public CharSequence m;
    public Drawable n;
    public View o;
    public su1 v;
    public boolean x;
    public int l = 0;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public final ArrayList t = new ArrayList();
    public final CopyOnWriteArrayList u = new CopyOnWriteArrayList();
    public boolean w = false;

    public ju1(Context context) {
        boolean z;
        boolean z2 = false;
        this.f2830a = context;
        Resources resources = context.getResources();
        this.f2831b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = ol3.f3691a;
            if (Build.VERSION.SDK_INT >= 28) {
                z = nl3.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        this.d = z2;
    }

    public final su1 a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0 && i5 < 6) {
            int i6 = (y[i5] << 16) | (65535 & i3);
            su1 su1Var = new su1(this, i, i2, i3, i6, charSequence, this.l);
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (((su1) arrayList.get(size)).d <= i6) {
                        i4 = size + 1;
                        break;
                    }
                } else {
                    i4 = 0;
                    break;
                }
            }
            arrayList.add(i4, su1Var);
            p(true);
            return su1Var;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        int i6;
        PackageManager packageManager = this.f2830a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            if (i8 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i8];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            su1 a2 = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.g = intent3;
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = a2;
            }
        }
        return i5;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(jv1 jv1Var, Context context) {
        this.u.add(new WeakReference(jv1Var));
        jv1Var.j(context, this);
        this.k = true;
    }

    public final void c(boolean z) {
        if (this.s) {
            return;
        }
        this.s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            jv1 jv1Var = (jv1) weakReference.get();
            if (jv1Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                jv1Var.a(this, z);
            }
        }
        this.s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        su1 su1Var = this.v;
        if (su1Var != null) {
            d(su1Var);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(su1 su1Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == su1Var) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                jv1 jv1Var = (jv1) weakReference.get();
                if (jv1Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z = jv1Var.e(su1Var);
                    if (z) {
                        break;
                    }
                }
            }
            v();
            if (z) {
                this.v = null;
            }
        }
        return z;
    }

    public boolean e(ju1 ju1Var, MenuItem menuItem) {
        hu1 hu1Var = this.e;
        if (hu1Var != null && hu1Var.c(ju1Var, menuItem)) {
            return true;
        }
        return false;
    }

    public boolean f(su1 su1Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            jv1 jv1Var = (jv1) weakReference.get();
            if (jv1Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z = jv1Var.g(su1Var);
                if (z) {
                    break;
                }
            }
        }
        v();
        if (z) {
            this.v = su1Var;
        }
        return z;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            su1 su1Var = (su1) this.f.get(i2);
            if (su1Var.f4414a == i) {
                return su1Var;
            }
            if (su1Var.hasSubMenu() && (findItem = su1Var.o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final su1 g(int i, KeyEvent keyEvent) {
        char c;
        ArrayList arrayList = this.t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (su1) arrayList.get(0);
        }
        boolean n = n();
        for (int i2 = 0; i2 < size; i2++) {
            su1 su1Var = (su1) arrayList.get(i2);
            if (n) {
                c = su1Var.j;
            } else {
                c = su1Var.h;
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (n && c == '\b' && i == 67))) {
                return su1Var;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean z;
        boolean n = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i != 67) {
            return;
        }
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            su1 su1Var = (su1) arrayList2.get(i3);
            if (su1Var.hasSubMenu()) {
                su1Var.o.h(arrayList, i, keyEvent);
            }
            if (n) {
                c = su1Var.j;
            } else {
                c = su1Var.h;
            }
            if (n) {
                i2 = su1Var.k;
            } else {
                i2 = su1Var.i;
            }
            if ((modifiers & 69647) == (i2 & 69647)) {
                z = true;
            } else {
                z = false;
            }
            if (z && c != 0) {
                char[] cArr = keyData.meta;
                if (c != cArr[0] && c != cArr[2]) {
                    if (n && c == '\b') {
                        if (i != 67) {
                        }
                    }
                }
                if (su1Var.isEnabled()) {
                    arrayList.add(su1Var);
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((su1) this.f.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l = l();
        if (!this.k) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            jv1 jv1Var = (jv1) weakReference.get();
            if (jv1Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z |= jv1Var.d();
            }
        }
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = this.j;
        if (z) {
            arrayList.clear();
            arrayList2.clear();
            int size = l.size();
            for (int i = 0; i < size; i++) {
                su1 su1Var = (su1) l.get(i);
                if (su1Var.f()) {
                    arrayList.add(su1Var);
                } else {
                    arrayList2.add(su1Var);
                }
            }
        } else {
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(l());
        }
        this.k = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        if (g(i, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public ju1 k() {
        return this;
    }

    public final ArrayList l() {
        boolean z = this.h;
        ArrayList arrayList = this.g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            su1 su1Var = (su1) arrayList2.get(i);
            if (su1Var.isVisible()) {
                arrayList.add(su1Var);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z) {
        if (!this.p) {
            if (z) {
                this.h = true;
                this.k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.u;
            if (!copyOnWriteArrayList.isEmpty()) {
                w();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    jv1 jv1Var = (jv1) weakReference.get();
                    if (jv1Var == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        jv1Var.h();
                    }
                }
                v();
                return;
            }
            return;
        }
        this.q = true;
        if (z) {
            this.r = true;
        }
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        su1 g = g(i, keyEvent);
        if (g != null) {
            z = q(g, null, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            c(true);
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.MenuItem r7, defpackage.jv1 r8, int r9) {
        /*
            r6 = this;
            su1 r7 = (defpackage.su1) r7
            r0 = 0
            if (r7 == 0) goto Ld7
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld7
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.p
            r2 = 1
            if (r1 == 0) goto L19
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L19
            goto L40
        L19:
            ju1 r1 = r7.n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L22
            goto L40
        L22:
            android.content.Intent r3 = r7.g
            if (r3 == 0) goto L34
            android.content.Context r1 = r1.f2830a     // Catch: android.content.ActivityNotFoundException -> L2c
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2c
            goto L40
        L2c:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L34:
            tu1 r1 = r7.A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f4579a
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
        L40:
            r1 = 1
            goto L43
        L42:
            r1 = 0
        L43:
            tu1 r3 = r7.A
            if (r3 == 0) goto L51
            android.view.ActionProvider r4 = r3.f4579a
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = 1
            goto L52
        L51:
            r4 = 0
        L52:
            boolean r5 = r7.e()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld6
            r6.c(r2)
            goto Ld6
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld6
            r6.c(r2)
            goto Ld6
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.c(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            q23 r9 = new q23
            android.content.Context r5 = r6.f2830a
            r9.<init>(r5, r6, r7)
            r7.o = r9
            java.lang.CharSequence r5 = r7.e
            r9.setHeaderTitle(r5)
        L90:
            q23 r7 = r7.o
            if (r4 == 0) goto L9e
            yu1 r9 = r3.f4580b
            r9.getClass()
            android.view.ActionProvider r9 = r3.f4579a
            r9.onPrepareSubMenu(r7)
        L9e:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto La7
            goto Ld0
        La7:
            if (r8 == 0) goto Lad
            boolean r0 = r8.c(r7)
        Lad:
            java.util.Iterator r8 = r9.iterator()
        Lb1:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Ld0
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            jv1 r4 = (defpackage.jv1) r4
            if (r4 != 0) goto Lc9
            r9.remove(r3)
            goto Lb1
        Lc9:
            if (r0 != 0) goto Lb1
            boolean r0 = r4.c(r7)
            goto Lb1
        Ld0:
            r1 = r1 | r0
            if (r1 != 0) goto Ld6
            r6.c(r2)
        Ld6:
            return r1
        Ld7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju1.q(android.view.MenuItem, jv1, int):boolean");
    }

    public final void r(jv1 jv1Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            jv1 jv1Var2 = (jv1) weakReference.get();
            if (jv1Var2 == null || jv1Var2 == jv1Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList;
        int size = size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            arrayList = this.f;
            if (i3 < size) {
                if (((su1) arrayList.get(i3)).f4415b == i) {
                    break;
                } else {
                    i3++;
                }
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((su1) arrayList.get(i3)).f4415b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList;
        int size = size();
        int i2 = 0;
        while (true) {
            arrayList = this.f;
            if (i2 < size) {
                if (((su1) arrayList.get(i2)).f4414a == i) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0 && i2 < arrayList.size()) {
            arrayList.remove(i2);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((q23) item.getSubMenu()).s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 > 0 && (findItem = findItem(i2)) != null) {
            findItem.expandActionView();
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        int i2;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            su1 su1Var = (su1) arrayList.get(i3);
            if (su1Var.f4415b == i) {
                int i4 = su1Var.x & (-5);
                if (z2) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                su1Var.x = i4 | i2;
                su1Var.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            su1 su1Var = (su1) arrayList.get(i2);
            if (su1Var.f4415b == i) {
                su1Var.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        int i2;
        boolean z2;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            su1 su1Var = (su1) arrayList.get(i3);
            if (su1Var.f4415b == i) {
                int i4 = su1Var.x;
                int i5 = i4 & (-9);
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                int i6 = i5 | i2;
                su1Var.x = i6;
                if (i4 != i6) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((q23) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.m = this.f2831b.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                this.n = x80.getDrawable(this.f2830a, i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        p(false);
    }

    public final void v() {
        this.p = false;
        if (this.q) {
            this.q = false;
            p(this.r);
        }
    }

    public final void w() {
        if (!this.p) {
            this.p = true;
            this.q = false;
            this.r = false;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f2831b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f2831b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        su1 a2 = a(i, i2, i3, charSequence);
        q23 q23Var = new q23(this.f2830a, this, a2);
        a2.o = q23Var;
        q23Var.setHeaderTitle(a2.e);
        return q23Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.f2831b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f2831b.getString(i4));
    }
}
