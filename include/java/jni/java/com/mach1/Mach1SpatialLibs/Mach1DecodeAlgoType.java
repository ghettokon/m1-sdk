/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mach1.Mach1SpatialLibs;

public final class Mach1DecodeAlgoType {
  public final static Mach1DecodeAlgoType Mach1DecodeAlgoSpatial = new Mach1DecodeAlgoType("Mach1DecodeAlgoSpatial", Mach1DecodeModuleJNI.Mach1DecodeAlgoSpatial_get());
  public final static Mach1DecodeAlgoType Mach1DecodeAlgoAltSpatial = new Mach1DecodeAlgoType("Mach1DecodeAlgoAltSpatial");
  public final static Mach1DecodeAlgoType Mach1DecodeAlgoHorizon = new Mach1DecodeAlgoType("Mach1DecodeAlgoHorizon");
  public final static Mach1DecodeAlgoType Mach1DecodeAlgoHorizonPairs = new Mach1DecodeAlgoType("Mach1DecodeAlgoHorizonPairs");
  public final static Mach1DecodeAlgoType Mach1DecodeAlgoSpatialPairs = new Mach1DecodeAlgoType("Mach1DecodeAlgoSpatialPairs");
  public final static Mach1DecodeAlgoType Mach1DecodeAlgoSpatialPlus = new Mach1DecodeAlgoType("Mach1DecodeAlgoSpatialPlus");
  public final static Mach1DecodeAlgoType Mach1DecodeAlgoSpatialPlusPlus = new Mach1DecodeAlgoType("Mach1DecodeAlgoSpatialPlusPlus");
  public final static Mach1DecodeAlgoType Mach1DecodeAlgoSpatialExt = new Mach1DecodeAlgoType("Mach1DecodeAlgoSpatialExt");
  public final static Mach1DecodeAlgoType Mach1DecodeAlgoSpatialExtPlus = new Mach1DecodeAlgoType("Mach1DecodeAlgoSpatialExtPlus");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static Mach1DecodeAlgoType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + Mach1DecodeAlgoType.class + " with value " + swigValue);
  }

  private Mach1DecodeAlgoType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private Mach1DecodeAlgoType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private Mach1DecodeAlgoType(String swigName, Mach1DecodeAlgoType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static Mach1DecodeAlgoType[] swigValues = { Mach1DecodeAlgoSpatial, Mach1DecodeAlgoAltSpatial, Mach1DecodeAlgoHorizon, Mach1DecodeAlgoHorizonPairs, Mach1DecodeAlgoSpatialPairs, Mach1DecodeAlgoSpatialPlus, Mach1DecodeAlgoSpatialPlusPlus, Mach1DecodeAlgoSpatialExt, Mach1DecodeAlgoSpatialExtPlus };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
