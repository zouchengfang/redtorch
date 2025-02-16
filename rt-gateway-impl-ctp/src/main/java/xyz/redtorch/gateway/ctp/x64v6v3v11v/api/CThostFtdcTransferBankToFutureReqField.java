/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v11v.api;

public class CThostFtdcTransferBankToFutureReqField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTransferBankToFutureReqField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferBankToFutureReqField obj) {
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
        jctpv6v3v11x64apiJNI.delete_CThostFtdcTransferBankToFutureReqField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFutureAccount(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcTransferBankToFutureReqField_FutureAccount_set(swigCPtr, this, value);
  }

  public String getFutureAccount() {
    return jctpv6v3v11x64apiJNI.CThostFtdcTransferBankToFutureReqField_FutureAccount_get(swigCPtr, this);
  }

  public void setFuturePwdFlag(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcTransferBankToFutureReqField_FuturePwdFlag_set(swigCPtr, this, value);
  }

  public char getFuturePwdFlag() {
    return jctpv6v3v11x64apiJNI.CThostFtdcTransferBankToFutureReqField_FuturePwdFlag_get(swigCPtr, this);
  }

  public void setFutureAccPwd(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcTransferBankToFutureReqField_FutureAccPwd_set(swigCPtr, this, value);
  }

  public String getFutureAccPwd() {
    return jctpv6v3v11x64apiJNI.CThostFtdcTransferBankToFutureReqField_FutureAccPwd_get(swigCPtr, this);
  }

  public void setTradeAmt(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcTransferBankToFutureReqField_TradeAmt_set(swigCPtr, this, value);
  }

  public double getTradeAmt() {
    return jctpv6v3v11x64apiJNI.CThostFtdcTransferBankToFutureReqField_TradeAmt_get(swigCPtr, this);
  }

  public void setCustFee(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcTransferBankToFutureReqField_CustFee_set(swigCPtr, this, value);
  }

  public double getCustFee() {
    return jctpv6v3v11x64apiJNI.CThostFtdcTransferBankToFutureReqField_CustFee_get(swigCPtr, this);
  }

  public void setCurrencyCode(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcTransferBankToFutureReqField_CurrencyCode_set(swigCPtr, this, value);
  }

  public String getCurrencyCode() {
    return jctpv6v3v11x64apiJNI.CThostFtdcTransferBankToFutureReqField_CurrencyCode_get(swigCPtr, this);
  }

  public CThostFtdcTransferBankToFutureReqField() {
    this(jctpv6v3v11x64apiJNI.new_CThostFtdcTransferBankToFutureReqField(), true);
  }

}
