create table MVCBOARD(
	SEQ INT auto_increment primary key,
	WRITER VARCHAR(100) not null,
	TITLE VARCHAR(1000) not null,
	CONTENT VARCHAR(2000) not null,
	REGDATE DATE not NULL
);

INSERT into MVCBOARD values(null,'관리자','TESING','TEST1234',NOW());

SELECT *FROM MVCBOARD ;