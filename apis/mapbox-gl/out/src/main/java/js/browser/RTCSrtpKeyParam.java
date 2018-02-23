package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCSrtpKeyParam
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 278993

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCSrtpKeyParam
{

    /*
        Properties
    */

    public String keyMethod;

    public String keySalt;

    public String lifetime;

    public Number mkiLength;

    public Number mkiValue;

    /*
        Methods
    */
    @JsProperty(name = "keyMethod")
    public native String getKeyMethod();
    @JsProperty(name = "keySalt")
    public native String getKeySalt();
    @JsProperty(name = "lifetime")
    public native String getLifetime();
    @JsProperty(name = "mkiLength")
    public native Number getMkiLength();
    @JsProperty(name = "mkiValue")
    public native Number getMkiValue();
    @JsProperty(name = "keyMethod")
    public native void setKeyMethod(String value);
    @JsProperty(name = "keySalt")
    public native void setKeySalt(String value);
    @JsProperty(name = "lifetime")
    public native void setLifetime(String value);
    @JsProperty(name = "mkiLength")
    public native void setMkiLength(@DoNotAutobox Number value);
    @JsProperty(name = "mkiValue")
    public native void setMkiValue(@DoNotAutobox Number value);
}
