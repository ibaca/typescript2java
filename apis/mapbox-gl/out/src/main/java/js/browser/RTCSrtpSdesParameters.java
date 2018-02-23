package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCSrtpSdesParameters
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 279140

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCSrtpSdesParameters
{

    /*
        Properties
    */

    public String cryptoSuite;

    public Array<RTCSrtpKeyParam> keyParams;

    public Array<String> sessionParams;

    public Number tag;

    /*
        Methods
    */
    @JsProperty(name = "cryptoSuite")
    public native String getCryptoSuite();
    @JsProperty(name = "keyParams")
    public native Array<RTCSrtpKeyParam> getKeyParams();
    @JsProperty(name = "sessionParams")
    public native Array<String> getSessionParams();
    @JsProperty(name = "tag")
    public native Number getTag();
    @JsProperty(name = "cryptoSuite")
    public native void setCryptoSuite(String value);
    @JsProperty(name = "keyParams")
    public native void setKeyParams(Array<RTCSrtpKeyParam> value);
    @JsProperty(name = "sessionParams")
    public native void setSessionParams(Array<String> value);
    @JsProperty(name = "tag")
    public native void setTag(@DoNotAutobox Number value);
}
