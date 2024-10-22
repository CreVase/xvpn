package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b43 extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f399a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b43(String str, int i, Class cls) {
        super(cls, str);
        this.f399a = i;
    }

    public final Float a(View view) {
        switch (this.f399a) {
            case 6:
                return Float.valueOf(an3.f118a.s(view));
            case 7:
            default:
                WeakHashMap weakHashMap = ll3.f3151a;
                return Float.valueOf(vk3.e(view));
            case 8:
                return Float.valueOf(view.getLayoutParams().width);
            case 9:
                return Float.valueOf(view.getLayoutParams().height);
            case 10:
                WeakHashMap weakHashMap2 = ll3.f3151a;
                return Float.valueOf(vk3.f(view));
        }
    }

    public final void b(aw awVar, PointF pointF) {
        switch (this.f399a) {
            case 1:
                awVar.getClass();
                awVar.f347a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                awVar.f348b = round;
                int i = awVar.f + 1;
                awVar.f = i;
                if (i == awVar.g) {
                    an3.a(awVar.e, awVar.f347a, round, awVar.c, awVar.d);
                    awVar.f = 0;
                    awVar.g = 0;
                    return;
                }
                return;
            default:
                awVar.getClass();
                awVar.c = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                awVar.d = round2;
                int i2 = awVar.g + 1;
                awVar.g = i2;
                if (awVar.f == i2) {
                    an3.a(awVar.e, awVar.f347a, awVar.f348b, awVar.c, round2);
                    awVar.f = 0;
                    awVar.g = 0;
                    return;
                }
                return;
        }
    }

    public final void c(View view, PointF pointF) {
        switch (this.f399a) {
            case 3:
                an3.a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
                return;
            case 4:
                an3.a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
                return;
            default:
                int round = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                an3.a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
                return;
        }
    }

    public final void d(View view, Float f) {
        switch (this.f399a) {
            case 6:
                an3.f118a.t(view, f.floatValue());
                return;
            case 7:
            default:
                WeakHashMap weakHashMap = ll3.f3151a;
                vk3.k(view, vk3.f(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
                return;
            case 8:
                view.getLayoutParams().width = f.intValue();
                view.requestLayout();
                return;
            case 9:
                view.getLayoutParams().height = f.intValue();
                view.requestLayout();
                return;
            case 10:
                int intValue = f.intValue();
                int paddingTop = view.getPaddingTop();
                WeakHashMap weakHashMap2 = ll3.f3151a;
                vk3.k(view, intValue, paddingTop, vk3.e(view), view.getPaddingBottom());
                return;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f399a) {
            case 0:
                return Float.valueOf(((SwitchCompat) obj).z);
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return a((View) obj);
            case 7:
                WeakHashMap weakHashMap = ll3.f3151a;
                return wk3.a((View) obj);
            case 8:
                return a((View) obj);
            case 9:
                return a((View) obj);
            case 10:
                return a((View) obj);
            default:
                return a((View) obj);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f399a) {
            case 0:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                return;
            case 1:
                b((aw) obj, (PointF) obj2);
                return;
            case 2:
                b((aw) obj, (PointF) obj2);
                return;
            case 3:
                c((View) obj, (PointF) obj2);
                return;
            case 4:
                c((View) obj, (PointF) obj2);
                return;
            case 5:
                c((View) obj, (PointF) obj2);
                return;
            case 6:
                d((View) obj, (Float) obj2);
                return;
            case 7:
                WeakHashMap weakHashMap = ll3.f3151a;
                wk3.c((View) obj, (Rect) obj2);
                return;
            case 8:
                d((View) obj, (Float) obj2);
                return;
            case 9:
                d((View) obj, (Float) obj2);
                return;
            case 10:
                d((View) obj, (Float) obj2);
                return;
            default:
                d((View) obj, (Float) obj2);
                return;
        }
    }
}
