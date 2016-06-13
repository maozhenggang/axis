package com.will.test;

import java.net.URL;
import java.util.Date;

import javax.xml.namespace.QName;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

/**
 * webservice
 * @author mzg
 */
public class CYSQService {

	/**
	 * 受理（街道办理）
	 */
	public static boolean SL(String YWLSH, String SJBBH, String SPSXBH, String SPSXZXBH, String YXTYWLSH, String SPSXMC, Integer GDBLSX, String GDBLSXDW, String GDSF, String XMMC, String FLGDGXD, String FSYWGXD, String SQDWHSQRXM, String SQDWJBRXM, String SQDWLXDH, String SQDWJBRSJ, String SQDWJBRYJ, String SLJGZZJGDM, String SLJGMC, String SLDWCBRXM, String SLDWCBRGH, String SLJTDD, Date SLSJ, String HZBH, String SLZLQD, String SLYF, String BSLYY, String TJFS, String STATUS, String INPUTMODE, String NET, Integer MAKEPERSON, Date MAKETIME, Integer SPPERSON, Date SPTIME, Integer SPSTATUS, String DEALRESULT, String MAKEPERNAME) {
		try {
			Service s = new Service();
			Call call = (Call) s.createCall();
			call.setTimeout(new Integer(5000));
			call.setOperationName(new QName("http://tempuri.org/", "sl"));
			call.setUseSOAPAction(true);
			call.setSOAPActionURI("http://tempuri.org/INewCYSQService/sl");
			call.setTargetEndpointAddress(new URL("http://10.180.227.251:801/NewCYSQService.svc?wsdl"));
			call.setEncodingStyle("UTF-8");
			call.addParameter(new QName("http://tempuri.org/", "YWLSH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SJBBH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPSXBH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPSXZXBH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "YXTYWLSH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPSXMC"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "GDBLSX"), org.apache.axis.encoding.XMLType.XSD_INT, javax.xml.rpc.ParameterMode.IN);//
			call.addParameter(new QName("http://tempuri.org/", "GDBLSXDW"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "GDSF"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "XMMC"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "FLGDGXD"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "FSYWGXD"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SQDWHSQRXM"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SQDWJBRXM"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SQDWLXDH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SQDWJBRSJ"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SQDWJBRYJ"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SLJGZZJGDM"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SLJGMC"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SLDWCBRXM"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SLDWCBRGH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SLJTDD"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SLSJ"), org.apache.axis.encoding.XMLType.XSD_DATETIME, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "HZBH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SLZLQD"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SLYF"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "BSLYY"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "TJFS"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "STATUS"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "INPUTMODE"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "NET"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "MAKEPERSON"), org.apache.axis.encoding.XMLType.XSD_INT, javax.xml.rpc.ParameterMode.IN);//
			call.addParameter(new QName("http://tempuri.org/", "MAKETIME"), org.apache.axis.encoding.XMLType.XSD_DATETIME, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPPERSON"), org.apache.axis.encoding.XMLType.XSD_INT, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPTIME"), org.apache.axis.encoding.XMLType.XSD_DATETIME, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPSTATUS"), org.apache.axis.encoding.XMLType.XSD_INT, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "DEALRESULT"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "MAKEPERNAME"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.setReturnType(org.apache.axis.encoding.XMLType.XSD_BOOLEAN);
			boolean result = (boolean) call.invoke(new Object[] { YWLSH, SJBBH, SPSXBH, SPSXZXBH, YXTYWLSH, SPSXMC, GDBLSX, GDBLSXDW, GDSF, XMMC, FLGDGXD, FSYWGXD, SQDWHSQRXM, SQDWJBRXM, SQDWLXDH, SQDWJBRSJ, SQDWJBRYJ, SLJGZZJGDM, SLJGMC, SLDWCBRXM, SLDWCBRGH, SLJTDD, SLSJ, HZBH, SLZLQD, SLYF, BSLYY, TJFS, STATUS, INPUTMODE, NET, MAKEPERSON, MAKETIME, SPPERSON, SPTIME, SPSTATUS, DEALRESULT, MAKEPERNAME });
			return result;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	/**
	 * 办结
	 */
	public static boolean BJ(String YWLSH, String SJBBH, String SPSXBH, String SPSXZXBH, String YXTYWLSH, String BJJGZZJGDM, String BJJGMC, Integer BJSJ, String BJJG, String BLJGMS, String ZFTHYY, String ZJMC, String ZJBH, String ZJYXQX, String FZDW, float SFJE, String JEDWDM, String BZ, String BYZDA, String BYZDB, String BYZDC, Date BYZDD, String STATUS, String INPUTMODE, String NET, Integer MAKEPERSON, Date MAKETIME, Integer SPPERSON, Date SPTIME, Integer SPSTATUS, String DEALRESULT, String MAKEPERNAME) {
		try {
			Service s = new Service();
			Call call = (Call) s.createCall();
			call.setTimeout(new Integer(5000));
			call.setOperationName(new QName("http://tempuri.org/", "bj"));
			call.setUseSOAPAction(true);
			call.setSOAPActionURI("http://tempuri.org/INewCYSQService/bj");
			call.setTargetEndpointAddress(new URL("http://10.180.227.251:801/NewCYSQService.svc?wsdl"));
			call.setEncodingStyle("UTF-8");
			call.addParameter(new QName("http://tempuri.org/", "YWLSH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SJBBH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPSXBH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPSXZXBH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "YXTYWLSH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "BJJGZZJGDM"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "BJJGMC"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "BJSJ"), org.apache.axis.encoding.XMLType.XSD_DATETIME, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "BJJG"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "BLJGMS"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "ZFTHYY"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "ZJMC"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "ZJBH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "ZJYXQX"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "FZDW"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SFJE"), org.apache.axis.encoding.XMLType.XSD_FLOAT, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "JEDWDM"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "BZ"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "BYZDA"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "BYZDB"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "BYZDC"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "BYZDD"), org.apache.axis.encoding.XMLType.XSD_DATETIME, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "STATUS"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "INPUTMODE"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "NET"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "MAKEPERSON"), org.apache.axis.encoding.XMLType.XSD_INT, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "MAKETIME"), org.apache.axis.encoding.XMLType.XSD_DATETIME, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPPERSON"), org.apache.axis.encoding.XMLType.XSD_INT, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPTIME"), org.apache.axis.encoding.XMLType.XSD_DATETIME, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPSTATUS"), org.apache.axis.encoding.XMLType.XSD_INT, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "DEALRESULT"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "MAKEPERNAME"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.setReturnType(org.apache.axis.encoding.XMLType.XSD_BOOLEAN);
			boolean result = (boolean) call.invoke(new Object[] { YWLSH, SJBBH, SPSXBH, SPSXZXBH, YXTYWLSH, BJJGZZJGDM, BJJGMC, BJSJ, BJJG, BLJGMS, ZFTHYY, ZJMC, ZJBH, ZJYXQX, FZDW, SFJE, JEDWDM, BZ, BYZDA, BYZDB, BYZDC, BYZDD, STATUS, INPUTMODE, NET, MAKEPERSON, MAKETIME, SPPERSON, SPTIME, SPSTATUS, DEALRESULT, MAKEPERNAME });
			return result;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	/**
	 * 审核
	 */
	public static boolean SC(String ywlsh, String sjbbh, String spsxbh, String spsxzxbh, String yxtywlsh, String schjmc, String scrmx, String scrzwmc, String scyj, String scjg, Date scsj, String bz, String byzd, String status, String inputmode, String net, Integer makeperson, Date maketime, Integer spperson, Date sptime, Integer spstatus, String dealresult, String makepername) {
		try {
			Service s = new Service();
			Call call = (Call) s.createCall();
			call.setTimeout(new Integer(5000));
			call.setOperationName(new QName("http://tempuri.org/", "sc"));
			call.setUseSOAPAction(true);
			call.setSOAPActionURI("http://tempuri.org/INewCYSQService/sc");
			call.setTargetEndpointAddress(new URL("http://10.180.227.251:801/NewCYSQService.svc?wsdl"));
			call.setEncodingStyle("UTF-8");
			call.addParameter(new QName("http://tempuri.org/", "ywlsh"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "sjbbh"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "spsxbh"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "spsxzxbh"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "yxtywlsh"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "schjmc"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "scrmx"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "scrzwmc"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "scyj"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "scjg"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "scsj"), org.apache.axis.encoding.XMLType.XSD_DATETIME, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "bz"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "byzd"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "status"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "inputmode"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "net"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "makeperson"), org.apache.axis.encoding.XMLType.XSD_INT, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "maketime"), org.apache.axis.encoding.XMLType.XSD_DATETIME, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "spperson"), org.apache.axis.encoding.XMLType.XSD_INT, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "sptime"), org.apache.axis.encoding.XMLType.XSD_DATETIME, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "spstatus"), org.apache.axis.encoding.XMLType.XSD_INT, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "dealresult"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "makepername"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.setReturnType(org.apache.axis.encoding.XMLType.XSD_BOOLEAN);
			boolean result = (boolean) call.invoke(new Object[] { ywlsh, sjbbh, spsxbh, spsxzxbh, yxtywlsh, schjmc, scrmx, scrzwmc, scyj, scjg, scsj, bz, byzd, status, inputmode, net, makeperson, maketime, spperson, sptime, spstatus, dealresult, makepername });
			return result;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	/**
	 * 决定
	 */
	public static boolean jd(String YWLSH, String SJBBH, String SPSXBH, String SPSXZXBH, String YXTYWLSH, String JDRXM, String JDRZWMC, String JDYJ, String JDJG, Date JDSJ, String SFQK, String BZ, String BYZD, String STATUS, String INPUTMODE, String NET, Integer MAKEPERSON, Date MAKETIME, Integer SPPERSON, Date SPTIME, Integer SPSTATUS, String DEALRESULT, String MAKEPERNAME) {
		try {
			Service s = new Service();
			Call call = (Call) s.createCall();
			call.setTimeout(new Integer(5000));
			call.setOperationName(new QName("http://tempuri.org/", "jd"));
			call.setUseSOAPAction(true);
			call.setSOAPActionURI("http://tempuri.org/INewCYSQService/jd");
			call.setTargetEndpointAddress(new URL("http://10.180.227.251:801/NewCYSQService.svc?wsdl"));
			call.setEncodingStyle("UTF-8");
			call.addParameter(new QName("http://tempuri.org/", "YWLSH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SJBBH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPSXBH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPSXZXBH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "YXTYWLSH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "JDRXM"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "JDRZWMC"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "JDYJ"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "JDJG"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "JDSJ"), org.apache.axis.encoding.XMLType.XSD_DATETIME, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SFQK"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "BZ"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "BYZD"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "STATUS"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "INPUTMODE"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "NET"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "MAKEPERSON"), org.apache.axis.encoding.XMLType.XSD_INT, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "MAKETIME"), org.apache.axis.encoding.XMLType.XSD_DATETIME, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPPERSON"), org.apache.axis.encoding.XMLType.XSD_INTEGER, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPTIME"), org.apache.axis.encoding.XMLType.XSD_DATETIME, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPSTATUS"), org.apache.axis.encoding.XMLType.XSD_INT, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "DEALRESULT"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "MAKEPERNAME"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.setReturnType(org.apache.axis.encoding.XMLType.XSD_BOOLEAN);
			boolean result = (boolean) call.invoke(new Object[] { YWLSH, SJBBH, SPSXBH, SPSXZXBH, YXTYWLSH, JDRXM, JDRZWMC, JDYJ, JDJG, JDSJ, SFQK, BZ, BYZD, STATUS, INPUTMODE, NET, MAKEPERSON, MAKETIME, SPPERSON, SPTIME, SPSTATUS, DEALRESULT, MAKEPERNAME });
			return result;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	/**
	 * 登记处理
	 */
	public static boolean DJCL(String YWLSH, String SJBBH, String SPSXBH, String SPSXZXBH, String YXTYWLSH, String SQR, String SQRSJ, String SQRDH, String SQRYX, Date SQSJ, String SQCLQD, String HZBH, String SQLY, String BZ, String BYZD, String STATUS, String INPUTMODE, String NET, String MAKEPERSON, Date MAKETIME, Integer SPPERSON, Date SPTIME, Integer SPSTATUS, String DEALRESULT, String MAKEPERNAME) {

		try {
			Service s = new Service();
			Call call = (Call) s.createCall();
			call.setTimeout(new Integer(5000));
			call.setOperationName(new QName("http://tempuri.org/", "DJCL"));
			call.setUseSOAPAction(true);
			call.setSOAPActionURI("http://tempuri.org/INewCYSQService/DJCL");
			call.setTargetEndpointAddress(new URL("http://10.180.227.251:801/NewCYSQService.svc?wsdl"));
			call.setEncodingStyle("UTF-8");
			call.addParameter(new QName("http://tempuri.org/", "YWLSH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SJBBH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPSXBH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPSXZXBH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "YXTYWLSH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SQR"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SQRSJ"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SQRDH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SQRYX"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SQSJ"), org.apache.axis.encoding.XMLType.XSD_DATETIME, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SQCLQD"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "HZBH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SQLY"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "BZ"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "BYZD"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "STATUS"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "INPUTMODE"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "NET"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "MAKEPERSON"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "MAKETIME"), org.apache.axis.encoding.XMLType.XSD_DATETIME, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPPERSON"), org.apache.axis.encoding.XMLType.XSD_INTEGER, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPTIME"), org.apache.axis.encoding.XMLType.XSD_DATETIME, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPSTATUS"), org.apache.axis.encoding.XMLType.XSD_INTEGER, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "DEALRESULT"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "MAKEPERNAME"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.setReturnType(org.apache.axis.encoding.XMLType.XSD_BOOLEAN);
			boolean result = (boolean) call.invoke(new Object[] { YWLSH, SJBBH, SPSXBH, SPSXZXBH, YXTYWLSH, SQR, SQRSJ, SQRDH, SQRYX, SQSJ, SQCLQD, HZBH, SQLY, BZ, BYZD, STATUS, INPUTMODE, NET, MAKEPERSON, MAKETIME, SPPERSON, SPTIME, SPSTATUS, DEALRESULT, MAKEPERNAME });
			return result;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	/**
	 * 根据流水号更新办结
	 */
	public static boolean updateBJ(String YWLSH, Integer SPPERSON, Date SPTIME, Integer SPSTATUS, String DEALRESULT) {
		try {
			Service s = new Service();
			Call call = (Call) s.createCall();
			call.setTimeout(new Integer(5000));
			call.setOperationName(new QName("http://tempuri.org/", "updateBJ"));
			call.setUseSOAPAction(true);
			call.setSOAPActionURI("http://tempuri.org/INewCYSQService/updateBJ");
			call.setTargetEndpointAddress(new URL("http://10.180.227.251:801/NewCYSQService.svc?wsdl"));
			call.setEncodingStyle("UTF-8");
			call.addParameter(new QName("http://tempuri.org/", "YWLSH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPPERSON"), org.apache.axis.encoding.XMLType.XSD_INT, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPTIME"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPSTATUS"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "DEALRESULT"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.setReturnType(org.apache.axis.encoding.XMLType.XSD_BOOLEAN);
			boolean result = (boolean) call.invoke(new Object[] { YWLSH, SPPERSON, SPTIME, SPSTATUS, DEALRESULT });
			return result;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	// 根据流水号更新审查
	public static boolean updateSC(String YWLSH, Integer SPPERSON, Date SPTIME, Integer SPSTATUS, String DEALRESULT) {
		try {
			Service s = new Service();
			Call call = (Call) s.createCall();
			call.setTimeout(new Integer(5000));
			call.setOperationName(new QName("http://tempuri.org/", "updateSC"));
			call.setUseSOAPAction(true);
			call.setSOAPActionURI("http://tempuri.org/INewCYSQService/updateSC");
			call.setTargetEndpointAddress(new URL("http://10.180.227.251:801/NewCYSQService.svc?wsdl"));
			call.setEncodingStyle("UTF-8");
			call.addParameter(new QName("http://tempuri.org/", "YWLSH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPPERSON"), org.apache.axis.encoding.XMLType.XSD_INT, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPTIME"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPSTATUS"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "DEALRESULT"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.setReturnType(org.apache.axis.encoding.XMLType.XSD_BOOLEAN);
			boolean result = (boolean) call.invoke(new Object[] { YWLSH, SPPERSON, SPTIME, SPSTATUS, DEALRESULT });
			return result;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	// 根据流水号更新决定
	public static boolean updateJD(String YWLSH, Integer SPPERSON, Date SPTIME, Integer SPSTATUS, String DEALRESULT) {
		try {
			Service s = new Service();
			Call call = (Call) s.createCall();
			call.setTimeout(new Integer(5000));
			call.setOperationName(new QName("http://tempuri.org/", "updateJD"));
			call.setUseSOAPAction(true);
			call.setSOAPActionURI("http://tempuri.org/INewCYSQService/updateJD");
			call.setTargetEndpointAddress(new URL("http://10.180.227.251:801/NewCYSQService.svc?wsdl"));
			call.setEncodingStyle("UTF-8");
			call.addParameter(new QName("http://tempuri.org/", "YWLSH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPPERSON"), org.apache.axis.encoding.XMLType.XSD_INT, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPTIME"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPSTATUS"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "DEALRESULT"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.setReturnType(org.apache.axis.encoding.XMLType.XSD_BOOLEAN);
			boolean result = (boolean) call.invoke(new Object[] { YWLSH, SPPERSON, SPTIME, SPSTATUS, DEALRESULT });
			return result;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	// 根据流水号更新受理
	public static boolean updateSL(String YWLSH, Integer SPPERSON, Date SPTIME, Integer SPSTATUS, String DEALRESULT) {
		try {
			Service s = new Service();
			Call call = (Call) s.createCall();
			call.setTimeout(new Integer(5000));
			call.setOperationName(new QName("http://tempuri.org/", "updateSL"));
			call.setUseSOAPAction(true);
			call.setSOAPActionURI("http://tempuri.org/INewCYSQService/updateSL");
			call.setTargetEndpointAddress(new URL("http://10.180.227.251:801/NewCYSQService.svc?wsdl"));
			call.setEncodingStyle("UTF-8");
			call.addParameter(new QName("http://tempuri.org/", "YWLSH"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPPERSON"), org.apache.axis.encoding.XMLType.XSD_INT, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPTIME"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "SPSTATUS"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("http://tempuri.org/", "DEALRESULT"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.setReturnType(org.apache.axis.encoding.XMLType.XSD_BOOLEAN);
			boolean result = (boolean) call.invoke(new Object[] { YWLSH, SPPERSON, SPTIME, SPSTATUS, DEALRESULT });
			return result;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

}
