package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.v;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class a3 {
    public static final a3 e = new a3(1);
    public static final a3 f = new a3(2);
    public static final a3 g;
    public static final a3 h;
    public static final a3 i;
    public static final a3 j;
    public static final a3 k;
    public static final a3 l;
    public static final a3 m;
    public static final a3 n;

    /* renamed from: a, reason: collision with root package name */
    public final Object f18a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19b;
    public final Class c;
    public final t3 d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction25;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction26;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction27;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction28;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction29;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction30;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction31;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction32;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction33;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction34;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction35;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction36;
        new a3(4);
        new a3(8);
        g = new a3(16);
        new a3(32);
        new a3(64);
        new a3(128);
        new a3(UserVerificationMethods.USER_VERIFY_HANDPRINT, m3.class);
        new a3(512, m3.class);
        new a3(UserVerificationMethods.USER_VERIFY_ALL, n3.class);
        new a3(2048, n3.class);
        h = new a3(v.DEFAULT_BUFFER_SIZE);
        i = new a3(8192);
        new a3(Http2.INITIAL_MAX_FRAME_SIZE);
        new a3(32768);
        new a3(65536);
        new a3(131072, r3.class);
        j = new a3(262144);
        k = new a3(524288);
        l = new a3(1048576);
        new a3(2097152, s3.class);
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction37 = null;
        if (i2 >= 23) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
        } else {
            accessibilityAction = null;
        }
        new a3(accessibilityAction, R.id.accessibilityActionShowOnScreen, null, null, null);
        if (i2 >= 23) {
            accessibilityAction36 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
            accessibilityAction2 = accessibilityAction36;
        } else {
            accessibilityAction2 = null;
        }
        new a3(accessibilityAction2, R.id.accessibilityActionScrollToPosition, null, null, p3.class);
        if (i2 >= 23) {
            accessibilityAction35 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
            accessibilityAction3 = accessibilityAction35;
        } else {
            accessibilityAction3 = null;
        }
        m = new a3(accessibilityAction3, R.id.accessibilityActionScrollUp, null, null, null);
        if (i2 >= 23) {
            accessibilityAction34 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
            accessibilityAction4 = accessibilityAction34;
        } else {
            accessibilityAction4 = null;
        }
        new a3(accessibilityAction4, R.id.accessibilityActionScrollLeft, null, null, null);
        if (i2 >= 23) {
            accessibilityAction33 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
            accessibilityAction5 = accessibilityAction33;
        } else {
            accessibilityAction5 = null;
        }
        n = new a3(accessibilityAction5, R.id.accessibilityActionScrollDown, null, null, null);
        if (i2 >= 23) {
            accessibilityAction32 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
            accessibilityAction6 = accessibilityAction32;
        } else {
            accessibilityAction6 = null;
        }
        new a3(accessibilityAction6, R.id.accessibilityActionScrollRight, null, null, null);
        if (i2 >= 29) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction7 = null;
        }
        new a3(accessibilityAction7, R.id.accessibilityActionPageUp, null, null, null);
        if (i2 >= 29) {
            accessibilityAction31 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction8 = accessibilityAction31;
        } else {
            accessibilityAction8 = null;
        }
        new a3(accessibilityAction8, R.id.accessibilityActionPageDown, null, null, null);
        if (i2 >= 29) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction9 = null;
        }
        new a3(accessibilityAction9, R.id.accessibilityActionPageLeft, null, null, null);
        if (i2 >= 29) {
            accessibilityAction30 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction10 = accessibilityAction30;
        } else {
            accessibilityAction10 = null;
        }
        new a3(accessibilityAction10, R.id.accessibilityActionPageRight, null, null, null);
        if (i2 >= 23) {
            accessibilityAction29 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
            accessibilityAction11 = accessibilityAction29;
        } else {
            accessibilityAction11 = null;
        }
        new a3(accessibilityAction11, R.id.accessibilityActionContextClick, null, null, null);
        if (i2 >= 24) {
            accessibilityAction28 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
            accessibilityAction12 = accessibilityAction28;
        } else {
            accessibilityAction12 = null;
        }
        new a3(accessibilityAction12, R.id.accessibilityActionSetProgress, null, null, q3.class);
        if (i2 >= 26) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction13 = null;
        }
        new a3(accessibilityAction13, R.id.accessibilityActionMoveWindow, null, null, o3.class);
        if (i2 >= 28) {
            accessibilityAction27 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction14 = accessibilityAction27;
        } else {
            accessibilityAction14 = null;
        }
        new a3(accessibilityAction14, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i2 >= 28) {
            accessibilityAction26 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction15 = accessibilityAction26;
        } else {
            accessibilityAction15 = null;
        }
        new a3(accessibilityAction15, R.id.accessibilityActionHideTooltip, null, null, null);
        if (i2 >= 30) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction16 = null;
        }
        new a3(accessibilityAction16, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i2 >= 30) {
            accessibilityAction25 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction17 = accessibilityAction25;
        } else {
            accessibilityAction17 = null;
        }
        new a3(accessibilityAction17, R.id.accessibilityActionImeEnter, null, null, null);
        if (i2 >= 32) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction18 = null;
        }
        new a3(accessibilityAction18, R.id.ALT, null, null, null);
        if (i2 >= 32) {
            accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction19 = accessibilityAction24;
        } else {
            accessibilityAction19 = null;
        }
        new a3(accessibilityAction19, R.id.CTRL, null, null, null);
        if (i2 >= 32) {
            accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction20 = accessibilityAction23;
        } else {
            accessibilityAction20 = null;
        }
        new a3(accessibilityAction20, R.id.FUNCTION, null, null, null);
        if (i2 >= 33) {
            accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction21 = accessibilityAction22;
        } else {
            accessibilityAction21 = null;
        }
        new a3(accessibilityAction21, R.id.KEYCODE_0, null, null, null);
        if (i2 >= 34) {
            accessibilityAction37 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }
        new a3(accessibilityAction37, R.id.KEYCODE_3D_MODE, null, null, null);
    }

    public a3(int i2) {
        this(null, i2, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f18a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a3)) {
            return false;
        }
        Object obj2 = ((a3) obj).f18a;
        Object obj3 = this.f18a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        if (!obj3.equals(obj2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f18a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d = g3.d(this.f19b);
        if (d.equals("ACTION_UNKNOWN")) {
            Object obj = this.f18a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d);
        return sb.toString();
    }

    public a3(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public a3(Object obj, int i2, String str, t3 t3Var, Class cls) {
        this.f19b = i2;
        this.d = t3Var;
        if (obj == null) {
            this.f18a = new AccessibilityNodeInfo.AccessibilityAction(i2, str);
        } else {
            this.f18a = obj;
        }
        this.c = cls;
    }
}
