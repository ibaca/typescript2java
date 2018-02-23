package js.browser;

import jsinterop.annotations.JsFunction;

/** 
  * source type: DecodeErrorCallback
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 745486

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsFunction
public interface DecodeErrorCallback{
    /** 
      * tsd/browser/lib.es6.d.ts@745523
     */
    void call(DOMException error);
}
