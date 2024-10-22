package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import defpackage.cg2;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final int f140a;

    /* renamed from: b, reason: collision with root package name */
    public final int f141b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cg2.RecycleListView);
        this.f141b = obtainStyledAttributes.getDimensionPixelOffset(cg2.RecycleListView_paddingBottomNoButtons, -1);
        this.f140a = obtainStyledAttributes.getDimensionPixelOffset(cg2.RecycleListView_paddingTopNoTitle, -1);
    }
}
