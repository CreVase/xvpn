package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import com.security.xvpn.z35kb.purchase.GuideToPurchaseNew2Activity;

/* loaded from: classes.dex */
public final class ao2 implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f306b;

    public /* synthetic */ ao2(Object obj, int i) {
        this.f305a = i;
        this.f306b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10 = this.f305a;
        int i11 = 0;
        Object obj = this.f306b;
        switch (i10) {
            case 0:
                SearchView searchView = (SearchView) obj;
                View view2 = searchView.x;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.r.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a2 = bn3.a(searchView);
                    if (searchView.M) {
                        i11 = resources.getDimensionPixelSize(se2.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(se2.abc_dropdownitem_text_padding_left);
                    }
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.p;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    if (a2) {
                        i9 = -rect.left;
                    } else {
                        i9 = paddingLeft - (rect.left + i11);
                    }
                    searchAutoComplete.setDropDownHorizontalOffset(i9);
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i11) - paddingLeft);
                    return;
                }
                return;
            case 1:
                ((BottomAppBar$Behavior) obj).getClass();
                throw null;
            default:
                view.removeOnLayoutChangeListener(this);
                GuideToPurchaseNew2Activity guideToPurchaseNew2Activity = (GuideToPurchaseNew2Activity) obj;
                int measuredHeight = guideToPurchaseNew2Activity.Z().h.getMeasuredHeight() - tf3.K(40);
                LinearLayout linearLayout = guideToPurchaseNew2Activity.Z().h;
                int childCount = linearLayout.getChildCount();
                while (i11 < childCount) {
                    View childAt = linearLayout.getChildAt(i11);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams != null) {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        layoutParams2.height = measuredHeight;
                        childAt.setLayoutParams(layoutParams2);
                        i11++;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                }
                return;
        }
    }
}
