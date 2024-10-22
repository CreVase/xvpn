package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import defpackage.ce2;
import defpackage.df2;
import defpackage.ew3;
import defpackage.s11;
import defpackage.tx2;
import defpackage.ux2;
import defpackage.xu;

/* loaded from: classes.dex */
public final class c extends d {
    public final boolean c;
    public boolean d;
    public s11 e;

    public c(ux2 ux2Var, xu xuVar, boolean z) {
        super(ux2Var, xuVar);
        this.c = z;
    }

    public final s11 c(Context context) {
        boolean z;
        int exitAnim;
        Animation loadAnimation;
        s11 s11Var;
        s11 s11Var2;
        int i;
        if (this.d) {
            return this.e;
        }
        ux2 ux2Var = this.f222a;
        Fragment fragment = ux2Var.c;
        boolean z2 = false;
        if (ux2Var.f4753a == tx2.VISIBLE) {
            z = true;
        } else {
            z = false;
        }
        int nextTransition = fragment.getNextTransition();
        if (this.c) {
            if (z) {
                exitAnim = fragment.getPopEnterAnim();
            } else {
                exitAnim = fragment.getPopExitAnim();
            }
        } else if (z) {
            exitAnim = fragment.getEnterAnim();
        } else {
            exitAnim = fragment.getExitAnim();
        }
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i2 = df2.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i2) != null) {
                fragment.mContainer.setTag(i2, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, exitAnim);
            if (onCreateAnimation != null) {
                s11Var2 = new s11(onCreateAnimation);
            } else {
                Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, exitAnim);
                if (onCreateAnimator != null) {
                    s11Var2 = new s11(onCreateAnimator);
                } else {
                    if (exitAnim == 0 && nextTransition != 0) {
                        if (nextTransition != 4097) {
                            if (nextTransition != 8194) {
                                if (nextTransition != 8197) {
                                    if (nextTransition != 4099) {
                                        if (nextTransition != 4100) {
                                            exitAnim = -1;
                                        } else if (z) {
                                            i = ew3.d1(context, R.attr.activityOpenEnterAnimation);
                                        } else {
                                            i = ew3.d1(context, R.attr.activityOpenExitAnimation);
                                        }
                                    } else if (z) {
                                        i = ce2.fragment_fade_enter;
                                    } else {
                                        i = ce2.fragment_fade_exit;
                                    }
                                } else if (z) {
                                    i = ew3.d1(context, R.attr.activityCloseEnterAnimation);
                                } else {
                                    i = ew3.d1(context, R.attr.activityCloseExitAnimation);
                                }
                            } else if (z) {
                                i = ce2.fragment_close_enter;
                            } else {
                                i = ce2.fragment_close_exit;
                            }
                        } else if (z) {
                            i = ce2.fragment_open_enter;
                        } else {
                            i = ce2.fragment_open_exit;
                        }
                        exitAnim = i;
                    }
                    if (exitAnim != 0) {
                        boolean equals = "anim".equals(context.getResources().getResourceTypeName(exitAnim));
                        if (equals) {
                            try {
                                loadAnimation = AnimationUtils.loadAnimation(context, exitAnim);
                            } catch (Resources.NotFoundException e) {
                                throw e;
                            } catch (RuntimeException unused) {
                            }
                            if (loadAnimation != null) {
                                s11Var = new s11(loadAnimation);
                                s11Var2 = s11Var;
                            } else {
                                z2 = true;
                            }
                        }
                        if (!z2) {
                            try {
                                Animator loadAnimator = AnimatorInflater.loadAnimator(context, exitAnim);
                                if (loadAnimator != null) {
                                    s11Var = new s11(loadAnimator);
                                    s11Var2 = s11Var;
                                }
                            } catch (RuntimeException e2) {
                                if (!equals) {
                                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, exitAnim);
                                    if (loadAnimation2 != null) {
                                        s11Var2 = new s11(loadAnimation2);
                                    }
                                } else {
                                    throw e2;
                                }
                            }
                        }
                    }
                }
            }
            this.e = s11Var2;
            this.d = true;
            return s11Var2;
        }
        s11Var2 = null;
        this.e = s11Var2;
        this.d = true;
        return s11Var2;
    }
}
