<%@page import="bean.classDAO"%>
<%@page import="bean.classVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="vo" class="bean.classVO"></jsp:useBean>
<jsp:setProperty property="*" name="vo"/>
<%
/*String cIntr = request.getParameter("class_intr");
String cType = request.getParameter("class_type");
String cAddr1 = request.getParameter("class_postcode");
String cAddr2 = request.getParameter("class_address");
String cAddr3 = request.getParameter("class_detailAddress");
String cAddr4 = request.getParameter("class_extraAddress");
String cTitle = request.getParameter("class_Name");
String cCurriculum = request.getParameter("class_Curri");
String cImg = request.getParameter("class_img_text");
String cLimit = request.getParameter("class_limit");
byte cLimit2 = Byte.parseByte(cLimit);
String cPrice = request.getParameter("class_Price");
int cPrice2 = Integer.parseInt(cPrice);*/

/* classVO vo = new classVO();
vo.setcTitle(cTitle);
vo.setcType(cType);
vo.setcAddress(cAddr1 + " " + cAddr2 + " " + cAddr3 + " " + cAddr4);
vo.setcIntr(cIntr);
vo.setcLimit(cLimit2);
vo.setcPrice(cPrice2);
vo.setcCurriculum(cCurriculum);
vo.setcImg(cImg); */

classDAO dao = new classDAO();
boolean result = dao.create(vo);
String check = "안들어감";
if (result) {
	check = "잘들어감";
}
%>
<%=check%>
