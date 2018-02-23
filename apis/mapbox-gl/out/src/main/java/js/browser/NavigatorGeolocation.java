package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: NavigatorGeolocation
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 733489
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface NavigatorGeolocation
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.NavigatorGeolocation)
     */
    @JsProperty(name = "geolocation")
    Geolocation getGeolocation();
    /** 
      * inherited from (js.browser.NavigatorGeolocation)
     */
    @JsProperty(name = "geolocation")
    void setGeolocation(Geolocation value);
}
