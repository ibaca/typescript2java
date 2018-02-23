package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: WebGLShaderPrecisionFormat
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 699318
  * declared in: tsd/browser/lib.es6.d.ts at pos 699467
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebGLShaderPrecisionFormat")
public class WebGLShaderPrecisionFormat
{

    /*
        Constructors
    */
    public WebGLShaderPrecisionFormat () {
    } 

    /*
        Properties
    */

    public Number precision;

    public Number rangeMax;

    public Number rangeMin;

    /*
        Methods
    */
    @JsProperty(name = "precision")
    public native Number getPrecision();
    @JsProperty(name = "rangeMax")
    public native Number getRangeMax();
    @JsProperty(name = "rangeMin")
    public native Number getRangeMin();
    @JsProperty(name = "precision")
    public native void setPrecision(@DoNotAutobox Number value);
    @JsProperty(name = "rangeMax")
    public native void setRangeMax(@DoNotAutobox Number value);
    @JsProperty(name = "rangeMin")
    public native void setRangeMin(@DoNotAutobox Number value);
}
