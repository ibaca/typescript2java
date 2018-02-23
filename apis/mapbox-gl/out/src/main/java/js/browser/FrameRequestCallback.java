package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsFunction;

/** 
  * source type: FrameRequestCallback
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 745125

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsFunction
public interface FrameRequestCallback{
    /** 
      * tsd/browser/lib.es6.d.ts@745163
     */
    void call(@DoNotAutobox Number time);
}
