package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: NavigatorUserMedia
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 733973
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface NavigatorUserMedia
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.NavigatorUserMedia)
     */
    @JsProperty(name = "mediaDevices")
    MediaDevices getMediaDevices();
    /** 
      * tsd/browser/lib.es6.d.ts@734051
      * inherited from (js.browser.NavigatorUserMedia)
     */
    void getUserMedia(MediaStreamConstraints constraints, NavigatorUserMediaSuccessCallback successCallback, NavigatorUserMediaErrorCallback errorCallback);
    /** 
      * inherited from (js.browser.NavigatorUserMedia)
     */
    @JsProperty(name = "mediaDevices")
    void setMediaDevices(MediaDevices value);
}
