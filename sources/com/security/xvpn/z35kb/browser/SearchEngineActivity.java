package com.security.xvpn.z35kb.browser;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import defpackage.dn;
import defpackage.f7;
import defpackage.fl;
import defpackage.md0;
import defpackage.pd0;
import defpackage.sm1;
import defpackage.tl3;
import defpackage.v73;
import defpackage.ya0;

/* loaded from: classes2.dex */
public class SearchEngineActivity extends dn implements View.OnClickListener {
    public f7 k;
    public final int[] l = {R.drawable.icon_search_engine_duckduckgo, R.drawable.icon_search_engine_bing, R.drawable.icon_search_engine_google, R.drawable.icon_search_engine_amazon};
    public final int[] m = {R.id.tv_search_engine_duckduckgo, R.id.tv_search_engine_bing, R.id.tv_search_engine_google, R.id.tv_search_engine_amazon};

    @Override // defpackage.lt3
    public final String M() {
        return SearchEngineActivity.class.getName();
    }

    @Override // defpackage.lt3
    public final void R() {
        LayoutInflater layoutInflater = getLayoutInflater();
        int i = f7.t;
        DataBinderMapperImpl dataBinderMapperImpl = md0.f3279a;
        f7 f7Var = (f7) tl3.i(layoutInflater, R.layout.activity_search_engine, null, null);
        this.k = f7Var;
        setContentView(f7Var.e);
        this.k.o.setTitle(pd0.y(R.string.SearchEngine));
        this.k.o.setShowBackBtn(true);
        this.k.r.setOnClickListener(this);
        this.k.q.setOnClickListener(this);
        this.k.s.setOnClickListener(this);
        this.k.p.setOnClickListener(this);
        if (getIntent().getExtras() != null) {
            int i2 = getIntent().getExtras().getInt("search_engine", 0);
            int i3 = 0;
            while (true) {
                int[] iArr = this.l;
                if (i3 >= iArr.length) {
                    break;
                }
                int[] iArr2 = this.m;
                if (i2 == i3) {
                    ((TextView) findViewById(iArr2[i3])).setCompoundDrawablesWithIntrinsicBounds(iArr[i3], 0, R.drawable.icon_select_search_engine, 0);
                } else {
                    ((TextView) findViewById(iArr2[i3])).setCompoundDrawablesWithIntrinsicBounds(iArr[i3], 0, 0, 0);
                }
                i3++;
            }
        }
        this.k.r.setBackground(v73.u(1000008));
        this.k.q.setBackground(v73.u(1000008));
        this.k.s.setBackground(v73.u(1000008));
        this.k.p.setBackground(v73.u(1000008));
        fl.n(this, this.k.r, 1000014);
        fl.n(this, this.k.q, 1000014);
        fl.n(this, this.k.s, 1000014);
        fl.n(this, this.k.p, 1000014);
        bindInvalidate(this.k.o);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            case R.id.tv_search_engine_amazon /* 2131231841 */:
                intent.putExtra("search_engine", "Amazon.com");
                setResult(-1, intent);
                finish();
                return;
            case R.id.tv_search_engine_bing /* 2131231842 */:
                intent.putExtra("search_engine", "Bing");
                setResult(-1, intent);
                finish();
                return;
            case R.id.tv_search_engine_duckduckgo /* 2131231843 */:
                intent.putExtra("search_engine", "DuckDuckGo");
                setResult(-1, intent);
                finish();
                return;
            case R.id.tv_search_engine_google /* 2131231844 */:
                intent.putExtra("search_engine", "Google");
                setResult(-1, intent);
                finish();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (!((XApplication) this.c.getApplication()).c() && ya0.e0()) {
            sm1.a(this.c).c(new Intent("ClearHistory"));
        }
    }
}
