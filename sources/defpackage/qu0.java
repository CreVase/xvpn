package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class qu0 extends v51 {
    public final /* synthetic */ uz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu0(uz uzVar) {
        super(12);
        this.d = uzVar;
    }

    @Override // defpackage.v51
    public final g3 i(int i) {
        return new g3(AccessibilityNodeInfo.obtain(this.d.n(i).f2195a));
    }

    @Override // defpackage.v51
    public final g3 j(int i) {
        int i2;
        uz uzVar = this.d;
        if (i == 2) {
            i2 = uzVar.k;
        } else {
            i2 = uzVar.l;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return i(i2);
    }

    @Override // defpackage.v51
    public final boolean p(int i, int i2, Bundle bundle) {
        int i3;
        uz uzVar = this.d;
        View view = uzVar.i;
        if (i != -1) {
            boolean z = true;
            if (i2 != 1) {
                if (i2 != 2) {
                    boolean z2 = false;
                    if (i2 != 64) {
                        if (i2 != 128) {
                            if (i2 == 16) {
                                Chip chip = uzVar.n;
                                if (i == 0) {
                                    return chip.performClick();
                                }
                                if (i == 1) {
                                    chip.playSoundEffect(0);
                                    View.OnClickListener onClickListener = chip.h;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(chip);
                                        z2 = true;
                                    }
                                    if (chip.s) {
                                        chip.r.q(1, 1);
                                    }
                                }
                            }
                            return z2;
                        }
                        if (uzVar.k == i) {
                            uzVar.k = Integer.MIN_VALUE;
                            view.invalidate();
                            uzVar.q(i, 65536);
                        }
                        z = false;
                    } else {
                        AccessibilityManager accessibilityManager = uzVar.h;
                        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = uzVar.k) != i) {
                            if (i3 != Integer.MIN_VALUE) {
                                uzVar.k = Integer.MIN_VALUE;
                                uzVar.i.invalidate();
                                uzVar.q(i3, 65536);
                            }
                            uzVar.k = i;
                            view.invalidate();
                            uzVar.q(i, 32768);
                        }
                        z = false;
                    }
                    return z;
                }
                return uzVar.j(i);
            }
            return uzVar.p(i);
        }
        WeakHashMap weakHashMap = ll3.f3151a;
        return uk3.j(view, i2, bundle);
    }
}
