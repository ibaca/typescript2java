package js.browser;

import jsinterop.annotations.JsFunction;

/** 
  * source type: IntersectionObserverCallback
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 746193

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsFunction
public interface IntersectionObserverCallback{
    /** 
      * tsd/browser/lib.es6.d.ts@746239
     */
    void call(Array<IntersectionObserverEntry> entries, IntersectionObserver observer);
}
