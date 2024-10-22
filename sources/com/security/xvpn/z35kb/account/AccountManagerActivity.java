package com.security.xvpn.z35kb.account;

import a.du;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.a;
import androidx.fragment.app.p;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.account.AccountManagerActivity;
import defpackage.dn;
import defpackage.fd;
import defpackage.fl;
import defpackage.g4;
import defpackage.hx2;
import defpackage.m20;
import defpackage.ot3;
import defpackage.qu2;
import defpackage.sm1;
import defpackage.v3;
import defpackage.wt2;

/* loaded from: classes2.dex */
public class AccountManagerActivity extends dn {
    public static final /* synthetic */ int u = 0;
    public wt2 k;
    public qu2 l;
    public ObjectAnimator m;
    public TextView p;
    public TextView q;
    public ImageView r;
    public ImageView s;
    public boolean n = false;
    public boolean o = false;
    public final fd t = new fd(this, 9);

    @Override // defpackage.lt3
    public final String M() {
        return "AccountManagerActivity";
    }

    @Override // defpackage.lt3
    public final void R() {
        setContentView(R.layout.activity_account_manager);
        sm1.a(this).b(this.t, new IntentFilter("LoginSuccessAction"));
        Intent intent = getIntent();
        this.n = intent.getBooleanExtra("isSignIn", false);
        intent.getBooleanExtra("IS_FROM_PURCHASE", false);
    }

    public final void Z() {
        if (!this.n) {
            p supportFragmentManager = getSupportFragmentManager();
            a k = hx2.k(supportFragmentManager, supportFragmentManager);
            k.k(this.k);
            k.l(this.l);
            k.g();
        } else {
            p supportFragmentManager2 = getSupportFragmentManager();
            a k2 = hx2.k(supportFragmentManager2, supportFragmentManager2);
            k2.k(this.l);
            k2.l(this.k);
            k2.g();
        }
        this.s.post(new g4(this, 0));
    }

    public final void a0(boolean z) {
        float f = 0.0f;
        if (this.m == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.s, "translationX", 0.0f, this.q.getWidth());
            this.m = ofFloat;
            ofFloat.setInterpolator(new LinearInterpolator());
            this.m.setDuration(200L);
        }
        if (!z || !this.o) {
            if (!z && !this.o) {
                return;
            }
            float translationX = this.s.getTranslationX();
            if (!z) {
                f = (this.p.getMeasuredWidth() / 2.0f) + (this.q.getMeasuredWidth() / 2.0f);
            }
            this.m.setFloatValues(translationX, f);
            if (z) {
                this.o = true;
                this.p.setContentDescription("double tap to sign up page");
                this.q.setContentDescription("Now, you are in sign in page");
            } else {
                this.o = false;
                this.q.setContentDescription("double tap to sign in page");
                this.p.setContentDescription("Now, you are in sign up page");
            }
            this.m.start();
        }
    }

    @Override // defpackage.lt3, androidx.fragment.app.l, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 101 && i2 == -1) {
            setResult(-1);
            ot3.c.a(this);
            finish();
        }
    }

    @Override // defpackage.lt3, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        ot3.c.f3727a = null;
        m20.v0(getWindow().getDecorView());
    }

    @Override // defpackage.dn, defpackage.lt3, androidx.fragment.app.l, androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.k = new wt2();
            this.l = new qu2();
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                this.k.setArguments(extras);
                this.l.setArguments(extras);
            }
            p supportFragmentManager = getSupportFragmentManager();
            a k = hx2.k(supportFragmentManager, supportFragmentManager);
            k.d(R.id.contentPanel, this.k, wt2.class.getName(), 1);
            k.d(R.id.contentPanel, this.l, qu2.class.getName(), 1);
            k.k(this.k);
            k.l(this.l);
            k.g();
            return;
        }
        this.k = (wt2) getSupportFragmentManager().C(wt2.class.getName());
        this.l = (qu2) getSupportFragmentManager().C(qu2.class.getName());
        p supportFragmentManager2 = getSupportFragmentManager();
        a k2 = hx2.k(supportFragmentManager2, supportFragmentManager2);
        k2.k(this.k);
        k2.l(this.l);
        k2.g();
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        sm1.a(this).d(this.t);
    }

    @Override // defpackage.lt3, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.n = intent.getBooleanExtra("isSignIn", false);
        Z();
    }

    @Override // defpackage.lt3, android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.n = bundle.getBoolean("isSignIn");
    }

    @Override // defpackage.lt3, androidx.fragment.app.l, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!this.n) {
            if (getIntent().getBooleanExtra("IS_FROM_PURCHASE", false)) {
                du.d(263, null);
            }
            du.d(260, null);
        }
        wt2 wt2Var = this.k;
        if (wt2Var != null) {
            wt2Var.d.q.setFocusable(true);
            wt2Var.d.q.setFocusableInTouchMode(true);
            wt2Var.d.p.setFocusable(true);
            wt2Var.d.p.setFocusableInTouchMode(true);
        }
        qu2 qu2Var = this.l;
        if (qu2Var != null) {
            qu2Var.d.q.setFocusable(true);
            qu2Var.d.q.setFocusableInTouchMode(true);
            qu2Var.d.p.setFocusable(true);
            qu2Var.d.p.setFocusableInTouchMode(true);
        }
        this.s.post(new g4(this, 1));
    }

    @Override // defpackage.lt3, androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("isSignIn", this.n);
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.r = (ImageView) findViewById(R.id.btnBack);
        this.s = (ImageView) findViewById(R.id.ivIndicator);
        this.p = (TextView) findViewById(R.id.tv_nav_sign_up);
        this.q = (TextView) findViewById(R.id.tv_nav_sign_in);
        final int i = 0;
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: h4

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountManagerActivity f2362b;

            {
                this.f2362b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                AccountManagerActivity accountManagerActivity = this.f2362b;
                switch (i2) {
                    case 0:
                        int i3 = AccountManagerActivity.u;
                        accountManagerActivity.onBackPressed();
                        return;
                    case 1:
                        int i4 = AccountManagerActivity.u;
                        accountManagerActivity.a0(true);
                        accountManagerActivity.o = true;
                        accountManagerActivity.n = true;
                        accountManagerActivity.p.setTypeface(Typeface.DEFAULT);
                        accountManagerActivity.q.setTypeface(Typeface.DEFAULT_BOLD);
                        accountManagerActivity.q.setSelected(true);
                        accountManagerActivity.p.setSelected(false);
                        if (!accountManagerActivity.d) {
                            p supportFragmentManager = accountManagerActivity.getSupportFragmentManager();
                            a k = hx2.k(supportFragmentManager, supportFragmentManager);
                            k.k(accountManagerActivity.l);
                            k.l(accountManagerActivity.k);
                            k.g();
                            return;
                        }
                        return;
                    default:
                        int i5 = AccountManagerActivity.u;
                        accountManagerActivity.a0(false);
                        accountManagerActivity.o = false;
                        accountManagerActivity.n = false;
                        accountManagerActivity.p.setTypeface(Typeface.DEFAULT_BOLD);
                        accountManagerActivity.q.setTypeface(Typeface.DEFAULT);
                        accountManagerActivity.q.setSelected(false);
                        accountManagerActivity.p.setSelected(true);
                        if (!accountManagerActivity.d) {
                            p supportFragmentManager2 = accountManagerActivity.getSupportFragmentManager();
                            a k2 = hx2.k(supportFragmentManager2, supportFragmentManager2);
                            k2.k(accountManagerActivity.k);
                            k2.l(accountManagerActivity.l);
                            k2.g();
                            return;
                        }
                        return;
                }
            }
        });
        final int i2 = 1;
        this.q.setOnClickListener(new View.OnClickListener(this) { // from class: h4

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountManagerActivity f2362b;

            {
                this.f2362b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                AccountManagerActivity accountManagerActivity = this.f2362b;
                switch (i22) {
                    case 0:
                        int i3 = AccountManagerActivity.u;
                        accountManagerActivity.onBackPressed();
                        return;
                    case 1:
                        int i4 = AccountManagerActivity.u;
                        accountManagerActivity.a0(true);
                        accountManagerActivity.o = true;
                        accountManagerActivity.n = true;
                        accountManagerActivity.p.setTypeface(Typeface.DEFAULT);
                        accountManagerActivity.q.setTypeface(Typeface.DEFAULT_BOLD);
                        accountManagerActivity.q.setSelected(true);
                        accountManagerActivity.p.setSelected(false);
                        if (!accountManagerActivity.d) {
                            p supportFragmentManager = accountManagerActivity.getSupportFragmentManager();
                            a k = hx2.k(supportFragmentManager, supportFragmentManager);
                            k.k(accountManagerActivity.l);
                            k.l(accountManagerActivity.k);
                            k.g();
                            return;
                        }
                        return;
                    default:
                        int i5 = AccountManagerActivity.u;
                        accountManagerActivity.a0(false);
                        accountManagerActivity.o = false;
                        accountManagerActivity.n = false;
                        accountManagerActivity.p.setTypeface(Typeface.DEFAULT_BOLD);
                        accountManagerActivity.q.setTypeface(Typeface.DEFAULT);
                        accountManagerActivity.q.setSelected(false);
                        accountManagerActivity.p.setSelected(true);
                        if (!accountManagerActivity.d) {
                            p supportFragmentManager2 = accountManagerActivity.getSupportFragmentManager();
                            a k2 = hx2.k(supportFragmentManager2, supportFragmentManager2);
                            k2.k(accountManagerActivity.k);
                            k2.l(accountManagerActivity.l);
                            k2.g();
                            return;
                        }
                        return;
                }
            }
        });
        final int i3 = 2;
        this.p.setOnClickListener(new View.OnClickListener(this) { // from class: h4

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountManagerActivity f2362b;

            {
                this.f2362b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i3;
                AccountManagerActivity accountManagerActivity = this.f2362b;
                switch (i22) {
                    case 0:
                        int i32 = AccountManagerActivity.u;
                        accountManagerActivity.onBackPressed();
                        return;
                    case 1:
                        int i4 = AccountManagerActivity.u;
                        accountManagerActivity.a0(true);
                        accountManagerActivity.o = true;
                        accountManagerActivity.n = true;
                        accountManagerActivity.p.setTypeface(Typeface.DEFAULT);
                        accountManagerActivity.q.setTypeface(Typeface.DEFAULT_BOLD);
                        accountManagerActivity.q.setSelected(true);
                        accountManagerActivity.p.setSelected(false);
                        if (!accountManagerActivity.d) {
                            p supportFragmentManager = accountManagerActivity.getSupportFragmentManager();
                            a k = hx2.k(supportFragmentManager, supportFragmentManager);
                            k.k(accountManagerActivity.l);
                            k.l(accountManagerActivity.k);
                            k.g();
                            return;
                        }
                        return;
                    default:
                        int i5 = AccountManagerActivity.u;
                        accountManagerActivity.a0(false);
                        accountManagerActivity.o = false;
                        accountManagerActivity.n = false;
                        accountManagerActivity.p.setTypeface(Typeface.DEFAULT_BOLD);
                        accountManagerActivity.q.setTypeface(Typeface.DEFAULT);
                        accountManagerActivity.q.setSelected(false);
                        accountManagerActivity.p.setSelected(true);
                        if (!accountManagerActivity.d) {
                            p supportFragmentManager2 = accountManagerActivity.getSupportFragmentManager();
                            a k2 = hx2.k(supportFragmentManager2, supportFragmentManager2);
                            k2.k(accountManagerActivity.k);
                            k2.l(accountManagerActivity.l);
                            k2.g();
                            return;
                        }
                        return;
                }
            }
        });
        Z();
        View findViewById = findViewById(R.id.contentPanel);
        findViewById.setBackground(new v3());
        bindInvalidate(findViewById);
        fl.h(this, (AppCompatImageView) findViewById(R.id.ivIndicator), 1000057);
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onStop() {
        super.onStop();
    }
}
