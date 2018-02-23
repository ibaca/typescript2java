package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSUtilization
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 266096

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MSUtilization
{

    /*
        Properties
    */

    public Number bandwidthEstimation;

    public Number bandwidthEstimationAvg;

    public Number bandwidthEstimationMax;

    public Number bandwidthEstimationMin;

    public Number bandwidthEstimationStdDev;

    public Number packets;

    /*
        Methods
    */
    @JsProperty(name = "bandwidthEstimation")
    public native Number getBandwidthEstimation();
    @JsProperty(name = "bandwidthEstimationAvg")
    public native Number getBandwidthEstimationAvg();
    @JsProperty(name = "bandwidthEstimationMax")
    public native Number getBandwidthEstimationMax();
    @JsProperty(name = "bandwidthEstimationMin")
    public native Number getBandwidthEstimationMin();
    @JsProperty(name = "bandwidthEstimationStdDev")
    public native Number getBandwidthEstimationStdDev();
    @JsProperty(name = "packets")
    public native Number getPackets();
    @JsProperty(name = "bandwidthEstimation")
    public native void setBandwidthEstimation(@DoNotAutobox Number value);
    @JsProperty(name = "bandwidthEstimationAvg")
    public native void setBandwidthEstimationAvg(@DoNotAutobox Number value);
    @JsProperty(name = "bandwidthEstimationMax")
    public native void setBandwidthEstimationMax(@DoNotAutobox Number value);
    @JsProperty(name = "bandwidthEstimationMin")
    public native void setBandwidthEstimationMin(@DoNotAutobox Number value);
    @JsProperty(name = "bandwidthEstimationStdDev")
    public native void setBandwidthEstimationStdDev(@DoNotAutobox Number value);
    @JsProperty(name = "packets")
    public native void setPackets(@DoNotAutobox Number value);
}
