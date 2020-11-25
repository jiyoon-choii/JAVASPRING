<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr><th>제목</th><td><input type="text" name="title"></td></tr>
<tr><th>내용</th><td><textarea rows="5" cols="30" name="content"></textarea></td></tr>
<tr><th>작성자</th><td><input type="text" name="writer"></td></tr>
<tr><th>날짜</th><td>${board.regdate }</td></tr>
<tr><td colspan="2" align="center">
	<button id="register">등록</button>
	<button id="reset">취소</button>
	<button id="list">목록보기</button>
</td></tr>
</table>
</body>
</html>