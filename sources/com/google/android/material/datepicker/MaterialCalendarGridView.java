package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import defpackage.he2;
import defpackage.ll3;
import defpackage.mi3;
import defpackage.wq1;
import defpackage.xe2;

/* loaded from: classes2.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1536a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        mi3.d(null);
        if (g.z(getContext())) {
            setNextFocusLeftId(xe2.cancel_button);
            setNextFocusRightId(xe2.confirm_button);
        }
        this.f1536a = g.D(getContext(), he2.nestedScrollable);
        ll3.p(this, new wq1(this, 3));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final i getAdapter2() {
        return (i) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        i adapter = getAdapter();
        adapter.getClass();
        int max = Math.max(adapter.a(), getFirstVisiblePosition());
        int min = Math.min((adapter.a() + adapter.f1550a.e) - 1, getLastVisiblePosition());
        adapter.getItem(max);
        adapter.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            if (i == 33) {
                i adapter = getAdapter();
                setSelection((adapter.a() + adapter.f1550a.e) - 1);
                return;
            } else if (i == 130) {
                setSelection(getAdapter().a());
                return;
            } else {
                super.onFocusChanged(true, i, rect);
                return;
            }
        }
        super.onFocusChanged(false, i, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f1536a) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < getAdapter().a()) {
            super.setSelection(getAdapter().a());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof i) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), i.class.getCanonicalName()));
    }
}
