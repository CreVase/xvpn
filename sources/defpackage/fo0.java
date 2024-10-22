package defpackage;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class fo0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f2127a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        f2127a = field;
    }
}
