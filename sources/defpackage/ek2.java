package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class ek2 {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f1949a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f1950b;
    public final int c;

    public ek2(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.f1949a = colorStateList;
        this.f1950b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.c = hashCode;
    }
}
