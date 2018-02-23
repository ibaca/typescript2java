package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsFunction;

/** 
  * source type: ErrorEventHandler
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 744746

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsFunction
public interface ErrorEventHandler{
    /** 
      * tsd/browser/lib.es6.d.ts@744782
     */
    void call(String message, String filename /* optional */, @DoNotAutobox Number lineno /* optional */, @DoNotAutobox Number colno /* optional */, Error error /* optional */);
}
