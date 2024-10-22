package com.security.xvpn.z35kb;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.security.xvpn.z35kb.TestConsoleActivity;
import com.security.xvpn.z35kb.widget.Toolbar;
import defpackage.dn;
import defpackage.fl;
import defpackage.me0;
import defpackage.ne0;
import defpackage.nw3;
import defpackage.p63;
import defpackage.t9;
import defpackage.v73;
import defpackage.z73;

/* loaded from: classes2.dex */
public class TestConsoleActivity extends dn implements me0 {
    public static final /* synthetic */ int r = 0;
    public TextView k;
    public ScrollView l;
    public EditText m;
    public TextView n;
    public AppCompatImageView o;
    public String p;
    public Boolean q;

    @Override // defpackage.me0
    public final void B(String str) {
        if (!isFinishing()) {
            this.k.setText(ne0.d);
            this.k.post(new nw3(this, 29));
        }
    }

    @Override // defpackage.lt3
    public final String M() {
        return "TestConsolePage";
    }

    @Override // defpackage.lt3
    public final void R() {
        this.p = getIntent().getStringExtra("from");
        setContentView(R.layout.activity_test_console);
        this.k = (TextView) findViewById(R.id.log_tv);
        this.l = (ScrollView) findViewById(R.id.log_sv);
        this.m = (EditText) findViewById(R.id.ip_input_et);
        this.n = (TextView) findViewById(R.id.connect_tv);
        this.o = (AppCompatImageView) findViewById(R.id.btnClose);
        final int i = 1;
        this.n.getPaint().setUnderlineText(true);
        final int i2 = 0;
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: o63

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TestConsoleActivity f3611b;

            {
                this.f3611b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                TestConsoleActivity testConsoleActivity = this.f3611b;
                switch (i3) {
                    case 0:
                        String obj = testConsoleActivity.m.getText().toString();
                        if (!TextUtils.isEmpty(obj)) {
                            m20.v0(view);
                            ew3.b(obj);
                            return;
                        }
                        return;
                    default:
                        int i4 = TestConsoleActivity.r;
                        testConsoleActivity.onBackPressed();
                        return;
                }
            }
        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Test log");
        this.o.setOnClickListener(new View.OnClickListener(this) { // from class: o63

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TestConsoleActivity f3611b;

            {
                this.f3611b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                TestConsoleActivity testConsoleActivity = this.f3611b;
                switch (i3) {
                    case 0:
                        String obj = testConsoleActivity.m.getText().toString();
                        if (!TextUtils.isEmpty(obj)) {
                            m20.v0(view);
                            ew3.b(obj);
                            return;
                        }
                        return;
                    default:
                        int i4 = TestConsoleActivity.r;
                        testConsoleActivity.onBackPressed();
                        return;
                }
            }
        });
        ne0.a(this);
        Boolean valueOf = Boolean.valueOf("chat".equals(this.p));
        this.q = valueOf;
        if (valueOf.booleanValue()) {
            findViewById(R.id.input_bottom_rl).setVisibility(8);
        }
        this.m.setBackground(new p63());
        fl.n(this, (TextView) findViewById(R.id.log_tv), 1000013);
        fl.n(this, (TextView) findViewById(R.id.ip_input_et), 1000013);
        fl.h(this, this.o, 1000024);
        fl.g(this, toolbar, 1000003);
        fl.g(this, this.l, 1000008);
        fl.g(this, findViewById(R.id.input_bottom_rl), 1000008);
        EditText editText = this.m;
        if (editText != null) {
            editText.setHintTextColor(v73.j(1000014));
            this.i.a(new z73(3, 1000014, editText));
        }
        fl.i(this, this.m, true);
        bindInvalidate(toolbar);
    }

    @Override // defpackage.dn
    public final int Y() {
        return 1000005;
    }

    @Override // defpackage.lt3, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        if (this.q.booleanValue()) {
            ne0.b(this);
        }
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (!this.q.booleanValue()) {
            ne0.b(this);
            t9.a();
        }
    }
}
