package bean;

import java.sql.Date;
import java.sql.Time;

public class classVO {
	private int cCode;
	private String tCrt; // 자격증 
	private String cImg; // 강의사진
	private String cInfo;// 강의소개
	private String cType; // 강의분야
	private String cAddress; // 강의 주소
	private String cTitle; // 강의이름
	private String cCurriculum; // 강의커리큘럼
	private int cLimit;// 인원수제한
	private int cPrice;// 가격
	private String cDay; // 강의날짜
	private String cTime; // 강의 시간
	private String tID; //강사아이디
	public int getcCode() {
		return cCode;
	}
	public void setcCode(int cCode) {
		this.cCode = cCode;
	}
	public String gettCrt() {
		return tCrt;
	}
	public void settCrt(String tCrt) {
		this.tCrt = tCrt;
	}
	public String getcImg() {
		return cImg;
	}
	public void setcImg(String cImg) {
		this.cImg = cImg;
	}
	public String getcInfo() {
		return cInfo;
	}
	public void setcInfo(String cInfo) {
		this.cInfo = cInfo;
	}
	public String getcType() {
		return cType;
	}
	public void setcType(String cType) {
		this.cType = cType;
	}
	public String getcAddress() {
		return cAddress;
	}
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	public String getcTitle() {
		return cTitle;
	}
	public void setcTitle(String cTitle) {
		this.cTitle = cTitle;
	}
	public String getcCurriculum() {
		return cCurriculum;
	}
	public void setcCurriculum(String cCurriculum) {
		this.cCurriculum = cCurriculum;
	}
	public int getcLimit() {
		return cLimit;
	}
	public void setcLimit(int cLimit) {
		this.cLimit = cLimit;
	}
	public int getcPrice() {
		return cPrice;
	}
	public void setcPrice(int cPrice) {
		this.cPrice = cPrice;
	}
	public String getcDay() {
		return cDay;
	}
	public void setcDay(String cDay) {
		this.cDay = cDay;
	}
	public String getcTime() {
		return cTime;
	}
	public void setcTime(String cTime) {
		this.cTime = cTime;
	}
	public String gettID() {
		return tID;
	}
	public void settID(String tID) {
		this.tID = tID;
	}
}
