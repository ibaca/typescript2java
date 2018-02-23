package js.browser;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSMediaKeys
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 511651
  * declared in: tsd/browser/lib.es6.d.ts at pos 511819
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSMediaKeys")
public class MSMediaKeys
{

    /*
        Constructors
    */
    public MSMediaKeys (String keySystem) {
    } 

    /*
        Static methods
    */

    /** 
      * source : tsd/browser/lib.es6.d.ts:511908
     */
    @JsMethod(namespace="MSMediaKeys", name = "isTypeSupported")
    public static native Boolean isTypeSupported(String keySystem, String type /* optional */);

    /** 
      * source : tsd/browser/lib.es6.d.ts:511972
     */
    @JsMethod(namespace="MSMediaKeys", name = "isTypeSupportedWithFeatures")
    public static native String isTypeSupportedWithFeatures(String keySystem, String type /* optional */);

    @JsMethod(namespace="MSMediaKeys", name = "isTypeSupported")
    public static native Boolean isTypeSupported(String keySystem);

    @JsMethod(namespace="MSMediaKeys", name = "isTypeSupportedWithFeatures")
    public static native String isTypeSupportedWithFeatures(String keySystem);

    /*
        Properties
    */

    public String keySystem;

    /*
        Methods
    */
    public native MSMediaKeySession createSession(String type, Uint8Array initData);
    /** 
      * tsd/browser/lib.es6.d.ts@511713
     */
    public native MSMediaKeySession createSession(String type, Uint8Array initData, Uint8Array cdmData /* optional */);
    @JsProperty(name = "keySystem")
    public native String getKeySystem();
    @JsProperty(name = "keySystem")
    public native void setKeySystem(String value);
}
