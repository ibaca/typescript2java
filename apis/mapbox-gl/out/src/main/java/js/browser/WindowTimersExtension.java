package js.browser;

import fr.lteconsulting.prebuilt.Action1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: WindowTimersExtension
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 736155
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface WindowTimersExtension
{

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@736195
      * inherited from (js.browser.WindowTimersExtension)
      * inherited from (js.browser.WindowTimersExtension)
     */
    void clearImmediate(@DoNotAutobox Number handle);
    Number setImmediate(Object handler);
    /** 
      * tsd/browser/lib.es6.d.ts@736298
      * VERSION 1
      * inherited from (js.browser.WindowTimersExtension)
      * inherited from (js.browser.WindowTimersExtension)
     */
    Number setImmediate(Object handler, Object...  args);
    /** 
      * tsd/browser/lib.es6.d.ts@736237
      * inherited from (js.browser.WindowTimersExtension)
      * inherited from (js.browser.WindowTimersExtension)
     */
    Number setImmediate(Action1<Object> handler);
}
