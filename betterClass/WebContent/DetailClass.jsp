<%@page import="bean.classVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.classDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    String cTitle = "마자신있나";
    classDAO dao = new classDAO();
    ArrayList<classVO> list = dao.all(cTitle);
    classVO vo = list.get(0);
    String[] arr = vo.gettCrt().split(",");// 자격증 확장자를 slice 해주기위한 배열
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Better Class - 더 나은 내일</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
</head>
<body
	style="width: 100%; margin: auto; background-color: rgb(250, 250, 250);">
	<div
		style="display: inline-block; width: 100%; padding: 16px 4% 0px 4%;">
		<div
			style="display: inline-block; width: 100%; float: left; text-align: left;">
			<!-- <span
				style="display: inline-block; text-overflow: ellipsis; white-space: nowrap; overflow: hidden; float: left; font-size: 15px; width: 100%; color: #97CC98; font-weight: 500;text-align: center;">[원데이]
			</span> -->
			<span
				style="display: inline-block; width: 100%; font-size: 18px; font-weight: 700; color: #383838; line-height: 25px; text-align: center;"><span style="color: #97CC98; font-weight: 500;">[원데이]&nbsp;&nbsp;</span><%=vo.getcTitle()%></span>
		</div>
	</div>
	<div class="pop-tag-area" style="width: 834px; margin: auto;">
		<!--  <div class="pop-tag" style="width: 100%; margin: auto;">
                <div class="pop-tag-header" style="z-index: 9999; position: fixed; top: 0 "></div>
                <div class="pop-tag-contents" style="display:inline-block; width:100%; margin-top:70px; background-color:#fff;  "></div>
                <div class="pop-tag-footer"></div>
            </div> -->
		<div class="pop-tag" id="main"
			style="width: 100%; margin: auto; display: none;">
			<div class="pop-tag-header"
				style="z-index: 9999; position: fixed; top: 0px; display: none;">
				<header class="header-main">
					<div
						style="width: 100%; height: 50px; background: #fff; border: 0; opacity: 1; filter: alpha(opacity = 100); border-bottom: 1px solid #e7e7e7">
						<div style="display: table; width: 100%; height: 50px">
							<div
								style="display: table-cell; text-align: center; vertical-align: middle">
								<table
									style="width: 100%; border: 0; table-layout: fixed; height: 50px;">
									<tbody>
										<tr style="width: 100%">
											<td style="width: 30%; text-align: left; padding: 12px 4%"></td>
											<td style="width: 40%; text-align: center;"><span
												style="vertical-align: middle; width: 100%; display: inline-block"><img
													src="https://s3.ap-northeast-2.amazonaws.com/umclassupload/app/new_logo_2009.png"
													style="height: 20px;"></span></td>
											<td style="width: 30%; text-align: right; padding: 0 4%"><img
												class="main-menu" src="static/img/landing_menu.png"
												style="margin-left: 5px; padding: 5px; height: 30px;"></td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</header>
			</div>
			<div class="pop-tag-footer"></div>
		</div>
		<div class="pop-tag" id="event"
			style="width: 100%; margin: auto; display: none;">
			<div class="pop-tag-header"
				style="z-index: 9999; position: fixed; top: 70px; width: 834px;">
				<header class="header-main">
					<div
						style="width: 100%; height: 50px; background: #fff; border: 0; opacity: 1; filter: alpha(opacity = 100); border-bottom: 1px solid #e7e7e7">
						<div style="display: table; width: 100%; height: 50px">
							<div
								style="display: table-cell; text-align: center; vertical-align: middle">
								<table
									style="width: 100%; border: 0; table-layout: fixed; height: 50px;">
									<tbody>
										<tr style="width: 100%">
											<td class="back-icon"
												style="width: 15%; padding: 12px 4%; text-align: left;"></td>
											<td style="width: 70%; text-align: center; padding: 12px 4%"><span
												class="header-title-name"
												style="vertical-align: middle; width: 100%; height: 26px; text-overflow: ellipsis; overflow: hidden; white-space: nowrap; font-size: 16px; color: #424242; display: inline-block; font-family: 'NotoSansMedium'"></span></td>
											<td style="width: 15%; text-align: center;"></td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</header>
			</div>
			<div class="pop-tag-footer"></div>
		</div>
		<div class="pop-tag" id="class" style="width: 100%; margin: auto;">
			<div class="pop-tag-header"
				style="z-index: 999; position: fixed; top: 70px; width: 834px;">
				<header class="header-main">
					<div
						style="width: 100%; height: 50px; background: #fff; border: 0; opacity: 1; filter: alpha(opacity = 100); border-bottom: 1px solid #e7e7e7">
						<div style="display: table; width: 100%; height: 50px">
							<div
								style="display: table-cell; text-align: center; vertical-align: middle">
								<table
									style="width: 100%; border: 0; table-layout: fixed; height: 50px;">
									<tbody>
										<tr style="width: 100%">
											<td class="back-icon"
												style="width: 15%; padding: 12px 4%; text-align: left;"></td>
											<td style="width: 70%; text-align: center; padding: 12px 4%"><span
												class="header-title-name"
												style="vertical-align: middle; width: 100%; height: 26px; white-space: nowrap; font-size: 16px; color: #424242; display: inline-block; font-family: 'NotoSansMedium'"><%=vo.getcTitle() %></span></td>
											<td style="width: 15%; text-align: center;"></td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</header>
			</div>
			<div class="pop-tag-contents"
				style="display: inline-block; width: 100%; margin-top: 120px; background-color: rgb(255, 255, 255);">
				<div class="content-menu-pc"
					style="display: none; z-index: 999; width: 100%; background-color: #fff; position: fixed; top: 120px">
					<div class="first-btn-div-0"
						style="background-color: #fff; text-align: center; display: inline-block; width: 25%; height: 50px; border-bottom: 3px solid #97CC98; line-height: 50px;">
						<span class="first-btn-0"
							style="color: #383838; font-size: 15px; font-weight: 600;">클래스
							정보</span>
					</div>
					<div class="second-btn-div-0"
						style="background-color: #fff; text-align: center; display: inline-block; width: 25%; height: 50px; border-bottom: 3px solid #F0F0F0; line-height: 50px;">
						<span class="second-btn-0"
							style="color: #383838; font-size: 15px; font-weight: 600;">커리큘럼</span><br>
					</div>
					<div class="third-btn-div-0"
						style="background-color: #fff; text-align: center; display: inline-block; width: 25%; height: 50px; border-bottom: 3px solid #F0F0F0; line-height: 50px;">
						<span class="third-btn-0"
							style="color: #383838; font-size: 15px; font-weight: 600;">리뷰</span><br>
					</div>
					<div class="fourth-btn-div-0"
						style="background-color: #fff; text-align: center; display: inline-block; width: 25%; height: 50px; border-bottom: 3px solid #F0F0F0; line-height: 50px;">
						<span class="fourth-btn-0"
							style="color: #383838; font-size: 15px; font-weight: 600;">취소
							및 환불</span><br>
					</div>
				</div>

				<div class="voucher-contents" style="text-align: center;">
					<div class="voucher-main-img">
						<div
							class="class-topImg-slider swiper-container swiper-3 swiper-container-initialized swiper-container-horizontal">
							<div class="swiper-wrapper"
								style="transform: translate3d(0px, 0px, 0px); transition-duration: 0ms;">
								<div class="swiper-slide swiper-slide-active"
									style="color: rgb(255, 255, 255); background-image: url(&quot;https://s3.ap-northeast-2.amazonaws.com/umclassuploadboardimg/d4f6e0a51c9a4ec39152c029d07cc9a4.jpg&quot;); background-size: cover; background-position: center center; background-repeat: no-repeat; width: 834px; height: 417px;">
									<div class="first-item"
										data-src="https://s3.ap-northeast-2.amazonaws.com/umclassuploadboardimg/d4f6e0a51c9a4ec39152c029d07cc9a4.jpg"
										style="width: 100%; height: 417px; background-color: rgba(0, 0, 0, 0.1);">
										<!-- 메인이미지 -->
										<img
											src="https://s3.ap-northeast-2.amazonaws.com/umclassuploadboardimg/d4f6e0a51c9a4ec39152c029d07cc9a4.jpg"
											style="display: none">
									</div>
								</div>

							</div>

						</div>
					</div>
					<div class="scrap-menu-orignal"
						style="text-align: right; margin-top: -15px;">
						<img class="scrap-write" value=""
							src="https://umclassupload.s3.ap-northeast-2.amazonaws.com/app/class_scrap_icon_200901.png"
							style="display: inline-block; position: relative; z-index: 1; margin-top: -50px; margin-right: 10px; width: 25px; height: 25px;"><img
							class="academyVoucherTelContact"
							src="https://umclassupload.s3.ap-northeast-2.amazonaws.com/app/class_call_icon_200901.png"
							style="display: inline-block; position: relative; z-index: 1; margin-top: -50px; margin-right: 10px; width: 25px; height: 25px;">
					</div>
					<div
						style="display: inline-block; width: 100%; padding: 16px 4% 0px 4%;">
						<div
							style="display: inline-block; width: 100%; float: left; text-align: left;">
							<span
								style="display: inline-block; text-overflow: ellipsis; white-space: nowrap; overflow: hidden; float: left; font-size: 15px; width: 100%; color: #97CC98; font-weight: 500;">[원데이]
							</span><span
								style="display: inline-block; width: 100%; font-size: 18px; font-weight: 700; color: #383838; line-height: 25px;"><%=vo.getcTitle() %></span>
						</div>
					</div>
					<div
						style="display: inline-block; width: 100%; float: left; text-align: left; padding: 0px 4% 15px 4%; border-bottom: 1px solid #E6E6E6">

					</div>
					<div
						style="display: inline-block; width: 100%; float: left; text-align: left; padding: 11px 4% 11px 4%; border-bottom: 1px solid #E6E6E6">
						<div style="display: inline-block; width: 30%;">
							<span
								style="display: inline-block; font-size: 10px; font-weight: 600; color: #646464; margin-bottom: 5px;">분야</span><span
								style="display: inline-block; width: 100%; font-size: 15px; font-weight: 600; color: #2B2B2B"><%=vo.getcType() %></span>
						</div>
						<div style="display: inline-block; width: 30%;">
							<span
								style="display: inline-block; font-size: 10px; font-weight: 600; color: #646464; margin-bottom: 5px;">일정</span><span
								style="display: inline-block; width: 100%; font-size: 15px; font-weight: 600; color: #2B2B2B"><%=vo.getcDay() +"  "+ vo.getcTime()%></span>
						</div>
						<div style="display: inline-block; width: 30%;">
							<span
								style="display: inline-block; font-size: 10px; font-weight: 600; color: #646464; margin-bottom: 5px;">인원제한</span><span
								style="display: inline-block; width: 100%; font-size: 15px; font-weight: 600; color: #2B2B2B"><%=vo.getcLimit()+"명" %></span>
						</div>
					</div>
					<div
						style="display: inline-block; width: 100%; float: left; text-align: left; padding: 20px 4% 15px 4%;">
						<div
							style= "display: inline-block; width: 100%; padding: 0; text-align: center;">
							<!-- 이미지 원형으로 만드는 코드 -->
							<div
								style="display: inline-block; vertical-align: top; background-image: url(https://s3.ap-northeast-2.amazonaws.com/umclassuploadboardimg/4a26e49b000b4419ab558a0e75d982ab.jpg); background-size: cover; background-position: center center; background-repeat: no-repeat; border-radius: 100px; width: 69px; height: 69px; border: 1px solid #F2F2F2;"></div>
							<div
								style="display: inline-block; float: left; vertical-align: middle; width: 100%; margin-top: 5px;">
								<span
									style="display: -webkit-box; -webkit-box-orient: vertical; width: 100%; -webkit-line-clamp: 1; white-space: normal; overflow: hidden; text-overflow: ellipsis; float: left; font-size: 15px; font-weight: 600; color: #4A4A4A; margin-bottom: 5px;"><%=vo.getcTitle()%></span>
								<div class="starrr"
									style="display: inline-block; width: 100%; color: #B4B4B4; font-size: 12px; width: 100%; font-weight: 500;">
									<img src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 3px;">
									4.9 (39) - 별점?
								</div>
							</div>

						</div>
					</div>
					<span
						style="display: inline-block; float: left; width: 100%; height: 5px; background-color: #F5F5F5"></span>
					<div class="content-menu-orignal"
						style="display: inline-block; width: 100%;">
						<div class="first-btn-div-0"
							style="background-color: #fff; text-align: center; display: inline-block; width: 25%; height: 50px; border-bottom: 3px solid #97CC98; line-height: 50px;">
							<span class="first-btn-0"
								style="color: #383838; font-size: 15px; font-weight: 600;">클래스
								정보</span>
						</div>
						<div class="second-btn-div-0"
							style="background-color: #fff; text-align: center; display: inline-block; width: 25%; height: 50px; border-bottom: 3px solid #F0F0F0; line-height: 50px;">
							<span class="second-btn-0"
								style="color: #383838; font-size: 15px; font-weight: 600;">커리큘럼</span><br>
						</div>
						<div class="third-btn-div-0"
							style="background-color: #fff; text-align: center; display: inline-block; width: 25%; height: 50px; border-bottom: 3px solid #F0F0F0; line-height: 50px;">
							<span class="third-btn-0"
								style="color: #383838; font-size: 15px; font-weight: 600;">리뷰</span><br>
						</div>
						<div class="fourth-btn-div-0"
							style="background-color: #fff; text-align: center; display: inline-block; width: 25%; height: 50px; border-bottom: 3px solid #F0F0F0; line-height: 50px;">
							<span class="fourth-btn-0"
								style="color: #383838; font-size: 15px; font-weight: 600;">취소
								및 환불</span><br>
						</div>
					</div>
					<div style="text-align: left; width: 100%">
						<div class="contents-view"
							style="display: inline-block; width: 100%; margin-bottom: 65px;">
							<div class="class-info"
								style="display: inline-block; width: 100%; padding: 28px 4% 20px 4%; text-align: left">
								<span
									style="display: inline-block; background-color: #97CC98; width: 5px; height: 5px; border-radius: 100px; margin-right: 10px; margin-bottom: 2px;"></span><span
									style="font-size: 15px; color: #000; font-weight: 600;">클래스
									소개</span>
							</div>
							<div
								style="display: inline-block; width: 100%; padding: 0px 4% 28px 4%; text-align: left; border-bottom: 1px solid #E6E6E6;">
								<span
									style="font-size: 12px; vertical-align: middle; display: block; width: 100%; word-break: break-all; color: #707070; font-weight: 300;"><br><%=vo.gettCrt()%><br>
									<br></span>
									<span
									style="font-size: 12px; vertical-align: middle; display: block; width: 100%; word-break: break-all; color: #707070; font-weight: 300;"><br><%=vo.getcInfo()%><br>
									<br></span>
							</div>
							<div class="curriculum-info"
								style="display: inline-block; width: 100%; padding: 28px 4% 20px 4%; text-align: left">
								<span
									style="display: inline-block; background-color: #97CC98; width: 5px; height: 5px; border-radius: 100px; margin-right: 10px; margin-bottom: 2px;"></span><span
									style="font-size: 15px; color: #000; font-weight: 600;">커리큘럼</span>
								<span
									style="font-size: 12px; vertical-align: middle; display: block; width: 100%; word-break: break-all; color: #707070; font-weight: 300;"><br><%=vo.getcCurriculum()%><br>
									<br></span>
							</div>
							<div
								style="display: inline-block; width: 100%; padding: 28px 4% 20px 4%; text-align: left">
								<span
									style="display: inline-block; background-color: #97CC98; width: 5px; height: 5px; border-radius: 100px; margin-right: 10px; margin-bottom: 2px;"></span><span
									style="font-size: 15px; color: #000; font-weight: 600;">장소</span>
							</div>
							<div
								style="display: inline-block; width: 100%; text-align: left; padding: 0 4% 7px 4%;">
								<div
									style="display: inline-block; width: 747.28px; background-color: #ECF9ED; border-radius: 10px; padding: 10px; margin-left: 15px; float: left">
									<div
										style="display: inline-block; width: 25px; float: left; text-align: center;">
										<img
											src="https://umclassupload.s3.ap-northeast-2.amazonaws.com/app/gps_icon_200901.png"
											style="width: 16px; height: 16px;">
									</div>
									<div
										style="display: inline-block; width: 687.28px; float: left; text-align: left; margin-left: 10px; line-height: 20px;">
										<span
											style="display: inline-block; word-break: break-all; font-weight: 500px; font-size: 12px; color: #5F5F5F"><%=vo.getcAddress() %></span>
									</div>
								</div>
							</div>
							<div
								style="display: table; width: 100%; height: 100%; padding: 0 4% 23px 4%; border-bottom: 1px solid #E6E6E6;">
								<div class="academy-map-append"
									style="display: table-cell; vertical-align: middle; text-align: left; margin-left: 15px;">
									<!-- 구글지도 >> 난 다음지도를 가지고올거야 -->
									<input type="hidden" id="map_append_val"><span><iframe
											src="http://umclass.com/kakao_map_api_webview/37.54624239044232/127.04947783260856"
											style="width: 757.28px; margin-left: 10px; height: 250px; border: 0;"></iframe></span>
								</div>
							</div>
						</div>
						<!-- 리뷰 -->
						<div class="review-contents"
							style="display: inline-block; width: 100%;">
							<div class="review-info"
								style="display: inline-block; width: 100%; padding: 28px 4% 10px 4%; text-align: left">
								<span
									style="display: inline-block; background-color: #97CC98; width: 5px; height: 5px; border-radius: 100px; margin-right: 10px; margin-bottom: 2px;"></span><span
									class="review-count"
									style="font-size: 15px; color: #000; font-weight: 600;">리뷰(18)</span>
							</div>
							<div
								style="display: inline-block; width: 100%; padding: 0 4% 11px 4%; text-align: center; border-bottom: 1px solid #E6E6E6">
								<span
									style="display: inline-block; width: 100%; font-size: 25px; font-weight: 800; color: #454545; margin-bottom: 8px; line-height: 25px;">4.9</span><span
									style="display: inline-block; width: 100%; margin-bottom: 22px;"><img
									src="/static/img/review_able_icon_200901.png"
									style="width: 23px; height: 23px; margin-right: 3px;"><img
									src="/static/img/review_able_icon_200901.png"
									style="width: 23px; height: 23px; margin-right: 3px;"><img
									src="/static/img/review_able_icon_200901.png"
									style="width: 23px; height: 23px; margin-right: 3px;"><img
									src="/static/img/review_able_icon_200901.png"
									style="width: 23px; height: 23px; margin-right: 3px;"><img
									src="/static/img/review_harf_able_icon_200901.png"
									style="width: 23px; height: 23px;"></span><span
									class="review-write"
									style="display: inline-block; background-color: #97CC98; width: 100%; height: 50px; text-align: center; border-radius: 5px; font-size: 15px; color: #ffffff; font-weight: 700; line-height: 50px;">리뷰
									작성하기</span>
							</div>
							<div
								style="width: 100%; border-bottom: 1px solid #E6E6E6; padding: 16px 4%;">
								<div
									style="display: inline-block; width: 100%; margin-bottom: 3px;">
									<span
										style="font-size: 15px; margin-right: 10px; font-weight: 500; color: #707070;">star****</span><span
										style="margin-right: 10px"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px;"></span><span
										style="color: #b5b5b5; font-size: 11px; line-height: 10px; vertical-align: middle; font-weight: 500;">2020.06.22</span>
								</div>
								<div
									style="display: inline-block; width: 100%; margin-bottom: 10px;">
									<span
										style="display: inline-block; font-size: 13px; margin-right: 10px; color: #BDBDBD"><img
										src="https://s3.ap-northeast-2.amazonaws.com/umclassupload/app/review_umclass_200901.png"
										style="width: 20px; height: 20px;">[부산] 아크릴 무드등, 나만의 조명
										만들기 원데이 클래스</span>
								</div>
								<div
									style="display: inline-block; width: 100%; text-align: left">
									<span
										style="word-wrap: break-word; font-weight: 500; font-size: 12px; line-height: 15px; color: #707070">사실
										친구가 같이 수업들으러가자고 할때는 큰 기대 안했는데 생각보다 너무 재미있었어요 ㅠ,ㅠ 막상 가서 수업 들어보니
										너무 재미있고 완전 집중하게 되고 선생님도 너무 잘 챙겨주시구 수정하는 것도 도와주셔서 예쁜 작품 만들었습니다.
										다음에 남친이랑 기념일인데 기념일 선물로 또 만들까 생각중입니당당당 ^,^</span>
								</div>
							</div>
							<div
								style="width: 100%; border-bottom: 1px solid #E6E6E6; padding: 16px 4%;">
								<div
									style="display: inline-block; width: 100%; margin-bottom: 3px;">
									<span
										style="font-size: 15px; margin-right: 10px; font-weight: 500; color: #707070;">jung****</span><span
										style="margin-right: 10px"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px;"></span><span
										style="color: #b5b5b5; font-size: 11px; line-height: 10px; vertical-align: middle; font-weight: 500;">2020.06.11</span>
								</div>
								<div
									style="display: inline-block; width: 100%; margin-bottom: 10px;">
									<span
										style="display: inline-block; font-size: 13px; margin-right: 10px; color: #BDBDBD"><img
										src="https://s3.ap-northeast-2.amazonaws.com/umclassupload/app/review_naver_200114.png"
										style="width: 20px; height: 20px;">[부산] 아크릴 무드등, 나만의 조명
										만들기 원데이 클래스</span>
								</div>
								<div
									style="display: inline-block; width: 100%; text-align: left">
									<span
										style="word-wrap: break-word; font-weight: 500; font-size: 12px; line-height: 15px; color: #707070">기대한
										만큼 결과물이 이쁘게 만들어져서 만족합니다 중간에 실수를 해버려서 어쩌나 했는데 선생님께서 잘 수습해주셔서
										다행히 이쁘게 마무리 되었어요. 수업이 너무 재미있어서 완전 집중해서 들었던 기억이 나네요 ㅎㅎ </span>
								</div>
							</div>
							<div
								style="width: 100%; border-bottom: 1px solid #E6E6E6; padding: 16px 4%;">
								<div
									style="display: inline-block; width: 100%; margin-bottom: 3px;">
									<span
										style="font-size: 15px; margin-right: 10px; font-weight: 500; color: #707070;">rami****</span><span
										style="margin-right: 10px"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px;"></span><span
										style="color: #b5b5b5; font-size: 11px; line-height: 10px; vertical-align: middle; font-weight: 500;">2020.06.11</span>
								</div>
								<div
									style="display: inline-block; width: 100%; margin-bottom: 10px;">
									<span
										style="display: inline-block; font-size: 13px; margin-right: 10px; color: #BDBDBD"><img
										src="https://s3.ap-northeast-2.amazonaws.com/umclassupload/app/review_naver_200114.png"
										style="width: 20px; height: 20px;">[부산] 아크릴 무드등, 나만의 조명
										만들기 원데이 클래스</span>
								</div>
								<div
									style="display: inline-block; width: 100%; text-align: left">
									<span
										style="word-wrap: break-word; font-weight: 500; font-size: 12px; line-height: 15px; color: #707070">친구랑
										수업 같이 들었어요! 저는 좀 간단한 도안이고 친구가 복잡한 도안이었는데 진짜 꼼꼼하게 잘 설명해주시더라구요
										완전 감동..!!! 예쁘게 만드는 방법이나 꿀팁을 많이 알려주셔서 이쁜 작품 완성했어요.</span>
								</div>
							</div>
							<div
								style="width: 100%; border-bottom: 1px solid #E6E6E6; padding: 16px 4%;">
								<div
									style="display: inline-block; width: 100%; margin-bottom: 3px;">
									<span
										style="font-size: 15px; margin-right: 10px; font-weight: 500; color: #707070;">coco****</span><span
										style="margin-right: 10px"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px;"></span><span
										style="color: #b5b5b5; font-size: 11px; line-height: 10px; vertical-align: middle; font-weight: 500;">2020.06.05</span>
								</div>
								<div
									style="display: inline-block; width: 100%; margin-bottom: 10px;">
									<span
										style="display: inline-block; font-size: 13px; margin-right: 10px; color: #BDBDBD"><img
										src="https://s3.ap-northeast-2.amazonaws.com/umclassupload/app/review_umclass_200901.png"
										style="width: 20px; height: 20px;">[부산] 나만의 네온사인 원데이클래스</span>
								</div>
								<div
									style="display: inline-block; width: 100%; text-align: left">
									<span
										style="word-wrap: break-word; font-weight: 500; font-size: 12px; line-height: 15px; color: #707070">내손으로
										직접 만든 네온사인이라니! 너무 만족스러운 시간이였고 작품도 나무 잘나와서 기분이좋았습니다!! 다음에 또
										갈게요~</span>
								</div>
							</div>
							<div
								style="width: 100%; border-bottom: 1px solid #E6E6E6; padding: 16px 4%;">
								<div
									style="display: inline-block; width: 100%; margin-bottom: 3px;">
									<span
										style="font-size: 15px; margin-right: 10px; font-weight: 500; color: #707070;">hang****</span><span
										style="margin-right: 10px"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px;"></span><span
										style="color: #b5b5b5; font-size: 11px; line-height: 10px; vertical-align: middle; font-weight: 500;">2020.06.01</span>
								</div>
								<div
									style="display: inline-block; width: 100%; margin-bottom: 10px;">
									<span
										style="display: inline-block; font-size: 13px; margin-right: 10px; color: #BDBDBD"><img
										src="https://s3.ap-northeast-2.amazonaws.com/umclassupload/app/review_naver_200114.png"
										style="width: 20px; height: 20px;">[부산] 아크릴 무드등, 나만의 조명
										만들기 원데이 클래스</span>
								</div>
								<div
									style="display: inline-block; width: 100%; text-align: left">
									<span
										style="word-wrap: break-word; font-weight: 500; font-size: 12px; line-height: 15px; color: #707070">도안을
										자주 바꿧던 수강생입니다....ㅎㅎㅎ 귀찮으셨을 수도 있었을 텐데 계속 친절하게 상담해주시고 진짜 감사했습니다
										ㅠㅠ 남자친구한테 의미있는 선물을 해주고 싶어서 고민이 많았는데 선생님께서 친절하게 알려주셔서 진짜 이쁜 선물을
										할 수 있게 되었어요. 다음에는 남자친구랑 같이 가도록 할게요</span>
								</div>
							</div>
							<div
								style="width: 100%; border-bottom: 1px solid #E6E6E6; padding: 16px 4%;">
								<div
									style="display: inline-block; width: 100%; margin-bottom: 3px;">
									<span
										style="font-size: 15px; margin-right: 10px; font-weight: 500; color: #707070;">momo****</span><span
										style="margin-right: 10px"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px;"></span><span
										style="color: #b5b5b5; font-size: 11px; line-height: 10px; vertical-align: middle; font-weight: 500;">2020.05.28</span>
								</div>
								<div
									style="display: inline-block; width: 100%; margin-bottom: 10px;">
									<span
										style="display: inline-block; font-size: 13px; margin-right: 10px; color: #BDBDBD"><img
										src="https://s3.ap-northeast-2.amazonaws.com/umclassupload/app/review_umclass_200901.png"
										style="width: 20px; height: 20px;">[부산] 아크릴 무드등, 나만의 조명
										만들기 원데이 클래스</span>
								</div>
								<div
									style="display: inline-block; width: 100%; text-align: left">
									<span
										style="word-wrap: break-word; font-weight: 500; font-size: 12px; line-height: 15px; color: #707070">제가
										뭐 만드는데 소질이 없어서 걱정이 많았어요. 근데 선생님께서 예쁘게 만드는 요령을 알려주시더라구요. 덕분에 예쁜
										결과물을 완성할 수 잇었습니다. 다음에는 네온사인 만드는 수업들으러 갈게요~</span>
								</div>
							</div>
							<div
								style="width: 100%; border-bottom: 1px solid #E6E6E6; padding: 16px 4%;">
								<div
									style="display: inline-block; width: 100%; margin-bottom: 3px;">
									<span
										style="font-size: 15px; margin-right: 10px; font-weight: 500; color: #707070;">quie****</span><span
										style="margin-right: 10px"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px;"></span><span
										style="color: #b5b5b5; font-size: 11px; line-height: 10px; vertical-align: middle; font-weight: 500;">2020.05.18</span>
								</div>
								<div
									style="display: inline-block; width: 100%; margin-bottom: 10px;">
									<span
										style="display: inline-block; font-size: 13px; margin-right: 10px; color: #BDBDBD"><img
										src="https://s3.ap-northeast-2.amazonaws.com/umclassupload/app/review_umclass_200901.png"
										style="width: 20px; height: 20px;">[부산] 나만의 네온사인 원데이클래스</span>
								</div>
								<div
									style="display: inline-block; width: 100%; text-align: left">
									<span
										style="word-wrap: break-word; font-weight: 500; font-size: 12px; line-height: 15px; color: #707070">만드는내내
										즐거웠습니다. 감사합니다!!</span>
								</div>
							</div>
							<div
								style="width: 100%; border-bottom: 1px solid #E6E6E6; padding: 16px 4%;">
								<div
									style="display: inline-block; width: 100%; margin-bottom: 3px;">
									<span
										style="font-size: 15px; margin-right: 10px; font-weight: 500; color: #707070;">tlfq****</span><span
										style="margin-right: 10px"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px;"></span><span
										style="color: #b5b5b5; font-size: 11px; line-height: 10px; vertical-align: middle; font-weight: 500;">2020.05.14</span>
								</div>
								<div
									style="display: inline-block; width: 100%; margin-bottom: 10px;">
									<span
										style="display: inline-block; font-size: 13px; margin-right: 10px; color: #BDBDBD"><img
										src="https://s3.ap-northeast-2.amazonaws.com/umclassupload/app/review_umclass_200901.png"
										style="width: 20px; height: 20px;">[부산] 아크릴 무드등, 나만의 조명
										만들기 원데이 클래스</span>
								</div>
								<div
									style="display: inline-block; width: 100%; text-align: left">
									<span
										style="word-wrap: break-word; font-weight: 500; font-size: 12px; line-height: 15px; color: #707070">한땀
										한땀 그리느라 완전 집중하면서 수업들었네요.<br>완성작 보고 쪼꼼 걱정했는데 생각보다 어렵지 않았고
										재미있었어요.<br>밤에 방에 불끄면 무드등 덕분에 분위기 쩌네용 ㅋㅋㅋ
									</span>
								</div>
							</div>
							<div
								style="width: 100%; border-bottom: 1px solid #E6E6E6; padding: 16px 4%;">
								<div
									style="display: inline-block; width: 100%; margin-bottom: 3px;">
									<span
										style="font-size: 15px; margin-right: 10px; font-weight: 500; color: #707070;">juaa****</span><span
										style="margin-right: 10px"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_disable_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px;"></span><span
										style="color: #b5b5b5; font-size: 11px; line-height: 10px; vertical-align: middle; font-weight: 500;">2020.05.11</span>
								</div>
								<div
									style="display: inline-block; width: 100%; margin-bottom: 10px;">
									<span
										style="display: inline-block; font-size: 13px; margin-right: 10px; color: #BDBDBD"><img
										src="https://s3.ap-northeast-2.amazonaws.com/umclassupload/app/review_naver_200114.png"
										style="width: 20px; height: 20px;">[부산] 아크릴 무드등, 나만의 조명
										만들기 원데이 클래스</span>
								</div>
								<div
									style="display: inline-block; width: 100%; text-align: left">
									<span
										style="word-wrap: break-word; font-weight: 500; font-size: 12px; line-height: 15px; color: #707070">너무
										재미있었어요. 저는 도안이 좀 복잡했었는데 선생님이 잘 도와주셔서 편안하게 수업들었어요. <br>생각보다
										완성도 높게 마무리 되어서 만족스럽네요!
									</span>
								</div>
							</div>
							<div
								style="width: 100%; border-bottom: 1px solid #E6E6E6; padding: 16px 4%;">
								<div
									style="display: inline-block; width: 100%; margin-bottom: 3px;">
									<span
										style="font-size: 15px; margin-right: 10px; font-weight: 500; color: #707070;">line****</span><span
										style="margin-right: 10px"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px;"></span><span
										style="color: #b5b5b5; font-size: 11px; line-height: 10px; vertical-align: middle; font-weight: 500;">2020.04.27</span>
								</div>
								<div
									style="display: inline-block; width: 100%; margin-bottom: 10px;">
									<span
										style="display: inline-block; font-size: 13px; margin-right: 10px; color: #BDBDBD"><img
										src="https://s3.ap-northeast-2.amazonaws.com/umclassupload/app/review_naver_200114.png"
										style="width: 20px; height: 20px;">네온사인 원데이클래스</span>
								</div>
								<div
									style="display: inline-block; width: 100%; text-align: left">
									<span
										style="word-wrap: break-word; font-weight: 500; font-size: 12px; line-height: 15px; color: #707070">친절하게
										강습해주시고 만족한수업이었네요^^</span>
								</div>
							</div>
							<div
								style="width: 100%; border-bottom: 1px solid #E6E6E6; padding: 16px 4%;">
								<div
									style="display: inline-block; width: 100%; margin-bottom: 3px;">
									<span
										style="font-size: 15px; margin-right: 10px; font-weight: 500; color: #707070;">forq****</span><span
										style="margin-right: 10px"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px;"></span><span
										style="color: #b5b5b5; font-size: 11px; line-height: 10px; vertical-align: middle; font-weight: 500;">2020.04.25</span>
								</div>
								<div
									style="display: inline-block; width: 100%; margin-bottom: 10px;">
									<span
										style="display: inline-block; font-size: 13px; margin-right: 10px; color: #BDBDBD"><img
										src="https://s3.ap-northeast-2.amazonaws.com/umclassupload/app/review_umclass_200901.png"
										style="width: 20px; height: 20px;">[부산] 나만의 네온사인 원데이클래스</span>
								</div>
								<div
									style="display: inline-block; width: 100%; text-align: left">
									<span
										style="word-wrap: break-word; font-weight: 500; font-size: 12px; line-height: 15px; color: #707070">선생님이
										친절하게 알려주셨어요!!</span>
								</div>
							</div>
							<div
								style="width: 100%; border-bottom: 1px solid #E6E6E6; padding: 16px 4%;">
								<div
									style="display: inline-block; width: 100%; margin-bottom: 3px;">
									<span
										style="font-size: 15px; margin-right: 10px; font-weight: 500; color: #707070;">7595****</span><span
										style="margin-right: 10px"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px;"></span><span
										style="color: #b5b5b5; font-size: 11px; line-height: 10px; vertical-align: middle; font-weight: 500;">2020.04.23</span>
								</div>
								<div
									style="display: inline-block; width: 100%; margin-bottom: 10px;">
									<span
										style="display: inline-block; font-size: 13px; margin-right: 10px; color: #BDBDBD"><img
										src="https://s3.ap-northeast-2.amazonaws.com/umclassupload/app/review_naver_200114.png"
										style="width: 20px; height: 20px;">네온사인 원데이클래스</span>
								</div>
								<div class="review-img-area"
									style="display: inline-block; width: 100%;">
									<div
										style="color: #fff; background-image: url(https://s3.ap-northeast-2.amazonaws.com/umclassuploadboardimg/df3eaa79e11546bab91bdac90b993d64.jpg); background-size: cover; background-position: center center; background-repeat: no-repeat; border: 1px solid #F2F2F2; display: inline-block; width: 90px; margin-bottom: 15px; margin-right: 4%; height: 90px;">
										<div class="reviewImg"
											data-src="https://s3.ap-northeast-2.amazonaws.com/umclassuploadboardimg/df3eaa79e11546bab91bdac90b993d64.jpg"
											style="width: 100%; height: 100%;">
											<img
												src="https://s3.ap-northeast-2.amazonaws.com/umclassuploadboardimg/df3eaa79e11546bab91bdac90b993d64.jpg"
												style="display: none">
										</div>
									</div>
								</div>
								<div
									style="display: inline-block; width: 100%; text-align: left">
									<span
										style="word-wrap: break-word; font-weight: 500; font-size: 12px; line-height: 15px; color: #707070">주변에서
										이뿌다고 난리였어요 ㅎㅎ</span>
								</div>
							</div>
							<div
								style="width: 100%; border-bottom: 1px solid #E6E6E6; padding: 16px 4%;">
								<div
									style="display: inline-block; width: 100%; margin-bottom: 3px;">
									<span
										style="font-size: 15px; margin-right: 10px; font-weight: 500; color: #707070;">saho****</span><span
										style="margin-right: 10px"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px;"></span><span
										style="color: #b5b5b5; font-size: 11px; line-height: 10px; vertical-align: middle; font-weight: 500;">2020.04.14</span>
								</div>
								<div
									style="display: inline-block; width: 100%; margin-bottom: 10px;">
									<span
										style="display: inline-block; font-size: 13px; margin-right: 10px; color: #BDBDBD"><img
										src="https://s3.ap-northeast-2.amazonaws.com/umclassupload/app/review_umclass_200901.png"
										style="width: 20px; height: 20px;">[부산] 나만의 네온사인 원데이클래스</span>
								</div>
								<div
									style="display: inline-block; width: 100%; text-align: left">
									<span
										style="word-wrap: break-word; font-weight: 500; font-size: 12px; line-height: 15px; color: #707070">제가
										손이 느려서 시간 넘게 작업했는데 끝까지 봐주시고 작품도 마음에 들었습니다! 너무 좋은 시간이였습니다.</span>
								</div>
							</div>
							<div
								style="width: 100%; border-bottom: 1px solid #E6E6E6; padding: 16px 4%;">
								<div
									style="display: inline-block; width: 100%; margin-bottom: 3px;">
									<span
										style="font-size: 15px; margin-right: 10px; font-weight: 500; color: #707070;">kkie****</span><span
										style="margin-right: 10px"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px;"></span><span
										style="color: #b5b5b5; font-size: 11px; line-height: 10px; vertical-align: middle; font-weight: 500;">2020.04.08</span>
								</div>
								<div
									style="display: inline-block; width: 100%; margin-bottom: 10px;">
									<span
										style="display: inline-block; font-size: 13px; margin-right: 10px; color: #BDBDBD"><img
										src="https://s3.ap-northeast-2.amazonaws.com/umclassupload/app/review_umclass_200901.png"
										style="width: 20px; height: 20px;">[부산] 나만의 네온사인 원데이클래스</span>
								</div>
								<div
									style="display: inline-block; width: 100%; text-align: left">
									<span
										style="word-wrap: break-word; font-weight: 500; font-size: 12px; line-height: 15px; color: #707070">선생님도
										친절하시고 생각보다 만드는게 힘들었지만 끝나고 켜봤을때의 너무 뿌듯했어요! 정말 좋은시간이였습니다.</span>
								</div>
							</div>
							<div
								style="width: 100%; border-bottom: 1px solid #E6E6E6; padding: 16px 4%;">
								<div
									style="display: inline-block; width: 100%; margin-bottom: 3px;">
									<span
										style="font-size: 15px; margin-right: 10px; font-weight: 500; color: #707070;">duck****</span><span
										style="margin-right: 10px"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px;"></span><span
										style="color: #b5b5b5; font-size: 11px; line-height: 10px; vertical-align: middle; font-weight: 500;">2020.02.23</span>
								</div>
								<div
									style="display: inline-block; width: 100%; margin-bottom: 10px;">
									<span
										style="display: inline-block; font-size: 13px; margin-right: 10px; color: #BDBDBD"><img
										src="https://s3.ap-northeast-2.amazonaws.com/umclassupload/app/review_umclass_200901.png"
										style="width: 20px; height: 20px;">[부산] 나만의 네온사인 원데이클래스</span>
								</div>
								<div
									style="display: inline-block; width: 100%; text-align: left">
									<span
										style="word-wrap: break-word; font-weight: 500; font-size: 12px; line-height: 15px; color: #707070">재미있는
										시간이였습니다. 친절하고 좋았어요!! </span>
								</div>
							</div>
							<div
								style="width: 100%; border-bottom: 1px solid #E6E6E6; padding: 16px 4%;">
								<div
									style="display: inline-block; width: 100%; margin-bottom: 3px;">
									<span
										style="font-size: 15px; margin-right: 10px; font-weight: 500; color: #707070;">qide****</span><span
										style="margin-right: 10px"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px;"></span><span
										style="color: #b5b5b5; font-size: 11px; line-height: 10px; vertical-align: middle; font-weight: 500;">2020.02.23</span>
								</div>
								<div
									style="display: inline-block; width: 100%; margin-bottom: 10px;">
									<span
										style="display: inline-block; font-size: 13px; margin-right: 10px; color: #BDBDBD"><img
										src="https://s3.ap-northeast-2.amazonaws.com/umclassupload/app/review_umclass_200901.png"
										style="width: 20px; height: 20px;">[부산] 나만의 네온사인 원데이클래스</span>
								</div>
								<div
									style="display: inline-block; width: 100%; text-align: left">
									<span
										style="word-wrap: break-word; font-weight: 500; font-size: 12px; line-height: 15px; color: #707070">네온사인
										너무 예뻐요!! 저녁에 켤때마다 너무 뿌듯해요 ㅎㅎㅎ</span>
								</div>
							</div>
							<div
								style="width: 100%; border-bottom: 1px solid #E6E6E6; padding: 16px 4%;">
								<div
									style="display: inline-block; width: 100%; margin-bottom: 3px;">
									<span
										style="font-size: 15px; margin-right: 10px; font-weight: 500; color: #707070;">ma_w****</span><span
										style="margin-right: 10px"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px;"></span><span
										style="color: #b5b5b5; font-size: 11px; line-height: 10px; vertical-align: middle; font-weight: 500;">2020.02.13</span>
								</div>
								<div
									style="display: inline-block; width: 100%; margin-bottom: 10px;">
									<span
										style="display: inline-block; font-size: 13px; margin-right: 10px; color: #BDBDBD"><img
										src="https://s3.ap-northeast-2.amazonaws.com/umclassupload/app/review_umclass_200901.png"
										style="width: 20px; height: 20px;">[부산] 나만의 네온사인 원데이클래스</span>
								</div>
								<div
									style="display: inline-block; width: 100%; text-align: left">
									<span
										style="word-wrap: break-word; font-weight: 500; font-size: 12px; line-height: 15px; color: #707070">선생님이
										너무 친절하시고 재미났어요. 남자친구랑 좋은 추억이 되었습니다ㅎㅎ</span>
								</div>
							</div>
							<div
								style="width: 100%; border-bottom: 1px solid #E6E6E6; padding: 16px 4%;">
								<div
									style="display: inline-block; width: 100%; margin-bottom: 3px;">
									<span
										style="font-size: 15px; margin-right: 10px; font-weight: 500; color: #707070;">노콩</span><span
										style="margin-right: 10px"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px; margin-right: 3px;"><img
										src="/static/img/review_able_icon_200901.png"
										style="width: 15px; height: 15px; margin-bottom: 5px;"></span><span
										style="color: #b5b5b5; font-size: 11px; line-height: 10px; vertical-align: middle; font-weight: 500;">2019.12.18</span>
								</div>
								<div
									style="display: inline-block; width: 100%; margin-bottom: 10px;">
									<span
										style="display: inline-block; font-size: 13px; margin-right: 10px; color: #BDBDBD"><img
										src="https://s3.ap-northeast-2.amazonaws.com/umclassupload/app/review_umclass_200901.png"
										style="width: 20px; height: 20px;">51작업실</span>
								</div>
								<div class="review-img-area"
									style="display: inline-block; width: 100%;">
									<div
										style="color: #fff; background-image: url(https://s3.ap-northeast-2.amazonaws.com/umclassuploadboardimg/aec477f0ec6f4a95a47062c3ddef9b3b.jpg); background-size: cover; background-position: center center; background-repeat: no-repeat; border: 1px solid #F2F2F2; display: inline-block; width: 90px; margin-bottom: 15px; margin-right: 4%; height: 90px;">
										<div class="reviewImg"
											data-src="https://s3.ap-northeast-2.amazonaws.com/umclassuploadboardimg/aec477f0ec6f4a95a47062c3ddef9b3b.jpg"
											style="width: 100%; height: 100%;">
											<img
												src="https://s3.ap-northeast-2.amazonaws.com/umclassuploadboardimg/aec477f0ec6f4a95a47062c3ddef9b3b.jpg"
												style="display: none">
										</div>
									</div>
									<div
										style="color: #fff; background-image: url(https://s3.ap-northeast-2.amazonaws.com/umclassuploadboardimg/925a0524aff24ca480e3ad28480a5a58.jpg); background-size: cover; background-position: center center; background-repeat: no-repeat; border: 1px solid #F2F2F2; display: inline-block; width: 90px; margin-bottom: 15px; margin-right: 4%; height: 90px;">
										<div class="reviewImg"
											data-src="https://s3.ap-northeast-2.amazonaws.com/umclassuploadboardimg/925a0524aff24ca480e3ad28480a5a58.jpg"
											style="width: 100%; height: 100%;">
											<img
												src="https://s3.ap-northeast-2.amazonaws.com/umclassuploadboardimg/925a0524aff24ca480e3ad28480a5a58.jpg"
												style="display: none">
										</div>
									</div>
									<div
										style="color: #fff; background-image: url(https://s3.ap-northeast-2.amazonaws.com/umclassuploadboardimg/7d37d45f726c437d9af58bd444539488.jpg); background-size: cover; background-position: center center; background-repeat: no-repeat; border: 1px solid #F2F2F2; display: inline-block; width: 90px; margin-bottom: 15px; margin-right: 4%; height: 90px;">
										<div class="reviewImg"
											data-src="https://s3.ap-northeast-2.amazonaws.com/umclassuploadboardimg/7d37d45f726c437d9af58bd444539488.jpg"
											style="width: 100%; height: 100%;">
											<img
												src="https://s3.ap-northeast-2.amazonaws.com/umclassuploadboardimg/7d37d45f726c437d9af58bd444539488.jpg"
												style="display: none">
										</div>
									</div>
								</div>
								<div
									style="display: inline-block; width: 100%; text-align: left">
									<span
										style="word-wrap: break-word; font-weight: 500; font-size: 12px; line-height: 15px; color: #707070">2시간
										정도 수강했는데 시간이 어떻게 가는지 모르고 했어요!<br>기회가 되면 또 해보고 싶을정도로
										재미있었습니당♡<br>네온 클래스 들을까 고민하는 분들에게 추천드려요!
									</span>
								</div>
							</div>
						</div>
						<div class="contents-view"
							style="display: inline-block; width: 100%; margin-bottom: 65px;">
							<div class="day-class-rule" style="display: block; width: 100%;">
								<div
									style="display: inline-block; width: 100%; padding: 28px 4% 20px 4%; text-align: left">
									<span
										style="display: inline-block; background-color: #97CC98; width: 5px; height: 5px; border-radius: 100px; margin-right: 10px; margin-bottom: 2px;"></span><span
										style="font-size: 15px; color: #000; font-weight: 600;">원데이
										- 일정 협의 전 환불 규정</span>
								</div>
								<div
									style="display: inline-block; width: 100%; padding: 0px 4%; text-align: left;">
									<span
										style="font-size: 12px; vertical-align: middle; display: block; width: 100%; word-break: break-all; color: #707070; font-weight: 300;">결제
										후 배터클래스 영업일을 기준으로 합니다.<br>원데이 상시반, 원데이 지정반에 공통으로 적용됩니다.<br>
										<br>1) 전체환불이 되는경우<br>
										<div
											style="display: inline-block; width: 100%; margin-left: 5px;">
											결제 후 영업일 기준 10일 이내에, 일정 협의 전 취소 시 전체 환불 가능<br>결제 후 영업일
											기준 10일 이내에, 회원이 일정 협의를 요청하였으나 교육서비스 제공자 불응 시 전체 환불 가능<br>교육서비스
											제공자의 사정으로 수업을 진행하지 못하는 경우 전체 환불 가능<br>
										</div> <br> <br>2) 부분환불이 되는 경우<br>
										<div
											style="display: inline-block; width: 100%; margin-left: 5px;">
											일정 협의 전에는 부분 환불 불가<br>
										</div> <br> <br>3) 환불이 불가능한 경우<br>
										<div
											style="display: inline-block; width: 100%; margin-left: 5px;">
											결제 후 영업일 기준 10일 이내에 회원의 개인 사유로 일정 협의하지 못하고 10일을 초과한 경우 환불 불가능<br>
										</div>
									</span>
								</div>
								<div
									style="display: inline-block; width: 100%; padding: 28px 4% 20px 4%; text-align: left">
									<span
										style="display: inline-block; background-color: #97CC98; width: 5px; height: 5px; border-radius: 100px; margin-right: 10px; margin-bottom: 2px;"></span><span
										style="font-size: 15px; color: #000; font-weight: 600;">원데이
										- 일정 협의 후 환불 규정</span>
								</div>
								<div
									style="display: inline-block; width: 100%; padding: 0px 4% 28px 4%; text-align: left; border-bottom: 1px solid #E6E6E6;">
									<span
										style="font-size: 12px; vertical-align: middle; display: block; width: 100%; word-break: break-all; color: #707070; font-weight: 300;">일정
										협의 후 수강일을 기준으로 합니다.<br>원데이 상시반, 원데이 지정반에 공통으로 적용됩니다.<br>
										<br>1) 전체 환불이 되는 경우<br>
										<div
											style="display: inline-block; width: 100%; margin-left: 5px;">
											클래스 6일전 취소시, 결제 금액 전체 환불 가능<br>결제 후 1시간 이내에 취소시 전체 환불 가능<br>교육서비스
											제공자의 사정으로 지정 날짜에 수업을 진행하지 못하는 경우전체 환불 가능<br>
										</div> <br> <br>2) 부분 환불이 되는 경우<br>
										<div
											style="display: inline-block; width: 100%; margin-left: 5px;">
											클래스 5일전 취소시, 결제금액의 5% 배상 후 환불<br>클래스 4일전 취소시, 결제금액의 10%
											배상 후 환불<br>클래스 3일전 취소시, 결제금액의 20% 배상 후 환불<br>클래스
											2일전 취소시, 결제금액의 30% 배상 후 환불<br>단, 결제 후 1시간 이내에 취소시 전체 환불
											가능<br>
										</div> <br> <br>3) 환불이 불가능한 경우<br>
										<div
											style="display: inline-block; width: 100%; margin-left: 5px;">
											클래스 1일전 또는 당일 취소/불참시 환불불가능<br>클래스 1일전 구매 후 클래스 당일(00시
											00분 이후) 환불 불가능<br>단, 결제 후 1시간 이내에 취소시 전체 환불 가능<br>
										</div>
									</span>
								</div>
							</div>
						</div>
						<div class="academy-footer-0"
							style="z-index: 700; position: fixed; bottom: 0; width: 834px; background: #fff; border: 0; background-color: #fff; padding: 10px 4%; border-top: 1px solid #e7e7e7;">
							<div
								style="display: inline-block; width: 115px; margin-right: 4%; float: left; margin-top: 4px;">
								<div style="display: inline-block; float: left; width: 100%;">
									<span class="final-money"
										style="display: inline-block; font-size: 20px; color: #4B4B4B; font-weight: 700; line-height: 19px;"><%=vo.getcPrice()+"원"%></span>
								</div>
							</div>
							<div class="bottom_money_info_area"
								style="display: inline-block; width: 532.046px; float: left;">
								<span class="card-menu append-menu-0" value=""
									style="display: inline-block; width: 100%; background-color: #97CC98; border-radius: 10px; height: 50px; line-height: 50px; vertical-align: middle; border: 1px solid #97CC98; color: #fff; text-align: center; font-weight: 700; font-size: 18px;">신청하기</span>
							</div>
						</div>
						<input type="hidden" id="select-menu" value="first"><input
							type="hidden" id="class-money" value="60000">
					</div>
				</div>
			</div>
			<div class="pop-tag-footer"></div>
		</div>
	</div>

</body>
</html>
</div>
