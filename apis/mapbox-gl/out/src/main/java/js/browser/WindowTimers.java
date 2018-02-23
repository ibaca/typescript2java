package js.browser;

import fr.lteconsulting.prebuilt.Action1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: WindowTimers
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 735716
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WindowTimers")
public class WindowTimers implements WindowTimers_Interface 
{

    /*
        Constructors
    */
    public WindowTimers (Object value /* optional */) {
    } 
    public WindowTimers () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@736195
      * inherited from (js.browser.WindowTimersExtension)
      * inherited from (js.browser.WindowTimersExtension)
     */
    public native void clearImmediate(@DoNotAutobox Number handle);
    /** 
      * tsd/browser/lib.es6.d.ts@735785
      * inherited from (js.browser.WindowTimers_Interface)
     */
    public native void clearInterval(@DoNotAutobox Number handle);
    /** 
      * tsd/browser/lib.es6.d.ts@735826
      * inherited from (js.browser.WindowTimers_Interface)
     */
    public native void clearTimeout(@DoNotAutobox Number handle);
    public native Number setImmediate(Object handler);
    /** 
      * tsd/browser/lib.es6.d.ts@736298
      * VERSION 1
      * inherited from (js.browser.WindowTimersExtension)
      * inherited from (js.browser.WindowTimersExtension)
     */
    public native Number setImmediate(Object handler, Object...  args);
    /** 
      * tsd/browser/lib.es6.d.ts@736237
      * inherited from (js.browser.WindowTimersExtension)
      * inherited from (js.browser.WindowTimersExtension)
     */
    public native Number setImmediate(Action1<Object> handler);
    public native Number setInterval(Object handler);
    public native Number setInterval(Object handler, Object timeout /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@735943
      * VERSION 1
      * inherited from (js.browser.WindowTimers_Interface)
     */
    public native Number setInterval(Object handler, Object timeout /* optional */, Object...  args);
    /** 
      * tsd/browser/lib.es6.d.ts@735866
      * inherited from (js.browser.WindowTimers_Interface)
     */
    public native Number setInterval(Action1<Object> handler, @DoNotAutobox Number timeout);
    public native Number setTimeout(Object handler);
    public native Number setTimeout(Object handler, Object timeout /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@736089
      * VERSION 1
      * inherited from (js.browser.WindowTimers_Interface)
     */
    public native Number setTimeout(Object handler, Object timeout /* optional */, Object...  args);
    /** 
      * tsd/browser/lib.es6.d.ts@736013
      * inherited from (js.browser.WindowTimers_Interface)
     */
    public native Number setTimeout(Action1<Object> handler, @DoNotAutobox Number timeout);
}
