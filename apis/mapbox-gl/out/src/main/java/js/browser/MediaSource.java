package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaSource
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 520438
  * declared in: tsd/browser/lib.es6.d.ts at pos 520797
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaSource")
public class MediaSource extends EventTarget 
{

    /*
        Constructors
    */
    public MediaSource () {
    } 

    /*
        Static methods
    */

    /** 
      * source : tsd/browser/lib.es6.d.ts:520869
     */
    @JsMethod(namespace="MediaSource", name = "isTypeSupported")
    public static native Boolean isTypeSupported(String type);

    /*
        Properties
    */

    public SourceBufferList activeSourceBuffers;

    public Number duration;

    public String readyState;

    public SourceBufferList sourceBuffers;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@520641
     */
    public native SourceBuffer addSourceBuffer(String type);
    public native void endOfStream();
    /** 
      * tsd/browser/lib.es6.d.ts@520690
     */
    public native void endOfStream(@DoNotAutobox Number error /* optional */);
    @JsProperty(name = "activeSourceBuffers")
    public native SourceBufferList getActiveSourceBuffers();
    @JsProperty(name = "duration")
    public native Number getDuration();
    @JsProperty(name = "readyState")
    public native String getReadyState();
    @JsProperty(name = "sourceBuffers")
    public native SourceBufferList getSourceBuffers();
    /** 
      * tsd/browser/lib.es6.d.ts@520729
     */
    public native void removeSourceBuffer(SourceBuffer sourceBuffer);
    @JsProperty(name = "activeSourceBuffers")
    public native void setActiveSourceBuffers(SourceBufferList value);
    @JsProperty(name = "duration")
    public native void setDuration(@DoNotAutobox Number value);
    @JsProperty(name = "readyState")
    public native void setReadyState(String value);
    @JsProperty(name = "sourceBuffers")
    public native void setSourceBuffers(SourceBufferList value);
}
