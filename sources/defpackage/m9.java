package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class m9 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3254a;

    /* renamed from: b, reason: collision with root package name */
    public final ld f3255b;
    public final Window c;
    public CharSequence d;
    public AlertController$RecycleListView e;
    public Button f;
    public Button g;
    public Button h;
    public NestedScrollView i;
    public Drawable k;
    public ImageView l;
    public TextView m;
    public TextView n;
    public View o;
    public ListAdapter p;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final boolean v;
    public final k9 w;
    public int j = 0;
    public int q = -1;
    public final f9 x = new f9(this, 0);

    public m9(Context context, ld ldVar, Window window) {
        this.f3254a = context;
        this.f3255b = ldVar;
        this.c = window;
        this.w = new k9(ldVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, cg2.AlertDialog, ie2.alertDialogStyle, 0);
        this.r = obtainStyledAttributes.getResourceId(cg2.AlertDialog_android_layout, 0);
        obtainStyledAttributes.getResourceId(cg2.AlertDialog_buttonPanelSideLayout, 0);
        this.s = obtainStyledAttributes.getResourceId(cg2.AlertDialog_listLayout, 0);
        obtainStyledAttributes.getResourceId(cg2.AlertDialog_multiChoiceItemLayout, 0);
        this.t = obtainStyledAttributes.getResourceId(cg2.AlertDialog_singleChoiceItemLayout, 0);
        this.u = obtainStyledAttributes.getResourceId(cg2.AlertDialog_listItemLayout, 0);
        this.v = obtainStyledAttributes.getBoolean(cg2.AlertDialog_showTitle, true);
        obtainStyledAttributes.getDimensionPixelSize(cg2.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        ldVar.e(1);
    }

    public static void a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static void b(View view, View view2, View view3) {
        int i;
        int i2 = 0;
        if (view2 != null) {
            if (view.canScrollVertically(-1)) {
                i = 0;
            } else {
                i = 4;
            }
            view2.setVisibility(i);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i2 = 4;
            }
            view3.setVisibility(i2);
        }
    }

    public static ViewGroup c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
