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
<tr><th>번호</th><td>${board.bno }</td></tr>
<tr><th>제목</th><td>${board.title }</td></tr>
<tr><th>내용</th><td>${board.content }</td></tr>
<tr><th>작성자</th><td>${board.writer }</td></tr>
<tr><th>날짜</th><td>${board.regdate }</td></tr>
<tr><td colspan="2" align="center">
	<button id="modify">수정</button>
	<button id="remove">삭제</button>
	<button id="list">목록보기</button>
</td></tr>
</table>
</body>
</html>