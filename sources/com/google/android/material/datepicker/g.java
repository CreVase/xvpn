package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.al3;
import defpackage.ar3;
import defpackage.bg2;
import defpackage.cp3;
import defpackage.cr1;
import defpackage.ew3;
import defpackage.fr1;
import defpackage.g52;
import defpackage.gr1;
import defpackage.h20;
import defpackage.he2;
import defpackage.jf2;
import defpackage.ll3;
import defpackage.mf2;
import defpackage.mi3;
import defpackage.nd1;
import defpackage.p71;
import defpackage.pc1;
import defpackage.qf2;
import defpackage.re2;
import defpackage.s71;
import defpackage.tp3;
import defpackage.ue2;
import defpackage.up3;
import defpackage.v51;
import defpackage.xe2;
import defpackage.xk3;
import defpackage.xq3;
import defpackage.yq3;
import defpackage.zf3;
import defpackage.zq3;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class g<S> extends androidx.fragment.app.f {
    public static final /* synthetic */ int u = 0;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1547a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f1548b;
    public int c;
    public g52 d;
    public CalendarConstraints e;
    public f f;
    public int g;
    public CharSequence h;
    public boolean i;
    public int j;
    public int k;
    public CharSequence l;
    public int m;
    public CharSequence n;
    public TextView o;
    public CheckableImageButton p;
    public fr1 q;
    public boolean r;
    public CharSequence s;
    public CharSequence t;

    public g() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f1547a = new LinkedHashSet();
        this.f1548b = new LinkedHashSet();
    }

    public static boolean D(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(cp3.L(context, he2.materialCalendarStyle, f.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public static int t(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(re2.mtrl_calendar_content_padding);
        Month month = new Month(mi3.c());
        int dimensionPixelSize = resources.getDimensionPixelSize(re2.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(re2.mtrl_calendar_month_horizontal_padding);
        int i = month.d;
        return ((i - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i) + (dimensionPixelOffset * 2);
    }

    public static boolean z(Context context) {
        return D(context, R.attr.windowFullscreen);
    }

    @Override // androidx.fragment.app.f, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f1547a.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.c = bundle.getInt("OVERRIDE_THEME_RES_ID");
        p71.u(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.e = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        p71.u(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.g = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.h = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.j = bundle.getInt("INPUT_MODE_KEY");
        this.k = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.l = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.m = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.n = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence = this.h;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.g);
        }
        this.s = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.t = charSequence;
    }

    @Override // androidx.fragment.app.f
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        requireContext();
        int i = this.c;
        if (i != 0) {
            Dialog dialog = new Dialog(requireContext, i);
            Context context = dialog.getContext();
            this.i = z(context);
            int i2 = he2.materialCalendarStyle;
            int i3 = qf2.Widget_MaterialComponents_MaterialCalendar;
            this.q = new fr1(context, null, i2, i3);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, bg2.MaterialCalendar, i2, i3);
            int color = obtainStyledAttributes.getColor(bg2.MaterialCalendar_backgroundTint, 0);
            obtainStyledAttributes.recycle();
            this.q.h(context);
            this.q.j(ColorStateList.valueOf(color));
            fr1 fr1Var = this.q;
            View decorView = dialog.getWindow().getDecorView();
            WeakHashMap weakHashMap = ll3.f3151a;
            fr1Var.i(al3.i(decorView));
            return dialog;
        }
        s();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        boolean z;
        String string;
        if (this.i) {
            i = jf2.mtrl_picker_fullscreen;
        } else {
            i = jf2.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        if (this.i) {
            inflate.findViewById(xe2.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(t(context), -2));
        } else {
            inflate.findViewById(xe2.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(t(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(xe2.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = ll3.f3151a;
        xk3.f(textView, 1);
        this.p = (CheckableImageButton) inflate.findViewById(xe2.mtrl_picker_header_toggle);
        this.o = (TextView) inflate.findViewById(xe2.mtrl_picker_title_text);
        this.p.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.p;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, ew3.P0(context, ue2.material_ic_calendar_black_24dp));
        int i2 = 0;
        stateListDrawable.addState(new int[0], ew3.P0(context, ue2.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.p;
        if (this.j != 0) {
            z = true;
        } else {
            z = false;
        }
        checkableImageButton2.setChecked(z);
        ll3.p(this.p, null);
        CheckableImageButton checkableImageButton3 = this.p;
        if (this.j == 1) {
            string = checkableImageButton3.getContext().getString(mf2.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton3.getContext().getString(mf2.mtrl_picker_toggle_to_text_input_mode);
        }
        this.p.setContentDescription(string);
        this.p.setOnClickListener(new cr1(this, i2));
        s();
        throw null;
    }

    @Override // androidx.fragment.app.f, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f1548b.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        Month month;
        Month b2;
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.c);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = new b(this.e);
        f fVar = this.f;
        if (fVar == null) {
            month = null;
        } else {
            month = fVar.d;
        }
        if (month != null) {
            bVar.c = Long.valueOf(month.f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.e);
        Month b3 = Month.b(bVar.f1539a);
        Month b4 = Month.b(bVar.f1540b);
        CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = bVar.c;
        if (l == null) {
            b2 = null;
        } else {
            b2 = Month.b(l.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(b3, b4, dateValidator, b2, bVar.d));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.g);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.h);
        bundle.putInt("INPUT_MODE_KEY", this.j);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.k);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.l);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.m);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.n);
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onStart() {
        CharSequence charSequence;
        Integer num;
        boolean z;
        int i;
        int i2;
        boolean z2;
        s71 xq3Var;
        boolean z3;
        s71 xq3Var2;
        super.onStart();
        Window window = requireDialog().getWindow();
        boolean z4 = true;
        if (this.i) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.q);
            if (!this.r) {
                View findViewById = requireView().findViewById(xe2.fullscreen_header);
                if (findViewById.getBackground() instanceof ColorDrawable) {
                    num = Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor());
                } else {
                    num = null;
                }
                int i3 = Build.VERSION.SDK_INT;
                if (num != null && num.intValue() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                int w = zf3.w(window.getContext(), R.attr.colorBackground, -16777216);
                if (z) {
                    num = Integer.valueOf(w);
                }
                Integer valueOf = Integer.valueOf(w);
                if (i3 >= 30) {
                    up3.a(window, false);
                } else {
                    tp3.a(window, false);
                }
                Context context = window.getContext();
                if (i3 < 23) {
                    i = h20.d(zf3.w(context, R.attr.statusBarColor, -16777216), 128);
                } else {
                    i = 0;
                }
                Context context2 = window.getContext();
                if (i3 < 27) {
                    i2 = h20.d(zf3.w(context2, R.attr.navigationBarColor, -16777216), 128);
                } else {
                    i2 = 0;
                }
                window.setStatusBarColor(i);
                window.setNavigationBarColor(i2);
                boolean P = zf3.P(num.intValue());
                if (!zf3.P(i) && (i != 0 || !P)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                v51 v51Var = new v51(window.getDecorView());
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 30) {
                    xq3Var = new ar3(window, v51Var);
                } else if (i4 >= 26) {
                    xq3Var = new zq3(window, v51Var);
                } else if (i4 >= 23) {
                    xq3Var = new yq3(window, v51Var);
                } else {
                    xq3Var = new xq3(window, v51Var);
                }
                xq3Var.n(z2);
                boolean P2 = zf3.P(valueOf.intValue());
                if (!zf3.P(i2) && (i2 != 0 || !P2)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                v51 v51Var2 = new v51(window.getDecorView());
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 30) {
                    xq3Var2 = new ar3(window, v51Var2);
                } else if (i5 >= 26) {
                    xq3Var2 = new zq3(window, v51Var2);
                } else if (i5 >= 23) {
                    xq3Var2 = new yq3(window, v51Var2);
                } else {
                    xq3Var2 = new xq3(window, v51Var2);
                }
                xq3Var2.m(z3);
                nd1 nd1Var = new nd1(this, findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = ll3.f3151a;
                al3.u(findViewById, nd1Var);
                this.r = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(re2.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.q, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new pc1(requireDialog(), rect));
        }
        requireContext();
        int i6 = this.c;
        if (i6 != 0) {
            s();
            CalendarConstraints calendarConstraints = this.e;
            f fVar = new f();
            Bundle bundle = new Bundle();
            bundle.putInt("THEME_RES_ID_KEY", i6);
            bundle.putParcelable("GRID_SELECTOR_KEY", null);
            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
            bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
            bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.d);
            fVar.setArguments(bundle);
            this.f = fVar;
            g52 g52Var = fVar;
            if (this.j == 1) {
                s();
                CalendarConstraints calendarConstraints2 = this.e;
                g52 gr1Var = new gr1();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i6);
                bundle2.putParcelable("DATE_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
                gr1Var.setArguments(bundle2);
                g52Var = gr1Var;
            }
            this.d = g52Var;
            TextView textView = this.o;
            if (this.j == 1) {
                if (getResources().getConfiguration().orientation != 2) {
                    z4 = false;
                }
                if (z4) {
                    charSequence = this.t;
                    textView.setText(charSequence);
                    s();
                    getContext();
                    throw null;
                }
            }
            charSequence = this.s;
            textView.setText(charSequence);
            s();
            getContext();
            throw null;
        }
        s();
        throw null;
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onStop() {
        this.d.f2208a.clear();
        super.onStop();
    }

    public final void s() {
        p71.u(getArguments().getParcelable("DATE_SELECTOR_KEY"));
    }
}
