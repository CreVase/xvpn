package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBinderMapperImpl;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XTextViewNew;
import com.security.xvpn.z35kb.widget.NavigationBarContentConstraintLayout;
import com.security.xvpn.z35kb.widget.ShapeTextView;
import com.security.xvpn.z35kb.widget.XButton;

/* loaded from: classes2.dex */
public final class ma extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ sn g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ma(sn snVar, int i) {
        super(0);
        this.f = i;
        this.g = snVar;
    }

    public final nk3 b() {
        int i = this.f;
        sn snVar = this.g;
        switch (i) {
            case 0:
                View inflate = snVar.getLayoutInflater().inflate(R.layout.fragment_account_already_bind_2, (ViewGroup) null, false);
                int i2 = R.id.btnDeleteAccount;
                TextView textView = (TextView) m20.g0(inflate, R.id.btnDeleteAccount);
                if (textView != null) {
                    i2 = R.id.ivAvatar;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) m20.g0(inflate, R.id.ivAvatar);
                    if (appCompatImageView != null) {
                        i2 = R.id.ll_account_try_free_wrapper;
                        LinearLayout linearLayout = (LinearLayout) m20.g0(inflate, R.id.ll_account_try_free_wrapper);
                        if (linearLayout != null) {
                            i2 = R.id.llRemainDataPanel;
                            LinearLayout linearLayout2 = (LinearLayout) m20.g0(inflate, R.id.llRemainDataPanel);
                            if (linearLayout2 != null) {
                                i2 = R.id.ll_subscription_wrapper;
                                LinearLayout linearLayout3 = (LinearLayout) m20.g0(inflate, R.id.ll_subscription_wrapper);
                                if (linearLayout3 != null) {
                                    i2 = R.id.navigationBarMask;
                                    if (((Space) m20.g0(inflate, R.id.navigationBarMask)) != null) {
                                        i2 = R.id.sign_out_btn;
                                        XButton xButton = (XButton) m20.g0(inflate, R.id.sign_out_btn);
                                        if (xButton != null) {
                                            i2 = R.id.subscribeTypeDivider;
                                            View g0 = m20.g0(inflate, R.id.subscribeTypeDivider);
                                            if (g0 != null) {
                                                i2 = R.id.subscription_endtime;
                                                XTextViewNew xTextViewNew = (XTextViewNew) m20.g0(inflate, R.id.subscription_endtime);
                                                if (xTextViewNew != null) {
                                                    i2 = R.id.subscription_title;
                                                    XTextViewNew xTextViewNew2 = (XTextViewNew) m20.g0(inflate, R.id.subscription_title);
                                                    if (xTextViewNew2 != null) {
                                                        i2 = R.id.tvAccountFix;
                                                        XTextViewNew xTextViewNew3 = (XTextViewNew) m20.g0(inflate, R.id.tvAccountFix);
                                                        if (xTextViewNew3 != null) {
                                                            i2 = R.id.tvAccountTryFreeDesc;
                                                            XTextViewNew xTextViewNew4 = (XTextViewNew) m20.g0(inflate, R.id.tvAccountTryFreeDesc);
                                                            if (xTextViewNew4 != null) {
                                                                i2 = R.id.tvAccountTryFreeTitle;
                                                                XTextViewNew xTextViewNew5 = (XTextViewNew) m20.g0(inflate, R.id.tvAccountTryFreeTitle);
                                                                if (xTextViewNew5 != null) {
                                                                    i2 = R.id.tvExpiredStatus;
                                                                    ShapeTextView shapeTextView = (ShapeTextView) m20.g0(inflate, R.id.tvExpiredStatus);
                                                                    if (shapeTextView != null) {
                                                                        i2 = R.id.tvManageDeviceTips;
                                                                        TextView textView2 = (TextView) m20.g0(inflate, R.id.tvManageDeviceTips);
                                                                        if (textView2 != null) {
                                                                            i2 = R.id.tvManageSubscription;
                                                                            TextView textView3 = (TextView) m20.g0(inflate, R.id.tvManageSubscription);
                                                                            if (textView3 != null) {
                                                                                i2 = R.id.tvManageSubscription2;
                                                                                XTextViewNew xTextViewNew6 = (XTextViewNew) m20.g0(inflate, R.id.tvManageSubscription2);
                                                                                if (xTextViewNew6 != null) {
                                                                                    i2 = R.id.tvManageSubscription3;
                                                                                    XTextViewNew xTextViewNew7 = (XTextViewNew) m20.g0(inflate, R.id.tvManageSubscription3);
                                                                                    if (xTextViewNew7 != null) {
                                                                                        i2 = R.id.tvPausedStatus;
                                                                                        ShapeTextView shapeTextView2 = (ShapeTextView) m20.g0(inflate, R.id.tvPausedStatus);
                                                                                        if (shapeTextView2 != null) {
                                                                                            i2 = R.id.tvRemainData;
                                                                                            XTextViewNew xTextViewNew8 = (XTextViewNew) m20.g0(inflate, R.id.tvRemainData);
                                                                                            if (xTextViewNew8 != null) {
                                                                                                i2 = R.id.tvRenew;
                                                                                                TextView textView4 = (TextView) m20.g0(inflate, R.id.tvRenew);
                                                                                                if (textView4 != null) {
                                                                                                    i2 = R.id.tv_subscribe_type;
                                                                                                    XTextViewNew xTextViewNew9 = (XTextViewNew) m20.g0(inflate, R.id.tv_subscribe_type);
                                                                                                    if (xTextViewNew9 != null) {
                                                                                                        i2 = R.id.tvUsedDataTitle;
                                                                                                        XTextViewNew xTextViewNew10 = (XTextViewNew) m20.g0(inflate, R.id.tvUsedDataTitle);
                                                                                                        if (xTextViewNew10 != null) {
                                                                                                            i2 = R.id.usedDataDivider;
                                                                                                            View g02 = m20.g0(inflate, R.id.usedDataDivider);
                                                                                                            if (g02 != null) {
                                                                                                                i2 = R.id.vChangePassword;
                                                                                                                TextView textView5 = (TextView) m20.g0(inflate, R.id.vChangePassword);
                                                                                                                if (textView5 != null) {
                                                                                                                    i2 = R.id.vTop;
                                                                                                                    LinearLayout linearLayout4 = (LinearLayout) m20.g0(inflate, R.id.vTop);
                                                                                                                    if (linearLayout4 != null) {
                                                                                                                        i2 = R.id.xbtn_try_free;
                                                                                                                        XButton xButton2 = (XButton) m20.g0(inflate, R.id.xbtn_try_free);
                                                                                                                        if (xButton2 != null) {
                                                                                                                            i2 = R.id.xtv_user_name;
                                                                                                                            XTextViewNew xTextViewNew11 = (XTextViewNew) m20.g0(inflate, R.id.xtv_user_name);
                                                                                                                            if (xTextViewNew11 != null) {
                                                                                                                                return new m11((NavigationBarContentConstraintLayout) inflate, textView, appCompatImageView, linearLayout, linearLayout2, linearLayout3, xButton, g0, xTextViewNew, xTextViewNew2, xTextViewNew3, xTextViewNew4, xTextViewNew5, shapeTextView, textView2, textView3, xTextViewNew6, xTextViewNew7, shapeTextView2, xTextViewNew8, textView4, xTextViewNew9, xTextViewNew10, g02, textView5, linearLayout4, xButton2, xTextViewNew11);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            default:
                LayoutInflater layoutInflater = snVar.getLayoutInflater();
                int i3 = p6.L;
                DataBinderMapperImpl dataBinderMapperImpl = md0.f3279a;
                return (p6) tl3.i(layoutInflater, R.layout.activity_purchase, null, null);
        }
    }

    @Override // defpackage.v31
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f) {
            case 0:
                return b();
            default:
                return b();
        }
    }
}
