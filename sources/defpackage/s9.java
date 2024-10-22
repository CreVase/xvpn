package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class s9 extends ld implements DialogInterface {
    public final m9 f;

    public s9(Context context, int i) {
        super(context, f(context, i));
        this.f = new m9(getContext(), this, getWindow());
    }

    public static int f(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(ie2.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.ld, defpackage.t30, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        ListAdapter listAdapter;
        View view;
        int i3;
        int i4;
        View view2;
        View findViewById;
        super.onCreate(bundle);
        m9 m9Var = this.f;
        m9Var.f3255b.setContentView(m9Var.r);
        int i5 = ye2.parentPanel;
        Window window = m9Var.c;
        View findViewById2 = window.findViewById(i5);
        int i6 = ye2.topPanel;
        View findViewById3 = findViewById2.findViewById(i6);
        int i7 = ye2.contentPanel;
        View findViewById4 = findViewById2.findViewById(i7);
        int i8 = ye2.buttonPanel;
        View findViewById5 = findViewById2.findViewById(i8);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(ye2.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById6 = viewGroup.findViewById(i6);
        View findViewById7 = viewGroup.findViewById(i7);
        View findViewById8 = viewGroup.findViewById(i8);
        ViewGroup c = m9.c(findViewById6, findViewById3);
        ViewGroup c2 = m9.c(findViewById7, findViewById4);
        ViewGroup c3 = m9.c(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(ye2.scrollView);
        m9Var.i = nestedScrollView;
        int i9 = 0;
        nestedScrollView.setFocusable(false);
        m9Var.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) c2.findViewById(R.id.message);
        m9Var.n = textView;
        if (textView != null) {
            textView.setVisibility(8);
            m9Var.i.removeView(m9Var.n);
            if (m9Var.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) m9Var.i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(m9Var.i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(m9Var.e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                c2.setVisibility(8);
            }
        }
        Button button = (Button) c3.findViewById(R.id.button1);
        m9Var.f = button;
        f9 f9Var = m9Var.x;
        button.setOnClickListener(f9Var);
        if (TextUtils.isEmpty(null)) {
            m9Var.f.setVisibility(8);
            i = 0;
        } else {
            m9Var.f.setText((CharSequence) null);
            m9Var.f.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) c3.findViewById(R.id.button2);
        m9Var.g = button2;
        button2.setOnClickListener(f9Var);
        if (TextUtils.isEmpty(null)) {
            m9Var.g.setVisibility(8);
        } else {
            m9Var.g.setText((CharSequence) null);
            m9Var.g.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) c3.findViewById(R.id.button3);
        m9Var.h = button3;
        button3.setOnClickListener(f9Var);
        if (TextUtils.isEmpty(null)) {
            m9Var.h.setVisibility(8);
        } else {
            m9Var.h.setText((CharSequence) null);
            m9Var.h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        m9Var.f3254a.getTheme().resolveAttribute(ie2.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == 1) {
                m9.a(m9Var.f);
            } else if (i == 2) {
                m9.a(m9Var.g);
            } else if (i == 4) {
                m9.a(m9Var.h);
            }
        }
        if (i != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            c3.setVisibility(8);
        }
        if (m9Var.o != null) {
            c.addView(m9Var.o, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(ye2.title_template).setVisibility(8);
        } else {
            m9Var.l = (ImageView) window.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(m9Var.d)) && m9Var.v) {
                TextView textView2 = (TextView) window.findViewById(ye2.alertTitle);
                m9Var.m = textView2;
                textView2.setText(m9Var.d);
                int i10 = m9Var.j;
                if (i10 != 0) {
                    m9Var.l.setImageResource(i10);
                } else {
                    Drawable drawable = m9Var.k;
                    if (drawable != null) {
                        m9Var.l.setImageDrawable(drawable);
                    } else {
                        m9Var.m.setPadding(m9Var.l.getPaddingLeft(), m9Var.l.getPaddingTop(), m9Var.l.getPaddingRight(), m9Var.l.getPaddingBottom());
                        m9Var.l.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(ye2.title_template).setVisibility(8);
                m9Var.l.setVisibility(8);
                c.setVisibility(8);
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c != null && c.getVisibility() != 8) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (c3.getVisibility() != 8) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 && (findViewById = c2.findViewById(ye2.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = m9Var.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (m9Var.e != null) {
                view2 = c.findViewById(ye2.titleDividerNoCustom);
            } else {
                view2 = null;
            }
            if (view2 != null) {
                view2.setVisibility(0);
            }
        } else {
            View findViewById9 = c2.findViewById(ye2.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = m9Var.e;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z4 || i2 == 0) {
                int paddingLeft = alertController$RecycleListView.getPaddingLeft();
                if (i2 != 0) {
                    i3 = alertController$RecycleListView.getPaddingTop();
                } else {
                    i3 = alertController$RecycleListView.f140a;
                }
                int paddingRight = alertController$RecycleListView.getPaddingRight();
                if (z4) {
                    i4 = alertController$RecycleListView.getPaddingBottom();
                } else {
                    i4 = alertController$RecycleListView.f141b;
                }
                alertController$RecycleListView.setPadding(paddingLeft, i3, paddingRight, i4);
            }
        }
        if (!z3) {
            View view3 = m9Var.e;
            if (view3 == null) {
                view3 = m9Var.i;
            }
            if (view3 != null) {
                if (z4) {
                    i9 = 2;
                }
                int i11 = i9 | i2;
                View findViewById10 = window.findViewById(ye2.scrollIndicatorUp);
                View findViewById11 = window.findViewById(ye2.scrollIndicatorDown);
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 23) {
                    WeakHashMap weakHashMap = ll3.f3151a;
                    if (i12 >= 23) {
                        bl3.d(view3, i11, 3);
                    }
                    if (findViewById10 != null) {
                        c2.removeView(findViewById10);
                    }
                    if (findViewById11 != null) {
                        c2.removeView(findViewById11);
                    }
                } else {
                    if (findViewById10 != null && (i11 & 1) == 0) {
                        c2.removeView(findViewById10);
                        findViewById10 = null;
                    }
                    if (findViewById11 != null && (i11 & 2) == 0) {
                        c2.removeView(findViewById11);
                        view = null;
                    } else {
                        view = findViewById11;
                    }
                    if (findViewById10 != null || view != null) {
                        AlertController$RecycleListView alertController$RecycleListView2 = m9Var.e;
                        if (alertController$RecycleListView2 != null) {
                            alertController$RecycleListView2.setOnScrollListener(new h9(findViewById10, view));
                            m9Var.e.post(new g9(m9Var, findViewById10, view, 1));
                        } else {
                            if (findViewById10 != null) {
                                c2.removeView(findViewById10);
                            }
                            if (view != null) {
                                c2.removeView(view);
                            }
                        }
                    }
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView3 = m9Var.e;
        if (alertController$RecycleListView3 != null && (listAdapter = m9Var.p) != null) {
            alertController$RecycleListView3.setAdapter(listAdapter);
            int i13 = m9Var.q;
            if (i13 > -1) {
                alertController$RecycleListView3.setItemChecked(i13, true);
                alertController$RecycleListView3.setSelection(i13);
            }
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        NestedScrollView nestedScrollView = this.f.i;
        if (nestedScrollView != null && nestedScrollView.s(keyEvent)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        boolean z;
        NestedScrollView nestedScrollView = this.f.i;
        if (nestedScrollView != null && nestedScrollView.s(keyEvent)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.ld, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m9 m9Var = this.f;
        m9Var.d = charSequence;
        TextView textView = m9Var.m;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
