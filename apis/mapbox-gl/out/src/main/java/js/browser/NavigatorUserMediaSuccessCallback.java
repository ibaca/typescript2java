package js.browser;

import jsinterop.annotations.JsFunction;

/** 
  * source type: NavigatorUserMediaSuccessCallback
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 745882

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsFunction
public interface NavigatorUserMediaSuccessCallback{
    /** 
      * tsd/browser/lib.es6.d.ts@745933
     */
    void call(MediaStream stream);
}
