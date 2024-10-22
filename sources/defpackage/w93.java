package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class w93 implements ze0 {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f4966a;

    /* renamed from: b, reason: collision with root package name */
    public int f4967b;
    public View c;
    public Drawable d;
    public Drawable e;
    public Drawable f;
    public boolean g;
    public CharSequence h;
    public CharSequence i;
    public CharSequence j;
    public Window.Callback k;
    public boolean l;
    public b5 m;
    public int n;
    public Drawable o;

    public w93(Toolbar toolbar, boolean z) {
        boolean z2;
        int i;
        Drawable drawable;
        int i2 = nf2.abc_action_bar_up_description;
        this.n = 0;
        this.f4966a = toolbar;
        this.h = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        if (this.h != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.g = z2;
        this.f = toolbar.getNavigationIcon();
        go2 m = go2.m(toolbar.getContext(), null, cg2.ActionBar, ie2.actionBarStyle);
        this.o = m.e(cg2.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence k = m.k(cg2.ActionBar_title);
            if (!TextUtils.isEmpty(k)) {
                this.g = true;
                this.h = k;
                if ((this.f4967b & 8) != 0) {
                    toolbar.setTitle(k);
                    if (this.g) {
                        ll3.q(toolbar.getRootView(), k);
                    }
                }
            }
            CharSequence k2 = m.k(cg2.ActionBar_subtitle);
            if (!TextUtils.isEmpty(k2)) {
                this.i = k2;
                if ((this.f4967b & 8) != 0) {
                    toolbar.setSubtitle(k2);
                }
            }
            Drawable e = m.e(cg2.ActionBar_logo);
            if (e != null) {
                this.e = e;
                c();
            }
            Drawable e2 = m.e(cg2.ActionBar_icon);
            if (e2 != null) {
                this.d = e2;
                c();
            }
            if (this.f == null && (drawable = this.o) != null) {
                this.f = drawable;
                if ((this.f4967b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            b(m.h(cg2.ActionBar_displayOptions, 0));
            int i3 = m.i(cg2.ActionBar_customNavigationLayout, 0);
            if (i3 != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(i3, (ViewGroup) toolbar, false);
                View view = this.c;
                if (view != null && (this.f4967b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.c = inflate;
                if (inflate != null && (this.f4967b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                b(this.f4967b | 16);
            }
            int layoutDimension = ((TypedArray) m.f2294b).getLayoutDimension(cg2.ActionBar_height, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int c = m.c(cg2.ActionBar_contentInsetStart, -1);
            int c2 = m.c(cg2.ActionBar_contentInsetEnd, -1);
            if (c >= 0 || c2 >= 0) {
                int max = Math.max(c, 0);
                int max2 = Math.max(c2, 0);
                if (toolbar.t == null) {
                    toolbar.t = new rl2();
                }
                toolbar.t.a(max, max2);
            }
            int i4 = m.i(cg2.ActionBar_titleTextStyle, 0);
            if (i4 != 0) {
                Context context = toolbar.getContext();
                toolbar.l = i4;
                AppCompatTextView appCompatTextView = toolbar.f171b;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, i4);
                }
            }
            int i5 = m.i(cg2.ActionBar_subtitleTextStyle, 0);
            if (i5 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.m = i5;
                AppCompatTextView appCompatTextView2 = toolbar.c;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, i5);
                }
            }
            int i6 = m.i(cg2.ActionBar_popupTheme, 0);
            if (i6 != 0) {
                toolbar.setPopupTheme(i6);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.o = toolbar.getNavigationIcon();
                i = 15;
            } else {
                i = 11;
            }
            this.f4967b = i;
        }
        m.o();
        if (i2 != this.n) {
            this.n = i2;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i7 = this.n;
                String string = i7 != 0 ? a().getString(i7) : null;
                this.j = string;
                if ((this.f4967b & 4) != 0) {
                    if (TextUtils.isEmpty(string)) {
                        toolbar.setNavigationContentDescription(this.n);
                    } else {
                        toolbar.setNavigationContentDescription(this.j);
                    }
                }
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new m4(this));
    }

    public final Context a() {
        return this.f4966a.getContext();
    }

    public final void b(int i) {
        View view;
        int i2 = this.f4967b ^ i;
        this.f4967b = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            Toolbar toolbar = this.f4966a;
            if (i3 != 0) {
                if ((i & 4) != 0 && (i & 4) != 0) {
                    if (TextUtils.isEmpty(this.j)) {
                        toolbar.setNavigationContentDescription(this.n);
                    } else {
                        toolbar.setNavigationContentDescription(this.j);
                    }
                }
                if ((this.f4967b & 4) != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                c();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.h);
                    toolbar.setSubtitle(this.i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.c) != null) {
                if ((i & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.f4967b;
        if ((i & 2) != 0) {
            if ((i & 1) != 0) {
                drawable = this.e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f4966a.setLogo(drawable);
    }
}
