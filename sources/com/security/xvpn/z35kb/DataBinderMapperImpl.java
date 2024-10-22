package com.security.xvpn.z35kb;

import android.util.SparseIntArray;
import android.view.View;
import defpackage.bl0;
import defpackage.f21;
import defpackage.g7;
import defpackage.h21;
import defpackage.h6;
import defpackage.il0;
import defpackage.ld0;
import defpackage.n5;
import defpackage.p5;
import defpackage.q6;
import defpackage.r5;
import defpackage.re1;
import defpackage.si1;
import defpackage.tl3;
import defpackage.u6;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends ld0 {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f1591a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(13);
        f1591a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_browser_setting, 1);
        sparseIntArray.put(R.layout.activity_change_password, 2);
        sparseIntArray.put(R.layout.activity_choose_clear_type, 3);
        sparseIntArray.put(R.layout.activity_forget_password, 4);
        sparseIntArray.put(R.layout.activity_purchase, 5);
        sparseIntArray.put(R.layout.activity_reset_password, 6);
        sparseIntArray.put(R.layout.activity_search_engine, 7);
        sparseIntArray.put(R.layout.dialog_connected_new, 8);
        sparseIntArray.put(R.layout.dialog_guide_to_subscribe, 9);
        sparseIntArray.put(R.layout.fragment_sign_in, 10);
        sparseIntArray.put(R.layout.fragment_sign_up, 11);
        sparseIntArray.put(R.layout.item_choose_bind_subscribe, 12);
        sparseIntArray.put(R.layout.layout_ad_browser_banner, 13);
    }

    @Override // defpackage.ld0
    public final List a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.ld0
    public final tl3 b(View view, int i) {
        int i2 = f1591a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch (i2) {
                    case 1:
                        if ("layout/activity_browser_setting_0".equals(tag)) {
                            return new n5(view);
                        }
                        throw new IllegalArgumentException("The tag for activity_browser_setting is invalid. Received: " + tag);
                    case 2:
                        if ("layout/activity_change_password_0".equals(tag)) {
                            return new p5(view);
                        }
                        throw new IllegalArgumentException("The tag for activity_change_password is invalid. Received: " + tag);
                    case 3:
                        if ("layout/activity_choose_clear_type_0".equals(tag)) {
                            return new r5(view);
                        }
                        throw new IllegalArgumentException("The tag for activity_choose_clear_type is invalid. Received: " + tag);
                    case 4:
                        if ("layout/activity_forget_password_0".equals(tag)) {
                            return new h6(view);
                        }
                        throw new IllegalArgumentException("The tag for activity_forget_password is invalid. Received: " + tag);
                    case 5:
                        if ("layout/activity_purchase_0".equals(tag)) {
                            return new q6(view);
                        }
                        throw new IllegalArgumentException("The tag for activity_purchase is invalid. Received: " + tag);
                    case 6:
                        if ("layout/activity_reset_password_0".equals(tag)) {
                            return new u6(view);
                        }
                        throw new IllegalArgumentException("The tag for activity_reset_password is invalid. Received: " + tag);
                    case 7:
                        if ("layout/activity_search_engine_0".equals(tag)) {
                            return new g7(view);
                        }
                        throw new IllegalArgumentException("The tag for activity_search_engine is invalid. Received: " + tag);
                    case 8:
                        if ("layout/dialog_connected_new_0".equals(tag)) {
                            return new bl0(view);
                        }
                        throw new IllegalArgumentException("The tag for dialog_connected_new is invalid. Received: " + tag);
                    case 9:
                        if ("layout/dialog_guide_to_subscribe_0".equals(tag)) {
                            return new il0(view);
                        }
                        throw new IllegalArgumentException("The tag for dialog_guide_to_subscribe is invalid. Received: " + tag);
                    case 10:
                        if ("layout/fragment_sign_in_0".equals(tag)) {
                            return new f21(view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_sign_in is invalid. Received: " + tag);
                    case 11:
                        if ("layout/fragment_sign_up_0".equals(tag)) {
                            return new h21(view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_sign_up is invalid. Received: " + tag);
                    case 12:
                        if ("layout/item_choose_bind_subscribe_0".equals(tag)) {
                            return new re1(view);
                        }
                        throw new IllegalArgumentException("The tag for item_choose_bind_subscribe is invalid. Received: " + tag);
                    case 13:
                        if ("layout/layout_ad_browser_banner_0".equals(tag)) {
                            return new si1(view);
                        }
                        throw new IllegalArgumentException("The tag for layout_ad_browser_banner is invalid. Received: " + tag);
                    default:
                        return null;
                }
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }
}
