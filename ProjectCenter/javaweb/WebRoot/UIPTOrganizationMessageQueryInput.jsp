<%--
****************************************************************************
* DESC       ��ũ��ƽ̨�������ݲ�ѯ
* AUTHOR     ��weiqiankun
* CREATEDATE ��2016-01-12
* MODIFYLIST ��  Name      Date     Reason/Contents
*          --------------------------------------------------
****************************************************************************
--%>
<%@page errorPage="/UIErrorPage"%>
<%@page import="com.sinosoft.utility.string.Date"%>
<%@page import="com.sinosoft.utility.string.ChgDate"%>
<%
	ChgDate idate = new ChgDate();
	String strDate  = idate.getCurrentTime("yyyy-MM-dd");
	com.sinosoft.utility.string.Date sinosoftDate = new com.sinosoft.utility.string.Date();
	sinosoftDate.set(sinosoftDate.DATE,sinosoftDate.get(sinosoftDate.DATE)-2);
	String strPreWeekDate = idate.toFormat(sinosoftDate.getString(sinosoftDate.YEAR+sinosoftDate.MONTH+sinosoftDate.DATE));
	
%>
<html>
  <head>
    <title>ũ��ƽ̨�������ݲ�ѯ����ҳ��</title>
    <link rel="stylesheet" type="text/css" href="/payment/css/Standard.css">
    <script src="/payment/commonship/sff/UISffCommon.js"></script>
    <script src="/payment/commonship/pub/UICommon.js"></script>
    <script src="/payment/commonship/pub/UICodeSelect.js"></script>
    <script src="/payment/commonship/sff/UICodeSelectPrepare.js"></script>
    <script language=javascript>
    var LISTDELIMITERNew = "\r\n";
      function submit1(field)
      {
        var operationStartDate = trim(fm.OperationStartDate.value);
        var operationEndDate = trim(fm.OperationEndDate.value);
        var batchNo = trim(fm.OperationBatchNo.value);//���κ�
        if(operationStartDate=="" || operationEndDate == ""){
        	alert("�����������䲻��Ϊ�գ�");
        	return false;
        }
        var a = /^(\d{4})-(\d{2})-(\d{2})$/;
        if (!a.test(operationStartDate)) { 
            alert("��ʼ���ڸ�ʽ����ȷ!") 
            return; 
        }
        var a = /^(\d{4})-(\d{2})-(\d{2})$/;
        if (!a.test(operationEndDate)) { 
            alert("��ֹ���ڸ�ʽ����ȷ!") 
            return; 
        }
        if(compareFullDate(operationStartDate,operationEndDate)== 1) {
            alert("������ֹ���ڱ�����ڲ�����ʼ���ڣ�");
            fm.OperationEndDate.focus();	  	
            return;
          }
        fm.buttonSubmit1.disabled = true;
        fm.buttonSubmit2.disabled = true;
        fm.action="../CreateExcel?bachNo="+batchNo;
      }

    </script>
  </head>
  <body>
    <form name=fm method=post>
      <table class="common1" cellpadding="4" cellspacing="1" align="center">
        <tr>
          <td class=formtitle colspan="4">ũ��ƽ̨�������ݲ�ѯ </td>
        </tr>
        <tr>
          <td class=title colspan="4" style="color:red" >������ʾ���뾡�����뾫ȷ�Ĳ�ѯ������Ʃ�磺���κŵȣ���������󽵵Ͳ�ѯ��Ч�ʣ�</td>
        </tr>
        <tr>
          <td class=title>���κţ�</td>        
          <td class=input>
            <select class=query name="OperationBatchNoSign">
              <option value="=" selected>=&nbsp;</option>
  	        </select> 	    
            <input class=common maxLength=25 name="OperationBatchNo" value=""></td>   
             <td class=title>�����ţ�</td>        
          <td class=input>
            <select class=query name="OperationPolicyNoSign">
              <option value="=" selected>=&nbsp;</option>
  	        </select> 	    
            <input class=common maxLength=25 name="OperationPolicyNo" value=""></td> 
        </tr>
        <tr>
          <td class=title>���кţ�</td>        
          <td class=input>
            <select class=query name="OperationSerialNoSign">
              <option value="=" selected>=&nbsp;</option>
  	        </select> 	    
            <input class=common maxLength=25 name="OperationSerialNo" value=""></td> 
          <td class=title>�ӿ����ͣ�</td>        
          <td class=input>
            <select class=query name="OperationIntfaceTypeSign">
              <option value="=" selected>=&nbsp;</option>
  	        </select> 	
  	        <select class=query name="OperationIntfaceCode" style="width:200px">
              <option value=""></option>
              <option value="uploadClaimPayInfo">�ⰸ֧����Ϣ�ӿ�</option>
              <option value="uploadPrepaidPayInfo">Ԥ��֧����Ϣ�ӿ�</option>
              <option value="uploadPremiumPayInfo">����ʵ��/����Ϣ�ӿ�</option>
              <option value="uploadReturnedBillInfo">��Ʊ��Ϣ�ӿ�</option>
  	        </select>    
        </tr>
        <tr>
          <td class=title>���ڣ�</td>        
          <td class=input>
            <select class=query name="OperationDateStartSign">
              <option value=">=" selected>>=&nbsp;</option>
  	        </select> 	    
            <input class=common maxLength=19 name="OperationStartDate" value=<%=strPreWeekDate %>  onBlur="checkFullDate(this)"></td> 	
  	      <td class=title>���ڣ�</td>
          <td class=input>
            <select class=query name="OperationDateEndSign">
              <option value="<=" selected><=&nbsp;</option>
  	        </select> 	    
            <input class=common maxLength=19 name="OperationEndDate" value=<%=strDate%>  onBlur="checkFullDate(this)"></td>    
        </tr>
      </table>
      <table width=100%>
        <tr>
          <td class=button>
            <input class="button" type="button" name="buttonSubmit1" alt="��֯����" value="��֯����" onclick="submit1();">
            &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;
            <input class="button" type="button" name="buttonSubmit2" alt=" �� �� " value="�� ��" onclick="reset();">

          </td>
        </tr>
      </table>
      </form>
  </body>
</html>