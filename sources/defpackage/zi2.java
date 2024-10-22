package defpackage;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zi2 extends z33 implements l41 {
    public int e;
    public final /* synthetic */ aj2 f;
    public final /* synthetic */ Map g;
    public final /* synthetic */ l41 h;
    public final /* synthetic */ l41 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi2(aj2 aj2Var, Map map, l41 l41Var, l41 l41Var2, c90 c90Var) {
        super(2, c90Var);
        this.f = aj2Var;
        this.g = map;
        this.h = l41Var;
        this.i = l41Var2;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new zi2(this.f, this.g, this.h, this.i, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((zi2) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        l41 l41Var = this.i;
        try {
            if (i != 0) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        fl.a0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    fl.a0(obj);
                }
            } else {
                fl.a0(obj);
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) aj2.a(this.f).openConnection();
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry entry : this.g.entrySet()) {
                    httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    }
                    bufferedReader.close();
                    inputStream.close();
                    JSONObject jSONObject = new JSONObject(sb.toString());
                    l41 l41Var2 = this.h;
                    this.e = 1;
                    if (l41Var2.invoke(jSONObject, this) == ba0Var) {
                        return ba0Var;
                    }
                } else {
                    String str = "Bad response code: " + responseCode;
                    this.e = 2;
                    if (l41Var.invoke(str, this) == ba0Var) {
                        return ba0Var;
                    }
                }
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            this.e = 3;
            if (l41Var.invoke(message, this) == ba0Var) {
                return ba0Var;
            }
        }
        return ch3.f636a;
    }
}
