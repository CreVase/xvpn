package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.l;
import defpackage.a7;
import defpackage.an2;
import defpackage.b32;
import defpackage.bc0;
import defpackage.bk1;
import defpackage.bn2;
import defpackage.ck1;
import defpackage.cn2;
import defpackage.dy1;
import defpackage.e7;
import defpackage.ef2;
import defpackage.ff2;
import defpackage.gf2;
import defpackage.h52;
import defpackage.hf2;
import defpackage.i30;
import defpackage.im3;
import defpackage.j30;
import defpackage.k30;
import defpackage.k71;
import defpackage.km3;
import defpackage.kv1;
import defpackage.l80;
import defpackage.lm3;
import defpackage.lu1;
import defpackage.m30;
import defpackage.mp0;
import defpackage.n30;
import defpackage.nw3;
import defpackage.ou1;
import defpackage.p30;
import defpackage.pe0;
import defpackage.pu1;
import defpackage.q22;
import defpackage.q30;
import defpackage.qw3;
import defpackage.r30;
import defpackage.t22;
import defpackage.tj1;
import defpackage.u11;
import defpackage.u22;
import defpackage.u31;
import defpackage.uj1;
import defpackage.v73;
import defpackage.vj1;
import defpackage.vx1;
import defpackage.w6;
import defpackage.x22;
import defpackage.x6;
import defpackage.y22;
import defpackage.y70;
import defpackage.ya0;
import defpackage.zj1;
import defpackage.zm2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class ComponentActivity extends r30 implements lm3, k71, bn2, q22, e7, t22, b32, x22, y22, lu1 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final androidx.activity.result.a mActivityResultRegistry;
    private int mContentLayoutId;
    private im3 mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final u31 mFullyDrawnReporter;
    private final AtomicInteger mNextLocalRequestCode;
    private b mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<y70> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<y70> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<y70> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<y70> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<y70> mOnTrimMemoryListeners;
    final q30 mReportFullyDrawnExecutor;
    final an2 mSavedStateRegistryController;
    private km3 mViewModelStore;
    final l80 mContextAwareHelper = new l80();
    private final pu1 mMenuHostHelper = new pu1(new nw3(this, 1));
    private final ck1 mLifecycleRegistry = new ck1(this);

    public ComponentActivity() {
        an2 an2Var = new an2(this);
        this.mSavedStateRegistryController = an2Var;
        this.mOnBackPressedDispatcher = null;
        final l lVar = (l) this;
        a aVar = new a(lVar);
        this.mReportFullyDrawnExecutor = aVar;
        this.mFullyDrawnReporter = new u31(aVar, new i30(this, 0));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new m30(lVar);
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() != null) {
            int i = Build.VERSION.SDK_INT;
            getLifecycle().a(new zj1() { // from class: androidx.activity.ComponentActivity.2
                @Override // defpackage.zj1
                public final void e(bk1 bk1Var, tj1 tj1Var) {
                    View view;
                    if (tj1Var == tj1.ON_STOP) {
                        Window window = lVar.getWindow();
                        if (window != null) {
                            view = window.peekDecorView();
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            view.cancelPendingInputEvents();
                        }
                    }
                }
            });
            getLifecycle().a(new zj1() { // from class: androidx.activity.ComponentActivity.3
                @Override // defpackage.zj1
                public final void e(bk1 bk1Var, tj1 tj1Var) {
                    if (tj1Var == tj1.ON_DESTROY) {
                        lVar.mContextAwareHelper.f3081b = null;
                        if (!lVar.isChangingConfigurations()) {
                            lVar.getViewModelStore().a();
                        }
                        a aVar2 = (a) lVar.mReportFullyDrawnExecutor;
                        ComponentActivity componentActivity = aVar2.d;
                        componentActivity.getWindow().getDecorView().removeCallbacks(aVar2);
                        componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(aVar2);
                    }
                }
            });
            getLifecycle().a(new zj1() { // from class: androidx.activity.ComponentActivity.4
                @Override // defpackage.zj1
                public final void e(bk1 bk1Var, tj1 tj1Var) {
                    ComponentActivity componentActivity = lVar;
                    componentActivity.ensureViewModelStore();
                    componentActivity.getLifecycle().b(this);
                }
            });
            an2Var.a();
            pe0.p(this);
            if (i <= 23) {
                getLifecycle().a(new ImmLeaksCleaner(lVar));
            }
            getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new j30(this, 0));
            addOnContextAvailableListener(new k30(lVar, 0));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public static Bundle G(ComponentActivity componentActivity) {
        componentActivity.getClass();
        Bundle bundle = new Bundle();
        androidx.activity.result.a aVar = componentActivity.mActivityResultRegistry;
        aVar.getClass();
        HashMap hashMap = aVar.f139b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(aVar.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) aVar.g.clone());
        return bundle;
    }

    public static void H(ComponentActivity componentActivity) {
        Bundle a2 = componentActivity.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a2 != null) {
            androidx.activity.result.a aVar = componentActivity.mActivityResultRegistry;
            aVar.getClass();
            ArrayList<Integer> integerArrayList = a2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                aVar.d = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                Bundle bundle = a2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                Bundle bundle2 = aVar.g;
                bundle2.putAll(bundle);
                for (int i = 0; i < stringArrayList.size(); i++) {
                    String str = stringArrayList.get(i);
                    HashMap hashMap = aVar.f139b;
                    boolean containsKey = hashMap.containsKey(str);
                    HashMap hashMap2 = aVar.f138a;
                    if (containsKey) {
                        Integer num = (Integer) hashMap.remove(str);
                        if (!bundle2.containsKey(str)) {
                            hashMap2.remove(num);
                        }
                    }
                    int intValue = integerArrayList.get(i).intValue();
                    String str2 = stringArrayList.get(i);
                    hashMap2.put(Integer.valueOf(intValue), str2);
                    hashMap.put(str2, Integer.valueOf(intValue));
                }
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.x(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.lu1
    public void addMenuProvider(kv1 kv1Var) {
        pu1 pu1Var = this.mMenuHostHelper;
        pu1Var.f3920b.add(kv1Var);
        pu1Var.f3919a.run();
    }

    @Override // defpackage.t22
    public final void addOnConfigurationChangedListener(y70 y70Var) {
        this.mOnConfigurationChangedListeners.add(y70Var);
    }

    public final void addOnContextAvailableListener(u22 u22Var) {
        l80 l80Var = this.mContextAwareHelper;
        Context context = l80Var.f3081b;
        if (context != null) {
            u22Var.a(context);
        }
        l80Var.f3080a.add(u22Var);
    }

    @Override // defpackage.x22
    public final void addOnMultiWindowModeChangedListener(y70 y70Var) {
        this.mOnMultiWindowModeChangedListeners.add(y70Var);
    }

    public final void addOnNewIntentListener(y70 y70Var) {
        this.mOnNewIntentListeners.add(y70Var);
    }

    @Override // defpackage.y22
    public final void addOnPictureInPictureModeChangedListener(y70 y70Var) {
        this.mOnPictureInPictureModeChangedListeners.add(y70Var);
    }

    @Override // defpackage.b32
    public final void addOnTrimMemoryListener(y70 y70Var) {
        this.mOnTrimMemoryListeners.add(y70Var);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            p30 p30Var = (p30) getLastNonConfigurationInstance();
            if (p30Var != null) {
                this.mViewModelStore = p30Var.f3773b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new km3();
            }
        }
    }

    @Override // defpackage.e7
    public final androidx.activity.result.a getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // defpackage.k71
    public bc0 getDefaultViewModelCreationExtras() {
        dy1 dy1Var = new dy1();
        if (getApplication() != null) {
            dy1Var.b(v73.f4791b, getApplication());
        }
        dy1Var.b(pe0.n, this);
        dy1Var.b(pe0.o, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            dy1Var.b(pe0.p, getIntent().getExtras());
        }
        return dy1Var;
    }

    @Override // defpackage.k71
    public im3 getDefaultViewModelProviderFactory() {
        Bundle bundle;
        if (this.mDefaultFactory == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            this.mDefaultFactory = new cn2(application, this, bundle);
        }
        return this.mDefaultFactory;
    }

    public u31 getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        p30 p30Var = (p30) getLastNonConfigurationInstance();
        if (p30Var != null) {
            return p30Var.f3772a;
        }
        return null;
    }

    @Override // defpackage.bk1
    public vj1 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // defpackage.q22
    public final b getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new b(new qw3(this, 1));
            getLifecycle().a(new zj1() { // from class: androidx.activity.ComponentActivity.6
                @Override // defpackage.zj1
                public final void e(bk1 bk1Var, tj1 tj1Var) {
                    if (tj1Var == tj1.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                        b bVar = ComponentActivity.this.mOnBackPressedDispatcher;
                        bVar.e = n30.a((ComponentActivity) bk1Var);
                        bVar.c(bVar.g);
                    }
                }
            });
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // defpackage.bn2
    public final zm2 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f117b;
    }

    @Override // defpackage.lm3
    public km3 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void initializeViewTreeOwners() {
        getWindow().getDecorView().setTag(ef2.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(ff2.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(gf2.view_tree_saved_state_registry_owner, this);
        getWindow().getDecorView().setTag(hf2.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(hf2.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.mActivityResultRegistry.a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<y70> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // defpackage.r30, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.b(bundle);
        l80 l80Var = this.mContextAwareHelper;
        l80Var.f3081b = this;
        Iterator it = l80Var.f3080a.iterator();
        while (it.hasNext()) {
            ((u22) it.next()).a(this);
        }
        super.onCreate(bundle);
        mp0.o(this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            pu1 pu1Var = this.mMenuHostHelper;
            MenuInflater menuInflater = getMenuInflater();
            Iterator it = pu1Var.f3920b.iterator();
            while (it.hasNext()) {
                ((u11) ((kv1) it.next())).f4613a.j(menu, menuInflater);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mMenuHostHelper.a(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<y70> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new vx1(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<y70> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = this.mMenuHostHelper.f3920b.iterator();
        while (it.hasNext()) {
            ((u11) ((kv1) it.next())).f4613a.p(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<y70> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new h52(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            Iterator it = this.mMenuHostHelper.f3920b.iterator();
            while (it.hasNext()) {
                ((u11) ((kv1) it.next())).f4613a.s(menu);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        p30 p30Var;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        km3 km3Var = this.mViewModelStore;
        if (km3Var == null && (p30Var = (p30) getLastNonConfigurationInstance()) != null) {
            km3Var = p30Var.f3773b;
        }
        if (km3Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        p30 p30Var2 = new p30();
        p30Var2.f3772a = onRetainCustomNonConfigurationInstance;
        p30Var2.f3773b = km3Var;
        return p30Var2;
    }

    @Override // defpackage.r30, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        vj1 lifecycle = getLifecycle();
        if (lifecycle instanceof ck1) {
            ck1 ck1Var = (ck1) lifecycle;
            uj1 uj1Var = uj1.CREATED;
            ck1Var.d("setCurrentState");
            ck1Var.f(uj1Var);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<y70> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f3081b;
    }

    public final <I, O> a7 registerForActivityResult(x6 x6Var, androidx.activity.result.a aVar, w6 w6Var) {
        return aVar.d("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, x6Var, w6Var);
    }

    @Override // defpackage.lu1
    public void removeMenuProvider(kv1 kv1Var) {
        this.mMenuHostHelper.b(kv1Var);
    }

    @Override // defpackage.t22
    public final void removeOnConfigurationChangedListener(y70 y70Var) {
        this.mOnConfigurationChangedListeners.remove(y70Var);
    }

    public final void removeOnContextAvailableListener(u22 u22Var) {
        this.mContextAwareHelper.f3080a.remove(u22Var);
    }

    @Override // defpackage.x22
    public final void removeOnMultiWindowModeChangedListener(y70 y70Var) {
        this.mOnMultiWindowModeChangedListeners.remove(y70Var);
    }

    public final void removeOnNewIntentListener(y70 y70Var) {
        this.mOnNewIntentListeners.remove(y70Var);
    }

    @Override // defpackage.y22
    public final void removeOnPictureInPictureModeChangedListener(y70 y70Var) {
        this.mOnPictureInPictureModeChangedListeners.remove(y70Var);
    }

    @Override // defpackage.b32
    public final void removeOnTrimMemoryListener(y70 y70Var) {
        this.mOnTrimMemoryListeners.remove(y70Var);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (ya0.W()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.a();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.x(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<y70> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new vx1(z, 0));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<y70> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new h52(z, 0));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    public final <I, O> a7 registerForActivityResult(x6 x6Var, w6 w6Var) {
        return registerForActivityResult(x6Var, this.mActivityResultRegistry, w6Var);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.x(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void addMenuProvider(final kv1 kv1Var, bk1 bk1Var) {
        final pu1 pu1Var = this.mMenuHostHelper;
        pu1Var.f3920b.add(kv1Var);
        pu1Var.f3919a.run();
        vj1 lifecycle = bk1Var.getLifecycle();
        HashMap hashMap = pu1Var.c;
        ou1 ou1Var = (ou1) hashMap.remove(kv1Var);
        if (ou1Var != null) {
            ou1Var.f3731a.b(ou1Var.f3732b);
            ou1Var.f3732b = null;
        }
        hashMap.put(kv1Var, new ou1(lifecycle, new zj1() { // from class: mu1
            @Override // defpackage.zj1
            public final void e(bk1 bk1Var2, tj1 tj1Var) {
                tj1 tj1Var2 = tj1.ON_DESTROY;
                pu1 pu1Var2 = pu1.this;
                if (tj1Var == tj1Var2) {
                    pu1Var2.b(kv1Var);
                } else {
                    pu1Var2.getClass();
                }
            }
        }));
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.x(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(final kv1 kv1Var, bk1 bk1Var, final uj1 uj1Var) {
        final pu1 pu1Var = this.mMenuHostHelper;
        pu1Var.getClass();
        vj1 lifecycle = bk1Var.getLifecycle();
        HashMap hashMap = pu1Var.c;
        ou1 ou1Var = (ou1) hashMap.remove(kv1Var);
        if (ou1Var != null) {
            ou1Var.f3731a.b(ou1Var.f3732b);
            ou1Var.f3732b = null;
        }
        hashMap.put(kv1Var, new ou1(lifecycle, new zj1() { // from class: nu1
            @Override // defpackage.zj1
            public final void e(bk1 bk1Var2, tj1 tj1Var) {
                pu1 pu1Var2 = pu1.this;
                pu1Var2.getClass();
                tj1.Companion.getClass();
                uj1 uj1Var2 = uj1Var;
                tj1 b2 = rj1.b(uj1Var2);
                Runnable runnable = pu1Var2.f3919a;
                CopyOnWriteArrayList copyOnWriteArrayList = pu1Var2.f3920b;
                kv1 kv1Var2 = kv1Var;
                if (tj1Var == b2) {
                    copyOnWriteArrayList.add(kv1Var2);
                    runnable.run();
                } else if (tj1Var == tj1.ON_DESTROY) {
                    pu1Var2.b(kv1Var2);
                } else if (tj1Var == rj1.a(uj1Var2)) {
                    copyOnWriteArrayList.remove(kv1Var2);
                    runnable.run();
                }
            }
        }));
    }
}
