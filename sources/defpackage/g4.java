package defpackage;

import android.graphics.Typeface;
import com.security.xvpn.z35kb.account.AccountManagerActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class g4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccountManagerActivity f2201b;

    public /* synthetic */ g4(AccountManagerActivity accountManagerActivity, int i) {
        this.f2200a = i;
        this.f2201b = accountManagerActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2200a;
        AccountManagerActivity accountManagerActivity = this.f2201b;
        switch (i) {
            case 0:
                int i2 = AccountManagerActivity.u;
                accountManagerActivity.getClass();
                try {
                    if (accountManagerActivity.n) {
                        accountManagerActivity.s.setTranslationX(0.0f);
                        accountManagerActivity.o = true;
                    } else {
                        accountManagerActivity.s.setTranslationX((accountManagerActivity.q.getMeasuredWidth() / 2.0f) + (accountManagerActivity.p.getMeasuredWidth() / 2.0f));
                        accountManagerActivity.o = false;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                int i3 = AccountManagerActivity.u;
                accountManagerActivity.getClass();
                try {
                    if (accountManagerActivity.n) {
                        accountManagerActivity.s.setTranslationX(0.0f);
                        accountManagerActivity.o = true;
                        accountManagerActivity.p.setTypeface(Typeface.DEFAULT);
                        accountManagerActivity.q.setTypeface(Typeface.DEFAULT_BOLD);
                        accountManagerActivity.q.setSelected(true);
                        accountManagerActivity.p.setSelected(false);
                    } else {
                        accountManagerActivity.s.setTranslationX((accountManagerActivity.q.getMeasuredWidth() / 2.0f) + (accountManagerActivity.p.getMeasuredWidth() / 2.0f));
                        accountManagerActivity.o = false;
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
