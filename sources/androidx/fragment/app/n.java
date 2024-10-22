package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.hx2;
import defpackage.i21;
import defpackage.j21;
import defpackage.k21;
import defpackage.l21;
import defpackage.r11;
import defpackage.v11;
import defpackage.zf2;

/* loaded from: classes.dex */
public final class n implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final p f234a;

    public n(p pVar) {
        this.f234a = pVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        r f;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        p pVar = this.f234a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, pVar);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zf2.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(zf2.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(zf2.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(zf2.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z = Fragment.class.isAssignableFrom(v11.a(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                Fragment B = resourceId != -1 ? pVar.B(resourceId) : null;
                if (B == null && string != null) {
                    B = pVar.C(string);
                }
                if (B == null && id != -1) {
                    B = pVar.B(id);
                }
                if (B == null) {
                    v11 G = pVar.G();
                    context.getClassLoader();
                    B = Fragment.instantiate(G.f4772a.t.f4088b, attributeValue, null);
                    B.mFromLayout = true;
                    B.mFragmentId = resourceId != 0 ? resourceId : id;
                    B.mContainerId = id;
                    B.mTag = string;
                    B.mInLayout = true;
                    B.mFragmentManager = pVar;
                    r11 r11Var = pVar.t;
                    B.mHost = r11Var;
                    B.onInflate(r11Var.f4088b, attributeSet, B.mSavedFragmentState);
                    f = pVar.a(B);
                    if (p.I(2)) {
                        B.toString();
                        Integer.toHexString(resourceId);
                    }
                } else if (!B.mInLayout) {
                    B.mInLayout = true;
                    B.mFragmentManager = pVar;
                    r11 r11Var2 = pVar.t;
                    B.mHost = r11Var2;
                    B.onInflate(r11Var2.f4088b, attributeSet, B.mSavedFragmentState);
                    f = pVar.f(B);
                    if (p.I(2)) {
                        B.toString();
                        Integer.toHexString(resourceId);
                    }
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                }
                ViewGroup viewGroup = (ViewGroup) view;
                j21 j21Var = k21.f2874a;
                k21.b(new l21(B, viewGroup, 0));
                k21.a(B).getClass();
                Object obj = i21.DETECT_FRAGMENT_TAG_USAGE;
                if (obj instanceof Void) {
                }
                B.mContainer = viewGroup;
                f.i();
                f.h();
                View view2 = B.mView;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (B.mView.getTag() == null) {
                        B.mView.setTag(string);
                    }
                    B.mView.addOnAttachStateChangeListener(new m(this, f));
                    return B.mView;
                }
                throw new IllegalStateException(hx2.q("Fragment ", attributeValue, " did not create a view."));
            }
        }
        return null;
    }
}
