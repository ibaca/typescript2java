package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaKeySession
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 518544
  * declared in: tsd/browser/lib.es6.d.ts at pos 518973
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaKeySession")
public class MediaKeySession extends EventTarget 
{

    /*
        Constructors
    */
    public MediaKeySession () {
    } 

    /*
        Properties
    */

    public Promise<Void> closed;

    public Number expiration;

    public MediaKeyStatusMap keyStatuses;

    public String sessionId;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@518744
     */
    public native Promise<Void> close();
    /** 
      * tsd/browser/lib.es6.d.ts@518772
     */
    public native Promise<Void> generateRequest(String initDataType, Object initData);
    @JsProperty(name = "closed")
    public native Promise<Void> getClosed();
    @JsProperty(name = "expiration")
    public native Number getExpiration();
    @JsProperty(name = "keyStatuses")
    public native MediaKeyStatusMap getKeyStatuses();
    @JsProperty(name = "sessionId")
    public native String getSessionId();
    /** 
      * tsd/browser/lib.es6.d.ts@518845
     */
    public native Promise<Boolean> load(String sessionId);
    /** 
      * tsd/browser/lib.es6.d.ts@518892
     */
    public native Promise<Void> remove();
    @JsProperty(name = "closed")
    public native void setClosed(Promise<Void> value);
    @JsProperty(name = "expiration")
    public native void setExpiration(@DoNotAutobox Number value);
    @JsProperty(name = "keyStatuses")
    public native void setKeyStatuses(MediaKeyStatusMap value);
    @JsProperty(name = "sessionId")
    public native void setSessionId(String value);
    /** 
      * tsd/browser/lib.es6.d.ts@518921
     */
    public native Promise<Void> update(Object response);
}
