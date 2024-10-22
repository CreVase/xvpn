package defpackage;

import android.os.CountDownTimer;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.account.ForgetPasswordActivity;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class v01 extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ForgetPasswordActivity f4767a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v01(ForgetPasswordActivity forgetPasswordActivity, long j) {
        super(j, 1000L);
        this.f4767a = forgetPasswordActivity;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        ForgetPasswordActivity forgetPasswordActivity = this.f4767a;
        forgetPasswordActivity.o.w.setEnabled(true);
        forgetPasswordActivity.o.w.setText(pd0.y(R.string.SendVerificationCode));
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        long j2 = j / 1000;
        int i = (int) (j2 / 60);
        ew3.d0(new to1(7, this, String.format(Locale.US, "%02d:%02d", Integer.valueOf(i), Integer.valueOf((int) (j2 % 60)))));
    }
}
