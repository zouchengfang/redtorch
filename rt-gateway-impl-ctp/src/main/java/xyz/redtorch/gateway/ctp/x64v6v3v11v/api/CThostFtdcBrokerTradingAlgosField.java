/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v11v.api;

public class CThostFtdcBrokerTradingAlgosField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBrokerTradingAlgosField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerTradingAlgosField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpv6v3v11x64apiJNI.delete_CThostFtdcBrokerTradingAlgosField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingAlgosField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingAlgosField_BrokerID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingAlgosField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingAlgosField_ExchangeID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingAlgosField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingAlgosField_InstrumentID_get(swigCPtr, this);
  }

  public void setHandlePositionAlgoID(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingAlgosField_HandlePositionAlgoID_set(swigCPtr, this, value);
  }

  public char getHandlePositionAlgoID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingAlgosField_HandlePositionAlgoID_get(swigCPtr, this);
  }

  public void setFindMarginRateAlgoID(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingAlgosField_FindMarginRateAlgoID_set(swigCPtr, this, value);
  }

  public char getFindMarginRateAlgoID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingAlgosField_FindMarginRateAlgoID_get(swigCPtr, this);
  }

  public void setHandleTradingAccountAlgoID(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingAlgosField_HandleTradingAccountAlgoID_set(swigCPtr, this, value);
  }

  public char getHandleTradingAccountAlgoID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingAlgosField_HandleTradingAccountAlgoID_get(swigCPtr, this);
  }

  public CThostFtdcBrokerTradingAlgosField() {
    this(jctpv6v3v11x64apiJNI.new_CThostFtdcBrokerTradingAlgosField(), true);
  }

}
