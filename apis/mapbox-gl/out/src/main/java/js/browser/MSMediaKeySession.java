package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSMediaKeySession
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 511336
  * declared in: tsd/browser/lib.es6.d.ts at pos 511564
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSMediaKeySession")
public class MSMediaKeySession extends EventTarget 
{

    /*
        Constructors
    */
    public MSMediaKeySession () {
    } 

    /*
        Properties
    */

    public MSMediaKeyError error;

    public String keySystem;

    public String sessionId;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@511500
     */
    public native void close();
    @JsProperty(name = "error")
    public native MSMediaKeyError getError();
    @JsProperty(name = "keySystem")
    public native String getKeySystem();
    @JsProperty(name = "sessionId")
    public native String getSessionId();
    @JsProperty(name = "error")
    public native void setError(MSMediaKeyError value);
    @JsProperty(name = "keySystem")
    public native void setKeySystem(String value);
    @JsProperty(name = "sessionId")
    public native void setSessionId(String value);
    /** 
      * tsd/browser/lib.es6.d.ts@511519
     */
    public native void update(Uint8Array key);
}
