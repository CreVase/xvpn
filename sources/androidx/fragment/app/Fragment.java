package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.IntentSenderRequest;
import defpackage.a21;
import defpackage.a6;
import defpackage.a7;
import defpackage.an2;
import defpackage.b7;
import defpackage.bc0;
import defpackage.bk1;
import defpackage.bn2;
import defpackage.c21;
import defpackage.ck1;
import defpackage.cn2;
import defpackage.dy1;
import defpackage.e33;
import defpackage.ef2;
import defpackage.ey1;
import defpackage.ff2;
import defpackage.g11;
import defpackage.gf2;
import defpackage.h11;
import defpackage.hx2;
import defpackage.i11;
import defpackage.i21;
import defpackage.im1;
import defpackage.im3;
import defpackage.j11;
import defpackage.j21;
import defpackage.jm1;
import defpackage.k11;
import defpackage.k21;
import defpackage.k71;
import defpackage.km3;
import defpackage.l11;
import defpackage.lm3;
import defpackage.mr2;
import defpackage.nw3;
import defpackage.p11;
import defpackage.p71;
import defpackage.pe0;
import defpackage.q51;
import defpackage.r11;
import defpackage.r51;
import defpackage.rx2;
import defpackage.s11;
import defpackage.s5;
import defpackage.ss2;
import defpackage.tj1;
import defpackage.u41;
import defpackage.uj1;
import defpackage.v11;
import defpackage.v73;
import defpackage.vj1;
import defpackage.w6;
import defpackage.x6;
import defpackage.x80;
import defpackage.zj1;
import defpackage.zm2;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, bk1, lm3, k71, bn2 {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    i mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    p mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    im3 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    p mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    r11 mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    ck1 mLifecycleRegistry;
    uj1 mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<k11> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final k11 mSavedStateAttachListener;
    an2 mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    t mViewLifecycleOwner;
    ey1 mViewLifecycleOwnerLiveData;
    String mWho;

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* loaded from: classes.dex */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new l11();

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f212a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f212a = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f212a);
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new a21();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new g11(this, 0);
        this.mMaxState = uj1.RESUMED;
        this.mViewLifecycleOwnerLiveData = new ey1();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new g(this);
        f();
    }

    public static void a(Fragment fragment) {
        t tVar = fragment.mViewLifecycleOwner;
        tVar.f.b(fragment.mSavedViewRegistryState);
        fragment.mSavedViewRegistryState = null;
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public final i b() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new i();
        }
        return this.mAnimationInfo;
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        p pVar;
        i iVar = this.mAnimationInfo;
        if (iVar != null) {
            iVar.s = false;
        }
        if (this.mView != null && (viewGroup = this.mContainer) != null && (pVar = this.mFragmentManager) != null) {
            e i = e.i(viewGroup, pVar);
            i.j();
            if (z) {
                this.mHost.c.post(new h11(i));
            } else {
                i.e();
            }
            Handler handler = this.mPostponedHandler;
            if (handler != null) {
                handler.removeCallbacks(this.mPostponedDurationRunnable);
                this.mPostponedHandler = null;
            }
        }
    }

    public p11 createFragmentContainer() {
        return new h(this);
    }

    public final int d() {
        uj1 uj1Var = this.mMaxState;
        if (uj1Var != uj1.INITIALIZED && this.mParentFragment != null) {
            return Math.min(uj1Var.ordinal(), this.mParentFragment.d());
        }
        return uj1Var.ordinal();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment e = e(false);
        if (e != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(e);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            im1.a(this).c(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.u(p71.l(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final Fragment e(boolean z) {
        String str;
        if (z) {
            j21 j21Var = k21.f2874a;
            k21.b(new r51(this, 1));
            k21.a(this).getClass();
            Object obj = i21.DETECT_TARGET_FRAGMENT_USAGE;
            if (obj instanceof Void) {
            }
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        p pVar = this.mFragmentManager;
        if (pVar != null && (str = this.mTargetWho) != null) {
            return pVar.A(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final void f() {
        this.mLifecycleRegistry = new ck1(this);
        this.mSavedStateRegistryController = new an2(this);
        this.mDefaultFactory = null;
        if (!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            k11 k11Var = this.mSavedStateAttachListener;
            if (this.mState >= 0) {
                k11Var.a();
            } else {
                this.mOnPreAttachedListeners.add(k11Var);
            }
        }
    }

    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.c.c(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final l getActivity() {
        r11 r11Var = this.mHost;
        if (r11Var == null) {
            return null;
        }
        return (l) r11Var.f4087a;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        i iVar = this.mAnimationInfo;
        if (iVar != null && (bool = iVar.p) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        i iVar = this.mAnimationInfo;
        if (iVar != null && (bool = iVar.o) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public View getAnimatingAway() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        iVar.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final p getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(hx2.o("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        r11 r11Var = this.mHost;
        if (r11Var == null) {
            return null;
        }
        return r11Var.f4088b;
    }

    @Override // defpackage.k71
    public bc0 getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && p.I(3)) {
            Objects.toString(requireContext().getApplicationContext());
        }
        dy1 dy1Var = new dy1();
        if (application != null) {
            dy1Var.b(v73.f4791b, application);
        }
        dy1Var.b(pe0.n, this);
        dy1Var.b(pe0.o, this);
        if (getArguments() != null) {
            dy1Var.b(pe0.p, getArguments());
        }
        return dy1Var;
    }

    @Override // defpackage.k71
    public im3 getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (applicationContext instanceof ContextWrapper) {
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                            break;
                        }
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    } else {
                        application = null;
                        break;
                    }
                }
                if (application == null && p.I(3)) {
                    Objects.toString(requireContext().getApplicationContext());
                }
                this.mDefaultFactory = new cn2(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public int getEnterAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f229b;
    }

    public Object getEnterTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.i;
    }

    public ss2 getEnterTransitionCallback() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        iVar.getClass();
        return null;
    }

    public int getExitAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.c;
    }

    public Object getExitTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.k;
    }

    public ss2 getExitTransitionCallback() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        iVar.getClass();
        return null;
    }

    public View getFocusedView() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.r;
    }

    @Deprecated
    public final p getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        r11 r11Var = this.mHost;
        if (r11Var == null) {
            return null;
        }
        return ((k) r11Var).e;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // defpackage.bk1
    public vj1 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public im1 getLoaderManager() {
        return im1.a(this);
    }

    public int getNextTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final p getParentFragmentManager() {
        p pVar = this.mFragmentManager;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException(hx2.o("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.f228a;
    }

    public int getPopEnterAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.d;
    }

    public int getPopExitAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.e;
    }

    public float getPostOnViewCreatedAlpha() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 1.0f;
        }
        return iVar.q;
    }

    public Object getReenterTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.l;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        j21 j21Var = k21.f2874a;
        k21.b(new q51(this, 0));
        k21.a(this).getClass();
        Object obj = i21.DETECT_RETAIN_INSTANCE_USAGE;
        if (obj instanceof Void) {
        }
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.j;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return obj;
    }

    @Override // defpackage.bn2
    public final zm2 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f117b;
    }

    public Object getSharedElementEnterTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.m;
    }

    public Object getSharedElementReturnTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.n;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        i iVar = this.mAnimationInfo;
        if (iVar != null && (arrayList = iVar.g) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        i iVar = this.mAnimationInfo;
        if (iVar != null && (arrayList = iVar.h) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return e(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        j21 j21Var = k21.f2874a;
        k21.b(new r51(this, 0));
        k21.a(this).getClass();
        Object obj = i21.DETECT_TARGET_FRAGMENT_USAGE;
        if (obj instanceof Void) {
        }
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public bk1 getViewLifecycleOwner() {
        t tVar = this.mViewLifecycleOwner;
        if (tVar != null) {
            return tVar;
        }
        throw new IllegalStateException(hx2.o("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public androidx.lifecycle.b getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // defpackage.lm3
    public km3 getViewModelStore() {
        if (this.mFragmentManager != null) {
            if (d() != 1) {
                HashMap hashMap = this.mFragmentManager.L.f;
                km3 km3Var = (km3) hashMap.get(this.mWho);
                if (km3Var == null) {
                    km3 km3Var2 = new km3();
                    hashMap.put(this.mWho, km3Var2);
                    return km3Var2;
                }
                return km3Var;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        f();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new a21();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        if (this.mHost != null && this.mAdded) {
            return true;
        }
        return false;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        boolean isHidden;
        if (!this.mHidden) {
            p pVar = this.mFragmentManager;
            if (pVar == null) {
                return false;
            }
            Fragment fragment = this.mParentFragment;
            pVar.getClass();
            if (fragment == null) {
                isHidden = false;
            } else {
                isHidden = fragment.isHidden();
            }
            if (!isHidden) {
                return false;
            }
        }
        return true;
    }

    public final boolean isInBackStack() {
        if (this.mBackStackNesting > 0) {
            return true;
        }
        return false;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        boolean isMenuVisible;
        if (this.mMenuVisible) {
            if (this.mFragmentManager == null) {
                return true;
            }
            Fragment fragment = this.mParentFragment;
            if (fragment == null) {
                isMenuVisible = true;
            } else {
                isMenuVisible = fragment.isMenuVisible();
            }
            if (isMenuVisible) {
                return true;
            }
        }
        return false;
    }

    public boolean isPostponed() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        if (this.mState >= 7) {
            return true;
        }
        return false;
    }

    public final boolean isStateSaved() {
        p pVar = this.mFragmentManager;
        if (pVar == null) {
            return false;
        }
        return pVar.M();
    }

    public final boolean isVisible() {
        View view;
        if (isAdded() && !isHidden() && (view = this.mView) != null && view.getWindowToken() != null && this.mView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final b7 l(x6 x6Var, u41 u41Var, w6 w6Var) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            i11 i11Var = new i11(this, u41Var, atomicReference, x6Var, w6Var);
            if (this.mState >= 0) {
                i11Var.a();
            } else {
                this.mOnPreAttachedListeners.add(i11Var);
            }
            return new b7(this, atomicReference, x6Var, 2);
        }
        throw new IllegalStateException(hx2.o("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.O();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (p.I(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        r11 r11Var = this.mHost;
        Activity activity = r11Var == null ? null : r11Var.f4087a;
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        this.mCalled = true;
        restoreChildFragmentState();
        p pVar = this.mChildFragmentManager;
        if (pVar.s >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            pVar.E = false;
            pVar.F = false;
            pVar.L.i = false;
            pVar.t(1);
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        r11 r11Var = this.mHost;
        Activity activity = r11Var == null ? null : r11Var.f4087a;
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        Bundle bundle2;
        this.mChildFragmentManager.O();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            if (p.I(3)) {
                toString();
            }
            if (this.mView != null) {
                Bundle bundle3 = this.mSavedFragmentState;
                if (bundle3 != null) {
                    bundle2 = bundle3.getBundle("savedInstanceState");
                } else {
                    bundle2 = null;
                }
                restoreViewState(bundle2);
            }
            this.mSavedFragmentState = null;
            p pVar = this.mChildFragmentManager;
            pVar.E = false;
            pVar.F = false;
            pVar.L.i = false;
            pVar.t(4);
            return;
        }
        throw new e33(hx2.o("Fragment ", this, " did not call through to super.onActivityCreated()"));
    }

    public void performAttach() {
        Iterator<k11> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f4088b);
        if (this.mCalled) {
            Iterator it2 = this.mFragmentManager.m.iterator();
            while (it2.hasNext()) {
                ((c21) it2.next()).a(this);
            }
            p pVar = this.mChildFragmentManager;
            pVar.E = false;
            pVar.F = false;
            pVar.L.i = false;
            pVar.t(0);
            return;
        }
        throw new e33(hx2.o("Fragment ", this, " did not call through to super.onAttach()"));
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (onContextItemSelected(menuItem)) {
                return true;
            }
            return this.mChildFragmentManager.i(menuItem);
        }
        return false;
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.O();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new zj1() { // from class: androidx.fragment.app.Fragment.6
            @Override // defpackage.zj1
            public final void e(bk1 bk1Var, tj1 tj1Var) {
                View view;
                if (tj1Var == tj1.ON_STOP && (view = Fragment.this.mView) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.e(tj1.ON_CREATE);
            return;
        }
        throw new e33(hx2.o("Fragment ", this, " did not call through to super.onCreate()"));
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return z | this.mChildFragmentManager.j(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.O();
        boolean z = true;
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new t(this, getViewModelStore(), new nw3(this, 7));
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.b();
            if (p.I(3)) {
                Objects.toString(this.mView);
                toString();
            }
            this.mView.setTag(ef2.view_tree_lifecycle_owner, this.mViewLifecycleOwner);
            this.mView.setTag(ff2.view_tree_view_model_store_owner, this.mViewLifecycleOwner);
            this.mView.setTag(gf2.view_tree_saved_state_registry_owner, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.i(this.mViewLifecycleOwner);
            return;
        }
        if (this.mViewLifecycleOwner.e == null) {
            z = false;
        }
        if (!z) {
            this.mViewLifecycleOwner = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public void performDestroy() {
        this.mChildFragmentManager.k();
        this.mLifecycleRegistry.e(tj1.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
        } else {
            throw new e33(hx2.o("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.t(1);
        if (this.mView != null) {
            t tVar = this.mViewLifecycleOwner;
            tVar.b();
            if (tVar.e.d.a(uj1.CREATED)) {
                this.mViewLifecycleOwner.a(tj1.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            rx2 rx2Var = im1.a(this).f3488b.d;
            int f = rx2Var.f();
            for (int i = 0; i < f; i++) {
                ((jm1) rx2Var.g(i)).l();
            }
            this.mPerformedCreateView = false;
            return;
        }
        throw new e33(hx2.o("Fragment ", this, " did not call through to super.onDestroyView()"));
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            p pVar = this.mChildFragmentManager;
            if (!pVar.G) {
                pVar.k();
                this.mChildFragmentManager = new a21();
                return;
            }
            return;
        }
        throw new e33(hx2.o("Fragment ", this, " did not call through to super.onDetach()"));
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
                return true;
            }
            return this.mChildFragmentManager.o(menuItem);
        }
        return false;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.p(menu);
        }
    }

    public void performPause() {
        this.mChildFragmentManager.t(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(tj1.ON_PAUSE);
        }
        this.mLifecycleRegistry.e(tj1.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
        } else {
            throw new e33(hx2.o("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return z | this.mChildFragmentManager.s(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean L = p.L(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != L) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(L);
            onPrimaryNavigationFragmentChanged(L);
            p pVar = this.mChildFragmentManager;
            pVar.e0();
            pVar.q(pVar.w);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.O();
        this.mChildFragmentManager.x(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            ck1 ck1Var = this.mLifecycleRegistry;
            tj1 tj1Var = tj1.ON_RESUME;
            ck1Var.e(tj1Var);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(tj1Var);
            }
            p pVar = this.mChildFragmentManager;
            pVar.E = false;
            pVar.F = false;
            pVar.L.i = false;
            pVar.t(7);
            return;
        }
        throw new e33(hx2.o("Fragment ", this, " did not call through to super.onResume()"));
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.O();
        this.mChildFragmentManager.x(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            ck1 ck1Var = this.mLifecycleRegistry;
            tj1 tj1Var = tj1.ON_START;
            ck1Var.e(tj1Var);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(tj1Var);
            }
            p pVar = this.mChildFragmentManager;
            pVar.E = false;
            pVar.F = false;
            pVar.L.i = false;
            pVar.t(5);
            return;
        }
        throw new e33(hx2.o("Fragment ", this, " did not call through to super.onStart()"));
    }

    public void performStop() {
        p pVar = this.mChildFragmentManager;
        pVar.F = true;
        pVar.L.i = true;
        pVar.t(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(tj1.ON_STOP);
        }
        this.mLifecycleRegistry.e(tj1.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
        } else {
            throw new e33(hx2.o("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        onViewCreated(this.mView, bundle);
        this.mChildFragmentManager.t(2);
    }

    public void postponeEnterTransition() {
        b().s = true;
    }

    public final <I, O> a7 registerForActivityResult(x6 x6Var, w6 w6Var) {
        return l(x6Var, new o(this, 4), w6Var);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost != null) {
            p parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.B != null) {
                parentFragmentManager.C.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i));
                parentFragmentManager.B.a(strArr);
                return;
            }
            parentFragmentManager.t.getClass();
            return;
        }
        throw new IllegalStateException(hx2.o("Fragment ", this, " not attached to Activity"));
    }

    public final l requireActivity() {
        l activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(hx2.o("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(hx2.o("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(hx2.o("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final p requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(hx2.o("Fragment ", this, " not attached to a host."));
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            if (getContext() == null) {
                throw new IllegalStateException(hx2.o("Fragment ", this, " is not attached to any Fragment or host"));
            }
            throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
        }
        return parentFragment;
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(hx2.o("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 != null && (bundle = bundle2.getBundle("childFragmentManager")) != null) {
            this.mChildFragmentManager.V(bundle);
            p pVar = this.mChildFragmentManager;
            pVar.E = false;
            pVar.F = false;
            pVar.L.i = false;
            pVar.t(1);
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(tj1.ON_CREATE);
                return;
            }
            return;
        }
        throw new e33(hx2.o("Fragment ", this, " did not call through to super.onViewStateRestored()"));
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        b().p = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        b().o = Boolean.valueOf(z);
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        b().f229b = i;
        b().c = i2;
        b().d = i3;
        b().e = i4;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(ss2 ss2Var) {
        b().getClass();
    }

    public void setEnterTransition(Object obj) {
        b().i = obj;
    }

    public void setExitSharedElementCallback(ss2 ss2Var) {
        b().getClass();
    }

    public void setExitTransition(Object obj) {
        b().k = obj;
    }

    public void setFocusedView(View view) {
        b().r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                ((k) this.mHost).e.invalidateMenu();
            }
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (savedState == null || (bundle = savedState.f212a) == null) {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((k) this.mHost).e.invalidateMenu();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        b();
        this.mAnimationInfo.f = i;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        b().f228a = z;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        b().q = f;
    }

    public void setReenterTransition(Object obj) {
        b().l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        j21 j21Var = k21.f2874a;
        k21.b(new q51(this, 1));
        k21.a(this).getClass();
        Object obj = i21.DETECT_RETAIN_INSTANCE_USAGE;
        if (obj instanceof Void) {
        }
        this.mRetainInstance = z;
        p pVar = this.mFragmentManager;
        if (pVar != null) {
            if (z) {
                pVar.L.i(this);
                return;
            } else {
                pVar.L.m(this);
                return;
            }
        }
        this.mRetainInstanceChangedWhileDetached = true;
    }

    public void setReturnTransition(Object obj) {
        b().j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        b().m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        b();
        i iVar = this.mAnimationInfo;
        iVar.g = arrayList;
        iVar.h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        b().n = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i) {
        p pVar;
        if (fragment != null) {
            j21 j21Var = k21.f2874a;
            k21.b(new q51(this, fragment, i));
            k21.a(this).getClass();
            Object obj = i21.DETECT_TARGET_FRAGMENT_USAGE;
            if (obj instanceof Void) {
            }
        }
        p pVar2 = this.mFragmentManager;
        if (fragment != null) {
            pVar = fragment.mFragmentManager;
        } else {
            pVar = null;
        }
        if (pVar2 != null && pVar != null && pVar2 != pVar) {
            throw new IllegalArgumentException(hx2.o("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.e(false)) {
            if (fragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager != null && fragment.mFragmentManager != null) {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        } else {
            this.mTargetWho = null;
            this.mTarget = fragment;
        }
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        j21 j21Var = k21.f2874a;
        k21.b(new mr2(this, z));
        k21.a(this).getClass();
        Object obj = i21.DETECT_SET_USER_VISIBLE_HINT;
        if (obj instanceof Void) {
        }
        boolean z2 = true;
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            p pVar = this.mFragmentManager;
            r f = pVar.f(this);
            Fragment fragment = f.c;
            if (fragment.mDeferStart) {
                if (pVar.f238b) {
                    pVar.H = true;
                } else {
                    fragment.mDeferStart = false;
                    f.i();
                }
            }
        }
        this.mUserVisibleHint = z;
        if (this.mState >= 5 || z) {
            z2 = false;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        r11 r11Var = this.mHost;
        if (r11Var != null) {
            return a6.b(((k) r11Var).e, str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.mHost != null) {
            if (p.I(2)) {
                toString();
                Objects.toString(intentSender);
                Objects.toString(intent);
                Objects.toString(bundle);
            }
            p parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.A != null) {
                if (bundle != null) {
                    if (intent == null) {
                        intent2 = new Intent();
                        intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                    } else {
                        intent2 = intent;
                    }
                    if (p.I(2)) {
                        bundle.toString();
                        intent2.toString();
                        Objects.toString(this);
                    }
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                } else {
                    intent2 = intent;
                }
                IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intentSender, intent2, i2, i3);
                parentFragmentManager.C.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i));
                if (p.I(2)) {
                    toString();
                }
                parentFragmentManager.A.a(intentSenderRequest);
                return;
            }
            r11 r11Var = parentFragmentManager.t;
            if (i == -1) {
                Activity activity = r11Var.f4087a;
                int i5 = a6.f29a;
                s5.c(activity, intentSender, i, intent, i2, i3, i4, bundle);
                return;
            }
            r11Var.getClass();
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException(hx2.o("Fragment ", this, " not attached to Activity"));
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && b().s) {
            if (this.mHost == null) {
                b().s = false;
            } else if (Looper.myLooper() != this.mHost.c.getLooper()) {
                this.mHost.c.postAtFrontOfQueue(new g11(this, 1));
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) v11.b(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (IllegalAccessException e) {
            throw new j11(hx2.q("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new j11(hx2.q("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new j11(hx2.q("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new j11(hx2.q("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        b().s = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        p pVar = this.mFragmentManager;
        if (pVar != null) {
            this.mPostponedHandler = pVar.t.c;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final <I, O> a7 registerForActivityResult(x6 x6Var, androidx.activity.result.a aVar, w6 w6Var) {
        return l(x6Var, new s11(this, aVar), w6Var);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        r11 r11Var = this.mHost;
        if (r11Var != null) {
            x80.startActivity(r11Var.f4088b, intent, bundle);
            return;
        }
        throw new IllegalStateException(hx2.o("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.mHost != null) {
            p parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.z != null) {
                parentFragmentManager.C.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i));
                if (bundle != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                parentFragmentManager.z.a(intent);
                return;
            }
            r11 r11Var = parentFragmentManager.t;
            if (i == -1) {
                x80.startActivity(r11Var.f4088b, intent, bundle);
                return;
            } else {
                r11Var.getClass();
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
        }
        throw new IllegalStateException(hx2.o("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        r11 r11Var = this.mHost;
        if (r11Var != null) {
            l lVar = ((k) r11Var).e;
            LayoutInflater cloneInContext = lVar.getLayoutInflater().cloneInContext(lVar);
            cloneInContext.setFactory2(this.mChildFragmentManager.f);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
