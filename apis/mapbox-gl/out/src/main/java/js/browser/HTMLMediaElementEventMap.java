package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLMediaElementEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 438081
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface HTMLMediaElementEventMap extends HTMLElementEventMap 
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.HTMLMediaElementEventMap)
     */
    @JsProperty(name = "encrypted")
    MediaEncryptedEvent getEncrypted();
    /** 
      * inherited from (js.browser.HTMLMediaElementEventMap)
     */
    @JsProperty(name = "msneedkey")
    MSMediaKeyNeededEvent getMsneedkey();
    /** 
      * inherited from (js.browser.HTMLMediaElementEventMap)
     */
    @JsProperty(name = "encrypted")
    void setEncrypted(MediaEncryptedEvent value);
    /** 
      * inherited from (js.browser.HTMLMediaElementEventMap)
     */
    @JsProperty(name = "msneedkey")
    void setMsneedkey(MSMediaKeyNeededEvent value);
}
