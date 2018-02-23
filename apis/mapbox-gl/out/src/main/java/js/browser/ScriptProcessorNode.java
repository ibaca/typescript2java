package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ScriptProcessorNode
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 639583
  * declared in: tsd/browser/lib.es6.d.ts at pos 640060
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ScriptProcessorNode")
public class ScriptProcessorNode extends AudioNode 
{

    /*
        Constructors
    */
    public ScriptProcessorNode () {
    } 

    /*
        Properties
    */

    public Number bufferSize;

    public Function1<AudioProcessingEvent, Object> onaudioprocess;

    /*
        Methods
    */
    @JsProperty(name = "bufferSize")
    public native Number getBufferSize();
    @JsProperty(name = "onaudioprocess")
    public native Function1<AudioProcessingEvent, Object> getOnaudioprocess();
    @JsProperty(name = "bufferSize")
    public native void setBufferSize(@DoNotAutobox Number value);
    @JsProperty(name = "onaudioprocess")
    public native void setOnaudioprocess(Function1<AudioProcessingEvent, Object> value);
}
