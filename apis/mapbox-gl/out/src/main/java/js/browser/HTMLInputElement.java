package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLInputElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 425168
  * declared in: tsd/browser/lib.es6.d.ts at pos 433118
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLInputElement")
public class HTMLInputElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLInputElement () {
    } 

    /*
        Properties
    */

    /** 
      * Sets or retrieves a comma-separated list of content types.
     */
    public String accept;

    /** 
      * Sets or retrieves how the object is aligned with adjacent text.
     */
    public String align;

    /** 
      * Sets or retrieves a text alternative to the graphic.
     */
    public String alt;

    /** 
      * Specifies whether autocomplete is applied to an editable text field.
     */
    public String autocomplete;

    /** 
      * Provides a way to direct a user to a specific field when a document loads. This can provide both direction and convenience for a user, reducing the need to click or tab to a field when a page opens. This attribute is true when present on an element, and false when missing.
     */
    public Boolean autofocus;

    /** 
      * Sets or retrieves the width of the border to draw around the object.
     */
    public String border;

    /** 
      * Sets or retrieves the state of the check box or radio button.
     */
    public Boolean checked;

    public Number childElementCount;

    public HTMLCollection children;

    /** 
      * Retrieves whether the object is fully loaded.
     */
    public Boolean complete;

    /** 
      * Sets or retrieves the state of the check box or radio button.
     */
    public Boolean defaultChecked;

    /** 
      * Sets or retrieves the initial contents of the object.
     */
    public String defaultValue;

    public Boolean disabled;

    /** 
      * Returns a FileList object on a file type input object.
     */
    public FileList files;

    public Element firstElementChild;

    /** 
      * Retrieves a reference to the form that the object is embedded in. 
     */
    public HTMLFormElement form;

    /** 
      * Overrides the action attribute (where the data on a form is sent) on the parent form element.
     */
    public String formAction;

    /** 
      * Used to override the encoding (formEnctype attribute) specified on the form element.
     */
    public String formEnctype;

    /** 
      * Overrides the submit method attribute previously specified on a form element.
     */
    public String formMethod;

    /** 
      * Overrides any validation or required attributes on a form or form elements to allow it to be submitted without validation. This can be used to create a "save draft"-type submit option.
     */
    public String formNoValidate;

    /** 
      * Overrides the target attribute on a form element.
     */
    public String formTarget;

    /** 
      * Sets or retrieves the height of the object.
     */
    public String height;

    /** 
      * Sets or retrieves the width of the border to draw around the object.
     */
    public Number hspace;

    public Boolean indeterminate;

    public Element lastElementChild;

    /** 
      * Specifies the ID of a pre-defined datalist of options for an input element.
     */
    public HTMLElement list;

    /** 
      * Defines the maximum acceptable value for an input element with type="number".When used with the min and step attributes, lets you control the range and increment (such as only even numbers) that the user can enter into an input field.
     */
    public String max;

    /** 
      * Sets or retrieves the maximum number of characters that the user can enter in a text control.
     */
    public Number maxLength;

    /** 
      * Defines the minimum acceptable value for an input element with type="number". When used with the max and step attributes, lets you control the range and increment (such as even numbers only) that the user can enter into an input field.
     */
    public String min;

    public Number minLength;

    /** 
      * Sets or retrieves the Boolean value indicating whether multiple items can be selected from a list.
     */
    public Boolean multiple;

    /** 
      * Sets or retrieves the name of the object.
     */
    public String name;

    public Element nextElementSibling;

    public Function1<PointerEvent, Object> onpointercancel;

    public Function1<PointerEvent, Object> onpointerdown;

    public Function1<PointerEvent, Object> onpointerenter;

    public Function1<PointerEvent, Object> onpointerleave;

    public Function1<PointerEvent, Object> onpointermove;

    public Function1<PointerEvent, Object> onpointerout;

    public Function1<PointerEvent, Object> onpointerover;

    public Function1<PointerEvent, Object> onpointerup;

    public Function1<WheelEvent, Object> onwheel;

    /** 
      * Gets or sets a string containing a regular expression that the user's input must match.
     */
    public String pattern;

    /** 
      * Gets or sets a text string that is displayed in an input field as a hint or prompt to users as the format or type of information they need to enter.The text appears in an input field until the user puts focus on the field.
     */
    public String placeholder;

    public Element previousElementSibling;

    public Boolean readOnly;

    /** 
      * When present, marks an element that can't be submitted without a value.
     */
    public Boolean required;

    public String selectionDirection;

    /** 
      * Gets or sets the end position or offset of a text selection.
     */
    public Number selectionEnd;

    /** 
      * Gets or sets the starting position or offset of a text selection.
     */
    public Number selectionStart;

    public int size;

    /** 
      * The address or URL of the a media resource that is to be considered.
     */
    public String src;

    public Boolean status;

    /** 
      * Defines an increment or jump between values that you want to allow the user to enter. When used with the max and min attributes, lets you control the range and increment (for example, allow only even numbers) that the user can enter into an input field.
     */
    public String step;

    /** 
      * Returns the content type of the object.
     */
    public String type;

    /** 
      * Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map.
     */
    public String useMap;

    /** 
      * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
     */
    public String validationMessage;

    /** 
      * Returns a  ValidityState object that represents the validity states of an element.
     */
    public ValidityState validity;

    /** 
      * Returns the value of the data at the cursor's current position.
     */
    public String value;

    public Date valueAsDate;

    /** 
      * Returns the input field value as a number.
     */
    public Number valueAsNumber;

    /** 
      * Sets or retrieves the vertical margin for the object.
     */
    public Number vspace;

    public Boolean webkitdirectory;

    /** 
      * Sets or retrieves the width of the object.
     */
    public String width;

    /** 
      * Returns whether an element will successfully validate based on forms validation rules and constraints.
     */
    public Boolean willValidate;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@431550
      * Returns whether a form will validate when it is submitted, without having to submit it.
     */
    public native Boolean checkValidity();
    @JsProperty(name = "accept")
    public native String getAccept();
    @JsProperty(name = "align")
    public native String getAlign();
    @JsProperty(name = "alt")
    public native String getAlt();
    @JsProperty(name = "autocomplete")
    public native String getAutocomplete();
    @JsProperty(name = "autofocus")
    public native Boolean getAutofocus();
    @JsProperty(name = "border")
    public native String getBorder();
    @JsProperty(name = "checked")
    public native Boolean getChecked();
    @JsProperty(name = "complete")
    public native Boolean getComplete();
    @JsProperty(name = "defaultChecked")
    public native Boolean getDefaultChecked();
    @JsProperty(name = "defaultValue")
    public native String getDefaultValue();
    @JsProperty(name = "disabled")
    public native Boolean getDisabled();
    @JsProperty(name = "files")
    public native FileList getFiles();
    @JsProperty(name = "form")
    public native HTMLFormElement getForm();
    @JsProperty(name = "formAction")
    public native String getFormAction();
    @JsProperty(name = "formEnctype")
    public native String getFormEnctype();
    @JsProperty(name = "formMethod")
    public native String getFormMethod();
    @JsProperty(name = "formNoValidate")
    public native String getFormNoValidate();
    @JsProperty(name = "formTarget")
    public native String getFormTarget();
    @JsProperty(name = "height")
    public native String getHeight();
    @JsProperty(name = "hspace")
    public native Number getHspace();
    @JsProperty(name = "indeterminate")
    public native Boolean getIndeterminate();
    @JsProperty(name = "list")
    public native HTMLElement getList();
    @JsProperty(name = "max")
    public native String getMax();
    @JsProperty(name = "maxLength")
    public native Number getMaxLength();
    @JsProperty(name = "min")
    public native String getMin();
    @JsProperty(name = "minLength")
    public native Number getMinLength();
    @JsProperty(name = "multiple")
    public native Boolean getMultiple();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "pattern")
    public native String getPattern();
    @JsProperty(name = "placeholder")
    public native String getPlaceholder();
    @JsProperty(name = "readOnly")
    public native Boolean getReadOnly();
    @JsProperty(name = "required")
    public native Boolean getRequired();
    @JsProperty(name = "selectionDirection")
    public native String getSelectionDirection();
    @JsProperty(name = "selectionEnd")
    public native Number getSelectionEnd();
    @JsProperty(name = "selectionStart")
    public native Number getSelectionStart();
    @JsProperty(name = "size")
    public native Number getSize();
    @JsProperty(name = "src")
    public native String getSrc();
    @JsProperty(name = "status")
    public native Boolean getStatus();
    @JsProperty(name = "step")
    public native String getStep();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "useMap")
    public native String getUseMap();
    @JsProperty(name = "validationMessage")
    public native String getValidationMessage();
    @JsProperty(name = "validity")
    public native ValidityState getValidity();
    @JsProperty(name = "value")
    public native String getValue();
    @JsProperty(name = "valueAsDate")
    public native Date getValueAsDate();
    @JsProperty(name = "valueAsNumber")
    public native Number getValueAsNumber();
    @JsProperty(name = "vspace")
    public native Number getVspace();
    @JsProperty(name = "webkitdirectory")
    public native Boolean getWebkitdirectory();
    @JsProperty(name = "width")
    public native String getWidth();
    @JsProperty(name = "willValidate")
    public native Boolean getWillValidate();
    /** 
      * tsd/browser/lib.es6.d.ts@431654
      * Makes the selection equal to the current object.
     */
    public native void select();
    @JsProperty(name = "accept")
    public native void setAccept(String value);
    @JsProperty(name = "align")
    public native void setAlign(String value);
    @JsProperty(name = "alt")
    public native void setAlt(String value);
    @JsProperty(name = "autocomplete")
    public native void setAutocomplete(String value);
    @JsProperty(name = "autofocus")
    public native void setAutofocus(Boolean value);
    @JsProperty(name = "border")
    public native void setBorder(String value);
    @JsProperty(name = "checked")
    public native void setChecked(Boolean value);
    @JsProperty(name = "complete")
    public native void setComplete(Boolean value);
    /** 
      * tsd/browser/lib.es6.d.ts@431864
      * Sets a custom error message that is displayed when a form is submitted.
     */
    public native void setCustomValidity(String error);
    @JsProperty(name = "defaultChecked")
    public native void setDefaultChecked(Boolean value);
    @JsProperty(name = "defaultValue")
    public native void setDefaultValue(String value);
    @JsProperty(name = "disabled")
    public native void setDisabled(Boolean value);
    @JsProperty(name = "files")
    public native void setFiles(FileList value);
    @JsProperty(name = "form")
    public native void setForm(HTMLFormElement value);
    @JsProperty(name = "formAction")
    public native void setFormAction(String value);
    @JsProperty(name = "formEnctype")
    public native void setFormEnctype(String value);
    @JsProperty(name = "formMethod")
    public native void setFormMethod(String value);
    @JsProperty(name = "formNoValidate")
    public native void setFormNoValidate(String value);
    @JsProperty(name = "formTarget")
    public native void setFormTarget(String value);
    @JsProperty(name = "height")
    public native void setHeight(String value);
    @JsProperty(name = "hspace")
    public native void setHspace(@DoNotAutobox Number value);
    @JsProperty(name = "indeterminate")
    public native void setIndeterminate(Boolean value);
    @JsProperty(name = "list")
    public native void setList(HTMLElement value);
    @JsProperty(name = "max")
    public native void setMax(String value);
    @JsProperty(name = "maxLength")
    public native void setMaxLength(@DoNotAutobox Number value);
    @JsProperty(name = "min")
    public native void setMin(String value);
    @JsProperty(name = "minLength")
    public native void setMinLength(@DoNotAutobox Number value);
    @JsProperty(name = "multiple")
    public native void setMultiple(Boolean value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "pattern")
    public native void setPattern(String value);
    @JsProperty(name = "placeholder")
    public native void setPlaceholder(String value);
    @JsProperty(name = "readOnly")
    public native void setReadOnly(Boolean value);
    @JsProperty(name = "required")
    public native void setRequired(Boolean value);
    @JsProperty(name = "selectionDirection")
    public native void setSelectionDirection(String value);
    @JsProperty(name = "selectionEnd")
    public native void setSelectionEnd(@DoNotAutobox Number value);
    public native void setSelectionRange();
    public native void setSelectionRange(@DoNotAutobox Number start /* optional */);
    public native void setSelectionRange(@DoNotAutobox Number start /* optional */, @DoNotAutobox Number end /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@432162
      * Sets the start and end positions of a selection in a text field.
     */
    public native void setSelectionRange(@DoNotAutobox Number start /* optional */, @DoNotAutobox Number end /* optional */, String direction /* optional */);
    @JsProperty(name = "selectionStart")
    public native void setSelectionStart(@DoNotAutobox Number value);
    @JsProperty(name = "size")
    public native void setSize(@DoNotAutobox Number value);
    @JsProperty(name = "src")
    public native void setSrc(String value);
    @JsProperty(name = "status")
    public native void setStatus(Boolean value);
    @JsProperty(name = "step")
    public native void setStep(String value);
    @JsProperty(name = "type")
    public native void setType(String value);
    @JsProperty(name = "useMap")
    public native void setUseMap(String value);
    @JsProperty(name = "validationMessage")
    public native void setValidationMessage(String value);
    @JsProperty(name = "validity")
    public native void setValidity(ValidityState value);
    @JsProperty(name = "value")
    public native void setValue(String value);
    @JsProperty(name = "valueAsDate")
    public native void setValueAsDate(Date value);
    @JsProperty(name = "valueAsNumber")
    public native void setValueAsNumber(@DoNotAutobox Number value);
    @JsProperty(name = "vspace")
    public native void setVspace(@DoNotAutobox Number value);
    @JsProperty(name = "webkitdirectory")
    public native void setWebkitdirectory(Boolean value);
    @JsProperty(name = "width")
    public native void setWidth(String value);
    @JsProperty(name = "willValidate")
    public native void setWillValidate(Boolean value);
    public native void stepDown();
    /** 
      * tsd/browser/lib.es6.d.ts@432520
      * Decrements a range input control's value by the value given by the Step attribute. If the optional parameter is used, it will decrement the input control's step value multiplied by the parameter's value.
     */
    public native void stepDown(@DoNotAutobox Number n /* optional */);
    public native void stepUp();
    /** 
      * tsd/browser/lib.es6.d.ts@432801
      * Increments a range input control's value by the value given by the Step attribute. If the optional parameter is used, will increment the input control's value by that value.
     */
    public native void stepUp(@DoNotAutobox Number n /* optional */);
}
