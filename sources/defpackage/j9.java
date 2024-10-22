package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

/* loaded from: classes.dex */
public final class j9 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2722a;

    /* renamed from: b, reason: collision with root package name */
    public final LayoutInflater f2723b;
    public Drawable c;
    public CharSequence d;
    public View e;
    public DialogInterface.OnKeyListener f;
    public CharSequence[] g;
    public ListAdapter h;
    public DialogInterface.OnClickListener i;
    public boolean j;
    public int k = -1;

    public j9(ContextThemeWrapper contextThemeWrapper) {
        this.f2722a = contextThemeWrapper;
        this.f2723b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}
