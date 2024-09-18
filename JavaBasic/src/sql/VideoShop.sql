
-- 고객테이블
CREATE TABLE CUSTOMER 
(
	CUSTNAME		VARCHAR2(30)		-- 고객명
	, CUSTTEL		VARCHAR2(30)		-- 고객전화번호
	, CUSTTELAID	VARCHAR2(30)		-- 추가전화번호
	, CUSTADDR		VARCHAR2(200)		-- 고객주소
	, CUSTEMAIL		VARCHAR2(30)		-- 고객이메일
	, CONSTRAINT  pk_customer_tel PRIMARY KEY  ( CUSTTEL )
);


-- 영화테이블
CREATE TABLE MOVIE
(
	MOVIENO			NUMBER
	,	MOVIETITLE		VARCHAR2(100)
	, 	MOVIEGENRE		VARCHAR2(50)
	,	MOVIEACTOR		VARCHAR2(100)
	,	MOVIEDIRECTOR	VARCHAR2(50)
	, 	MOVIEDETAIL		VARCHAR2(1000)
	,   CONSTRAINT  pk_movie_movieno PRIMARY KEY  ( MOVIENO )
);
CREATE SEQUENCE seq_movie_moiveno;

-- 비디오번호테이블
CREATE TABLE VIDEO
(
	VIDEONO		NUMBER
	, MOVIENO	NUMBER
	--, RENTFEE	NUMBER
	,  CONSTRAINT  pk_video_videono PRIMARY KEY  ( VIDEONO )
	,  CONSTRAINT  fk_video_moiveno  FOREIGN KEY ( MOVIENO )	REFERENCES 	MOVIE 	( MOVIENO )
);
CREATE SEQUENCE seq_video_videono;


-- 대여테이블
CREATE TABLE VIDEORENT
(
	RENTNO			NUMBER
	, VIDEONO		NUMBER
	, CUSTTEL		VARCHAR2(30)
	, RENTDATE		DATE
	, RETURNDATE	DATE
	--, RETURN_EXPECTED_DATE  DATE	-- 반납예정일
	--, ISRETURNED    CHAR(1)		-- 반납여부
	, CONSTRAINT  pk_videorent_rentno PRIMARY KEY  ( RENTNO )
	, CONSTRAINT  fk_videorent_videono  FOREIGN KEY ( VIDEONO )	REFERENCES 	VIDEO( VIDEONO )
	, CONSTRAINT  fk_videorent_custtel  FOREIGN KEY ( CUSTTEL )	REFERENCES 	CUSTOMER( CUSTTEL )
);
CREATE SEQUENCE seq_videorent_rentno;


-- [ 시퀀스 확인 ]
--SELECT SEQ_MOVIE_MOIVENO.nextval FROM dual;
--SELECT seq_video_videono.nextval FROM dual;
--SELECT seq_videorent_rentno.nextval FROM dual;


