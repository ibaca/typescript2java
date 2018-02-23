package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Text
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 653136
  * declared in: tsd/browser/lib.es6.d.ts at pos 653311
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Text")
public class Text extends CharacterData 
{

    /*
        Constructors
    */
    public Text () {
    } 

    /*
        Properties
    */

    public HTMLSlotElement assignedSlot;

    public String wholeText;

    /*
        Methods
    */
    @JsProperty(name = "assignedSlot")
    public native HTMLSlotElement getAssignedSlot();
    @JsProperty(name = "wholeText")
    public native String getWholeText();
    @JsProperty(name = "assignedSlot")
    public native void setAssignedSlot(HTMLSlotElement value);
    @JsProperty(name = "wholeText")
    public native void setWholeText(String value);
    /** 
      * tsd/browser/lib.es6.d.ts@653264
     */
    public native Text splitText(@DoNotAutobox Number offset);
}
