package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: History
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 489542
  * declared in: tsd/browser/lib.es6.d.ts at pos 489882
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="History")
public class History
{

    /*
        Constructors
    */
    public History () {
    } 

    /*
        Properties
    */

    public int length;

    public String scrollRestoration;

    public Object state;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@489664
     */
    public native void back();
    /** 
      * tsd/browser/lib.es6.d.ts@489682
     */
    public native void forward();
    @JsProperty(name = "length")
    public native Number getLength();
    @JsProperty(name = "scrollRestoration")
    public native String getScrollRestoration();
    @JsProperty(name = "state")
    public native Object getState();
    public native void go();
    /** 
      * tsd/browser/lib.es6.d.ts@489703
     */
    public native void go(@DoNotAutobox Number delta /* optional */);
    public native void pushState(Object data, String title);
    /** 
      * tsd/browser/lib.es6.d.ts@489733
     */
    public native void pushState(Object data, String title, String url /* optional */);
    public native void replaceState(Object data, String title);
    /** 
      * tsd/browser/lib.es6.d.ts@489801
     */
    public native void replaceState(Object data, String title, String url /* optional */);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
    @JsProperty(name = "scrollRestoration")
    public native void setScrollRestoration(String value);
    @JsProperty(name = "state")
    public native void setState(Object value);
}
