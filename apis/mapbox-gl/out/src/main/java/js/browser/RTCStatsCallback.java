package js.browser;

import jsinterop.annotations.JsFunction;

/** 
  * source type: RTCStatsCallback
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 745752

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsFunction
public interface RTCStatsCallback{
    /** 
      * tsd/browser/lib.es6.d.ts@745786
     */
    void call(RTCStatsReport report);
}
