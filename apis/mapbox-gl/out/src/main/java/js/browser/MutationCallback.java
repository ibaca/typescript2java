package js.browser;

import jsinterop.annotations.JsFunction;

/** 
  * source type: MutationCallback
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 745312

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsFunction
public interface MutationCallback{
    /** 
      * tsd/browser/lib.es6.d.ts@745346
     */
    void call(Array<MutationRecord> mutations, MutationObserver observer);
}
