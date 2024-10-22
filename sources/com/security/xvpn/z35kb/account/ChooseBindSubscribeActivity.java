package com.security.xvpn.z35kb.account;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.R;
import defpackage.cr1;
import defpackage.dn;

/* loaded from: classes2.dex */
public class ChooseBindSubscribeActivity extends dn {
    public static final /* synthetic */ int k = 0;

    @Override // defpackage.lt3
    public final String M() {
        return "ChooseBindSubscribePage";
    }

    @Override // defpackage.lt3
    public final void R() {
        setContentView(R.layout.dialog_choose_bind_subscribe);
        findViewById(R.id.btnClose).setOnClickListener(new cr1(this, 12));
        ((RecyclerView) findViewById(R.id.rv_restore_list)).setLayoutManager(new LinearLayoutManager());
    }
}
