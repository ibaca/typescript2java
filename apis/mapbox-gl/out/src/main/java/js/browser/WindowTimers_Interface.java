package js.browser;

import fr.lteconsulting.prebuilt.Action1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: WindowTimers
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 735716

  * created because of multiple implementation inheritance of js.browser.Window
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WindowTimers")
public interface WindowTimers_Interface extends WindowTimersExtension 
{

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@735785
      * inherited from (js.browser.WindowTimers_Interface)
     */
    void clearInterval(@DoNotAutobox Number handle);
    /** 
      * tsd/browser/lib.es6.d.ts@735826
      * inherited from (js.browser.WindowTimers_Interface)
     */
    void clearTimeout(@DoNotAutobox Number handle);
    Number setInterval(Object handler);
    Number setInterval(Object handler, Object timeout /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@735943
      * VERSION 1
      * inherited from (js.browser.WindowTimers_Interface)
     */
    Number setInterval(Object handler, Object timeout /* optional */, Object...  args);
    /** 
      * tsd/browser/lib.es6.d.ts@735866
      * inherited from (js.browser.WindowTimers_Interface)
     */
    Number setInterval(Action1<Object> handler, @DoNotAutobox Number timeout);
    Number setTimeout(Object handler);
    Number setTimeout(Object handler, Object timeout /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@736089
      * VERSION 1
      * inherited from (js.browser.WindowTimers_Interface)
     */
    Number setTimeout(Object handler, Object timeout /* optional */, Object...  args);
    /** 
      * tsd/browser/lib.es6.d.ts@736013
      * inherited from (js.browser.WindowTimers_Interface)
     */
    Number setTimeout(Action1<Object> handler, @DoNotAutobox Number timeout);
}
