package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class af {
    public static final RectF l = new RectF();
    public static final ConcurrentHashMap m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f72a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f73b = false;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public int[] f = new int[0];
    public boolean g = false;
    public TextPaint h;
    public final TextView i;
    public final Context j;
    public final ze k;

    static {
        new ConcurrentHashMap();
    }

    public af(TextView textView) {
        this.i = textView;
        this.j = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.k = new ye();
        } else if (i >= 23) {
            this.k = new xe();
        } else {
            this.k = new ze();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a() {
        boolean z;
        int measuredWidth;
        if (h() && this.f72a != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        if (this.f73b) {
            if (this.i.getMeasuredHeight() > 0 && this.i.getMeasuredWidth() > 0) {
                if (this.k.b(this.i)) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                }
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = l;
                    synchronized (rectF) {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c = c(rectF);
                        if (c != this.i.getTextSize()) {
                            e(c, 0);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f73b = true;
    }

    public final int c(RectF rectF) {
        int i;
        StaticLayout a2;
        boolean z;
        CharSequence transformation;
        int length = this.f.length;
        if (length != 0) {
            int i2 = length - 1;
            int i3 = 0;
            int i4 = 1;
            int i5 = 0;
            while (i4 <= i2) {
                int i6 = (i4 + i2) / 2;
                int i7 = this.f[i6];
                TextView textView = this.i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    text = transformation;
                }
                int i8 = Build.VERSION.SDK_INT;
                int b2 = ue.b(textView);
                TextPaint textPaint = this.h;
                if (textPaint == null) {
                    this.h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.h.set(textView.getPaint());
                this.h.setTextSize(i7);
                Object obj = Layout.Alignment.ALIGN_NORMAL;
                try {
                    obj = d("getLayoutAlignment").invoke(textView, new Object[i3]);
                } catch (Exception unused) {
                }
                Layout.Alignment alignment = (Layout.Alignment) obj;
                int round = Math.round(rectF.right);
                if (i8 >= 23) {
                    i = b2;
                    a2 = we.a(text, alignment, round, b2, this.i, this.h, this.k);
                } else {
                    i = b2;
                    a2 = ue.a(text, alignment, round, textView, this.h);
                }
                if ((i != -1 && (a2.getLineCount() > i || a2.getLineEnd(a2.getLineCount() - 1) != text.length())) || a2.getHeight() > rectF.bottom) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    int i9 = i6 + 1;
                    i3 = 0;
                    i5 = i4;
                    i4 = i9;
                } else {
                    i5 = i6 - 1;
                    i2 = i5;
                    i3 = 0;
                }
            }
            return this.f[i5];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final void e(float f, int i) {
        Resources resources;
        Context context = this.j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        TextView textView = this.i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a2 = ve.a(textView);
            if (textView.getLayout() != null) {
                this.f73b = false;
                try {
                    Method d = d("nullLayouts");
                    if (d != null) {
                        d.invoke(textView, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!a2) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean f() {
        if (h() && this.f72a == 1) {
            if (!this.g || this.f.length == 0) {
                int floor = ((int) Math.floor((this.e - this.d) / this.c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((i * this.c) + this.d);
                }
                this.f = b(iArr);
            }
            this.f73b = true;
        } else {
            this.f73b = false;
        }
        return this.f73b;
    }

    public final boolean g() {
        boolean z;
        if (this.f.length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
        if (z) {
            this.f72a = 1;
            this.d = r0[0];
            this.e = r0[r1 - 1];
            this.c = -1.0f;
        }
        return z;
    }

    public final boolean h() {
        return !(this.i instanceof AppCompatEditText);
    }

    public final void i(float f, float f2, float f3) {
        if (f > 0.0f) {
            if (f2 > f) {
                if (f3 > 0.0f) {
                    this.f72a = 1;
                    this.d = f;
                    this.e = f2;
                    this.c = f3;
                    this.g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
    }
}
