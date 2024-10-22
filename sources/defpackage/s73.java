package defpackage;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class s73 implements ActionMode.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final ActionMode.Callback f4288a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f4289b;
    public Class c;
    public Method d;
    public boolean e;
    public boolean f = false;

    public s73(ActionMode.Callback callback, TextView textView) {
        this.f4288a = callback;
        this.f4289b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f4288a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f4288a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f4288a.onDestroyActionMode(actionMode);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c9, code lost:            if (r10 == 0) goto L42;     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f A[SYNTHETIC] */
    @Override // android.view.ActionMode.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onPrepareActionMode(android.view.ActionMode r14, android.view.Menu r15) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s73.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
    }
}
