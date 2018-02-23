package js.browser;

import jsinterop.annotations.JsFunction;

/** 
  * source type: DecodeSuccessCallback
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 745412

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsFunction
public interface DecodeSuccessCallback{
    /** 
      * tsd/browser/lib.es6.d.ts@745451
     */
    void call(AudioBuffer decodedData);
}
