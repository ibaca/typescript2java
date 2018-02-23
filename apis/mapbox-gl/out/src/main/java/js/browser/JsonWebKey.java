package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: JsonWebKey
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 742869

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class JsonWebKey
{

    /*
        Properties
    */

    public String alg;

    public String crv;

    public String d;

    public String dp;

    public String dq;

    public String e;

    public Boolean ext;

    public String k;

    public Array<String> key_ops;

    public String kid;

    public String kty;

    public String n;

    public Array<RsaOtherPrimesInfo> oth;

    public String p;

    public String q;

    public String qi;

    public String use;

    public String x;

    public String x5c;

    public String x5t;

    public String x5u;

    public String y;

    /*
        Methods
    */
    @JsProperty(name = "alg")
    public native String getAlg();
    @JsProperty(name = "crv")
    public native String getCrv();
    @JsProperty(name = "d")
    public native String getD();
    @JsProperty(name = "dp")
    public native String getDp();
    @JsProperty(name = "dq")
    public native String getDq();
    @JsProperty(name = "e")
    public native String getE();
    @JsProperty(name = "ext")
    public native Boolean getExt();
    @JsProperty(name = "k")
    public native String getK();
    @JsProperty(name = "key_ops")
    public native Array<String> getKey_ops();
    @JsProperty(name = "kid")
    public native String getKid();
    @JsProperty(name = "kty")
    public native String getKty();
    @JsProperty(name = "n")
    public native String getN();
    @JsProperty(name = "oth")
    public native Array<RsaOtherPrimesInfo> getOth();
    @JsProperty(name = "p")
    public native String getP();
    @JsProperty(name = "q")
    public native String getQ();
    @JsProperty(name = "qi")
    public native String getQi();
    @JsProperty(name = "use")
    public native String getUse();
    @JsProperty(name = "x")
    public native String getX();
    @JsProperty(name = "x5c")
    public native String getX5c();
    @JsProperty(name = "x5t")
    public native String getX5t();
    @JsProperty(name = "x5u")
    public native String getX5u();
    @JsProperty(name = "y")
    public native String getY();
    @JsProperty(name = "alg")
    public native void setAlg(String value);
    @JsProperty(name = "crv")
    public native void setCrv(String value);
    @JsProperty(name = "d")
    public native void setD(String value);
    @JsProperty(name = "dp")
    public native void setDp(String value);
    @JsProperty(name = "dq")
    public native void setDq(String value);
    @JsProperty(name = "e")
    public native void setE(String value);
    @JsProperty(name = "ext")
    public native void setExt(Boolean value);
    @JsProperty(name = "k")
    public native void setK(String value);
    @JsProperty(name = "key_ops")
    public native void setKey_ops(Array<String> value);
    @JsProperty(name = "kid")
    public native void setKid(String value);
    @JsProperty(name = "kty")
    public native void setKty(String value);
    @JsProperty(name = "n")
    public native void setN(String value);
    @JsProperty(name = "oth")
    public native void setOth(Array<RsaOtherPrimesInfo> value);
    @JsProperty(name = "p")
    public native void setP(String value);
    @JsProperty(name = "q")
    public native void setQ(String value);
    @JsProperty(name = "qi")
    public native void setQi(String value);
    @JsProperty(name = "use")
    public native void setUse(String value);
    @JsProperty(name = "x")
    public native void setX(String value);
    @JsProperty(name = "x5c")
    public native void setX5c(String value);
    @JsProperty(name = "x5t")
    public native void setX5t(String value);
    @JsProperty(name = "x5u")
    public native void setX5u(String value);
    @JsProperty(name = "y")
    public native void setY(String value);
}
