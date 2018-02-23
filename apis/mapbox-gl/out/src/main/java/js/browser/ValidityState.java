package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ValidityState
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 661259
  * declared in: tsd/browser/lib.es6.d.ts at pos 661650
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ValidityState")
public class ValidityState
{

    /*
        Constructors
    */
    public ValidityState () {
    } 

    /*
        Properties
    */

    public Boolean badInput;

    public Boolean customError;

    public Boolean patternMismatch;

    public Boolean rangeOverflow;

    public Boolean rangeUnderflow;

    public Boolean stepMismatch;

    public Boolean tooLong;

    public Boolean typeMismatch;

    public Boolean valid;

    public Boolean valueMissing;

    /*
        Methods
    */
    @JsProperty(name = "badInput")
    public native Boolean getBadInput();
    @JsProperty(name = "customError")
    public native Boolean getCustomError();
    @JsProperty(name = "patternMismatch")
    public native Boolean getPatternMismatch();
    @JsProperty(name = "rangeOverflow")
    public native Boolean getRangeOverflow();
    @JsProperty(name = "rangeUnderflow")
    public native Boolean getRangeUnderflow();
    @JsProperty(name = "stepMismatch")
    public native Boolean getStepMismatch();
    @JsProperty(name = "tooLong")
    public native Boolean getTooLong();
    @JsProperty(name = "typeMismatch")
    public native Boolean getTypeMismatch();
    @JsProperty(name = "valid")
    public native Boolean getValid();
    @JsProperty(name = "valueMissing")
    public native Boolean getValueMissing();
    @JsProperty(name = "badInput")
    public native void setBadInput(Boolean value);
    @JsProperty(name = "customError")
    public native void setCustomError(Boolean value);
    @JsProperty(name = "patternMismatch")
    public native void setPatternMismatch(Boolean value);
    @JsProperty(name = "rangeOverflow")
    public native void setRangeOverflow(Boolean value);
    @JsProperty(name = "rangeUnderflow")
    public native void setRangeUnderflow(Boolean value);
    @JsProperty(name = "stepMismatch")
    public native void setStepMismatch(Boolean value);
    @JsProperty(name = "tooLong")
    public native void setTooLong(Boolean value);
    @JsProperty(name = "typeMismatch")
    public native void setTypeMismatch(Boolean value);
    @JsProperty(name = "valid")
    public native void setValid(Boolean value);
    @JsProperty(name = "valueMissing")
    public native void setValueMissing(Boolean value);
}
