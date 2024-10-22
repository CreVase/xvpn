package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import defpackage.ld0;
import defpackage.tl3;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends ld0 {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f204a = new SparseIntArray(0);

    @Override // defpackage.ld0
    public final List a() {
        return new ArrayList(0);
    }

    @Override // defpackage.ld0
    public final tl3 b(View view, int i) {
        if (f204a.get(i) > 0 && view.getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }
}
