package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: WebGLActiveInfo
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 665323
  * declared in: tsd/browser/lib.es6.d.ts at pos 665448
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebGLActiveInfo")
public class WebGLActiveInfo
{

    /*
        Constructors
    */
    public WebGLActiveInfo () {
    } 

    /*
        Properties
    */

    public String name;

    public int size;

    public Number type;

    /*
        Methods
    */
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "size")
    public native Number getSize();
    @JsProperty(name = "type")
    public native Number getType();
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "size")
    public native void setSize(@DoNotAutobox Number value);
    @JsProperty(name = "type")
    public native void setType(@DoNotAutobox Number value);
}
