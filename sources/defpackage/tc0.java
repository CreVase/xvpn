package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XTextViewNew;
import com.security.xvpn.z35kb.widget.BorderLinearLayout;
import com.security.xvpn.z35kb.widget.NavigationBarContentConstraintLayout;
import com.security.xvpn.z35kb.widget.QuickConnAddItemView;
import com.security.xvpn.z35kb.widget.TabSaveFocusLayout;
import com.security.xvpn.z35kb.widget.Toolbar;
import com.security.xvpn.z35kb.widget.XEditText;

/* loaded from: classes2.dex */
public final class tc0 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ dn g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tc0(dn dnVar, int i) {
        super(0);
        this.f = i;
        this.g = dnVar;
    }

    private final h7 c() {
        View inflate = this.g.getLayoutInflater().inflate(R.layout.activity_server_choose, (ViewGroup) null, false);
        int i = R.id.btnClose;
        AppCompatImageView appCompatImageView = (AppCompatImageView) m20.g0(inflate, R.id.btnClose);
        if (appCompatImageView != null) {
            i = R.id.btnSearchCancel;
            TextView textView = (TextView) m20.g0(inflate, R.id.btnSearchCancel);
            if (textView != null) {
                i = R.id.btnToPing;
                FrameLayout frameLayout = (FrameLayout) m20.g0(inflate, R.id.btnToPing);
                if (frameLayout != null) {
                    i = R.id.divider_1;
                    View g0 = m20.g0(inflate, R.id.divider_1);
                    if (g0 != null) {
                        i = R.id.divider_2;
                        View g02 = m20.g0(inflate, R.id.divider_2);
                        if (g02 != null) {
                            i = R.id.etSearchInput;
                            XEditText xEditText = (XEditText) m20.g0(inflate, R.id.etSearchInput);
                            if (xEditText != null) {
                                i = R.id.flSearchServerContainer;
                                FrameLayout frameLayout2 = (FrameLayout) m20.g0(inflate, R.id.flSearchServerContainer);
                                if (frameLayout2 != null) {
                                    i = R.id.flServerListContainer;
                                    FrameLayout frameLayout3 = (FrameLayout) m20.g0(inflate, R.id.flServerListContainer);
                                    if (frameLayout3 != null) {
                                        i = R.id.ivPingIcon;
                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) m20.g0(inflate, R.id.ivPingIcon);
                                        if (appCompatImageView2 != null) {
                                            NavigationBarContentConstraintLayout navigationBarContentConstraintLayout = (NavigationBarContentConstraintLayout) inflate;
                                            i = R.id.serverListLayoutGroup;
                                            Group group = (Group) m20.g0(inflate, R.id.serverListLayoutGroup);
                                            if (group != null) {
                                                i = R.id.tlServerType;
                                                TabSaveFocusLayout tabSaveFocusLayout = (TabSaveFocusLayout) m20.g0(inflate, R.id.tlServerType);
                                                if (tabSaveFocusLayout != null) {
                                                    i = R.id.tvPingTitle;
                                                    TextView textView2 = (TextView) m20.g0(inflate, R.id.tvPingTitle);
                                                    if (textView2 != null) {
                                                        i = R.id.tvTitle;
                                                        TextView textView3 = (TextView) m20.g0(inflate, R.id.tvTitle);
                                                        if (textView3 != null) {
                                                            return new h7(navigationBarContentConstraintLayout, appCompatImageView, textView, frameLayout, g0, g02, xEditText, frameLayout2, frameLayout3, appCompatImageView2, navigationBarContentConstraintLayout, group, tabSaveFocusLayout, textView2, textView3);
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
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    private final i7 d() {
        View inflate = this.g.getLayoutInflater().inflate(R.layout.activity_speed_test, (ViewGroup) null, false);
        int i = R.id.bottomDivider;
        View g0 = m20.g0(inflate, R.id.bottomDivider);
        if (g0 != null) {
            i = R.id.btnPingSwitch;
            TextView textView = (TextView) m20.g0(inflate, R.id.btnPingSwitch);
            if (textView != null) {
                i = R.id.flagLatency;
                XTextViewNew xTextViewNew = (XTextViewNew) m20.g0(inflate, R.id.flagLatency);
                if (xTextViewNew != null) {
                    i = R.id.flagLatencyUnit;
                    XTextViewNew xTextViewNew2 = (XTextViewNew) m20.g0(inflate, R.id.flagLatencyUnit);
                    if (xTextViewNew2 != null) {
                        i = R.id.flagLocation;
                        TextView textView2 = (TextView) m20.g0(inflate, R.id.flagLocation);
                        if (textView2 != null) {
                            i = R.id.flagPingLoss;
                            TextView textView3 = (TextView) m20.g0(inflate, R.id.flagPingLoss);
                            if (textView3 != null) {
                                i = R.id.groupHeaderBottom;
                                if (((Barrier) m20.g0(inflate, R.id.groupHeaderBottom)) != null) {
                                    i = R.id.groupPingResultHeader;
                                    Group group = (Group) m20.g0(inflate, R.id.groupPingResultHeader);
                                    if (group != null) {
                                        i = R.id.headerChooseLocation;
                                        TextView textView4 = (TextView) m20.g0(inflate, R.id.headerChooseLocation);
                                        if (textView4 != null) {
                                            i = R.id.headerSaveBestIP;
                                            TextView textView5 = (TextView) m20.g0(inflate, R.id.headerSaveBestIP);
                                            if (textView5 != null) {
                                                i = R.id.headerSpeedTestResult;
                                                View g02 = m20.g0(inflate, R.id.headerSpeedTestResult);
                                                if (g02 != null) {
                                                    i = R.id.itemColumn1;
                                                    if (((Guideline) m20.g0(inflate, R.id.itemColumn1)) != null) {
                                                        i = R.id.itemColumn2;
                                                        if (((Guideline) m20.g0(inflate, R.id.itemColumn2)) != null) {
                                                            i = R.id.itemColumn3;
                                                            if (((Guideline) m20.g0(inflate, R.id.itemColumn3)) != null) {
                                                                i = R.id.ivLocationWatermark;
                                                                if (((ImageView) m20.g0(inflate, R.id.ivLocationWatermark)) != null) {
                                                                    i = R.id.iv_ping_ask;
                                                                    if (((AppCompatImageView) m20.g0(inflate, R.id.iv_ping_ask)) != null) {
                                                                        i = R.id.ll_pin_bottom;
                                                                        LinearLayout linearLayout = (LinearLayout) m20.g0(inflate, R.id.ll_pin_bottom);
                                                                        if (linearLayout != null) {
                                                                            i = R.id.rvSpeedTestList;
                                                                            RecyclerView recyclerView = (RecyclerView) m20.g0(inflate, R.id.rvSpeedTestList);
                                                                            if (recyclerView != null) {
                                                                                i = R.id.toolbar;
                                                                                if (((Toolbar) m20.g0(inflate, R.id.toolbar)) != null) {
                                                                                    i = R.id.tv_ping_status;
                                                                                    if (((TextView) m20.g0(inflate, R.id.tv_ping_status)) != null) {
                                                                                        i = R.id.tvUserType;
                                                                                        if (((XTextViewNew) m20.g0(inflate, R.id.tvUserType)) != null) {
                                                                                            return new i7((NavigationBarContentConstraintLayout) inflate, g0, textView, xTextViewNew, xTextViewNew2, textView2, textView3, group, textView4, textView5, g02, linearLayout, recyclerView);
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
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    private final j7 e() {
        View inflate = this.g.getLayoutInflater().inflate(R.layout.activity_speed_test_explain, (ViewGroup) null, false);
        int i = R.id.guideline;
        if (((Guideline) m20.g0(inflate, R.id.guideline)) != null) {
            i = R.id.guideline2;
            if (((Guideline) m20.g0(inflate, R.id.guideline2)) != null) {
                NavigationBarContentConstraintLayout navigationBarContentConstraintLayout = (NavigationBarContentConstraintLayout) inflate;
                if (((Toolbar) m20.g0(inflate, R.id.toolbar)) != null) {
                    if (((TextView) m20.g0(inflate, R.id.tvSerialNo1)) != null) {
                        if (((TextView) m20.g0(inflate, R.id.tvSerialNo1Content)) != null) {
                            if (((TextView) m20.g0(inflate, R.id.tvSerialNo2)) != null) {
                                if (((TextView) m20.g0(inflate, R.id.tvSerialNo2Content)) != null) {
                                    if (((TextView) m20.g0(inflate, R.id.tvSerialNo3)) != null) {
                                        if (((TextView) m20.g0(inflate, R.id.tvSerialNo3Content)) != null) {
                                            return new j7(navigationBarContentConstraintLayout, navigationBarContentConstraintLayout);
                                        }
                                        i = R.id.tvSerialNo3Content;
                                    } else {
                                        i = R.id.tvSerialNo3;
                                    }
                                } else {
                                    i = R.id.tvSerialNo2Content;
                                }
                            } else {
                                i = R.id.tvSerialNo2;
                            }
                        } else {
                            i = R.id.tvSerialNo1Content;
                        }
                    } else {
                        i = R.id.tvSerialNo1;
                    }
                } else {
                    i = R.id.toolbar;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public final nk3 b() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.f;
        int i7 = R.id.toolbar;
        dn dnVar = this.g;
        switch (i6) {
            case 0:
                View inflate = dnVar.getLayoutInflater().inflate(R.layout.activity_custom_app_open_ad, (ViewGroup) null, false);
                int i8 = R.id.adContainer;
                FrameLayout frameLayout = (FrameLayout) m20.g0(inflate, R.id.adContainer);
                if (frameLayout != null) {
                    i8 = R.id.llContinue;
                    LinearLayout linearLayout = (LinearLayout) m20.g0(inflate, R.id.llContinue);
                    if (linearLayout != null) {
                        i8 = R.id.tvStatus;
                        TextView textView = (TextView) m20.g0(inflate, R.id.tvStatus);
                        if (textView != null) {
                            return new b6((ConstraintLayout) inflate, frameLayout, linearLayout, textView);
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
            case 1:
                View inflate2 = dnVar.getLayoutInflater().inflate(R.layout.activity_advanced_features, (ViewGroup) null, false);
                if (((LinearLayout) m20.g0(inflate2, R.id.darkOptionAuto)) == null) {
                    i7 = R.id.darkOptionAuto;
                } else if (((AppCompatTextView) m20.g0(inflate2, R.id.darkOptionAutoDetails)) == null) {
                    i7 = R.id.darkOptionAutoDetails;
                } else if (((AppCompatTextView) m20.g0(inflate2, R.id.darkOptionAutoText)) == null) {
                    i7 = R.id.darkOptionAutoText;
                } else if (((AppCompatTextView) m20.g0(inflate2, R.id.darkOptionOff)) == null) {
                    i7 = R.id.darkOptionOff;
                } else if (((AppCompatTextView) m20.g0(inflate2, R.id.darkOptionOn)) != null) {
                    View g0 = m20.g0(inflate2, R.id.divider_2);
                    if (g0 != null) {
                        View g02 = m20.g0(inflate2, R.id.flag_divider);
                        if (g02 != null) {
                            LinearLayout linearLayout2 = (LinearLayout) m20.g0(inflate2, R.id.itemApplyQuickConn);
                            if (linearLayout2 != null) {
                                LinearLayout linearLayout3 = (LinearLayout) m20.g0(inflate2, R.id.item_setting_conn_log);
                                if (linearLayout3 != null) {
                                    LinearLayout linearLayout4 = (LinearLayout) m20.g0(inflate2, R.id.item_setting_double_vpn);
                                    if (linearLayout4 == null) {
                                        i7 = R.id.item_setting_double_vpn;
                                    } else if (((LinearLayout) m20.g0(inflate2, R.id.item_setting_kill_switch)) == null) {
                                        i7 = R.id.item_setting_kill_switch;
                                    } else if (((LinearLayout) m20.g0(inflate2, R.id.item_setting_stable_connection)) != null) {
                                        LinearLayout linearLayout5 = (LinearLayout) m20.g0(inflate2, R.id.itemSplitTunneling);
                                        if (linearLayout5 != null) {
                                            AppCompatImageView appCompatImageView = (AppCompatImageView) m20.g0(inflate2, R.id.ivArrow);
                                            if (appCompatImageView != null) {
                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) m20.g0(inflate2, R.id.ivArrow2);
                                                if (appCompatImageView2 != null) {
                                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) m20.g0(inflate2, R.id.ivArrow3);
                                                    if (appCompatImageView3 == null) {
                                                        i7 = R.id.ivArrow3;
                                                    } else if (((LinearLayout) m20.g0(inflate2, R.id.llDarkModeGrouop)) != null) {
                                                        NavigationBarContentConstraintLayout navigationBarContentConstraintLayout = (NavigationBarContentConstraintLayout) inflate2;
                                                        ScrollView scrollView = (ScrollView) m20.g0(inflate2, R.id.scrollView);
                                                        if (scrollView != null) {
                                                            SwitchCompat switchCompat = (SwitchCompat) m20.g0(inflate2, R.id.switchBtnDoubleVPN);
                                                            if (switchCompat != null) {
                                                                SwitchCompat switchCompat2 = (SwitchCompat) m20.g0(inflate2, R.id.switchBtnKillSwitch);
                                                                if (switchCompat2 != null) {
                                                                    SwitchCompat switchCompat3 = (SwitchCompat) m20.g0(inflate2, R.id.switchStableConnection);
                                                                    if (switchCompat3 == null) {
                                                                        i7 = R.id.switchStableConnection;
                                                                    } else if (((Toolbar) m20.g0(inflate2, R.id.toolbar)) != null) {
                                                                        i7 = R.id.tvApplyQuickConn;
                                                                        TextView textView2 = (TextView) m20.g0(inflate2, R.id.tvApplyQuickConn);
                                                                        if (textView2 != null) {
                                                                            i7 = R.id.tvApplyQuickConnDetails;
                                                                            if (((TextView) m20.g0(inflate2, R.id.tvApplyQuickConnDetails)) != null) {
                                                                                i7 = R.id.tvConnLog;
                                                                                TextView textView3 = (TextView) m20.g0(inflate2, R.id.tvConnLog);
                                                                                if (textView3 != null) {
                                                                                    i7 = R.id.tvConnLogDetails;
                                                                                    TextView textView4 = (TextView) m20.g0(inflate2, R.id.tvConnLogDetails);
                                                                                    if (textView4 != null) {
                                                                                        i7 = R.id.tvDarkMode;
                                                                                        if (((TextView) m20.g0(inflate2, R.id.tvDarkMode)) != null) {
                                                                                            i7 = R.id.tvDoubleVPN;
                                                                                            TextView textView5 = (TextView) m20.g0(inflate2, R.id.tvDoubleVPN);
                                                                                            if (textView5 != null) {
                                                                                                i7 = R.id.tvDoubleVPNDetails;
                                                                                                TextView textView6 = (TextView) m20.g0(inflate2, R.id.tvDoubleVPNDetails);
                                                                                                if (textView6 != null) {
                                                                                                    i7 = R.id.tvKillSwitch;
                                                                                                    TextView textView7 = (TextView) m20.g0(inflate2, R.id.tvKillSwitch);
                                                                                                    if (textView7 != null) {
                                                                                                        i7 = R.id.tvKillSwitchDetails;
                                                                                                        if (((TextView) m20.g0(inflate2, R.id.tvKillSwitchDetails)) != null) {
                                                                                                            i7 = R.id.tvSTDetails;
                                                                                                            TextView textView8 = (TextView) m20.g0(inflate2, R.id.tvSTDetails);
                                                                                                            if (textView8 != null) {
                                                                                                                i7 = R.id.tvSplitTunneling;
                                                                                                                TextView textView9 = (TextView) m20.g0(inflate2, R.id.tvSplitTunneling);
                                                                                                                if (textView9 != null) {
                                                                                                                    i7 = R.id.tvStableConnection;
                                                                                                                    if (((TextView) m20.g0(inflate2, R.id.tvStableConnection)) != null) {
                                                                                                                        i7 = R.id.tvStableConnectionDetails;
                                                                                                                        if (((TextView) m20.g0(inflate2, R.id.tvStableConnectionDetails)) != null) {
                                                                                                                            return new j5(navigationBarContentConstraintLayout, g0, g02, linearLayout2, linearLayout3, linearLayout4, linearLayout5, appCompatImageView, appCompatImageView2, appCompatImageView3, navigationBarContentConstraintLayout, scrollView, switchCompat, switchCompat2, switchCompat3, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
                                                                } else {
                                                                    i7 = R.id.switchBtnKillSwitch;
                                                                }
                                                            } else {
                                                                i7 = R.id.switchBtnDoubleVPN;
                                                            }
                                                        } else {
                                                            i7 = R.id.scrollView;
                                                        }
                                                    } else {
                                                        i7 = R.id.llDarkModeGrouop;
                                                    }
                                                } else {
                                                    i7 = R.id.ivArrow2;
                                                }
                                            } else {
                                                i7 = R.id.ivArrow;
                                            }
                                        } else {
                                            i7 = R.id.itemSplitTunneling;
                                        }
                                    } else {
                                        i7 = R.id.item_setting_stable_connection;
                                    }
                                } else {
                                    i7 = R.id.item_setting_conn_log;
                                }
                            } else {
                                i7 = R.id.itemApplyQuickConn;
                            }
                        } else {
                            i7 = R.id.flag_divider;
                        }
                    } else {
                        i7 = R.id.divider_2;
                    }
                } else {
                    i7 = R.id.darkOptionOn;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i7)));
            case 2:
                View inflate3 = dnVar.getLayoutInflater().inflate(R.layout.activity_language, (ViewGroup) null, false);
                RecyclerView recyclerView = (RecyclerView) m20.g0(inflate3, R.id.recycler);
                if (recyclerView != null) {
                    Toolbar toolbar = (Toolbar) m20.g0(inflate3, R.id.toolbar);
                    if (toolbar != null) {
                        return new l6((ConstraintLayout) inflate3, recyclerView, toolbar);
                    }
                } else {
                    i7 = R.id.recycler;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i7)));
            case 3:
                View inflate4 = dnVar.getLayoutInflater().inflate(R.layout.activity_all_app, (ViewGroup) null, false);
                XEditText xEditText = (XEditText) m20.g0(inflate4, R.id.et);
                if (xEditText != null) {
                    RecyclerView recyclerView2 = (RecyclerView) m20.g0(inflate4, R.id.list);
                    if (recyclerView2 != null) {
                        SwitchCompat switchCompat4 = (SwitchCompat) m20.g0(inflate4, R.id.switchSystemApps);
                        if (switchCompat4 != null) {
                            Toolbar toolbar2 = (Toolbar) m20.g0(inflate4, R.id.toolbar);
                            if (toolbar2 != null) {
                                i7 = R.id.tvHideSystemApps;
                                TextView textView10 = (TextView) m20.g0(inflate4, R.id.tvHideSystemApps);
                                if (textView10 != null) {
                                    i7 = R.id.tvNoApp;
                                    TextView textView11 = (TextView) m20.g0(inflate4, R.id.tvNoApp);
                                    if (textView11 != null) {
                                        i7 = R.id.tvNoAppTitle;
                                        TextView textView12 = (TextView) m20.g0(inflate4, R.id.tvNoAppTitle);
                                        if (textView12 != null) {
                                            i7 = R.id.tvNoResult;
                                            TextView textView13 = (TextView) m20.g0(inflate4, R.id.tvNoResult);
                                            if (textView13 != null) {
                                                i7 = R.id.vClearInput;
                                                ImageView imageView = (ImageView) m20.g0(inflate4, R.id.vClearInput);
                                                if (imageView != null) {
                                                    i7 = R.id.vEtContainer;
                                                    FrameLayout frameLayout2 = (FrameLayout) m20.g0(inflate4, R.id.vEtContainer);
                                                    if (frameLayout2 != null) {
                                                        i7 = R.id.vHideSystemApps;
                                                        LinearLayout linearLayout6 = (LinearLayout) m20.g0(inflate4, R.id.vHideSystemApps);
                                                        if (linearLayout6 != null) {
                                                            i7 = R.id.vNoApp;
                                                            LinearLayout linearLayout7 = (LinearLayout) m20.g0(inflate4, R.id.vNoApp);
                                                            if (linearLayout7 != null) {
                                                                i7 = R.id.vNoResult;
                                                                LinearLayout linearLayout8 = (LinearLayout) m20.g0(inflate4, R.id.vNoResult);
                                                                if (linearLayout8 != null) {
                                                                    return new k5((NavigationBarContentConstraintLayout) inflate4, xEditText, recyclerView2, switchCompat4, toolbar2, textView10, textView11, textView12, textView13, imageView, frameLayout2, linearLayout6, linearLayout7, linearLayout8);
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
                        } else {
                            i7 = R.id.switchSystemApps;
                        }
                    } else {
                        i7 = R.id.list;
                    }
                } else {
                    i7 = R.id.et;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i7)));
            case 4:
                View inflate5 = dnVar.getLayoutInflater().inflate(R.layout.activity_split_tunneling, (ViewGroup) null, false);
                View g03 = m20.g0(inflate5, R.id.flag_divider);
                if (g03 != null) {
                    SwitchCompat switchCompat5 = (SwitchCompat) m20.g0(inflate5, R.id.switchNotUseVpn);
                    if (switchCompat5 != null) {
                        SwitchCompat switchCompat6 = (SwitchCompat) m20.g0(inflate5, R.id.switchUseVpn);
                        if (switchCompat6 != null) {
                            Toolbar toolbar3 = (Toolbar) m20.g0(inflate5, R.id.toolbar);
                            if (toolbar3 != null) {
                                i7 = R.id.tvNotUseVpn;
                                TextView textView14 = (TextView) m20.g0(inflate5, R.id.tvNotUseVpn);
                                if (textView14 != null) {
                                    i7 = R.id.tvNotUseVpnDetail;
                                    TextView textView15 = (TextView) m20.g0(inflate5, R.id.tvNotUseVpnDetail);
                                    if (textView15 != null) {
                                        i7 = R.id.tvSettingNotUseVPN;
                                        TextView textView16 = (TextView) m20.g0(inflate5, R.id.tvSettingNotUseVPN);
                                        if (textView16 != null) {
                                            i7 = R.id.tvSettingUseVPN;
                                            TextView textView17 = (TextView) m20.g0(inflate5, R.id.tvSettingUseVPN);
                                            if (textView17 != null) {
                                                i7 = R.id.tvSwitchTips;
                                                TextView textView18 = (TextView) m20.g0(inflate5, R.id.tvSwitchTips);
                                                if (textView18 != null) {
                                                    i7 = R.id.tvUseVpn;
                                                    TextView textView19 = (TextView) m20.g0(inflate5, R.id.tvUseVpn);
                                                    if (textView19 != null) {
                                                        i7 = R.id.tvUseVpnDetail;
                                                        TextView textView20 = (TextView) m20.g0(inflate5, R.id.tvUseVpnDetail);
                                                        if (textView20 != null) {
                                                            i7 = R.id.vDivider;
                                                            View g04 = m20.g0(inflate5, R.id.vDivider);
                                                            if (g04 != null) {
                                                                i7 = R.id.vDivider2;
                                                                View g05 = m20.g0(inflate5, R.id.vDivider2);
                                                                if (g05 != null) {
                                                                    i7 = R.id.vNotUsingVpn;
                                                                    LinearLayout linearLayout9 = (LinearLayout) m20.g0(inflate5, R.id.vNotUsingVpn);
                                                                    if (linearLayout9 != null) {
                                                                        i7 = R.id.vUsingVpn;
                                                                        LinearLayout linearLayout10 = (LinearLayout) m20.g0(inflate5, R.id.vUsingVpn);
                                                                        if (linearLayout10 != null) {
                                                                            return new k7((NavigationBarContentConstraintLayout) inflate5, g03, switchCompat5, switchCompat6, toolbar3, textView14, textView15, textView16, textView17, textView18, textView19, textView20, g04, g05, linearLayout9, linearLayout10);
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
                        } else {
                            i7 = R.id.switchUseVpn;
                        }
                    } else {
                        i7 = R.id.switchNotUseVpn;
                    }
                } else {
                    i7 = R.id.flag_divider;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate5.getResources().getResourceName(i7)));
            case 5:
            case 6:
            default:
                return e();
            case 7:
                View inflate6 = dnVar.getLayoutInflater().inflate(R.layout.chat_activity, (ViewGroup) null, false);
                View g06 = m20.g0(inflate6, R.id.actionLayoutChange);
                if (g06 == null) {
                    i = R.id.actionLayoutChange;
                } else if (((Barrier) m20.g0(inflate6, R.id.bottomBarrier)) != null) {
                    ImageView imageView2 = (ImageView) m20.g0(inflate6, R.id.bottomSpace);
                    if (imageView2 != null) {
                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) m20.g0(inflate6, R.id.btnBack);
                        if (appCompatImageView4 != null) {
                            AppCompatImageView appCompatImageView5 = (AppCompatImageView) m20.g0(inflate6, R.id.btnBotCommand);
                            if (appCompatImageView5 != null) {
                                AppCompatImageView appCompatImageView6 = (AppCompatImageView) m20.g0(inflate6, R.id.btnChooseImg);
                                if (appCompatImageView6 != null) {
                                    AppCompatImageView appCompatImageView7 = (AppCompatImageView) m20.g0(inflate6, R.id.btnClearHistory);
                                    if (appCompatImageView7 != null) {
                                        AppCompatImageView appCompatImageView8 = (AppCompatImageView) m20.g0(inflate6, R.id.btnSend);
                                        if (appCompatImageView8 != null) {
                                            XTextViewNew xTextViewNew = (XTextViewNew) m20.g0(inflate6, R.id.btnTipClose);
                                            if (xTextViewNew != null) {
                                                View g07 = m20.g0(inflate6, R.id.divider);
                                                if (g07 != null) {
                                                    i = R.id.etContent;
                                                    AppCompatEditText appCompatEditText = (AppCompatEditText) m20.g0(inflate6, R.id.etContent);
                                                    if (appCompatEditText != null) {
                                                        i = R.id.llInputPanel;
                                                        LinearLayout linearLayout11 = (LinearLayout) m20.g0(inflate6, R.id.llInputPanel);
                                                        if (linearLayout11 != null) {
                                                            i = R.id.llTipError;
                                                            LinearLayout linearLayout12 = (LinearLayout) m20.g0(inflate6, R.id.llTipError);
                                                            if (linearLayout12 != null) {
                                                                i = R.id.mList;
                                                                RecyclerView recyclerView3 = (RecyclerView) m20.g0(inflate6, R.id.mList);
                                                                if (recyclerView3 != null) {
                                                                    NavigationBarContentConstraintLayout navigationBarContentConstraintLayout2 = (NavigationBarContentConstraintLayout) inflate6;
                                                                    i = R.id.rvBotList;
                                                                    RecyclerView recyclerView4 = (RecyclerView) m20.g0(inflate6, R.id.rvBotList);
                                                                    if (recyclerView4 != null) {
                                                                        i = R.id.tipContainer;
                                                                        FrameLayout frameLayout3 = (FrameLayout) m20.g0(inflate6, R.id.tipContainer);
                                                                        if (frameLayout3 != null) {
                                                                            i = R.id.tv_tip_text;
                                                                            if (((XTextViewNew) m20.g0(inflate6, R.id.tv_tip_text)) != null) {
                                                                                TextView textView21 = (TextView) m20.g0(inflate6, R.id.tvTitle);
                                                                                if (textView21 != null) {
                                                                                    return new zy(navigationBarContentConstraintLayout2, g06, imageView2, appCompatImageView4, appCompatImageView5, appCompatImageView6, appCompatImageView7, appCompatImageView8, xTextViewNew, g07, appCompatEditText, linearLayout11, linearLayout12, recyclerView3, recyclerView4, frameLayout3, textView21);
                                                                                }
                                                                                i = R.id.tvTitle;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i = R.id.divider;
                                                }
                                            } else {
                                                i = R.id.btnTipClose;
                                            }
                                        } else {
                                            i = R.id.btnSend;
                                        }
                                    } else {
                                        i = R.id.btnClearHistory;
                                    }
                                } else {
                                    i = R.id.btnChooseImg;
                                }
                            } else {
                                i = R.id.btnBotCommand;
                            }
                        } else {
                            i = R.id.btnBack;
                        }
                    } else {
                        i = R.id.bottomSpace;
                    }
                } else {
                    i = R.id.bottomBarrier;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate6.getResources().getResourceName(i)));
            case 8:
                View inflate7 = dnVar.getLayoutInflater().inflate(R.layout.activity_protocol, (ViewGroup) null, false);
                if (((AppCompatImageView) m20.g0(inflate7, R.id.iv_close)) != null) {
                    RecyclerView recyclerView5 = (RecyclerView) m20.g0(inflate7, R.id.protocol_list);
                    if (recyclerView5 != null) {
                        Toolbar toolbar4 = (Toolbar) m20.g0(inflate7, R.id.toolbar);
                        if (toolbar4 != null) {
                            i7 = R.id.toolbarGroup;
                            if (((Barrier) m20.g0(inflate7, R.id.toolbarGroup)) != null) {
                                return new n6((NavigationBarContentConstraintLayout) inflate7, recyclerView5, toolbar4);
                            }
                        }
                    } else {
                        i7 = R.id.protocol_list;
                    }
                } else {
                    i7 = R.id.iv_close;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate7.getResources().getResourceName(i7)));
            case 9:
                View inflate8 = dnVar.getLayoutInflater().inflate(R.layout.activity_protocol_settings, (ViewGroup) null, false);
                int i9 = R.id.add_domain_apply_btn;
                Button button = (Button) m20.g0(inflate8, R.id.add_domain_apply_btn);
                if (button != null) {
                    i9 = R.id.add_domain_et;
                    EditText editText = (EditText) m20.g0(inflate8, R.id.add_domain_et);
                    if (editText != null) {
                        i9 = R.id.ivArrow;
                        ImageView imageView3 = (ImageView) m20.g0(inflate8, R.id.ivArrow);
                        if (imageView3 != null) {
                            Toolbar toolbar5 = (Toolbar) m20.g0(inflate8, R.id.toolbar);
                            if (toolbar5 != null) {
                                i9 = R.id.tvDesc;
                                TextView textView22 = (TextView) m20.g0(inflate8, R.id.tvDesc);
                                if (textView22 != null) {
                                    i9 = R.id.tvDomainDesc;
                                    TextView textView23 = (TextView) m20.g0(inflate8, R.id.tvDomainDesc);
                                    if (textView23 != null) {
                                        i9 = R.id.tvDomainTitle;
                                        TextView textView24 = (TextView) m20.g0(inflate8, R.id.tvDomainTitle);
                                        if (textView24 != null) {
                                            i9 = R.id.tv_err_info;
                                            TextView textView25 = (TextView) m20.g0(inflate8, R.id.tv_err_info);
                                            if (textView25 != null) {
                                                i9 = R.id.tv_site;
                                                TextView textView26 = (TextView) m20.g0(inflate8, R.id.tv_site);
                                                if (textView26 != null) {
                                                    TextView textView27 = (TextView) m20.g0(inflate8, R.id.tvTitle);
                                                    if (textView27 != null) {
                                                        i9 = R.id.vDomain;
                                                        if (((LinearLayout) m20.g0(inflate8, R.id.vDomain)) != null) {
                                                            i9 = R.id.vProtocolDomain;
                                                            LinearLayout linearLayout13 = (LinearLayout) m20.g0(inflate8, R.id.vProtocolDomain);
                                                            if (linearLayout13 != null) {
                                                                i9 = R.id.vProtocolE;
                                                                LinearLayout linearLayout14 = (LinearLayout) m20.g0(inflate8, R.id.vProtocolE);
                                                                if (linearLayout14 != null) {
                                                                    i9 = R.id.vTlsDomain;
                                                                    LinearLayout linearLayout15 = (LinearLayout) m20.g0(inflate8, R.id.vTlsDomain);
                                                                    if (linearLayout15 != null) {
                                                                        return new o6((LinearLayout) inflate8, button, editText, imageView3, toolbar5, textView22, textView23, textView24, textView25, textView26, textView27, linearLayout13, linearLayout14, linearLayout15);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i9 = R.id.tvTitle;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                i9 = R.id.toolbar;
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate8.getResources().getResourceName(i9)));
            case 10:
                View inflate9 = dnVar.getLayoutInflater().inflate(R.layout.activity_guide_to_purchase, (ViewGroup) null, false);
                AppCompatImageView appCompatImageView9 = (AppCompatImageView) m20.g0(inflate9, R.id.btnClose);
                if (appCompatImageView9 != null) {
                    Button button2 = (Button) m20.g0(inflate9, R.id.btn_subscribe);
                    if (button2 != null) {
                        LinearLayout linearLayout16 = (LinearLayout) m20.g0(inflate9, R.id.calcHeight1);
                        if (linearLayout16 != null) {
                            LinearLayout linearLayout17 = (LinearLayout) m20.g0(inflate9, R.id.calcHeight2);
                            if (linearLayout17 == null) {
                                i2 = R.id.calcHeight2;
                            } else if (((Space) m20.g0(inflate9, R.id.divider)) == null) {
                                i2 = R.id.divider;
                            } else if (((BorderLinearLayout) m20.g0(inflate9, R.id.feature1)) == null) {
                                i2 = R.id.feature1;
                            } else if (((BorderLinearLayout) m20.g0(inflate9, R.id.feature2)) == null) {
                                i2 = R.id.feature2;
                            } else if (((BorderLinearLayout) m20.g0(inflate9, R.id.feature3)) == null) {
                                i2 = R.id.feature3;
                            } else if (((BorderLinearLayout) m20.g0(inflate9, R.id.feature4)) != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) m20.g0(inflate9, R.id.groupFeature);
                                if (constraintLayout != null) {
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) m20.g0(inflate9, R.id.itemMonthly);
                                    if (constraintLayout2 != null) {
                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) m20.g0(inflate9, R.id.itemYearly);
                                        if (constraintLayout3 != null) {
                                            LinearLayout linearLayout18 = (LinearLayout) m20.g0(inflate9, R.id.mainContainer);
                                            if (linearLayout18 == null) {
                                                i2 = R.id.mainContainer;
                                            } else if (((LinearLayout) m20.g0(inflate9, R.id.mainContainer2)) != null) {
                                                FrameLayout frameLayout4 = (FrameLayout) inflate9;
                                                i2 = R.id.tmpSpace1;
                                                if (((Space) m20.g0(inflate9, R.id.tmpSpace1)) != null) {
                                                    if (((Space) m20.g0(inflate9, R.id.tmpSpace2)) == null) {
                                                        i2 = R.id.tmpSpace2;
                                                    } else if (((Space) m20.g0(inflate9, R.id.tmpSpace3)) != null) {
                                                        i2 = R.id.tmpSpace4;
                                                        if (((Space) m20.g0(inflate9, R.id.tmpSpace4)) != null) {
                                                            i2 = R.id.tmpSpace5;
                                                            if (((Space) m20.g0(inflate9, R.id.tmpSpace5)) != null) {
                                                                i2 = R.id.tmpSpace6;
                                                                if (((Space) m20.g0(inflate9, R.id.tmpSpace6)) != null) {
                                                                    i2 = R.id.toPrivacyPolicy;
                                                                    TextView textView28 = (TextView) m20.g0(inflate9, R.id.toPrivacyPolicy);
                                                                    if (textView28 != null) {
                                                                        i2 = R.id.toTermOfServices;
                                                                        TextView textView29 = (TextView) m20.g0(inflate9, R.id.toTermOfServices);
                                                                        if (textView29 != null) {
                                                                            TextView textView30 = (TextView) m20.g0(inflate9, R.id.tvBestValue);
                                                                            if (textView30 != null) {
                                                                                i2 = R.id.tvDividerFlag;
                                                                                TextView textView31 = (TextView) m20.g0(inflate9, R.id.tvDividerFlag);
                                                                                if (textView31 != null) {
                                                                                    TextView textView32 = (TextView) m20.g0(inflate9, R.id.tvMonthlyName);
                                                                                    if (textView32 != null) {
                                                                                        i2 = R.id.tvMonthlyPrice;
                                                                                        TextView textView33 = (TextView) m20.g0(inflate9, R.id.tvMonthlyPrice);
                                                                                        if (textView33 != null) {
                                                                                            TextView textView34 = (TextView) m20.g0(inflate9, R.id.tv_restore_purchase);
                                                                                            if (textView34 != null) {
                                                                                                i2 = R.id.tv_sign_in;
                                                                                                TextView textView35 = (TextView) m20.g0(inflate9, R.id.tv_sign_in);
                                                                                                if (textView35 != null) {
                                                                                                    i2 = R.id.tvSubTitle;
                                                                                                    TextView textView36 = (TextView) m20.g0(inflate9, R.id.tvSubTitle);
                                                                                                    if (textView36 != null) {
                                                                                                        TextView textView37 = (TextView) m20.g0(inflate9, R.id.tvTitle);
                                                                                                        if (textView37 != null) {
                                                                                                            i2 = R.id.tvYearlyName;
                                                                                                            TextView textView38 = (TextView) m20.g0(inflate9, R.id.tvYearlyName);
                                                                                                            if (textView38 != null) {
                                                                                                                TextView textView39 = (TextView) m20.g0(inflate9, R.id.tvYearlyPrice);
                                                                                                                if (textView39 != null) {
                                                                                                                    i2 = R.id.vw_dot;
                                                                                                                    View g08 = m20.g0(inflate9, R.id.vw_dot);
                                                                                                                    if (g08 != null) {
                                                                                                                        return new i6(frameLayout4, appCompatImageView9, button2, linearLayout16, linearLayout17, constraintLayout, constraintLayout2, constraintLayout3, linearLayout18, frameLayout4, textView28, textView29, textView30, textView31, textView32, textView33, textView34, textView35, textView36, textView37, textView38, textView39, g08);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i2 = R.id.tvYearlyPrice;
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            i2 = R.id.tvTitle;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                i2 = R.id.tv_restore_purchase;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        i2 = R.id.tvMonthlyName;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                i2 = R.id.tvBestValue;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i2 = R.id.tmpSpace3;
                                                    }
                                                }
                                            } else {
                                                i2 = R.id.mainContainer2;
                                            }
                                        } else {
                                            i2 = R.id.itemYearly;
                                        }
                                    } else {
                                        i2 = R.id.itemMonthly;
                                    }
                                } else {
                                    i2 = R.id.groupFeature;
                                }
                            } else {
                                i2 = R.id.feature4;
                            }
                        } else {
                            i2 = R.id.calcHeight1;
                        }
                    } else {
                        i2 = R.id.btn_subscribe;
                    }
                } else {
                    i2 = R.id.btnClose;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate9.getResources().getResourceName(i2)));
            case 11:
                View inflate10 = dnVar.getLayoutInflater().inflate(R.layout.activity_guide_to_purchase_new1, (ViewGroup) null, false);
                AppCompatImageView appCompatImageView10 = (AppCompatImageView) m20.g0(inflate10, R.id.btnClose);
                if (appCompatImageView10 != null) {
                    Button button3 = (Button) m20.g0(inflate10, R.id.btn_subscribe);
                    if (button3 != null) {
                        LinearLayout linearLayout19 = (LinearLayout) m20.g0(inflate10, R.id.calcHeight1);
                        if (linearLayout19 != null) {
                            LinearLayout linearLayout20 = (LinearLayout) m20.g0(inflate10, R.id.calcHeight2);
                            if (linearLayout20 == null) {
                                i3 = R.id.calcHeight2;
                            } else if (((Space) m20.g0(inflate10, R.id.divider)) == null) {
                                i3 = R.id.divider;
                            } else if (((BorderLinearLayout) m20.g0(inflate10, R.id.feature1)) == null) {
                                i3 = R.id.feature1;
                            } else if (((BorderLinearLayout) m20.g0(inflate10, R.id.feature2)) == null) {
                                i3 = R.id.feature2;
                            } else if (((BorderLinearLayout) m20.g0(inflate10, R.id.feature3)) == null) {
                                i3 = R.id.feature3;
                            } else if (((BorderLinearLayout) m20.g0(inflate10, R.id.feature4)) != null) {
                                ConstraintLayout constraintLayout4 = (ConstraintLayout) m20.g0(inflate10, R.id.groupFeature);
                                if (constraintLayout4 != null) {
                                    ConstraintLayout constraintLayout5 = (ConstraintLayout) m20.g0(inflate10, R.id.itemMonthly);
                                    if (constraintLayout5 != null) {
                                        ConstraintLayout constraintLayout6 = (ConstraintLayout) m20.g0(inflate10, R.id.itemYearly);
                                        if (constraintLayout6 != null) {
                                            LinearLayout linearLayout21 = (LinearLayout) m20.g0(inflate10, R.id.mainContainer);
                                            if (linearLayout21 == null) {
                                                i3 = R.id.mainContainer;
                                            } else if (((LinearLayout) m20.g0(inflate10, R.id.mainContainer2)) != null) {
                                                FrameLayout frameLayout5 = (FrameLayout) inflate10;
                                                if (((Space) m20.g0(inflate10, R.id.tmpSpace1)) == null) {
                                                    i3 = R.id.tmpSpace1;
                                                } else if (((Space) m20.g0(inflate10, R.id.tmpSpace2)) == null) {
                                                    i3 = R.id.tmpSpace2;
                                                } else if (((Space) m20.g0(inflate10, R.id.tmpSpace3)) != null) {
                                                    i3 = R.id.tmpSpace4;
                                                    if (((Space) m20.g0(inflate10, R.id.tmpSpace4)) != null) {
                                                        i3 = R.id.tmpSpace5;
                                                        if (((Space) m20.g0(inflate10, R.id.tmpSpace5)) != null) {
                                                            i3 = R.id.tmpSpace6;
                                                            if (((Space) m20.g0(inflate10, R.id.tmpSpace6)) != null) {
                                                                i3 = R.id.toPrivacyPolicy;
                                                                TextView textView40 = (TextView) m20.g0(inflate10, R.id.toPrivacyPolicy);
                                                                if (textView40 != null) {
                                                                    i3 = R.id.toTermOfServices;
                                                                    TextView textView41 = (TextView) m20.g0(inflate10, R.id.toTermOfServices);
                                                                    if (textView41 != null) {
                                                                        TextView textView42 = (TextView) m20.g0(inflate10, R.id.tvBestValue);
                                                                        if (textView42 != null) {
                                                                            i3 = R.id.tvDividerFlag;
                                                                            TextView textView43 = (TextView) m20.g0(inflate10, R.id.tvDividerFlag);
                                                                            if (textView43 != null) {
                                                                                TextView textView44 = (TextView) m20.g0(inflate10, R.id.tvMonthlyName);
                                                                                if (textView44 != null) {
                                                                                    TextView textView45 = (TextView) m20.g0(inflate10, R.id.tvMonthlyPrice);
                                                                                    if (textView45 != null) {
                                                                                        TextView textView46 = (TextView) m20.g0(inflate10, R.id.tv_restore_purchase);
                                                                                        if (textView46 != null) {
                                                                                            TextView textView47 = (TextView) m20.g0(inflate10, R.id.tv_sign_in);
                                                                                            if (textView47 != null) {
                                                                                                i3 = R.id.tvSubTitle;
                                                                                                TextView textView48 = (TextView) m20.g0(inflate10, R.id.tvSubTitle);
                                                                                                if (textView48 != null) {
                                                                                                    if (((ImageView) m20.g0(inflate10, R.id.tvTitle)) != null) {
                                                                                                        TextView textView49 = (TextView) m20.g0(inflate10, R.id.tvYearlyName);
                                                                                                        if (textView49 != null) {
                                                                                                            TextView textView50 = (TextView) m20.g0(inflate10, R.id.tvYearlyPrice);
                                                                                                            if (textView50 != null) {
                                                                                                                View g09 = m20.g0(inflate10, R.id.vw_dot);
                                                                                                                if (g09 != null) {
                                                                                                                    return new j6(frameLayout5, appCompatImageView10, button3, linearLayout19, linearLayout20, constraintLayout4, constraintLayout5, constraintLayout6, linearLayout21, frameLayout5, textView40, textView41, textView42, textView43, textView44, textView45, textView46, textView47, textView48, textView49, textView50, g09);
                                                                                                                }
                                                                                                                i3 = R.id.vw_dot;
                                                                                                            } else {
                                                                                                                i3 = R.id.tvYearlyPrice;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i3 = R.id.tvYearlyName;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i3 = R.id.tvTitle;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                i3 = R.id.tv_sign_in;
                                                                                            }
                                                                                        } else {
                                                                                            i3 = R.id.tv_restore_purchase;
                                                                                        }
                                                                                    } else {
                                                                                        i3 = R.id.tvMonthlyPrice;
                                                                                    }
                                                                                } else {
                                                                                    i3 = R.id.tvMonthlyName;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            i3 = R.id.tvBestValue;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i3 = R.id.tmpSpace3;
                                                }
                                            } else {
                                                i3 = R.id.mainContainer2;
                                            }
                                        } else {
                                            i3 = R.id.itemYearly;
                                        }
                                    } else {
                                        i3 = R.id.itemMonthly;
                                    }
                                } else {
                                    i3 = R.id.groupFeature;
                                }
                            } else {
                                i3 = R.id.feature4;
                            }
                        } else {
                            i3 = R.id.calcHeight1;
                        }
                    } else {
                        i3 = R.id.btn_subscribe;
                    }
                } else {
                    i3 = R.id.btnClose;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate10.getResources().getResourceName(i3)));
            case 12:
                View inflate11 = dnVar.getLayoutInflater().inflate(R.layout.activity_guide_to_purchase_new2, (ViewGroup) null, false);
                AppCompatImageView appCompatImageView11 = (AppCompatImageView) m20.g0(inflate11, R.id.btnClose);
                if (appCompatImageView11 != null) {
                    Button button4 = (Button) m20.g0(inflate11, R.id.btn_subscribe);
                    if (button4 == null) {
                        i4 = R.id.btn_subscribe;
                    } else if (((LinearLayout) m20.g0(inflate11, R.id.calcHeight1)) == null) {
                        i4 = R.id.calcHeight1;
                    } else if (((LinearLayout) m20.g0(inflate11, R.id.calcHeight2)) == null) {
                        i4 = R.id.calcHeight2;
                    } else if (((Space) m20.g0(inflate11, R.id.divider)) == null) {
                        i4 = R.id.divider;
                    } else if (((BorderLinearLayout) m20.g0(inflate11, R.id.feature1)) == null) {
                        i4 = R.id.feature1;
                    } else if (((BorderLinearLayout) m20.g0(inflate11, R.id.feature2)) == null) {
                        i4 = R.id.feature2;
                    } else if (((BorderLinearLayout) m20.g0(inflate11, R.id.feature3)) == null) {
                        i4 = R.id.feature3;
                    } else if (((BorderLinearLayout) m20.g0(inflate11, R.id.feature4)) != null) {
                        ConstraintLayout constraintLayout7 = (ConstraintLayout) m20.g0(inflate11, R.id.groupFeature);
                        if (constraintLayout7 != null) {
                            ConstraintLayout constraintLayout8 = (ConstraintLayout) m20.g0(inflate11, R.id.itemMonthly);
                            if (constraintLayout8 != null) {
                                ConstraintLayout constraintLayout9 = (ConstraintLayout) m20.g0(inflate11, R.id.itemYearly);
                                if (constraintLayout9 != null) {
                                    LinearLayout linearLayout22 = (LinearLayout) m20.g0(inflate11, R.id.ll_bottom_panel);
                                    if (linearLayout22 != null) {
                                        LinearLayout linearLayout23 = (LinearLayout) m20.g0(inflate11, R.id.llCommentsGroup);
                                        if (linearLayout23 == null) {
                                            i4 = R.id.llCommentsGroup;
                                        } else if (((LinearLayout) m20.g0(inflate11, R.id.mainContainer)) != null) {
                                            View g010 = m20.g0(inflate11, R.id.premiumCompare);
                                            if (g010 != null) {
                                                int i10 = R.id.columnFree;
                                                LinearLayout linearLayout24 = (LinearLayout) m20.g0(g010, R.id.columnFree);
                                                if (linearLayout24 != null) {
                                                    i10 = R.id.columnPremium;
                                                    LinearLayout linearLayout25 = (LinearLayout) m20.g0(g010, R.id.columnPremium);
                                                    if (linearLayout25 != null) {
                                                        i10 = R.id.columnType;
                                                        LinearLayout linearLayout26 = (LinearLayout) m20.g0(g010, R.id.columnType);
                                                        if (linearLayout26 != null) {
                                                            x30 x30Var = new x30((LinearLayout) g010, linearLayout24, linearLayout25, linearLayout26, 0);
                                                            FrameLayout frameLayout6 = (FrameLayout) inflate11;
                                                            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) m20.g0(inflate11, R.id.svCommentsWrapper);
                                                            if (horizontalScrollView == null) {
                                                                i4 = R.id.svCommentsWrapper;
                                                            } else if (((Space) m20.g0(inflate11, R.id.tmpSpace1)) == null) {
                                                                i4 = R.id.tmpSpace1;
                                                            } else if (((Space) m20.g0(inflate11, R.id.tmpSpace2)) == null) {
                                                                i4 = R.id.tmpSpace2;
                                                            } else if (((Space) m20.g0(inflate11, R.id.tmpSpace3)) == null) {
                                                                i4 = R.id.tmpSpace3;
                                                            } else if (((Space) m20.g0(inflate11, R.id.tmpSpace5)) == null) {
                                                                i4 = R.id.tmpSpace5;
                                                            } else if (((Space) m20.g0(inflate11, R.id.tmpSpace6)) != null) {
                                                                TextView textView51 = (TextView) m20.g0(inflate11, R.id.toPrivacyPolicy);
                                                                if (textView51 != null) {
                                                                    TextView textView52 = (TextView) m20.g0(inflate11, R.id.toTermOfServices);
                                                                    if (textView52 != null) {
                                                                        TextView textView53 = (TextView) m20.g0(inflate11, R.id.tvBestValue);
                                                                        if (textView53 != null) {
                                                                            TextView textView54 = (TextView) m20.g0(inflate11, R.id.tvCommentTitle);
                                                                            if (textView54 != null) {
                                                                                TextView textView55 = (TextView) m20.g0(inflate11, R.id.tvCompareTitle);
                                                                                if (textView55 != null) {
                                                                                    TextView textView56 = (TextView) m20.g0(inflate11, R.id.tvDividerFlag);
                                                                                    if (textView56 != null) {
                                                                                        TextView textView57 = (TextView) m20.g0(inflate11, R.id.tvMonthlyName);
                                                                                        if (textView57 != null) {
                                                                                            TextView textView58 = (TextView) m20.g0(inflate11, R.id.tvMonthlyPrice);
                                                                                            if (textView58 != null) {
                                                                                                TextView textView59 = (TextView) m20.g0(inflate11, R.id.tv_restore_purchase);
                                                                                                if (textView59 != null) {
                                                                                                    TextView textView60 = (TextView) m20.g0(inflate11, R.id.tvSelectedItem);
                                                                                                    if (textView60 != null) {
                                                                                                        TextView textView61 = (TextView) m20.g0(inflate11, R.id.tv_sign_in);
                                                                                                        if (textView61 != null) {
                                                                                                            TextView textView62 = (TextView) m20.g0(inflate11, R.id.tvSubTitle);
                                                                                                            if (textView62 == null) {
                                                                                                                i4 = R.id.tvSubTitle;
                                                                                                            } else if (((ImageView) m20.g0(inflate11, R.id.tvTitle)) != null) {
                                                                                                                TextView textView63 = (TextView) m20.g0(inflate11, R.id.tvYearlyName);
                                                                                                                if (textView63 != null) {
                                                                                                                    TextView textView64 = (TextView) m20.g0(inflate11, R.id.tvYearlyPrice);
                                                                                                                    if (textView64 != null) {
                                                                                                                        View g011 = m20.g0(inflate11, R.id.vw_dot);
                                                                                                                        if (g011 != null) {
                                                                                                                            return new k6(frameLayout6, appCompatImageView11, button4, constraintLayout7, constraintLayout8, constraintLayout9, linearLayout22, linearLayout23, x30Var, frameLayout6, horizontalScrollView, textView51, textView52, textView53, textView54, textView55, textView56, textView57, textView58, textView59, textView60, textView61, textView62, textView63, textView64, g011);
                                                                                                                        }
                                                                                                                        i4 = R.id.vw_dot;
                                                                                                                    } else {
                                                                                                                        i4 = R.id.tvYearlyPrice;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i4 = R.id.tvYearlyName;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i4 = R.id.tvTitle;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i4 = R.id.tv_sign_in;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i4 = R.id.tvSelectedItem;
                                                                                                    }
                                                                                                } else {
                                                                                                    i4 = R.id.tv_restore_purchase;
                                                                                                }
                                                                                            } else {
                                                                                                i4 = R.id.tvMonthlyPrice;
                                                                                            }
                                                                                        } else {
                                                                                            i4 = R.id.tvMonthlyName;
                                                                                        }
                                                                                    } else {
                                                                                        i4 = R.id.tvDividerFlag;
                                                                                    }
                                                                                } else {
                                                                                    i4 = R.id.tvCompareTitle;
                                                                                }
                                                                            } else {
                                                                                i4 = R.id.tvCommentTitle;
                                                                            }
                                                                        } else {
                                                                            i4 = R.id.tvBestValue;
                                                                        }
                                                                    } else {
                                                                        i4 = R.id.toTermOfServices;
                                                                    }
                                                                } else {
                                                                    i4 = R.id.toPrivacyPolicy;
                                                                }
                                                            } else {
                                                                i4 = R.id.tmpSpace6;
                                                            }
                                                        }
                                                    }
                                                }
                                                throw new NullPointerException("Missing required view with ID: ".concat(g010.getResources().getResourceName(i10)));
                                            }
                                            i4 = R.id.premiumCompare;
                                        } else {
                                            i4 = R.id.mainContainer;
                                        }
                                    } else {
                                        i4 = R.id.ll_bottom_panel;
                                    }
                                } else {
                                    i4 = R.id.itemYearly;
                                }
                            } else {
                                i4 = R.id.itemMonthly;
                            }
                        } else {
                            i4 = R.id.groupFeature;
                        }
                    } else {
                        i4 = R.id.feature4;
                    }
                } else {
                    i4 = R.id.btnClose;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate11.getResources().getResourceName(i4)));
            case 13:
                View inflate12 = dnVar.getLayoutInflater().inflate(R.layout.activity_start_app_guide_to_purchase, (ViewGroup) null, false);
                Button button5 = (Button) m20.g0(inflate12, R.id.btn_subscribe);
                if (button5 != null) {
                    TextView textView65 = (TextView) m20.g0(inflate12, R.id.btnUseWithAds);
                    if (textView65 == null) {
                        i5 = R.id.btnUseWithAds;
                    } else if (((Space) m20.g0(inflate12, R.id.divider)) == null) {
                        i5 = R.id.divider;
                    } else if (((ImageView) m20.g0(inflate12, R.id.img_guide)) != null) {
                        ConstraintLayout constraintLayout10 = (ConstraintLayout) m20.g0(inflate12, R.id.itemMonthly);
                        if (constraintLayout10 != null) {
                            ConstraintLayout constraintLayout11 = (ConstraintLayout) m20.g0(inflate12, R.id.itemYearly);
                            if (constraintLayout11 != null) {
                                LinearLayout linearLayout27 = (LinearLayout) m20.g0(inflate12, R.id.mainContainer);
                                if (linearLayout27 != null) {
                                    LinearLayout linearLayout28 = (LinearLayout) m20.g0(inflate12, R.id.originLayout1);
                                    if (linearLayout28 == null) {
                                        i5 = R.id.originLayout1;
                                    } else if (((Space) m20.g0(inflate12, R.id.tmpSpace2)) == null) {
                                        i5 = R.id.tmpSpace2;
                                    } else if (((Space) m20.g0(inflate12, R.id.tmpSpace3)) == null) {
                                        i5 = R.id.tmpSpace3;
                                    } else if (((Space) m20.g0(inflate12, R.id.tmpSpace4)) != null) {
                                        TextView textView66 = (TextView) m20.g0(inflate12, R.id.tvBestValue);
                                        if (textView66 == null) {
                                            i5 = R.id.tvBestValue;
                                        } else if (((XTextViewNew) m20.g0(inflate12, R.id.tv_desc)) != null) {
                                            TextView textView67 = (TextView) m20.g0(inflate12, R.id.tvMonthlyName);
                                            if (textView67 != null) {
                                                TextView textView68 = (TextView) m20.g0(inflate12, R.id.tvMonthlyPrice);
                                                if (textView68 != null) {
                                                    TextView textView69 = (TextView) m20.g0(inflate12, R.id.tvPurchaseRule);
                                                    if (textView69 != null) {
                                                        TextView textView70 = (TextView) m20.g0(inflate12, R.id.tv_restore_purchase);
                                                        if (textView70 != null) {
                                                            TextView textView71 = (TextView) m20.g0(inflate12, R.id.tv_sign_in);
                                                            if (textView71 == null) {
                                                                i5 = R.id.tv_sign_in;
                                                            } else if (((XTextViewNew) m20.g0(inflate12, R.id.tvTitle)) != null) {
                                                                TextView textView72 = (TextView) m20.g0(inflate12, R.id.tvYearlyName);
                                                                if (textView72 != null) {
                                                                    TextView textView73 = (TextView) m20.g0(inflate12, R.id.tvYearlyPrice);
                                                                    if (textView73 != null) {
                                                                        View g012 = m20.g0(inflate12, R.id.vw_dot);
                                                                        if (g012 != null) {
                                                                            return new l7((FrameLayout) inflate12, button5, textView65, constraintLayout10, constraintLayout11, linearLayout27, linearLayout28, textView66, textView67, textView68, textView69, textView70, textView71, textView72, textView73, g012);
                                                                        }
                                                                        i5 = R.id.vw_dot;
                                                                    } else {
                                                                        i5 = R.id.tvYearlyPrice;
                                                                    }
                                                                } else {
                                                                    i5 = R.id.tvYearlyName;
                                                                }
                                                            } else {
                                                                i5 = R.id.tvTitle;
                                                            }
                                                        } else {
                                                            i5 = R.id.tv_restore_purchase;
                                                        }
                                                    } else {
                                                        i5 = R.id.tvPurchaseRule;
                                                    }
                                                } else {
                                                    i5 = R.id.tvMonthlyPrice;
                                                }
                                            } else {
                                                i5 = R.id.tvMonthlyName;
                                            }
                                        } else {
                                            i5 = R.id.tv_desc;
                                        }
                                    } else {
                                        i5 = R.id.tmpSpace4;
                                    }
                                } else {
                                    i5 = R.id.mainContainer;
                                }
                            } else {
                                i5 = R.id.itemYearly;
                            }
                        } else {
                            i5 = R.id.itemMonthly;
                        }
                    } else {
                        i5 = R.id.img_guide;
                    }
                } else {
                    i5 = R.id.btn_subscribe;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate12.getResources().getResourceName(i5)));
            case 14:
                View inflate13 = dnVar.getLayoutInflater().inflate(R.layout.activity_apply_quick_conn, (ViewGroup) null, false);
                View g013 = m20.g0(inflate13, R.id.divider_1);
                if (g013 != null) {
                    View g014 = m20.g0(inflate13, R.id.divider_2);
                    if (g014 != null) {
                        View g015 = m20.g0(inflate13, R.id.divider_3);
                        if (g015 != null) {
                            QuickConnAddItemView quickConnAddItemView = (QuickConnAddItemView) m20.g0(inflate13, R.id.itemAdvanceWidget);
                            if (quickConnAddItemView != null) {
                                QuickConnAddItemView quickConnAddItemView2 = (QuickConnAddItemView) m20.g0(inflate13, R.id.itemQuickSettingsTile);
                                if (quickConnAddItemView2 != null) {
                                    LinearLayout linearLayout29 = (LinearLayout) m20.g0(inflate13, R.id.item_setting_notification_bar);
                                    if (linearLayout29 != null) {
                                        QuickConnAddItemView quickConnAddItemView3 = (QuickConnAddItemView) m20.g0(inflate13, R.id.itemSimpleWidget);
                                        if (quickConnAddItemView3 != null) {
                                            SwitchCompat switchCompat7 = (SwitchCompat) m20.g0(inflate13, R.id.switchBtnNotificationBar);
                                            if (switchCompat7 != null) {
                                                Toolbar toolbar6 = (Toolbar) m20.g0(inflate13, R.id.toolbar);
                                                if (toolbar6 != null) {
                                                    i7 = R.id.tvNotificationBar;
                                                    TextView textView74 = (TextView) m20.g0(inflate13, R.id.tvNotificationBar);
                                                    if (textView74 != null) {
                                                        i7 = R.id.tvNotificationBarDetails;
                                                        TextView textView75 = (TextView) m20.g0(inflate13, R.id.tvNotificationBarDetails);
                                                        if (textView75 != null) {
                                                            i7 = R.id.tvWidgetTitle;
                                                            TextView textView76 = (TextView) m20.g0(inflate13, R.id.tvWidgetTitle);
                                                            if (textView76 != null) {
                                                                return new l5((LinearLayout) inflate13, g013, g014, g015, quickConnAddItemView, quickConnAddItemView2, linearLayout29, quickConnAddItemView3, switchCompat7, toolbar6, textView74, textView75, textView76);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                i7 = R.id.switchBtnNotificationBar;
                                            }
                                        } else {
                                            i7 = R.id.itemSimpleWidget;
                                        }
                                    } else {
                                        i7 = R.id.item_setting_notification_bar;
                                    }
                                } else {
                                    i7 = R.id.itemQuickSettingsTile;
                                }
                            } else {
                                i7 = R.id.itemAdvanceWidget;
                            }
                        } else {
                            i7 = R.id.divider_3;
                        }
                    } else {
                        i7 = R.id.divider_2;
                    }
                } else {
                    i7 = R.id.divider_1;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate13.getResources().getResourceName(i7)));
            case 15:
                return c();
            case 16:
                return d();
        }
    }

    @Override // defpackage.v31
    public final Object invoke() {
        ch3 ch3Var = ch3.f636a;
        dn dnVar = this.g;
        int i = this.f;
        switch (i) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                return b();
            case 3:
                return b();
            case 4:
                return b();
            case 5:
                switch (i) {
                    case 5:
                        bx3.G(dnVar, true, null);
                        return ch3Var;
                    default:
                        m20.C0(dnVar, 5);
                        return ch3Var;
                }
            case 6:
                switch (i) {
                    case 5:
                        bx3.G(dnVar, true, null);
                        return ch3Var;
                    default:
                        m20.C0(dnVar, 5);
                        return ch3Var;
                }
            case 7:
                return b();
            case 8:
                return b();
            case 9:
                return b();
            case 10:
                return b();
            case 11:
                return b();
            case 12:
                return b();
            case 13:
                return b();
            case 14:
                return b();
            case 15:
                return b();
            case 16:
                return b();
            default:
                return b();
        }
    }
}
