package js.browser;

import jsinterop.annotations.JsFunction;

/** 
  * source type: RTCSessionDescriptionCallback
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 745594

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsFunction
public interface RTCSessionDescriptionCallback{
    /** 
      * tsd/browser/lib.es6.d.ts@745641
     */
    void call(RTCSessionDescription sdp);
}
