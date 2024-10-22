package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class oc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3639a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f3640b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;
    public final TextView g;

    public /* synthetic */ oc(TextView textView, int i) {
        this.f3639a = i;
        this.g = textView;
    }

    public final void a() {
        TextView textView = this.g;
        Drawable H = tf3.H((CompoundButton) textView);
        if (H != null) {
            if (this.d || this.e) {
                Drawable mutate = t9.L0(H).mutate();
                if (this.d) {
                    bn0.h(mutate, this.f3640b);
                }
                if (this.e) {
                    bn0.i(mutate, this.c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(((CompoundButton) textView).getDrawableState());
                }
                ((CompoundButton) textView).setButtonDrawable(mutate);
            }
        }
    }

    public final void b() {
        TextView textView = this.g;
        Drawable checkMarkDrawable = ((CheckedTextView) textView).getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.d || this.e) {
                Drawable mutate = t9.L0(checkMarkDrawable).mutate();
                if (this.d) {
                    bn0.h(mutate, this.f3640b);
                }
                if (this.e) {
                    bn0.i(mutate, this.c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(((CheckedTextView) textView).getDrawableState());
                }
                ((CheckedTextView) textView).setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[Catch: all -> 0x0096, TRY_ENTER, TryCatch #3 {all -> 0x0096, blocks: (B:5:0x0028, B:7:0x0030, B:10:0x0036, B:12:0x004c, B:14:0x0054, B:16:0x005a, B:17:0x006b, B:19:0x0073, B:20:0x007d, B:22:0x0085), top: B:4:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073 A[Catch: all -> 0x0096, TryCatch #3 {all -> 0x0096, blocks: (B:5:0x0028, B:7:0x0030, B:10:0x0036, B:12:0x004c, B:14:0x0054, B:16:0x005a, B:17:0x006b, B:19:0x0073, B:20:0x007d, B:22:0x0085), top: B:4:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085 A[Catch: all -> 0x0096, TRY_LEAVE, TryCatch #3 {all -> 0x0096, blocks: (B:5:0x0028, B:7:0x0030, B:10:0x0036, B:12:0x004c, B:14:0x0054, B:16:0x005a, B:17:0x006b, B:19:0x0073, B:20:0x007d, B:22:0x0085), top: B:4:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da A[Catch: all -> 0x0124, TRY_ENTER, TryCatch #2 {all -> 0x0124, blocks: (B:35:0x00b6, B:37:0x00be, B:40:0x00c4, B:42:0x00da, B:44:0x00e2, B:46:0x00e8, B:47:0x00f9, B:49:0x0101, B:50:0x010b, B:52:0x0113), top: B:34:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0101 A[Catch: all -> 0x0124, TryCatch #2 {all -> 0x0124, blocks: (B:35:0x00b6, B:37:0x00be, B:40:0x00c4, B:42:0x00da, B:44:0x00e2, B:46:0x00e8, B:47:0x00f9, B:49:0x0101, B:50:0x010b, B:52:0x0113), top: B:34:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0113 A[Catch: all -> 0x0124, TRY_LEAVE, TryCatch #2 {all -> 0x0124, blocks: (B:35:0x00b6, B:37:0x00be, B:40:0x00c4, B:42:0x00da, B:44:0x00e2, B:46:0x00e8, B:47:0x00f9, B:49:0x0101, B:50:0x010b, B:52:0x0113), top: B:34:0x00b6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.util.AttributeSet r13, int r14) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oc.c(android.util.AttributeSet, int):void");
    }
}
