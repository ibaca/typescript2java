package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: DragEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 363893
  * declared in: tsd/browser/lib.es6.d.ts at pos 364437
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DragEvent")
public class DragEvent extends MouseEvent 
{

    /*
        Constructors
    */
    public DragEvent () {
        super((String) null, (MouseEventInit) null); 
    } 

    /*
        Properties
    */

    public DataTransfer dataTransfer;

    /*
        Methods
    */
    @JsProperty(name = "dataTransfer")
    public native DataTransfer getDataTransfer();
    /** 
      * tsd/browser/lib.es6.d.ts@363981
     */
    public native void initDragEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Window viewArg, @DoNotAutobox Number detailArg, @DoNotAutobox Number screenXArg, @DoNotAutobox Number screenYArg, @DoNotAutobox Number clientXArg, @DoNotAutobox Number clientYArg, Boolean ctrlKeyArg, Boolean altKeyArg, Boolean shiftKeyArg, Boolean metaKeyArg, @DoNotAutobox Number buttonArg, EventTarget relatedTargetArg, DataTransfer dataTransferArg);
    public native void msConvertURL(File file, String targetType);
    /** 
      * tsd/browser/lib.es6.d.ts@364351
     */
    public native void msConvertURL(File file, String targetType, String targetURL /* optional */);
    @JsProperty(name = "dataTransfer")
    public native void setDataTransfer(DataTransfer value);
}
