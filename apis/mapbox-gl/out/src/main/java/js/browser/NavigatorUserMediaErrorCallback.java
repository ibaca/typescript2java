package js.browser;

import jsinterop.annotations.JsFunction;

/** 
  * source type: NavigatorUserMediaErrorCallback
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 745963

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsFunction
public interface NavigatorUserMediaErrorCallback{
    /** 
      * tsd/browser/lib.es6.d.ts@746012
     */
    void call(MediaStreamError error);
}
