package defpackage;

import android.R;
import android.content.Context;
import android.widget.ArrayAdapter;

/* loaded from: classes.dex */
public final class l9 extends ArrayAdapter {
    public l9(Context context, int i, CharSequence[] charSequenceArr) {
        super(context, i, R.id.text1, charSequenceArr);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
