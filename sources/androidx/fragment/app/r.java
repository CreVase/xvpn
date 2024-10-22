package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.df2;
import defpackage.hx2;
import defpackage.i21;
import defpackage.j21;
import defpackage.k21;
import defpackage.l21;
import defpackage.ll3;
import defpackage.m20;
import defpackage.mr2;
import defpackage.s11;
import defpackage.sx2;
import defpackage.uj1;
import defpackage.ux2;
import defpackage.v11;
import defpackage.vx2;
import defpackage.xk3;
import defpackage.yk3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final s11 f239a;

    /* renamed from: b, reason: collision with root package name */
    public final s f240b;
    public final Fragment c;
    public boolean d = false;
    public int e = -1;

    public r(s11 s11Var, s sVar, Fragment fragment) {
        this.f239a = s11Var;
        this.f240b = sVar;
        this.c = fragment;
    }

    public final void a() {
        Fragment fragment;
        int i;
        View view;
        View view2;
        Fragment fragment2;
        Fragment fragment3 = this.c;
        View view3 = fragment3.mContainer;
        while (true) {
            fragment = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(df2.fragment_container_view_tag);
            if (tag instanceof Fragment) {
                fragment2 = (Fragment) tag;
            } else {
                fragment2 = null;
            }
            if (fragment2 != null) {
                fragment = fragment2;
                break;
            }
            Object parent = view3.getParent();
            if (parent instanceof View) {
                view3 = (View) parent;
            } else {
                view3 = null;
            }
        }
        Fragment parentFragment = fragment3.getParentFragment();
        if (fragment != null && !fragment.equals(parentFragment)) {
            int i2 = fragment3.mContainerId;
            j21 j21Var = k21.f2874a;
            k21.b(new mr2(fragment3, fragment, i2));
            k21.a(fragment3).getClass();
            Object obj = i21.DETECT_WRONG_NESTED_HIERARCHY;
            if (obj instanceof Void) {
            }
        }
        s sVar = this.f240b;
        sVar.getClass();
        ViewGroup viewGroup = fragment3.mContainer;
        if (viewGroup != null) {
            ArrayList arrayList = sVar.f241a;
            int indexOf = arrayList.indexOf(fragment3);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment4 = (Fragment) arrayList.get(indexOf);
                        if (fragment4.mContainer == viewGroup && (view = fragment4.mView) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment5 = (Fragment) arrayList.get(i3);
                    if (fragment5.mContainer == viewGroup && (view2 = fragment5.mView) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
            fragment3.mContainer.addView(fragment3.mView, i);
        }
        i = -1;
        fragment3.mContainer.addView(fragment3.mView, i);
    }

    public final void b() {
        boolean I = p.I(3);
        Fragment fragment = this.c;
        if (I) {
            Objects.toString(fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        r rVar = null;
        s sVar = this.f240b;
        if (fragment2 != null) {
            r rVar2 = (r) sVar.f242b.get(fragment2.mWho);
            if (rVar2 != null) {
                fragment.mTargetWho = fragment.mTarget.mWho;
                fragment.mTarget = null;
                rVar = rVar2;
            } else {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (rVar = (r) sVar.f242b.get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(hx2.s(sb, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (rVar != null) {
            rVar.i();
        }
        p pVar = fragment.mFragmentManager;
        fragment.mHost = pVar.t;
        fragment.mParentFragment = pVar.v;
        s11 s11Var = this.f239a;
        s11Var.g(false);
        fragment.performAttach();
        s11Var.b(false);
    }

    public final int c() {
        sx2 sx2Var;
        Object obj;
        int i;
        boolean z;
        Fragment fragment = this.c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i2 = this.e;
        int ordinal = fragment.mMaxState.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        i2 = Math.min(i2, -1);
                    }
                } else {
                    i2 = Math.min(i2, 5);
                }
            } else {
                i2 = Math.min(i2, 1);
            }
        } else {
            i2 = Math.min(i2, 0);
        }
        if (fragment.mFromLayout) {
            if (fragment.mInLayout) {
                i2 = Math.max(this.e, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    i2 = Math.min(i2, 2);
                }
            } else {
                i2 = this.e < 4 ? Math.min(i2, fragment.mState) : Math.min(i2, 1);
            }
        }
        if (!fragment.mAdded) {
            i2 = Math.min(i2, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        sx2 sx2Var2 = null;
        if (viewGroup != null) {
            e i3 = e.i(viewGroup, fragment.getParentFragmentManager());
            i3.getClass();
            ux2 g = i3.g(fragment);
            if (g != null) {
                sx2Var = g.f4754b;
            } else {
                sx2Var = null;
            }
            Iterator it = i3.c.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    ux2 ux2Var = (ux2) obj;
                    if (m20.L(ux2Var.c, fragment) && !ux2Var.f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ux2 ux2Var2 = (ux2) obj;
            if (ux2Var2 != null) {
                sx2Var2 = ux2Var2.f4754b;
            }
            if (sx2Var == null) {
                i = -1;
            } else {
                i = vx2.f4911a[sx2Var.ordinal()];
            }
            if (i != -1 && i != 1) {
                sx2Var2 = sx2Var;
            }
        }
        if (sx2Var2 == sx2.ADDING) {
            i2 = Math.min(i2, 6);
        } else if (sx2Var2 == sx2.REMOVING) {
            i2 = Math.max(i2, 3);
        } else if (fragment.mRemoving) {
            if (fragment.isInBackStack()) {
                i2 = Math.min(i2, 1);
            } else {
                i2 = Math.min(i2, -1);
            }
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            i2 = Math.min(i2, 4);
        }
        if (p.I(2)) {
            Objects.toString(fragment);
        }
        return i2;
    }

    public final void d() {
        Bundle bundle;
        String str;
        Fragment fragment = this.c;
        if (fragment.mFromLayout) {
            return;
        }
        if (p.I(3)) {
            Objects.toString(fragment);
        }
        Bundle bundle2 = fragment.mSavedFragmentState;
        ViewGroup viewGroup = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(bundle);
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment.mContainerId;
            if (i != 0) {
                if (i != -1) {
                    viewGroup = (ViewGroup) fragment.mFragmentManager.u.b(i);
                    if (viewGroup == null) {
                        if (!fragment.mRestored) {
                            try {
                                str = fragment.getResources().getResourceName(fragment.mContainerId);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + str + ") for fragment " + fragment);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        j21 j21Var = k21.f2874a;
                        k21.b(new l21(fragment, viewGroup, 1));
                        k21.a(fragment).getClass();
                        Object obj = i21.DETECT_WRONG_FRAGMENT_CONTAINER;
                        if (obj instanceof Void) {
                        }
                    }
                } else {
                    throw new IllegalArgumentException(hx2.o("Cannot create fragment ", fragment, " for a container view with no id"));
                }
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(performGetLayoutInflater, viewGroup, bundle);
        if (fragment.mView != null) {
            if (p.I(3)) {
                Objects.toString(fragment);
            }
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(df2.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                a();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            View view = fragment.mView;
            WeakHashMap weakHashMap = ll3.f3151a;
            if (xk3.b(view)) {
                yk3.c(fragment.mView);
            } else {
                View view2 = fragment.mView;
                view2.addOnAttachStateChangeListener(new m(this, view2));
            }
            fragment.performViewCreated();
            this.f239a.m(false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (p.I(2)) {
                        findFocus.toString();
                        Objects.toString(fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r10 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.p.I(r0)
            androidx.fragment.app.Fragment r2 = r10.c
            if (r1 == 0) goto Lc
            java.util.Objects.toString(r2)
        Lc:
            boolean r1 = r2.mRemoving
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r2.isInBackStack()
            if (r1 != 0) goto L1a
            r1 = 1
            goto L1b
        L1a:
            r1 = 0
        L1b:
            r5 = 0
            androidx.fragment.app.s r6 = r10.f240b
            if (r1 == 0) goto L29
            boolean r7 = r2.mBeingSaved
            if (r7 != 0) goto L29
            java.lang.String r7 = r2.mWho
            r6.i(r5, r7)
        L29:
            if (r1 != 0) goto L44
            androidx.fragment.app.q r7 = r6.d
            java.util.HashMap r8 = r7.d
            java.lang.String r9 = r2.mWho
            boolean r8 = r8.containsKey(r9)
            if (r8 != 0) goto L39
        L37:
            r7 = 1
            goto L3f
        L39:
            boolean r8 = r7.g
            if (r8 == 0) goto L37
            boolean r7 = r7.h
        L3f:
            if (r7 == 0) goto L42
            goto L44
        L42:
            r7 = 0
            goto L45
        L44:
            r7 = 1
        L45:
            if (r7 == 0) goto Lb7
            r11 r7 = r2.mHost
            boolean r8 = r7 instanceof defpackage.lm3
            if (r8 == 0) goto L52
            androidx.fragment.app.q r4 = r6.d
            boolean r4 = r4.h
            goto L5f
        L52:
            android.content.Context r7 = r7.f4088b
            boolean r8 = r7 instanceof android.app.Activity
            if (r8 == 0) goto L5f
            android.app.Activity r7 = (android.app.Activity) r7
            boolean r7 = r7.isChangingConfigurations()
            r4 = r4 ^ r7
        L5f:
            if (r1 == 0) goto L65
            boolean r1 = r2.mBeingSaved
            if (r1 == 0) goto L67
        L65:
            if (r4 == 0) goto L7a
        L67:
            androidx.fragment.app.q r1 = r6.d
            r1.getClass()
            boolean r0 = androidx.fragment.app.p.I(r0)
            if (r0 == 0) goto L75
            java.util.Objects.toString(r2)
        L75:
            java.lang.String r0 = r2.mWho
            r1.l(r0, r3)
        L7a:
            r2.performDestroy()
            s11 r0 = r10.f239a
            r0.d(r3)
            java.util.ArrayList r0 = r6.d()
            java.util.Iterator r0 = r0.iterator()
        L8a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La9
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.r r1 = (androidx.fragment.app.r) r1
            if (r1 == 0) goto L8a
            java.lang.String r3 = r2.mWho
            androidx.fragment.app.Fragment r1 = r1.c
            java.lang.String r4 = r1.mTargetWho
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L8a
            r1.mTarget = r2
            r1.mTargetWho = r5
            goto L8a
        La9:
            java.lang.String r0 = r2.mTargetWho
            if (r0 == 0) goto Lb3
            androidx.fragment.app.Fragment r0 = r6.b(r0)
            r2.mTarget = r0
        Lb3:
            r6.h(r10)
            goto Lc9
        Lb7:
            java.lang.String r0 = r2.mTargetWho
            if (r0 == 0) goto Lc7
            androidx.fragment.app.Fragment r0 = r6.b(r0)
            if (r0 == 0) goto Lc7
            boolean r1 = r0.mRetainInstance
            if (r1 == 0) goto Lc7
            r2.mTarget = r0
        Lc7:
            r2.mState = r3
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.r.e():void");
    }

    public final void f() {
        View view;
        boolean I = p.I(3);
        Fragment fragment = this.c;
        if (I) {
            Objects.toString(fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.f239a.n(false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.i(null);
        fragment.mInLayout = false;
    }

    public final void g() {
        boolean I = p.I(3);
        Fragment fragment = this.c;
        if (I) {
            Objects.toString(fragment);
        }
        fragment.performDetach();
        boolean z = false;
        this.f239a.e(false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        boolean z2 = true;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (!z) {
            q qVar = this.f240b.d;
            if (qVar.d.containsKey(fragment.mWho) && qVar.g) {
                z2 = qVar.h;
            }
            if (!z2) {
                return;
            }
        }
        if (p.I(3)) {
            Objects.toString(fragment);
        }
        fragment.initState();
    }

    public final void h() {
        Bundle bundle;
        Fragment fragment = this.c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (p.I(3)) {
                Objects.toString(fragment);
            }
            Bundle bundle2 = fragment.mSavedFragmentState;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle), null, bundle);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(df2.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.f239a.m(false);
                fragment.mState = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0189, code lost:            continue;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.r.i():void");
    }

    public final void j(ClassLoader classLoader) {
        Fragment fragment = this.c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
        fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
        FragmentState fragmentState = (FragmentState) fragment.mSavedFragmentState.getParcelable("state");
        if (fragmentState != null) {
            fragment.mTargetWho = fragmentState.l;
            fragment.mTargetRequestCode = fragmentState.m;
            Boolean bool = fragment.mSavedUserVisibleHint;
            if (bool != null) {
                fragment.mUserVisibleHint = bool.booleanValue();
                fragment.mSavedUserVisibleHint = null;
            } else {
                fragment.mUserVisibleHint = fragmentState.n;
            }
        }
        if (!fragment.mUserVisibleHint) {
            fragment.mDeferStart = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            r5 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.p.I(r0)
            androidx.fragment.app.Fragment r1 = r5.c
            if (r0 == 0) goto Lc
            java.util.Objects.toString(r1)
        Lc:
            android.view.View r0 = r1.getFocusedView()
            r2 = 0
            if (r0 == 0) goto L45
            android.view.View r3 = r1.mView
            if (r0 != r3) goto L18
            goto L22
        L18:
            android.view.ViewParent r3 = r0.getParent()
        L1c:
            if (r3 == 0) goto L29
            android.view.View r4 = r1.mView
            if (r3 != r4) goto L24
        L22:
            r3 = 1
            goto L2a
        L24:
            android.view.ViewParent r3 = r3.getParent()
            goto L1c
        L29:
            r3 = 0
        L2a:
            if (r3 == 0) goto L45
            r0.requestFocus()
            r3 = 2
            boolean r3 = androidx.fragment.app.p.I(r3)
            if (r3 == 0) goto L45
            r0.toString()
            java.util.Objects.toString(r1)
            android.view.View r0 = r1.mView
            android.view.View r0 = r0.findFocus()
            java.util.Objects.toString(r0)
        L45:
            r0 = 0
            r1.setFocusedView(r0)
            r1.performResume()
            s11 r3 = r5.f239a
            r3.i(r2)
            androidx.fragment.app.s r2 = r5.f240b
            java.lang.String r3 = r1.mWho
            r2.i(r0, r3)
            r1.mSavedFragmentState = r0
            r1.mSavedViewState = r0
            r1.mSavedViewRegistryState = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.r.k():void");
    }

    public final Bundle l() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(fragment));
        if (fragment.mState > -1) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f239a.j(false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle W = fragment.mChildFragmentManager.W();
            if (!W.isEmpty()) {
                bundle2.putBundle("childFragmentManager", W);
            }
            if (fragment.mView != null) {
                m();
            }
            SparseArray<Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void m() {
        Fragment fragment = this.c;
        if (fragment.mView == null) {
            return;
        }
        if (p.I(2)) {
            Objects.toString(fragment);
            Objects.toString(fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.f.c(bundle);
        if (!bundle.isEmpty()) {
            fragment.mSavedViewRegistryState = bundle;
        }
    }

    public r(s11 s11Var, s sVar, ClassLoader classLoader, v11 v11Var, Bundle bundle) {
        this.f239a = s11Var;
        this.f240b = sVar;
        FragmentState fragmentState = (FragmentState) bundle.getParcelable("state");
        Fragment instantiate = Fragment.instantiate(v11Var.f4772a.t.f4088b, fragmentState.f219a, null);
        instantiate.mWho = fragmentState.f220b;
        instantiate.mFromLayout = fragmentState.c;
        instantiate.mRestored = true;
        instantiate.mFragmentId = fragmentState.d;
        instantiate.mContainerId = fragmentState.e;
        instantiate.mTag = fragmentState.f;
        instantiate.mRetainInstance = fragmentState.g;
        instantiate.mRemoving = fragmentState.h;
        instantiate.mDetached = fragmentState.i;
        instantiate.mHidden = fragmentState.j;
        instantiate.mMaxState = uj1.values()[fragmentState.k];
        instantiate.mTargetWho = fragmentState.l;
        instantiate.mTargetRequestCode = fragmentState.m;
        instantiate.mUserVisibleHint = fragmentState.n;
        this.c = instantiate;
        instantiate.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        instantiate.setArguments(bundle2);
        if (p.I(2)) {
            Objects.toString(instantiate);
        }
    }

    public r(s11 s11Var, s sVar, Fragment fragment, Bundle bundle) {
        this.f239a = s11Var;
        this.f240b = sVar;
        this.c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
