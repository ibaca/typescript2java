package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSManipulationEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 508809
  * declared in: tsd/browser/lib.es6.d.ts at pos 509624
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSManipulationEvent")
public class MSManipulationEvent extends UIEvent 
{

    /*
        Constructors
    */
    public MSManipulationEvent () {
        super((String) null, (UIEventInit) null); 
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="MSManipulationEvent", name="MS_MANIPULATION_STATE_ACTIVE")
    public static Number MS_MANIPULATION_STATE_ACTIVE;

    @JsProperty(namespace="MSManipulationEvent", name="MS_MANIPULATION_STATE_CANCELLED")
    public static Number MS_MANIPULATION_STATE_CANCELLED;

    @JsProperty(namespace="MSManipulationEvent", name="MS_MANIPULATION_STATE_COMMITTED")
    public static Number MS_MANIPULATION_STATE_COMMITTED;

    @JsProperty(namespace="MSManipulationEvent", name="MS_MANIPULATION_STATE_DRAGGING")
    public static Number MS_MANIPULATION_STATE_DRAGGING;

    @JsProperty(namespace="MSManipulationEvent", name="MS_MANIPULATION_STATE_INERTIA")
    public static Number MS_MANIPULATION_STATE_INERTIA;

    @JsProperty(namespace="MSManipulationEvent", name="MS_MANIPULATION_STATE_PRESELECT")
    public static Number MS_MANIPULATION_STATE_PRESELECT;

    @JsProperty(namespace="MSManipulationEvent", name="MS_MANIPULATION_STATE_SELECTING")
    public static Number MS_MANIPULATION_STATE_SELECTING;

    @JsProperty(namespace="MSManipulationEvent", name="MS_MANIPULATION_STATE_STOPPED")
    public static Number MS_MANIPULATION_STATE_STOPPED;

    /*
        Properties
    */

    public Number currentState;

    public Number inertiaDestinationX;

    public Number inertiaDestinationY;

    public Number lastState;

    /*
        Methods
    */
    @JsProperty(name = "currentState")
    public native Number getCurrentState();
    @JsProperty(name = "inertiaDestinationX")
    public native Number getInertiaDestinationX();
    @JsProperty(name = "inertiaDestinationY")
    public native Number getInertiaDestinationY();
    @JsProperty(name = "lastState")
    public native Number getLastState();
    @JsProperty(name = "MS_MANIPULATION_STATE_ACTIVE")
    public native Number getMS_MANIPULATION_STATE_ACTIVE();
    @JsProperty(name = "MS_MANIPULATION_STATE_CANCELLED")
    public native Number getMS_MANIPULATION_STATE_CANCELLED();
    @JsProperty(name = "MS_MANIPULATION_STATE_COMMITTED")
    public native Number getMS_MANIPULATION_STATE_COMMITTED();
    @JsProperty(name = "MS_MANIPULATION_STATE_DRAGGING")
    public native Number getMS_MANIPULATION_STATE_DRAGGING();
    @JsProperty(name = "MS_MANIPULATION_STATE_INERTIA")
    public native Number getMS_MANIPULATION_STATE_INERTIA();
    @JsProperty(name = "MS_MANIPULATION_STATE_PRESELECT")
    public native Number getMS_MANIPULATION_STATE_PRESELECT();
    @JsProperty(name = "MS_MANIPULATION_STATE_SELECTING")
    public native Number getMS_MANIPULATION_STATE_SELECTING();
    @JsProperty(name = "MS_MANIPULATION_STATE_STOPPED")
    public native Number getMS_MANIPULATION_STATE_STOPPED();
    /** 
      * tsd/browser/lib.es6.d.ts@509014
     */
    public native void initMSManipulationEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Window viewArg, @DoNotAutobox Number detailArg, @DoNotAutobox Number lastState, @DoNotAutobox Number currentState);
    @JsProperty(name = "currentState")
    public native void setCurrentState(@DoNotAutobox Number value);
    @JsProperty(name = "inertiaDestinationX")
    public native void setInertiaDestinationX(@DoNotAutobox Number value);
    @JsProperty(name = "inertiaDestinationY")
    public native void setInertiaDestinationY(@DoNotAutobox Number value);
    @JsProperty(name = "lastState")
    public native void setLastState(@DoNotAutobox Number value);
    @JsProperty(name = "MS_MANIPULATION_STATE_ACTIVE")
    public native void setMS_MANIPULATION_STATE_ACTIVE(@DoNotAutobox Number value);
    @JsProperty(name = "MS_MANIPULATION_STATE_CANCELLED")
    public native void setMS_MANIPULATION_STATE_CANCELLED(@DoNotAutobox Number value);
    @JsProperty(name = "MS_MANIPULATION_STATE_COMMITTED")
    public native void setMS_MANIPULATION_STATE_COMMITTED(@DoNotAutobox Number value);
    @JsProperty(name = "MS_MANIPULATION_STATE_DRAGGING")
    public native void setMS_MANIPULATION_STATE_DRAGGING(@DoNotAutobox Number value);
    @JsProperty(name = "MS_MANIPULATION_STATE_INERTIA")
    public native void setMS_MANIPULATION_STATE_INERTIA(@DoNotAutobox Number value);
    @JsProperty(name = "MS_MANIPULATION_STATE_PRESELECT")
    public native void setMS_MANIPULATION_STATE_PRESELECT(@DoNotAutobox Number value);
    @JsProperty(name = "MS_MANIPULATION_STATE_SELECTING")
    public native void setMS_MANIPULATION_STATE_SELECTING(@DoNotAutobox Number value);
    @JsProperty(name = "MS_MANIPULATION_STATE_STOPPED")
    public native void setMS_MANIPULATION_STATE_STOPPED(@DoNotAutobox Number value);
}
