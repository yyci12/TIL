CREATE table MYBOARD(
	MYNO INT auto_increment primary key,
	MYNAME VARCHAR(100) not null,
	MYTILTE VARCHAR(2000) not null,
	MYCONTENT VARCHAR(4000) not null,
	MYDATE DATE not null
);

SELECT * FROM MYBOARD;

DROP MYBOARD;

INSERT into MYBOARD VALUES(null,'관리자','게시판 테스트','테스트중입니다. 123456789ABCD',NOW());