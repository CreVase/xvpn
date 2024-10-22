package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.l;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class ic extends l implements lc, i63 {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private sc mDelegate;
    private Resources mResources;

    public ic() {
        getSavedStateRegistry().c(DELEGATE_TAG, new gc(this));
        addOnContextAvailableListener(new hc(this));
    }

    public final void L() {
        getWindow().getDecorView().setTag(ef2.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(ff2.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(gf2.view_tree_saved_state_registry_owner, this);
        getWindow().getDecorView().setTag(hf2.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        L();
        getDelegate().a(view, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01bd  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ic.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        k4 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.r30, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        k4 supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        jd jdVar = (jd) getDelegate();
        jdVar.E();
        return (T) jdVar.l.findViewById(i);
    }

    public sc getDelegate() {
        if (this.mDelegate == null) {
            mf mfVar = sc.f4311a;
            this.mDelegate = new jd(this, null, this, this);
        }
        return this.mDelegate;
    }

    public n4 getDrawerToggleDelegate() {
        jd jdVar = (jd) getDelegate();
        jdVar.getClass();
        return new vc(jdVar);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        Context context;
        jd jdVar = (jd) getDelegate();
        if (jdVar.p == null) {
            jdVar.K();
            k4 k4Var = jdVar.o;
            if (k4Var != null) {
                context = k4Var.e();
            } else {
                context = jdVar.k;
            }
            jdVar.p = new p33(context);
        }
        return jdVar.p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i = uj3.f4684a;
        }
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    public k4 getSupportActionBar() {
        jd jdVar = (jd) getDelegate();
        jdVar.K();
        return jdVar.o;
    }

    @Override // defpackage.i63
    public Intent getSupportParentActivityIntent() {
        return tf3.O(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().g();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        jd jdVar = (jd) getDelegate();
        if (jdVar.F && jdVar.z) {
            jdVar.K();
            k4 k4Var = jdVar.o;
            if (k4Var != null) {
                k4Var.g();
            }
        }
        nd a2 = nd.a();
        Context context = jdVar.k;
        synchronized (a2) {
            a2.f3439a.k(context);
        }
        jdVar.R = new Configuration(jdVar.k.getResources().getConfiguration());
        jdVar.v(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(j63 j63Var) {
        j63Var.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = tf3.O(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            Context context = j63Var.f2712b;
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(context.getPackageManager());
            }
            ArrayList arrayList = j63Var.f2711a;
            int size = arrayList.size();
            try {
                for (Intent P = tf3.P(context, component); P != null; P = tf3.P(context, P.getComponent())) {
                    arrayList.add(size, P);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
    }

    @Override // androidx.fragment.app.l, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().j();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onLocalesChanged(wm1 wm1Var) {
    }

    @Override // androidx.fragment.app.l, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        k4 supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() == 16908332 && supportActionBar != null && (supportActionBar.d() & 4) != 0) {
            return onSupportNavigateUp();
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onNightModeChanged(int i) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((jd) getDelegate()).E();
    }

    @Override // androidx.fragment.app.l, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        jd jdVar = (jd) getDelegate();
        jdVar.K();
        k4 k4Var = jdVar.o;
        if (k4Var != null) {
            k4Var.p(true);
        }
    }

    public void onPrepareSupportNavigateUpTaskStack(j63 j63Var) {
    }

    @Override // androidx.fragment.app.l, android.app.Activity
    public void onStart() {
        super.onStart();
        ((jd) getDelegate()).v(true, false);
    }

    @Override // androidx.fragment.app.l, android.app.Activity
    public void onStop() {
        super.onStop();
        jd jdVar = (jd) getDelegate();
        jdVar.K();
        k4 k4Var = jdVar.o;
        if (k4Var != null) {
            k4Var.p(false);
        }
    }

    @Override // defpackage.lc
    public void onSupportActionModeFinished(h5 h5Var) {
    }

    @Override // defpackage.lc
    public void onSupportActionModeStarted(h5 h5Var) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            j63 j63Var = new j63(this);
            onCreateSupportNavigateUpTaskStack(j63Var);
            onPrepareSupportNavigateUpTaskStack(j63Var);
            ArrayList arrayList = j63Var.f2711a;
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                Context context = j63Var.f2712b;
                if (!x80.startActivities(context, intentArr, null)) {
                    Intent intent = new Intent(intentArr[intentArr.length - 1]);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                }
                try {
                    int i = a6.f29a;
                    s5.a(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        supportNavigateUpTo(supportParentActivityIntent);
        return true;
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().r(charSequence);
    }

    @Override // defpackage.lc
    public h5 onWindowStartingSupportActionMode(g5 g5Var) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        k4 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        L();
        getDelegate().n(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        CharSequence charSequence;
        jd jdVar = (jd) getDelegate();
        if (jdVar.j instanceof Activity) {
            jdVar.K();
            k4 k4Var = jdVar.o;
            if (!(k4Var instanceof xp3)) {
                jdVar.p = null;
                if (k4Var != null) {
                    k4Var.h();
                }
                jdVar.o = null;
                if (toolbar != null) {
                    Object obj = jdVar.j;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = jdVar.q;
                    }
                    v93 v93Var = new v93(toolbar, charSequence, jdVar.m);
                    jdVar.o = v93Var;
                    jdVar.m.f1761b = v93Var.c;
                    toolbar.setBackInvokedCallbackEnabled(true);
                } else {
                    jdVar.m.f1761b = null;
                }
                jdVar.g();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        ((jd) getDelegate()).Y = i;
    }

    public h5 startSupportActionMode(g5 g5Var) {
        return getDelegate().s(g5Var);
    }

    @Override // androidx.fragment.app.l
    public void supportInvalidateOptionsMenu() {
        getDelegate().g();
    }

    public void supportNavigateUpTo(Intent intent) {
        yy1.b(this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().l(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return yy1.c(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        L();
        getDelegate().o(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        L();
        getDelegate().p(view, layoutParams);
    }
}
