package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.util.Locale;

/* loaded from: classes.dex */
public final class fj0 extends ab3 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final SparseArray J;
    public final SparseBooleanArray K;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public fj0(Context context) {
        c(context);
        d(context);
        this.J = new SparseArray();
        this.K = new SparseBooleanArray();
        b();
    }

    @Override // defpackage.ab3
    public final ab3 a(int i, int i2) {
        super.a(i, i2);
        return this;
    }

    public final void b() {
        this.w = true;
        this.x = false;
        this.y = true;
        this.z = false;
        this.A = true;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = true;
        this.G = true;
        this.H = false;
        this.I = true;
    }

    public final void c(Context context) {
        CaptioningManager captioningManager;
        String locale;
        int i = wi3.f5017a;
        if (i >= 19) {
            if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.p = 1088;
                Locale locale2 = captioningManager.getLocale();
                if (locale2 != null) {
                    if (i >= 21) {
                        locale = locale2.toLanguageTag();
                    } else {
                        locale = locale2.toString();
                    }
                    this.o = hb1.q(locale);
                }
            }
        }
    }

    public final void d(Context context) {
        Display display;
        Point point;
        Display.Mode mode;
        int physicalWidth;
        int physicalHeight;
        String v;
        String[] split;
        DisplayManager displayManager;
        int i = wi3.f5017a;
        if (i >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && wi3.B(context)) {
            if (i < 28) {
                v = wi3.v("sys.display-size");
            } else {
                v = wi3.v("vendor.display-size");
            }
            if (!TextUtils.isEmpty(v)) {
                try {
                    split = v.trim().split("x", -1);
                } catch (NumberFormatException unused) {
                }
                if (split.length == 2) {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (parseInt > 0 && parseInt2 > 0) {
                        point = new Point(parseInt, parseInt2);
                        a(point.x, point.y);
                    }
                }
                sn1.c("Util", "Invalid display size: " + v);
            }
            if ("Sony".equals(wi3.c) && wi3.d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
                a(point.x, point.y);
            }
        }
        point = new Point();
        if (i >= 23) {
            mode = display.getMode();
            physicalWidth = mode.getPhysicalWidth();
            point.x = physicalWidth;
            physicalHeight = mode.getPhysicalHeight();
            point.y = physicalHeight;
        } else if (i >= 17) {
            display.getRealSize(point);
        } else {
            display.getSize(point);
        }
        a(point.x, point.y);
    }

    public fj0() {
        this.J = new SparseArray();
        this.K = new SparseBooleanArray();
        b();
    }
}
