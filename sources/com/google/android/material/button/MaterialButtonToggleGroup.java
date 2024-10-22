package com.google.android.material.button;

import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.d;
import defpackage.cp3;
import defpackage.fs2;
import defpackage.ja1;
import defpackage.jk;
import defpackage.kq1;
import defpackage.ll3;
import defpackage.qf2;
import defpackage.s;
import defpackage.tq1;
import defpackage.uq1;
import defpackage.vk3;
import defpackage.z72;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final int k = qf2.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1530a;

    /* renamed from: b, reason: collision with root package name */
    public final ja1 f1531b;
    public final LinkedHashSet c;
    public final z72 d;
    public Integer[] e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final int i;
    public HashSet j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButtonToggleGroup(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r3 = defpackage.he2.materialButtonToggleGroupStyle
            int r4 = com.google.android.material.button.MaterialButtonToggleGroup.k
            android.content.Context r8 = defpackage.ir1.a(r8, r9, r3, r4)
            r7.<init>(r8, r9, r3)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r7.f1530a = r8
            ja1 r8 = new ja1
            r8.<init>(r7)
            r7.f1531b = r8
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            r7.c = r8
            z72 r8 = new z72
            r6 = 1
            r8.<init>(r7, r6)
            r7.d = r8
            r8 = 0
            r7.f = r8
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r7.j = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = defpackage.bg2.MaterialButtonToggleGroup
            int[] r5 = new int[r8]
            r1 = r9
            android.content.res.TypedArray r9 = defpackage.y73.d(r0, r1, r2, r3, r4, r5)
            int r0 = defpackage.bg2.MaterialButtonToggleGroup_singleSelection
            boolean r0 = r9.getBoolean(r0, r8)
            r7.setSingleSelection(r0)
            int r0 = defpackage.bg2.MaterialButtonToggleGroup_checkedButton
            r1 = -1
            int r0 = r9.getResourceId(r0, r1)
            r7.i = r0
            int r0 = defpackage.bg2.MaterialButtonToggleGroup_selectionRequired
            boolean r8 = r9.getBoolean(r0, r8)
            r7.h = r8
            r7.setChildrenDrawingOrderEnabled(r6)
            int r8 = defpackage.bg2.MaterialButtonToggleGroup_android_enabled
            boolean r8 = r9.getBoolean(r8, r6)
            r7.setEnabled(r8)
            r9.recycle()
            java.util.WeakHashMap r8 = defpackage.ll3.f3151a
            defpackage.uk3.s(r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (d(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && d(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = ll3.f3151a;
            materialButton.setId(vk3.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f1531b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton c = c(i);
            int min = Math.min(c.getStrokeWidth(), c(i - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams2 = c.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            }
            if (getOrientation() == 0) {
                kq1.g(layoutParams, 0);
                kq1.h(layoutParams, -min);
                layoutParams.topMargin = 0;
            } else {
                layoutParams.bottomMargin = 0;
                layoutParams.topMargin = -min;
                kq1.h(layoutParams, 0);
            }
            c.setLayoutParams(layoutParams);
        }
        if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c(firstVisibleChildIndex).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
            } else {
                kq1.g(layoutParams3, 0);
                kq1.h(layoutParams3, 0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.isChecked());
        fs2 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f1530a.add(new uq1(shapeAppearanceModel.e, shapeAppearanceModel.h, shapeAppearanceModel.f, shapeAppearanceModel.g));
        materialButton.setEnabled(isEnabled());
        ll3.p(materialButton, new tq1(this, 0));
    }

    public final void b(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.j);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else if (!z && hashSet.contains(Integer.valueOf(i))) {
            if (!this.h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        } else {
            return;
        }
        e(hashSet);
    }

    public final MaterialButton c(int i) {
        return (MaterialButton) getChildAt(i);
    }

    public final boolean d(int i) {
        if (getChildAt(i).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(c(i), Integer.valueOf(i));
        }
        this.e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e(Set set) {
        HashSet hashSet = this.j;
        this.j = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = c(i).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).a();
                }
            }
        }
        invalidate();
    }

    public final void f() {
        boolean z;
        uq1 uq1Var;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton c = c(i);
            if (c.getVisibility() != 8) {
                fs2 shapeAppearanceModel = c.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                jk jkVar = new jk(shapeAppearanceModel);
                uq1 uq1Var2 = (uq1) this.f1530a.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    s sVar = uq1.e;
                    if (i == firstVisibleChildIndex) {
                        if (z) {
                            if (cp3.D(this)) {
                                uq1Var = new uq1(sVar, sVar, uq1Var2.f4717b, uq1Var2.c);
                            } else {
                                uq1Var = new uq1(uq1Var2.f4716a, uq1Var2.d, sVar, sVar);
                            }
                        } else {
                            uq1Var = new uq1(uq1Var2.f4716a, sVar, uq1Var2.f4717b, sVar);
                        }
                    } else if (i == lastVisibleChildIndex) {
                        if (z) {
                            if (cp3.D(this)) {
                                uq1Var = new uq1(uq1Var2.f4716a, uq1Var2.d, sVar, sVar);
                            } else {
                                uq1Var = new uq1(sVar, sVar, uq1Var2.f4717b, uq1Var2.c);
                            }
                        } else {
                            uq1Var = new uq1(sVar, uq1Var2.d, sVar, uq1Var2.c);
                        }
                    } else {
                        uq1Var2 = null;
                    }
                    uq1Var2 = uq1Var;
                }
                if (uq1Var2 == null) {
                    jkVar.e = new s(0.0f);
                    jkVar.f = new s(0.0f);
                    jkVar.g = new s(0.0f);
                    jkVar.h = new s(0.0f);
                } else {
                    jkVar.e = uq1Var2.f4716a;
                    jkVar.h = uq1Var2.d;
                    jkVar.f = uq1Var2.f4717b;
                    jkVar.g = uq1Var2.c;
                }
                c.setShapeAppearanceModel(new fs2(jkVar));
            }
        }
    }

    public int getCheckedButtonId() {
        if (this.g && !this.j.isEmpty()) {
            return ((Integer) this.j.iterator().next()).intValue();
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = c(i).getId();
            if (this.j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.e;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        return i2;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.i;
        if (i != -1) {
            e(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.g) {
            i = 1;
        } else {
            i = 2;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, visibleButtonCount, false, i));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        f();
        a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f1530a.remove(indexOfChild);
        }
        f();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            c(i).setEnabled(z);
        }
    }

    public void setSelectionRequired(boolean z) {
        this.h = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.g != z) {
            this.g = z;
            e(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            c(i).setA11yClassName((this.g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
