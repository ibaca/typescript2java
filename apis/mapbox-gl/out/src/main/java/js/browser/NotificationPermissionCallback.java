package js.browser;

import jsinterop.annotations.JsFunction;

/** 
  * source type: NotificationPermissionCallback
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 746116

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsFunction
public interface NotificationPermissionCallback{
    /** 
      * tsd/browser/lib.es6.d.ts@746164
     */
    void call(String permission);
}
