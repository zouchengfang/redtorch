/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v13v.api;

public class CThostFtdcMdSpi {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMdSpi(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMdSpi obj) {
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
        jctpv6v3v13x64apiJNI.delete_CThostFtdcMdSpi(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_change_ownership(this, swigCPtr, true);
  }

  public void OnFrontConnected() {
    if (getClass() == CThostFtdcMdSpi.class) jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_OnFrontConnected(swigCPtr, this); else jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_OnFrontConnectedSwigExplicitCThostFtdcMdSpi(swigCPtr, this);
  }

  public void OnFrontDisconnected(int nReason) {
    if (getClass() == CThostFtdcMdSpi.class) jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_OnFrontDisconnected(swigCPtr, this, nReason); else jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_OnFrontDisconnectedSwigExplicitCThostFtdcMdSpi(swigCPtr, this, nReason);
  }

  public void OnHeartBeatWarning(int nTimeLapse) {
    if (getClass() == CThostFtdcMdSpi.class) jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_OnHeartBeatWarning(swigCPtr, this, nTimeLapse); else jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_OnHeartBeatWarningSwigExplicitCThostFtdcMdSpi(swigCPtr, this, nTimeLapse);
  }

  public void OnRspUserLogin(CThostFtdcRspUserLoginField pRspUserLogin, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    if (getClass() == CThostFtdcMdSpi.class) jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_OnRspUserLogin(swigCPtr, this, CThostFtdcRspUserLoginField.getCPtr(pRspUserLogin), pRspUserLogin, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast); else jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_OnRspUserLoginSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcRspUserLoginField.getCPtr(pRspUserLogin), pRspUserLogin, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast);
  }

  public void OnRspUserLogout(CThostFtdcUserLogoutField pUserLogout, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    if (getClass() == CThostFtdcMdSpi.class) jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_OnRspUserLogout(swigCPtr, this, CThostFtdcUserLogoutField.getCPtr(pUserLogout), pUserLogout, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast); else jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_OnRspUserLogoutSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcUserLogoutField.getCPtr(pUserLogout), pUserLogout, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast);
  }

  public void OnRspError(CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    if (getClass() == CThostFtdcMdSpi.class) jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_OnRspError(swigCPtr, this, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast); else jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_OnRspErrorSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast);
  }

  public void OnRspSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    if (getClass() == CThostFtdcMdSpi.class) jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_OnRspSubMarketData(swigCPtr, this, CThostFtdcSpecificInstrumentField.getCPtr(pSpecificInstrument), pSpecificInstrument, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast); else jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_OnRspSubMarketDataSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcSpecificInstrumentField.getCPtr(pSpecificInstrument), pSpecificInstrument, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast);
  }

  public void OnRspUnSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    if (getClass() == CThostFtdcMdSpi.class) jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_OnRspUnSubMarketData(swigCPtr, this, CThostFtdcSpecificInstrumentField.getCPtr(pSpecificInstrument), pSpecificInstrument, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast); else jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_OnRspUnSubMarketDataSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcSpecificInstrumentField.getCPtr(pSpecificInstrument), pSpecificInstrument, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast);
  }

  public void OnRspSubForQuoteRsp(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    if (getClass() == CThostFtdcMdSpi.class) jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_OnRspSubForQuoteRsp(swigCPtr, this, CThostFtdcSpecificInstrumentField.getCPtr(pSpecificInstrument), pSpecificInstrument, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast); else jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_OnRspSubForQuoteRspSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcSpecificInstrumentField.getCPtr(pSpecificInstrument), pSpecificInstrument, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast);
  }

  public void OnRspUnSubForQuoteRsp(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    if (getClass() == CThostFtdcMdSpi.class) jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_OnRspUnSubForQuoteRsp(swigCPtr, this, CThostFtdcSpecificInstrumentField.getCPtr(pSpecificInstrument), pSpecificInstrument, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast); else jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_OnRspUnSubForQuoteRspSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcSpecificInstrumentField.getCPtr(pSpecificInstrument), pSpecificInstrument, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast);
  }

  public void OnRtnDepthMarketData(CThostFtdcDepthMarketDataField pDepthMarketData) {
    if (getClass() == CThostFtdcMdSpi.class) jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_OnRtnDepthMarketData(swigCPtr, this, CThostFtdcDepthMarketDataField.getCPtr(pDepthMarketData), pDepthMarketData); else jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_OnRtnDepthMarketDataSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcDepthMarketDataField.getCPtr(pDepthMarketData), pDepthMarketData);
  }

  public void OnRtnForQuoteRsp(CThostFtdcForQuoteRspField pForQuoteRsp) {
    if (getClass() == CThostFtdcMdSpi.class) jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_OnRtnForQuoteRsp(swigCPtr, this, CThostFtdcForQuoteRspField.getCPtr(pForQuoteRsp), pForQuoteRsp); else jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_OnRtnForQuoteRspSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcForQuoteRspField.getCPtr(pForQuoteRsp), pForQuoteRsp);
  }

  public CThostFtdcMdSpi() {
    this(jctpv6v3v13x64apiJNI.new_CThostFtdcMdSpi(), true);
    jctpv6v3v13x64apiJNI.CThostFtdcMdSpi_director_connect(this, swigCPtr, true, true);
  }

}
