package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: WebGLContextAttributes
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 281533

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class WebGLContextAttributes
{

    /*
        Properties
    */

    public Boolean alpha;

    public Boolean antialias;

    public Boolean depth;

    public Boolean failIfMajorPerformanceCaveat;

    public Boolean premultipliedAlpha;

    public Boolean preserveDrawingBuffer;

    public Boolean stencil;

    /*
        Methods
    */
    @JsProperty(name = "alpha")
    public native Boolean getAlpha();
    @JsProperty(name = "antialias")
    public native Boolean getAntialias();
    @JsProperty(name = "depth")
    public native Boolean getDepth();
    @JsProperty(name = "failIfMajorPerformanceCaveat")
    public native Boolean getFailIfMajorPerformanceCaveat();
    @JsProperty(name = "premultipliedAlpha")
    public native Boolean getPremultipliedAlpha();
    @JsProperty(name = "preserveDrawingBuffer")
    public native Boolean getPreserveDrawingBuffer();
    @JsProperty(name = "stencil")
    public native Boolean getStencil();
    @JsProperty(name = "alpha")
    public native void setAlpha(Boolean value);
    @JsProperty(name = "antialias")
    public native void setAntialias(Boolean value);
    @JsProperty(name = "depth")
    public native void setDepth(Boolean value);
    @JsProperty(name = "failIfMajorPerformanceCaveat")
    public native void setFailIfMajorPerformanceCaveat(Boolean value);
    @JsProperty(name = "premultipliedAlpha")
    public native void setPremultipliedAlpha(Boolean value);
    @JsProperty(name = "preserveDrawingBuffer")
    public native void setPreserveDrawingBuffer(Boolean value);
    @JsProperty(name = "stencil")
    public native void setStencil(Boolean value);
}
