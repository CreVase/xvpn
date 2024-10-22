package defpackage;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class ie0 extends BaseAdapter {
    public static final int d;

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f2575a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2576b;
    public final int c;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 26) {
            i = 4;
        } else {
            i = 1;
        }
        d = i;
    }

    public ie0() {
        Calendar d2 = mi3.d(null);
        this.f2575a = d2;
        this.f2576b = d2.getMaximum(7);
        this.c = d2.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f2576b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.f2576b;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.c;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(jf2.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.c;
        int i3 = this.f2576b;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.f2575a;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(mf2.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public ie0(int i) {
        Calendar d2 = mi3.d(null);
        this.f2575a = d2;
        this.f2576b = d2.getMaximum(7);
        this.c = i;
    }
}
